package remapped;

import java.util.EnumSet;

public class SwimGoal extends class_3599 {
   private static String[] field_4227;
   private final MobEntity field_4226;

   public SwimGoal(MobEntity var1) {
      this.field_4226 = var1;
      this.method_16800(EnumSet.<Flag>of(Flag.JUMP));
      var1.method_26927().method_5611(true);
   }

   @Override
   public boolean method_16795() {
      return this.field_4226.method_37285() && this.field_4226.method_37284(class_6503.field_33094) > this.field_4226.method_37108()
         || this.field_4226.method_37370();
   }

   @Override
   public void method_16794() {
      if (this.field_4226.method_26594().nextFloat() < 0.8F) {
         this.field_4226.method_26886().method_18772();
      }
   }
}