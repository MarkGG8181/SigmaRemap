package mapped;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.ToIntFunction;

public enum Class2319 {
   field15891("points", PlayerEntity::method2781, (var0, var1) -> {
      if (var1 < var0.method2930()) {
         var0.method2725(var1);
         return true;
      } else {
         return false;
      }
   }, var0 -> Class9679.method37767(var0.field4922 * (float)var0.method2930())),
   field15892("levels", Class878::method2727, (var0, var1) -> {
      var0.method2726(var1);
      return true;
   }, var0 -> var0.field4920);

   public final BiConsumer<Class878, Integer> field15893;
   public final BiPredicate<Class878, Integer> field15894;
   public final String field15895;
   private final ToIntFunction<Class878> field15896;
   private static final Class2319[] field15897 = new Class2319[]{field15891, field15892};

   private Class2319(String var3, BiConsumer<Class878, Integer> var4, BiPredicate<Class878, Integer> var5, ToIntFunction<Class878> var6) {
      this.field15893 = var4;
      this.field15895 = var3;
      this.field15894 = var5;
      this.field15896 = var6;
   }

   // $VF: synthetic method
   public static ToIntFunction method9097(Class2319 var0) {
      return var0.field15896;
   }
}
