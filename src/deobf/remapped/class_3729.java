package remapped;

import java.util.Random;

public class class_3729 extends class_7067<class_900> {
   private static String[] field_18242;

   public class_3729(class_6122 var1) {
      super(var1);
   }

   public void method_17281(class_900 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      float[] var9 = new float[8];
      float[] var10 = new float[8];
      float var11 = 0.0F;
      float var12 = 0.0F;
      Random var13 = new Random(var1.field_4618);

      for (int var14 = 7; var14 >= 0; var14--) {
         var9[var14] = var11;
         var10[var14] = var12;
         var11 += (float)(var13.nextInt(11) - 5);
         var12 += (float)(var13.nextInt(11) - 5);
      }

      class_7907 var32 = var5.method_11645(class_3581.method_16714());
      class_8107 var15 = var4.method_36058().method_28620();

      for (int var16 = 0; var16 < 4; var16++) {
         Random var17 = new Random(var1.field_4618);

         for (int var18 = 0; var18 < 3; var18++) {
            int var19 = 7;
            int var20 = 0;
            if (var18 > 0) {
               var19 = 7 - var18;
            }

            if (var18 > 0) {
               var20 = var19 - 2;
            }

            float var21 = var9[var19] - var11;
            float var22 = var10[var19] - var12;

            for (int var23 = var19; var23 >= var20; var23--) {
               float var24 = var21;
               float var25 = var22;
               if (var18 != 0) {
                  var21 += (float)(var17.nextInt(31) - 15);
                  var22 += (float)(var17.nextInt(31) - 15);
               } else {
                  var21 += (float)(var17.nextInt(11) - 5);
                  var22 += (float)(var17.nextInt(11) - 5);
               }

               float var26 = 0.5F;
               float var27 = 0.45F;
               float var28 = 0.45F;
               float var29 = 0.5F;
               float var30 = 0.1F + (float)var16 * 0.2F;
               if (var18 == 0) {
                  var30 = (float)((double)var30 * ((double)var23 * 0.1 + 1.0));
               }

               float var31 = 0.1F + (float)var16 * 0.2F;
               if (var18 == 0) {
                  var31 *= (float)(var23 - 1) * 0.1F + 1.0F;
               }

               method_17279(var15, var32, var21, var22, var23, var24, var25, 0.45F, 0.45F, 0.5F, var30, var31, false, false, true, false);
               method_17279(var15, var32, var21, var22, var23, var24, var25, 0.45F, 0.45F, 0.5F, var30, var31, true, false, true, true);
               method_17279(var15, var32, var21, var22, var23, var24, var25, 0.45F, 0.45F, 0.5F, var30, var31, true, true, false, true);
               method_17279(var15, var32, var21, var22, var23, var24, var25, 0.45F, 0.45F, 0.5F, var30, var31, false, true, false, false);
            }
         }
      }
   }

   private static void method_17279(
      class_8107 var0,
      class_7907 var1,
      float var2,
      float var3,
      int var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      boolean var12,
      boolean var13,
      boolean var14,
      boolean var15
   ) {
      var1.method_35762(var0, var2 + (!var12 ? -var11 : var11), (float)(var4 * 16), var3 + (!var13 ? -var11 : var11))
         .method_35742(var7, var8, var9, 0.3F)
         .method_35735();
      var1.method_35762(var0, var5 + (!var12 ? -var10 : var10), (float)((var4 + 1) * 16), var6 + (!var13 ? -var10 : var10))
         .method_35742(var7, var8, var9, 0.3F)
         .method_35735();
      var1.method_35762(var0, var5 + (!var14 ? -var10 : var10), (float)((var4 + 1) * 16), var6 + (!var15 ? -var10 : var10))
         .method_35742(var7, var8, var9, 0.3F)
         .method_35735();
      var1.method_35762(var0, var2 + (!var14 ? -var11 : var11), (float)(var4 * 16), var3 + (!var15 ? -var11 : var11))
         .method_35742(var7, var8, var9, 0.3F)
         .method_35735();
   }

   public class_4639 method_17280(class_900 var1) {
      return class_8359.field_42824;
   }
}
