package remapped;

public class class_5946 implements Runnable {
   private static String[] field_30323;

   public class_5946(class_84 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_30328 = var1;
      this.field_30324 = var2;
      this.field_30326 = var3;
      this.field_30327 = var4;
      this.field_30325 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_84.method_200(this.field_30328)];

      for (int var4 = this.field_30324; var4 < this.field_30326; var4++) {
         int var5 = var4 * class_84.method_180(this.field_30328);

         for (int var6 = 0; var6 < class_84.method_198(this.field_30328); var6++) {
            for (int var7 = 0; var7 < class_84.method_200(this.field_30328); var7++) {
               int var8 = var5 + var7 * class_84.method_188(this.field_30328) + var6;
               var3[var7] = this.field_30327[var8];
            }

            class_84.method_189(this.field_30328).method_31289(var3, this.field_30325);

            for (int var9 = 0; var9 < class_84.method_200(this.field_30328); var9++) {
               int var10 = var5 + var9 * class_84.method_188(this.field_30328) + var6;
               this.field_30327[var10] = var3[var9];
            }
         }
      }
   }
}
