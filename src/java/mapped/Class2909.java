package mapped;

import java.util.Random;

public class Class2909 extends Class2898<Class4712> {
   private static String[] field17993;
   public static final BlockPos field17994 = BlockPos.field13032;
   private final boolean field17995;

   public Class2909(boolean var1) {
      super(Class4712.field22349);
      this.field17995 = var1;
   }

   public boolean method11213(Class1658 var1, Class5646 var2, Random var3, BlockPos var4, Class4712 var5) {
      for (BlockPos var9 : BlockPos.method8359(
         new BlockPos(var4.method8304() - 4, var4.getY() - 1, var4.method8306() - 4),
         new BlockPos(var4.method8304() + 4, var4.getY() + 32, var4.method8306() + 4)
      )) {
         boolean var10 = var9.method8316(var4, 2.5);
         if (var10 || var9.method8316(var4, 3.5)) {
            if (var9.getY() >= var4.getY()) {
               if (var9.getY() <= var4.getY()) {
                  if (var10) {
                     if (!this.field17995) {
                        this.method11217(var1, new BlockPos(var9), Blocks.AIR.method11579());
                     } else {
                        this.method11217(var1, new BlockPos(var9), Blocks.field36649.method11579());
                     }
                  } else {
                     this.method11217(var1, var9, Blocks.BEDROCK.method11579());
                  }
               } else {
                  this.method11217(var1, var9, Blocks.AIR.method11579());
               }
            } else if (!var10) {
               if (var9.getY() < var4.getY()) {
                  this.method11217(var1, var9, Blocks.field36651.method11579());
               }
            } else {
               this.method11217(var1, var9, Blocks.BEDROCK.method11579());
            }
         }
      }

      for (int var11 = 0; var11 < 4; var11++) {
         this.method11217(var1, var4.method8339(var11), Blocks.BEDROCK.method11579());
      }

      BlockPos var12 = var4.method8339(2);

      for (Direction var14 : Class76.field161) {
         this.method11217(var1, var12.method8349(var14), Blocks.WALL_TORCH.method11579().method23465(Class3382.field18985, var14));
      }

      return true;
   }
}