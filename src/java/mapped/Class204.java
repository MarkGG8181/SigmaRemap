package mapped;

import net.minecraft.world.server.ChunkManager;
import net.minecraft.world.server.Ticket;

public class Class204 extends Class203 {
   private static String[] field759;
   public final Class9307 field760;

   public Class204(Class9307 var1) {
      super(ChunkManager.MAX_LOADED_LEVEL + 2, 16, 256);
      this.field760 = var1;
   }

   @Override
   public int method679(long var1) {
      SortedArraySet var5 = (SortedArraySet)Class9307.method35149(this.field760).get(var1);
      if (var5 != null) {
         return !var5.isEmpty() ? ((Ticket)var5.getSmallest()).getLevel() : Integer.MAX_VALUE;
      } else {
         return Integer.MAX_VALUE;
      }
   }

   @Override
   public int getLevel(long var1) {
      if (!this.field760.method35120(var1)) {
         Class8641 var5 = this.field760.method35121(var1);
         if (var5 != null) {
            return var5.method31057();
         }
      }

      return ChunkManager.MAX_LOADED_LEVEL + 1;
   }

   @Override
   public void setLevel(long var1, int var3) {
      Class8641 var6 = this.field760.method35121(var1);
      int var7 = var6 != null ? var6.method31057() : ChunkManager.MAX_LOADED_LEVEL + 1;
      if (var7 != var3) {
         var6 = this.field760.method35122(var1, var3, var6, var7);
         if (var6 != null) {
            Class9307.method35150(this.field760).add(var6);
         }
      }
   }

   public int method681(int var1) {
      return this.processUpdates(var1);
   }
}
