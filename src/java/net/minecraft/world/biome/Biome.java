package net.minecraft.world.biome;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.util.Util;
import net.minecraft.crash.CrashReport;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.SectionPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.LightType;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.WorldGenRegion;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.structure.StructureManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Biome {
   public static final Logger field40306 = LogManager.getLogger();
   public static final Codec<Biome> field40307 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Class7035.field30357.forGetter(var0x -> var0x.field40315),
               Class100.field291.fieldOf("category").forGetter(var0x -> var0x.field40320),
               Codec.FLOAT.fieldOf("depth").forGetter(var0x -> var0x.field40318),
               Codec.FLOAT.fieldOf("scale").forGetter(var0x -> var0x.field40319),
               Class7752.field33278.fieldOf("effects").forGetter(var0x -> var0x.field40321),
               BiomeGenerationSettings.field32137.forGetter(var0x -> var0x.field40316),
               Class8835.field39900.forGetter(var0x -> var0x.field40317)
            )
            .apply(var0, Biome::new)
   );
   public static final Codec<Biome> field40308 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Class7035.field30357.forGetter(var0x -> var0x.field40315),
               Class100.field291.fieldOf("category").forGetter(var0x -> var0x.field40320),
               Codec.FLOAT.fieldOf("depth").forGetter(var0x -> var0x.field40318),
               Codec.FLOAT.fieldOf("scale").forGetter(var0x -> var0x.field40319),
               Class7752.field33278.fieldOf("effects").forGetter(var0x -> var0x.field40321)
            )
            .apply(var0, (var0x, var1, var2, var3, var4) -> new Biome(var0x, var1, var2, var3, var4, BiomeGenerationSettings.field32136, Class8835.field39899))
   );
   public static final Codec<Supplier<Biome>> field40309 = RegistryKeyCodec.create(Registry.BIOME_KEY, field40307);
   public static final Codec<List<Supplier<Biome>>> field40310 = RegistryKeyCodec.<Biome>method33672(Registry.BIOME_KEY, field40307);
   private final Map<Integer, List<Structure<?>>> field40311 = Registry.STRUCTURE_FEATURE
      .method9192()
      .collect(Collectors.<Structure<?>, Integer>groupingBy(var0 -> var0.method11364().ordinal()));
   private static final Class7691 field40312 = new Class7691(new SharedSeedRandom(1234L), ImmutableList.of(0));
   public static final Class7691 field40313 = new Class7691(new SharedSeedRandom(3456L), ImmutableList.of(-2, -1, 0));
   public static final Class7691 field40314 = new Class7691(new SharedSeedRandom(2345L), ImmutableList.of(0));
   private final Class7035 field40315;
   private final BiomeGenerationSettings field40316;
   private final Class8835 field40317;
   private final float field40318;
   private final float field40319;
   private final Class100 field40320;
   private final Class7752 field40321;
   private final ThreadLocal<Long2FloatLinkedOpenHashMap> field40322 = ThreadLocal.<Long2FloatLinkedOpenHashMap>withInitial(() -> Util.method38507(() -> {
         Class14 var3x = new Class14(this, 1024, 0.25F);
         var3x.defaultReturnValue(Float.NaN);
         return var3x;
      }));

   private Biome(Class7035 var1, Class100 var2, float var3, float var4, Class7752 var5, BiomeGenerationSettings var6, Class8835 var7) {
      this.field40315 = var1;
      this.field40316 = var6;
      this.field40317 = var7;
      this.field40320 = var2;
      this.field40318 = var3;
      this.field40319 = var4;
      this.field40321 = var5;
   }

   public int method32498() {
      return this.field40321.method25676();
   }

   public Class8835 getMobSpawnInfo() {
      return this.field40317;
   }

   public Class87 method32500() {
      return Class7035.method21840(this.field40315);
   }

   public boolean method32501() {
      return this.method32516() > 0.85F;
   }

   private float method32502(BlockPos var1) {
      float var4 = Class7035.method21841(this.field40315).method271(var1, this.method32518());
      if (var1.getY() <= 64) {
         return var4;
      } else {
         float var5 = (float)(field40312.method25315((double)((float)var1.getX() / 8.0F), (double)((float)var1.getZ() / 8.0F), false) * 4.0);
         return var4 - (var5 + (float)var1.getY() - 64.0F) * 0.05F / 30.0F;
      }
   }

   public final float method32503(BlockPos var1) {
      long var4 = var1.method8332();
      Long2FloatLinkedOpenHashMap var6 = this.field40322.get();
      float var7 = var6.get(var4);
      if (Float.isNaN(var7)) {
         float var8 = this.method32502(var1);
         if (var6.size() == 1024) {
            var6.removeFirstFloat();
         }

         var6.put(var4, var8);
         return var8;
      } else {
         return var7;
      }
   }

   public boolean method32504(IWorldReader var1, BlockPos var2) {
      return this.method32505(var1, var2, true);
   }

   public boolean method32505(IWorldReader var1, BlockPos var2, boolean var3) {
      if (this.method32503(var2) >= 0.15F) {
         return false;
      } else {
         if (var2.getY() >= 0 && var2.getY() < 256 && var1.getLightFor(LightType.BLOCK, var2) < 10) {
            BlockState var6 = var1.getBlockState(var2);
            FluidState var7 = var1.getFluidState(var2);
            if (var7.getFluid() == Fluids.WATER && var6.getBlock() instanceof Class3404) {
               if (!var3) {
                  return true;
               }

               boolean var8 = var1.method7013(var2.west())
                  && var1.method7013(var2.east())
                  && var1.method7013(var2.north())
                  && var1.method7013(var2.south());
               if (!var8) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public boolean method32506(IWorldReader var1, BlockPos var2) {
      if (!(this.method32503(var2) >= 0.15F)) {
         if (var2.getY() >= 0 && var2.getY() < 256 && var1.getLightFor(LightType.BLOCK, var2) < 10) {
            BlockState var5 = var1.getBlockState(var2);
            if (var5.isAir() && Blocks.SNOW.getDefaultState().isValidPosition(var1, var2)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public BiomeGenerationSettings getGenerationSettings() {
      return this.field40316;
   }

   public void generateFeatures(StructureManager var1, ChunkGenerator var2, WorldGenRegion var3, long var4, SharedSeedRandom var6, BlockPos var7) {
      List<List<Supplier<ConfiguredFeature<?, ?>>>> var10 = this.field40316.method24281();
      int var11 = Class1993.values().length;

      for (int var12 = 0; var12 < var11; var12++) {
         int var13 = 0;
         if (var1.method24344()) {
            for (Structure var15 : this.field40311.getOrDefault(var12, Collections.<Structure<?>>emptyList())) {
               var6.method10372(var4, var13, var12);
               int var16 = var7.getX() >> 4;
               int var17 = var7.getZ() >> 4;
               int var18 = var16 << 4;
               int var19 = var17 << 4;

               try {
                  var1.method24340(SectionPos.method8390(var7), var15)
                     .forEach(
                        var8 -> var8.method17112(var3, var1, var2, var6, new Class9764(var18, var19, var18 + 15, var19 + 15), new ChunkPos(var16, var17))
                     );
               } catch (Exception var22) {
                  CrashReport var21 = CrashReport.makeCrashReport(var22, "Feature placement");
                  var21.makeCategory("Feature").addDetail("Id", Registry.STRUCTURE_FEATURE.getKey(var15)).addDetail("Description", () -> var15.toString());
                  throw new ReportedException(var21);
               }

               var13++;
            }
         }

         if (var10.size() > var12) {
            for (Supplier var25 : var10.get(var12)) {
               ConfiguredFeature var26 = (ConfiguredFeature)var25.get();
               var6.method10372(var4, var13, var12);

               try {
                  var26.func_242765_a(var3, var2, var6, var7);
               } catch (Exception var23) {
                  CrashReport var27 = CrashReport.makeCrashReport(var23, "Feature placement");
                  var27.makeCategory("Feature")
                     .addDetail("Id", Registry.field16112.getKey(var26.field33886))
                     .addDetail("Config", var26.field33887)
                     .addDetail("Description", () -> var26.field33886.toString());
                  throw new ReportedException(var27);
               }

               var13++;
            }
         }
      }
   }

   public int method32509() {
      return this.field40321.method25673();
   }

   public int method32510(double var1, double var3) {
      int var7 = this.field40321.method25678().orElseGet(this::method32511);
      return this.field40321.method25679().method265(var1, var3, var7);
   }

   private int method32511() {
      double var3 = (double) MathHelper.clamp(Class7035.method21842(this.field40315), 0.0F, 1.0F);
      double var5 = (double) MathHelper.clamp(Class7035.method21843(this.field40315), 0.0F, 1.0F);
      return Class6406.method19509(var3, var5);
   }

   public int method32512() {
      return this.field40321.method25677().orElseGet(this::method32513);
   }

   private int method32513() {
      double var3 = (double) MathHelper.clamp(Class7035.method21842(this.field40315), 0.0F, 1.0F);
      double var5 = (double) MathHelper.clamp(Class7035.method21843(this.field40315), 0.0F, 1.0F);
      return Class9441.method36292(var3, var5);
   }

   public void method32514(Random var1, IChunk var2, int var3, int var4, int var5, double var6, BlockState var8, BlockState var9, int var10, long var11) {
      Class9319 var15 = this.field40316.method24282().get();
      var15.method35210(var11);
      var15.method35209(var1, var2, this, var3, var4, var5, var6, var8, var9, var10, var11);
   }

   public final float method32515() {
      return this.field40318;
   }

   public final float method32516() {
      return Class7035.method21843(this.field40315);
   }

   public final float method32517() {
      return this.field40319;
   }

   public final float method32518() {
      return Class7035.method21842(this.field40315);
   }

   public Class7752 method32519() {
      return this.field40321;
   }

   public final int method32520() {
      return this.field40321.method25674();
   }

   public final int method32521() {
      return this.field40321.method25675();
   }

   public Optional<Class7737> method32522() {
      return this.field40321.method25680();
   }

   public Optional<SoundEvent> method32523() {
      return this.field40321.method25681();
   }

   public Optional<Class7959> method32524() {
      return this.field40321.method25682();
   }

   public Optional<Class8217> method32525() {
      return this.field40321.method25683();
   }

   public Optional<BackgroundMusicSelector> getBackgroundMusic() {
      return this.field40321.method25684();
   }

   public final Class100 getCategory() {
      return this.field40320;
   }

   @Override
   public String toString() {
      ResourceLocation var3 = WorldGenRegistries.BIOME.getKey(this);
      return var3 != null ? var3.toString() : super.toString();
   }

   // $VF: synthetic method
   public Biome(Class7035 var1, Class100 var2, float var3, float var4, Class7752 var5, BiomeGenerationSettings var6, Class8835 var7, Class14 var8) {
      this(var1, var2, var3, var4, var5, var6, var7);
   }
}
