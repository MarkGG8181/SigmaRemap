package mapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;

public class Class6324 extends Class6319 {
   public static final Map<String, String> field27833 = ImmutableMap.<String, String>builder()
      .put("minecraft:commandblock_minecart", "minecraft:command_block_minecart")
      .put("minecraft:ender_crystal", "minecraft:end_crystal")
      .put("minecraft:snowman", "minecraft:snow_golem")
      .put("minecraft:evocation_illager", "minecraft:evoker")
      .put("minecraft:evocation_fangs", "minecraft:evoker_fangs")
      .put("minecraft:illusion_illager", "minecraft:illusioner")
      .put("minecraft:vindication_illager", "minecraft:vindicator")
      .put("minecraft:villager_golem", "minecraft:iron_golem")
      .put("minecraft:xp_orb", "minecraft:experience_orb")
      .put("minecraft:xp_bottle", "minecraft:experience_bottle")
      .put("minecraft:eye_of_ender_signal", "minecraft:eye_of_ender")
      .put("minecraft:fireworks_rocket", "minecraft:firework_rocket")
      .build();
   public static final Map<String, String> field27834 = ImmutableMap.<String, String>builder()
      .put("minecraft:portal", "minecraft:nether_portal")
      .put("minecraft:oak_bark", "minecraft:oak_wood")
      .put("minecraft:spruce_bark", "minecraft:spruce_wood")
      .put("minecraft:birch_bark", "minecraft:birch_wood")
      .put("minecraft:jungle_bark", "minecraft:jungle_wood")
      .put("minecraft:acacia_bark", "minecraft:acacia_wood")
      .put("minecraft:dark_oak_bark", "minecraft:dark_oak_wood")
      .put("minecraft:stripped_oak_bark", "minecraft:stripped_oak_wood")
      .put("minecraft:stripped_spruce_bark", "minecraft:stripped_spruce_wood")
      .put("minecraft:stripped_birch_bark", "minecraft:stripped_birch_wood")
      .put("minecraft:stripped_jungle_bark", "minecraft:stripped_jungle_wood")
      .put("minecraft:stripped_acacia_bark", "minecraft:stripped_acacia_wood")
      .put("minecraft:stripped_dark_oak_bark", "minecraft:stripped_dark_oak_wood")
      .put("minecraft:mob_spawner", "minecraft:spawner")
      .build();
   public static final Map<String, String> field27835 = ImmutableMap.<String, String>builder()
      .putAll(field27834)
      .put("minecraft:clownfish", "minecraft:tropical_fish")
      .put("minecraft:chorus_fruit_popped", "minecraft:popped_chorus_fruit")
      .put("minecraft:evocation_illager_spawn_egg", "minecraft:evoker_spawn_egg")
      .put("minecraft:vindication_illager_spawn_egg", "minecraft:vindicator_spawn_egg")
      .build();

   public Class6324(Schema var1, boolean var2) {
      super("EntityTheRenameningBlock", var1, var2);
   }

   @Override
   public String method19259(String var1) {
      if (var1.startsWith("minecraft:bred_")) {
         var1 = "minecraft:" + var1.substring("minecraft:bred_".length());
      }

      return field27833.getOrDefault(var1, var1);
   }
}
