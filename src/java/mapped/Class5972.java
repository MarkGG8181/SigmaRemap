package mapped;

import net.minecraft.client.gui.screen.BiomeGeneratorTypeScreens;
import net.minecraft.util.registry.Registry;

public final class Class5972 extends BiomeGeneratorTypeScreens {
   public Class5972(String var1) {
      super(var1, null);
   }

   @Override
   public ChunkGenerator method18500(Registry<Biome> var1, Registry<DimensionSettings> var2, long var3) {
      return new Class5648(Class9733.method38132(var1));
   }
}
