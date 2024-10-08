package mapped;

import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.SectionPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.LightType;
import net.minecraft.world.biome.BiomeContainer;
import net.minecraft.world.chunk.ChunkSection;
import net.minecraft.world.chunk.ChunkStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class1705 extends Class1702 {
   private static final Logger field9288 = LogManager.getLogger();
   private final Chunk field9289;
   private final WorldLightManager field9290;
   public volatile Class8815 field9291;
   private final ClientWorld field9292;

   public Class1705(ClientWorld var1, int var2) {
      this.field9292 = var1;
      this.field9289 = new Class1675(var1, new ChunkPos(0, 0));
      this.field9290 = new WorldLightManager(this, true, var1.method6812().hasSkyLight());
      this.field9291 = new Class8815(this, method7404(var2));
   }

   @Override
   public WorldLightManager getLightManager() {
      return this.field9290;
   }

   private static boolean method7398(Chunk var0, int var1, int var2) {
      if (var0 == null) {
         return false;
      } else {
         ChunkPos var5 = var0.getPos();
         return var5.x == var1 && var5.z == var2;
      }
   }

   public void method7399(int var1, int var2) {
      if (Class8815.method31828(this.field9291, var1, var2)) {
         int var5 = this.field9291.method31823(var1, var2);
         Chunk var6 = this.field9291.method31827(var5);
         if (method7398(var6, var1, var2)) {
            if (Reflector.field42777.exists()) {
               Reflector.postForgeBusEvent(Reflector.field42777, var6);
            }

            var6.method7143(false);
            this.field9291.method31825(var5, var6, (Chunk)null);
         }
      }
   }

   @Nullable
   public Chunk method7346(int var1, int var2, ChunkStatus var3, boolean var4) {
      if (Class8815.method31828(this.field9291, var1, var2)) {
         Chunk var7 = this.field9291.method31827(this.field9291.method31823(var1, var2));
         if (method7398(var7, var1, var2)) {
            return var7;
         }
      }

      return !var4 ? null : this.field9289;
   }

   @Override
   public IBlockReader getWorld() {
      return this.field9292;
   }

   @Nullable
   public Chunk method7400(int var1, int var2, BiomeContainer var3, PacketBuffer var4, CompoundNBT var5, int var6, boolean var7) {
      if (!Class8815.method31828(this.field9291, var1, var2)) {
         field9288.warn("Ignoring chunk since it's not in the view range: {}, {}", var1, var2);
         return null;
      } else {
         int var10 = this.field9291.method31823(var1, var2);
         Object var11 = this.field9291.field39654.get(var10);
         if (!var7 && method7398((Chunk)var11, var1, var2)) {
            boolean var12 = false;
            if (var11 instanceof Class1676) {
               Class1676 var13 = (Class1676)var11;
               Object var14 = var4.method35738("ChunkDataOF");
               if (var14 instanceof Class8870) {
                  Class8870 var15 = (Class8870)var14;
                  var13.method7167(var15);
                  ChunkSection.field30374.set(var15);
                  var12 = true;
               }
            }

            ((Chunk)var11).method7142(var3, var4, var5, var6);
            if (var12) {
               ChunkSection.field30374.set((Class8870)null);
            }
         } else {
            if (var3 == null) {
               field9288.warn("Ignoring chunk since we don't have complete data: {}, {}", var1, var2);
               return null;
            }

            if (var11 != null) {
               ((Chunk)var11).method7143(false);
            }

            var11 = new Class1676(this.field9292, new ChunkPos(var1, var2), var3);
            ((Chunk)var11).method7142(var3, var4, var5, var6);
            this.field9291.method31824(var10, (Chunk)var11);
         }

         ChunkSection[] var16 = ((Chunk)var11).getSections();
         WorldLightManager var17 = this.getLightManager();
         var17.method605(new ChunkPos(var1, var2), true);

         for (int var18 = 0; var18 < var16.length; var18++) {
            ChunkSection var19 = var16[var18];
            var17.updateSectionStatus(SectionPos.method8389(var1, var18, var2), ChunkSection.method21859(var19));
         }

         this.field9292.method6841(var1, var2);
         if (Reflector.field42775.exists()) {
            Reflector.postForgeBusEvent(Reflector.field42775, var11);
         }

         ((Chunk)var11).method7143(true);
         return (Chunk)var11;
      }
   }

   public void method7401(BooleanSupplier var1) {
   }

   public void method7402(int var1, int var2) {
      Class8815.method31829(this.field9291, var1);
      Class8815.method31830(this.field9291, var2);
   }

   public void method7403(int var1) {
      int var4 = Class8815.method31831(this.field9291);
      int var5 = method7404(var1);
      if (var4 != var5) {
         Class8815 var6 = new Class8815(this, var5);
         Class8815.method31829(var6, Class8815.method31832(this.field9291));
         Class8815.method31830(var6, Class8815.method31833(this.field9291));

         for (int var7 = 0; var7 < this.field9291.field39654.length(); var7++) {
            Chunk var8 = this.field9291.field39654.get(var7);
            if (var8 != null) {
               ChunkPos var9 = var8.getPos();
               if (Class8815.method31828(var6, var9.x, var9.z)) {
                  var6.method31824(var6.method31823(var9.x, var9.z), var8);
               }
            }
         }

         this.field9291 = var6;
      }
   }

   private static int method7404(int var0) {
      return Math.max(2, var0) + 3;
   }

   @Override
   public String method7347() {
      return "Client Chunk Cache: " + this.field9291.field39654.length() + ", " + this.method7405();
   }

   public int method7405() {
      return Class8815.method31834(this.field9291);
   }

   @Override
   public void method7373(LightType var1, SectionPos var2) {
      Minecraft.getInstance().worldRenderer.method906(var2.method8410(), var2.method8411(), var2.method8412());
   }

   @Override
   public boolean method7353(BlockPos var1) {
      return this.method7345(var1.getX() >> 4, var1.getZ() >> 4);
   }

   @Override
   public boolean method7352(ChunkPos var1) {
      return this.method7345(var1.x, var1.z);
   }

   @Override
   public boolean method7351(Entity var1) {
      return this.method7345(MathHelper.floor(var1.getPosX()) >> 4, MathHelper.floor(var1.getPosZ()) >> 4);
   }

   // $VF: synthetic method
   public static ClientWorld method7406(Class1705 var0) {
      return var0.field9292;
   }
}
