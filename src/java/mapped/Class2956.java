package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

public interface Class2956 extends Class2955 {
   @Override
   double method11320();

   @Override
   double method11321();

   @Override
   double method11322();

   BlockPos method11323();

   BlockState method11324();

   <T extends TileEntity> T method11325();

   ServerWorld method11326();
}
