package mapped;

import java.util.Random;

public class Class3491 extends Class3490 {
   private static String[] field19356;

   public Class3491(Class7144 var1, AbstractBlock var2) {
      super(var1, 8, var2);
   }

   @Override
   public boolean method11490(Class7380 var1, Class1665 var2, BlockPos var3) {
      return super.method11490(var1, var2, var3)
         || var1.method23448(Blocks.NETHERRACK)
         || var1.method23448(Blocks.SOUL_SAND)
         || var1.method23448(Blocks.SOUL_SOIL);
   }

   @Override
   public void method11512(Class7380 var1, Class1655 var2, BlockPos var3, Random var4) {
      Class6408 var7 = this.method11483(var1, var2, var3, Class4832.method14947());
      Vector3d var8 = var7.method19514().method19685();
      double var9 = (double)var3.method8304() + var8.field18048;
      double var11 = (double)var3.method8306() + var8.field18050;

      for (int var13 = 0; var13 < 3; var13++) {
         if (var4.nextBoolean()) {
            var2.method6746(
               Class7940.field34092,
               var9 + var4.nextDouble() / 5.0,
               (double)var3.getY() + (0.5 - var4.nextDouble()),
               var11 + var4.nextDouble() / 5.0,
               0.0,
               0.0,
               0.0
            );
         }
      }
   }

   @Override
   public void method11523(Class7380 var1, Class1655 var2, BlockPos var3, Entity var4) {
      if (!var2.field9020 && var2.method6997() != Class2197.field14351 && var4 instanceof Class880) {
         Class880 var7 = (Class880)var4;
         if (!var7.method2760(Class8654.field39007)) {
            var7.method3035(new Class2023(Class8254.field35486, 40));
         }
      }
   }
}