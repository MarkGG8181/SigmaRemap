package mapped;

public enum Class1917 implements Class1913 {
   field11628("SPAWN_ENTITY"),
   field11629("SPAWN_EXPERIENCE_ORB"),
   field11630("SPAWN_MOB"),
   field11631("SPAWN_PAINTING"),
   field11632("SPAWN_PLAYER"),
   field11633("ENTITY_ANIMATION"),
   field11634("STATISTICS"),
   field11635("ACKNOWLEDGE_PLAYER_DIGGING"),
   field11636("BLOCK_BREAK_ANIMATION"),
   field11637("BLOCK_ENTITY_DATA"),
   field11638("BLOCK_ACTION"),
   field11639("BLOCK_CHANGE"),
   field11640("BOSSBAR"),
   field11641("SERVER_DIFFICULTY"),
   field11642("CHAT_MESSAGE"),
   field11643("MULTI_BLOCK_CHANGE"),
   field11644("TAB_COMPLETE"),
   field11645("DECLARE_COMMANDS"),
   field11646("WINDOW_CONFIRMATION"),
   field11647("CLOSE_WINDOW"),
   field11648("WINDOW_ITEMS"),
   field11649("WINDOW_PROPERTY"),
   field11650("SET_SLOT"),
   field11651("COOLDOWN"),
   field11652("PLUGIN_MESSAGE"),
   field11653("NAMED_SOUND"),
   field11654("DISCONNECT"),
   field11655("ENTITY_STATUS"),
   field11656("EXPLOSION"),
   field11657("UNLOAD_CHUNK"),
   field11658("GAME_EVENT"),
   field11659("OPEN_HORSE_WINDOW"),
   field11660("KEEP_ALIVE"),
   field11661("CHUNK_DATA"),
   field11662("EFFECT"),
   field11663("SPAWN_PARTICLE"),
   field11664("UPDATE_LIGHT"),
   field11665("JOIN_GAME"),
   field11666("MAP_DATA"),
   field11667("TRADE_LIST"),
   field11668("ENTITY_POSITION"),
   field11669("ENTITY_POSITION_AND_ROTATION"),
   field11670("ENTITY_ROTATION"),
   field11671("ENTITY_MOVEMENT"),
   field11672("VEHICLE_MOVE"),
   field11673("OPEN_BOOK"),
   field11674("OPEN_WINDOW"),
   field11675("OPEN_SIGN_EDITOR"),
   field11676("CRAFT_RECIPE_RESPONSE"),
   field11677("PLAYER_ABILITIES"),
   field11678("COMBAT_EVENT"),
   field11679("PLAYER_INFO"),
   field11680("FACE_PLAYER"),
   field11681("PLAYER_POSITION"),
   field11682("UNLOCK_RECIPES"),
   field11683("DESTROY_ENTITIES"),
   field11684("REMOVE_ENTITY_EFFECT"),
   field11685("RESOURCE_PACK"),
   field11686("RESPAWN"),
   field11687("ENTITY_HEAD_LOOK"),
   field11688("SELECT_ADVANCEMENTS_TAB"),
   field11689("WORLD_BORDER"),
   field11690("CAMERA"),
   field11691("HELD_ITEM_CHANGE"),
   field11692("UPDATE_VIEW_POSITION"),
   field11693("UPDATE_VIEW_DISTANCE"),
   field11694("SPAWN_POSITION"),
   field11695("DISPLAY_SCOREBOARD"),
   field11696("ENTITY_METADATA"),
   field11697("ATTACH_ENTITY"),
   field11698("ENTITY_VELOCITY"),
   field11699("ENTITY_EQUIPMENT"),
   field11700("SET_EXPERIENCE"),
   field11701("UPDATE_HEALTH"),
   field11702("SCOREBOARD_OBJECTIVE"),
   field11703("SET_PASSENGERS"),
   field11704("TEAMS"),
   field11705("UPDATE_SCORE"),
   field11706("TIME_UPDATE"),
   field11707("TITLE"),
   field11708("ENTITY_SOUND"),
   field11709("SOUND"),
   field11710("STOP_SOUND"),
   field11711("TAB_LIST"),
   field11712("NBT_QUERY"),
   field11713("COLLECT_ITEM"),
   field11714("ENTITY_TELEPORT"),
   field11715("ADVANCEMENTS"),
   field11716("ENTITY_PROPERTIES"),
   field11717("ENTITY_EFFECT"),
   field11718("DECLARE_RECIPES"),
   field11719("TAGS");

   public String field11720;
   private static final Class1917[] field11721 = new Class1917[]{
      field11628,
      field11629,
      field11630,
      field11631,
      field11632,
      field11633,
      field11634,
      field11635,
      field11636,
      field11637,
      field11638,
      field11639,
      field11640,
      field11641,
      field11642,
      field11643,
      field11644,
      field11645,
      field11646,
      field11647,
      field11648,
      field11649,
      field11650,
      field11651,
      field11652,
      field11653,
      field11654,
      field11655,
      field11656,
      field11657,
      field11658,
      field11659,
      field11660,
      field11661,
      field11662,
      field11663,
      field11664,
      field11665,
      field11666,
      field11667,
      field11668,
      field11669,
      field11670,
      field11671,
      field11672,
      field11673,
      field11674,
      field11675,
      field11676,
      field11677,
      field11678,
      field11679,
      field11680,
      field11681,
      field11682,
      field11683,
      field11684,
      field11685,
      field11686,
      field11687,
      field11688,
      field11689,
      field11690,
      field11691,
      field11692,
      field11693,
      field11694,
      field11695,
      field11696,
      field11697,
      field11698,
      field11699,
      field11700,
      field11701,
      field11702,
      field11703,
      field11704,
      field11705,
      field11706,
      field11707,
      field11708,
      field11709,
      field11710,
      field11711,
      field11712,
      field11713,
      field11714,
      field11715,
      field11716,
      field11717,
      field11718,
      field11719
   };

   private Class1917(String var3) {
      this.field11720 = var3;
   }

   @Override
   public String method8193() {
      return this.field11720;
   }

   @Override
   public int method8194() {
      for (int var3 = 0; var3 < values().length; var3++) {
         if (values()[var3] == this) {
            return var3;
         }
      }

      return 0;
   }
}
