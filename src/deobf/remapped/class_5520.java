package remapped;

public class class_5520 extends class_9128 {
   private int field_28095;
   private boolean field_28094;

   public class_5520() {
      super(class_5664.field_28716, "LibreCraft", "A fly for LibreCraft");
      this.method_42010(new class_2748<Float>("Speed", "Fly speed", 4.0F, Float.class, 0.3F, 10.0F, 0.1F));
   }

   @Override
   public void method_42006() {
      this.field_28095 = 0;
      if (!field_46692.field_9577.field_45560.method_27060()) {
         if (!field_46692.field_9577.field_45560.method_27060()) {
            this.field_28094 = false;
         }
      } else {
         field_46692.field_9577.field_45560.field_30024 = false;
         this.field_28094 = true;
      }
   }

   @Override
   public void method_42020() {
      class_8865.method_40776(0.0);
      if (field_46692.field_9632.method_37098().field_7333 > 0.0) {
         class_314.method_1408(-0.0789);
      }
   }

   @class_9148
   private void method_25014(class_6435 var1) {
      if (this.method_42015()) {
         if (var1.method_29384() == field_46692.field_9577.field_45560.field_30027.field_17800) {
            var1.method_29715(true);
            this.field_28094 = true;
         }
      }
   }

   @class_9148
   private void method_25015(class_307 var1) {
      if (this.method_42015()) {
         if (var1.method_1364() == field_46692.field_9577.field_45560.field_30027.field_17800) {
            var1.method_29715(true);
            this.field_28094 = false;
         }
      }
   }

   @class_9148
   @class_7664
   public void method_25011(class_7767 var1) {
      if (this.method_42015()) {
         if (this.field_28095 <= 0) {
            if (this.field_28095 != -1) {
               if (this.field_28095 == 0) {
                  var1.method_35235(0.0);
                  class_314.method_1408(var1.method_35236());
                  class_8865.method_40777(var1, 0.35);
               }
            } else {
               var1.method_35235(0.299);
               class_314.method_1408(var1.method_35236());
               class_8865.method_40777(var1, (double)this.method_42002("Speed"));
            }
         } else {
            var1.method_35235(0.0);
            class_8865.method_40777(var1, 0.0);
         }
      }
   }

   @class_9148
   public void method_25012(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         this.field_28095++;
         if (this.field_28095 != 2) {
            if (this.field_28095 > 2) {
               if (this.field_28095 >= 20 && this.field_28095 % 20 == 0) {
                  var1.method_6455(0.1);
               } else {
                  var1.method_29715(true);
               }
            }
         } else {
            var1.method_6455(0.1);
         }

         var1.method_6444(true);
      }
   }

   @class_9148
   public void method_25013(class_139 var1) {
      if (this.method_42015()) {
         class_6310 var4 = var1.method_557();
         if (field_46692.field_9632 != null && var4 instanceof class_509) {
            class_509 var5 = (class_509)var4;
            if (this.field_28095 >= 1) {
               this.field_28095 = -1;
            }

            var5.field_3143 = field_46692.field_9632.field_41701;
            var5.field_3140 = field_46692.field_9632.field_41755;
         }
      }
   }
}