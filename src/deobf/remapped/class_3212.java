package remapped;

public class class_3212 implements Runnable {
   private static String[] field_16021;

   public class_3212(class_5298 var1, long var2, long var4, long var6, long var8, class_4330 var10) {
      this.field_16024 = var1;
      this.field_16022 = var2;
      this.field_16020 = var4;
      this.field_16025 = var6;
      this.field_16026 = var8;
      this.field_16023 = var10;
   }

   @Override
   public void run() {
      for (long var3 = this.field_16022; var3 < this.field_16020; var3++) {
         long var5 = 2L * var3;
         long var7 = this.field_16025 + (this.field_16026 - var5) % this.field_16026;
         this.field_16023.method_36123(var7, this.field_16023.method_36133(this.field_16025 + var5));
         this.field_16023.method_36123(var7 + 1L, -this.field_16023.method_36133(this.field_16025 + var5 + 1L));
      }
   }
}
