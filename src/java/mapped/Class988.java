package mapped;

import javax.annotation.Nullable;

public class Class988 implements Class920 {
   private static String[] field5466;
   private final Class1060 field5467;
   private final Class25<Class8848> field5468 = Class25.<Class8848>method68(3, Class8848.field39973);
   private Class9346 field5469;
   private int field5470;
   private int field5471;

   public Class988(Class1060 var1) {
      this.field5467 = var1;
   }

   @Override
   public int method3629() {
      return this.field5468.size();
   }

   @Override
   public boolean method3617() {
      for (Class8848 var4 : this.field5468) {
         if (!var4.method32105()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public Class8848 method3618(int var1) {
      return this.field5468.get(var1);
   }

   @Override
   public Class8848 method3619(int var1, int var2) {
      Class8848 var5 = this.field5468.get(var1);
      if (var1 == 2 && !var5.method32105()) {
         return Class7920.method26563(this.field5468, var1, var5.method32179());
      } else {
         Class8848 var6 = Class7920.method26563(this.field5468, var1, var2);
         if (!var6.method32105() && this.method4065(var1)) {
            this.method4066();
         }

         return var6;
      }
   }

   private boolean method4065(int var1) {
      return var1 == 0 || var1 == 1;
   }

   @Override
   public Class8848 method3620(int var1) {
      return Class7920.method26564(this.field5468, var1);
   }

   @Override
   public void method3621(int var1, Class8848 var2) {
      this.field5468.set(var1, var2);
      if (!var2.method32105() && var2.method32179() > this.method3630()) {
         var2.method32180(this.method3630());
      }

      if (this.method4065(var1)) {
         this.method4066();
      }
   }

   @Override
   public boolean method3623(PlayerEntity var1) {
      return this.field5467.method4740() == var1;
   }

   @Override
   public void method3622() {
      this.method4066();
   }

   public void method4066() {
      this.field5469 = null;
      Class8848 var3;
      Class8848 var4;
      if (!this.field5468.get(0).method32105()) {
         var3 = this.field5468.get(0);
         var4 = this.field5468.get(1);
      } else {
         var3 = this.field5468.get(1);
         var4 = Class8848.field39973;
      }

      if (!var3.method32105()) {
         Class46 var5 = this.field5467.method4742();
         if (!var5.isEmpty()) {
            Class9346 var6 = var5.method163(var3, var4, this.field5470);
            if (var6 == null || var6.method35382()) {
               this.field5469 = var6;
               var6 = var5.method163(var4, var3, this.field5470);
            }

            if (var6 != null && !var6.method35382()) {
               this.field5469 = var6;
               this.method3621(2, var6.method35370());
               this.field5471 = var6.method35381();
            } else {
               this.method3621(2, Class8848.field39973);
               this.field5471 = 0;
            }
         }

         this.field5467.method4747(this.method3618(2));
      } else {
         this.method3621(2, Class8848.field39973);
         this.field5471 = 0;
      }
   }

   @Nullable
   public Class9346 method4067() {
      return this.field5469;
   }

   public void method4068(int var1) {
      this.field5470 = var1;
      this.method4066();
   }

   @Override
   public void method3625() {
      this.field5468.clear();
   }

   public int method4069() {
      return this.field5471;
   }
}