package mapped;

public class Class4856 extends Class4837 {
   private static String[] field22653;

   public Class4856(ResourceLocation var1) {
      super(var1);
   }

   public boolean method14963(Class926 var1, Class1655 var2) {
      if (var1.method3671() == 3 && var1.method3670() == 3) {
         for (int var5 = 0; var5 < var1.method3671(); var5++) {
            for (int var6 = 0; var6 < var1.method3670(); var6++) {
               Class8848 var7 = var1.method3618(var5 + var6 * var1.method3671());
               if (var7.method32105()) {
                  return false;
               }

               Class3257 var8 = var7.method32107();
               if (var5 == 1 && var6 == 1) {
                  if (var8 != Class8514.field38118) {
                     return false;
                  }
               } else if (var8 != Class8514.field37797) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public Class8848 method14962(Class926 var1) {
      Class8848 var4 = var1.method3618(1 + var1.method3671());
      if (var4.method32107() == Class8514.field38118) {
         Class8848 var5 = new Class8848(Class8514.field38117, 8);
         Class9741.method38187(var5, Class9741.method38185(var4));
         Class9741.method38188(var5, Class9741.method38179(var4));
         return var5;
      } else {
         return Class8848.field39973;
      }
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return var1 >= 2 && var2 >= 2;
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28479;
   }
}
