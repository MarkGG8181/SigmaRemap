package remapped;

import java.util.function.Predicate;

public class class_2293 implements Predicate<class_6098> {
   private static String[] field_11459;
   private final class_2451 field_11458;
   private final class_5734 field_11460;

   public class_2293(class_2451 var1, class_5734 var2) {
      this.field_11458 = var1;
      this.field_11460 = var2;
   }

   public boolean test(class_6098 var1) {
      return var1.method_27960() == this.field_11458 && class_4338.method_20182(this.field_11460, var1.method_27990(), true);
   }
}