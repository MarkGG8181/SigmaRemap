package remapped;

public class class_6318 extends class_2451 {
   private static String[] field_32267;

   public class_6318(class_317 var1) {
      super(var1);
   }

   @Override
   public class_6098 method_11242(class_6098 var1, class_6486 var2, class_5834 var3) {
      super.method_11242(var1, var2, var3);
      if (var3 instanceof class_9359) {
         class_9359 var6 = (class_9359)var3;
         class_8807.field_45081.method_43401(var6, var1);
         var6.method_3211(class_6234.field_31907.method_43790(this));
      }

      if (!var2.field_33055) {
         var3.method_26607(class_4054.field_19718);
      }

      if (!var1.method_28022()) {
         if (var3 instanceof class_704 && !((class_704)var3).field_3876.field_4944) {
            class_6098 var8 = new class_6098(class_4897.field_24812);
            class_704 var7 = (class_704)var3;
            if (!var7.field_3853.method_32414(var8)) {
               var7.method_3153(var8, false);
            }
         }

         return var1;
      } else {
         return new class_6098(class_4897.field_24812);
      }
   }

   @Override
   public int method_11230(class_6098 var1) {
      return 40;
   }

   @Override
   public class_6209 method_11233(class_6098 var1) {
      return class_6209.field_31739;
   }

   @Override
   public class_8461 method_11253() {
      return class_463.field_2175;
   }

   @Override
   public class_8461 method_11243() {
      return class_463.field_2175;
   }

   @Override
   public class_954<class_6098> method_11231(class_6486 var1, class_704 var2, class_2584 var3) {
      return class_4754.method_21939(var1, var2, var3);
   }
}