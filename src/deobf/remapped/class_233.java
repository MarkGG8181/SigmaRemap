package remapped;

import java.util.OptionalInt;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;

public interface class_233 {
   void method_975(class_704 var1);

   @Nullable
   class_704 method_978();

   class_2795 method_974();

   void method_980(class_2795 var1);

   void method_981(class_8014 var1);

   void method_979(class_6098 var1);

   class_6486 method_972();

   int method_973();

   void method_984(int var1);

   boolean method_982();

   class_8461 method_976();

   default boolean method_983() {
      return false;
   }

   default void method_977(class_704 var1, ITextComponent var2, int var3) {
      OptionalInt var6 = var1.method_3152(new class_6872((var1x, var2x, var3x) -> new class_6415(var1x, var2x, this), var2));
      if (var6.isPresent()) {
         class_2795 var7 = this.method_974();
         if (!var7.isEmpty()) {
            var1.method_3169(var6.getAsInt(), var7, var3, this.method_973(), this.method_982(), this.method_983());
         }
      }
   }
}