package remapped;

public class class_7572 implements Runnable {
   private static String[] field_38585;

   public class_7572(class_3803 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field_38587 = var1;
      this.field_38583 = var2;
      this.field_38584 = var3;
      this.field_38588 = var4;
      this.field_38586 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_3803.method_17688(this.field_38587)];

      for (int var4 = this.field_38583; var4 < this.field_38584; var4++) {
         for (int var5 = 0; var5 < class_3803.method_17715(this.field_38587); var5++) {
            for (int var6 = 0; var6 < class_3803.method_17688(this.field_38587); var6++) {
               var3[var6] = this.field_38588[var6][var4][var5];
            }

            class_3803.method_17699(this.field_38587).method_17790(var3, this.field_38586);

            for (int var7 = 0; var7 < class_3803.method_17688(this.field_38587); var7++) {
               this.field_38588[var7][var4][var5] = var3[var7];
            }
         }
      }
   }
}
