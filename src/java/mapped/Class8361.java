package mapped;

import net.minecraft.nbt.INBT;

import java.util.List;
import java.util.function.Supplier;

public class Class8361 implements Class8356 {
   private static String[] field35910;
   public static final Class8361 field35911 = new Class8361();

   private Class8361() {
   }

   @Override
   public void method29291(INBT var1, List<INBT> var2) {
      if (var1 instanceof Class27) {
         var2.addAll((Class27)var1);
      }
   }

   @Override
   public void method29292(INBT var1, Supplier<INBT> var2, List<INBT> var3) {
      if (var1 instanceof Class27) {
         Class27 var6 = (Class27)var1;
         if (!var6.isEmpty()) {
            var3.addAll(var6);
         } else {
            INBT var7 = (INBT)var2.get();
            if (var6.method71(0, var7)) {
               var3.add(var7);
            }
         }
      }
   }

   @Override
   public INBT method29293() {
      return new ListNBT();
   }

   @Override
   public int method29294(INBT var1, Supplier<INBT> var2) {
      if (!(var1 instanceof Class27)) {
         return 0;
      } else {
         Class27 var5 = (Class27)var1;
         int var6 = var5.size();
         if (var6 == 0) {
            var5.method71(0, (INBT)var2.get());
            return 1;
         } else {
            INBT var7 = (INBT)var2.get();
            int var8 = var6 - (int)var5.stream().filter(var7::equals).count();
            if (var8 == 0) {
               return 0;
            } else {
               var5.clear();
               if (!var5.method71(0, var7)) {
                  return 0;
               } else {
                  for (int var9 = 1; var9 < var6; var9++) {
                     var5.method71(var9, (INBT)var2.get());
                  }

                  return var8;
               }
            }
         }
      }
   }

   @Override
   public int method29295(INBT var1) {
      if (var1 instanceof Class27) {
         Class27 var4 = (Class27)var1;
         int var5 = var4.size();
         if (var5 > 0) {
            var4.clear();
            return var5;
         }
      }

      return 0;
   }
}
