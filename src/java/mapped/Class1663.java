package mapped;

public interface Class1663 extends Class1665 {
   float method6877(Direction var1, boolean var2);

   Class196 method6737();

   int method6878(BlockPos var1, Class8980 var2);

   default int method7020(Class1977 var1, BlockPos var2) {
      return this.method6737().method638(var1).method643(var2);
   }

   default int method7021(BlockPos var1, int var2) {
      return this.method6737().method640(var1, var2);
   }

   default boolean method7022(BlockPos var1) {
      return this.method7020(Class1977.field12881, var1) >= this.method7033();
   }
}
