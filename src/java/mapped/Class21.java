package mapped;

import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import net.minecraft.world.lighting.LevelBasedGraph;

public class Class21 extends Long2ByteOpenHashMap {
   private static String[] field37;
   public final int field38;
   public final LevelBasedGraph field39;

   public Class21(LevelBasedGraph var1, int var2, float var3, int var4) {
      super(var2, var3);
      this.field39 = var1;
      this.field38 = var4;
   }

   public void rehash(int var1) {
      if (var1 > this.field38) {
         super.rehash(var1);
      }
   }
}
