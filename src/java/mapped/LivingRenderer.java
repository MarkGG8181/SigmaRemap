package mapped;

import com.google.common.collect.Lists;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.EventRenderEntity;
import com.mentalfrostbyte.jello.event.impl.EventRenderNameTag;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Pose;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextFormatting;
import net.optifine.Config;
import net.optifine.entity.model.CustomEntityModels;
import net.optifine.shaders.Shaders;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.List;

public abstract class LivingRenderer<T extends LivingEntity, M extends Class2827<T>> extends EntityRenderer<T> implements Class5714<T, M> {
   private static final Logger field25085 = LogManager.getLogger();
   public M field25086;
   public final List<Class219<T, M>> field25087 = Lists.newArrayList();
   public LivingEntity field25088;
   public float field25089;
   public float field25090;
   public float field25091;
   public float field25092;
   public float field25093;
   public float field25094;
   public static final boolean field25095 = Boolean.getBoolean("animate.model.living");
   public float field25096 = 1.0F;

   public LivingRenderer(EntityRendererManager var1, M var2, float var3) {
      super(var1);
      this.field25086 = (M)var2;
      this.shadowSize = var3;
   }

   public final boolean addLayer(Class219<T, M> var1) {
      return this.field25087.add(var1);
   }

   @Override
   public M getEntityModel() {
      return this.field25086;
   }

   public void render(T var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      if (!Reflector.field42990.exists() || !Reflector.postForgeBusEvent(Reflector.field42990, var1, this, var3, var4, var5, var6)) {
         if (field25095) {
            var1.field4960 = 1.0F;
         }

         var4.push();
         this.field25086.swingProgress = this.method17885((T)var1, var3);
         this.field25086.isSitting = var1.isPassenger();
         if (Reflector.field42838.exists()) {
            this.field25086.isSitting = var1.isPassenger() && var1.getRidingEntity() != null && Reflector.method35064(var1.getRidingEntity(), Reflector.field42838);
         }

         this.field25086.field17602 = var1.isChild();
         float var9 = MathHelper.method37827(var3, var1.prevRenderYawOffset, var1.renderYawOffset);
         float var10 = MathHelper.method37827(var3, var1.prevRotationYawHead, var1.rotationYawHead);
         float var11 = var10 - var9;
         if (this.field25086.isSitting && var1.getRidingEntity() instanceof LivingEntity) {
            LivingEntity var12 = (LivingEntity)var1.getRidingEntity();
            var9 = MathHelper.method37827(var3, var12.prevRenderYawOffset, var12.renderYawOffset);
            var11 = var10 - var9;
            float var13 = MathHelper.method37792(var11);
            if (var13 < -85.0F) {
               var13 = -85.0F;
            }

            if (var13 >= 85.0F) {
               var13 = 85.0F;
            }

            var9 = var10 - var13;
            if (var13 * var13 > 2500.0F) {
               var9 += var13 * 0.2F;
            }

            var11 = var10 - var9;
         }

         float var31 = MathHelper.lerp(var3, var1.prevRotationPitch, var1.rotationPitch);
         EventRenderEntity var33 = new EventRenderEntity(var9, var10, var11, var31, var3, var1);
         Client.getInstance().getEventManager().call(var33);
         if (var33.isCancelled()) {
            var4.pop();
            return;
         }

         var9 = var33.method13944();
         var10 = var33.method13945();
         var11 = var33.method13946();
         var31 = var33.method13947();
         if (var1.getPose() == Pose.field13621) {
            Direction var14 = var1.getBedDirection();
            if (var14 != null) {
               float var15 = var1.getEyeHeight(Pose.STANDING) - 0.1F;
               var4.translate((double)((float)(-var14.getXOffset()) * var15), 0.0, (double)((float)(-var14.getZOffset()) * var15));
            }
         }

         float var34 = this.method17871((T)var1, var3);
         this.method17842((T)var1, var4, var34, var9, var3);
         var4.scale(-1.0F, -1.0F, 1.0F);
         this.method17857((T)var1, var4, var3);
         var4.translate(0.0, -1.501F, 0.0);
         float var35 = 0.0F;
         float var16 = 0.0F;
         if (!var1.isPassenger() && var1.isAlive()) {
            var35 = MathHelper.lerp(var3, var1.prevLimbSwingAmount, var1.field4960);
            var16 = var1.field4961 - var1.field4960 * (1.0F - var3);
            if (var1.isChild()) {
               var16 *= 3.0F;
            }

            if (var35 > 1.0F) {
               var35 = 1.0F;
            }
         }

         var33.setState(RenderState.field13213);
         Client.getInstance().getEventManager().call(var33);
         this.field25086.setLivingAnimations((T)var1, var16, var35, var3);
         this.field25086.setRotationAngles((T)var1, var16, var35, var34, var11, var31);
         if (CustomEntityModels.isActive()) {
            this.field25088 = var1;
            this.field25089 = var16;
            this.field25090 = var35;
            this.field25091 = var34;
            this.field25092 = var11;
            this.field25093 = var31;
            this.field25094 = var3;
         }

         boolean var17 = Config.isShaders();
         Minecraft var18 = Minecraft.getInstance();
         boolean var19 = this.method17869((T)var1);
         boolean var20 = !var19 && !var1.isInvisibleToPlayer(var18.player);
         boolean var21 = var18.isEntityGlowing(var1);
         RenderType var22 = this.method17882((T)var1, var19, var20, var21);
         if (var22 != null) {
            IVertexBuilder var23 = var5.method25597(var22);
            float var24 = this.method17879((T)var1, var3);
            if (var17) {
               if (var1.hurtTime > 0 || var1.deathTime > 0) {
                  Shaders.method33086(1.0F, 0.0F, 0.0F, 0.3F);
               }

               if (var24 > 0.0F) {
                  Shaders.method33086(var24, var24, var24, 0.5F);
               }
            }

            int var25 = method17883(var1, var24);
            this.field25086.render(var4, var23, var6, var25, 1.0F, 1.0F, 1.0F, (!var20 ? 1.0F : 0.15F) * this.field25096);
         }

         if (!var1.isSpectator() && var33.method13954()) {
            for (Class219 var37 : this.field25087) {
               var37.method820(var4, var5, var6, var1, var16, var35, var3, var34, var11, var31);
            }
         }

         if (Config.isShaders()) {
            Shaders.method33086(0.0F, 0.0F, 0.0F, 0.0F);
         }

         if (CustomEntityModels.isActive()) {
            this.field25088 = null;
         }

         var33.setState(RenderState.field13214);
         Client.getInstance().getEventManager().call(var33);
         var4.pop();
         super.render((T)var1, var2, var3, var4, var5, var6);
         if (Reflector.field42992.exists()) {
            Reflector.postForgeBusEvent(Reflector.field42992, var1, this, var3, var4, var5, var6);
         }
      }
   }

   @Nullable
   public RenderType method17882(T var1, boolean var2, boolean var3, boolean var4) {
      ResourceLocation var7 = this.method17843((T)var1);
      if (this.method17900() != null) {
         var7 = this.method17900();
      }

      if (!var3) {
         if (!var2) {
            if (var1.isGlowing() && !Config.method26860().worldRenderer.isRenderEntityOutlines()) {
               return this.field25086.method11028(var7);
            } else {
               return !var4 ? null : RenderType.method14329(var7);
            }
         } else {
            return this.field25086.method11028(var7);
         }
      } else {
         return RenderType.method14315(var7);
      }
   }

   public static int method17883(LivingEntity var0, float var1) {
      return OverlayTexture.method730(OverlayTexture.method728(var1), OverlayTexture.method729(var0.hurtTime > 0 || var0.deathTime > 0));
   }

   public boolean method17869(T var1) {
      return !var1.isInvisible();
   }

   private static float method17884(Direction var0) {
      switch (Class8663.field39038[var0.ordinal()]) {
         case 1:
            return 90.0F;
         case 2:
            return 0.0F;
         case 3:
            return 270.0F;
         case 4:
            return 180.0F;
         default:
            return 0.0F;
      }
   }

   public boolean method17860(T var1) {
      return false;
   }

   public void method17842(T var1, MatrixStack var2, float var3, float var4, float var5) {
      if (this.method17860((T)var1)) {
         var4 += (float)(Math.cos((double)var1.ticksExisted * 3.25) * Math.PI * 0.4F);
      }

      Pose var8 = var1.getPose();
      if (var8 != Pose.field13621) {
         var2.rotate(Vector3f.YP.rotationDegrees(180.0F - var4));
      }

      if (var1.deathTime <= 0) {
         if (!var1.isSpinAttacking()) {
            if (var8 != Pose.field13621) {
               if (var1.method3381() || var1 instanceof PlayerEntity) {
                  String var9 = TextFormatting.getTextWithoutFormattingCodes(var1.getName().getString());
                  if (("Dinnerbone".equals(var9) || "Grumm".equals(var9)) && (!(var1 instanceof PlayerEntity) || ((PlayerEntity)var1).method2962(Class2318.field15879))
                     )
                   {
                     var2.translate(0.0, (double)(var1.getHeight() + 0.1F), 0.0);
                     var2.rotate(Vector3f.ZP.rotationDegrees(180.0F));
                  }
               }
            } else {
               Direction var11 = var1.getBedDirection();
               float var10 = var11 == null ? var4 : method17884(var11);
               var2.rotate(Vector3f.YP.rotationDegrees(var10));
               var2.rotate(Vector3f.ZP.rotationDegrees(this.method17865((T)var1)));
               var2.rotate(Vector3f.YP.rotationDegrees(270.0F));
            }
         } else {
            var2.rotate(Vector3f.XP.rotationDegrees(-90.0F - var1.rotationPitch));
            var2.rotate(Vector3f.YP.rotationDegrees(((float)var1.ticksExisted + var5) * -75.0F));
         }
      } else {
         float var12 = ((float)var1.deathTime + var5 - 1.0F) / 20.0F * 1.6F;
         var12 = MathHelper.sqrt(var12);
         if (var12 > 1.0F) {
            var12 = 1.0F;
         }

         var2.rotate(Vector3f.ZP.rotationDegrees(var12 * this.method17865((T)var1)));
      }
   }

   public float method17885(T var1, float var2) {
      return var1.getSwingProgress(var2);
   }

   public float method17871(T var1, float var2) {
      return (float)var1.ticksExisted + var2;
   }

   public float method17865(T var1) {
      return 90.0F;
   }

   public float method17879(T var1, float var2) {
      return 0.0F;
   }

   public void method17857(T var1, MatrixStack var2, float var3) {
   }

   public boolean method17852(T var1) {
      EventRenderNameTag var4 = new EventRenderNameTag(var1);
      Client.getInstance().getEventManager().call(var4);
      if (var4.isCancelled()) {
         return false;
      } else {
         double var5 = this.field25097.method32228(var1);
         float var7 = var1.isDiscrete() ? 32.0F : 64.0F;
         if (var5 >= (double)(var7 * var7)) {
            return false;
         } else {
            Minecraft var8 = Minecraft.getInstance();
            ClientPlayerEntity var9 = var8.player;
            boolean var10 = !var1.isInvisibleToPlayer(var9);
            if (var1 != var9) {
               Team var11 = var1.getTeam();
               Team var12 = var9.getTeam();
               if (var11 != null) {
                  Team.Visible var13 = var11.method28582();
                  switch (Class8663.field39039[var13.ordinal()]) {
                     case 1:
                        return var10;
                     case 2:
                        return false;
                     case 3:
                        return var12 == null ? var10 : var11.method28592(var12) && (var11.method28580() || var10);
                     case 4:
                        return var12 == null ? var10 : !var11.method28592(var12) && var10;
                     default:
                        return true;
                  }
               }
            }

            return Minecraft.isGuiEnabled() && var1 != var8.getRenderViewEntity() && var10 && !var1.isBeingRidden();
         }
      }
   }

   public List<Class219<T, M>> method17886() {
      return this.field25087;
   }
}
