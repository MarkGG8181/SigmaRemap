package remapped;

import java.util.Iterator;

public interface class_2855<T> {
   default void method_12972(int var1, int var2, int var3, class_8932<?> var4, Iterator<T> var5, int var6) {
      int var9 = var1;
      int var10 = var2;
      if (var4 instanceof class_644) {
         class_644 var11 = (class_644)var4;
         var9 = var11.method_2957();
         var10 = var11.method_2966();
      }

      int var18 = 0;

      for (int var12 = 0; var12 < var2; var12++) {
         if (var18 == var3) {
            var18++;
         }

         boolean var13 = (float)var10 < (float)var2 / 2.0F;
         int var14 = class_9299.method_42848((float)var2 / 2.0F - (float)var10 / 2.0F);
         if (var13 && var14 > var12) {
            var18 += var1;
            var12++;
         }

         for (int var15 = 0; var15 < var1; var15++) {
            if (!var5.hasNext()) {
               return;
            }

            var13 = (float)var9 < (float)var1 / 2.0F;
            var14 = class_9299.method_42848((float)var1 / 2.0F - (float)var9 / 2.0F);
            int var16 = var9;
            boolean var17 = var15 < var9;
            if (var13) {
               var16 = var14 + var9;
               var17 = var14 <= var15 && var15 < var14 + var9;
            }

            if (!var17) {
               if (var16 == var15) {
                  var18 += var1 - var15;
                  break;
               }
            } else {
               this.method_12971(var5, var18, var6, var12, var15);
            }

            var18++;
         }
      }
   }

   void method_12971(Iterator<T> var1, int var2, int var3, int var4, int var5);
}