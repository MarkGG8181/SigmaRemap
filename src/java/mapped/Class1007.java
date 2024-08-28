package mapped;

import com.google.common.collect.Lists;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class Class1007 extends Class1006 implements Class1008 {
   private static final Logger field5618 = LogManager.getLogger();
   public static final Class9289<Integer> field5619 = Class9361.<Integer>method35441(Class1007.class, Class7784.field33391);
   private static final Class8522 field5620 = new Class8522().method30203(64.0);
   public final double[][] field5621 = new double[64][3];
   public int field5622 = -1;
   private final Class908[] field5623;
   public final Class908 field5624;
   private final Class908 field5625;
   private final Class908 field5626;
   private final Class908 field5627;
   private final Class908 field5628;
   private final Class908 field5629;
   private final Class908 field5630;
   private final Class908 field5631;
   public float field5632;
   public float field5633;
   public boolean field5634;
   public int field5635;
   public float field5636;
   public Class1001 field5637;
   private final Class7819 field5638;
   private final Class8942 field5639;
   private int field5640 = 100;
   private int field5641;
   private final Class7176[] field5642 = new Class7176[24];
   private final int[] field5643 = new int[24];
   private final Class8662 field5644 = new Class8662();

   public Class1007(Class8992<? extends Class1007> var1, Class1655 var2) {
      super(Class8992.field41024, var2);
      this.field5624 = new Class908(this, "head", 1.0F, 1.0F);
      this.field5625 = new Class908(this, "neck", 3.0F, 3.0F);
      this.field5626 = new Class908(this, "body", 5.0F, 3.0F);
      this.field5627 = new Class908(this, "tail", 2.0F, 2.0F);
      this.field5628 = new Class908(this, "tail", 2.0F, 2.0F);
      this.field5629 = new Class908(this, "tail", 2.0F, 2.0F);
      this.field5630 = new Class908(this, "wing", 4.0F, 2.0F);
      this.field5631 = new Class908(this, "wing", 4.0F, 2.0F);
      this.field5623 = new Class908[]{
         this.field5624, this.field5625, this.field5626, this.field5627, this.field5628, this.field5629, this.field5630, this.field5631
      };
      this.method3043(this.method3075());
      this.field5052 = true;
      this.field5077 = true;
      if (!(var2 instanceof Class1657)) {
         this.field5638 = null;
      } else {
         this.field5638 = ((Class1657)var2).method6968();
      }

      this.field5639 = new Class8942(this);
   }

   public static Class7037 method2997() {
      return Class1006.method4220().method21849(Class9173.field42105, 200.0);
   }

   @Override
   public void method2850() {
      super.method2850();
      this.method3210().method35442(field5619, Class9598.field44906.method37259());
   }

   public double[] method4317(int var1, float var2) {
      if (this.method3044()) {
         var2 = 0.0F;
      }

      var2 = 1.0F - var2;
      int var5 = this.field5622 - var1 & 63;
      int var6 = this.field5622 - var1 - 1 & 63;
      double[] var7 = new double[3];
      double var8 = this.field5621[var5][0];
      double var10 = Class9679.method37793(this.field5621[var6][0] - var8);
      var7[0] = var8 + var10 * (double)var2;
      var8 = this.field5621[var5][1];
      var10 = this.field5621[var6][1] - var8;
      var7[1] = var8 + var10 * (double)var2;
      var7[2] = Class9679.method37822((double)var2, this.field5621[var5][2], this.field5621[var6][2]);
      return var7;
   }

   @Override
   public void method2871() {
      if (this.field5024.field9020) {
         this.method3043(this.method3042());
         if (!this.method3245()) {
            float var3 = Class9679.method37764(this.field5633 * (float) (Math.PI * 2));
            float var4 = Class9679.method37764(this.field5632 * (float) (Math.PI * 2));
            if (var4 <= -0.3F && var3 >= -0.3F) {
               this.field5024
                  .method6745(
                     this.getPosX(),
                     this.getPosY(),
                     this.getPosZ(),
                     Class6067.field26539,
                     this.method2864(),
                     5.0F,
                     0.8F + this.field5054.nextFloat() * 0.3F,
                     false
                  );
            }

            if (!this.field5639.method32672().method23358() && --this.field5640 < 0) {
               this.field5024
                  .method6745(
                     this.getPosX(),
                     this.getPosY(),
                     this.getPosZ(),
                     Class6067.field26540,
                     this.method2864(),
                     2.5F,
                     0.8F + this.field5054.nextFloat() * 0.3F,
                     false
                  );
               this.field5640 = 200 + this.field5054.nextInt(200);
            }
         }
      }

      this.field5632 = this.field5633;
      if (!this.method3044()) {
         this.method4320();
         Vector3d var42 = this.method3433();
         float var44 = 0.2F / (Class9679.method37766(method3234(var42)) * 10.0F + 1.0F);
         var44 *= (float)Math.pow(2.0, var42.field18049);
         if (!this.field5639.method32672().method23358()) {
            if (!this.field5634) {
               this.field5633 += var44;
            } else {
               this.field5633 += var44 * 0.5F;
            }
         } else {
            this.field5633 += 0.1F;
         }

         this.field5031 = Class9679.method37792(this.field5031);
         if (!this.method4305()) {
            if (this.field5622 < 0) {
               for (int var5 = 0; var5 < this.field5621.length; var5++) {
                  this.field5621[var5][0] = (double)this.field5031;
                  this.field5621[var5][1] = this.getPosY();
               }
            }

            if (++this.field5622 == this.field5621.length) {
               this.field5622 = 0;
            }

            this.field5621[this.field5622][0] = (double)this.field5031;
            this.field5621[this.field5622][1] = this.getPosY();
            if (!this.field5024.field9020) {
               Class7373 var47 = this.field5639.method32672();
               var47.method23360();
               if (this.field5639.method32672() != var47) {
                  var47 = this.field5639.method32672();
                  var47.method23360();
               }

               Vector3d var6 = var47.method23365();
               if (var6 != null) {
                  double var9 = var6.field18048 - this.getPosX();
                  double var11 = var6.field18049 - this.getPosY();
                  double var13 = var6.field18050 - this.getPosZ();
                  double var15 = var9 * var9 + var11 * var11 + var13 * var13;
                  float var17 = var47.method23364();
                  double var18 = (double)Class9679.method37766(var9 * var9 + var13 * var13);
                  if (var18 > 0.0) {
                     var11 = Class9679.method37778(var11 / var18, (double)(-var17), (double)var17);
                  }

                  this.method3434(this.method3433().method11339(0.0, var11 * 0.01, 0.0));
                  this.field5031 = Class9679.method37792(this.field5031);
                  double var20 = Class9679.method37778(
                     Class9679.method37793(180.0 - Class9679.method37814(var9, var13) * 180.0F / (float)Math.PI - (double)this.field5031), -50.0, 50.0
                  );
                  Vector3d var22 = var6.method11337(this.getPosX(), this.getPosY(), this.getPosZ()).method11333();
                  Vector3d var23 = new Vector3d(
                        (double)Class9679.method37763(this.field5031 * (float) (Math.PI / 180.0)),
                        this.method3433().field18049,
                        (double)(-Class9679.method37764(this.field5031 * (float) (Math.PI / 180.0)))
                     )
                     .method11333();
                  float var24 = Math.max(((float)var23.method11334(var22) + 0.5F) / 1.5F, 0.0F);
                  this.field5636 *= 0.8F;
                  this.field5636 = (float)((double)this.field5636 + var20 * (double)var47.method23367());
                  this.field5031 = this.field5031 + this.field5636 * 0.1F;
                  float var25 = (float)(2.0 / (var15 + 1.0));
                  float var26 = 0.06F;
                  this.method3265(0.06F * (var24 * var25 + (1.0F - var25)), new Vector3d(0.0, 0.0, -1.0));
                  if (!this.field5634) {
                     this.move(Class2107.field13742, this.method3433());
                  } else {
                     this.move(Class2107.field13742, this.method3433().method11344(0.8F));
                  }

                  Vector3d var27 = this.method3433().method11333();
                  double var28 = 0.8 + 0.15 * (var27.method11334(var23) + 1.0) / 2.0;
                  this.method3434(this.method3433().method11347(var28, 0.91F, var28));
               }
            } else {
               if (this.field4985 > 0) {
                  double var7 = this.getPosX() + (this.field4986 - this.getPosX()) / (double)this.field4985;
                  double var52 = this.getPosY() + (this.field4987 - this.getPosY()) / (double)this.field4985;
                  double var53 = this.getPosZ() + (this.field4988 - this.getPosZ()) / (double)this.field4985;
                  double var54 = Class9679.method37793(this.field4989 - (double)this.field5031);
                  this.field5031 = (float)((double)this.field5031 + var54 / (double)this.field4985);
                  this.field5032 = (float)((double)this.field5032 + (this.field4990 - (double)this.field5032) / (double)this.field4985);
                  this.field4985--;
                  this.method3215(var7, var52, var53);
                  this.method3214(this.field5031, this.field5032);
               }

               this.field5639.method32672().method23359();
            }

            this.field4965 = this.field5031;
            Vector3d[] var48 = new Vector3d[this.field5623.length];

            for (int var50 = 0; var50 < this.field5623.length; var50++) {
               var48[var50] = new Vector3d(this.field5623[var50].getPosX(), this.field5623[var50].getPosY(), this.field5623[var50].getPosZ());
            }

            float var51 = (float)(this.method4317(5, 1.0F)[1] - this.method4317(10, 1.0F)[1]) * 10.0F * (float) (Math.PI / 180.0);
            float var30 = Class9679.method37764(var51);
            float var31 = Class9679.method37763(var51);
            float var32 = this.field5031 * (float) (Math.PI / 180.0);
            float var33 = Class9679.method37763(var32);
            float var34 = Class9679.method37764(var32);
            this.method4318(this.field5626, (double)(var33 * 0.5F), 0.0, (double)(-var34 * 0.5F));
            this.method4318(this.field5630, (double)(var34 * 4.5F), 2.0, (double)(var33 * 4.5F));
            this.method4318(this.field5631, (double)(var34 * -4.5F), 2.0, (double)(var33 * -4.5F));
            if (!this.field5024.field9020 && this.field4952 == 0) {
               this.method4321(
                  this.field5024.method6770(this, this.field5630.method3389().method19663(4.0, 2.0, 4.0).method19667(0.0, -2.0, 0.0), Class8088.field34761)
               );
               this.method4321(
                  this.field5024.method6770(this, this.field5631.method3389().method19663(4.0, 2.0, 4.0).method19667(0.0, -2.0, 0.0), Class8088.field34761)
               );
               this.method4322(this.field5024.method6770(this, this.field5624.method3389().method19664(1.0), Class8088.field34761));
               this.method4322(this.field5024.method6770(this, this.field5625.method3389().method19664(1.0), Class8088.field34761));
            }

            float var35 = Class9679.method37763(this.field5031 * (float) (Math.PI / 180.0) - this.field5636 * 0.01F);
            float var36 = Class9679.method37764(this.field5031 * (float) (Math.PI / 180.0) - this.field5636 * 0.01F);
            float var37 = this.method4319();
            this.method4318(this.field5624, (double)(var35 * 6.5F * var30), (double)(var37 + var31 * 6.5F), (double)(-var36 * 6.5F * var30));
            this.method4318(this.field5625, (double)(var35 * 5.5F * var30), (double)(var37 + var31 * 5.5F), (double)(-var36 * 5.5F * var30));
            double[] var55 = this.method4317(5, 1.0F);

            for (int var38 = 0; var38 < 3; var38++) {
               Class908 var39 = null;
               if (var38 == 0) {
                  var39 = this.field5627;
               }

               if (var38 == 1) {
                  var39 = this.field5628;
               }

               if (var38 == 2) {
                  var39 = this.field5629;
               }

               double[] var40 = this.method4317(12 + var38 * 2, 1.0F);
               float var41 = this.field5031 * (float) (Math.PI / 180.0) + this.method4323(var40[0] - var55[0]) * (float) (Math.PI / 180.0);
               float var56 = Class9679.method37763(var41);
               float var57 = Class9679.method37764(var41);
               float var58 = 1.5F;
               float var59 = (float)(var38 + 1) * 2.0F;
               this.method4318(
                  var39,
                  (double)(-(var33 * 1.5F + var56 * var59) * var30),
                  var40[1] - var55[1] - (double)((var59 + 1.5F) * var31) + 1.5,
                  (double)((var34 * 1.5F + var57 * var59) * var30)
               );
            }

            if (!this.field5024.field9020) {
               this.field5634 = this.method4324(this.field5624.method3389())
                  | this.method4324(this.field5625.method3389())
                  | this.method4324(this.field5626.method3389());
               if (this.field5638 != null) {
                  this.field5638.method26124(this);
               }
            }

            for (int var60 = 0; var60 < this.field5623.length; var60++) {
               this.field5623[var60].field5025 = var48[var60].field18048;
               this.field5623[var60].field5026 = var48[var60].field18049;
               this.field5623[var60].field5027 = var48[var60].field18050;
               this.field5623[var60].field5048 = var48[var60].field18048;
               this.field5623[var60].field5049 = var48[var60].field18049;
               this.field5623[var60].field5050 = var48[var60].field18050;
            }
         } else {
            this.field5633 = 0.5F;
         }
      } else {
         float var43 = (this.field5054.nextFloat() - 0.5F) * 8.0F;
         float var46 = (this.field5054.nextFloat() - 0.5F) * 4.0F;
         float var49 = (this.field5054.nextFloat() - 0.5F) * 8.0F;
         this.field5024
            .method6746(
               Class7940.field34070,
               this.getPosX() + (double)var43,
               this.getPosY() + 2.0 + (double)var46,
               this.getPosZ() + (double)var49,
               0.0,
               0.0,
               0.0
            );
      }
   }

   private void method4318(Class908 var1, double var2, double var4, double var6) {
      var1.method3215(this.getPosX() + var2, this.getPosY() + var4, this.getPosZ() + var6);
   }

   private float method4319() {
      if (!this.field5639.method32672().method23358()) {
         double[] var3 = this.method4317(5, 1.0F);
         double[] var4 = this.method4317(0, 1.0F);
         return (float)(var3[1] - var4[1]);
      } else {
         return -1.0F;
      }
   }

   private void method4320() {
      if (this.field5637 != null) {
         if (!this.field5637.field5041) {
            if (this.field5055 % 10 == 0 && this.method3042() < this.method3075()) {
               this.method3043(this.method3042() + 1.0F);
            }
         } else {
            this.field5637 = null;
         }
      }

      if (this.field5054.nextInt(10) == 0) {
         List<Class1001> var3 = this.field5024.<Class1001>method7182(Class1001.class, this.method3389().method19664(32.0));
         Class1001 var4 = null;
         double var5 = Double.MAX_VALUE;

         for (Class1001 var8 : var3) {
            double var9 = var8.method3277(this);
            if (var9 < var5) {
               var5 = var9;
               var4 = var8;
            }
         }

         this.field5637 = var4;
      }
   }

   private void method4321(List<Entity> var1) {
      double var4 = (this.field5626.method3389().field28449 + this.field5626.method3389().field28452) / 2.0;
      double var6 = (this.field5626.method3389().field28451 + this.field5626.method3389().field28454) / 2.0;

      for (Entity var9 : var1) {
         if (var9 instanceof Class880) {
            double var10 = var9.getPosX() - var4;
            double var12 = var9.getPosZ() - var6;
            double var14 = Math.max(var10 * var10 + var12 * var12, 0.1);
            var9.method3280(var10 / var14 * 4.0, 0.2F, var12 / var14 * 4.0);
            if (!this.field5639.method32672().method23358() && ((Class880)var9).method3015() < var9.field5055 - 2) {
               var9.method2741(Class8654.method31115(this), 5.0F);
               this.method3399(this, var9);
            }
         }
      }
   }

   private void method4322(List<Entity> var1) {
      for (Entity var5 : var1) {
         if (var5 instanceof Class880) {
            var5.method2741(Class8654.method31115(this), 10.0F);
            this.method3399(this, var5);
         }
      }
   }

   private float method4323(double var1) {
      return (float)Class9679.method37793(var1);
   }

   private boolean method4324(Class6488 var1) {
      int var4 = Class9679.method37769(var1.field28449);
      int var5 = Class9679.method37769(var1.field28450);
      int var6 = Class9679.method37769(var1.field28451);
      int var7 = Class9679.method37769(var1.field28452);
      int var8 = Class9679.method37769(var1.field28453);
      int var9 = Class9679.method37769(var1.field28454);
      boolean var10 = false;
      boolean var11 = false;

      for (int var12 = var4; var12 <= var7; var12++) {
         for (int var13 = var5; var13 <= var8; var13++) {
            for (int var14 = var6; var14 <= var9; var14++) {
               BlockPos var15 = new BlockPos(var12, var13, var14);
               Class7380 var16 = this.field5024.method6738(var15);
               Block var17 = var16.method23383();
               if (!var16.method23393() && var16.method23384() != Class8649.field38945) {
                  if (this.field5024.method6789().method17135(Class5462.field24224) && !Class7645.field32791.method24917(var17)) {
                     var11 = this.field5024.method6728(var15, false) || var11;
                  } else {
                     var10 = true;
                  }
               }
            }
         }
      }

      if (var11) {
         BlockPos var18 = new BlockPos(
            var4 + this.field5054.nextInt(var7 - var4 + 1), var5 + this.field5054.nextInt(var8 - var5 + 1), var6 + this.field5054.nextInt(var9 - var6 + 1)
         );
         this.field5024.method6999(2008, var18, 0);
      }

      return var10;
   }

   public boolean method4325(Class908 var1, Class8654 var2, float var3) {
      if (this.field5639.method32672().method23368() == Class9598.field44905) {
         return false;
      } else {
         var3 = this.field5639.method32672().method23366(var2, var3);
         if (var1 != this.field5624) {
            var3 = var3 / 4.0F + Math.min(var3, 1.0F);
         }

         if (var3 < 0.01F) {
            return false;
         } else {
            if (var2.method31109() instanceof PlayerEntity || var2.method31131()) {
               float var6 = this.method3042();
               this.method4326(var2, var3);
               if (this.method3044() && !this.field5639.method32672().method23358()) {
                  this.method3043(1.0F);
                  this.field5639.method32671(Class9598.field44905);
               }

               if (this.field5639.method32672().method23358()) {
                  this.field5641 = (int)((float)this.field5641 + (var6 - this.method3042()));
                  if ((float)this.field5641 > 0.25F * this.method3075()) {
                     this.field5641 = 0;
                     this.field5639.method32671(Class9598.field44900);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (var1 instanceof Class8652 && ((Class8652)var1).method31108()) {
         this.method4325(this.field5626, var1, var2);
      }

      return false;
   }

   public boolean method4326(Class8654 var1, float var2) {
      return super.method2741(var1, var2);
   }

   @Override
   public void method2995() {
      this.method2904();
      if (this.field5638 != null) {
         this.field5638.method26124(this);
         this.field5638.method26119(this);
      }
   }

   @Override
   public void method3008() {
      if (this.field5638 != null) {
         this.field5638.method26124(this);
      }

      this.field5635++;
      if (this.field5635 >= 180 && this.field5635 <= 200) {
         float var3 = (this.field5054.nextFloat() - 0.5F) * 8.0F;
         float var4 = (this.field5054.nextFloat() - 0.5F) * 4.0F;
         float var5 = (this.field5054.nextFloat() - 0.5F) * 8.0F;
         this.field5024
            .method6746(
               Class7940.field34069, this.getPosX() + (double)var3, this.getPosY() + 2.0 + (double)var4, this.getPosZ() + (double)var5, 0.0, 0.0, 0.0
            );
      }

      boolean var6 = this.field5024.method6789().method17135(Class5462.field24227);
      short var7 = 500;
      if (this.field5638 != null && !this.field5638.method26127()) {
         var7 = 12000;
      }

      if (!this.field5024.field9020) {
         if (this.field5635 > 150 && this.field5635 % 5 == 0 && var6) {
            this.method4327(Class9679.method37767((float)var7 * 0.08F));
         }

         if (this.field5635 == 1 && !this.method3245()) {
            this.field5024.method6801(1028, this.method3432(), 0);
         }
      }

      this.move(Class2107.field13742, new Vector3d(0.0, 0.1F, 0.0));
      this.field5031 += 20.0F;
      this.field4965 = this.field5031;
      if (this.field5635 == 200 && !this.field5024.field9020) {
         if (var6) {
            this.method4327(Class9679.method37767((float)var7 * 0.2F));
         }

         if (this.field5638 != null) {
            this.field5638.method26119(this);
         }

         this.method2904();
      }
   }

   private void method4327(int var1) {
      while (var1 > 0) {
         int var4 = Class1003.method4179(var1);
         var1 -= var4;
         this.field5024.method6916(new Class1003(this.field5024, this.getPosX(), this.getPosY(), this.getPosZ(), var4));
      }
   }

   public int method4328() {
      if (this.field5642[0] == null) {
         for (int var3 = 0; var3 < 24; var3++) {
            byte var4 = 5;
            int var6;
            int var7;
            if (var3 >= 12) {
               if (var3 >= 20) {
                  int var5 = var3 - 20;
                  var6 = Class9679.method37767(20.0F * Class9679.method37764(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var5)));
                  var7 = Class9679.method37767(20.0F * Class9679.method37763(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var5)));
               } else {
                  int var8 = var3 - 12;
                  var6 = Class9679.method37767(40.0F * Class9679.method37764(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)var8)));
                  var7 = Class9679.method37767(40.0F * Class9679.method37763(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)var8)));
                  var4 += 10;
               }
            } else {
               var6 = Class9679.method37767(60.0F * Class9679.method37764(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)var3)));
               var7 = Class9679.method37767(60.0F * Class9679.method37763(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)var3)));
            }

            int var9 = Math.max(
               this.field5024.method6776() + 10, this.field5024.method7006(Class101.field300, new BlockPos(var6, 0, var7)).getY() + var4
            );
            this.field5642[var3] = new Class7176(var6, var9, var7);
         }

         this.field5643[0] = 6146;
         this.field5643[1] = 8197;
         this.field5643[2] = 8202;
         this.field5643[3] = 16404;
         this.field5643[4] = 32808;
         this.field5643[5] = 32848;
         this.field5643[6] = 65696;
         this.field5643[7] = 131392;
         this.field5643[8] = 131712;
         this.field5643[9] = 263424;
         this.field5643[10] = 526848;
         this.field5643[11] = 525313;
         this.field5643[12] = 1581057;
         this.field5643[13] = 3166214;
         this.field5643[14] = 2138120;
         this.field5643[15] = 6373424;
         this.field5643[16] = 4358208;
         this.field5643[17] = 12910976;
         this.field5643[18] = 9044480;
         this.field5643[19] = 9706496;
         this.field5643[20] = 15216640;
         this.field5643[21] = 13688832;
         this.field5643[22] = 11763712;
         this.field5643[23] = 8257536;
      }

      return this.method4329(this.getPosX(), this.getPosY(), this.getPosZ());
   }

   public int method4329(double var1, double var3, double var5) {
      float var9 = 10000.0F;
      int var10 = 0;
      Class7176 var11 = new Class7176(Class9679.method37769(var1), Class9679.method37769(var3), Class9679.method37769(var5));
      byte var12 = 0;
      if (this.field5638 == null || this.field5638.method26125() == 0) {
         var12 = 12;
      }

      for (int var13 = var12; var13 < 24; var13++) {
         if (this.field5642[var13] != null) {
            float var14 = this.field5642[var13].method22528(var11);
            if (var14 < var9) {
               var9 = var14;
               var10 = var13;
            }
         }
      }

      return var10;
   }

   @Nullable
   public Class8238 method4330(int var1, int var2, Class7176 var3) {
      for (int var6 = 0; var6 < 24; var6++) {
         Class7176 var7 = this.field5642[var6];
         var7.field30856 = false;
         var7.field30854 = 0.0F;
         var7.field30852 = 0.0F;
         var7.field30853 = 0.0F;
         var7.field30855 = null;
         var7.field30851 = -1;
      }

      Class7176 var15 = this.field5642[var1];
      Class7176 var16 = this.field5642[var2];
      var15.field30852 = 0.0F;
      var15.field30853 = var15.method22527(var16);
      var15.field30854 = var15.field30853;
      this.field5644.method31191();
      this.field5644.method31190(var15);
      Class7176 var8 = var15;
      byte var9 = 0;
      if (this.field5638 == null || this.field5638.method26125() == 0) {
         var9 = 12;
      }

      while (!this.field5644.method31196()) {
         Class7176 var10 = this.field5644.method31192();
         if (var10.equals(var16)) {
            if (var3 != null) {
               var3.field30855 = var16;
               var16 = var3;
            }

            return this.method4331(var15, var16);
         }

         if (var10.method22527(var16) < var8.method22527(var16)) {
            var8 = var10;
         }

         var10.field30856 = true;
         int var11 = 0;

         for (int var12 = 0; var12 < 24; var12++) {
            if (this.field5642[var12] == var10) {
               var11 = var12;
               break;
            }
         }

         for (int var17 = var9; var17 < 24; var17++) {
            if ((this.field5643[var11] & 1 << var17) > 0) {
               Class7176 var13 = this.field5642[var17];
               if (!var13.field30856) {
                  float var14 = var10.field30852 + var10.method22527(var13);
                  if (!var13.method22532() || var14 < var13.field30852) {
                     var13.field30855 = var10;
                     var13.field30852 = var14;
                     var13.field30853 = var13.method22527(var16);
                     if (!var13.method22532()) {
                        var13.field30854 = var13.field30852 + var13.field30853;
                        this.field5644.method31190(var13);
                     } else {
                        this.field5644.method31193(var13, var13.field30852 + var13.field30853);
                     }
                  }
               }
            }
         }
      }

      if (var8 != var15) {
         field5618.debug("Failed to find path from {} to {}", var1, var2);
         if (var3 != null) {
            var3.field30855 = var8;
            var8 = var3;
         }

         return this.method4331(var15, var8);
      } else {
         return null;
      }
   }

   private Class8238 method4331(Class7176 var1, Class7176 var2) {
      ArrayList var5 = Lists.newArrayList();
      Class7176 var6 = var2;
      var5.add(0, var2);

      while (var6.field30855 != null) {
         var6 = var6.field30855;
         var5.add(0, var6);
      }

      return new Class8238(var5, new BlockPos(var2.field30847, var2.field30848, var2.field30849), true);
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method102("DragonPhase", this.field5639.method32672().method23368().method37259());
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      if (var1.method118("DragonPhase")) {
         this.field5639.method32671(Class9598.method37260(var1.method122("DragonPhase")));
      }
   }

   @Override
   public void method3447() {
   }

   public Class908[] method4332() {
      return this.field5623;
   }

   @Override
   public boolean method3139() {
      return false;
   }

   @Override
   public Class2266 method2864() {
      return Class2266.field14733;
   }

   @Override
   public Class9455 method4241() {
      return Class6067.field26536;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field26541;
   }

   @Override
   public float method3099() {
      return 5.0F;
   }

   public float method4333(int var1, double[] var2, double[] var3) {
      Class7373 var6 = this.field5639.method32672();
      Class9598 var7 = var6.method23368();
      double var10;
      if (var7 == Class9598.field44899 || var7 == Class9598.field44900) {
         BlockPos var8 = this.field5024.method7006(Class101.field300, Class2909.field17994);
         float var9 = Math.max(Class9679.method37766(var8.method8319(this.method3431(), true)) / 4.0F, 1.0F);
         var10 = (double)((float)var1 / var9);
      } else if (!var6.method23358()) {
         if (var1 != 6) {
            var10 = var3[1] - var2[1];
         } else {
            var10 = 0.0;
         }
      } else {
         var10 = (double)var1;
      }

      return (float)var10;
   }

   public Vector3d method4334(float var1) {
      Class7373 var4 = this.field5639.method32672();
      Class9598 var5 = var4.method23368();
      Vector3d var11;
      if (var5 == Class9598.field44899 || var5 == Class9598.field44900) {
         BlockPos var12 = this.field5024.method7006(Class101.field300, Class2909.field17994);
         float var13 = Math.max(Class9679.method37766(var12.method8319(this.method3431(), true)) / 4.0F, 1.0F);
         float var8 = 6.0F / var13;
         float var9 = this.field5032;
         float var10 = 1.5F;
         this.field5032 = -var8 * 1.5F * 5.0F;
         var11 = this.method3281(var1);
         this.field5032 = var9;
      } else if (!var4.method23358()) {
         var11 = this.method3281(var1);
      } else {
         float var6 = this.field5032;
         float var7 = 1.5F;
         this.field5032 = -45.0F;
         var11 = this.method3281(var1);
         this.field5032 = var6;
      }

      return var11;
   }

   public void method4335(Class1001 var1, BlockPos var2, Class8654 var3) {
      PlayerEntity var6;
      if (!(var3.method31109() instanceof PlayerEntity)) {
         var6 = this.field5024.method7190(field5620, (double)var2.method8304(), (double)var2.getY(), (double)var2.method8306());
      } else {
         var6 = (PlayerEntity)var3.method31109();
      }

      if (var1 == this.field5637) {
         this.method4325(this.field5624, Class8654.method31127(var6), 10.0F);
      }

      this.field5639.method32672().method23361(var1, var2, var3, var6);
   }

   @Override
   public void method3155(Class9289<?> var1) {
      if (field5619.equals(var1) && this.field5024.field9020) {
         this.field5639.method32671(Class9598.method37260(this.method3210().<Integer>method35445(field5619)));
      }

      super.method3155(var1);
   }

   public Class8942 method4336() {
      return this.field5639;
   }

   @Nullable
   public Class7819 method4337() {
      return this.field5638;
   }

   @Override
   public boolean method3035(Class2023 var1) {
      return false;
   }

   @Override
   public boolean method3313(Entity var1) {
      return false;
   }

   @Override
   public boolean method3367() {
      return false;
   }
}