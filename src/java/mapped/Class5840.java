package mapped;

public class Class5840 extends Class5839 {
   private static String[] field25582;

   public Class5840(Class920 var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public boolean method18259(Class8848 var1) {
      return method18275(var1);
   }

   @Override
   public int method18269() {
      return 1;
   }

   @Override
   public Class8848 method18264(PlayerEntity var1, Class8848 var2) {
      Class8812 var5 = Class9741.method38185(var2);
      if (var1 instanceof Class878) {
         Class9551.field44475.method15071((Class878)var1, var5);
      }

      super.method18264(var1, var2);
      return var2;
   }

   public static boolean method18275(Class8848 var0) {
      Class3257 var3 = var0.method32107();
      return var3 == Class8514.field37971 || var3 == Class8514.field38115 || var3 == Class8514.field38118 || var3 == Class8514.field37972;
   }
}