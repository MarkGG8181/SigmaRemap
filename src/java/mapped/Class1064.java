package mapped;

import javax.annotation.Nullable;

public class Class1064 extends Class1066 implements Class1022 {
   private static final Class120 field5869 = Class120.method339(Class8514.field37842, Blocks.field36777.method11581());
   private static final Class9289<Integer> field5870 = Class9361.<Integer>method35441(Class1064.class, Class7784.field33391);
   private static final Class9289<Integer> field5871 = Class9361.<Integer>method35441(Class1064.class, Class7784.field33391);
   private static final Class9289<Integer> field5872 = Class9361.<Integer>method35441(Class1064.class, Class7784.field33391);
   private boolean field5873;
   private Class1064 field5874;
   private Class1064 field5875;

   public Class1064(Class8992<? extends Class1064> var1, Class1655 var2) {
      super(var1, var2);
   }

   public boolean method4884() {
      return false;
   }

   private void method4885(int var1) {
      this.field5063.method35446(field5870, Math.max(1, Math.min(5, var1)));
   }

   private void method4886() {
      int var3 = !(this.field5054.nextFloat() < 0.04F) ? 3 : 5;
      this.method4885(1 + this.field5054.nextInt(var3));
   }

   public int method4887() {
      return this.field5063.<Integer>method35445(field5870);
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method102("Variant", this.method4889());
      var1.method102("Strength", this.method4887());
      if (!this.field5890.method3618(1).method32105()) {
         var1.method99("DecorItem", this.field5890.method3618(1).method32112(new Class39()));
      }
   }

   @Override
   public void method2723(Class39 var1) {
      this.method4885(var1.method122("Strength"));
      super.method2723(var1);
      this.method4890(var1.method122("Variant"));
      if (var1.method119("DecorItem", 10)) {
         this.field5890.method3621(1, Class8848.method32104(var1.method130("DecorItem")));
      }

      this.method4903();
   }

   @Override
   public void method4219() {
      this.field5600.method20002(0, new Class2603(this));
      this.field5600.method20002(1, new Class2762(this, 1.2));
      this.field5600.method20002(2, new Class2780(this, 2.1F));
      this.field5600.method20002(3, new Class2598(this, 1.25, 40, 20.0F));
      this.field5600.method20002(3, new Class2747(this, 1.2));
      this.field5600.method20002(4, new Class2785(this, 1.0));
      this.field5600.method20002(5, new Class2764(this, 1.0));
      this.field5600.method20002(6, new Class2737(this, 0.7));
      this.field5600.method20002(7, new Class2612(this, PlayerEntity.class, 6.0F));
      this.field5600.method20002(8, new Class2668(this));
      this.field5601.method20002(1, new Class2705(this));
      this.field5601.method20002(2, new Class2717(this));
   }

   public static Class7037 method4888() {
      return method4926().method21849(Class9173.field42106, 40.0);
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5870, 0);
      this.field5063.method35442(field5871, -1);
      this.field5063.method35442(field5872, 0);
   }

   public int method4889() {
      return Class9679.method37775(this.field5063.<Integer>method35445(field5872), 0, 3);
   }

   public void method4890(int var1) {
      this.field5063.method35446(field5872, var1);
   }

   @Override
   public int method4891() {
      return !this.method4927() ? super.method4891() : 2 + 3 * this.method4897();
   }

   @Override
   public void method3307(Entity var1) {
      if (this.method3409(var1)) {
         float var4 = Class9679.method37764(this.field4965 * (float) (Math.PI / 180.0));
         float var5 = Class9679.method37763(this.field4965 * (float) (Math.PI / 180.0));
         float var6 = 0.3F;
         var1.method3215(
            this.getPosX() + (double)(0.3F * var5), this.getPosY() + this.method3310() + var1.method2894(), this.getPosZ() - (double)(0.3F * var4)
         );
      }
   }

   @Override
   public double method3310() {
      return (double)this.method3430() * 0.67;
   }

   @Override
   public boolean method4277() {
      return false;
   }

   @Override
   public boolean method4381(Class8848 var1) {
      return field5869.test(var1);
   }

   @Override
   public boolean method4892(PlayerEntity var1, Class8848 var2) {
      int var5 = 0;
      int var6 = 0;
      float var7 = 0.0F;
      boolean var8 = false;
      Class3257 var9 = var2.method32107();
      if (var9 != Class8514.field37842) {
         if (var9 == Blocks.field36777.method11581()) {
            var5 = 90;
            var6 = 6;
            var7 = 10.0F;
            if (this.method4932() && this.method4767() == 0 && this.method4502()) {
               var8 = true;
               this.method4503(var1);
            }
         }
      } else {
         var5 = 10;
         var6 = 3;
         var7 = 2.0F;
      }

      if (this.method3042() < this.method3075() && var7 > 0.0F) {
         this.method3041(var7);
         var8 = true;
      }

      if (this.method3005() && var5 > 0) {
         this.field5024.method6746(Class7940.field34078, this.method3438(1.0), this.method3441() + 0.5, this.method3445(1.0), 0.0, 0.0, 0.0);
         if (!this.field5024.field9020) {
            this.method4769(var5);
         }

         var8 = true;
      }

      if (var6 > 0 && (var8 || !this.method4932()) && this.method4944() < this.method4907()) {
         var8 = true;
         if (!this.field5024.field9020) {
            this.method4946(var6);
         }
      }

      if (var8 && !this.method3245()) {
         Class9455 var10 = this.method4894();
         if (var10 != null) {
            this.field5024
               .method6743(
                  (PlayerEntity)null,
                  this.getPosX(),
                  this.getPosY(),
                  this.getPosZ(),
                  this.method4894(),
                  this.method2864(),
                  1.0F,
                  1.0F + (this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.2F
               );
         }
      }

      return var8;
   }

   @Override
   public boolean method2896() {
      return this.method3044() || this.method4938();
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, Class39 var5) {
      this.method4886();
      int var8;
      if (!(var4 instanceof Class5101)) {
         var8 = this.field5054.nextInt(4);
         var4 = new Class5101(var8);
      } else {
         var8 = ((Class5101)var4).field23198;
      }

      this.method4890(var8);
      return super.method4276(var1, var2, var3, (Class5093)var4, var5);
   }

   @Override
   public Class9455 method4893() {
      return Class6067.field26735;
   }

   @Override
   public Class9455 method4241() {
      return Class6067.field26734;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field26739;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field26737;
   }

   @Nullable
   @Override
   public Class9455 method4894() {
      return Class6067.field26738;
   }

   @Override
   public void method3241(BlockPos var1, Class7380 var2) {
      this.method2863(Class6067.field26741, 0.15F, 1.0F);
   }

   @Override
   public void method4895() {
      this.method2863(Class6067.field26736, 1.0F, (this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.2F + 1.0F);
   }

   @Override
   public void method4896() {
      Class9455 var3 = this.method4893();
      if (var3 != null) {
         this.method2863(var3, this.method3099(), this.method3100());
      }
   }

   @Override
   public int method4897() {
      return this.method4887();
   }

   @Override
   public boolean method4898() {
      return true;
   }

   @Override
   public boolean method4899() {
      return !this.field5890.method3618(1).method32105();
   }

   @Override
   public boolean method4900(Class8848 var1) {
      Class3257 var4 = var1.method32107();
      return Class5985.field26075.method24917(var4);
   }

   @Override
   public boolean method4901() {
      return false;
   }

   @Override
   public void method4902(Class920 var1) {
      Class112 var4 = this.method4906();
      super.method4902(var1);
      Class112 var5 = this.method4906();
      if (this.field5055 > 20 && var5 != null && var5 != var4) {
         this.method2863(Class6067.field26742, 0.5F, 1.0F);
      }
   }

   @Override
   public void method4903() {
      if (!this.field5024.field9020) {
         super.method4903();
         this.method4904(method4905(this.field5890.method3618(1)));
      }
   }

   private void method4904(Class112 var1) {
      this.field5063.method35446(field5871, var1 != null ? var1.method309() : -1);
   }

   @Nullable
   private static Class112 method4905(Class8848 var0) {
      Block var3 = Block.method11537(var0.method32107());
      return !(var3 instanceof Class3422) ? null : ((Class3422)var3).method12077();
   }

   @Nullable
   public Class112 method4906() {
      int var3 = this.field5063.<Integer>method35445(field5871);
      return var3 != -1 ? Class112.method315(var3) : null;
   }

   @Override
   public int method4907() {
      return 30;
   }

   @Override
   public boolean method4386(Class1018 var1) {
      return var1 != this && var1 instanceof Class1064 && this.method4961() && ((Class1064)var1).method4961();
   }

   public Class1064 method4389(Class1657 var1, Class1045 var2) {
      Class1064 var5 = this.method4908();
      this.method4962(var2, var5);
      Class1064 var6 = (Class1064)var2;
      int var7 = this.field5054.nextInt(Math.max(this.method4887(), var6.method4887())) + 1;
      if (this.field5054.nextFloat() < 0.03F) {
         var7++;
      }

      var5.method4885(var7);
      var5.method4890(!this.field5054.nextBoolean() ? var6.method4889() : this.method4889());
      return var5;
   }

   public Class1064 method4908() {
      return Class8992.field41047.method33215(this.field5024);
   }

   private void method4909(Class880 var1) {
      Class883 var4 = new Class883(this.field5024, this);
      double var5 = var1.getPosX() - this.getPosX();
      double var7 = var1.method3440(0.3333333333333333) - var4.getPosY();
      double var9 = var1.getPosZ() - this.getPosZ();
      float var11 = Class9679.method37766(var5 * var5 + var9 * var9) * 0.2F;
      var4.method3462(var5, var7 + (double)var11, var9, 1.5F, 10.0F);
      if (!this.method3245()) {
         this.field5024
            .method6743(
               (PlayerEntity)null,
               this.getPosX(),
               this.getPosY(),
               this.getPosZ(),
               Class6067.field26740,
               this.method2864(),
               1.0F,
               1.0F + (this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.2F
            );
      }

      this.field5024.method6916(var4);
      this.field5873 = true;
   }

   private void method4910(boolean var1) {
      this.field5873 = var1;
   }

   @Override
   public boolean method2921(float var1, float var2) {
      int var5 = this.method3067(var1, var2);
      if (var5 <= 0) {
         return false;
      } else {
         if (var1 >= 6.0F) {
            this.method2741(Class8654.field39002, (float)var5);
            if (this.method3329()) {
               for (Entity var7 : this.method3411()) {
                  var7.method2741(Class8654.field39002, (float)var5);
               }
            }
         }

         this.method3068();
         return true;
      }
   }

   public void method4911() {
      if (this.field5874 != null) {
         this.field5874.field5875 = null;
      }

      this.field5874 = null;
   }

   public void method4912(Class1064 var1) {
      this.field5874 = var1;
      this.field5874.field5875 = this;
   }

   public boolean method4913() {
      return this.field5875 != null;
   }

   public boolean method4914() {
      return this.field5874 != null;
   }

   @Nullable
   public Class1064 method4915() {
      return this.field5874;
   }

   @Override
   public double method4773() {
      return 2.0;
   }

   @Override
   public void method4916() {
      if (!this.method4914() && this.method3005()) {
         super.method4916();
      }
   }

   @Override
   public boolean method4917() {
      return false;
   }

   @Override
   public void method4530(Class880 var1, float var2) {
      this.method4909(var1);
   }

   @Override
   public Vector3d method3394() {
      return new Vector3d(0.0, 0.75 * (double)this.method3393(), (double)this.method3429() * 0.5);
   }

   // $VF: synthetic method
   public static boolean method4918(Class1064 var0) {
      return var0.field5873;
   }

   // $VF: synthetic method
   public static void method4919(Class1064 var0, boolean var1) {
      var0.method4910(var1);
   }
}