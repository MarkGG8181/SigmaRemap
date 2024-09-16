package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3193 extends Class3194 implements Class3196 {
   private static String[] field18466;
   public static final Class8554 field18467 = Class8820.field39760;
   public static final VoxelShape field18468 = Block.method11539(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   private final Class7665 field18469;

   public Class3193(Class7665 var1, AbstractBlock var2) {
      super(var2);
      this.field18469 = var1;
      this.method11578(this.field18612.method35393().method23465(field18467, Integer.valueOf(0)));
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field18468;
   }

   @Override
   public void method11484(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var2.method7015(var3.up()) >= 9 && var4.nextInt(7) == 0) {
         this.method11485(var2, var3, var1, var4);
      }
   }

   public void method11485(ServerWorld var1, BlockPos var2, BlockState var3, Random var4) {
      if (var3.<Integer>method23463(field18467) != 0) {
         this.field18469.method25182(var1, var1.getChunkProvider().method7370(), var2, var3, var4);
      } else {
         var1.setBlockState(var2, var3.method23459(field18467), 4);
      }
   }

   @Override
   public boolean method11486(IBlockReader var1, BlockPos var2, BlockState var3, boolean var4) {
      return true;
   }

   @Override
   public boolean method11487(World var1, Random var2, BlockPos var3, BlockState var4) {
      return (double)var1.rand.nextFloat() < 0.45;
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4) {
      this.method11485(var1, var3, var4, var2);
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18467);
   }
}
