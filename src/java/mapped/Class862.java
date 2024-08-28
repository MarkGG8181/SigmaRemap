package mapped;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class862 extends Class851<Class5826> {
   private static final ResourceLocation field4786 = new ResourceLocation("textures/gui/container/villager2.png");
   private static final ITextComponent field4787 = new TranslationTextComponent("merchant.trades");
   private static final ITextComponent field4788 = new StringTextComponent(" - ");
   private static final ITextComponent field4789 = new TranslationTextComponent("merchant.deprecated");
   private int field4790;
   private final Class1207[] field4791 = new Class1207[7];
   private int field4792;
   private boolean field4793;

   public Class862(Class5826 var1, Class974 var2, ITextComponent var3) {
      super(var1, var2, var3);
      this.field4721 = 276;
      this.field4725 = 107;
   }

   private void method2661() {
      this.field4727.method18204(this.field4790);
      this.field4727.method18213(this.field4790);
      this.field4562.getClientPlayNetHandler().sendPacket(new Class5541(this.field4790));
   }

   @Override
   public void method1921() {
      super.method1921();
      int var3 = (this.field4564 - this.field4721) / 2;
      int var4 = (this.field4565 - this.field4722) / 2;
      int var5 = var4 + 16 + 2;

      for (int var6 = 0; var6 < 7; var6++) {
         this.field4791[var6] = this.<Class1207>method2455(new Class1207(this, var3 + 5, var5, var6, var1 -> {
            if (var1 instanceof Class1207) {
               this.field4790 = ((Class1207)var1).method5765() + this.field4792;
               this.method2661();
            }
         }));
         var5 += 20;
      }
   }

   @Override
   public void method2617(Class9332 var1, int var2, int var3) {
      int var6 = this.field4727.method18208();
      if (var6 > 0 && var6 <= 5 && this.field4727.method18218()) {
         IFormattableTextComponent var7 = this.field4560.deepCopy().append(field4788).append(new TranslationTextComponent("merchant.level." + var6));
         int var8 = this.field4568.method38821(var7);
         int var9 = 49 + this.field4721 / 2 - var8 / 2;
         this.field4568.method38805(var1, var7, (float)var9, 6.0F, 4210752);
      } else {
         this.field4568.method38805(var1, this.field4560, (float)(49 + this.field4721 / 2 - this.field4568.method38821(this.field4560) / 2), 6.0F, 4210752);
      }

      this.field4568.method38805(var1, this.field4728.method2954(), (float)this.field4725, (float)this.field4726, 4210752);
      int var10 = this.field4568.method38821(field4787);
      this.field4568.method38805(var1, field4787, (float)(5 - var10 / 2 + 48), 6.0F, 4210752);
   }

   @Override
   public void method2618(Class9332 var1, float var2, int var3, int var4) {
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      this.field4562.getTextureManager().bindTexture(field4786);
      int var7 = (this.field4564 - this.field4721) / 2;
      int var8 = (this.field4565 - this.field4722) / 2;
      method5697(var1, var7, var8, this.method5702(), 0.0F, 0.0F, this.field4721, this.field4722, 256, 512);
      Class46 var9 = this.field4727.method18217();
      if (!var9.isEmpty()) {
         int var10 = this.field4790;
         if (var10 < 0 || var10 >= var9.size()) {
            return;
         }

         Class9346 var11 = var9.get(var10);
         if (var11.method35382()) {
            this.field4562.getTextureManager().bindTexture(field4786);
            RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
            method5697(var1, this.field4734 + 83 + 99, this.field4735 + 35, this.method5702(), 311.0F, 0.0F, 28, 21, 256, 512);
         }
      }
   }

   private void method2662(Class9332 var1, int var2, int var3, Class9346 var4) {
      this.field4562.getTextureManager().bindTexture(field4786);
      int var7 = this.field4727.method18208();
      int var8 = this.field4727.method18205();
      if (var7 < 5) {
         method5697(var1, var2 + 136, var3 + 16, this.method5702(), 0.0F, 186.0F, 102, 5, 256, 512);
         int var9 = Class7921.method26576(var7);
         if (var8 >= var9 && Class7921.method26578(var7)) {
            byte var10 = 100;
            float var11 = 100.0F / (float)(Class7921.method26577(var7) - var9);
            int var12 = Math.min(Class9679.method37767(var11 * (float)(var8 - var9)), 100);
            method5697(var1, var2 + 136, var3 + 16, this.method5702(), 0.0F, 191.0F, var12 + 1, 5, 256, 512);
            int var13 = this.field4727.method18206();
            if (var13 > 0) {
               int var14 = Math.min(Class9679.method37767((float)var13 * var11), 100 - var12);
               method5697(var1, var2 + 136 + var12 + 1, var3 + 16 + 1, this.method5702(), 2.0F, 182.0F, var14, 3, 256, 512);
            }
         }
      }
   }

   private void method2663(Class9332 var1, int var2, int var3, Class46 var4) {
      int var7 = var4.size() + 1 - 7;
      if (var7 <= 1) {
         method5697(var1, var2 + 94, var3 + 18, this.method5702(), 6.0F, 199.0F, 6, 27, 256, 512);
      } else {
         int var8 = 139 - (27 + (var7 - 1) * 139 / var7);
         int var9 = 1 + var8 / var7 + 139 / var7;
         byte var10 = 113;
         int var11 = Math.min(113, this.field4792 * var9);
         if (this.field4792 == var7 - 1) {
            var11 = 113;
         }

         method5697(var1, var2 + 94, var3 + 18 + var11, this.method5702(), 0.0F, 199.0F, 6, 27, 256, 512);
      }
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      this.method2469(var1);
      super.method1923(var1, var2, var3, var4);
      Class46 var7 = this.field4727.method18217();
      if (!var7.isEmpty()) {
         int var8 = (this.field4564 - this.field4721) / 2;
         int var9 = (this.field4565 - this.field4722) / 2;
         int var10 = var9 + 16 + 1;
         int var11 = var8 + 5 + 5;
         RenderSystem.pushMatrix();
         RenderSystem.method27867();
         this.field4562.getTextureManager().bindTexture(field4786);
         this.method2663(var1, var8, var9, var7);
         int var12 = 0;

         for (Class9346 var14 : var7) {
            if (!this.method2666(var7.size()) || var12 >= this.field4792 && var12 < 7 + this.field4792) {
               Class8848 var15 = var14.method35365();
               Class8848 var16 = var14.method35366();
               Class8848 var17 = var14.method35367();
               Class8848 var18 = var14.method35368();
               this.field4563.field847 = 100.0F;
               int var19 = var10 + 2;
               this.method2665(var1, var16, var15, var11, var19);
               if (!var17.method32105()) {
                  this.field4563.method794(var17, var8 + 5 + 35, var19);
                  this.field4563.method797(this.field4568, var17, var8 + 5 + 35, var19);
               }

               this.method2664(var1, var14, var8, var19);
               this.field4563.method794(var18, var8 + 5 + 68, var19);
               this.field4563.method797(this.field4568, var18, var8 + 5 + 68, var19);
               this.field4563.field847 = 0.0F;
               var10 += 20;
               var12++;
            } else {
               var12++;
            }
         }

         int var20 = this.field4790;
         Class9346 var21 = var7.get(var20);
         if (this.field4727.method18218()) {
            this.method2662(var1, var8, var9, var21);
         }

         if (var21.method35382() && this.method2625(186, 35, 22, 21, (double)var2, (double)var3) && this.field4727.method18211()) {
            this.method2459(var1, field4789, var2, var3);
         }

         for (Class1207 var25 : this.field4791) {
            if (var25.method5737()) {
               var25.method5738(var1, var2, var3);
            }

            var25.field6483 = var25.field6516 < this.field4727.method18217().size();
         }

         RenderSystem.popMatrix();
         RenderSystem.enableDepthTest();
      }

      this.method2615(var1, var2, var3);
   }

   private void method2664(Class9332 var1, Class9346 var2, int var3, int var4) {
      RenderSystem.enableBlend();
      this.field4562.getTextureManager().bindTexture(field4786);
      if (!var2.method35382()) {
         method5697(var1, var3 + 5 + 35 + 20, var4 + 3, this.method5702(), 15.0F, 171.0F, 10, 9, 256, 512);
      } else {
         method5697(var1, var3 + 5 + 35 + 20, var4 + 3, this.method5702(), 25.0F, 171.0F, 10, 9, 256, 512);
      }
   }

   private void method2665(Class9332 var1, Class8848 var2, Class8848 var3, int var4, int var5) {
      this.field4563.method794(var2, var4, var5);
      if (var3.method32179() != var2.method32179()) {
         this.field4563.method798(this.field4568, var3, var4, var5, var3.method32179() != 1 ? null : "1");
         this.field4563.method798(this.field4568, var2, var4 + 14, var5, var2.method32179() != 1 ? null : "1");
         this.field4562.getTextureManager().bindTexture(field4786);
         this.method5703(this.method5702() + 300);
         method5697(var1, var4 + 7, var5 + 12, this.method5702(), 0.0F, 176.0F, 9, 2, 256, 512);
         this.method5703(this.method5702() - 300);
      } else {
         this.field4563.method797(this.field4568, var2, var4, var5);
      }
   }

   private boolean method2666(int var1) {
      return var1 > 7;
   }

   @Override
   public boolean method2649(double var1, double var3, double var5) {
      int var9 = this.field4727.method18217().size();
      if (this.method2666(var9)) {
         int var10 = var9 - 7;
         this.field4792 = (int)((double)this.field4792 - var5);
         this.field4792 = Class9679.method37775(this.field4792, 0, var10);
      }

      return true;
   }

   @Override
   public boolean method2516(double var1, double var3, int var5, double var6, double var8) {
      int var12 = this.field4727.method18217().size();
      if (!this.field4793) {
         return super.method2516(var1, var3, var5, var6, var8);
      } else {
         int var13 = this.field4735 + 18;
         int var14 = var13 + 139;
         int var15 = var12 - 7;
         float var16 = ((float)var3 - (float)var13 - 13.5F) / ((float)(var14 - var13) - 27.0F);
         var16 = var16 * (float)var15 + 0.5F;
         this.field4792 = Class9679.method37775((int)var16, 0, var15);
         return true;
      }
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      this.field4793 = false;
      int var8 = (this.field4564 - this.field4721) / 2;
      int var9 = (this.field4565 - this.field4722) / 2;
      if (this.method2666(this.field4727.method18217().size())
         && var1 > (double)(var8 + 94)
         && var1 < (double)(var8 + 94 + 6)
         && var3 > (double)(var9 + 18)
         && var3 <= (double)(var9 + 18 + 139 + 1)) {
         this.field4793 = true;
      }

      return super.method1958(var1, var3, var5);
   }

   // $VF: synthetic method
   public static int method2668(Class862 var0) {
      return var0.field4792;
   }

   // $VF: synthetic method
   public static void method2669(Class862 var0, Class9332 var1, Class8848 var2, int var3, int var4) {
      var0.method2457(var1, var2, var3, var4);
   }

   // $VF: synthetic method
   public static void method2670(Class862 var0, Class9332 var1, Class8848 var2, int var3, int var4) {
      var0.method2457(var1, var2, var3, var4);
   }

   // $VF: synthetic method
   public static void method2671(Class862 var0, Class9332 var1, Class8848 var2, int var3, int var4) {
      var0.method2457(var1, var2, var3, var4);
   }
}