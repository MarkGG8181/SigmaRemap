package mapped;

public enum Class1915 implements Class1913 {
   field11438("SPAWN_ENTITY"),
   field11439("SPAWN_EXPERIENCE_ORB"),
   field11440("SPAWN_GLOBAL_ENTITY"),
   field11441("SPAWN_MOB"),
   field11442("SPAWN_PAINTING"),
   field11443("SPAWN_PLAYER"),
   field11444("ENTITY_ANIMATION"),
   field11445("STATISTICS"),
   field11446("BLOCK_BREAK_ANIMATION"),
   field11447("BLOCK_ENTITY_DATA"),
   field11448("BLOCK_ACTION"),
   field11449("BLOCK_CHANGE"),
   field11450("BOSSBAR"),
   field11451("SERVER_DIFFICULTY"),
   field11452("CHAT_MESSAGE"),
   field11453("MULTI_BLOCK_CHANGE"),
   field11454("TAB_COMPLETE"),
   field11455("DECLARE_COMMANDS"),
   field11456("WINDOW_CONFIRMATION"),
   field11457("CLOSE_WINDOW"),
   field11458("WINDOW_ITEMS"),
   field11459("WINDOW_PROPERTY"),
   field11460("SET_SLOT"),
   field11461("COOLDOWN"),
   field11462("PLUGIN_MESSAGE"),
   field11463("NAMED_SOUND"),
   field11464("DISCONNECT"),
   field11465("ENTITY_STATUS"),
   field11466("EXPLOSION"),
   field11467("UNLOAD_CHUNK"),
   field11468("GAME_EVENT"),
   field11469("OPEN_HORSE_WINDOW"),
   field11470("KEEP_ALIVE"),
   field11471("CHUNK_DATA"),
   field11472("EFFECT"),
   field11473("SPAWN_PARTICLE"),
   field11474("UPDATE_LIGHT"),
   field11475("JOIN_GAME"),
   field11476("MAP_DATA"),
   field11477("TRADE_LIST"),
   field11478("ENTITY_POSITION"),
   field11479("ENTITY_POSITION_AND_ROTATION"),
   field11480("ENTITY_ROTATION"),
   field11481("ENTITY_MOVEMENT"),
   field11482("VEHICLE_MOVE"),
   field11483("OPEN_BOOK"),
   field11484("OPEN_WINDOW"),
   field11485("OPEN_SIGN_EDITOR"),
   field11486("CRAFT_RECIPE_RESPONSE"),
   field11487("PLAYER_ABILITIES"),
   field11488("COMBAT_EVENT"),
   field11489("PLAYER_INFO"),
   field11490("FACE_PLAYER"),
   field11491("PLAYER_POSITION"),
   field11492("UNLOCK_RECIPES"),
   field11493("DESTROY_ENTITIES"),
   field11494("REMOVE_ENTITY_EFFECT"),
   field11495("RESOURCE_PACK"),
   field11496("RESPAWN"),
   field11497("ENTITY_HEAD_LOOK"),
   field11498("SELECT_ADVANCEMENTS_TAB"),
   field11499("WORLD_BORDER"),
   field11500("CAMERA"),
   field11501("HELD_ITEM_CHANGE"),
   field11502("UPDATE_VIEW_POSITION"),
   field11503("UPDATE_VIEW_DISTANCE"),
   field11504("DISPLAY_SCOREBOARD"),
   field11505("ENTITY_METADATA"),
   field11506("ATTACH_ENTITY"),
   field11507("ENTITY_VELOCITY"),
   field11508("ENTITY_EQUIPMENT"),
   field11509("SET_EXPERIENCE"),
   field11510("UPDATE_HEALTH"),
   field11511("SCOREBOARD_OBJECTIVE"),
   field11512("SET_PASSENGERS"),
   field11513("TEAMS"),
   field11514("UPDATE_SCORE"),
   field11515("SPAWN_POSITION"),
   field11516("TIME_UPDATE"),
   field11517("TITLE"),
   field11518("ENTITY_SOUND"),
   field11519("SOUND"),
   field11520("STOP_SOUND"),
   field11521("TAB_LIST"),
   field11522("NBT_QUERY"),
   field11523("COLLECT_ITEM"),
   field11524("ENTITY_TELEPORT"),
   field11525("ADVANCEMENTS"),
   field11526("ENTITY_PROPERTIES"),
   field11527("ENTITY_EFFECT"),
   field11528("DECLARE_RECIPES"),
   field11529("TAGS"),
   field11530("ACKNOWLEDGE_PLAYER_DIGGING");

   public String field11531;
   private static final Class1915[] field11532 = new Class1915[]{
      field11438,
      field11439,
      field11440,
      field11441,
      field11442,
      field11443,
      field11444,
      field11445,
      field11446,
      field11447,
      field11448,
      field11449,
      field11450,
      field11451,
      field11452,
      field11453,
      field11454,
      field11455,
      field11456,
      field11457,
      field11458,
      field11459,
      field11460,
      field11461,
      field11462,
      field11463,
      field11464,
      field11465,
      field11466,
      field11467,
      field11468,
      field11469,
      field11470,
      field11471,
      field11472,
      field11473,
      field11474,
      field11475,
      field11476,
      field11477,
      field11478,
      field11479,
      field11480,
      field11481,
      field11482,
      field11483,
      field11484,
      field11485,
      field11486,
      field11487,
      field11488,
      field11489,
      field11490,
      field11491,
      field11492,
      field11493,
      field11494,
      field11495,
      field11496,
      field11497,
      field11498,
      field11499,
      field11500,
      field11501,
      field11502,
      field11503,
      field11504,
      field11505,
      field11506,
      field11507,
      field11508,
      field11509,
      field11510,
      field11511,
      field11512,
      field11513,
      field11514,
      field11515,
      field11516,
      field11517,
      field11518,
      field11519,
      field11520,
      field11521,
      field11522,
      field11523,
      field11524,
      field11525,
      field11526,
      field11527,
      field11528,
      field11529,
      field11530
   };

   private Class1915(String var3) {
      this.field11531 = var3;
   }

   @Override
   public String method8193() {
      return this.field11531;
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
