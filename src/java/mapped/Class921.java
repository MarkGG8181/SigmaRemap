package mapped;

import javax.annotation.Nullable;

public class Class921 implements Class920, Class923 {
   private static String[] field5240;
   private final Class25<Class8848> field5241 = Class25.<Class8848>method68(1, Class8848.field39973);
   private Class4843<?> field5242;

   @Override
   public int method3629() {
      return 1;
   }

   @Override
   public boolean method3617() {
      for (Class8848 var4 : this.field5241) {
         if (!var4.method32105()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public Class8848 method3618(int var1) {
      return this.field5241.get(0);
   }

   @Override
   public Class8848 method3619(int var1, int var2) {
      return Class7920.method26564(this.field5241, 0);
   }

   @Override
   public Class8848 method3620(int var1) {
      return Class7920.method26564(this.field5241, 0);
   }

   @Override
   public void method3621(int var1, Class8848 var2) {
      this.field5241.set(0, var2);
   }

   @Override
   public void method3622() {
   }

   @Override
   public boolean method3623(PlayerEntity var1) {
      return true;
   }

   @Override
   public void method3625() {
      this.field5241.clear();
   }

   @Override
   public void method3636(Class4843<?> var1) {
      this.field5242 = var1;
   }

   @Nullable
   @Override
   public Class4843<?> method3637() {
      return this.field5242;
   }
}
