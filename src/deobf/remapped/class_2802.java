package remapped;

public class class_2802 implements Runnable {
   private static String[] field_13764;

   public class_2802(class_2841 var1, long var2, long var4, class_4330 var6, boolean var7) {
      this.field_13762 = var1;
      this.field_13759 = var2;
      this.field_13760 = var4;
      this.field_13761 = var6;
      this.field_13763 = var7;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(class_2841.method_12907(this.field_13762), false);

      for (long var4 = this.field_13759; var4 < this.field_13760; var4++) {
         long var6 = var4 * class_2841.method_12927(this.field_13762);

         for (long var8 = 0L; var8 < class_2841.method_12932(this.field_13762); var8++) {
            for (long var10 = 0L; var10 < class_2841.method_12907(this.field_13762); var10++) {
               long var12 = var10 * class_2841.method_12906(this.field_13762) + var6 + var8;
               var3.method_36123(var10, this.field_13761.method_36133(var12));
            }

            class_2841.method_12933(this.field_13762).method_21138(var3, this.field_13763);

            for (long var14 = 0L; var14 < class_2841.method_12907(this.field_13762); var14++) {
               long var15 = var14 * class_2841.method_12906(this.field_13762) + var6 + var8;
               this.field_13761.method_36123(var15, var3.method_36133(var14));
            }
         }
      }
   }
}