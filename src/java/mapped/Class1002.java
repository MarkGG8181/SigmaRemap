package mapped;

import com.google.common.collect.UnmodifiableIterator;

import javax.annotation.Nullable;
import java.util.List;

public class Class1002 extends Entity {
   private static final Class9289<Integer> field5524 = Class9361.<Integer>method35441(Class1002.class, Class7784.field33391);
   private static final Class9289<Integer> field5525 = Class9361.<Integer>method35441(Class1002.class, Class7784.field33391);
   private static final Class9289<Float> field5526 = Class9361.<Float>method35441(Class1002.class, Class7784.field33392);
   private static final Class9289<Integer> field5527 = Class9361.<Integer>method35441(Class1002.class, Class7784.field33391);
   private static final Class9289<Boolean> field5528 = Class9361.<Boolean>method35441(Class1002.class, Class7784.field33398);
   private static final Class9289<Boolean> field5529 = Class9361.<Boolean>method35441(Class1002.class, Class7784.field33398);
   private static final Class9289<Integer> field5530 = Class9361.<Integer>method35441(Class1002.class, Class7784.field33391);
   private final float[] field5531 = new float[2];
   private float field5532;
   private float field5533;
   private float field5534;
   private int field5535;
   private double field5536;
   private double field5537;
   private double field5538;
   private double field5539;
   private double field5540;
   private boolean field5541;
   private boolean field5542;
   private boolean field5543;
   private boolean field5544;
   private double field5545;
   private float field5546;
   private Class2096 field5547;
   private Class2096 field5548;
   private double field5549;
   private boolean field5550;
   private boolean field5551;
   private float field5552;
   private float field5553;
   private float field5554;

   public Class1002(Class8992<? extends Class1002> var1, World var2) {
      super(var1, var2);
      this.field5019 = true;
   }

   public Class1002(World var1, double var2, double var4, double var6) {
      this(Class8992.field41011, var1);
      this.method3215(var2, var4, var6);
      this.method3434(Vector3d.field18047);
      this.field5025 = var2;
      this.field5026 = var4;
      this.field5027 = var6;
   }

   @Override
   public float method3181(Class2090 var1, Class8847 var2) {
      return var2.field39969;
   }

   @Override
   public boolean method2940() {
      return false;
   }

   @Override
   public void method2850() {
      this.field5063.method35442(field5524, 0);
      this.field5063.method35442(field5525, 1);
      this.field5063.method35442(field5526, 0.0F);
      this.field5063.method35442(field5527, Class2099.field13680.ordinal());
      this.field5063.method35442(field5528, false);
      this.field5063.method35442(field5529, false);
      this.field5063.method35442(field5530, 0);
   }

   @Override
   public boolean method3305(Entity var1) {
      return method4146(this, var1);
   }

   public static boolean method4146(Entity var0, Entity var1) {
      return (var1.method3306() || var1.method3140()) && !var0.method3416(var1);
   }

   @Override
   public boolean method3306() {
      return true;
   }

   @Override
   public boolean method3140() {
      return true;
   }

   @Override
   public Vector3d method3145(Class113 var1, Class9502 var2) {
      return Class880.method3146(super.method3145(var1, var2));
   }

   @Override
   public double method3310() {
      return -0.1;
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (this.method2760(var1)) {
         return false;
      } else if (!this.field5024.field9020 && !this.field5041) {
         this.method4169(-this.method4170());
         this.method4164(10);
         this.method4162(this.method4163() + var2 * 10.0F);
         this.method3141();
         boolean var5 = var1.method31109() instanceof PlayerEntity && ((PlayerEntity)var1.method31109()).field4919.field29609;
         if (var5 || this.method4163() > 40.0F) {
            if (!var5 && this.field5024.method6789().method17135(Class5462.field24229)) {
               this.method3300(this.method4147());
            }

            this.method2904();
         }

         return true;
      } else {
         return true;
      }
   }

   @Override
   public void method3354(boolean var1) {
      if (!this.field5024.field9020) {
         this.field5550 = true;
         this.field5551 = var1;
         if (this.method4167() == 0) {
            this.method4166(60);
         }
      }

      this.field5024
         .method6746(
            Class7940.field34099,
            this.getPosX() + (double)this.field5054.nextFloat(),
            this.getPosY() + 0.7,
            this.getPosZ() + (double)this.field5054.nextFloat(),
            0.0,
            0.0,
            0.0
         );
      if (this.field5054.nextInt(20) == 0) {
         this.field5024
            .method6745(
               this.getPosX(),
               this.getPosY(),
               this.getPosZ(),
               this.method2860(),
               this.method2864(),
               1.0F,
               0.8F + 0.4F * this.field5054.nextFloat(),
               false
            );
      }
   }

   @Override
   public void method3101(Entity var1) {
      if (!(var1 instanceof Class1002)) {
         if (var1.method3389().field28450 <= this.method3389().field28450) {
            super.method3101(var1);
         }
      } else if (var1.method3389().field28450 < this.method3389().field28453) {
         super.method3101(var1);
      }
   }

   public Class3257 method4147() {
      switch (Class7986.field34313[this.method4172().ordinal()]) {
         case 1:
         default:
            return Class8514.field37889;
         case 2:
            return Class8514.field38121;
         case 3:
            return Class8514.field38122;
         case 4:
            return Class8514.field38123;
         case 5:
            return Class8514.field38124;
         case 6:
            return Class8514.field38125;
      }
   }

   @Override
   public void method3069() {
      this.method4169(-this.method4170());
      this.method4164(10);
      this.method4162(this.method4163() * 11.0F);
   }

   @Override
   public boolean method3139() {
      return !this.field5041;
   }

   @Override
   public void method3131(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.field5536 = var1;
      this.field5537 = var3;
      this.field5538 = var5;
      this.field5539 = (double)var7;
      this.field5540 = (double)var8;
      this.field5535 = 10;
   }

   @Override
   public Direction method3387() {
      return this.method3386().method537();
   }

   @Override
   public void tick() {
      this.field5548 = this.field5547;
      this.field5547 = this.method4153();
      if (this.field5547 != Class2096.field13656 && this.field5547 != Class2096.field13657) {
         this.field5533 = 0.0F;
      } else {
         this.field5533++;
      }

      if (!this.field5024.field9020 && this.field5533 >= 60.0F) {
         this.method3315();
      }

      if (this.method4165() > 0) {
         this.method4164(this.method4165() - 1);
      }

      if (this.method4163() > 0.0F) {
         this.method4162(this.method4163() - 1.0F);
      }

      super.tick();
      this.method4150();
      if (!this.method3418()) {
         this.method3434(Vector3d.field18047);
      } else {
         if (this.method3408().isEmpty() || !(this.method3408().get(0) instanceof PlayerEntity)) {
            this.method4151(false, false);
         }

         this.method4158();
         if (this.field5024.field9020) {
            this.method4159();
            this.field5024.method6811(new Class5538(this.method4161(0), this.method4161(1)));
         }

         this.move(Class2107.field13742, this.method3433());
      }

      this.method4148();

      for (int var3 = 0; var3 <= 1; var3++) {
         if (!this.method4161(var3)) {
            this.field5531[var3] = 0.0F;
         } else {
            if (!this.method3245()
               && (double)(this.field5531[var3] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && ((double)this.field5531[var3] + (float) (Math.PI / 8)) % (float) (Math.PI * 2) >= (float) (Math.PI / 4)) {
               Class9455 var4 = this.method4149();
               if (var4 != null) {
                  Vector3d var5 = this.method3281(1.0F);
                  double var6 = var3 != 1 ? var5.field18050 : -var5.field18050;
                  double var8 = var3 != 1 ? -var5.field18048 : var5.field18048;
                  this.field5024
                     .method6743(
                        (PlayerEntity)null,
                        this.getPosX() + var6,
                        this.getPosY(),
                        this.getPosZ() + var8,
                        var4,
                        this.method2864(),
                        1.0F,
                        0.8F + 0.4F * this.field5054.nextFloat()
                     );
               }
            }

            this.field5531[var3] = (float)((double)this.field5531[var3] + (float) (Math.PI / 8));
         }
      }

      this.method3240();
      List var11 = this.field5024.method6770(this, this.method3389().method19663(0.2F, -0.01F, 0.2F), Class8088.method27981(this));
      if (!var11.isEmpty()) {
         boolean var12 = !this.field5024.field9020 && !(this.method3407() instanceof PlayerEntity);

         for (int var13 = 0; var13 < var11.size(); var13++) {
            Entity var10 = (Entity)var11.get(var13);
            if (!var10.method3409(this)) {
               if (var12
                  && this.method3408().size() < 2
                  && !var10.method3328()
                  && var10.method3429() < this.method3429()
                  && var10 instanceof Class880
                  && !(var10 instanceof Class1047)
                  && !(var10 instanceof PlayerEntity)) {
                  var10.method3311(this);
               } else {
                  this.method3101(var10);
               }
            }
         }
      }
   }

   private void method4148() {
      if (!this.field5024.field9020) {
         if (!this.field5550) {
            this.method4166(0);
         }

         int var3 = this.method4167();
         if (var3 > 0) {
            this.method4166(--var3);
            int var4 = 60 - var3 - 1;
            if (var4 > 0 && var3 == 0) {
               this.method4166(0);
               Vector3d var5 = this.method3433();
               if (!this.field5551) {
                  this.method3435(var5.field18048, !this.method3410(PlayerEntity.class) ? 0.6 : 2.7, var5.field18050);
               } else {
                  this.method3434(var5.method11339(0.0, -0.7, 0.0));
                  this.method3315();
               }
            }

            this.field5550 = false;
         }
      } else {
         int var7 = this.method4167();
         if (var7 <= 0) {
            this.field5552 -= 0.1F;
         } else {
            this.field5552 += 0.05F;
         }

         this.field5552 = MathHelper.method37777(this.field5552, 0.0F, 1.0F);
         this.field5554 = this.field5553;
         this.field5553 = 10.0F * (float)Math.sin((double)(0.5F * (float)this.field5024.method6783())) * this.field5552;
      }
   }

   @Nullable
   public Class9455 method4149() {
      switch (Class7986.field34314[this.method4153().ordinal()]) {
         case 1:
         case 2:
         case 3:
            return Class6067.field26408;
         case 4:
            return Class6067.field26407;
         case 5:
         default:
            return null;
      }
   }

   private void method4150() {
      if (this.method3418()) {
         this.field5535 = 0;
         this.method3201(this.getPosX(), this.getPosY(), this.getPosZ());
      }

      if (this.field5535 > 0) {
         double var3 = this.getPosX() + (this.field5536 - this.getPosX()) / (double)this.field5535;
         double var5 = this.getPosY() + (this.field5537 - this.getPosY()) / (double)this.field5535;
         double var7 = this.getPosZ() + (this.field5538 - this.getPosZ()) / (double)this.field5535;
         double var9 = MathHelper.method37793(this.field5539 - (double)this.field5031);
         this.field5031 = (float)((double)this.field5031 + var9 / (double)this.field5535);
         this.field5032 = (float)((double)this.field5032 + (this.field5540 - (double)this.field5032) / (double)this.field5535);
         this.field5535--;
         this.method3215(var3, var5, var7);
         this.method3214(this.field5031, this.field5032);
      }
   }

   public void method4151(boolean var1, boolean var2) {
      this.field5063.method35446(field5528, var1);
      this.field5063.method35446(field5529, var2);
   }

   public float method4152(int var1, float var2) {
      return !this.method4161(var1)
         ? 0.0F
         : (float) MathHelper.method37779((double)this.field5531[var1] - (float) (Math.PI / 8), (double)this.field5531[var1], (double)var2);
   }

   private Class2096 method4153() {
      Class2096 var3 = this.method4157();
      if (var3 == null) {
         if (!this.method4156()) {
            float var4 = this.method4155();
            if (!(var4 > 0.0F)) {
               return Class2096.field13659;
            } else {
               this.field5546 = var4;
               return Class2096.field13658;
            }
         } else {
            return Class2096.field13655;
         }
      } else {
         this.field5545 = this.method3389().field28453;
         return var3;
      }
   }

   public float method4154() {
      Class6488 var3 = this.method3389();
      int var4 = MathHelper.method37769(var3.field28449);
      int var5 = MathHelper.method37774(var3.field28452);
      int var6 = MathHelper.method37769(var3.field28453);
      int var7 = MathHelper.method37774(var3.field28453 - this.field5549);
      int var8 = MathHelper.method37769(var3.field28451);
      int var9 = MathHelper.method37774(var3.field28454);
      Mutable var10 = new Mutable();

      label45:
      for (int var11 = var6; var11 < var7; var11++) {
         float var12 = 0.0F;

         for (int var13 = var4; var13 < var5; var13++) {
            for (int var14 = var8; var14 < var9; var14++) {
               var10.method8372(var13, var11, var14);
               Class7379 var15 = this.field5024.method6739(var10);
               if (var15.method23486(Class8953.field40469)) {
                  var12 = Math.max(var12, var15.method23475(this.field5024, var10));
               }

               if (var12 >= 1.0F) {
                  continue label45;
               }
            }
         }

         if (var12 < 1.0F) {
            return (float)var10.getY() + var12;
         }
      }

      return (float)(var7 + 1);
   }

   public float method4155() {
      Class6488 var3 = this.method3389();
      Class6488 var4 = new Class6488(var3.field28449, var3.field28450 - 0.001, var3.field28451, var3.field28452, var3.field28450, var3.field28454);
      int var5 = MathHelper.method37769(var4.field28449) - 1;
      int var6 = MathHelper.method37774(var4.field28452) + 1;
      int var7 = MathHelper.method37769(var4.field28450) - 1;
      int var8 = MathHelper.method37774(var4.field28453) + 1;
      int var9 = MathHelper.method37769(var4.field28451) - 1;
      int var10 = MathHelper.method37774(var4.field28454) + 1;
      Class6408 var11 = Class8022.method27428(var4);
      float var12 = 0.0F;
      int var13 = 0;
      Mutable var14 = new Mutable();

      for (int var15 = var5; var15 < var6; var15++) {
         for (int var16 = var9; var16 < var10; var16++) {
            int var17 = (var15 != var5 && var15 != var6 - 1 ? 0 : 1) + (var16 != var9 && var16 != var10 - 1 ? 0 : 1);
            if (var17 != 2) {
               for (int var18 = var7; var18 < var8; var18++) {
                  if (var17 <= 0 || var18 != var7 && var18 != var8 - 1) {
                     var14.method8372(var15, var18, var16);
                     Class7380 var19 = this.field5024.method6738(var14);
                     if (!(var19.method23383() instanceof Class3494)
                        && Class8022.method27435(
                           var19.method23414(this.field5024, var14).method19517((double)var15, (double)var18, (double)var16), var11, Class9477.field44045
                        )) {
                        var12 += var19.method23383().method11571();
                        var13++;
                     }
                  }
               }
            }
         }
      }

      return var12 / (float)var13;
   }

   private boolean method4156() {
      Class6488 var3 = this.method3389();
      int var4 = MathHelper.method37769(var3.field28449);
      int var5 = MathHelper.method37774(var3.field28452);
      int var6 = MathHelper.method37769(var3.field28450);
      int var7 = MathHelper.method37774(var3.field28450 + 0.001);
      int var8 = MathHelper.method37769(var3.field28451);
      int var9 = MathHelper.method37774(var3.field28454);
      boolean var10 = false;
      this.field5545 = Double.MIN_VALUE;
      Mutable var11 = new Mutable();

      for (int var12 = var4; var12 < var5; var12++) {
         for (int var13 = var6; var13 < var7; var13++) {
            for (int var14 = var8; var14 < var9; var14++) {
               var11.method8372(var12, var13, var14);
               Class7379 var15 = this.field5024.method6739(var11);
               if (var15.method23486(Class8953.field40469)) {
                  float var16 = (float)var13 + var15.method23475(this.field5024, var11);
                  this.field5545 = Math.max((double)var16, this.field5545);
                  var10 |= var3.field28450 < (double)var16;
               }
            }
         }
      }

      return var10;
   }

   @Nullable
   private Class2096 method4157() {
      Class6488 var3 = this.method3389();
      double var4 = var3.field28453 + 0.001;
      int var6 = MathHelper.method37769(var3.field28449);
      int var7 = MathHelper.method37774(var3.field28452);
      int var8 = MathHelper.method37769(var3.field28453);
      int var9 = MathHelper.method37774(var4);
      int var10 = MathHelper.method37769(var3.field28451);
      int var11 = MathHelper.method37774(var3.field28454);
      boolean var12 = false;
      Mutable var13 = new Mutable();

      for (int var14 = var6; var14 < var7; var14++) {
         for (int var15 = var8; var15 < var9; var15++) {
            for (int var16 = var10; var16 < var11; var16++) {
               var13.method8372(var14, var15, var16);
               Class7379 var17 = this.field5024.method6739(var13);
               if (var17.method23486(Class8953.field40469) && var4 < (double)((float)var13.getY() + var17.method23475(this.field5024, var13))) {
                  if (!var17.method23473()) {
                     return Class2096.field13657;
                  }

                  var12 = true;
               }
            }
         }
      }

      return !var12 ? null : Class2096.field13656;
   }

   private void method4158() {
      double var3 = -0.04F;
      double var5 = !this.method3247() ? -0.04F : 0.0;
      double var7 = 0.0;
      this.field5532 = 0.05F;
      if (this.field5548 == Class2096.field13659 && this.field5547 != Class2096.field13659 && this.field5547 != Class2096.field13658) {
         this.field5545 = this.method3440(1.0);
         this.method3215(this.getPosX(), (double)(this.method4154() - this.method3430()) + 0.101, this.getPosZ());
         this.method3434(this.method3433().method11347(1.0, 0.0, 1.0));
         this.field5549 = 0.0;
         this.field5547 = Class2096.field13655;
      } else {
         if (this.field5547 != Class2096.field13655) {
            if (this.field5547 != Class2096.field13657) {
               if (this.field5547 != Class2096.field13656) {
                  if (this.field5547 != Class2096.field13659) {
                     if (this.field5547 == Class2096.field13658) {
                        this.field5532 = this.field5546;
                        if (this.method3407() instanceof PlayerEntity) {
                           this.field5546 /= 2.0F;
                        }
                     }
                  } else {
                     this.field5532 = 0.9F;
                  }
               } else {
                  var7 = 0.01F;
                  this.field5532 = 0.45F;
               }
            } else {
               var5 = -7.0E-4;
               this.field5532 = 0.9F;
            }
         } else {
            var7 = (this.field5545 - this.getPosY()) / (double)this.method3430();
            this.field5532 = 0.9F;
         }

         Vector3d var9 = this.method3433();
         this.method3435(var9.field18048 * (double)this.field5532, var9.field18049 + var5, var9.field18050 * (double)this.field5532);
         this.field5534 = this.field5534 * this.field5532;
         if (var7 > 0.0) {
            Vector3d var10 = this.method3433();
            this.method3435(var10.field18048, (var10.field18049 + var7 * 0.06153846016296973) * 0.75, var10.field18050);
         }
      }
   }

   private void method4159() {
      if (this.method3329()) {
         float var3 = 0.0F;
         if (this.field5541) {
            this.field5534--;
         }

         if (this.field5542) {
            this.field5534++;
         }

         if (this.field5542 != this.field5541 && !this.field5543 && !this.field5544) {
            var3 += 0.005F;
         }

         this.field5031 = this.field5031 + this.field5534;
         if (this.field5543) {
            var3 += 0.04F;
         }

         if (this.field5544) {
            var3 -= 0.005F;
         }

         this.method3434(
            this.method3433()
               .method11339(
                  (double)(MathHelper.method37763(-this.field5031 * (float) (Math.PI / 180.0)) * var3),
                  0.0,
                  (double)(MathHelper.method37764(this.field5031 * (float) (Math.PI / 180.0)) * var3)
               )
         );
         this.method4151(this.field5542 && !this.field5541 || this.field5543, this.field5541 && !this.field5542 || this.field5543);
      }
   }

   @Override
   public void method3307(Entity var1) {
      if (this.method3409(var1)) {
         float var4 = 0.0F;
         float var5 = (float)((!this.field5041 ? this.method3310() : 0.01F) + var1.method2894());
         if (this.method3408().size() > 1) {
            int var6 = this.method3408().indexOf(var1);
            if (var6 != 0) {
               var4 = -0.6F;
            } else {
               var4 = 0.2F;
            }

            if (var1 instanceof Class1018) {
               var4 = (float)((double)var4 + 0.2);
            }
         }

         Vector3d var8 = new Vector3d((double)var4, 0.0, 0.0).method11351(-this.field5031 * (float) (Math.PI / 180.0) - (float) (Math.PI / 2));
         var1.method3215(this.getPosX() + var8.field18048, this.getPosY() + (double)var5, this.getPosZ() + var8.field18050);
         var1.field5031 = var1.field5031 + this.field5534;
         var1.method3143(var1.method3142() + this.field5534);
         this.method4160(var1);
         if (var1 instanceof Class1018 && this.method3408().size() > 1) {
            int var7 = var1.method3205() % 2 != 0 ? 270 : 90;
            var1.method3144(((Class1018)var1).field4965 + (float)var7);
            var1.method3143(var1.method3142() + (float)var7);
         }
      }
   }

   @Override
   public Vector3d method3420(Class880 var1) {
      Vector3d var4 = method3419((double)(this.method3429() * MathHelper.field45205), (double)var1.method3429(), this.field5031);
      double var5 = this.getPosX() + var4.field18048;
      double var7 = this.getPosZ() + var4.field18050;
      BlockPos var9 = new BlockPos(var5, this.method3389().field28453, var7);
      BlockPos var10 = var9.method8313();
      if (!this.field5024.method7013(var10)) {
         double var11 = (double)var9.getY() + this.field5024.method7039(var9);
         double var13 = (double)var9.getY() + this.field5024.method7039(var10);
         UnmodifiableIterator var15 = var1.method2982().iterator();

         while (var15.hasNext()) {
            Class2090 var16 = (Class2090)var15.next();
            Vector3d var17 = Class4527.method14425(this.field5024, var5, var11, var7, var1, var16);
            if (var17 != null) {
               var1.method3211(var16);
               return var17;
            }

            Vector3d var18 = Class4527.method14425(this.field5024, var5, var13, var7, var1, var16);
            if (var18 != null) {
               var1.method3211(var16);
               return var18;
            }
         }
      }

      return super.method3420(var1);
   }

   public void method4160(Entity var1) {
      var1.method3144(this.field5031);
      float var4 = MathHelper.method37792(var1.field5031 - this.field5031);
      float var5 = MathHelper.method37777(var4, -105.0F, 105.0F);
      var1.field5033 += var5 - var4;
      var1.field5031 += var5 - var4;
      var1.method3143(var1.field5031);
   }

   @Override
   public void method3309(Entity var1) {
      this.method4160(var1);
   }

   @Override
   public void method2724(Class39 var1) {
      var1.method109("Type", this.method4172().method8761());
   }

   @Override
   public void method2723(Class39 var1) {
      if (var1.method119("Type", 8)) {
         this.method4171(Class2099.method8764(var1.method126("Type")));
      }
   }

   @Override
   public ActionResultType method3304(PlayerEntity var1, Hand var2) {
      if (!var1.method2851()) {
         if (!(this.field5533 < 60.0F)) {
            return ActionResultType.field14820;
         } else if (this.field5024.field9020) {
            return ActionResultType.field14818;
         } else {
            return !var1.method3311(this) ? ActionResultType.field14820 : ActionResultType.field14819;
         }
      } else {
         return ActionResultType.field14820;
      }
   }

   @Override
   public void method2761(double var1, boolean var3, Class7380 var4, BlockPos var5) {
      this.field5549 = this.method3433().field18049;
      if (!this.method3328()) {
         if (!var3) {
            if (!this.field5024.method6739(this.method3432().method8313()).method23486(Class8953.field40469) && var1 < 0.0) {
               this.field5045 = (float)((double)this.field5045 - var1);
            }
         } else {
            if (this.field5045 > 3.0F) {
               if (this.field5547 != Class2096.field13658) {
                  this.field5045 = 0.0F;
                  return;
               }

               this.method2921(this.field5045, 1.0F);
               if (!this.field5024.field9020 && !this.field5041) {
                  this.method2904();
                  if (this.field5024.method6789().method17135(Class5462.field24229)) {
                     for (int var8 = 0; var8 < 3; var8++) {
                        this.method3300(this.method4172().method8762());
                     }

                     for (int var9 = 0; var9 < 2; var9++) {
                        this.method3300(Class8514.field37835);
                     }
                  }
               }
            }

            this.field5045 = 0.0F;
         }
      }
   }

   public boolean method4161(int var1) {
      return this.field5063.<Boolean>method35445(var1 != 0 ? field5529 : field5528) && this.method3407() != null;
   }

   public void method4162(float var1) {
      this.field5063.method35446(field5526, var1);
   }

   public float method4163() {
      return this.field5063.<Float>method35445(field5526);
   }

   public void method4164(int var1) {
      this.field5063.method35446(field5524, var1);
   }

   public int method4165() {
      return this.field5063.<Integer>method35445(field5524);
   }

   private void method4166(int var1) {
      this.field5063.method35446(field5530, var1);
   }

   private int method4167() {
      return this.field5063.<Integer>method35445(field5530);
   }

   public float method4168(float var1) {
      return MathHelper.method37821(var1, this.field5554, this.field5553);
   }

   public void method4169(int var1) {
      this.field5063.method35446(field5525, var1);
   }

   public int method4170() {
      return this.field5063.<Integer>method35445(field5525);
   }

   public void method4171(Class2099 var1) {
      this.field5063.method35446(field5527, var1.ordinal());
   }

   public Class2099 method4172() {
      return Class2099.method8763(this.field5063.<Integer>method35445(field5527));
   }

   @Override
   public boolean method3318(Entity var1) {
      return this.method3408().size() < 2 && !this.method3263(Class8953.field40469);
   }

   @Nullable
   @Override
   public Entity method3407() {
      List var3 = this.method3408();
      return !var3.isEmpty() ? (Entity)var3.get(0) : null;
   }

   public void method4173(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.field5541 = var1;
      this.field5542 = var2;
      this.field5543 = var3;
      this.field5544 = var4;
   }

   @Override
   public Packet<?> method2835() {
      return new Class5487(this);
   }

   @Override
   public boolean method3256() {
      return this.field5547 == Class2096.field13656 || this.field5547 == Class2096.field13657;
   }
}
