package mapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum Class1869 implements Class1867 {
   field10278(-1, "ENTITY"),
   field10279(0, field10278, "AREA_EFFECT_CLOUD"),
   field10280(18, field10278, "END_CRYSTAL"),
   field10281(23, field10278, "EVOKER_FANGS"),
   field10282(24, field10278, "EXPERIENCE_ORB"),
   field10283(25, field10278, "EYE_OF_ENDER"),
   field10284(26, field10278, "FALLING_BLOCK"),
   field10285(27, field10278, "FIREWORK_ROCKET"),
   field10286(37, field10278, "ITEM"),
   field10287(43, field10278, "LLAMA_SPIT"),
   field10288(63, field10278, "TNT"),
   field10289(70, field10278, "SHULKER_BULLET"),
   field10290(106, field10278, "FISHING_BOBBER"),
   field10291(-1, field10278, "LIVINGENTITY"),
   field10292(1, field10291, "ARMOR_STAND"),
   field10293(105, field10291, "PLAYER"),
   field10294(-1, field10291, "ABSTRACT_INSENTIENT"),
   field10295(19, field10294, "ENDER_DRAGON"),
   field10296(4, field10294, "BEE"),
   field10297(-1, field10294, "ABSTRACT_CREATURE"),
   field10298(-1, field10297, "ABSTRACT_AGEABLE"),
   field10299(92, field10298, "VILLAGER"),
   field10300(94, field10298, "WANDERING_TRADER"),
   field10301(-1, field10298, "ABSTRACT_ANIMAL"),
   field10302(13, field10294, "DOLPHIN"),
   field10303(9, field10301, "CHICKEN"),
   field10304(11, field10301, "COW"),
   field10305(53, field10304, "MOOSHROOM"),
   field10306(56, field10294, "PANDA"),
   field10307(59, field10301, "PIG"),
   field10308(62, field10301, "POLAR_BEAR"),
   field10309(65, field10301, "RABBIT"),
   field10310(68, field10301, "SHEEP"),
   field10311(90, field10301, "TURTLE"),
   field10312(28, field10301, "FOX"),
   field10313(-1, field10301, "ABSTRACT_TAMEABLE_ANIMAL"),
   field10314(7, field10313, "CAT"),
   field10315(54, field10313, "OCELOT"),
   field10316(99, field10313, "WOLF"),
   field10317(-1, field10313, "ABSTRACT_PARROT"),
   field10318(57, field10317, "PARROT"),
   field10319(-1, field10301, "ABSTRACT_HORSE"),
   field10320(-1, field10319, "CHESTED_HORSE"),
   field10321(14, field10320, "DONKEY"),
   field10322(52, field10320, "MULE"),
   field10323(42, field10320, "LLAMA"),
   field10324(88, field10320, "TRADER_LLAMA"),
   field10325(33, field10319, "HORSE"),
   field10326(73, field10319, "SKELETON_HORSE"),
   field10327(102, field10319, "ZOMBIE_HORSE"),
   field10328(-1, field10297, "ABSTRACT_GOLEM"),
   field10329(76, field10328, "SNOW_GOLEM"),
   field10330(36, field10328, "IRON_GOLEM"),
   field10331(69, field10328, "SHULKER"),
   field10332(-1, field10297, "ABSTRACT_FISHES"),
   field10333(10, field10332, "COD"),
   field10334(64, field10332, "PUFFERFISH"),
   field10335(67, field10332, "SALMON"),
   field10336(89, field10332, "TROPICAL_FISH"),
   field10337(-1, field10297, "ABSTRACT_MONSTER"),
   field10338(5, field10337, "BLAZE"),
   field10339(12, field10337, "CREEPER"),
   field10340(21, field10337, "ENDERMITE"),
   field10341(20, field10337, "ENDERMAN"),
   field10342(30, field10337, "GIANT"),
   field10343(71, field10337, "SILVERFISH"),
   field10344(91, field10337, "VEX"),
   field10345(95, field10337, "WITCH"),
   field10346(96, field10337, "WITHER"),
   field10347(66, field10337, "RAVAGER"),
   field10348(60, field10337, "PIGLIN"),
   field10349(32, field10301, "HOGLIN"),
   field10350(82, field10301, "STRIDER"),
   field10351(100, field10337, "ZOGLIN"),
   field10352(-1, field10337, "ABSTRACT_ILLAGER_BASE"),
   field10353(-1, field10352, "ABSTRACT_EVO_ILLU_ILLAGER"),
   field10354(22, field10353, "EVOKER"),
   field10355(35, field10353, "ILLUSIONER"),
   field10356(93, field10352, "VINDICATOR"),
   field10357(61, field10352, "PILLAGER"),
   field10358(-1, field10337, "ABSTRACT_SKELETON"),
   field10359(72, field10358, "SKELETON"),
   field10360(81, field10358, "STRAY"),
   field10361(97, field10358, "WITHER_SKELETON"),
   field10362(31, field10337, "GUARDIAN"),
   field10363(17, field10362, "ELDER_GUARDIAN"),
   field10364(79, field10337, "SPIDER"),
   field10365(8, field10364, "CAVE_SPIDER"),
   field10366(101, field10337, "ZOMBIE"),
   field10367(16, field10366, "DROWNED"),
   field10368(34, field10366, "HUSK"),
   field10369(104, field10366, "ZOMBIFIED_PIGLIN"),
   field10370(103, field10366, "ZOMBIE_VILLAGER"),
   field10371(-1, field10294, "ABSTRACT_FLYING"),
   field10372(29, field10371, "GHAST"),
   field10373(58, field10371, "PHANTOM"),
   field10374(-1, field10294, "ABSTRACT_AMBIENT"),
   field10375(3, field10374, "BAT"),
   field10376(-1, field10294, "ABSTRACT_WATERMOB"),
   field10377(80, field10376, "SQUID"),
   field10378(74, field10294, "SLIME"),
   field10379(44, field10378, "MAGMA_CUBE"),
   field10380(-1, field10278, "ABSTRACT_HANGING"),
   field10381(40, field10380, "LEASH_KNOT"),
   field10382(38, field10380, "ITEM_FRAME"),
   field10383(55, field10380, "PAINTING"),
   field10384(-1, field10278, "ABSTRACT_LIGHTNING"),
   field10385(41, field10384, "LIGHTNING_BOLT"),
   field10386(-1, field10278, "ABSTRACT_ARROW"),
   field10387(2, field10386, "ARROW"),
   field10388(78, field10386, "SPECTRAL_ARROW"),
   field10389(87, field10386, "TRIDENT"),
   field10390(-1, field10278, "ABSTRACT_FIREBALL"),
   field10391(15, field10390, "DRAGON_FIREBALL"),
   field10392(39, field10390, "FIREBALL"),
   field10393(75, field10390, "SMALL_FIREBALL"),
   field10394(98, field10390, "WITHER_SKULL"),
   field10395(-1, field10278, "PROJECTILE_ABSTRACT"),
   field10396(77, field10395, "SNOWBALL"),
   field10397(84, field10395, "ENDER_PEARL"),
   field10398(83, field10395, "EGG"),
   field10399(86, field10395, "POTION"),
   field10400(85, field10395, "EXPERIENCE_BOTTLE"),
   field10401(-1, field10278, "MINECART_ABSTRACT"),
   field10402(-1, field10401, "CHESTED_MINECART_ABSTRACT"),
   field10403(46, field10402, "CHEST_MINECART"),
   field10404(49, field10402, "HOPPER_MINECART"),
   field10405(45, field10401, "MINECART"),
   field10406(48, field10401, "FURNACE_MINECART"),
   field10407(47, field10401, "COMMAND_BLOCK_MINECART"),
   field10408(51, field10401, "TNT_MINECART"),
   field10409(50, field10401, "SPAWNER_MINECART"),
   field10410(6, field10278, "BOAT");

   private static final Map<Integer, Class1869> field10411 = new HashMap<Integer, Class1869>();
   private final int field10412;
   private final Class1869 field10413;
   private String field10414;
   private static final Class1869[] field10415 = new Class1869[]{
      field10278,
      field10279,
      field10280,
      field10281,
      field10282,
      field10283,
      field10284,
      field10285,
      field10286,
      field10287,
      field10288,
      field10289,
      field10290,
      field10291,
      field10292,
      field10293,
      field10294,
      field10295,
      field10296,
      field10297,
      field10298,
      field10299,
      field10300,
      field10301,
      field10302,
      field10303,
      field10304,
      field10305,
      field10306,
      field10307,
      field10308,
      field10309,
      field10310,
      field10311,
      field10312,
      field10313,
      field10314,
      field10315,
      field10316,
      field10317,
      field10318,
      field10319,
      field10320,
      field10321,
      field10322,
      field10323,
      field10324,
      field10325,
      field10326,
      field10327,
      field10328,
      field10329,
      field10330,
      field10331,
      field10332,
      field10333,
      field10334,
      field10335,
      field10336,
      field10337,
      field10338,
      field10339,
      field10340,
      field10341,
      field10342,
      field10343,
      field10344,
      field10345,
      field10346,
      field10347,
      field10348,
      field10349,
      field10350,
      field10351,
      field10352,
      field10353,
      field10354,
      field10355,
      field10356,
      field10357,
      field10358,
      field10359,
      field10360,
      field10361,
      field10362,
      field10363,
      field10364,
      field10365,
      field10366,
      field10367,
      field10368,
      field10369,
      field10370,
      field10371,
      field10372,
      field10373,
      field10374,
      field10375,
      field10376,
      field10377,
      field10378,
      field10379,
      field10380,
      field10381,
      field10382,
      field10383,
      field10384,
      field10385,
      field10386,
      field10387,
      field10388,
      field10389,
      field10390,
      field10391,
      field10392,
      field10393,
      field10394,
      field10395,
      field10396,
      field10397,
      field10398,
      field10399,
      field10400,
      field10401,
      field10402,
      field10403,
      field10404,
      field10405,
      field10406,
      field10407,
      field10408,
      field10409,
      field10410
   };

   private Class1869(int var3, String var4) {
      this.field10412 = var3;
      this.field10413 = null;
      this.field10414 = var4;
   }

   private Class1869(int var3, Class1869 var4, String var5) {
      this.field10412 = var3;
      this.field10413 = var4;
      this.field10414 = var5;
   }

   @Override
   public int method8121() {
      return this.field10412;
   }

   public Class1869 method8125() {
      return this.field10413;
   }

   public static Optional<Class1869> method8130(int var0) {
      return var0 != -1 ? Optional.<Class1869>ofNullable(field10411.get(var0)) : Optional.<Class1869>empty();
   }

   @Override
   public String method8124() {
      return this.field10414;
   }

   static {
      for (Class1869 var9 : values()) {
         field10411.put(var9.field10412, var9);
      }
   }
}
