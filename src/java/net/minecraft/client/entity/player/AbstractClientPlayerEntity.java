package net.minecraft.client.entity.player;

import com.google.common.hash.Hashing;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.Class4423;
import com.mojang.authlib.GameProfile;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.Texture;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.GameType;
import net.optifine.Config;

import javax.annotation.Nullable;
import java.io.File;

public abstract class AbstractClientPlayerEntity extends PlayerEntity {
   public Class6589 field6096;
   public float field6097;
   public float field6098;
   public float field6099;
   public final ClientWorld field6100;
   private ResourceLocation field6101 = null;
   private long field6102 = 0L;
   private boolean field6103 = false;
   private String field6104 = null;
   public Class1014 field6105;
   public Class1014 field6106;
   public float field6107;
   public float field6108;
   public float field6109;
   private static final ResourceLocation field6110 = new ResourceLocation("textures/entity/elytra.png");

   public AbstractClientPlayerEntity(ClientWorld var1, GameProfile var2) {
      super(var1, var1.method6880(), var1.method6881(), var2);
      this.field6100 = var1;
      this.field6104 = var2.getName();
      if (this.field6104 != null && !this.field6104.isEmpty()) {
         this.field6104 = Class9001.method33255(this.field6104);
      }

      Class7749.method25668(this);
   }

   @Override
   public boolean isSpectator() {
      Class6589 var3 = Minecraft.getInstance().getConnection().method15792(this.getGameProfile().getId());
      return var3 != null && var3.method19967() == GameType.SPECTATOR;
   }

   @Override
   public boolean isCreative() {
      Class6589 var3 = Minecraft.getInstance().getConnection().method15792(this.getGameProfile().getId());
      return var3 != null && var3.method19967() == GameType.field11103;
   }

   public boolean method5368() {
      return this.method5369() != null;
   }

   @Nullable
   public Class6589 method5369() {
      if (this.field6096 == null) {
         this.field6096 = Minecraft.getInstance().getConnection().method15792(this.getUniqueID());
      }

      return this.field6096;
   }

   public boolean method5370() {
      Class6589 var3 = this.method5369();
      return var3 != null && var3.method19971();
   }

   public ResourceLocation method5371() {
      Class6589 var3 = this.method5369();
      return var3 != null ? var3.method19973() : DefaultPlayerSkin.method22637(this.getUniqueID());
   }

   @Nullable
   public ResourceLocation method5372() {
      if (Config.method26914()) {
         if (this.field6102 != 0L && System.currentTimeMillis() > this.field6102) {
            Class8156.method28294(this);
            this.field6102 = 0L;
         }

         if (this.field6101 == null) {
            Class6589 var3 = this.method5369();
            return var3 != null ? var3.method19974() : null;
         } else {
            return this.field6101;
         }
      } else {
         return null;
      }
   }

   public boolean method5373() {
      return this.method5369() != null;
   }

   @Nullable
   public ResourceLocation method5374() {
      Class6589 var3 = this.method5369();
      return var3 != null ? var3.method19975() : null;
   }

   public static DownloadingTexture method5375(ResourceLocation var0, String var1) {
      TextureManager var4 = Minecraft.getInstance().getTextureManager();
      Object var5 = var4.getTexture(var0);
      if (var5 == null) {
         var5 = new DownloadingTexture(
            (File)null,
            String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", Class9001.method33255(var1)),
            DefaultPlayerSkin.method22637(method2961(var1)),
            true,
            (Runnable)null
         );
         var4.loadTexture(var0, (Texture)var5);
      }

      return (DownloadingTexture)var5;
   }

   public static ResourceLocation method5376(String var0) {
      return new ResourceLocation("skins/" + Hashing.sha1().hashUnencodedChars(Class9001.method33255(var0)));
   }

   public String method5377() {
      Class6589 var3 = this.method5369();
      return var3 != null ? var3.method19972() : DefaultPlayerSkin.method22638(this.getUniqueID());
   }

   public float method5378() {
      float var3 = 1.0F;
      if (this.abilities.isFlying) {
         var3 *= 1.1F;
      }

      var3 = (float)((double)var3 * ((this.getAttributeValue(Attributes.MOVEMENT_SPEED) / (double)this.abilities.getWalkSpeed() + 1.0) / 2.0));
      if (this.abilities.getWalkSpeed() == 0.0F || Float.isNaN(var3) || Float.isInfinite(var3)) {
         var3 = 1.0F;
      }

      if (this.isHandActive() && this.getActiveItemStack().getItem() instanceof BowItem) {
         int var4 = this.getItemInUseMaxCount();
         float var5 = (float)var4 / 20.0F;
         if (!(var5 > 1.0F)) {
            var5 *= var5;
         } else {
            var5 = 1.0F;
         }

         var3 *= 1.0F - var5 * 0.15F;
      }

      float var7 = !Reflector.field42878.exists() ? var3 : Reflector.method35059(Reflector.field42878, this, var3);
      Class4423 var9 = new Class4423(var7);
      Client.getInstance().getEventManager().call(var9);
      return var9.field21557;
   }

   public String method5379() {
      return this.field6104;
   }

   public ResourceLocation method5380() {
      return this.field6101;
   }

   public void method5381(ResourceLocation var1) {
      this.field6101 = var1;
   }

   public boolean method5382() {
      ResourceLocation var3 = this.method5372();
      if (var3 != null) {
         return var3 != this.field6101 ? true : this.field6103;
      } else {
         return false;
      }
   }

   public void method5383(boolean var1) {
      this.field6103 = var1;
   }

   public boolean method5384() {
      return this.field6103;
   }

   public long method5385() {
      return this.field6102;
   }

   public void method5386(long var1) {
      this.field6102 = var1;
   }
}
