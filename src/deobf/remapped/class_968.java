package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class class_968<T> implements class_3065<T> {
   private final List<class_723<T>> field_4962;
   private final Function<T, class_4639> field_4961;

   public class_968(Function<T, class_4639> var1, List<class_4110<T>> var2, long var3) {
      this(
         var1,
         var2.stream()
            .<class_723>map(var2x -> new class_723(var2x.method_19096(), var2x.field_20034, (int)(var2x.field_20036 - var3), var2x.field_20035, null))
            .collect(Collectors.<class_723<T>>toList())
      );
   }

   private class_968(Function<T, class_4639> var1, List<class_723<T>> var2) {
      this.field_4962 = var2;
      this.field_4961 = var1;
   }

   @Override
   public boolean method_14013(class_1331 var1, T var2) {
      return false;
   }

   @Override
   public void method_14012(class_1331 var1, T var2, int var3, class_1716 var4) {
      this.field_4962.add(new class_723<T>(var2, var1, var3, var4, null));
   }

   @Override
   public boolean method_14010(class_1331 var1, T var2) {
      return false;
   }

   public class_3416 method_4244() {
      class_3416 var3 = new class_3416();

      for (class_723 var5 : this.field_4962) {
         class_5734 var6 = new class_5734();
         var6.method_25941("i", this.field_4961.apply((T)class_723.method_3280(var5)).toString());
         var6.method_25931("x", var5.field_3928.method_12173());
         var6.method_25931("y", var5.field_3928.method_12165());
         var6.method_25931("z", var5.field_3928.method_12185());
         var6.method_25931("t", var5.field_3930);
         var6.method_25931("p", var5.field_3932.method_7693());
         var3.add(var6);
      }

      return var3;
   }

   public static <T> class_968<T> method_4243(class_3416 var0, Function<T, class_4639> var1, Function<class_4639, T> var2) {
      ArrayList var5 = Lists.newArrayList();

      for (int var6 = 0; var6 < var0.size(); var6++) {
         class_5734 var7 = var0.method_15764(var6);
         Object var8 = var2.apply(new class_4639(var7.method_25965("i")));
         if (var8 != null) {
            class_1331 var9 = new class_1331(var7.method_25947("x"), var7.method_25947("y"), var7.method_25947("z"));
            var5.add(new class_723(var8, var9, var7.method_25947("t"), class_1716.method_7694(var7.method_25947("p")), null));
         }
      }

      return new class_968<T>(var1, var5);
   }

   public void method_4245(class_3065<T> var1) {
      this.field_4962.forEach(var1x -> var1.method_14012(var1x.field_3928, class_723.method_3280(var1x), var1x.field_3930, var1x.field_3932));
   }
}