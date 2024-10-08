package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

import net.minecraft.client.util.Util;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class8835 {
   public static final Logger field39898 = LogManager.getLogger();
   public static final Class8835 field39899 = new Class8835(
      0.1F, Stream.<EntityClassification>of(EntityClassification.values()).collect(ImmutableMap.toImmutableMap(var0 -> var0, var0 -> ImmutableList.of())), ImmutableMap.of(), false
   );
   public static final MapCodec<Class8835> field39900 = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
               Codec.FLOAT.optionalFieldOf("creature_spawn_probability", 0.1F).forGetter(var0x -> var0x.field39901),
               Codec.simpleMap(
                     EntityClassification.field629,
                     MobSpawnInfoSpawners.field29310.listOf().promotePartial(Util.func_240982_a_("Spawn data: ", field39898::error)),
                     IStringSerializable.method260(EntityClassification.values())
                  )
                  .fieldOf("spawners")
                  .forGetter(var0x -> var0x.field39902),
               Codec.simpleMap(Registry.ENTITY_TYPE, Class7763.field33334, Registry.ENTITY_TYPE).fieldOf("spawn_costs").forGetter(var0x -> var0x.field39903),
               Codec.BOOL.fieldOf("player_spawn_friendly").orElse(false).forGetter(Class8835::isValidSpawnBiomeForPlayer)
            )
            .apply(var0, Class8835::new)
   );
   private final float field39901;
   private final Map<EntityClassification, List<MobSpawnInfoSpawners>> field39902;
   private final Map<EntityType<?>, Class7763> field39903;
   private final boolean field39904;

   public Class8835(float var1, Map<EntityClassification, List<MobSpawnInfoSpawners>> var2, Map<EntityType<?>, Class7763> var3, boolean var4) {
      this.field39901 = var1;
      this.field39902 = var2;
      this.field39903 = var3;
      this.field39904 = var4;
   }

   public List<MobSpawnInfoSpawners> getSpawners(EntityClassification var1) {
      return this.field39902.getOrDefault(var1, ImmutableList.of());
   }

   @Nullable
   public Class7763 method31969(EntityType<?> var1) {
      return this.field39903.get(var1);
   }

   public float method31970() {
      return this.field39901;
   }

   public boolean isValidSpawnBiomeForPlayer() {
      return this.field39904;
   }
}
