package mapped;

import java.util.Collections;
import java.util.List;

public abstract class Class1298 extends Class1150 implements Class1190 {
   public static final int field6868 = -1;
   public static final int field6869 = -2;
   public final Minecraft field6870;
   public int field6871;
   public int field6872;
   public int field6873;
   public int field6874;
   public int field6875;
   public int field6876;
   public final int field6877;
   public boolean field6878 = true;
   public int field6879 = -2;
   public double field6880;
   public boolean field6881 = true;
   public boolean field6882 = true;
   public boolean field6883;
   public int field6884;
   private boolean field6885;

   public Class1298(Minecraft var1, int var2, int var3, int var4, int var5, int var6) {
      this.field6870 = var1;
      this.field6871 = var2;
      this.field6872 = var3;
      this.field6873 = var4;
      this.field6874 = var5;
      this.field6877 = var6;
      this.field6876 = 0;
      this.field6875 = var2;
   }

   public void method6142(int var1, int var2, int var3, int var4) {
      this.field6871 = var1;
      this.field6872 = var2;
      this.field6873 = var3;
      this.field6874 = var4;
      this.field6876 = 0;
      this.field6875 = var1;
   }

   public void method6143(boolean var1) {
      this.field6882 = var1;
   }

   public void method6144(boolean var1, int var2) {
      this.field6883 = var1;
      this.field6884 = var2;
      if (!var1) {
         this.field6884 = 0;
      }
   }

   public void method6145(boolean var1) {
      this.field6881 = var1;
   }

   public boolean method6146() {
      return this.field6881;
   }

   public abstract int method6147();

   @Override
   public List<? extends Class1152> method2468() {
      return Collections.emptyList();
   }

   public boolean method6148(int var1, int var2, double var3, double var5) {
      return true;
   }

   public abstract boolean method6149(int var1);

   public int method6150() {
      return this.method6147() * this.field6877 + this.field6884;
   }

   public abstract void method6151();

   public void method6152(int var1, int var2, int var3, float var4) {
   }

   public abstract void method6153(Class9332 var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8);

   public void method6154(int var1, int var2, Class9352 var3) {
   }

   public void method6155(int var1, int var2) {
   }

   public void method6156(int var1, int var2) {
   }

   public int method6157(double var1, double var3) {
      int var7 = this.field6876 + this.field6871 / 2 - this.method6167() / 2;
      int var8 = this.field6876 + this.field6871 / 2 + this.method6167() / 2;
      int var9 = Class9679.method37769(var3 - (double)this.field6873) - this.field6884 + (int)this.field6880 - 4;
      int var10 = var9 / this.field6877;
      return var1 < (double)this.method6170() && var1 >= (double)var7 && var1 <= (double)var8 && var10 >= 0 && var9 >= 0 && var10 < this.method6147()
         ? var10
         : -1;
   }

   public void method6158() {
      this.field6880 = Class9679.method37778(this.field6880, 0.0, (double)this.method6159());
   }

   public int method6159() {
      return Math.max(0, this.method6150() - (this.field6874 - this.field6873 - 4));
   }

   public void method6160(int var1) {
      this.field6880 = (double)(var1 * this.field6877 + this.field6877 / 2 - (this.field6874 - this.field6873) / 2);
      this.method6158();
   }

   public int method6161() {
      return (int)this.field6880;
   }

   public boolean method6162(double var1, double var3) {
      return var3 >= (double)this.field6873 && var3 <= (double)this.field6874 && var1 >= (double)this.field6876 && var1 <= (double)this.field6875;
   }

   public int method6163() {
      return (int)this.field6880 - this.field6872 - this.field6884;
   }

   public void method6164(int var1) {
      this.field6880 += (double)var1;
      this.method6158();
      this.field6879 = -2;
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      if (this.field6881) {
         this.method6151();
         int var7 = this.method6170();
         int var8 = var7 + 6;
         this.method6158();
         Class9352 var9 = Class9352.method35409();
         Class5425 var10 = var9.method35411();
         this.field6870.getTextureManager().bindTexture(Class1193.field6451);
         RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
         float var11 = 32.0F;
         var10.method17063(7, Class9337.field43346);
         var10.method17025((double)this.field6876, (double)this.field6874, 0.0)
            .method17027((float)this.field6876 / 32.0F, (float)(this.field6874 + (int)this.field6880) / 32.0F)
            .method17026(32, 32, 32, 255)
            .method17031();
         var10.method17025((double)this.field6875, (double)this.field6874, 0.0)
            .method17027((float)this.field6875 / 32.0F, (float)(this.field6874 + (int)this.field6880) / 32.0F)
            .method17026(32, 32, 32, 255)
            .method17031();
         var10.method17025((double)this.field6875, (double)this.field6873, 0.0)
            .method17027((float)this.field6875 / 32.0F, (float)(this.field6873 + (int)this.field6880) / 32.0F)
            .method17026(32, 32, 32, 255)
            .method17031();
         var10.method17025((double)this.field6876, (double)this.field6873, 0.0)
            .method17027((float)this.field6876 / 32.0F, (float)(this.field6873 + (int)this.field6880) / 32.0F)
            .method17026(32, 32, 32, 255)
            .method17031();
         var9.method35410();
         int var12 = this.field6876 + this.field6871 / 2 - this.method6167() / 2 + 2;
         int var13 = this.field6873 + 4 - (int)this.field6880;
         if (this.field6883) {
            this.method6154(var12, var13, var9);
         }

         this.method6168(var1, var12, var13, var2, var3, var4);
         RenderSystem.disableDepthTest();
         this.method6171(0, this.field6873, 255, 255);
         this.method6171(this.field6874, this.field6872, 255, 255);
         RenderSystem.enableBlend();
         RenderSystem.method27836(Class2339.field15997, Class1981.field12932, Class2339.field16000, Class1981.field12927);
         RenderSystem.method27817();
         RenderSystem.method27866(7425);
         RenderSystem.method27862();
         byte var14 = 4;
         var10.method17063(7, Class9337.field43346);
         var10.method17025((double)this.field6876, (double)(this.field6873 + 4), 0.0).method17027(0.0F, 1.0F).method17026(0, 0, 0, 0).method17031();
         var10.method17025((double)this.field6875, (double)(this.field6873 + 4), 0.0).method17027(1.0F, 1.0F).method17026(0, 0, 0, 0).method17031();
         var10.method17025((double)this.field6875, (double)this.field6873, 0.0).method17027(1.0F, 0.0F).method17026(0, 0, 0, 255).method17031();
         var10.method17025((double)this.field6876, (double)this.field6873, 0.0).method17027(0.0F, 0.0F).method17026(0, 0, 0, 255).method17031();
         var9.method35410();
         var10.method17063(7, Class9337.field43346);
         var10.method17025((double)this.field6876, (double)this.field6874, 0.0).method17027(0.0F, 1.0F).method17026(0, 0, 0, 255).method17031();
         var10.method17025((double)this.field6875, (double)this.field6874, 0.0).method17027(1.0F, 1.0F).method17026(0, 0, 0, 255).method17031();
         var10.method17025((double)this.field6875, (double)(this.field6874 - 4), 0.0).method17027(1.0F, 0.0F).method17026(0, 0, 0, 0).method17031();
         var10.method17025((double)this.field6876, (double)(this.field6874 - 4), 0.0).method17027(0.0F, 0.0F).method17026(0, 0, 0, 0).method17031();
         var9.method35410();
         int var15 = this.method6159();
         if (var15 > 0) {
            int var16 = (int)((float)((this.field6874 - this.field6873) * (this.field6874 - this.field6873)) / (float)this.method6150());
            var16 = Class9679.method37775(var16, 32, this.field6874 - this.field6873 - 8);
            int var17 = (int)this.field6880 * (this.field6874 - this.field6873 - var16) / var15 + this.field6873;
            if (var17 < this.field6873) {
               var17 = this.field6873;
            }

            var10.method17063(7, Class9337.field43346);
            var10.method17025((double)var7, (double)this.field6874, 0.0).method17027(0.0F, 1.0F).method17026(0, 0, 0, 255).method17031();
            var10.method17025((double)var8, (double)this.field6874, 0.0).method17027(1.0F, 1.0F).method17026(0, 0, 0, 255).method17031();
            var10.method17025((double)var8, (double)this.field6873, 0.0).method17027(1.0F, 0.0F).method17026(0, 0, 0, 255).method17031();
            var10.method17025((double)var7, (double)this.field6873, 0.0).method17027(0.0F, 0.0F).method17026(0, 0, 0, 255).method17031();
            var9.method35410();
            var10.method17063(7, Class9337.field43346);
            var10.method17025((double)var7, (double)(var17 + var16), 0.0).method17027(0.0F, 1.0F).method17026(128, 128, 128, 255).method17031();
            var10.method17025((double)var8, (double)(var17 + var16), 0.0).method17027(1.0F, 1.0F).method17026(128, 128, 128, 255).method17031();
            var10.method17025((double)var8, (double)var17, 0.0).method17027(1.0F, 0.0F).method17026(128, 128, 128, 255).method17031();
            var10.method17025((double)var7, (double)var17, 0.0).method17027(0.0F, 0.0F).method17026(128, 128, 128, 255).method17031();
            var9.method35410();
            var10.method17063(7, Class9337.field43346);
            var10.method17025((double)var7, (double)(var17 + var16 - 1), 0.0).method17027(0.0F, 1.0F).method17026(192, 192, 192, 255).method17031();
            var10.method17025((double)(var8 - 1), (double)(var17 + var16 - 1), 0.0).method17027(1.0F, 1.0F).method17026(192, 192, 192, 255).method17031();
            var10.method17025((double)(var8 - 1), (double)var17, 0.0).method17027(1.0F, 0.0F).method17026(192, 192, 192, 255).method17031();
            var10.method17025((double)var7, (double)var17, 0.0).method17027(0.0F, 0.0F).method17026(192, 192, 192, 255).method17031();
            var9.method35410();
         }

         this.method6156(var2, var3);
         RenderSystem.method27861();
         RenderSystem.method27866(7424);
         RenderSystem.disableAlphaTest();
         RenderSystem.disableBlend();
      }
   }

   public void method6165(double var1, double var3, int var5) {
      this.field6885 = var5 == 0 && var1 >= (double)this.method6170() && var1 < (double)(this.method6170() + 6);
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      this.method6165(var1, var3, var5);
      if (this.method6146() && this.method6162(var1, var3)) {
         int var8 = this.method6157(var1, var3);
         if (var8 == -1 && var5 == 0) {
            this.method6155(
               (int)(var1 - (double)(this.field6876 + this.field6871 / 2 - this.method6167() / 2)),
               (int)(var3 - (double)this.field6873) + (int)this.field6880 - 4
            );
            return true;
         } else if (var8 != -1 && this.method6148(var8, var5, var1, var3)) {
            if (this.method2468().size() > var8) {
               this.method5534(this.method2468().get(var8));
            }

            this.method5532(true);
            return true;
         } else {
            return this.field6885;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method2565(double var1, double var3, int var5) {
      if (this.method5533() != null) {
         this.method5533().method2565(var1, var3, var5);
      }

      return false;
   }

   @Override
   public boolean method2516(double var1, double var3, int var5, double var6, double var8) {
      if (!super.method2516(var1, var3, var5, var6, var8)) {
         if (this.method6146() && var5 == 0 && this.field6885) {
            if (!(var3 < (double)this.field6873)) {
               if (!(var3 > (double)this.field6874)) {
                  double var12 = (double)this.method6159();
                  if (var12 < 1.0) {
                     var12 = 1.0;
                  }

                  int var14 = (int)((float)((this.field6874 - this.field6873) * (this.field6874 - this.field6873)) / (float)this.method6150());
                  var14 = Class9679.method37775(var14, 32, this.field6874 - this.field6873 - 8);
                  double var15 = var12 / (double)(this.field6874 - this.field6873 - var14);
                  if (var15 < 1.0) {
                     var15 = 1.0;
                  }

                  this.field6880 += var8 * var15;
                  this.method6158();
               } else {
                  this.field6880 = (double)this.method6159();
               }
            } else {
               this.field6880 = 0.0;
            }

            return true;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public boolean method2649(double var1, double var3, double var5) {
      if (this.method6146()) {
         this.field6880 = this.field6880 - var5 * (double)this.field6877 / 2.0;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (this.method6146()) {
         if (!super.method1920(var1, var2, var3)) {
            if (var1 != 264) {
               if (var1 != 265) {
                  return false;
               } else {
                  this.method6166(-1);
                  return true;
               }
            } else {
               this.method6166(1);
               return true;
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public void method6166(int var1) {
   }

   @Override
   public boolean method1932(char var1, int var2) {
      return this.method6146() ? super.method1932(var1, var2) : false;
   }

   @Override
   public boolean method2485(double var1, double var3) {
      return this.method6162(var1, var3);
   }

   public int method6167() {
      return 220;
   }

   public void method6168(Class9332 var1, int var2, int var3, int var4, int var5, float var6) {
      int var9 = this.method6147();
      Class9352 var10 = Class9352.method35409();
      Class5425 var11 = var10.method35411();

      for (int var12 = 0; var12 < var9; var12++) {
         int var13 = var3 + var12 * this.field6877 + this.field6884;
         int var14 = this.field6877 - 4;
         if (var13 > this.field6874 || var13 + var14 < this.field6873) {
            this.method6152(var12, var2, var13, var6);
         }

         if (this.field6882 && this.method6149(var12)) {
            int var15 = this.field6876 + this.field6871 / 2 - this.method6167() / 2;
            int var16 = this.field6876 + this.field6871 / 2 + this.method6167() / 2;
            RenderSystem.method27862();
            float var17 = !this.method6169() ? 0.5F : 1.0F;
            RenderSystem.method27889(var17, var17, var17, 1.0F);
            var11.method17063(7, Class9337.field43341);
            var11.method17025((double)var15, (double)(var13 + var14 + 2), 0.0).method17031();
            var11.method17025((double)var16, (double)(var13 + var14 + 2), 0.0).method17031();
            var11.method17025((double)var16, (double)(var13 - 2), 0.0).method17031();
            var11.method17025((double)var15, (double)(var13 - 2), 0.0).method17031();
            var10.method35410();
            RenderSystem.method27889(0.0F, 0.0F, 0.0F, 1.0F);
            var11.method17063(7, Class9337.field43341);
            var11.method17025((double)(var15 + 1), (double)(var13 + var14 + 1), 0.0).method17031();
            var11.method17025((double)(var16 - 1), (double)(var13 + var14 + 1), 0.0).method17031();
            var11.method17025((double)(var16 - 1), (double)(var13 - 1), 0.0).method17031();
            var11.method17025((double)(var15 + 1), (double)(var13 - 1), 0.0).method17031();
            var10.method35410();
            RenderSystem.method27861();
         }

         if (var13 + this.field6877 >= this.field6873 && var13 <= this.field6874) {
            this.method6153(var1, var12, var2, var13, var14, var4, var5, var6);
         }
      }
   }

   public boolean method6169() {
      return false;
   }

   public int method6170() {
      return this.field6871 / 2 + 124;
   }

   public void method6171(int var1, int var2, int var3, int var4) {
      Class9352 var7 = Class9352.method35409();
      Class5425 var8 = var7.method35411();
      this.field6870.getTextureManager().bindTexture(Class1193.field6451);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      float var9 = 32.0F;
      var8.method17063(7, Class9337.field43346);
      var8.method17025((double)this.field6876, (double)var2, 0.0).method17027(0.0F, (float)var2 / 32.0F).method17026(64, 64, 64, var4).method17031();
      var8.method17025((double)(this.field6876 + this.field6871), (double)var2, 0.0)
         .method17027((float)this.field6871 / 32.0F, (float)var2 / 32.0F)
         .method17026(64, 64, 64, var4)
         .method17031();
      var8.method17025((double)(this.field6876 + this.field6871), (double)var1, 0.0)
         .method17027((float)this.field6871 / 32.0F, (float)var1 / 32.0F)
         .method17026(64, 64, 64, var3)
         .method17031();
      var8.method17025((double)this.field6876, (double)var1, 0.0).method17027(0.0F, (float)var1 / 32.0F).method17026(64, 64, 64, var3).method17031();
      var7.method35410();
   }

   public void method6172(int var1) {
      this.field6876 = var1;
      this.field6875 = var1 + this.field6871;
   }

   public int method6173() {
      return this.field6877;
   }
}