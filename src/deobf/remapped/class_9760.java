package remapped;

public class class_9760 extends class_9128 {
   private int field_49568;

   public class_9760() {
      super(class_5664.field_28714, "Spartan", "AntiKB for spartan antichet");
      this.method_42010(new class_2748<Float>("Ticks", "Ticks delay", 1.0F, Float.class, 1.0F, 6.0F, 1.0F));
   }

   @class_9148
   private void method_45041(class_5596 var1) {
      if (this.method_42015()) {
         if (this.field_49568 < 10) {
            this.field_49568++;
            if (this.field_49568 == (int)this.method_42002("Ticks")) {
               class_8865.method_40776(0.0);
            }
         }
      }
   }

   @class_9148
   private void method_45040(class_139 var1) {
      if (this.method_42015()) {
         if (field_46692.field_9632 != null && var1.method_557() instanceof class_4548) {
            class_4548 var4 = (class_4548)var1.method_557();
            if (var4.method_21093() == field_46692.field_9632.method_37145()) {
               this.field_49568 = 0;
            }
         }
      }
   }
}