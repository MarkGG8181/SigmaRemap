package mapped;

import java.util.Set;

public interface Class920 extends Class946 {
   int method3629();

   boolean method3617();

   Class8848 method3618(int var1);

   Class8848 method3619(int var1, int var2);

   Class8848 method3620(int var1);

   void method3621(int var1, Class8848 var2);

   default int method3630() {
      return 64;
   }

   void method3622();

   boolean method3623(PlayerEntity var1);

   default void method3631(PlayerEntity var1) {
   }

   default void method3632(PlayerEntity var1) {
   }

   default boolean method3633(int var1, Class8848 var2) {
      return true;
   }

   default int method3634(Class3257 var1) {
      int var4 = 0;

      for (int var5 = 0; var5 < this.method3629(); var5++) {
         Class8848 var6 = this.method3618(var5);
         if (var6.method32107().equals(var1)) {
            var4 += var6.method32179();
         }
      }

      return var4;
   }

   default boolean method3635(Set<Class3257> var1) {
      for (int var4 = 0; var4 < this.method3629(); var4++) {
         Class8848 var5 = this.method3618(var4);
         if (var1.contains(var5.method32107()) && var5.method32179() > 0) {
            return true;
         }
      }

      return false;
   }
}
