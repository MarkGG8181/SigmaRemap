package remapped;

public class class_1261 {
   private static String[] field_6944;
   public final class_3511 field_6947;
   private class_240 field_6948;
   private int field_6945;
   private int field_6946;

   private class_1261(class_4316 var1, class_3511 var2, class_240 var3, int var4) {
      this.field_6947 = var2;
      this.field_6948 = var3;
      this.field_6946 = var4;
   }

   public class_1261(class_3511 var1, class_240 var2, int var3) {
      this.field_6947 = var1;
      this.field_6948 = var2;
      this.field_6945 = var3;
   }

   public void method_5675(byte var1, class_240 var2) {
      this.field_6945 = this.field_6945 | var1 | 1 << this.field_6948.ordinal();
   }

   public boolean method_5673(class_240 var1) {
      return (this.field_6945 & 1 << var1.ordinal()) > 0;
   }

   private void method_5676(class_240 var1, int var2, int var3) {
      this.field_6948 = var1;
      this.field_6945 = var2;
      this.field_6946 = var3;
   }
}
