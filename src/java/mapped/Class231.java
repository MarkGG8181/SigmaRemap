package mapped;

import java.util.Random;

public abstract class Class231<T extends Class880, M extends Class2894<T>> extends Class219<T, M> {
   public Class231(Class5712<T, M> var1) {
      super(var1);
   }

   public abstract int method835(T var1);

   public abstract void method836(Class9332 var1, Class7733 var2, int var3, Entity var4, float var5, float var6, float var7, float var8);

   public void method820(Class9332 var1, Class7733 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      int var13 = this.method835((T)var4);
      Random var14 = new Random((long)var4.method3205());
      if (var13 > 0) {
         for (int var15 = 0; var15 < var13; var15++) {
            var1.method35294();
            Class7219 var16 = this.method825().method11210(var14);
            Class9661 var17 = var16.method22685(var14);
            var16.method22682(var1);
            float var18 = var14.nextFloat();
            float var19 = var14.nextFloat();
            float var20 = var14.nextFloat();
            float var21 = Class9679.method37821(var18, var17.field45150, var17.field45153) / 16.0F;
            float var22 = Class9679.method37821(var19, var17.field45151, var17.field45154) / 16.0F;
            float var23 = Class9679.method37821(var20, var17.field45152, var17.field45155) / 16.0F;
            var1.method35291((double)var21, (double)var22, (double)var23);
            var18 = -1.0F * (var18 * 2.0F - 1.0F);
            var19 = -1.0F * (var19 * 2.0F - 1.0F);
            var20 = -1.0F * (var20 * 2.0F - 1.0F);
            this.method836(var1, var2, var3, var4, var18, var19, var20, var7);
            var1.method35295();
         }
      }
   }
}