package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Class7881 extends Class7882<Class880> {
   private static String[] field33824;

   @Override
   public Set<Class8830<?>> method26424() {
      return ImmutableSet.of(
         Class8830.field39819,
         Class8830.field39818,
         Class8830.field39848,
         Class8830.field39860,
         Class8830.field39868,
         Class8830.field39858,
         new Class8830[]{Class8830.field39859, Class8830.field39862, Class8830.field39861, Class8830.field39866, Class8830.field39867, Class8830.field39870}
      );
   }

   @Override
   public void method26425(Class1657 var1, Class880 var2) {
      Class6947<?> var5 = var2.method2992();
      var5.method21408(Class8830.field39870, method26426(var1, var2));
      Optional var6 = Optional.empty();
      Optional var7 = Optional.empty();
      Optional var8 = Optional.empty();
      Optional var9 = Optional.empty();
      Optional var10 = Optional.empty();
      Optional var11 = Optional.empty();
      Optional var12 = Optional.empty();
      int var13 = 0;
      ArrayList var14 = Lists.newArrayList();
      ArrayList var15 = Lists.newArrayList();

      for (Class880 var17 : var5.<List<Class880>>method21410(Class8830.field39819).orElse(ImmutableList.of())) {
         if (!(var17 instanceof Class1091)) {
            if (!(var17 instanceof Class1036)) {
               if (!(var17 instanceof Class1034)) {
                  if (!(var17 instanceof PlayerEntity)) {
                     if (var6.isPresent() || !(var17 instanceof Class1084) && !(var17 instanceof Class1079)) {
                        if (!var10.isPresent() && Class4388.method13880(var17.method3204())) {
                           var10 = Optional.<Class880>of(var17);
                        }
                     } else {
                        var6 = Optional.<Class880>of((Class1006)var17);
                     }
                  } else {
                     PlayerEntity var22 = (PlayerEntity)var17;
                     if (!var11.isPresent() && Class8088.field34762.test(var17) && !Class4388.method13843(var22)) {
                        var11 = Optional.<PlayerEntity>of(var22);
                     }

                     if (!var12.isPresent() && !var22.method2800() && Class4388.method13875(var22)) {
                        var12 = Optional.<PlayerEntity>of(var22);
                     }
                  }
               } else {
                  Class1034 var21 = (Class1034)var17;
                  if (var21.method3005() && !var9.isPresent()) {
                     var9 = Optional.<Class1034>of(var21);
                  } else if (var21.method4635()) {
                     var14.add(var21);
                  }
               }
            } else {
               var14.add((Class1036)var17);
            }
         } else {
            Class1091 var18 = (Class1091)var17;
            if (var18.method3005() && !var8.isPresent()) {
               var8 = Optional.<Class1091>of(var18);
            } else if (var18.method5084()) {
               var13++;
               if (!var7.isPresent() && var18.method5089()) {
                  var7 = Optional.<Class1091>of(var18);
               }
            }
         }
      }

      for (Class880 var20 : var5.<List<Class880>>method21410(Class8830.field39818).orElse(ImmutableList.of())) {
         if (var20 instanceof Class1035 && ((Class1035)var20).method4635()) {
            var15.add((Class1035)var20);
         }
      }

      var5.method21408(Class8830.field39848, var6);
      var5.method21408(Class8830.field39858, var7);
      var5.method21408(Class8830.field39859, var8);
      var5.method21408(Class8830.field39865, var10);
      var5.method21408(Class8830.field39860, var11);
      var5.method21408(Class8830.field39868, var12);
      var5.method21406(Class8830.field39861, var15);
      var5.method21406(Class8830.field39862, var14);
      var5.method21406(Class8830.field39866, var14.size());
      var5.method21406(Class8830.field39867, var13);
   }

   private static Optional<BlockPos> method26426(Class1657 var0, Class880 var1) {
      return BlockPos.method8357(var1.method3432(), 8, 4, var1x -> method26427(var0, var1x));
   }

   private static boolean method26427(Class1657 var0, BlockPos var1) {
      Class7380 var4 = var0.method6738(var1);
      boolean var5 = var4.method23446(Class7645.field32774);
      return var5 && var4.method23448(Blocks.field37068) ? Class3244.method11655(var4) : var5;
   }
}