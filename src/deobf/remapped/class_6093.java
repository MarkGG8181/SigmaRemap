package remapped;

public class class_6093 extends class_3429 {
   private static String[] field_31181;

   public class_6093(class_6629<? extends class_6093> var1, class_6486 var2) {
      super(var1, var2);
   }

   public class_6093(class_6486 var1, class_5834 var2) {
      super(class_6629.field_34219, var2, var1);
   }

   public class_6093(class_6486 var1, double var2, double var4, double var6) {
      super(class_6629.field_34219, var2, var4, var6, var1);
   }

   @Override
   public class_2451 method_15854() {
      return class_4897.field_24623;
   }

   @Override
   public float method_43874() {
      return 0.07F;
   }

   @Override
   public void method_26160(class_7474 var1) {
      super.method_26160(var1);
      if (!this.field_41768.field_33055) {
         this.field_41768.method_43364(2002, this.method_37075(), class_9541.method_44000(class_3697.field_18108));
         int var4 = 3 + this.field_41768.field_33033.nextInt(5) + this.field_41768.field_33033.nextInt(5);

         while (var4 > 0) {
            int var5 = class_5614.method_25476(var4);
            var4 -= var5;
            this.field_41768.method_7509(new class_5614(this.field_41768, this.method_37302(), this.method_37309(), this.method_37156(), var5));
         }

         this.method_37204();
      }
   }
}