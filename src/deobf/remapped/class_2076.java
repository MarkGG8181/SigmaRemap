package remapped;

public class class_2076 extends class_367 {
   private int field_10453;
   private class_3223 field_10449 = new class_3223();
   private class_3223 field_10450 = new class_3223();
   private boolean field_10452;

   public class_2076() {
      super("Cubecraft2", "A fly for 1.9+ cubecraft", class_5664.field_28716);
   }

   @Override
   public void method_42006() {
      this.field_10453 = 0;
      if (!field_46692.field_9577.field_45560.method_27060()) {
         this.field_10452 = false;
      } else {
         field_46692.field_9577.field_45560.field_30024 = false;
         this.field_10452 = true;
      }

      if (class_314.method_1392() && class_3347.method_15349() == class_412.field_1747.method_2055()) {
         SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("Cubecraft2 fly", "This fly was made for 1.9+ only"));
      }

      this.field_10450.method_14774();
      this.field_10450.method_14773();
   }

   @Override
   public void method_42020() {
      class_8865.method_40776(0.2);
      class_314.method_1408(-0.0789);
      if (class_314.method_1413(field_46692.field_9632, 0.001F)) {
         class_8865.method_40776(0.0);
         class_314.method_1408(-0.0789);
      } else {
         double var3 = field_46692.field_9632.method_37302();
         double var5 = field_46692.field_9632.method_37309();
         double var7 = field_46692.field_9632.method_37156();
         field_46692.method_8614().method_4813(new class_9515(var3, -150.0, var7, false));
         class_8865.method_40776(0.0);
         class_314.method_1408(0.0);
         this.field_10453 = -3;
         this.field_10449.method_14773();
         this.field_10449.method_14776();
      }
   }

   @class_9148
   private void method_9689(class_6435 var1) {
      if (this.method_42015()) {
         if (var1.method_29384() == field_46692.field_9577.field_45560.field_30027.field_17800) {
            var1.method_29715(true);
            this.field_10452 = true;
         }
      }
   }

   @class_9148
   private void method_9690(class_307 var1) {
      if (this.method_42015()) {
         if (var1.method_1364() == field_46692.field_9577.field_45560.field_30027.field_17800) {
            var1.method_29715(true);
            this.field_10452 = false;
         }
      }
   }

   @class_9148
   @class_7664
   public void method_9687(class_7767 var1) {
      if (this.method_42015()) {
         this.field_10453++;
         if (this.field_10453 != 1) {
            if (this.field_10453 != 2) {
               var1.method_35235(0.0);
               class_8865.method_40777(var1, 0.0);
            } else {
               var1.method_35235(-9.999999999E-5);
               class_8865.method_40777(var1, 0.28);
            }
         } else {
            var1.method_35235(!field_46692.field_9577.field_45450.method_27060() ? (!this.field_10452 ? 1.0E-4 : -0.99) : (!this.field_10452 ? 0.99 : 1.0E-4));
            class_8865.method_40777(
               var1, !field_46692.field_9577.field_45450.method_27060() ? (!this.field_10452 ? 3.7 : 2.8) : (!this.field_10452 ? 2.8 : 3.7)
            );
         }

         class_314.method_1408(var1.method_35236());
      } else {
         if (this.field_10453 < 0) {
            if (this.field_10453 != -3) {
               if (this.field_10453 != -2) {
                  if (this.field_10453 == -1) {
                     this.field_10453++;
                     var1.method_35235(-0.4);
                     class_8865.method_40777(var1, 0.0);
                  }
               } else {
                  var1.method_35235(0.4);
                  this.field_10453++;
                  class_8865.method_40777(var1, 0.0);
               }
            } else {
               if (this.field_10449.method_14772() > 1000L) {
                  this.field_10453++;
                  this.field_10449.method_14773();
                  this.field_10449.method_14774();
               }

               var1.method_35235(0.0);
               class_8865.method_40777(var1, 0.0);
            }
         }
      }
   }

   @class_9148
   public void method_9691(class_1393 var1) {
      if (this.field_10453 == -3) {
         var1.method_29715(true);
      }

      if (this.method_42015() && var1.method_6449()) {
         var1.method_6444(true);
         var1.method_6451(true);
         if (this.field_10453 != 3) {
            if (this.field_10453 > 3) {
               if (this.field_10450.method_14771() && this.field_10450.method_14772() > 2000L) {
                  var1.method_6455(-150.0);
                  this.field_10450.method_14773();
               } else {
                  var1.method_29715(true);
               }
            }
         } else {
            var1.method_6455(-150.0);
            this.field_10450.method_14776();
         }
      }
   }

   @class_9148
   public void method_9688(class_139 var1) {
      if (this.method_42015() || this.field_10453 < 0) {
         class_6310 var4 = var1.method_557();
         if (var4 instanceof class_509) {
            class_509 var5 = (class_509)var4;
            var5.field_3143 = field_46692.field_9632.field_41701;
            var5.field_3140 = field_46692.field_9632.field_41755;
            this.field_10450.method_14773();
            this.field_10450.method_14774();
            if (this.field_10453 != -3) {
               this.field_10453 = 0;
            } else {
               this.field_10453++;
            }
         }
      }
   }
}