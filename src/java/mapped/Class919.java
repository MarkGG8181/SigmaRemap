package mapped;

import javax.annotation.Nullable;

public abstract class Class919 extends Class916 implements Class920, Class949 {
   private Class25<Class8848> field5236 = Class25.<Class8848>method68(36, Class8848.field39973);
   private boolean field5237 = true;
   private ResourceLocation field5238;
   private long field5239;

   public Class919(Class8992<?> var1, Class1655 var2) {
      super(var1, var2);
   }

   public Class919(Class8992<?> var1, double var2, double var4, double var6, Class1655 var8) {
      super(var1, var8, var2, var4, var6);
   }

   @Override
   public void method3586(Class8654 var1) {
      super.method3586(var1);
      if (this.field5024.method6789().method17135(Class5462.field24229)) {
         Class7236.method22722(this.field5024, this, this);
         if (!this.field5024.field9020) {
            Entity var4 = var1.method31113();
            if (var4 != null && var4.method3204() == Class8992.field41111) {
               Class4388.method13832((PlayerEntity)var4, true);
            }
         }
      }
   }

   @Override
   public boolean method3617() {
      for (Class8848 var4 : this.field5236) {
         if (!var4.method32105()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public Class8848 method3618(int var1) {
      this.method3624((PlayerEntity)null);
      return this.field5236.get(var1);
   }

   @Override
   public Class8848 method3619(int var1, int var2) {
      this.method3624((PlayerEntity)null);
      return Class7920.method26563(this.field5236, var1, var2);
   }

   @Override
   public Class8848 method3620(int var1) {
      this.method3624((PlayerEntity)null);
      Class8848 var4 = this.field5236.get(var1);
      if (!var4.method32105()) {
         this.field5236.set(var1, Class8848.field39973);
         return var4;
      } else {
         return Class8848.field39973;
      }
   }

   @Override
   public void method3621(int var1, Class8848 var2) {
      this.method3624((PlayerEntity)null);
      this.field5236.set(var1, var2);
      if (!var2.method32105() && var2.method32179() > this.method3630()) {
         var2.method32180(this.method3630());
      }
   }

   @Override
   public boolean method2963(int var1, Class8848 var2) {
      if (var1 >= 0 && var1 < this.method3629()) {
         this.method3621(var1, var2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method3622() {
   }

   @Override
   public boolean method3623(PlayerEntity var1) {
      return !this.field5041 ? !(var1.method3277(this) > 64.0) : false;
   }

   @Nullable
   @Override
   public Entity method2745(Class1657 var1) {
      this.field5237 = false;
      return super.method2745(var1);
   }

   @Override
   public void method2904() {
      if (!this.field5024.field9020 && this.field5237) {
         Class7236.method22722(this.field5024, this, this);
      }

      super.method2904();
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      if (this.field5238 == null) {
         Class7920.method26565(var1, this.field5236);
      } else {
         var1.method109("LootTable", this.field5238.toString());
         if (this.field5239 != 0L) {
            var1.method103("LootTableSeed", this.field5239);
         }
      }
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      this.field5236 = Class25.<Class8848>method68(this.method3629(), Class8848.field39973);
      if (!var1.method119("LootTable", 8)) {
         Class7920.method26567(var1, this.field5236);
      } else {
         this.field5238 = new ResourceLocation(var1.method126("LootTable"));
         this.field5239 = var1.method123("LootTableSeed");
      }
   }

   @Override
   public Class2274 method3304(PlayerEntity var1, Class79 var2) {
      var1.method2766(this);
      if (var1.field5024.field9020) {
         return Class2274.field14818;
      } else {
         Class4388.method13832(var1, true);
         return Class2274.field14819;
      }
   }

   @Override
   public void method3593() {
      float var3 = 0.98F;
      if (this.field5238 == null) {
         int var4 = 15 - Class5812.method18152(this);
         var3 += (float)var4 * 0.001F;
      }

      this.method3434(this.method3433().method11347((double)var3, 0.0, (double)var3));
   }

   public void method3624(PlayerEntity var1) {
      if (this.field5238 != null && this.field5024.method6715() != null) {
         Class7318 var4 = this.field5024.method6715().method1411().method1058(this.field5238);
         if (var1 instanceof Class878) {
            Class9551.field44504.method15109((Class878)var1, this.field5238);
         }

         this.field5238 = null;
         Class9464 var5 = new Class9464((Class1657)this.field5024).method36454(Class9525.field44335, this.method3431()).method36451(this.field5239);
         if (var1 != null) {
            var5.method36453(var1.method2978()).method36454(Class9525.field44330, var1);
         }

         var4.method23185(this, var5.method36460(Class8524.field38282));
      }
   }

   @Override
   public void method3625() {
      this.method3624((PlayerEntity)null);
      this.field5236.clear();
   }

   public void method3626(ResourceLocation var1, long var2) {
      this.field5238 = var1;
      this.field5239 = var2;
   }

   @Nullable
   @Override
   public Class5812 method3627(int var1, Class974 var2, PlayerEntity var3) {
      if (this.field5238 != null && var3.method2800()) {
         return null;
      } else {
         this.method3624(var2.field5444);
         return this.method3628(var1, var2);
      }
   }

   public abstract Class5812 method3628(int var1, Class974 var2);
}
