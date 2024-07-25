package remapped;

import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class class_3572 {
   private static String[] field_17486;
   public static final Predicate<Entity> field_17481 = Entity::isAlive;
   public static final Predicate<class_5834> field_17482 = class_5834::isAlive;
   public static final Predicate<Entity> field_17484 = var0 -> var0.isAlive() && !var0.method_37151() && !var0.isPassenger();
   public static final Predicate<Entity> field_17485 = var0 -> var0 instanceof class_6867 && var0.isAlive();
   public static final Predicate<Entity> field_17479 = var0 -> !(var0 instanceof PlayerEntity) || !var0.method_37221() && !((PlayerEntity)var0).method_3186();
   public static final Predicate<Entity> field_17480 = var0 -> !(var0 instanceof PlayerEntity)
         || !var0.method_37221() && !((PlayerEntity)var0).method_3186() && var0.world.method_43370() != class_423.field_1790;
   public static final Predicate<Entity> field_17483 = var0 -> !var0.method_37221();

   public static Predicate<Entity> method_16617(double var0, double var2, double var4, double var6) {
      double var10 = var6 * var6;
      return var8 -> var8 != null && var8.method_37273(var0, var2, var4) <= var10;
   }

   public static Predicate<Entity> method_16616(Entity var0) {
      class_5086 var3 = var0.method_37095();
      class_5006 var4 = var3 != null ? var3.method_23382() : class_5006.field_25901;
      return (Predicate<Entity>)(var4 != class_5006.field_25900
         ? field_17483.and(
            var3x -> {
               if (!var3x.method_37177()) {
                  return false;
               } else if (!var0.world.field_33055 || var3x instanceof PlayerEntity && ((PlayerEntity)var3x).method_3183()) {
                  class_5086 var6 = var3x.method_37095();
                  class_5006 var7 = var6 != null ? var6.method_23382() : class_5006.field_25901;
                  if (var7 == class_5006.field_25900) {
                     return false;
                  } else {
                     boolean var8 = var3 != null && var3.method_23384(var6);
                     return (var4 == class_5006.field_25896 || var7 == class_5006.field_25896) && var8
                        ? false
                        : var4 != class_5006.field_25898 && var7 != class_5006.field_25898 || var8;
                  }
               } else {
                  return false;
               }
            }
         )
         : Predicates.alwaysFalse());
   }

   public static Predicate<Entity> method_16614(Entity var0) {
      return var1 -> {
         while (var1.isPassenger()) {
            var1 = var1.method_37243();
            if (var1 == var0) {
               return false;
            }
         }

         return true;
      };
   }
}
