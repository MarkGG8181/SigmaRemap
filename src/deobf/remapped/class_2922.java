package remapped;

import java.util.Set;

public class class_2922 {
   private static String[] field_14249;

   public static boolean method_13373(Set var0, Set var1) {
      return !method_13372(var0, var1);
   }

   public static boolean method_13372(Set var0, Set var1) {
      if (!var0.isEmpty() && !var1.isEmpty()) {
         if (var1.size() < var0.size()) {
            Set var4 = var0;
            var0 = var1;
            var1 = var4;
         }

         for (Object var5 : var0) {
            if (var1.contains(var5)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }
}