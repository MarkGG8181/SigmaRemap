package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;

public final class Class6220 extends Class6218 {
   private static String[] field27718;

   @Override
   public ItemStack method19192(Class2956 var1, ItemStack var2) {
      Direction var5 = var1.method11324().<Direction>method23463(Class3357.field18899);
      EntityType var6 = ((SpawnEggItem)var2.getItem()).method11855(var2.method32142());
      var6.method33200(var1.method11326(), var2, (PlayerEntity)null, var1.method11323().method8349(var5), Class2202.field14405, var5 != Direction.field673, false);
      var2.method32182(1);
      return var2;
   }
}
