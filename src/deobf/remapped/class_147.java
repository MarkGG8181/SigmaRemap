package remapped;

import java.util.function.Consumer;

public class class_147 {
   private static String[] field_422;
   private final class_1092 field_424;
   private int field_425 = -1;
   private Consumer<class_5734> field_423;

   public class_147(class_1092 var1) {
      this.field_424 = var1;
   }

   public boolean method_568(int var1, class_5734 var2) {
      if (this.field_425 == var1 && this.field_423 != null) {
         this.field_423.accept(var2);
         this.field_423 = null;
         return true;
      } else {
         return false;
      }
   }

   private int method_570(Consumer<class_5734> var1) {
      this.field_423 = var1;
      return ++this.field_425;
   }

   public void method_572(int var1, Consumer<class_5734> var2) {
      int var5 = this.method_570(var2);
      this.field_424.method_4813(new class_6187(var5, var1));
   }

   public void method_571(class_1331 var1, Consumer<class_5734> var2) {
      int var5 = this.method_570(var2);
      this.field_424.method_4813(new class_7825(var5, var1));
   }
}
