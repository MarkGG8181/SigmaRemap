package mapped;

import java.util.List;

public class Class5947 extends Class5942<Class954> {
   private static String[] field25937;
   private final Class2848 field25938 = new Class2848();
   private static double field25939 = 4096.0;

   public Class5947(Class8086 var1) {
      super(var1);
   }

   public void method18462(Class954 var1, float var2, Class9332 var3, Class7733 var4, int var5, int var6) {
      Class7380 var9 = var1.method3775();
      var3.method35294();
      float var10 = 0.6666667F;
      if (!(var9.method23383() instanceof Class3374)) {
         var3.method35291(0.5, 0.5, 0.5);
         float var11 = -var9.<Direction>method23463(Class3375.field18972).method551();
         var3.method35293(Class7680.field32900.method25286(var11));
         var3.method35291(0.0, -0.3125, -0.4375);
         this.field25938.field17651.field31039 = false;
      } else {
         var3.method35291(0.5, 0.5, 0.5);
         float var26 = -((float)(var9.<Integer>method23463(Class3374.field18970) * 360) / 16.0F);
         var3.method35293(Class7680.field32900.method25286(var26));
         this.field25938.field17651.field31039 = true;
      }

      var3.method35294();
      var3.method35292(0.6666667F, -0.6666667F, -0.6666667F);
      Class7826 var27 = method18473(var9.method23383());
      Class5422 var12 = var27.method26200(var4, this.field25938::method11028);
      this.field25938.field17650.method22680(var3, var12, var5, var6);
      this.field25938.field17651.method22680(var3, var12, var5, var6);
      var3.method35295();
      if (method18474(var1)) {
         Class9834 var13 = this.field25928.method27967();
         float var14 = 0.010416667F;
         var3.method35291(0.0, 0.33333334F, 0.046666667F);
         var3.method35292(0.010416667F, -0.010416667F, 0.010416667F);
         int var15 = var1.method3844().method314();
         if (Class7944.method26911()) {
            var15 = Class9680.method37900(var15);
         }

         double var16 = 0.4;
         int var18 = (int)((double)Class1806.method7911(var15) * 0.4);
         int var19 = (int)((double)Class1806.method7912(var15) * 0.4);
         int var20 = (int)((double)Class1806.method7913(var15) * 0.4);
         int var21 = Class1806.method7914(0, var20, var19, var18);
         byte var22 = 20;

         for (int var23 = 0; var23 < 4; var23++) {
            Class9125 var24 = var1.method3837(var23, var1x -> {
               List var4x = var13.method38828(var1x, 90);
               return !var4x.isEmpty() ? (Class9125)var4x.get(0) : Class9125.field41930;
            });
            if (var24 != null) {
               float var25 = (float)(-var13.method38822(var24) / 2);
               var13.method38813(var24, var25, (float)(var23 * 10 - 20), var21, false, var3.method35296().method32361(), var4, false, 0, var5);
            }
         }
      }

      var3.method35295();
   }

   public static Class7826 method18473(Block var0) {
      Class9673 var3;
      if (!(var0 instanceof Class3373)) {
         var3 = Class9673.field45166;
      } else {
         var3 = ((Class3373)var0).method11967();
      }

      return Class8624.method30911(var3);
   }

   private static boolean method18474(Class954 var0) {
      if (!Class8981.field40609) {
         if (!Class7944.field34162) {
            BlockPos var3 = var0.method3774();
            Entity var4 = Minecraft.getInstance().method1550();
            double var5 = var4.method3276((double)var3.method8304(), (double)var3.getY(), (double)var3.method8306());
            if (var5 > field25939) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static void method18475() {
      Minecraft var2 = Minecraft.getInstance();
      double var3 = Class7944.method26833(var2.field1299.field44669, 1.0, 120.0);
      double var5 = Math.max(1.5 * (double)var2.method1580().method8044() / var3, 16.0);
      field25939 = var5 * var5;
   }
}