package mapped;

import java.util.Random;

public class Class3420 extends Class3209 {
   private static String[] field19129;

   public Class3420(Class7929 var1) {
      super(var1);
   }

   public int method12068(Random var1) {
      if (this != Class8487.field36420) {
         if (this != Class8487.field36536) {
            if (this != Class8487.field36656) {
               if (this != Class8487.field36455) {
                  if (this != Class8487.field36722) {
                     return this != Class8487.field36421 ? 0 : Class9679.method37782(var1, 0, 1);
                  } else {
                     return Class9679.method37782(var1, 2, 5);
                  }
               } else {
                  return Class9679.method37782(var1, 2, 5);
               }
            } else {
               return Class9679.method37782(var1, 3, 7);
            }
         } else {
            return Class9679.method37782(var1, 3, 7);
         }
      } else {
         return Class9679.method37782(var1, 0, 2);
      }
   }

   @Override
   public void method11965(Class7380 var1, Class1657 var2, BlockPos var3, Class8848 var4) {
      super.method11965(var1, var2, var3, var4);
      if (Class7858.method26311(Class8122.field34916, var4) == 0) {
         int var7 = this.method12068(var2.field9016);
         if (var7 > 0) {
            this.method11558(var2, var3, var7);
         }
      }
   }
}
