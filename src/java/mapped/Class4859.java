package mapped;

public class Class4859 extends Class4837 {
   private static final Class120 field22655 = Class120.method339(Class8514.field37899);
   private static final Class120 field22656 = Class120.method339(Class8514.field37840);
   private static final Class120 field22657 = Class120.method339(Class8514.field38069);

   public Class4859(ResourceLocation var1) {
      super(var1);
   }

   public boolean method14963(Class926 var1, Class1655 var2) {
      boolean var5 = false;
      int var6 = 0;

      for (int var7 = 0; var7 < var1.method3629(); var7++) {
         Class8848 var8 = var1.method3618(var7);
         if (!var8.method32105()) {
            if (!field22655.test(var8)) {
               if (!field22656.test(var8)) {
                  if (!field22657.test(var8)) {
                     return false;
                  }
               } else if (++var6 > 3) {
                  return false;
               }
            } else {
               if (var5) {
                  return false;
               }

               var5 = true;
            }
         }
      }

      return var5 && var6 >= 1;
   }

   public Class8848 method14962(Class926 var1) {
      Class8848 var4 = new Class8848(Class8514.field38068, 3);
      Class39 var5 = var4.method32144("Fireworks");
      Class41 var6 = new Class41();
      int var7 = 0;

      for (int var8 = 0; var8 < var1.method3629(); var8++) {
         Class8848 var9 = var1.method3618(var8);
         if (!var9.method32105()) {
            if (!field22656.test(var9)) {
               if (field22657.test(var9)) {
                  Class39 var10 = var9.method32145("Explosion");
                  if (var10 != null) {
                     var6.add(var10);
                  }
               }
            } else {
               var7++;
            }
         }
      }

      var5.method100("Flight", (byte)var7);
      if (!var6.isEmpty()) {
         var5.method99("Explosions", var6);
      }

      return var4;
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   @Override
   public Class8848 method14966() {
      return new Class8848(Class8514.field38068);
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28476;
   }
}