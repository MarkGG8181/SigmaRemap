package remapped;

import java.util.Comparator;

public class class_3896 implements Comparator<class_9128> {
   private static String[] field_18953;

   public class_3896(class_4221 var1) {
      this.field_18954 = var1;
   }

   public int compare(class_9128 var1, class_9128 var2) {
      if (class_4221.method_19658(this.field_18954, var1) <= class_4221.method_19658(this.field_18954, var2)) {
         return class_4221.method_19658(this.field_18954, var1) >= class_4221.method_19658(this.field_18954, var2)
            ? var1.method_41987().compareTo(var2.method_41987())
            : 1;
      } else {
         return -1;
      }
   }
}