package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class852 extends Class851<Class5836> {
   private static final ResourceLocation field4753 = new ResourceLocation("textures/gui/container/cartography_table.png");

   public Class852(Class5836 var1, Class974 var2, ITextComponent var3) {
      super(var1, var2, var3);
      this.field4724 -= 2;
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      super.method1923(var1, var2, var3, var4);
      this.method2615(var1, var2, var3);
   }

   @Override
   public void method2618(Class9332 var1, float var2, int var3, int var4) {
      this.method2469(var1);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      this.field4562.getTextureManager().bindTexture(field4753);
      int var7 = this.field4734;
      int var8 = this.field4735;
      this.method5696(var1, var7, var8, 0, 0, this.field4721, this.field4722);
      Class3257 var9 = this.field4727.method18131(1).method18265().method32107();
      boolean var10 = var9 == Class8514.field38056;
      boolean var11 = var9 == Class8514.field37899;
      boolean var12 = var9 == Class8514.field37471;
      Class8848 var13 = this.field4727.method18131(0).method18265();
      boolean var14 = false;
      Class7529 var15;
      if (var13.method32107() != Class8514.field37955) {
         var15 = null;
      } else {
         var15 = Class3316.method11860(var13, this.field4562.field1338);
         if (var15 != null) {
            if (var15.field32323) {
               var14 = true;
               if (var11 || var12) {
                  this.method5696(var1, var7 + 35, var8 + 31, this.field4721 + 50, 132, 28, 21);
               }
            }

            if (var11 && var15.field32321 >= 4) {
               var14 = true;
               this.method5696(var1, var7 + 35, var8 + 31, this.field4721 + 50, 132, 28, 21);
            }
         }
      }

      this.method2629(var1, var15, var10, var11, var12, var14);
   }

   private void method2629(Class9332 var1, Class7529 var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      int var9 = this.field4734;
      int var10 = this.field4735;
      if (var4 && !var6) {
         this.method5696(var1, var9 + 67, var10 + 13, this.field4721, 66, 66, 66);
         this.method2630(var2, var9 + 85, var10 + 31, 0.226F);
      } else if (!var3) {
         if (!var5) {
            this.method5696(var1, var9 + 67, var10 + 13, this.field4721, 0, 66, 66);
            this.method2630(var2, var9 + 71, var10 + 17, 0.45F);
         } else {
            this.method5696(var1, var9 + 67, var10 + 13, this.field4721, 0, 66, 66);
            this.method2630(var2, var9 + 71, var10 + 17, 0.45F);
            this.field4562.getTextureManager().bindTexture(field4753);
            RenderSystem.pushMatrix();
            RenderSystem.translatef(0.0F, 0.0F, 1.0F);
            this.method5696(var1, var9 + 66, var10 + 12, 0, this.field4722, 66, 66);
            RenderSystem.popMatrix();
         }
      } else {
         this.method5696(var1, var9 + 67 + 16, var10 + 13, this.field4721, 132, 50, 66);
         this.method2630(var2, var9 + 86, var10 + 16, 0.34F);
         this.field4562.getTextureManager().bindTexture(field4753);
         RenderSystem.pushMatrix();
         RenderSystem.translatef(0.0F, 0.0F, 1.0F);
         this.method5696(var1, var9 + 67, var10 + 13 + 16, this.field4721, 132, 50, 66);
         this.method2630(var2, var9 + 70, var10 + 32, 0.34F);
         RenderSystem.popMatrix();
      }
   }

   private void method2630(Class7529 var1, int var2, int var3, float var4) {
      if (var1 != null) {
         RenderSystem.pushMatrix();
         RenderSystem.translatef((float)var2, (float)var3, 1.0F);
         RenderSystem.scalef(var4, var4, 1.0F);
         Class7735 var7 = Class7733.method25595(Class9352.method35409().method35411());
         this.field4562.field1295.method756().method593(new Class9332(), var7, var1, true, 15728880);
         var7.method25602();
         RenderSystem.popMatrix();
      }
   }
}