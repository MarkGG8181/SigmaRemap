package mapped;

import java.util.Random;
import java.util.function.Supplier;

public class Class3485 extends Class3194 implements Class3196 {
   private static String[] field18470;
   public static final Class6408 field19345 = Block.method11539(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private final Supplier<Class7909<Class4709, ?>> field19346;

   public Class3485(AbstractBlock var1, Supplier<Class7909<Class4709, ?>> var2) {
      super(var1);
      this.field19346 = var2;
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field19345;
   }

   @Override
   public boolean method11490(Class7380 var1, Class1665 var2, BlockPos var3) {
      return var1.method23446(Class7645.field32799)
         || var1.method23448(Blocks.MYCELIUM)
         || var1.method23448(Blocks.SOUL_SOIL)
         || super.method11490(var1, var2, var3);
   }

   @Override
   public boolean method11486(Class1665 var1, BlockPos var2, Class7380 var3, boolean var4) {
      Block var7 = ((Class4709)this.field19346.get().field33887).field22337.method23383();
      Block var8 = var1.method6738(var2.method8313()).method23383();
      return var8 == var7;
   }

   @Override
   public boolean method11487(Class1655 var1, Random var2, BlockPos var3, Class7380 var4) {
      return (double)var2.nextFloat() < 0.4;
   }

   @Override
   public void method11488(Class1657 var1, Random var2, BlockPos var3, Class7380 var4) {
      this.field19346.get().method26521(var1, var1.method6883().method7370(), var2, var3);
   }
}