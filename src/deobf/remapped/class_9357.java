package remapped;

public class class_9357 extends class_9128 {
   private float field_47767;
   private boolean field_47768;

   public class_9357() {
      super(class_5664.field_28718, "Weather", "Removes rain and changes the world's time");
      this.method_42010(new class_8563("Custom time", "Set the world time", true));
      this.method_42010(new class_2748<Float>("Time", "Time to set the world to", 12000.0F, Float.class, 0.0F, 24000.0F, 1.0F).method_23029(var1 -> {
         if (this.method_42007("Custom time") && this.method_42015()) {
            field_46692.field_9601.method_719(-((long)this.method_42002("Time")));
         }
      }));
      this.method_42010(new class_8563("Disable rain", "Disable rain", true));
   }

   @Override
   public void method_42006() {
      this.field_47767 = field_46692.field_9601.method_29578(1.0F);
      if (field_46692.field_9601.method_29578(1.0F) != 1.0F) {
         if (field_46692.field_9601.method_29578(1.0F) == 0.0F) {
            this.field_47768 = false;
         }
      } else {
         this.field_47768 = true;
      }

      field_46692.field_9601.method_719((long)this.method_42002("Time"));
   }

   @class_9148
   private void method_43220(class_5596 var1) {
      if (this.method_42015()) {
         if (!this.method_42007("Disable rain")) {
            if (this.field_47768) {
               if (!(this.field_47767 < 1.0F)) {
                  if (this.field_47767 > 1.0F) {
                     this.field_47767 = 1.0F;
                  }
               } else {
                  this.field_47767 = (float)((double)this.field_47767 + 0.05);
               }
            }
         } else if (!(this.field_47767 > 0.0F)) {
            if (this.field_47767 < 0.0F) {
               this.field_47767 = 0.0F;
            }
         } else {
            this.field_47767 = (float)((double)this.field_47767 - 0.05);
         }

         field_46692.field_9601.method_29582(this.field_47767);
         field_46692.field_9601.method_29560(this.field_47767);
      }
   }

   @class_9148
   private void method_43219(class_139 var1) {
      if (this.method_42015()) {
         if (!(var1.method_557() instanceof class_8508)) {
            if (var1.method_557() instanceof class_2161) {
               class_2161 var4 = (class_2161)var1.method_557();
               if (var4.method_10056().field_41885 == 7) {
                  if (var4.method_10055() != 1.0F) {
                     if (var4.method_10055() == 0.0F) {
                        this.field_47768 = false;
                     }
                  } else {
                     this.field_47768 = true;
                  }

                  if (!this.method_42007("Disable rain")) {
                     this.field_47767 = var4.method_10055();
                  } else {
                     var1.method_556(new class_2161(var4.method_10056(), 0.0F));
                     this.field_47767 = 0.0F;
                  }
               }
            }
         } else if (this.method_42007("Custom time")) {
            var1.method_556(new class_8508(-((long)this.method_42002("Time")), -((long)this.method_42002("Time")), true));
         }
      }
   }
}
