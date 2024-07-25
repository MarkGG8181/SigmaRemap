package remapped;

import com.google.common.cache.CacheLoader;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class class_8782 extends CacheLoader<Long, List<class_9191>> {
   private static String[] field_44943;

   private class_8782() {
   }

   public List<class_9191> load(Long var1) {
      List var4 = IntStream.range(0, 10).boxed().collect(Collectors.toList());
      Collections.shuffle(var4, new Random(var1));
      ArrayList var5 = Lists.newArrayList();

      for (int var6 = 0; var6 < 10; var6++) {
         int var7 = class_9299.method_42847(42.0 * Math.cos(2.0 * (-Math.PI + (Math.PI / 10) * (double)var6)));
         int var8 = class_9299.method_42847(42.0 * Math.sin(2.0 * (-Math.PI + (Math.PI / 10) * (double)var6)));
         int var9 = (Integer)var4.get(var6);
         int var10 = 2 + var9 / 3;
         int var11 = 76 + var9 * 3;
         boolean var12 = var9 == 1 || var9 == 2;
         var5.add(new class_9191(var7, var8, var10, var11, var12));
      }

      return var5;
   }
}
