package remapped;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class_9421 extends class_5178 {
   public class_9421(int var1, Schema var2) {
      super(var1, var2);
   }

   public static void method_43614(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> class_9276.method_42737(var0));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var4 = super.registerEntities(var1);
      var4.remove("minecraft:zombie_pigman");
      method_43614(var1, var4, "minecraft:zombified_piglin");
      return var4;
   }
}
