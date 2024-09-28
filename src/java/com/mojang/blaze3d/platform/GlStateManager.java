package com.mojang.blaze3d.platform;

import com.mojang.blaze3d.systems.RenderSystem;
import mapped.*;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.shader.FramebufferConstants;
import net.minecraft.client.util.LWJGLMemoryUntracker;
import net.optifine.Config;
import net.optifine.render.GlAlphaState;
import net.optifine.render.GlBlendState;
import net.optifine.render.GlCullState;
import net.optifine.shaders.Shaders;
import net.optifine.util.LockCounter;
import org.lwjgl.opengl.*;
import org.lwjgl.system.MemoryUtil;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class GlStateManager {
   private static final FloatBuffer MATRIX_BUFFER = GLX.make(
      MemoryUtil.memAllocFloat(16), var0 -> LWJGLMemoryUntracker.untrack(MemoryUtil.memAddress(var0))
   );
   private static final AlphaState ALPHA_TEST = new AlphaState();
   private static final BooleanState LIGHTING = new BooleanState(2896);
   private static final BooleanState[] LIGHT_ENABLE = IntStream.range(0, 8)
      .mapToObj(var0 -> new BooleanState(16384 + var0))
      .toArray(BooleanState[]::new);
   private static final ColorMaterialState COLOR_MATERIAL = new ColorMaterialState();
   private static final BlendState BLEND = new BlendState();
   private static final DepthState DEPTH = new DepthState();
   private static final FogState FOG = new FogState();
   private static final CullState CULL = new CullState();
   private static final PolygonOffsetState POLY_OFFSET = new PolygonOffsetState();
   private static final ColorLogicState COLOR_LOGIC = new ColorLogicState();
   private static final TexGenState TEX_GEN = new TexGenState();
   private static final StencilState STENCIL = new StencilState();
   private static final ScissorState field_244591_n = new ScissorState();
   private static final FloatBuffer FLOAT_4_BUFFER = GLAllocation.createDirectFloatBuffer(4);
   private static int activeTexture;
   private static final TextureState[] TEXTURES = IntStream.range(0, 32).mapToObj(var0 -> new TextureState()).toArray(TextureState[]::new);
   private static int shadeModel = 7425;
   private static final BooleanState RESCALE_NORMAL = new BooleanState(32826);
   private static final GlStateManager.ColorMask COLOR_MASK = new ColorMask();
   private static final Color COLOR = new Color();
   private static FramebufferExtension fboMode;
   private static SupportType supportType;
   private static LockCounter alphaLock = new LockCounter();
   private static GlAlphaState alphaLockState = new GlAlphaState();
   private static LockCounter blendLock = new LockCounter();
   private static GlBlendState blendLockState = new GlBlendState();
   private static LockCounter cullLock = new LockCounter();
   private static GlCullState cullLockState = new GlCullState();
   private static boolean clientStateLocked = false;
   private static int clientActiveTexture = 0;
   private static boolean creatingDisplayList = false;
   public static float lastBrightnessX = 0.0F;
   public static float lastBrightnessY = 0.0F;
   public static boolean openGL31;
   public static boolean vboRegions;
   public static int GL_COPY_READ_BUFFER;
   public static int GL_COPY_WRITE_BUFFER;
   public static int GL_ARRAY_BUFFER;
   public static int GL_STATIC_DRAW;
   private static boolean fogAllowed = true;
   public static final int GL_QUADS = 7;
   public static final int GL_TRIANGLES = 4;
   public static final int GL_TEXTURE0 = 33984;
   public static final int GL_TEXTURE1 = 33985;
   public static final int GL_TEXTURE2 = 33986;

   @Deprecated
   public static void pushLightingAttributes() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glPushAttrib(8256);
   }

   @Deprecated
   public static void pushTextureAttributes() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glPushAttrib(270336);
   }

   @Deprecated
   public static void popAttributes() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glPopAttrib();
   }

   @Deprecated
   public static void disableAlphaTest() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (!alphaLock.isLocked()) {
         ALPHA_TEST.test.disable();
      } else {
         alphaLockState.setDisabled();
      }
   }

   @Deprecated
   public static void enableAlphaTest() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (!alphaLock.isLocked()) {
         ALPHA_TEST.test.enable();
      } else {
         alphaLockState.setEnabled();
      }
   }

   @Deprecated
   public static void method23697(int var0, float var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (!alphaLock.isLocked()) {
         if (var0 != ALPHA_TEST.field39454 || var1 != ALPHA_TEST.field39455) {
            ALPHA_TEST.field39454 = var0;
            ALPHA_TEST.field39455 = var1;
            GL11.glAlphaFunc(var0, var1);
         }
      } else {
         alphaLockState.method25209(var0, var1);
      }
   }

   @Deprecated
   public static void method23698() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      LIGHTING.enable();
   }

   @Deprecated
   public static void disableLighting() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      LIGHTING.disable();
   }

   @Deprecated
   public static void method23700(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      LIGHT_ENABLE[var0].enable();
   }

   @Deprecated
   public static void enableColorMaterial() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      COLOR_MATERIAL.field41143.enable();
   }

   @Deprecated
   public static void method23702() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      COLOR_MATERIAL.field41143.disable();
   }

   @Deprecated
   public static void colorMaterial(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != COLOR_MATERIAL.face || var1 != COLOR_MATERIAL.mode) {
         COLOR_MATERIAL.face = var0;
         COLOR_MATERIAL.mode = var1;
         GL11.glColorMaterial(var0, var1);
      }
   }

   @Deprecated
   public static void light(int var0, int var1, FloatBuffer var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glLightfv(var0, var1, var2);
   }

   @Deprecated
   public static void lightModel(int var0, FloatBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glLightModelfv(var0, var1);
   }

   @Deprecated
   public static void normal3f(float var0, float var1, float var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glNormal3f(var0, var1, var2);
   }

   public static void func_244593_j() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      field_244591_n.field40056.disable();
   }

   public static void func_244594_k() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      field_244591_n.field40056.enable();
   }

   public static void func_244592_a(int var0, int var1, int var2, int var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL20.glScissor(var0, var1, var2, var3);
   }

   public static void disableDepthTest() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      DEPTH.field32405.disable();
   }

   public static void enableDepthTest() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      DEPTH.field32405.enable();
   }

   public static void depthFunc(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (var0 != DEPTH.field32407) {
         DEPTH.field32407 = var0;
         GL11.glDepthFunc(var0);
      }
   }

   public static void depthMask(boolean var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != DEPTH.field32406) {
         DEPTH.field32406 = var0;
         GL11.glDepthMask(var0);
      }
   }

   public static void disableBlend() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (!blendLock.isLocked()) {
         BLEND.field40550.disable();
      } else {
         blendLockState.method27777();
      }
   }

   public static void enableBlend() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (!blendLock.isLocked()) {
         BLEND.field40550.enable();
      } else {
         blendLockState.method27776();
      }
   }

   public static void blendFunc(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (!blendLock.isLocked()) {
         if (var0 != BLEND.field40551 || var1 != BLEND.field40552 || var0 != BLEND.field40553 || var1 != BLEND.field40554) {
            BLEND.field40551 = var0;
            BLEND.field40552 = var1;
            BLEND.field40553 = var0;
            BLEND.field40554 = var1;
            if (Config.isShaders()) {
               Shaders.field40772.method12249(var0, var1, var0, var1);
            }

            GL11.glBlendFunc(var0, var1);
         }
      } else {
         blendLockState.method27778(var0, var1);
      }
   }

   public static void blendFuncSeparate(int var0, int var1, int var2, int var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (!blendLock.isLocked()) {
         if (var0 != BLEND.field40551 || var1 != BLEND.field40552 || var2 != BLEND.field40553 || var3 != BLEND.field40554) {
            BLEND.field40551 = var0;
            BLEND.field40552 = var1;
            BLEND.field40553 = var2;
            BLEND.field40554 = var3;
            if (Config.isShaders()) {
               Shaders.field40772.method12249(var0, var1, var2, var3);
            }

            method23762(var0, var1, var2, var3);
         }
      } else {
         blendLockState.method27779(var0, var1, var2, var3);
      }
   }

   public static void method23718(float var0, float var1, float var2, float var3) {
      GL14.glBlendColor(var0, var1, var2, var3);
   }

   public static void method23719(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL14.glBlendEquation(var0);
   }

   public static String method23720(GLCapabilities var0) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      Config.method26780();
      openGL31 = var0.OpenGL31;
      if (!openGL31) {
         GL_COPY_READ_BUFFER = 36662;
         GL_COPY_WRITE_BUFFER = 36663;
      } else {
         GL_COPY_READ_BUFFER = 36662;
         GL_COPY_WRITE_BUFFER = 36663;
      }

      if (!var0.OpenGL15) {
         GL_ARRAY_BUFFER = 34962;
         GL_STATIC_DRAW = 35044;
      } else {
         GL_ARRAY_BUFFER = 34962;
         GL_STATIC_DRAW = 35044;
      }

      boolean var3 = openGL31 || var0.GL_ARB_copy_buffer;
      boolean var4 = var0.OpenGL14;
      vboRegions = var3 && var4;
      if (!vboRegions) {
         ArrayList var5 = new ArrayList();
         if (!var3) {
            var5.add("OpenGL 1.3, ARB_copy_buffer");
         }

         if (!var4) {
            var5.add("OpenGL 1.4");
         }

         String var6 = "VboRegions not supported, missing: " + Config.method26852(var5);
         Config.method26810(var6);
         var5.add(var6);
      }

      if (!var0.OpenGL30) {
         if (!var0.GL_EXT_framebuffer_blit) {
            supportType = SupportType.field15980;
         } else {
            supportType = SupportType.field15979;
         }
      } else {
         supportType = SupportType.field15978;
      }

      if (!var0.OpenGL30) {
         if (!var0.GL_ARB_framebuffer_object) {
            if (!var0.GL_EXT_framebuffer_object) {
               throw new IllegalStateException("Could not initialize framebuffer support.");
            } else {
               fboMode = FramebufferExtension.field13462;
               FramebufferConstants.GL_FRAMEBUFFER = 36160;
               FramebufferConstants.GL_RENDERBUFFER = 36161;
               FramebufferConstants.GL_COLOR_ATTACHMENT0 = 36064;
               FramebufferConstants.GL_DEPTH_ATTACHMENT = 36096;
               FramebufferConstants.GL_FRAMEBUFFER_COMPLETE = 36053;
               FramebufferConstants.GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 36055;
               FramebufferConstants.GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 36054;
               FramebufferConstants.GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER = 36059;
               FramebufferConstants.GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER = 36060;
               return "EXT_framebuffer_object extension";
            }
         } else {
            fboMode = FramebufferExtension.field13461;
            FramebufferConstants.GL_FRAMEBUFFER = 36160;
            FramebufferConstants.GL_RENDERBUFFER = 36161;
            FramebufferConstants.GL_COLOR_ATTACHMENT0 = 36064;
            FramebufferConstants.GL_DEPTH_ATTACHMENT = 36096;
            FramebufferConstants.GL_FRAMEBUFFER_COMPLETE = 36053;
            FramebufferConstants.GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 36055;
            FramebufferConstants.GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 36054;
            FramebufferConstants.GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER = 36059;
            FramebufferConstants.GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER = 36060;
            return "ARB_framebuffer_object extension";
         }
      } else {
         fboMode = FramebufferExtension.field13460;
         FramebufferConstants.GL_FRAMEBUFFER = 36160;
         FramebufferConstants.GL_RENDERBUFFER = 36161;
         FramebufferConstants.GL_COLOR_ATTACHMENT0 = 36064;
         FramebufferConstants.GL_DEPTH_ATTACHMENT = 36096;
         FramebufferConstants.GL_FRAMEBUFFER_COMPLETE = 36053;
         FramebufferConstants.GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 36054;
         FramebufferConstants.GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 36055;
         FramebufferConstants.GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER = 36059;
         FramebufferConstants.GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER = 36060;
         return "OpenGL 3.0";
      }
   }

   public static int method23721(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL20.glGetProgrami(var0, var1);
   }

   public static void method23722(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glAttachShader(var0, var1);
   }

   public static void method23723(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glDeleteShader(var0);
   }

   public static int method23724(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL20.glCreateShader(var0);
   }

   public static void method23725(int var0, CharSequence var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glShaderSource(var0, var1);
   }

   public static void method23726(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glCompileShader(var0);
   }

   public static int method23727(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL20.glGetShaderi(var0, var1);
   }

   public static void method23728(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUseProgram(var0);
   }

   public static int method23729() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL20.glCreateProgram();
   }

   public static void method23730(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glDeleteProgram(var0);
   }

   public static void method23731(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glLinkProgram(var0);
   }

   public static int method23732(int var0, CharSequence var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL20.glGetUniformLocation(var0, var1);
   }

   public static void method23733(int var0, IntBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform1iv(var0, var1);
   }

   public static void method23734(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform1i(var0, var1);
   }

   public static void method23735(int var0, FloatBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform1fv(var0, var1);
   }

   public static void method23736(int var0, IntBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform2iv(var0, var1);
   }

   public static void method23737(int var0, FloatBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform2fv(var0, var1);
   }

   public static void method23738(int var0, IntBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform3iv(var0, var1);
   }

   public static void method23739(int var0, FloatBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform3fv(var0, var1);
   }

   public static void method23740(int var0, IntBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform4iv(var0, var1);
   }

   public static void method23741(int var0, FloatBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniform4fv(var0, var1);
   }

   public static void method23742(int var0, boolean var1, FloatBuffer var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniformMatrix2fv(var0, var1, var2);
   }

   public static void method23743(int var0, boolean var1, FloatBuffer var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniformMatrix3fv(var0, var1, var2);
   }

   public static void method23744(int var0, boolean var1, FloatBuffer var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glUniformMatrix4fv(var0, var1, var2);
   }

   public static int method23745(int var0, CharSequence var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL20.glGetAttribLocation(var0, var1);
   }

   public static int method23746() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      return GL15.glGenBuffers();
   }

   public static void method23747(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL15.glBindBuffer(var0, var1);
   }

   public static void method23748(int var0, ByteBuffer var1, int var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL15.glBufferData(var0, var1, var2);
   }

   public static void method23749(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL15.glDeleteBuffers(var0);
   }

   public static void copySubImage(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL20.glCopyTexSubImage2D(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   public static void bindFramebuffer(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      switch (Class9579.field44781[fboMode.ordinal()]) {
         case 1:
            GL30.glBindFramebuffer(var0, var1);
            break;
         case 2:
            ARBFramebufferObject.glBindFramebuffer(var0, var1);
            break;
         case 3:
            EXTFramebufferObject.glBindFramebufferEXT(var0, var1);
      }
   }

   public static int getFrameBufferAttachmentParam() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      switch (Class9579.field44781[fboMode.ordinal()]) {
         case 1:
            if (GL30.glGetFramebufferAttachmentParameteri(36160, 36096, 36048) == 5890) {
               return GL30.glGetFramebufferAttachmentParameteri(36160, 36096, 36049);
            }
            break;
         case 2:
            if (ARBFramebufferObject.glGetFramebufferAttachmentParameteri(36160, 36096, 36048) == 5890) {
               return ARBFramebufferObject.glGetFramebufferAttachmentParameteri(36160, 36096, 36049);
            }
            break;
         case 3:
            if (EXTFramebufferObject.glGetFramebufferAttachmentParameteriEXT(36160, 36096, 36048) == 5890) {
               return EXTFramebufferObject.glGetFramebufferAttachmentParameteriEXT(36160, 36096, 36049);
            }
      }

      return 0;
   }

   public static void blitFramebuffer(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      switch (Class9579.field44782[supportType.ordinal()]) {
         case 1:
            GL30.glBlitFramebuffer(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
            break;
         case 2:
            EXTFramebufferBlit.glBlitFramebufferEXT(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
         case 3:
      }
   }

   public static void deleteFramebuffers(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      switch (Class9579.field44781[fboMode.ordinal()]) {
         case 1:
            GL30.glDeleteFramebuffers(var0);
            break;
         case 2:
            ARBFramebufferObject.glDeleteFramebuffers(var0);
            break;
         case 3:
            EXTFramebufferObject.glDeleteFramebuffersEXT(var0);
      }
   }

   public static int method23755() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      switch (Class9579.field44781[fboMode.ordinal()]) {
         case 1:
            return GL30.glGenFramebuffers();
         case 2:
            return ARBFramebufferObject.glGenFramebuffers();
         case 3:
            return EXTFramebufferObject.glGenFramebuffersEXT();
         default:
            return -1;
      }
   }

   public static int setFramebufferFilter(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      switch (Class9579.field44781[fboMode.ordinal()]) {
         case 1:
            return GL30.glCheckFramebufferStatus(var0);
         case 2:
            return ARBFramebufferObject.glCheckFramebufferStatus(var0);
         case 3:
            return EXTFramebufferObject.glCheckFramebufferStatusEXT(var0);
         default:
            return -1;
      }
   }

   public static void framebufferTexture2D(int var0, int var1, int var2, int var3, int var4) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      switch (Class9579.field44781[fboMode.ordinal()]) {
         case 1:
            GL30.glFramebufferTexture2D(var0, var1, var2, var3, var4);
            break;
         case 2:
            ARBFramebufferObject.glFramebufferTexture2D(var0, var1, var2, var3, var4);
            break;
         case 3:
            EXTFramebufferObject.glFramebufferTexture2DEXT(var0, var1, var2, var3, var4);
      }
   }

   @Deprecated
   public static int getActiveTextureId() {
      return TEXTURES[activeTexture].field40430;
   }

   public static void method23759(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL13.glActiveTexture(var0);
   }

   @Deprecated
   public static void method23760(int var0) {
      if (var0 != clientActiveTexture) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThread);
         GL13.glClientActiveTexture(var0);
         clientActiveTexture = var0;
      }
   }

   @Deprecated
   public static void method23761(int var0, float var1, float var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL13.glMultiTexCoord2f(var0, var1, var2);
      if (var0 == 33986) {
         lastBrightnessX = var1;
         lastBrightnessY = var2;
      }
   }

   public static void method23762(int var0, int var1, int var2, int var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL14.glBlendFuncSeparate(var0, var1, var2, var3);
   }

   public static String method23763(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL20.glGetShaderInfoLog(var0, var1);
   }

   public static String method23764(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL20.glGetProgramInfoLog(var0, var1);
   }

   public static void method23765() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      method23806(8960, 8704, 34160);
      method23769(7681, 34168);
   }

   public static void method23766() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      method23806(8960, 8704, 8448);
      method23770(8448, 5890, 34168, 34166);
   }

   public static void method23767(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      method23803(33985);
      enableTexture();
      matrixMode(5890);
      loadIdentity();
      float var4 = 1.0F / (float)(var1 - 1);
      method23837(var4, var4, var4);
      matrixMode(5888);
      bindTexture(var0);
      texParameter(3553, 10241, 9728);
      texParameter(3553, 10240, 9728);
      texParameter(3553, 10242, 10496);
      texParameter(3553, 10243, 10496);
      method23806(8960, 8704, 34160);
      method23770(34165, 34168, 5890, 5890);
      method23771(7681, 34168);
      method23803(33984);
   }

   public static void method23768() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      method23803(33985);
      method23805();
      method23803(33984);
   }

   private static void method23769(int var0, int var1) {
      method23806(8960, 34161, var0);
      method23806(8960, 34176, var1);
      method23806(8960, 34192, 768);
   }

   private static void method23770(int var0, int var1, int var2, int var3) {
      method23806(8960, 34161, var0);
      method23806(8960, 34176, var1);
      method23806(8960, 34192, 768);
      method23806(8960, 34177, var2);
      method23806(8960, 34193, 768);
      method23806(8960, 34178, var3);
      method23806(8960, 34194, 770);
   }

   private static void method23771(int var0, int var1) {
      method23806(8960, 34162, var0);
      method23806(8960, 34184, var1);
      method23806(8960, 34200, 770);
   }

   public static void method23772(Vector3f var0, Vector3f var1, Matrix4f var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      method23832();
      loadIdentity();
      method23700(0);
      method23700(1);
      Class7755 var5 = new Class7755(var0);
      var5.method25709(var2);
      light(16384, 4611, getBuffer(var5.method25701(), var5.method25702(), var5.method25703(), 0.0F));
      float var6 = 0.6F;
      light(16384, 4609, getBuffer(0.6F, 0.6F, 0.6F, 1.0F));
      light(16384, 4608, getBuffer(0.0F, 0.0F, 0.0F, 1.0F));
      light(16384, 4610, getBuffer(0.0F, 0.0F, 0.0F, 1.0F));
      Class7755 var7 = new Class7755(var1);
      var7.method25709(var2);
      light(16385, 4611, getBuffer(var7.method25701(), var7.method25702(), var7.method25703(), 0.0F));
      light(16385, 4609, getBuffer(0.6F, 0.6F, 0.6F, 1.0F));
      light(16385, 4608, getBuffer(0.0F, 0.0F, 0.0F, 1.0F));
      light(16385, 4610, getBuffer(0.0F, 0.0F, 0.0F, 1.0F));
      shadeModel(7424);
      float var8 = 0.4F;
      lightModel(2899, getBuffer(0.4F, 0.4F, 0.4F, 1.0F));
      method23833();
   }

   public static void method23773(Vector3f var0, Vector3f var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      Matrix4f var4 = new Matrix4f();
      var4.method35503();
      var4.method35508(Matrix4f.method35515(1.0F, -1.0F, 1.0F));
      var4.method35509(Vector3f.YP.rotationDegrees(-22.5F));
      var4.method35509(Vector3f.XP.rotationDegrees(135.0F));
      method23772(var0, var1, var4);
   }

   public static void method23774(Vector3f var0, Vector3f var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      Matrix4f var4 = new Matrix4f();
      var4.method35503();
      var4.method35509(Vector3f.YP.rotationDegrees(62.0F));
      var4.method35509(Vector3f.XP.rotationDegrees(185.5F));
      var4.method35508(Matrix4f.method35515(1.0F, -1.0F, 1.0F));
      var4.method35509(Vector3f.YP.rotationDegrees(-22.5F));
      var4.method35509(Vector3f.XP.rotationDegrees(135.0F));
      method23772(var0, var1, var4);
   }

   private static FloatBuffer getBuffer(float var0, float var1, float var2, float var3) {
      ((Buffer) FLOAT_4_BUFFER).clear();
      FLOAT_4_BUFFER.put(var0).put(var1).put(var2).put(var3);
      ((Buffer) FLOAT_4_BUFFER).flip();
      return FLOAT_4_BUFFER;
   }

   public static void setupEndPortalTexGen() {
      texGenMode(TexGen.S, 9216);
      texGenMode(TexGen.T, 9216);
      texGenMode(TexGen.R, 9216);
      texGenParam(TexGen.S, 9474, getBuffer(1.0F, 0.0F, 0.0F, 0.0F));
      texGenParam(TexGen.T, 9474, getBuffer(0.0F, 1.0F, 0.0F, 0.0F));
      texGenParam(TexGen.R, 9474, getBuffer(0.0F, 0.0F, 1.0F, 0.0F));
      enableTexGen(TexGen.S);
      enableTexGen(TexGen.T);
      enableTexGen(TexGen.R);
   }

   public static void clearTexGen() {
      disableTexGen(TexGen.S);
      disableTexGen(TexGen.T);
      disableTexGen(TexGen.R);
   }

   public static void mulTextureByProjModelView() {
      getMatrix(2983, MATRIX_BUFFER);
      multMatrix(MATRIX_BUFFER);
      getMatrix(2982, MATRIX_BUFFER);
      multMatrix(MATRIX_BUFFER);
   }

   @Deprecated
   public static void method23779() {
      if (fogAllowed) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThread);
         FOG.field44792.enable();
      }
   }

   @Deprecated
   public static void method23780() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      FOG.field44792.disable();
   }

   @Deprecated
   public static void method23781(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != FOG.field44793) {
         FOG.field44793 = var0;
         method23786(2917, var0);
         if (Config.isShaders()) {
            Shaders.method33046(var0);
         }
      }
   }

   @Deprecated
   public static void method23782(float var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 < 0.0F) {
         var0 = 0.0F;
      }

      if (var0 != FOG.field44794) {
         FOG.field44794 = var0;
         GL11.glFogf(2914, var0);
         if (Config.isShaders()) {
            Shaders.method33124(var0);
         }
      }
   }

   @Deprecated
   public static void method23783(float var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != FOG.field44795) {
         FOG.field44795 = var0;
         GL11.glFogf(2915, var0);
      }
   }

   @Deprecated
   public static void method23784(float var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != FOG.field44796) {
         FOG.field44796 = var0;
         GL11.glFogf(2916, var0);
      }
   }

   @Deprecated
   public static void method23785(int var0, float[] var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glFogfv(var0, var1);
   }

   @Deprecated
   public static void method23786(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glFogi(var0, var1);
   }

   public static void method23787() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (!cullLock.isLocked()) {
         CULL.field26226.enable();
      } else {
         cullLockState.method38748();
      }
   }

   public static void method23788() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (!cullLock.isLocked()) {
         CULL.field26226.disable();
      } else {
         cullLockState.method38749();
      }
   }

   public static void method23789(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glPolygonMode(var0, var1);
   }

   public static void method23790() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      POLY_OFFSET.field30682.enable();
   }

   public static void method23791() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      POLY_OFFSET.field30682.disable();
   }

   public static void method23792() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      POLY_OFFSET.field30683.enable();
   }

   public static void method23793() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      POLY_OFFSET.field30683.disable();
   }

   public static void method23794(float var0, float var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != POLY_OFFSET.field30684 || var1 != POLY_OFFSET.field30685) {
         POLY_OFFSET.field30684 = var0;
         POLY_OFFSET.field30685 = var1;
         GL11.glPolygonOffset(var0, var1);
      }
   }

   public static void method23795() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      COLOR_LOGIC.field33643.enable();
   }

   public static void method23796() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      COLOR_LOGIC.field33643.disable();
   }

   public static void method23797(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != COLOR_LOGIC.field33644) {
         COLOR_LOGIC.field33644 = var0;
         GL11.glLogicOp(var0);
      }
   }

   @Deprecated
   public static void enableTexGen(TexGen var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      method23802(var0).field45814.enable();
   }

   @Deprecated
   public static void disableTexGen(TexGen var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      method23802(var0).field45814.disable();
   }

   @Deprecated
   public static void texGenMode(TexGen var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      Class9796 var4 = method23802(var0);
      if (var1 != var4.field45816) {
         var4.field45816 = var1;
         GL11.glTexGeni(var4.field45815, 9472, var1);
      }
   }

   @Deprecated
   public static void texGenParam(TexGen var0, int var1, FloatBuffer var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glTexGenfv(method23802(var0).field45815, var1, var2);
   }

   @Deprecated
   private static Class9796 method23802(TexGen var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      switch (Class9579.field44783[var0.ordinal()]) {
         case 1:
            return TEX_GEN.field21851;
         case 2:
            return TEX_GEN.field21852;
         case 3:
            return TEX_GEN.field21853;
         case 4:
            return TEX_GEN.field21854;
         default:
            return TEX_GEN.field21851;
      }
   }

   public static void method23803(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (activeTexture != var0 - 33984) {
         activeTexture = var0 - 33984;
         method23759(var0);
      }
   }

   public static void enableTexture() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      TEXTURES[activeTexture].field40429.enable();
   }

   public static void method23805() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      TEXTURES[activeTexture].field40429.disable();
   }

   @Deprecated
   public static void method23806(int var0, int var1, int var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glTexEnvi(var0, var1, var2);
   }

   public static void method23807(int var0, int var1, float var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glTexParameterf(var0, var1, var2);
   }

   public static void texParameter(int var0, int var1, int var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glTexParameteri(var0, var1, var2);
   }

   public static int method23809(int var0, int var1, int var2) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      return GL11.glGetTexLevelParameteri(var0, var1, var2);
   }

   public static int method23810() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      return GL11.glGenTextures();
   }

   public static void method23811(int[] var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glGenTextures(var0);
   }

   public static void method23812(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (var0 != 0) {
         GL11.glDeleteTextures(var0);

         for (TextureState var6 : TEXTURES) {
            if (var6.field40430 == var0) {
               var6.field40430 = 0;
            }
         }
      }
   }

   public static void method23813(int[] var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);

      for (TextureState var6 : TEXTURES) {
         for (int var10 : var0) {
            if (var6.field40430 == var10) {
               var6.field40430 = -1;
            }
         }
      }

      GL11.glDeleteTextures(var0);
   }

   public static void bindTexture(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (var0 != TEXTURES[activeTexture].field40430) {
         TEXTURES[activeTexture].field40430 = var0;
         GL11.glBindTexture(3553, var0);
         if (SmartAnimations.isActive()) {
            SmartAnimations.textureRendered(var0);
         }
      }
   }

   public static void texImage2D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, IntBuffer var8) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glTexImage2D(var0, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public static void method23816(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glTexSubImage2D(var0, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public static void method23817(int var0, int var1, int var2, int var3, long var4) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glGetTexImage(var0, var1, var2, var3, var4);
   }

   @Deprecated
   public static void shadeModel(int mode) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (mode != shadeModel) {
         shadeModel = mode;
         GL11.glShadeModel(mode);
      }
   }

   @Deprecated
   public static void enableRescaleNormal() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      RESCALE_NORMAL.enable();
   }

   @Deprecated
   public static void method23820() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      RESCALE_NORMAL.disable();
   }

   public static void viewport(int var0, int var1, int var2, int var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      Class2342.field16012.field16013 = var0;
      Class2342.field16012.field16014 = var1;
      Class2342.field16012.field16015 = var2;
      Class2342.field16012.field16016 = var3;
      GL11.glViewport(var0, var1, var2, var3);
   }

   public static void colorMask(boolean var0, boolean var1, boolean var2, boolean var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != COLOR_MASK.field36346 || var1 != COLOR_MASK.field36347 || var2 != COLOR_MASK.field36348 || var3 != COLOR_MASK.field36349) {
         COLOR_MASK.field36346 = var0;
         COLOR_MASK.field36347 = var1;
         COLOR_MASK.field36348 = var2;
         COLOR_MASK.field36349 = var3;
         GL11.glColorMask(var0, var1, var2, var3);
      }
   }

   public static void method23823(int var0, int var1, int var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != STENCIL.field41162.field35856 || var0 != STENCIL.field41162.field35857 || var0 != STENCIL.field41162.field35858) {
         STENCIL.field41162.field35856 = var0;
         STENCIL.field41162.field35857 = var1;
         STENCIL.field41162.field35858 = var2;
         GL11.glStencilFunc(var0, var1, var2);
      }
   }

   public static void method23824(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != STENCIL.field41163) {
         STENCIL.field41163 = var0;
         GL11.glStencilMask(var0);
      }
   }

   public static void method23825(int var0, int var1, int var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != STENCIL.field41164 || var1 != STENCIL.field41165 || var2 != STENCIL.field41166) {
         STENCIL.field41164 = var0;
         STENCIL.field41165 = var1;
         STENCIL.field41166 = var2;
         GL11.glStencilOp(var0, var1, var2);
      }
   }

   public static void clearDepth(double var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glClearDepth(var0);
   }

   public static void clearColor(float var0, float var1, float var2, float var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glClearColor(var0, var1, var2, var3);
   }

   public static void method23828(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glClearStencil(var0);
   }

   public static void clear(int var0, boolean var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glClear(var0);
      if (var1) {
         method23859();
      }
   }

   @Deprecated
   public static void matrixMode(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glMatrixMode(var0);
   }

   @Deprecated
   public static void loadIdentity() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glLoadIdentity();
   }

   @Deprecated
   public static void method23832() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glPushMatrix();
   }

   @Deprecated
   public static void method23833() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glPopMatrix();
   }

   @Deprecated
   public static void getMatrix(int var0, FloatBuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glGetFloatv(var0, var1);
   }

   @Deprecated
   public static void ortho(double var0, double var2, double var4, double var6, double var8, double var10) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glOrtho(var0, var2, var4, var6, var8, var10);
   }

   @Deprecated
   public static void method23836(float var0, float var1, float var2, float var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glRotatef(var0, var1, var2, var3);
   }

   @Deprecated
   public static void method23837(float var0, float var1, float var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glScalef(var0, var1, var2);
   }

   @Deprecated
   public static void method23838(double var0, double var2, double var4) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glScaled(var0, var2, var4);
   }

   @Deprecated
   public static void translatef(float var0, float var1, float var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glTranslatef(var0, var1, var2);
   }

   @Deprecated
   public static void method23840(double var0, double var2, double var4) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glTranslated(var0, var2, var4);
   }

   @Deprecated
   public static void multMatrix(FloatBuffer var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glMultMatrixf(var0);
   }

   @Deprecated
   public static void multMatrix(Matrix4f var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      var0.write(MATRIX_BUFFER);
      ((Buffer) MATRIX_BUFFER).rewind();
      multMatrix(MATRIX_BUFFER);
   }

   @Deprecated
   public static void color4f(float var0, float var1, float var2, float var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var0 != COLOR.field43518 || var1 != COLOR.field43519 || var2 != COLOR.field43520 || var3 != COLOR.field43521) {
         COLOR.field43518 = var0;
         COLOR.field43519 = var1;
         COLOR.field43520 = var2;
         COLOR.field43521 = var3;
         GL11.glColor4f(var0, var1, var2, var3);
      }
   }

   @Deprecated
   public static void method23844() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      COLOR.field43518 = -1.0F;
      COLOR.field43519 = -1.0F;
      COLOR.field43520 = -1.0F;
      COLOR.field43521 = -1.0F;
   }

   @Deprecated
   public static void method23845(int var0, int var1, long var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glNormalPointer(var0, var1, var2);
   }

   @Deprecated
   public static void method23846(int var0, int var1, int var2, long var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glTexCoordPointer(var0, var1, var2, var3);
   }

   @Deprecated
   public static void method23847(int var0, int var1, int var2, long var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glVertexPointer(var0, var1, var2, var3);
   }

   @Deprecated
   public static void method23848(int var0, int var1, int var2, long var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glColorPointer(var0, var1, var2, var3);
   }

   public static void method23849(int var0, int var1, int var2, boolean var3, int var4, long var5) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glVertexAttribPointer(var0, var1, var2, var3, var4, var5);
   }

   @Deprecated
   public static void method23850(int var0) {
      if (!clientStateLocked) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThread);
         GL11.glEnableClientState(var0);
      }
   }

   @Deprecated
   public static void method23851(int var0) {
      if (!clientStateLocked) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThread);
         GL11.glDisableClientState(var0);
      }
   }

   public static void method23852(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glEnableVertexAttribArray(var0);
   }

   public static void method23853(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL20.glEnableVertexAttribArray(var0);
   }

   public static void method23854(int var0, int var1, int var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glDrawArrays(var0, var1, var2);
      if (Config.isShaders() && !creatingDisplayList) {
         int var5 = Shaders.field40848.method26491();
         if (var5 > 1) {
            for (int var6 = 1; var6 < var5; var6++) {
               Shaders.field40773.method12251(var6);
               GL11.glDrawArrays(var0, var1, var2);
            }

            Shaders.field40773.method12251(0);
         }
      }
   }

   public static void method23855(float var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glLineWidth(var0);
   }

   public static void method23856(int var0, int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GL11.glPixelStorei(var0, var1);
   }

   public static void method23857(int var0, float var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glPixelTransferf(var0, var1);
   }

   public static void method23858(int var0, int var1, int var2, int var3, int var4, int var5, ByteBuffer var6) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glReadPixels(var0, var1, var2, var3, var4, var5, var6);
   }

   public static int method23859() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL11.glGetError();
   }

   public static String method23860(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return GL11.glGetString(var0);
   }

   public static int method23861(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      return GL11.glGetInteger(var0);
   }

   public static boolean isFabulous() {
      return supportType != SupportType.field15980;
   }

   public static int method23863() {
      return 33984 + activeTexture;
   }

   public static void method23864() {
      GL11.glBindTexture(3553, TEXTURES[activeTexture].field40430);
   }

   public static int method23865() {
      return TEXTURES[activeTexture].field40430;
   }

   public static void method23866() {
      if (Config.method26797()) {
         int var2 = GL11.glGetInteger(34016);
         int var3 = GL11.glGetInteger(32873);
         int var4 = method23863();
         int var5 = method23865();
         if (var5 > 0 && (var2 != var4 || var3 != var5)) {
            Config.method26810("checkTexture: act: " + var4 + ", glAct: " + var2 + ", tex: " + var5 + ", glTex: " + var3);
         }
      }
   }

   public static void method23867(IntBuffer var0) {
      ((Buffer)var0).rewind();

      while (var0.position() < var0.limit()) {
         int var3 = var0.get();
         method23812(var3);
      }

      ((Buffer)var0).rewind();
   }

   public static boolean method23868() {
      return BooleanState.method35532(FOG.field44792);
   }

   public static void method23869(boolean var0) {
      FOG.field44792.method35531(var0);
   }

   public static void method23870(GlAlphaState var0) {
      if (!alphaLock.isLocked()) {
         method23872(alphaLockState);
         method23873(var0);
         alphaLock.method21053();
      }
   }

   public static void method23871() {
      if (alphaLock.method21054()) {
         method23873(alphaLockState);
      }
   }

   public static void method23872(GlAlphaState var0) {
      if (!alphaLock.isLocked()) {
         var0.method25207(BooleanState.method35532(ALPHA_TEST.test), ALPHA_TEST.field39454, ALPHA_TEST.field39455);
      } else {
         var0.method25208(alphaLockState);
      }
   }

   public static void method23873(GlAlphaState var0) {
      if (!alphaLock.isLocked()) {
         ALPHA_TEST.test.method35531(var0.method25213());
         method23697(var0.method25214(), var0.method25215());
      } else {
         alphaLockState.method25208(var0);
      }
   }

   public static void method23874(GlBlendState var0) {
      if (!blendLock.isLocked()) {
         method23876(blendLockState);
         method23877(var0);
         blendLock.method21053();
      }
   }

   public static void method23875() {
      if (blendLock.method21054()) {
         method23877(blendLockState);
      }
   }

   public static void method23876(GlBlendState var0) {
      if (!blendLock.isLocked()) {
         var0.method27773(
            BooleanState.method35532(BLEND.field40550), BLEND.field40551, BLEND.field40552, BLEND.field40553, BLEND.field40554
         );
      } else {
         var0.method27774(blendLockState);
      }
   }

   public static void method23877(GlBlendState var0) {
      if (!blendLock.isLocked()) {
         BLEND.field40550.method35531(var0.method27780());
         if (var0.method27785()) {
            blendFuncSeparate(var0.method27781(), var0.method27782(), var0.method27783(), var0.method27784());
         } else {
            blendFunc(var0.method27781(), var0.method27782());
         }
      } else {
         blendLockState.method27774(var0);
      }
   }

   public static void method23878(GlCullState var0) {
      if (!cullLock.isLocked()) {
         method23880(cullLockState);
         method23881(var0);
         cullLock.method21053();
      }
   }

   public static void method23879() {
      if (cullLock.method21054()) {
         method23881(cullLockState);
      }
   }

   public static void method23880(GlCullState var0) {
      if (!cullLock.isLocked()) {
         var0.method38744(BooleanState.method35532(CULL.field26226), CULL.field26227);
      } else {
         var0.method38745(cullLockState);
      }
   }

   public static void method23881(GlCullState var0) {
      if (!cullLock.isLocked()) {
         CULL.field26226.method35531(var0.method38750());
         CULL.field26227 = var0.method38751();
      } else {
         cullLockState.method38745(var0);
      }
   }

   public static void method23882(int var0, IntBuffer var1, IntBuffer var2) {
      GL14.glMultiDrawArrays(var0, var1, var2);
      if (Config.isShaders() && !creatingDisplayList) {
         int var5 = Shaders.field40848.method26491();
         if (var5 > 1) {
            for (int var6 = 1; var6 < var5; var6++) {
               Shaders.field40773.method12251(var6);
               GL14.glMultiDrawArrays(var0, var1, var2);
            }

            Shaders.field40773.method12251(0);
         }
      }
   }

   public static void method23883(int var0) {
      clear(var0, false);
   }

   public static void method23884(IntBuffer var0) {
      GL11.glCallLists(var0);
      if (Config.isShaders() && !creatingDisplayList) {
         int var3 = Shaders.field40848.method26491();
         if (var3 > 1) {
            for (int var4 = 1; var4 < var3; var4++) {
               Shaders.field40773.method12251(var4);
               GL11.glCallLists(var0);
            }

            Shaders.field40773.method12251(0);
         }
      }
   }

   public static void method23885(int var0, long var1, int var3) {
      GL15.glBufferData(var0, var1, var3);
   }

   public static void method23886(int var0, long var1, ByteBuffer var3) {
      GL15.glBufferSubData(var0, var1, var3);
   }

   public static void method23887(int var0, int var1, long var2, long var4, long var6) {
      if (!openGL31) {
         ARBCopyBuffer.glCopyBufferSubData(var0, var1, var2, var4, var6);
      } else {
         GL31.glCopyBufferSubData(var0, var1, var2, var4, var6);
      }
   }

   public static boolean method23888() {
      return fogAllowed;
   }

   public static void method23889(boolean var0) {
      fogAllowed = var0;
   }

   public static void method23890() {
      clientStateLocked = true;
   }

   public static void method23891() {
      clientStateLocked = false;
   }

   public enum SourceFactor {
      field15986(32771),
      field15987(32769),
      field15988(772),
      field15989(774),
      field15990(1),
      field15991(32772),
      field15992(32770),
      field15993(773),
      field15994(775),
      field15995(771),
      field15996(769),
      field15997(770),
      field15998(776),
      field15999(768),
      field16000(0);

      public final int param;
      private static final SourceFactor[] field16002 = new SourceFactor[]{
         field15986,
         field15987,
         field15988,
         field15989,
         field15990,
         field15991,
         field15992,
         field15993,
         field15994,
         field15995,
         field15996,
         field15997,
         field15998,
         field15999,
         field16000
      };

      private SourceFactor(int var3) {
         this.param = var3;
      }
   }

   @Deprecated
   public enum TexGen {
      S,
      T,
      R,
      field14213
   }

   @Deprecated
   public static class AlphaState {
      private static String[] field39452;
      public final BooleanState test = new BooleanState(3008);
      public int field39454 = 519;
      public float field39455 = -1.0F;

      public AlphaState() {
      }
   }

   public static class BooleanState {
      private static String[] field43487;
      private final int field43488;
      private boolean field43489;

      public BooleanState(int var1) {
         this.field43488 = var1;
      }

      public void disable() {
         this.method35531(false);
      }

      public void enable() {
         this.method35531(true);
      }

      public void method35531(boolean var1) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
         if (var1 != this.field43489) {
            this.field43489 = var1;
            if (!var1) {
               GL11.glDisable(this.field43488);
            } else {
               GL11.glEnable(this.field43488);
            }
         }
      }

      // $VF: synthetic method
      public static boolean method35532(BooleanState var0) {
         return var0.field43489;
      }
   }

   @Deprecated
   public static class ColorMaterialState {
      private static String[] field41142;
      public final BooleanState field41143 = new BooleanState(2903);
      public int face = 1032;
      public int mode = 5634;

      public ColorMaterialState() {
      }
   }

   public static class BlendState {
      private static String[] field40549;
      public final BooleanState field40550 = new BooleanState(3042);
      public int field40551 = 1;
      public int field40552 = 0;
      public int field40553 = 1;
      public int field40554 = 0;

      public BlendState() {
      }
   }

   public static class ScissorState {
      private static String[] field40055;
      public final BooleanState field40056 = new BooleanState(3089);

      public ScissorState() {
      }
   }

   public static class StencilState {
      private static String[] field41161;
      public final Class8339 field41162 = new Class8339();
      public int field41163 = -1;
      public int field41164 = 7680;
      public int field41165 = 7680;
      public int field41166 = 7680;

      public StencilState() {
      }
   }

   @Deprecated
   public static class TexGenState {
      private static String[] field21850;
      public final Class9796 field21851 = new Class9796(8192, 3168);
      public final Class9796 field21852 = new Class9796(8193, 3169);
      public final Class9796 field21853 = new Class9796(8194, 3170);
      public final Class9796 field21854 = new Class9796(8195, 3171);

      public TexGenState() {
      }
   }

   public static class ColorLogicState {
      private static String[] field33642;
      public final BooleanState field33643 = new BooleanState(3058);
      public int field33644 = 5379;

      public ColorLogicState() {
      }
   }

   public static class PolygonOffsetState {
      private static String[] field30681;
      public final BooleanState field30682 = new BooleanState(32823);
      public final BooleanState field30683 = new BooleanState(10754);
      public float field30684;
      public float field30685;

      public PolygonOffsetState() {
      }
   }

   public static class CullState {
      private static String[] field26225;
      public final BooleanState field26226 = new BooleanState(2884);
      public int field26227 = 1029;

      public CullState() {
      }
   }

   @Deprecated
   public static class FogState {
      private static String[] field44791;
      public final BooleanState field44792 = new BooleanState(2912);
      public int field44793 = 2048;
      public float field44794 = 1.0F;
      public float field44795;
      public float field44796 = 1.0F;

      public FogState() {
      }
   }

   public static class DepthState {
      private static String[] field32404;
      public final BooleanState field32405 = new BooleanState(2929);
      public boolean field32406 = true;
      public int field32407 = 513;

      public DepthState() {
      }
   }

   public static class TextureState {
      private static String[] field40428;
      public final BooleanState field40429 = new BooleanState(3553);
      public int field40430;

      public TextureState() {
      }
   }

   public static class ColorMask {
      private static String[] field36345;
      public boolean field36346 = true;
      public boolean field36347 = true;
      public boolean field36348 = true;
      public boolean field36349 = true;

      public ColorMask() {
      }
   }

   @Deprecated
   public static class Color {
      private static String[] field43517;
      public float field43518 = 1.0F;
      public float field43519 = 1.0F;
      public float field43520 = 1.0F;
      public float field43521 = 1.0F;

      public Color() {
         this(1.0F, 1.0F, 1.0F, 1.0F);
      }

      public Color(float var1, float var2, float var3, float var4) {
         this.field43518 = var1;
         this.field43519 = var2;
         this.field43520 = var3;
         this.field43521 = var4;
      }
   }

   public enum FramebufferExtension {
      field13460,
      field13461,
      field13462;

      private static final FramebufferExtension[] field13463 = new FramebufferExtension[]{field13460, field13461, field13462};
   }

   public enum SupportType {
      field15978,
      field15979,
      field15980;

      private static final SupportType[] field15981 = new SupportType[]{field15978, field15979, field15980};
   }
}
