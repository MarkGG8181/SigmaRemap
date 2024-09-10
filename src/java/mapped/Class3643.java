package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class Class3643 extends Class3639 {
   public Class3643(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var4 = super.registerEntities(var1);
      var1.register(
         var4,
         "minecraft:wandering_trader",
         var1x -> DSL.optionalFields(
               "Inventory",
               DSL.list(TypeReferences.field35387.in(var1)),
               "Offers",
               DSL.optionalFields(
                  "Recipes",
                  DSL.list(
                     DSL.optionalFields("buy", TypeReferences.field35387.in(var1), "buyB", TypeReferences.field35387.in(var1), "sell", TypeReferences.field35387.in(var1))
                  )
               ),
               Class9674.method37738(var1)
            )
      );
      var1.register(
         var4,
         "minecraft:trader_llama",
         var1x -> DSL.optionalFields(
               "Items",
               DSL.list(TypeReferences.field35387.in(var1)),
               "SaddleItem",
               TypeReferences.field35387.in(var1),
               "DecorItem",
               TypeReferences.field35387.in(var1),
               Class9674.method37738(var1)
            )
      );
      return var4;
   }
}
