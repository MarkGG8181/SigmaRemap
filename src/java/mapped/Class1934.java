package mapped;

public enum Class1934 implements Class1913 {
   field12346("KEEP_ALIVE"),
   field12347("JOIN_GAME"),
   field12348("CHAT_MESSAGE"),
   field12349("TIME_UPDATE"),
   field12350("ENTITY_EQUIPMENT"),
   field12351("SPAWN_POSITION"),
   field12352("UPDATE_HEALTH"),
   field12353("RESPAWN"),
   field12354("PLAYER_POSITION"),
   field12355("HELD_ITEM_CHANGE"),
   field12356("USE_BED"),
   field12357("ENTITY_ANIMATION"),
   field12358("SPAWN_PLAYER"),
   field12359("COLLECT_ITEM"),
   field12360("SPAWN_ENTITY"),
   field12361("SPAWN_MOB"),
   field12362("SPAWN_PAINTING"),
   field12363("SPAWN_EXPERIENCE_ORB"),
   field12364("ENTITY_VELOCITY"),
   field12365("DESTROY_ENTITIES"),
   field12366("ENTITY_MOVEMENT"),
   field12367("ENTITY_POSITION"),
   field12368("ENTITY_ROTATION"),
   field12369("ENTITY_POSITION_AND_ROTATION"),
   field12370("ENTITY_TELEPORT"),
   field12371("ENTITY_HEAD_LOOK"),
   field12372("ENTITY_STATUS"),
   field12373("ATTACH_ENTITY"),
   field12374("ENTITY_METADATA"),
   field12375("ENTITY_EFFECT"),
   field12376("REMOVE_ENTITY_EFFECT"),
   field12377("SET_EXPERIENCE"),
   field12378("ENTITY_PROPERTIES"),
   field12379("CHUNK_DATA"),
   field12380("MULTI_BLOCK_CHANGE"),
   field12381("BLOCK_CHANGE"),
   field12382("BLOCK_ACTION"),
   field12383("BLOCK_BREAK_ANIMATION"),
   field12384("MAP_BULK_CHUNK"),
   field12385("EXPLOSION"),
   field12386("EFFECT"),
   field12387("NAMED_SOUND"),
   field12388("SPAWN_PARTICLE"),
   field12389("GAME_EVENT"),
   field12390("SPAWN_GLOBAL_ENTITY"),
   field12391("OPEN_WINDOW"),
   field12392("CLOSE_WINDOW"),
   field12393("SET_SLOT"),
   field12394("WINDOW_ITEMS"),
   field12395("WINDOW_PROPERTY"),
   field12396("WINDOW_CONFIRMATION"),
   field12397("UPDATE_SIGN"),
   field12398("MAP_DATA"),
   field12399("BLOCK_ENTITY_DATA"),
   field12400("OPEN_SIGN_EDITOR"),
   field12401("STATISTICS"),
   field12402("PLAYER_INFO"),
   field12403("PLAYER_ABILITIES"),
   field12404("TAB_COMPLETE"),
   field12405("SCOREBOARD_OBJECTIVE"),
   field12406("UPDATE_SCORE"),
   field12407("DISPLAY_SCOREBOARD"),
   field12408("TEAMS"),
   field12409("PLUGIN_MESSAGE"),
   field12410("DISCONNECT");

   public String field12411;
   private static final Class1934[] field12412 = new Class1934[]{
      field12346,
      field12347,
      field12348,
      field12349,
      field12350,
      field12351,
      field12352,
      field12353,
      field12354,
      field12355,
      field12356,
      field12357,
      field12358,
      field12359,
      field12360,
      field12361,
      field12362,
      field12363,
      field12364,
      field12365,
      field12366,
      field12367,
      field12368,
      field12369,
      field12370,
      field12371,
      field12372,
      field12373,
      field12374,
      field12375,
      field12376,
      field12377,
      field12378,
      field12379,
      field12380,
      field12381,
      field12382,
      field12383,
      field12384,
      field12385,
      field12386,
      field12387,
      field12388,
      field12389,
      field12390,
      field12391,
      field12392,
      field12393,
      field12394,
      field12395,
      field12396,
      field12397,
      field12398,
      field12399,
      field12400,
      field12401,
      field12402,
      field12403,
      field12404,
      field12405,
      field12406,
      field12407,
      field12408,
      field12409,
      field12410
   };

   private Class1934(String var3) {
      this.field12411 = var3;
   }

   @Override
   public String method8193() {
      return this.field12411;
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
