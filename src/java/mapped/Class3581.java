package mapped;

import java.util.Comparator;

public class Class3581 implements Comparator<Class8012> {
   private static String[] field19522;
   public final Class9528 field19523;

   public Class3581(Class9528 var1) {
      this.field19523 = var1;
   }

   public int compare(Class8012 var1, Class8012 var2) {
      Entity var5 = var1.method27397();
      Entity var6 = var2.method27397();
      int var7 = !(var5 instanceof PlayerEntity) ? 0 : Class7789.method25851((PlayerEntity)var5);
      int var8 = !(var6 instanceof PlayerEntity) ? 0 : Class7789.method25851((PlayerEntity)var6);
      if (var7 - var8 >= 0) {
         if (var7 - var8 != 0) {
            return 1;
         } else {
            float var9 = this.field19523.field44347.field1339.method3275(var5);
            float var10 = this.field19523.field44347.field1339.method3275(var6);
            if (!(var9 - var10 < 0.0F)) {
               return var9 - var10 != 0.0F ? 1 : 0;
            } else {
               return -1;
            }
         }
      } else {
         return -1;
      }
   }
}