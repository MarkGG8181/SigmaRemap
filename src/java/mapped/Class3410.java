package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3410 extends Block {
   private static String[] field19091;
   public static final IntegerProperty field19092 = BlockStateProperties.field39750;
   public static final VoxelShape[] field19093 = new VoxelShape[]{
      VoxelShapes.method27425(),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   public Class3410(Properties var1) {
      super(var1);
      this.method11578(this.field18612.method35393().with(field19092, Integer.valueOf(1)));
   }

   @Override
   public boolean method11494(BlockState var1, IBlockReader var2, BlockPos var3, Class1947 var4) {
      switch (Class9444.field43874[var4.ordinal()]) {
         case 1:
            return var1.<Integer>get(field19092) < 5;
         case 2:
            return false;
         case 3:
            return false;
         default:
            return false;
      }
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19093[var1.<Integer>get(field19092)];
   }

   @Override
   public VoxelShape method11502(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19093[var1.<Integer>get(field19092) - 1];
   }

   @Override
   public VoxelShape method11995(BlockState var1, IBlockReader var2, BlockPos var3) {
      return field19093[var1.<Integer>get(field19092)];
   }

   @Override
   public VoxelShape method11635(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19093[var1.<Integer>get(field19092)];
   }

   @Override
   public boolean method11534(BlockState var1) {
      return true;
   }

   @Override
   public boolean method11492(BlockState var1, IWorldReader var2, BlockPos var3) {
      BlockState var6 = var2.getBlockState(var3.down());
      if (var6.isIn(Blocks.ICE) || var6.isIn(Blocks.PACKED_ICE) || var6.isIn(Blocks.field36765)) {
         return false;
      } else {
         return !var6.isIn(Blocks.field37119) && !var6.isIn(Blocks.SOUL_SAND)
            ? Block.method11549(var6.method23414(var2, var3.down()), Direction.UP)
               || var6.getBlock() == this && var6.<Integer>get(field19092) == 8
            : true;
      }
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var1.method23443(var4, var5) ? super.method11491(var1, var2, var3, var4, var5, var6) : Blocks.AIR.method11579();
   }

   @Override
   public void method11484(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var2.getLightFor(LightType.BLOCK, var3) > 11) {
         method11554(var1, var2, var3);
         var2.removeBlock(var3, false);
      }
   }

   @Override
   public boolean method11497(BlockState var1, Class5909 var2) {
      int var5 = var1.<Integer>get(field19092);
      if (var2.method18357().getItem() != this.method11581() || var5 >= 8) {
         return var5 == 1;
      } else {
         return !var2.method18347() ? true : var2.method18354() == Direction.UP;
      }
   }

   @Nullable
   @Override
   public BlockState method11495(Class5909 var1) {
      BlockState var4 = var1.method18360().getBlockState(var1.method18345());
      if (!var4.isIn(this)) {
         return super.method11495(var1);
      } else {
         int var5 = var4.<Integer>get(field19092);
         return var4.with(field19092, Integer.valueOf(Math.min(8, var5 + 1)));
      }
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19092);
   }
}
