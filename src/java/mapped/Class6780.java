package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;

import java.util.Random;

public class Class6780 extends Class6768<Class8278> {
   public Class6780(Codec<Class8278> var1) {
      super(var1);
   }

   public void method20654(
      Random var1,
      IChunk var2,
      Biome var3,
      int var4,
      int var5,
      int var6,
      double var7,
      BlockState var9,
      BlockState var10,
      int var11,
      long var12,
      Class8278 var14
   ) {
      if (!(var7 > 1.0)) {
         Class6768.field29523.method20654(var1, var2, var3, var4, var5, var6, var7, var9, var10, var11, var12, Class6768.field29509);
      } else {
         Class6768.field29523.method20654(var1, var2, var3, var4, var5, var6, var7, var9, var10, var11, var12, Class6768.field29510);
      }
   }
}
