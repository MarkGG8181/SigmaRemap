package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

public final class Class6235 extends Class6230 {
   private static String[] field27729;

   @Override
   public ItemStack dispenseStack(IBlockSource var1, ItemStack var2) {
      ServerWorld var5 = var1.method11326();
      BlockPos var6 = var1.method11323().method8349(var1.method11324().<Direction>method23463(Class3357.field18899));
      Class3342 var7 = (Class3342) Blocks.field36589;
      if (var5.method7007(var6) && var7.method11891(var5, var6)) {
         if (!var5.isRemote) {
            var5.setBlockState(var6, var7.method11579(), 3);
         }

         var2.shrink(1);
         this.method19204(true);
      } else {
         this.method19204(ArmorItem.func_226626_a_(var1, var2));
      }

      return var2;
   }
}
