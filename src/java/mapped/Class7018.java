package mapped;

import java.util.Random;

public class Class7018 implements Class7016 {
   private static String[] field30319;
   private int field30320;

   @Override
   public int method21742(Class1657 var1, boolean var2, boolean var3) {
      if (!var2) {
         return 0;
      } else if (var1.method6789().method17135(Class5462.field24252)) {
         Random var6 = var1.field9016;
         this.field30320--;
         if (this.field30320 > 0) {
            return 0;
         } else {
            this.field30320 = this.field30320 + 12000 + var6.nextInt(1200);
            long var7 = var1.method6784() / 24000L;
            if (var7 < 5L || !var1.method6740()) {
               return 0;
            } else if (var6.nextInt(5) != 0) {
               return 0;
            } else {
               int var9 = var1.method6870().size();
               if (var9 < 1) {
                  return 0;
               } else {
                  PlayerEntity var10 = var1.method6870().get(var6.nextInt(var9));
                  if (var10.method2800()) {
                     return 0;
                  } else if (var1.method6954(var10.method3432(), 2)) {
                     return 0;
                  } else {
                     int var11 = (24 + var6.nextInt(24)) * (!var6.nextBoolean() ? 1 : -1);
                     int var12 = (24 + var6.nextInt(24)) * (!var6.nextBoolean() ? 1 : -1);
                     Mutable var13 = var10.method3432().method8354().method8381(var11, 0, var12);
                     if (!var1.method7019(
                        var13.method8304() - 10,
                        var13.getY() - 10,
                        var13.method8306() - 10,
                        var13.method8304() + 10,
                        var13.getY() + 10,
                        var13.method8306() + 10
                     )) {
                        return 0;
                     } else {
                        Class8907 var14 = var1.method7003(var13);
                        Class100 var15 = var14.method32527();
                        if (var15 == Class100.field289) {
                           return 0;
                        } else {
                           int var16 = 0;
                           int var17 = (int)Math.ceil((double)var1.method6807(var13).method38328()) + 1;

                           for (int var18 = 0; var18 < var17; var18++) {
                              var16++;
                              var13.method8308(var1.method7006(Class101.field300, var13).getY());
                              if (var18 != 0) {
                                 this.method21749(var1, var13, var6, false);
                              } else if (!this.method21749(var1, var13, var6, true)) {
                                 break;
                              }

                              var13.method8307(var13.method8304() + var6.nextInt(5) - var6.nextInt(5));
                              var13.method8309(var13.method8306() + var6.nextInt(5) - var6.nextInt(5));
                           }

                           return var16;
                        }
                     }
                  }
               }
            }
         }
      } else {
         return 0;
      }
   }

   private boolean method21749(Class1657 var1, BlockPos var2, Random var3, boolean var4) {
      Class7380 var7 = var1.method6738(var2);
      if (Class8170.method28428(var1, var2, var7, var7.method23449(), Class8992.field41067)) {
         if (Class1028.method4572(Class8992.field41067, var1, Class2202.field14406, var2, var3)) {
            Class1028 var8 = Class8992.field41067.method33215(var1);
            if (var8 == null) {
               return false;
            } else {
               if (var4) {
                  var8.method4576(true);
                  var8.method4578();
               }

               var8.method3215((double)var2.method8304(), (double)var2.getY(), (double)var2.method8306());
               var8.method4276(var1, var1.method6807(var2), Class2202.field14406, (Class5093)null, (Class39)null);
               var1.method6995(var8);
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}