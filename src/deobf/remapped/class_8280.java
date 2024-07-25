package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;

public class class_8280 extends DataFix {
   public class_8280(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "OptionsForceVBOFix",
         this.getInputSchema().getType(class_4002.field_19442),
         var0 -> var0.update(DSL.remainderFinder(), var0x -> var0x.set("useVbo", var0x.createString("true")))
      );
   }
}