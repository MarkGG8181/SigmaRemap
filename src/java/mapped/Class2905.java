package mapped;

import com.mojang.serialization.Codec;

import java.util.Random;

public class Class2905 extends Class2898<Class4712> {
   public Class2905(Codec<Class4712> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, Class5646 var2, Random var3, BlockPos var4, Class4712 var5) {
      while (var1.method7007(var4) && var4.getY() > 2) {
         var4 = var4.method8313();
      }

      if (!var1.method6738(var4).method23448(Blocks.SNOW_BLOCK)) {
         return false;
      } else {
         var4 = var4.method8339(var3.nextInt(4));
         int var8 = var3.nextInt(4) + 7;
         int var9 = var8 / 4 + var3.nextInt(2);
         if (var9 > 1 && var3.nextInt(60) == 0) {
            var4 = var4.method8339(10 + var3.nextInt(30));
         }

         for (int var10 = 0; var10 < var8; var10++) {
            float var11 = (1.0F - (float)var10 / (float)var8) * (float)var9;
            int var12 = Class9679.method37773(var11);

            for (int var13 = -var12; var13 <= var12; var13++) {
               float var14 = (float)Class9679.method37772(var13) - 0.25F;

               for (int var15 = -var12; var15 <= var12; var15++) {
                  float var16 = (float)Class9679.method37772(var15) - 0.25F;
                  if ((var13 == 0 && var15 == 0 || !(var14 * var14 + var16 * var16 > var11 * var11))
                     && (var13 != -var12 && var13 != var12 && var15 != -var12 && var15 != var12 || !(var3.nextFloat() > 0.75F))) {
                     Class7380 var17 = var1.method6738(var4.method8336(var13, var10, var15));
                     Block var18 = var17.method23383();
                     if (var17.method23393() || method11219(var18) || var18 == Blocks.SNOW_BLOCK || var18 == Blocks.ICE) {
                        this.method11217(var1, var4.method8336(var13, var10, var15), Blocks.PACKED_ICE.method11579());
                     }

                     if (var10 != 0 && var12 > 1) {
                        var17 = var1.method6738(var4.method8336(var13, -var10, var15));
                        var18 = var17.method23383();
                        if (var17.method23393() || method11219(var18) || var18 == Blocks.SNOW_BLOCK || var18 == Blocks.ICE) {
                           this.method11217(var1, var4.method8336(var13, -var10, var15), Blocks.PACKED_ICE.method11579());
                        }
                     }
                  }
               }
            }
         }

         int var20 = var9 - 1;
         if (var20 >= 0) {
            if (var20 > 1) {
               var20 = 1;
            }
         } else {
            var20 = 0;
         }

         for (int var21 = -var20; var21 <= var20; var21++) {
            for (int var22 = -var20; var22 <= var20; var22++) {
               BlockPos var23 = var4.method8336(var21, -1, var22);
               int var24 = 50;
               if (Math.abs(var21) == 1 && Math.abs(var22) == 1) {
                  var24 = var3.nextInt(5);
               }

               while (var23.getY() > 50) {
                  Class7380 var25 = var1.method6738(var23);
                  Block var26 = var25.method23383();
                  if (!var25.method23393()
                     && !method11219(var26)
                     && var26 != Blocks.SNOW_BLOCK
                     && var26 != Blocks.ICE
                     && var26 != Blocks.PACKED_ICE) {
                     break;
                  }

                  this.method11217(var1, var23, Blocks.PACKED_ICE.method11579());
                  var23 = var23.method8313();
                  if (--var24 <= 0) {
                     var23 = var23.method8340(var3.nextInt(5) + 1);
                     var24 = var3.nextInt(5);
                  }
               }
            }
         }

         return true;
      }
   }
}