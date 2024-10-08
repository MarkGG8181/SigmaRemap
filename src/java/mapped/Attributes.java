package mapped;

import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.util.registry.Registry;

public class Attributes {
   public static final Attribute field42105 = method34279(
      "generic.max_health", new Class4870("attribute.name.generic.max_health", 20.0, 1.0, 1024.0).method15030(true)
   );
   public static final Attribute field42106 = method34279("generic.follow_range", new Class4870("attribute.name.generic.follow_range", 32.0, 0.0, 2048.0));
   public static final Attribute field42107 = method34279(
      "generic.knockback_resistance", new Class4870("attribute.name.generic.knockback_resistance", 0.0, 0.0, 1.0)
   );
   public static final Attribute MOVEMENT_SPEED = method34279(
      "generic.movement_speed", new Class4870("attribute.name.generic.movement_speed", 0.7F, 0.0, 1024.0).method15030(true)
   );
   public static final Attribute field42109 = method34279(
      "generic.flying_speed", new Class4870("attribute.name.generic.flying_speed", 0.4F, 0.0, 1024.0).method15030(true)
   );
   public static final Attribute ATTACK_DAMAGE = method34279("generic.attack_damage", new Class4870("attribute.name.generic.attack_damage", 2.0, 0.0, 2048.0));
   public static final Attribute field42111 = method34279("generic.attack_knockback", new Class4870("attribute.name.generic.attack_knockback", 0.0, 0.0, 5.0));
   public static final Attribute ATTACK_SPEED = method34279(
      "generic.attack_speed", new Class4870("attribute.name.generic.attack_speed", 4.0, 0.0, 1024.0).method15030(true)
   );
   public static final Attribute field42113 = method34279("generic.armor", new Class4870("attribute.name.generic.armor", 0.0, 0.0, 30.0).method15030(true));
   public static final Attribute field42114 = method34279(
      "generic.armor_toughness", new Class4870("attribute.name.generic.armor_toughness", 0.0, 0.0, 20.0).method15030(true)
   );
   public static final Attribute LUCK = method34279("generic.luck", new Class4870("attribute.name.generic.luck", 0.0, -1024.0, 1024.0).method15030(true));
   public static final Attribute field42116 = method34279(
      "zombie.spawn_reinforcements", new Class4870("attribute.name.zombie.spawn_reinforcements", 0.0, 0.0, 1.0)
   );
   public static final Attribute field42117 = method34279(
      "horse.jump_strength", new Class4870("attribute.name.horse.jump_strength", 0.7, 0.0, 2.0).method15030(true)
   );

   private static Attribute method34279(String var0, Attribute var1) {
      return Registry.<Attribute>register(Registry.ATTRIBUTE, var0, var1);
   }
}
