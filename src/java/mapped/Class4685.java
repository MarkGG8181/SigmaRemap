package mapped;

import java.util.function.Consumer;

public class Class4685 extends Class4686 {
   private static String[] field22262;
   private final Class7608<Class3257> field22263;
   private final boolean field22264;

   private Class4685(Class7608<Class3257> var1, boolean var2, int var3, int var4, Class122[] var5, Class127[] var6) {
      super(var3, var4, var5, var6);
      this.field22263 = var1;
      this.field22264 = var2;
   }

   @Override
   public Class7131 method14694() {
      return Class8695.field39243;
   }

   @Override
   public void method14695(Consumer<Class8848> var1, Class7812 var2) {
      this.field22263.method24918().forEach(var1x -> var1.accept(new Class8848(var1x)));
   }

   private boolean method14696(Class7812 var1, Consumer<Class6549> var2) {
      if (!this.method14709(var1)) {
         return false;
      } else {
         for (Class3257 var6 : this.field22263.method24918()) {
            var2.accept(new Class6551(this, var6));
         }

         return true;
      }
   }

   @Override
   public boolean method14697(Class7812 var1, Consumer<Class6549> var2) {
      return !this.field22264 ? super.method14697(var1, var2) : this.method14696(var1, var2);
   }

   public static Class5872<?> method14698(Class7608<Class3257> var0) {
      return method14704((var1, var2, var3, var4) -> new Class4685(var0, true, var1, var2, var3, var4));
   }

   // $VF: synthetic method
   public static Class7608 method14701(Class4685 var0) {
      return var0.field22263;
   }

   // $VF: synthetic method
   public static boolean method14702(Class4685 var0) {
      return var0.field22264;
   }

   // $VF: synthetic method
   public Class4685(Class7608 var1, boolean var2, int var3, int var4, Class122[] var5, Class127[] var6, Class6551 var7) {
      this(var1, var2, var3, var4, var5, var6);
   }
}