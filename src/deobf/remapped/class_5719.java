package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface class_5719 {
   List<class_8145> method_25867(class_8145 var1, class_4092 var2, Predicate<? super class_8145> var3);

   <T extends class_8145> List<T> method_25869(Class<? extends T> var1, class_4092 var2, Predicate<? super T> var3);

   default <T extends class_8145> List<T> method_25875(Class<? extends T> var1, class_4092 var2, Predicate<? super T> var3) {
      return this.<T>method_25869(var1, var2, var3);
   }

   List<? extends class_704> method_25873();

   default List<class_8145> method_25870(class_8145 var1, class_4092 var2) {
      return this.method_25867(var1, var2, class_3572.field_17483);
   }

   default boolean method_6678(class_8145 var1, class_4190 var2) {
      if (var2.method_19485()) {
         return true;
      } else {
         for (class_8145 var6 : this.method_25870(var1, var2.method_19483())) {
            if (!var6.field_41751
               && var6.field_41759
               && (var1 == null || !var6.method_37308(var1))
               && class_3370.method_15537(var2, class_3370.method_15523(var6.method_37241()), class_8529.field_43655)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends class_8145> List<T> method_25868(Class<? extends T> var1, class_4092 var2) {
      return this.<T>method_25869(var1, var2, class_3572.field_17483);
   }

   default <T extends class_8145> List<T> method_25874(Class<? extends T> var1, class_4092 var2) {
      return this.<T>method_25875(var1, var2, class_3572.field_17483);
   }

   default Stream<class_4190> method_6679(class_8145 var1, class_4092 var2, Predicate<class_8145> var3) {
      if (!(var2.method_18906() < 1.0E-7)) {
         class_4092 var6 = var2.method_18898(1.0E-7);
         return this.method_25867(var1, var6, var3.and(var2x -> {
            if (var2x.method_37241().method_18909(var6)) {
               if (var1 != null) {
                  if (var1.method_37325(var2x)) {
                     return true;
                  }
               } else if (var2x.method_37173()) {
                  return true;
               }
            }

            return false;
         })).stream().<class_4092>map(class_8145::method_37241).<class_4190>map(class_3370::method_15523);
      } else {
         return Stream.<class_4190>empty();
      }
   }

   @Nullable
   default class_704 method_25856(double var1, double var3, double var5, double var7, Predicate<class_8145> var9) {
      double var12 = -1.0;
      class_704 var14 = null;

      for (class_704 var16 : this.method_25873()) {
         if (var9 == null || var9.test(var16)) {
            double var17 = var16.method_37273(var1, var3, var5);
            if ((var7 < 0.0 || var17 < var7 * var7) && (var12 == -1.0 || var17 < var12)) {
               var12 = var17;
               var14 = var16;
            }
         }
      }

      return var14;
   }

   @Nullable
   default class_704 method_25861(class_8145 var1, double var2) {
      return this.method_25857(var1.method_37302(), var1.method_37309(), var1.method_37156(), var2, false);
   }

   @Nullable
   default class_704 method_25857(double var1, double var3, double var5, double var7, boolean var9) {
      Predicate var12 = !var9 ? class_3572.field_17483 : class_3572.field_17479;
      return this.method_25856(var1, var3, var5, var7, var12);
   }

   default boolean method_25866(double var1, double var3, double var5, double var7) {
      for (class_704 var12 : this.method_25873()) {
         if (class_3572.field_17483.test(var12) && class_3572.field_17482.test(var12)) {
            double var13 = var12.method_37273(var1, var3, var5);
            if (var7 < 0.0 || var13 < var7 * var7) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default class_704 method_25859(class_4931 var1, class_5834 var2) {
      return this.<class_704>method_25864(this.method_25873(), var1, var2, var2.method_37302(), var2.method_37309(), var2.method_37156());
   }

   @Nullable
   default class_704 method_25860(class_4931 var1, class_5834 var2, double var3, double var5, double var7) {
      return this.<class_704>method_25864(this.method_25873(), var1, var2, var3, var5, var7);
   }

   @Nullable
   default class_704 method_25858(class_4931 var1, double var2, double var4, double var6) {
      return this.<class_704>method_25864(this.method_25873(), var1, (class_5834)null, var2, var4, var6);
   }

   @Nullable
   default <T extends class_5834> T method_25865(
      Class<? extends T> var1, class_4931 var2, class_5834 var3, double var4, double var6, double var8, class_4092 var10
   ) {
      return this.<T>method_25864(this.method_25869(var1, var10, (Predicate<? super T>)null), var2, var3, var4, var6, var8);
   }

   @Nullable
   default <T extends class_5834> T method_25872(
      Class<? extends T> var1, class_4931 var2, class_5834 var3, double var4, double var6, double var8, class_4092 var10
   ) {
      return this.<T>method_25864(this.method_25875(var1, var10, (Predicate<? super T>)null), var2, var3, var4, var6, var8);
   }

   @Nullable
   default <T extends class_5834> T method_25864(List<? extends T> var1, class_4931 var2, class_5834 var3, double var4, double var6, double var8) {
      double var12 = -1.0;
      class_5834 var14 = null;

      for (class_5834 var16 : var1) {
         if (var2.method_22604(var3, var16)) {
            double var17 = var16.method_37273(var4, var6, var8);
            if (var12 == -1.0 || var17 < var12) {
               var12 = var17;
               var14 = var16;
            }
         }
      }

      return (T)var14;
   }

   default List<class_704> method_25871(class_4931 var1, class_5834 var2, class_4092 var3) {
      ArrayList var6 = Lists.newArrayList();

      for (class_704 var8 : this.method_25873()) {
         if (var3.method_18902(var8.method_37302(), var8.method_37309(), var8.method_37156()) && var1.method_22604(var2, var8)) {
            var6.add(var8);
         }
      }

      return var6;
   }

   default <T extends class_5834> List<T> method_25863(Class<? extends T> var1, class_4931 var2, class_5834 var3, class_4092 var4) {
      List var7 = this.method_25869(var1, var4, (Predicate<? super T>)null);
      ArrayList var8 = Lists.newArrayList();

      for (class_5834 var10 : var7) {
         if (var2.method_22604(var3, var10)) {
            var8.add(var10);
         }
      }

      return var8;
   }

   @Nullable
   default class_704 method_25862(UUID var1) {
      for (int var4 = 0; var4 < this.method_25873().size(); var4++) {
         class_704 var5 = this.method_25873().get(var4);
         if (var1.equals(var5.method_37328())) {
            return var5;
         }
      }

      return null;
   }
}