package mapped;

import java.util.List;
import java.util.Random;

public class Class8983 {
   private static final ResourceLocation[] field40995 = new ResourceLocation[]{
      new ResourceLocation("nether_fossils/fossil_1"),
      new ResourceLocation("nether_fossils/fossil_2"),
      new ResourceLocation("nether_fossils/fossil_3"),
      new ResourceLocation("nether_fossils/fossil_4"),
      new ResourceLocation("nether_fossils/fossil_5"),
      new ResourceLocation("nether_fossils/fossil_6"),
      new ResourceLocation("nether_fossils/fossil_7"),
      new ResourceLocation("nether_fossils/fossil_8"),
      new ResourceLocation("nether_fossils/fossil_9"),
      new ResourceLocation("nether_fossils/fossil_10"),
      new ResourceLocation("nether_fossils/fossil_11"),
      new ResourceLocation("nether_fossils/fossil_12"),
      new ResourceLocation("nether_fossils/fossil_13"),
      new ResourceLocation("nether_fossils/fossil_14")
   };

   public static void method33186(Class8761 var0, List<Class4178> var1, Random var2, BlockPos var3) {
      Class80 var6 = Class80.method254(var2);
      var1.add(new Class4182(var0, Util.<ResourceLocation>method38518(field40995, var2), var3, var6));
   }
}