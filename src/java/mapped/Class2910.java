package mapped;

import com.mojang.serialization.Codec;

import java.util.Random;

public class Class2910 extends Class2898<Class4732> {
   public Class2910(Codec<Class4732> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, Class5646 var2, Random var3, BlockPos var4, Class4732 var5) {
      Mutable var8 = new Mutable();

      for (int var9 = 0; var9 < 16; var9++) {
         for (int var10 = 0; var10 < 16; var10++) {
            int var11 = var4.method8304() + var9;
            int var12 = var4.method8306() + var10;
            int var13 = var5.field22408;
            var8.method8372(var11, var13, var12);
            if (var1.method6738(var8).method23393()) {
               var1.method6725(var8, var5.field22409, 2);
            }
         }
      }

      return true;
   }
}
