package remapped;

public class class_5506 extends class_3599 {
   private static String[] field_28047;
   private final class_4612 field_28048;

   public class_5506(class_4612 var1) {
      this.field_28048 = var1;
   }

   @Override
   public boolean method_16795() {
      return this.field_28048.method_37360()
         && !this.field_28048.field_41768.method_28258(this.field_28048.method_37075()).method_22007(class_6503.field_33094);
   }

   @Override
   public void method_16796() {
      class_1331 var3 = null;

      for (class_1331 var5 : class_1331.method_6075(
         class_9299.method_42847(this.field_28048.method_37302() - 2.0),
         class_9299.method_42847(this.field_28048.method_37309() - 2.0),
         class_9299.method_42847(this.field_28048.method_37156() - 2.0),
         class_9299.method_42847(this.field_28048.method_37302() + 2.0),
         class_9299.method_42847(this.field_28048.method_37309()),
         class_9299.method_42847(this.field_28048.method_37156() + 2.0)
      )) {
         if (this.field_28048.field_41768.method_28258(var5).method_22007(class_6503.field_33094)) {
            var3 = var5;
            break;
         }
      }

      if (var3 != null) {
         this.field_28048.method_26905().method_12879((double)var3.method_12173(), (double)var3.method_12165(), (double)var3.method_12185(), 1.0);
      }
   }
}
