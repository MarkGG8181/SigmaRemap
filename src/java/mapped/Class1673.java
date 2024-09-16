package mapped;

import it.unimi.dsi.fastutil.longs.LongSet;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.Util;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.Fluid;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.BiomeContainer;
import net.minecraft.world.chunk.ChunkSection;
import net.minecraft.world.gen.feature.structure.StructureStart;

import javax.annotation.Nullable;
import java.util.BitSet;
import java.util.Map;
import java.util.stream.Stream;

public class Class1673 extends Class1672 {
   private final Chunk field9109;

   public Class1673(Chunk var1) {
      super(var1.getPos(), Class8922.field40388);
      this.field9109 = var1;
   }

   @Nullable
   @Override
   public TileEntity getTileEntity(BlockPos var1) {
      return this.field9109.getTileEntity(var1);
   }

   @Nullable
   @Override
   public BlockState getBlockState(BlockPos var1) {
      return this.field9109.getBlockState(var1);
   }

   @Override
   public FluidState getFluidState(BlockPos var1) {
      return this.field9109.getFluidState(var1);
   }

   @Override
   public int getMaxLightLevel() {
      return this.field9109.getMaxLightLevel();
   }

   @Nullable
   @Override
   public BlockState setBlockState(BlockPos var1, BlockState var2, boolean var3) {
      return null;
   }

   @Override
   public void addTileEntity(BlockPos var1, TileEntity var2) {
   }

   @Override
   public void addEntity(Entity var1) {
   }

   @Override
   public void method7111(ChunkStatus var1) {
   }

   @Override
   public ChunkSection[] getSections() {
      return this.field9109.getSections();
   }

   @Nullable
   @Override
   public Class196 method7112() {
      return this.field9109.method7131();
   }

   @Override
   public void setHeightmap(Heightmap.Type var1, long[] var2) {
   }

   private Heightmap.Type method7126(Heightmap.Type var1) {
      if (var1 != Heightmap.Type.field295) {
         return var1 != Heightmap.Type.field297 ? var1 : Heightmap.Type.field298;
      } else {
         return Heightmap.Type.field296;
      }
   }

   @Override
   public int getTopBlockY(Heightmap.Type var1, int var2, int var3) {
      return this.field9109.getTopBlockY(this.method7126(var1), var2, var3);
   }

   @Override
   public ChunkPos getPos() {
      return this.field9109.getPos();
   }

   @Override
   public void setLastSaveTime(long var1) {
   }

   @Nullable
   @Override
   public StructureStart<?> method7097(Structure<?> var1) {
      return this.field9109.method7097(var1);
   }

   @Override
   public void method7098(Structure<?> var1, StructureStart<?> var2) {
   }

   @Override
   public Map<Structure<?>, StructureStart<?>> getStructureStarts() {
      return this.field9109.getStructureStarts();
   }

   @Override
   public void setStructureStarts(Map<Structure<?>, StructureStart<?>> var1) {
   }

   @Override
   public LongSet method7099(Structure<?> var1) {
      return this.field9109.method7099(var1);
   }

   @Override
   public void method7100(Structure<?> var1, long var2) {
   }

   @Override
   public Map<Structure<?>, LongSet> method7101() {
      return this.field9109.method7101();
   }

   @Override
   public void method7102(Map<Structure<?>, LongSet> var1) {
   }

   @Override
   public BiomeContainer getBiomes() {
      return this.field9109.getBiomes();
   }

   @Override
   public void setModified(boolean var1) {
   }

   @Override
   public boolean isModified() {
      return false;
   }

   @Override
   public ChunkStatus getStatus() {
      return this.field9109.getStatus();
   }

   @Override
   public void removeTileEntity(BlockPos var1) {
   }

   @Override
   public void markBlockForPostprocessing(BlockPos var1) {
   }

   @Override
   public void addTileEntity(CompoundNBT var1) {
   }

   @Nullable
   @Override
   public CompoundNBT getDeferredTileEntity(BlockPos var1) {
      return this.field9109.getDeferredTileEntity(var1);
   }

   @Nullable
   @Override
   public CompoundNBT getTileEntityNBT(BlockPos var1) {
      return this.field9109.getTileEntityNBT(var1);
   }

   @Override
   public void method7110(BiomeContainer var1) {
   }

   @Override
   public Stream<BlockPos> getLightSources() {
      return this.field9109.getLightSources();
   }

   @Override
   public Class6806<Block> getBlocksToBeTicked() {
      return new Class6806<Block>(var0 -> var0.method11579().isAir(), this.getPos());
   }

   @Override
   public Class6806<Fluid> getFluidsToBeTicked() {
      return new Class6806<Fluid>(var0 -> var0 == Class9479.field44064, this.getPos());
   }

   @Override
   public BitSet method7116(Class97 var1) {
      throw (UnsupportedOperationException) Util.method38516(new UnsupportedOperationException("Meaningless in this context"));
   }

   @Override
   public BitSet method7117(Class97 var1) {
      throw (UnsupportedOperationException) Util.method38516(new UnsupportedOperationException("Meaningless in this context"));
   }

   public Chunk method7127() {
      return this.field9109;
   }

   @Override
   public boolean method7095() {
      return this.field9109.method7095();
   }

   @Override
   public void method7096(boolean var1) {
      this.field9109.method7096(var1);
   }
}
