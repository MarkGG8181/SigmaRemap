package mapped;

public final class Class6235 extends Class6230 {
   private static String[] field27729;

   @Override
   public Class8848 method19192(Class2956 var1, Class8848 var2) {
      Class1657 var5 = var1.method11326();
      BlockPos var6 = var1.method11323().method8349(var1.method11324().<Direction>method23463(Class3357.field18899));
      Class3342 var7 = (Class3342)Class8487.field36589;
      if (var5.method7007(var6) && var7.method11891(var5, var6)) {
         if (!var5.field9020) {
            var5.method6725(var6, var7.method11579(), 3);
         }

         var2.method32182(1);
         this.method19204(true);
      } else {
         this.method19204(Class3279.method11804(var1, var2));
      }

      return var2;
   }
}
