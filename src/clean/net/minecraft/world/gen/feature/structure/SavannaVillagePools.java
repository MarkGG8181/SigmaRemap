package net.minecraft.world.gen.feature.structure;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.jigsaw.JigsawPattern;
import net.minecraft.world.gen.feature.jigsaw.JigsawPatternRegistry;
import net.minecraft.world.gen.feature.jigsaw.JigsawPiece;
import net.minecraft.world.gen.feature.template.ProcessorLists;

public class SavannaVillagePools
{
    public static final JigsawPattern field_244128_a = JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation("village/savanna/town_centers"), new ResourceLocation("empty"), ImmutableList.of(Pair.of(JigsawPiece.func_242849_a("village/savanna/town_centers/savanna_meeting_point_1"), 100), Pair.of(JigsawPiece.func_242849_a("village/savanna/town_centers/savanna_meeting_point_2"), 50), Pair.of(JigsawPiece.func_242849_a("village/savanna/town_centers/savanna_meeting_point_3"), 150), Pair.of(JigsawPiece.func_242849_a("village/savanna/town_centers/savanna_meeting_point_4"), 150), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/town_centers/savanna_meeting_point_1", ProcessorLists.field_244103_c), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/town_centers/savanna_meeting_point_2", ProcessorLists.field_244103_c), 1), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/town_centers/savanna_meeting_point_3", ProcessorLists.field_244103_c), 3), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/town_centers/savanna_meeting_point_4", ProcessorLists.field_244103_c), 3)), JigsawPattern.PlacementBehaviour.RIGID));

    public static void init()
    {
    }

    static
    {
        JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation("village/savanna/streets"), new ResourceLocation("village/savanna/terminators"), ImmutableList.of(Pair.of(JigsawPiece.func_242851_a("village/savanna/streets/corner_01", ProcessorLists.field_244111_k), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/streets/corner_03", ProcessorLists.field_244111_k), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/streets/straight_02", ProcessorLists.field_244111_k), 4), Pair.of(JigsawPiece.func_242851_a("village/savanna/streets/straight_04", ProcessorLists.field_244111_k), 7), Pair.of(JigsawPiece.func_242851_a("village/savanna/streets/straight_05", ProcessorLists.field_244111_k), 3), Pair.of(JigsawPiece.func_242851_a("village/savanna/streets/straight_06", ProcessorLists.field_244111_k), 4), Pair.of(JigsawPiece.func_242851_a("village/savanna/streets/straight_08", ProcessorLists.field_244111_k), 4), Pair.of(JigsawPiece.func_242851_a("village/savanna/streets/straight_09", ProcessorLists.field_244111_k), 4), Pair.of(JigsawPiece.func_242851_a("village/savanna/streets/straight_10", ProcessorLists.field_244111_k), 4), Pair.of(JigsawPiece.func_242851_a("village/savanna/streets/straight_11", ProcessorLists.field_244111_k), 4), Pair.of(JigsawPiece.func_242851_a("village/savanna/streets/crossroad_02", ProcessorLists.field_244111_k), 1), Pair.of(JigsawPiece.func_242851_a("village/savanna/streets/crossroad_03", ProcessorLists.field_244111_k), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/streets/crossroad_04", ProcessorLists.field_244111_k), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/streets/crossroad_05", ProcessorLists.field_244111_k), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/streets/crossroad_06", ProcessorLists.field_244111_k), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/streets/crossroad_07", ProcessorLists.field_244111_k), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/streets/split_01", ProcessorLists.field_244111_k), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/streets/split_02", ProcessorLists.field_244111_k), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/streets/turn_01", ProcessorLists.field_244111_k), 3)), JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING));
        JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation("village/savanna/zombie/streets"), new ResourceLocation("village/savanna/zombie/terminators"), ImmutableList.of(Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/streets/corner_01", ProcessorLists.field_244111_k), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/streets/corner_03", ProcessorLists.field_244111_k), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/streets/straight_02", ProcessorLists.field_244111_k), 4), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/streets/straight_04", ProcessorLists.field_244111_k), 7), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/streets/straight_05", ProcessorLists.field_244111_k), 3), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/streets/straight_06", ProcessorLists.field_244111_k), 4), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/streets/straight_08", ProcessorLists.field_244111_k), 4), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/streets/straight_09", ProcessorLists.field_244111_k), 4), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/streets/straight_10", ProcessorLists.field_244111_k), 4), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/streets/straight_11", ProcessorLists.field_244111_k), 4), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/streets/crossroad_02", ProcessorLists.field_244111_k), 1), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/streets/crossroad_03", ProcessorLists.field_244111_k), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/streets/crossroad_04", ProcessorLists.field_244111_k), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/streets/crossroad_05", ProcessorLists.field_244111_k), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/streets/crossroad_06", ProcessorLists.field_244111_k), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/streets/crossroad_07", ProcessorLists.field_244111_k), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/streets/split_01", ProcessorLists.field_244111_k), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/streets/split_02", ProcessorLists.field_244111_k), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/streets/turn_01", ProcessorLists.field_244111_k), 3)), JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING));
        JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation("village/savanna/houses"), new ResourceLocation("village/savanna/terminators"), ImmutableList.of(Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_small_house_1"), 2), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_small_house_2"), 2), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_small_house_3"), 2), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_small_house_4"), 2), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_small_house_5"), 2), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_small_house_6"), 2), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_small_house_7"), 2), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_small_house_8"), 2), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_medium_house_1"), 2), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_medium_house_2"), 2), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_butchers_shop_1"), 2), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_butchers_shop_2"), 2), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_tool_smith_1"), 2), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_fletcher_house_1"), 2), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_shepherd_1"), 7), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_armorer_1"), 1), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_fisher_cottage_1"), 3), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_tannery_1"), 2), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_cartographer_1"), 2), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_library_1"), 2), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_mason_1"), 2), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_weaponsmith_1"), 2), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_weaponsmith_2"), 2), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_temple_1"), 2), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_temple_2"), 3), Pair.of(JigsawPiece.func_242851_a("village/savanna/houses/savanna_large_farm_1", ProcessorLists.field_244114_n), 4), Pair.of(JigsawPiece.func_242851_a("village/savanna/houses/savanna_large_farm_2", ProcessorLists.field_244114_n), 6), Pair.of(JigsawPiece.func_242851_a("village/savanna/houses/savanna_small_farm", ProcessorLists.field_244114_n), 4), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_animal_pen_1"), 2), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_animal_pen_2"), 2), Pair.of(JigsawPiece.func_242849_a("village/savanna/houses/savanna_animal_pen_3"), 2), Pair.of(JigsawPiece.func_242864_g(), 5)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation("village/savanna/zombie/houses"), new ResourceLocation("village/savanna/zombie/terminators"), ImmutableList.of(Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/houses/savanna_small_house_1", ProcessorLists.field_244103_c), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/houses/savanna_small_house_2", ProcessorLists.field_244103_c), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/houses/savanna_small_house_3", ProcessorLists.field_244103_c), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/houses/savanna_small_house_4", ProcessorLists.field_244103_c), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/houses/savanna_small_house_5", ProcessorLists.field_244103_c), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/houses/savanna_small_house_6", ProcessorLists.field_244103_c), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/houses/savanna_small_house_7", ProcessorLists.field_244103_c), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/houses/savanna_small_house_8", ProcessorLists.field_244103_c), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/houses/savanna_medium_house_1", ProcessorLists.field_244103_c), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/houses/savanna_medium_house_2", ProcessorLists.field_244103_c), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/houses/savanna_butchers_shop_1", ProcessorLists.field_244103_c), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/houses/savanna_butchers_shop_2", ProcessorLists.field_244103_c), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/houses/savanna_tool_smith_1", ProcessorLists.field_244103_c), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/houses/savanna_fletcher_house_1", ProcessorLists.field_244103_c), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/houses/savanna_shepherd_1", ProcessorLists.field_244103_c), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/houses/savanna_armorer_1", ProcessorLists.field_244103_c), 1), Pair.of(JigsawPiece.func_242851_a("village/savanna/houses/savanna_fisher_cottage_1", ProcessorLists.field_244103_c), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/houses/savanna_tannery_1", ProcessorLists.field_244103_c), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/houses/savanna_cartographer_1", ProcessorLists.field_244103_c), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/houses/savanna_library_1", ProcessorLists.field_244103_c), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/houses/savanna_mason_1", ProcessorLists.field_244103_c), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/houses/savanna_weaponsmith_1", ProcessorLists.field_244103_c), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/houses/savanna_weaponsmith_2", ProcessorLists.field_244103_c), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/houses/savanna_temple_1", ProcessorLists.field_244103_c), 1), Pair.of(JigsawPiece.func_242851_a("village/savanna/houses/savanna_temple_2", ProcessorLists.field_244103_c), 3), Pair.of(JigsawPiece.func_242851_a("village/savanna/houses/savanna_large_farm_1", ProcessorLists.field_244103_c), 4), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/houses/savanna_large_farm_2", ProcessorLists.field_244103_c), 4), Pair.of(JigsawPiece.func_242851_a("village/savanna/houses/savanna_small_farm", ProcessorLists.field_244103_c), 4), Pair.of(JigsawPiece.func_242851_a("village/savanna/houses/savanna_animal_pen_1", ProcessorLists.field_244103_c), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/houses/savanna_animal_pen_2", ProcessorLists.field_244103_c), 2), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/houses/savanna_animal_pen_3", ProcessorLists.field_244103_c), 2), Pair.of(JigsawPiece.func_242864_g(), 5)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation("village/savanna/terminators"), new ResourceLocation("empty"), ImmutableList.of(Pair.of(JigsawPiece.func_242851_a("village/plains/terminators/terminator_01", ProcessorLists.field_244111_k), 1), Pair.of(JigsawPiece.func_242851_a("village/plains/terminators/terminator_02", ProcessorLists.field_244111_k), 1), Pair.of(JigsawPiece.func_242851_a("village/plains/terminators/terminator_03", ProcessorLists.field_244111_k), 1), Pair.of(JigsawPiece.func_242851_a("village/plains/terminators/terminator_04", ProcessorLists.field_244111_k), 1), Pair.of(JigsawPiece.func_242851_a("village/savanna/terminators/terminator_05", ProcessorLists.field_244111_k), 1)), JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING));
        JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation("village/savanna/zombie/terminators"), new ResourceLocation("empty"), ImmutableList.of(Pair.of(JigsawPiece.func_242851_a("village/plains/terminators/terminator_01", ProcessorLists.field_244111_k), 1), Pair.of(JigsawPiece.func_242851_a("village/plains/terminators/terminator_02", ProcessorLists.field_244111_k), 1), Pair.of(JigsawPiece.func_242851_a("village/plains/terminators/terminator_03", ProcessorLists.field_244111_k), 1), Pair.of(JigsawPiece.func_242851_a("village/plains/terminators/terminator_04", ProcessorLists.field_244111_k), 1), Pair.of(JigsawPiece.func_242851_a("village/savanna/zombie/terminators/terminator_05", ProcessorLists.field_244111_k), 1)), JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING));
        JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation("village/savanna/trees"), new ResourceLocation("empty"), ImmutableList.of(Pair.of(JigsawPiece.func_242845_a(Features.ACACIA), 1)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation("village/savanna/decor"), new ResourceLocation("empty"), ImmutableList.of(Pair.of(JigsawPiece.func_242849_a("village/savanna/savanna_lamp_post_01"), 4), Pair.of(JigsawPiece.func_242845_a(Features.ACACIA), 4), Pair.of(JigsawPiece.func_242845_a(Features.PILE_HAY), 4), Pair.of(JigsawPiece.func_242845_a(Features.PILE_MELON), 1), Pair.of(JigsawPiece.func_242864_g(), 4)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation("village/savanna/zombie/decor"), new ResourceLocation("empty"), ImmutableList.of(Pair.of(JigsawPiece.func_242851_a("village/savanna/savanna_lamp_post_01", ProcessorLists.field_244103_c), 4), Pair.of(JigsawPiece.func_242845_a(Features.ACACIA), 4), Pair.of(JigsawPiece.func_242845_a(Features.PILE_HAY), 4), Pair.of(JigsawPiece.func_242845_a(Features.PILE_MELON), 1), Pair.of(JigsawPiece.func_242864_g(), 4)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation("village/savanna/villagers"), new ResourceLocation("empty"), ImmutableList.of(Pair.of(JigsawPiece.func_242849_a("village/savanna/villagers/nitwit"), 1), Pair.of(JigsawPiece.func_242849_a("village/savanna/villagers/baby"), 1), Pair.of(JigsawPiece.func_242849_a("village/savanna/villagers/unemployed"), 10)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation("village/savanna/zombie/villagers"), new ResourceLocation("empty"), ImmutableList.of(Pair.of(JigsawPiece.func_242849_a("village/savanna/zombie/villagers/nitwit"), 1), Pair.of(JigsawPiece.func_242849_a("village/savanna/zombie/villagers/unemployed"), 10)), JigsawPattern.PlacementBehaviour.RIGID));
    }
}
