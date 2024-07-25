package remapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class class_3817 {
   private final int field_18679;
   private final long field_18676;
   private final class_5298 field_18677;
   private final boolean field_18678;

   public class_3817(long var1) {
      this.field_18679 = (int)var1;
      this.field_18676 = var1;
      this.field_18678 = class_2751.method_12427() || var1 > (long)class_7975.method_36102();
      this.field_18677 = new class_5298(var1);
   }

   public void method_17785(float[] var1) {
      this.method_17786(var1, 0);
   }

   public void method_17783(class_4330 var1) {
      this.method_17784(var1, 0L);
   }

   public void method_17786(float[] var1, int var2) {
      if (this.field_18679 != 1) {
         if (this.field_18678) {
            this.method_17784(new class_4330(var1), (long)var2);
         } else {
            this.field_18677.method_24205(var1, var2);
            float[] var5 = new float[this.field_18679];
            System.arraycopy(var1, var2, var5, 0, this.field_18679);
            int var6 = this.field_18679 / 2;
            int var7 = class_1266.method_5693();
            if (var7 > 1 && (long)var6 > class_2751.method_12448()) {
               byte var15 = 2;
               int var16 = var6 / var15;
               Future[] var17 = new Future[var15];

               for (int var18 = 0; var18 < var15; var18++) {
                  int var11 = 1 + var18 * var16;
                  int var12 = var18 == var15 - 1 ? var6 : var11 + var16;
                  var17[var18] = class_1266.method_5694(new class_3617(this, var11, var12, var1, var2, var5));
               }

               try {
                  class_1266.method_5696(var17);
               } catch (InterruptedException var13) {
                  Logger.getLogger(class_3817.class.getName()).log(Level.SEVERE, null, var13);
               } catch (ExecutionException var14) {
                  Logger.getLogger(class_3817.class.getName()).log(Level.SEVERE, null, var14);
               }
            } else {
               for (int var10 = 1; var10 < var6; var10++) {
                  int var8 = 2 * var10;
                  int var9 = var8 + 1;
                  var1[var2 + var10] = var5[var8] - var5[var9];
                  var1[var2 + this.field_18679 - var10] = var5[var8] + var5[var9];
               }
            }

            if (this.field_18679 % 2 == 0) {
               var1[var2 + var6] = var5[1];
            } else {
               var1[var2 + var6] = var5[this.field_18679 - 1] - var5[1];
               var1[var2 + var6 + 1] = var5[this.field_18679 - 1] + var5[1];
            }
         }
      }
   }

   public void method_17784(class_4330 var1, long var2) {
      if (this.field_18676 != 1L) {
         if (!this.field_18678) {
            if (var1.method_36106() || var1.method_36112() || var2 >= 2147483647L) {
               throw new IllegalArgumentException("The data array is too big.");
            }

            this.method_17786(var1.method_20155(), (int)var2);
         } else {
            this.field_18677.method_24203(var1, var2);
            class_4330 var6 = new class_4330(this.field_18676, false);
            class_3685.method_17117(var1, var2, var6, 0L, this.field_18676);
            long var7 = this.field_18676 / 2L;
            int var9 = class_1266.method_5693();
            if (var9 > 1 && var7 > class_2751.method_12448()) {
               byte var22 = 2;
               long var23 = var7 / (long)var22;
               Future[] var12 = new Future[var22];

               for (int var13 = 0; var13 < var22; var13++) {
                  long var24 = 1L + (long)var13 * var23;
                  long var16 = var13 == var22 - 1 ? var7 : var24 + var23;
                  var12[var13] = class_1266.method_5694(new class_2720(this, var24, var16, var1, var2, var6));
               }

               try {
                  class_1266.method_5696(var12);
               } catch (InterruptedException var20) {
                  Logger.getLogger(class_3817.class.getName()).log(Level.SEVERE, null, var20);
               } catch (ExecutionException var21) {
                  Logger.getLogger(class_3817.class.getName()).log(Level.SEVERE, null, var21);
               }
            } else {
               for (long var14 = 1L; var14 < var7; var14++) {
                  long var10 = 2L * var14;
                  long var18 = var10 + 1L;
                  var1.method_36123(var2 + var14, var6.method_36133(var10) - var6.method_36133(var18));
                  var1.method_36123(var2 + this.field_18676 - var14, var6.method_36133(var10) + var6.method_36133(var18));
               }
            }

            if (this.field_18676 % 2L == 0L) {
               var1.method_36123(var2 + var7, var6.method_36133(1L));
            } else {
               var1.method_36123(var2 + var7, var6.method_36133(this.field_18676 - 1L) - var6.method_36133(1L));
               var1.method_36123(var2 + var7 + 1L, var6.method_36133(this.field_18676 - 1L) + var6.method_36133(1L));
            }
         }
      }
   }

   public void method_17790(float[] var1, boolean var2) {
      this.method_17789(var1, 0, var2);
   }

   public void method_17788(class_4330 var1, boolean var2) {
      this.method_17787(var1, 0L, var2);
   }

   public void method_17789(float[] var1, int var2, boolean var3) {
      if (this.field_18679 != 1) {
         if (!this.field_18678) {
            this.method_17786(var1, var2);
            if (var3) {
               class_2751.method_12445(this.field_18679, 1.0F / (float)this.field_18679, var1, var2, false);
            }
         } else {
            this.method_17787(new class_4330(var1), (long)var2, var3);
         }
      }
   }

   public void method_17787(class_4330 var1, long var2, boolean var4) {
      if (this.field_18679 != 1) {
         if (this.field_18678) {
            this.method_17784(var1, var2);
            if (var4) {
               class_2751.method_12447((long)this.field_18679, 1.0F / (float)this.field_18679, var1, var2, false);
            }
         } else {
            if (var1.method_36106() || var1.method_36112() || var2 >= 2147483647L) {
               throw new IllegalArgumentException("The data array is too big.");
            }

            this.method_17789(var1.method_20155(), (int)var2, var4);
         }
      }
   }
}