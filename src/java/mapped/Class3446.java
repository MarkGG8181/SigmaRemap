package mapped;

import net.minecraft.util.Direction;

public class Class3446 extends Class3445 {
   private static String[] field19259;
   public static final VoxelShape field19260 = Block.method11539(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   public Class3446(AbstractBlock var1) {
      super(var1, Direction.DOWN, field19260, false);
   }

   @Override
   public Class3452 method12124() {
      return (Class3452) Blocks.field37086;
   }
}
