package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class Class8105 extends DataFix {
   private static final Int2ObjectMap<String> field34832 = (Int2ObjectMap<String>)DataFixUtils.make(new Int2ObjectOpenHashMap(), var0 -> {
      var0.put(1, "minecraft:stone");
      var0.put(2, "minecraft:grass");
      var0.put(3, "minecraft:dirt");
      var0.put(4, "minecraft:cobblestone");
      var0.put(5, "minecraft:planks");
      var0.put(6, "minecraft:sapling");
      var0.put(7, "minecraft:bedrock");
      var0.put(8, "minecraft:flowing_water");
      var0.put(9, "minecraft:water");
      var0.put(10, "minecraft:flowing_lava");
      var0.put(11, "minecraft:lava");
      var0.put(12, "minecraft:sand");
      var0.put(13, "minecraft:gravel");
      var0.put(14, "minecraft:gold_ore");
      var0.put(15, "minecraft:iron_ore");
      var0.put(16, "minecraft:coal_ore");
      var0.put(17, "minecraft:log");
      var0.put(18, "minecraft:leaves");
      var0.put(19, "minecraft:sponge");
      var0.put(20, "minecraft:glass");
      var0.put(21, "minecraft:lapis_ore");
      var0.put(22, "minecraft:lapis_block");
      var0.put(23, "minecraft:dispenser");
      var0.put(24, "minecraft:sandstone");
      var0.put(25, "minecraft:noteblock");
      var0.put(27, "minecraft:golden_rail");
      var0.put(28, "minecraft:detector_rail");
      var0.put(29, "minecraft:sticky_piston");
      var0.put(30, "minecraft:web");
      var0.put(31, "minecraft:tallgrass");
      var0.put(32, "minecraft:deadbush");
      var0.put(33, "minecraft:piston");
      var0.put(35, "minecraft:wool");
      var0.put(37, "minecraft:yellow_flower");
      var0.put(38, "minecraft:red_flower");
      var0.put(39, "minecraft:brown_mushroom");
      var0.put(40, "minecraft:red_mushroom");
      var0.put(41, "minecraft:gold_block");
      var0.put(42, "minecraft:iron_block");
      var0.put(43, "minecraft:double_stone_slab");
      var0.put(44, "minecraft:stone_slab");
      var0.put(45, "minecraft:brick_block");
      var0.put(46, "minecraft:tnt");
      var0.put(47, "minecraft:bookshelf");
      var0.put(48, "minecraft:mossy_cobblestone");
      var0.put(49, "minecraft:obsidian");
      var0.put(50, "minecraft:torch");
      var0.put(51, "minecraft:fire");
      var0.put(52, "minecraft:mob_spawner");
      var0.put(53, "minecraft:oak_stairs");
      var0.put(54, "minecraft:chest");
      var0.put(56, "minecraft:diamond_ore");
      var0.put(57, "minecraft:diamond_block");
      var0.put(58, "minecraft:crafting_table");
      var0.put(60, "minecraft:farmland");
      var0.put(61, "minecraft:furnace");
      var0.put(62, "minecraft:lit_furnace");
      var0.put(65, "minecraft:ladder");
      var0.put(66, "minecraft:rail");
      var0.put(67, "minecraft:stone_stairs");
      var0.put(69, "minecraft:lever");
      var0.put(70, "minecraft:stone_pressure_plate");
      var0.put(72, "minecraft:wooden_pressure_plate");
      var0.put(73, "minecraft:redstone_ore");
      var0.put(76, "minecraft:redstone_torch");
      var0.put(77, "minecraft:stone_button");
      var0.put(78, "minecraft:snow_layer");
      var0.put(79, "minecraft:ice");
      var0.put(80, "minecraft:snow");
      var0.put(81, "minecraft:cactus");
      var0.put(82, "minecraft:clay");
      var0.put(84, "minecraft:jukebox");
      var0.put(85, "minecraft:fence");
      var0.put(86, "minecraft:pumpkin");
      var0.put(87, "minecraft:netherrack");
      var0.put(88, "minecraft:soul_sand");
      var0.put(89, "minecraft:glowstone");
      var0.put(90, "minecraft:portal");
      var0.put(91, "minecraft:lit_pumpkin");
      var0.put(95, "minecraft:stained_glass");
      var0.put(96, "minecraft:trapdoor");
      var0.put(97, "minecraft:monster_egg");
      var0.put(98, "minecraft:stonebrick");
      var0.put(99, "minecraft:brown_mushroom_block");
      var0.put(100, "minecraft:red_mushroom_block");
      var0.put(101, "minecraft:iron_bars");
      var0.put(102, "minecraft:glass_pane");
      var0.put(103, "minecraft:melon_block");
      var0.put(106, "minecraft:vine");
      var0.put(107, "minecraft:fence_gate");
      var0.put(108, "minecraft:brick_stairs");
      var0.put(109, "minecraft:stone_brick_stairs");
      var0.put(110, "minecraft:mycelium");
      var0.put(111, "minecraft:waterlily");
      var0.put(112, "minecraft:nether_brick");
      var0.put(113, "minecraft:nether_brick_fence");
      var0.put(114, "minecraft:nether_brick_stairs");
      var0.put(116, "minecraft:enchanting_table");
      var0.put(119, "minecraft:end_portal");
      var0.put(120, "minecraft:end_portal_frame");
      var0.put(121, "minecraft:end_stone");
      var0.put(122, "minecraft:dragon_egg");
      var0.put(123, "minecraft:redstone_lamp");
      var0.put(125, "minecraft:double_wooden_slab");
      var0.put(126, "minecraft:wooden_slab");
      var0.put(127, "minecraft:cocoa");
      var0.put(128, "minecraft:sandstone_stairs");
      var0.put(129, "minecraft:emerald_ore");
      var0.put(130, "minecraft:ender_chest");
      var0.put(131, "minecraft:tripwire_hook");
      var0.put(133, "minecraft:emerald_block");
      var0.put(134, "minecraft:spruce_stairs");
      var0.put(135, "minecraft:birch_stairs");
      var0.put(136, "minecraft:jungle_stairs");
      var0.put(137, "minecraft:command_block");
      var0.put(138, "minecraft:beacon");
      var0.put(139, "minecraft:cobblestone_wall");
      var0.put(141, "minecraft:carrots");
      var0.put(142, "minecraft:potatoes");
      var0.put(143, "minecraft:wooden_button");
      var0.put(145, "minecraft:anvil");
      var0.put(146, "minecraft:trapped_chest");
      var0.put(147, "minecraft:light_weighted_pressure_plate");
      var0.put(148, "minecraft:heavy_weighted_pressure_plate");
      var0.put(151, "minecraft:daylight_detector");
      var0.put(152, "minecraft:redstone_block");
      var0.put(153, "minecraft:quartz_ore");
      var0.put(154, "minecraft:hopper");
      var0.put(155, "minecraft:quartz_block");
      var0.put(156, "minecraft:quartz_stairs");
      var0.put(157, "minecraft:activator_rail");
      var0.put(158, "minecraft:dropper");
      var0.put(159, "minecraft:stained_hardened_clay");
      var0.put(160, "minecraft:stained_glass_pane");
      var0.put(161, "minecraft:leaves2");
      var0.put(162, "minecraft:log2");
      var0.put(163, "minecraft:acacia_stairs");
      var0.put(164, "minecraft:dark_oak_stairs");
      var0.put(170, "minecraft:hay_block");
      var0.put(171, "minecraft:carpet");
      var0.put(172, "minecraft:hardened_clay");
      var0.put(173, "minecraft:coal_block");
      var0.put(174, "minecraft:packed_ice");
      var0.put(175, "minecraft:double_plant");
      var0.put(256, "minecraft:iron_shovel");
      var0.put(257, "minecraft:iron_pickaxe");
      var0.put(258, "minecraft:iron_axe");
      var0.put(259, "minecraft:flint_and_steel");
      var0.put(260, "minecraft:apple");
      var0.put(261, "minecraft:bow");
      var0.put(262, "minecraft:arrow");
      var0.put(263, "minecraft:coal");
      var0.put(264, "minecraft:diamond");
      var0.put(265, "minecraft:iron_ingot");
      var0.put(266, "minecraft:gold_ingot");
      var0.put(267, "minecraft:iron_sword");
      var0.put(268, "minecraft:wooden_sword");
      var0.put(269, "minecraft:wooden_shovel");
      var0.put(270, "minecraft:wooden_pickaxe");
      var0.put(271, "minecraft:wooden_axe");
      var0.put(272, "minecraft:stone_sword");
      var0.put(273, "minecraft:stone_shovel");
      var0.put(274, "minecraft:stone_pickaxe");
      var0.put(275, "minecraft:stone_axe");
      var0.put(276, "minecraft:diamond_sword");
      var0.put(277, "minecraft:diamond_shovel");
      var0.put(278, "minecraft:diamond_pickaxe");
      var0.put(279, "minecraft:diamond_axe");
      var0.put(280, "minecraft:stick");
      var0.put(281, "minecraft:bowl");
      var0.put(282, "minecraft:mushroom_stew");
      var0.put(283, "minecraft:golden_sword");
      var0.put(284, "minecraft:golden_shovel");
      var0.put(285, "minecraft:golden_pickaxe");
      var0.put(286, "minecraft:golden_axe");
      var0.put(287, "minecraft:string");
      var0.put(288, "minecraft:feather");
      var0.put(289, "minecraft:gunpowder");
      var0.put(290, "minecraft:wooden_hoe");
      var0.put(291, "minecraft:stone_hoe");
      var0.put(292, "minecraft:iron_hoe");
      var0.put(293, "minecraft:diamond_hoe");
      var0.put(294, "minecraft:golden_hoe");
      var0.put(295, "minecraft:wheat_seeds");
      var0.put(296, "minecraft:wheat");
      var0.put(297, "minecraft:bread");
      var0.put(298, "minecraft:leather_helmet");
      var0.put(299, "minecraft:leather_chestplate");
      var0.put(300, "minecraft:leather_leggings");
      var0.put(301, "minecraft:leather_boots");
      var0.put(302, "minecraft:chainmail_helmet");
      var0.put(303, "minecraft:chainmail_chestplate");
      var0.put(304, "minecraft:chainmail_leggings");
      var0.put(305, "minecraft:chainmail_boots");
      var0.put(306, "minecraft:iron_helmet");
      var0.put(307, "minecraft:iron_chestplate");
      var0.put(308, "minecraft:iron_leggings");
      var0.put(309, "minecraft:iron_boots");
      var0.put(310, "minecraft:diamond_helmet");
      var0.put(311, "minecraft:diamond_chestplate");
      var0.put(312, "minecraft:diamond_leggings");
      var0.put(313, "minecraft:diamond_boots");
      var0.put(314, "minecraft:golden_helmet");
      var0.put(315, "minecraft:golden_chestplate");
      var0.put(316, "minecraft:golden_leggings");
      var0.put(317, "minecraft:golden_boots");
      var0.put(318, "minecraft:flint");
      var0.put(319, "minecraft:porkchop");
      var0.put(320, "minecraft:cooked_porkchop");
      var0.put(321, "minecraft:painting");
      var0.put(322, "minecraft:golden_apple");
      var0.put(323, "minecraft:sign");
      var0.put(324, "minecraft:wooden_door");
      var0.put(325, "minecraft:bucket");
      var0.put(326, "minecraft:water_bucket");
      var0.put(327, "minecraft:lava_bucket");
      var0.put(328, "minecraft:minecart");
      var0.put(329, "minecraft:saddle");
      var0.put(330, "minecraft:iron_door");
      var0.put(331, "minecraft:redstone");
      var0.put(332, "minecraft:snowball");
      var0.put(333, "minecraft:boat");
      var0.put(334, "minecraft:leather");
      var0.put(335, "minecraft:milk_bucket");
      var0.put(336, "minecraft:brick");
      var0.put(337, "minecraft:clay_ball");
      var0.put(338, "minecraft:reeds");
      var0.put(339, "minecraft:paper");
      var0.put(340, "minecraft:book");
      var0.put(341, "minecraft:slime_ball");
      var0.put(342, "minecraft:chest_minecart");
      var0.put(343, "minecraft:furnace_minecart");
      var0.put(344, "minecraft:egg");
      var0.put(345, "minecraft:compass");
      var0.put(346, "minecraft:fishing_rod");
      var0.put(347, "minecraft:clock");
      var0.put(348, "minecraft:glowstone_dust");
      var0.put(349, "minecraft:fish");
      var0.put(350, "minecraft:cooked_fished");
      var0.put(351, "minecraft:dye");
      var0.put(352, "minecraft:bone");
      var0.put(353, "minecraft:sugar");
      var0.put(354, "minecraft:cake");
      var0.put(355, "minecraft:bed");
      var0.put(356, "minecraft:repeater");
      var0.put(357, "minecraft:cookie");
      var0.put(358, "minecraft:filled_map");
      var0.put(359, "minecraft:shears");
      var0.put(360, "minecraft:melon");
      var0.put(361, "minecraft:pumpkin_seeds");
      var0.put(362, "minecraft:melon_seeds");
      var0.put(363, "minecraft:beef");
      var0.put(364, "minecraft:cooked_beef");
      var0.put(365, "minecraft:chicken");
      var0.put(366, "minecraft:cooked_chicken");
      var0.put(367, "minecraft:rotten_flesh");
      var0.put(368, "minecraft:ender_pearl");
      var0.put(369, "minecraft:blaze_rod");
      var0.put(370, "minecraft:ghast_tear");
      var0.put(371, "minecraft:gold_nugget");
      var0.put(372, "minecraft:nether_wart");
      var0.put(373, "minecraft:potion");
      var0.put(374, "minecraft:glass_bottle");
      var0.put(375, "minecraft:spider_eye");
      var0.put(376, "minecraft:fermented_spider_eye");
      var0.put(377, "minecraft:blaze_powder");
      var0.put(378, "minecraft:magma_cream");
      var0.put(379, "minecraft:brewing_stand");
      var0.put(380, "minecraft:cauldron");
      var0.put(381, "minecraft:ender_eye");
      var0.put(382, "minecraft:speckled_melon");
      var0.put(383, "minecraft:spawn_egg");
      var0.put(384, "minecraft:experience_bottle");
      var0.put(385, "minecraft:fire_charge");
      var0.put(386, "minecraft:writable_book");
      var0.put(387, "minecraft:written_book");
      var0.put(388, "minecraft:emerald");
      var0.put(389, "minecraft:item_frame");
      var0.put(390, "minecraft:flower_pot");
      var0.put(391, "minecraft:carrot");
      var0.put(392, "minecraft:potato");
      var0.put(393, "minecraft:baked_potato");
      var0.put(394, "minecraft:poisonous_potato");
      var0.put(395, "minecraft:map");
      var0.put(396, "minecraft:golden_carrot");
      var0.put(397, "minecraft:skull");
      var0.put(398, "minecraft:carrot_on_a_stick");
      var0.put(399, "minecraft:nether_star");
      var0.put(400, "minecraft:pumpkin_pie");
      var0.put(401, "minecraft:fireworks");
      var0.put(402, "minecraft:firework_charge");
      var0.put(403, "minecraft:enchanted_book");
      var0.put(404, "minecraft:comparator");
      var0.put(405, "minecraft:netherbrick");
      var0.put(406, "minecraft:quartz");
      var0.put(407, "minecraft:tnt_minecart");
      var0.put(408, "minecraft:hopper_minecart");
      var0.put(417, "minecraft:iron_horse_armor");
      var0.put(418, "minecraft:golden_horse_armor");
      var0.put(419, "minecraft:diamond_horse_armor");
      var0.put(420, "minecraft:lead");
      var0.put(421, "minecraft:name_tag");
      var0.put(422, "minecraft:command_block_minecart");
      var0.put(2256, "minecraft:record_13");
      var0.put(2257, "minecraft:record_cat");
      var0.put(2258, "minecraft:record_blocks");
      var0.put(2259, "minecraft:record_chirp");
      var0.put(2260, "minecraft:record_far");
      var0.put(2261, "minecraft:record_mall");
      var0.put(2262, "minecraft:record_mellohi");
      var0.put(2263, "minecraft:record_stal");
      var0.put(2264, "minecraft:record_strad");
      var0.put(2265, "minecraft:record_ward");
      var0.put(2266, "minecraft:record_11");
      var0.put(2267, "minecraft:record_wait");
      var0.defaultReturnValue("minecraft:air");
   });

   public Class8105(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public static String method28074(int var0) {
      return (String)field34832.get(var0);
   }

   public TypeRewriteRule makeRule() {
      Type<Either<Integer, Pair<String, String>>> var3 = DSL.or(DSL.intType(), DSL.named(TypeReferences.field35393.typeName(), Class3639.method12354()));
      Type<Pair<String, String>> var4 = DSL.named(TypeReferences.field35393.typeName(), Class3639.method12354());
      OpticFinder<Either<Integer, Pair<String, String>>> var5 = DSL.fieldFinder("id", var3);
      return this.fixTypeEverywhereTyped(
         "ItemIdFix",
         this.getInputSchema().getType(TypeReferences.field35387),
         this.getOutputSchema().getType(TypeReferences.field35387),
         var2 -> var2.update(var5, var4, var0x -> var0x.map(var0xx -> Pair.of(TypeReferences.field35393.typeName(), method28074(var0xx)), var0xx -> var0xx))
      );
   }
}
