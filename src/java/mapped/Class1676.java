package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeContainer;
import net.minecraft.world.chunk.ChunkSection;

public class Class1676 extends Chunk {
   private static String[] field9136;
   private Class8870 field9137;
   private boolean field9138;
   private boolean field9139;

   public Class1676(World var1, ChunkPos var2, BiomeContainer var3) {
      super(var1, var2, var3);
   }

   public Class8870 method7166() {
      return this.field9137;
   }

   public void method7167(Class8870 var1) {
      this.field9137 = var1;
   }

   public static Class8870 method7168(Chunk var0) {
      Class8889[] var3 = null;
      ChunkSection var4 = var0.getLastExtendedBlockStorage();
      if (var4 != null) {
         int var5 = (var4.getYLocation() >> 4) + 1;
         var3 = new Class8889[var5];
         ChunkSection[] var6 = var0.getSections();

         for (int var7 = 0; var7 < var5; var7++) {
            ChunkSection var8 = var6[var7];
            if (var8 != null) {
               short var9 = var8.method21870();
               short var10 = var8.method21871();
               short var11 = var8.method21872();
               var3[var7] = new Class8889(var9, var10, var11);
            }
         }
      }

      return new Class8870(var3);
   }

   @Override
   public void addEntity(Entity var1) {
      this.field9138 = true;
      super.addEntity(var1);
   }

   @Override
   public void method7147(boolean var1) {
      this.field9138 = var1;
      super.method7147(var1);
   }

   public boolean method7169() {
      return this.field9138;
   }

   @Override
   public void method7143(boolean var1) {
      this.field9139 = var1;
      super.method7143(var1);
   }

   public boolean method7170() {
      return this.field9139;
   }
}
