package remapped;

import java.util.List;
import java.util.function.Supplier;

public class class_6333 implements class_4885 {
   private static String[] field_32353;
   private final String field_32352;

   public class_6333(String var1) {
      this.field_32352 = var1;
   }

   @Override
   public void method_22411(class_8406 var1, List<class_8406> var2) {
      if (var1 instanceof CompoundNBT) {
         class_8406 var5 = ((CompoundNBT)var1).method_25929(this.field_32352);
         if (var5 != null) {
            var2.add(var5);
         }
      }
   }

   @Override
   public void method_22409(class_8406 var1, Supplier<class_8406> var2, List<class_8406> var3) {
      if (var1 instanceof CompoundNBT) {
         CompoundNBT var6 = (CompoundNBT)var1;
         class_8406 var7;
         if (!var6.method_25938(this.field_32352)) {
            var7 = (class_8406)var2.get();
            var6.put(this.field_32352, var7);
         } else {
            var7 = var6.method_25929(this.field_32352);
         }

         var3.add(var7);
      }
   }

   @Override
   public class_8406 method_22407() {
      return new CompoundNBT();
   }

   @Override
   public int method_22412(class_8406 var1, Supplier<class_8406> var2) {
      if (var1 instanceof CompoundNBT) {
         CompoundNBT var5 = (CompoundNBT)var1;
         class_8406 var6 = (class_8406)var2.get();
         class_8406 var7 = var5.put(this.field_32352, var6);
         if (!var6.equals(var7)) {
            return 1;
         }
      }

      return 0;
   }

   @Override
   public int method_22410(class_8406 var1) {
      if (var1 instanceof CompoundNBT) {
         CompoundNBT var4 = (CompoundNBT)var1;
         if (var4.method_25938(this.field_32352)) {
            var4.method_25959(this.field_32352);
            return 1;
         }
      }

      return 0;
   }
}
