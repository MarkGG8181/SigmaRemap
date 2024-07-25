package remapped;

public class class_4211 extends class_9128 {
   private int field_20459;
   private double field_20458;

   public class_4211() {
      super(class_5664.field_28716, "Redesky", "Longjump for Redesky.");
      this.method_42010(new class_2748<Float>("Boost", "Longjump boost", 1.0F, Float.class, 0.1F, 1.0F, 0.01F));
      this.method_42010(new class_2748<Float>("Heigh", "Longjump heigh", 1.0F, Float.class, 0.1F, 1.0F, 0.01F));
      this.method_42010(new class_8563("NoFall", "Avoid taking fall damage", true));
   }

   @Override
   public void method_42020() {
   }

   @Override
   public void method_42006() {
      this.field_20459 = 0;
      this.field_20458 = 0.0;
   }

   @class_9148
   public void method_19581(class_7767 var1) {
      double var4 = Math.sqrt(var1.method_35234() * var1.method_35234() + var1.method_35231() * var1.method_35231());
      if (field_46692.field_9632.field_41726) {
         if (this.field_20459 > 0) {
            this.field_20459 = 0;
            if (this.method_42017().method_42007("Auto Disable")) {
               this.method_42017().method_41999();
               return;
            }
         } else {
            class_1331 var6 = new class_1331(
               field_46692.field_9632.method_37302(), field_46692.field_9632.method_37309() - 0.4, field_46692.field_9632.method_37156()
            );
            if (this.method_42017().method_42007("BorderJump") && !class_7494.method_34090(var6) && class_314.method_1434()
               || this.method_42017().method_42007("Auto Jump") && class_314.method_1434()
               || var1.method_35236() == class_8865.method_40786()) {
               this.field_20459 = 1;
               var1.method_35235(class_8865.method_40786());
               class_8865.method_40777(var1, 0.55);
            }
         }
      } else if (this.field_20459 > 0) {
         this.field_20459++;
         double var7 = var4;
         if (this.field_20459 < 10) {
            switch (this.field_20459) {
               case 2:
                  var7 = 0.7;
                  break;
               case 3:
                  var7 = 0.8;
                  break;
               case 4:
                  var7 = 0.9;
                  break;
               case 5:
                  var7 = 1.0;
                  break;
               case 6:
                  var7 = 1.1;
                  break;
               case 7:
                  var7 = 1.2;
                  break;
               case 8:
                  var7 = 1.3;
                  break;
               case 9:
                  var7 = 1.32;
            }

            class_8865.method_40777(var1, (double)this.method_42002("Boost") * var7);
            var1.method_35235((double)this.method_42002("Heigh") * class_8865.method_40786());
            this.field_20458 = 1.0;
         } else if (var1.method_35236() < 0.0 && field_46692.field_9632.field_41706 < 3.0F) {
            this.field_20458 = this.field_20458 - var1.method_35236();
         }
      }

      class_314.method_1408(var1.method_35236());
   }

   @class_9148
   public void method_19580(class_1393 var1) {
      if (this.method_42007("NoFall")) {
         if (this.field_20458 > 3.0) {
            var1.method_6451(true);
            this.field_20458 = 0.0;
         }
      }
   }
}