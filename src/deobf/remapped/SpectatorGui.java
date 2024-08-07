package remapped;

import net.minecraft.util.text.ITextComponent;

public class SpectatorGui extends AbstractGui implements class_3796 {
   private static final Identifier field_42843 = new Identifier("textures/gui/widgets.png");
   public static final Identifier field_42845 = new Identifier("textures/gui/spectator_widgets.png");
   private final MinecraftClient field_42841;
   private long field_42842;
   private class_3421 field_42844;

   public SpectatorGui(MinecraftClient var1) {
      this.field_42841 = var1;
   }

   public void method_38560(int var1) {
      this.field_42842 = Util.getMeasuringTimeMs();
      if (this.field_42844 == null) {
         this.field_42844 = new class_3421(this);
      } else {
         this.field_42844.method_15806(var1);
      }
   }

   private float method_38562() {
      long var3 = this.field_42842 - Util.getMeasuringTimeMs() + 5000L;
      return MathHelper.clamp((float)var3 / 2000.0F, 0.0F, 1.0F);
   }

   public void func_238528_a_(class_7966 var1, float var2) {
      if (this.field_42844 != null) {
         float var5 = this.method_38562();
         if (!(var5 <= 0.0F)) {
            int var6 = this.field_42841.getMainWindow().getScaledWidth() / 2;
            int var7 = this.method_9777();
            this.method_9776(-90);
            int var8 = MathHelper.floor((float)this.field_42841.getMainWindow().getScaledHeight() - 22.0F * var5);
            class_5017 var9 = this.field_42844.method_15811();
            this.method_38561(var1, var5, var6, var8, var9);
            this.method_9776(var7);
         } else {
            this.field_42844.method_15816();
         }
      }
   }

   public void method_38561(class_7966 var1, float var2, int var3, int var4, class_5017 var5) {
      RenderSystem.method_16381();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, var2);
      this.field_42841.getTextureManager().bindTexture(field_42843);
      this.method_9781(var1, var3 - 91, var4, 0, 0, 182, 22);
      if (var5.method_23095() >= 0) {
         this.method_9781(var1, var3 - 91 - 1 + var5.method_23095() * 20, var4 - 1, 0, 22, 24, 22);
      }

      for (int var8 = 0; var8 < 9; var8++) {
         this.method_38565(var1, var8, this.field_42841.getMainWindow().getScaledWidth() / 2 - 90 + var8 * 20 + 2, (float)(var4 + 3), var2, var5.method_23093(var8));
      }

      RenderSystem.method_16443();
      RenderSystem.disableBlend();
   }

   private void method_38565(class_7966 var1, int var2, int var3, float var4, float var5, class_7912 var6) {
      this.field_42841.getTextureManager().bindTexture(field_42845);
      if (var6 != class_3421.field_16839) {
         int var9 = (int)(var5 * 255.0F);
         RenderSystem.method_16438();
         RenderSystem.translatef((float)var3, var4, 0.0F);
         float var10 = !var6.method_35793() ? 0.25F : 1.0F;
         RenderSystem.color4f(var10, var10, var10, var5);
         var6.method_35795(var1, var10, var9);
         RenderSystem.method_16489();
         if (var9 > 3 && var6.method_35793()) {
            ITextComponent var11 = this.field_42841.gameOptions.hotbarKeys[var2].method_27061();
            this.field_42841
               .textRenderer
               .method_45392(var1, var11, (float)(var3 + 19 - 2 - this.field_42841.textRenderer.method_45379(var11)), var4 + 6.0F + 3.0F, 16777215 + (var9 << 24));
         }
      }
   }

   public void method_38563(class_7966 var1) {
      int var4 = (int)(this.method_38562() * 255.0F);
      if (var4 > 3 && this.field_42844 != null) {
         class_7912 var5 = this.field_42844.method_15810();
         ITextComponent var6 = var5 != class_3421.field_16839 ? var5.method_35794() : this.field_42844.method_15805().method_20602();
         if (var6 != null) {
            int var7 = (this.field_42841.getMainWindow().getScaledWidth() - this.field_42841.textRenderer.method_45379(var6)) / 2;
            int var8 = this.field_42841.getMainWindow().getScaledHeight() - 35;
            RenderSystem.method_16438();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            this.field_42841.textRenderer.method_45392(var1, var6, (float)var7, (float)var8, 16777215 + (var4 << 24));
            RenderSystem.disableBlend();
            RenderSystem.method_16489();
         }
      }
   }

   public void 괠娍觯竬哺묙(class_3421 var1) {
      this.field_42844 = null;
      this.field_42842 = 0L;
   }

   public boolean method_38557() {
      return this.field_42844 != null;
   }

   public void method_38564(double var1) {
      int var5 = this.field_42844.method_15817() + (int)var1;

      while (var5 >= 0 && var5 <= 8 && (this.field_42844.method_15804(var5) == class_3421.field_16839 || !this.field_42844.method_15804(var5).method_35793())) {
         var5 = (int)((double)var5 + var1);
      }

      if (var5 >= 0 && var5 <= 8) {
         this.field_42844.method_15806(var5);
         this.field_42842 = Util.getMeasuringTimeMs();
      }
   }

   public void method_38559() {
      this.field_42842 = Util.getMeasuringTimeMs();
      if (!this.method_38557()) {
         this.field_42844 = new class_3421(this);
      } else {
         int var3 = this.field_42844.method_15817();
         if (var3 != -1) {
            this.field_42844.method_15806(var3);
         }
      }
   }
}
