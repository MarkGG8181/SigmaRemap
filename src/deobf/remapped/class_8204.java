package remapped;

public class class_8204 extends class_9128 {
   public int field_41968 = -1;

   public class_8204() {
      super(class_5664.field_28712, "AutoTotem", "Automatically equips a totem in your second hand");
   }

   @class_9148
   private void method_37570(class_5596 var1) {
      this.method_37568();
   }

   @class_9148
   private void method_37569(class_1393 var1) {
      if (!var1.method_6449()) {
         this.method_37568();
      }
   }

   @Override
   public String method_41987() {
      return this.method_41992() + "";
   }

   private void method_37568() {
      if (this.method_42015() && field_46692.field_9632 != null && !field_46692.field_9632.field_3876.field_4944) {
         class_6098 var3 = field_46692.field_9632.method_26520(class_6943.field_35701);
         if (var3.method_27960() != class_4897.field_24472) {
            int var4 = class_2740.method_12318(class_4897.field_24472);
            if (var4 != -1) {
               field_46692.field_9647.method_42134(0, var4 >= 9 ? var4 : var4 + 36, 0, class_6269.field_32027, field_46692.field_9632);
               field_46692.field_9647.method_42134(0, 45, 0, class_6269.field_32027, field_46692.field_9632);
               field_46692.field_9647.method_42134(0, var4 >= 9 ? var4 : var4 + 36, 0, class_6269.field_32027, field_46692.field_9632);
            }
         }
      }
   }
}