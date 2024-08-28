package mapped;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class Class8038 extends Schema {
   public Class8038(int var1, Schema var2) {
      super(var1, var2);
   }

   public static void method27596(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> Class9674.method37738(var0));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var4 = super.registerEntities(var1);
      method27596(var1, var4, "ZombieVillager");
      method27596(var1, var4, "Husk");
      return var4;
   }
}
