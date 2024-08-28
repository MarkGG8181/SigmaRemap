package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class Class6731 extends Class6717 {
   public Class6731(Schema var1, boolean var2) {
      super(var1, var2, "BlockEntityShulkerBoxColorFix", Class8239.field35386, "minecraft:shulker_box");
   }

   @Override
   public Typed<?> method20508(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), var0 -> var0.remove("Color"));
   }
}
