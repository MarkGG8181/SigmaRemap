package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.Random;

public class Class2926 extends Class2898<Class4712> {
   public Class2926(Codec<Class4712> var1) {
      super(var1);
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4712 var5) {
      int var8 = 0;
      int var9 = var1.method6736(Heightmap.Type.field298, var4.getX(), var4.getZ());
      BlockPos var10 = new BlockPos(var4.getX(), var9, var4.getZ());
      if (var1.getBlockState(var10).isIn(Blocks.WATER)) {
         BlockState var11 = Blocks.field36961.method11579();
         BlockState var12 = Blocks.field36962.method11579();
         int var13 = 1 + var3.nextInt(10);

         for (int var14 = 0; var14 <= var13; var14++) {
            if (var1.getBlockState(var10).isIn(Blocks.WATER)
               && var1.getBlockState(var10.up()).isIn(Blocks.WATER)
               && var12.method23443(var1, var10)) {
               if (var14 != var13) {
                  var1.setBlockState(var10, var12, 2);
               } else {
                  var1.setBlockState(var10, var11.method23465(Class3451.field19267, Integer.valueOf(var3.nextInt(4) + 20)), 2);
                  var8++;
               }
            } else if (var14 > 0) {
               BlockPos var15 = var10.down();
               if (var11.method23443(var1, var15) && !var1.getBlockState(var15.down()).isIn(Blocks.field36961)) {
                  var1.setBlockState(var15, var11.method23465(Class3451.field19267, Integer.valueOf(var3.nextInt(4) + 20)), 2);
                  var8++;
               }
               break;
            }

            var10 = var10.up();
         }
      }

      return var8 > 0;
   }
}
