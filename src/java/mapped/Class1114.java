package mapped;

import javax.annotation.Nullable;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Random;

public class Class1114 extends Class1113 {
   private static final Class9289<Byte> field6093 = Class9361.<Byte>method35441(Class1114.class, Class7784.field33390);
   private static final Class8522 field6094 = new Class8522().method30203(4.0).method30205();
   private BlockPos field6095;

   public Class1114(Class8992<? extends Class1114> var1, Class1655 var2) {
      super(var1, var2);
      this.method5365(true);
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field6093, (byte)0);
   }

   @Override
   public float method3099() {
      return 0.1F;
   }

   @Override
   public float method3100() {
      return super.method3100() * 0.95F;
   }

   @Nullable
   @Override
   public Class9455 method4241() {
      return this.method5364() && this.field5054.nextInt(4) != 0 ? null : Class6067.field26380;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field26382;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field26381;
   }

   @Override
   public boolean method3140() {
      return false;
   }

   @Override
   public void method3128(Entity var1) {
   }

   @Override
   public void method3126() {
   }

   public static Class7037 method5363() {
      return Class1006.method4220().method21849(Class9173.field42105, 6.0);
   }

   public boolean method5364() {
      return (this.field5063.<Byte>method35445(field6093) & 1) != 0;
   }

   public void method5365(boolean var1) {
      int var4 = this.field5063.<Byte>method35445(field6093);
      if (!var1) {
         this.field5063.method35446(field6093, (byte)(var4 & -2));
      } else {
         this.field5063.method35446(field6093, (byte)(var4 | 1));
      }
   }

   @Override
   public void tick() {
      super.tick();
      if (!this.method5364()) {
         this.method3434(this.method3433().method11347(1.0, 0.6, 1.0));
      } else {
         this.method3434(Vector3d.field18047);
         this.method3446(this.getPosX(), (double)Class9679.method37769(this.getPosY()) + 1.0 - (double)this.method3430(), this.getPosZ());
      }
   }

   @Override
   public void method4258() {
      super.method4258();
      BlockPos var3 = this.method3432();
      BlockPos var4 = var3.method8311();
      if (!this.method5364()) {
         if (this.field6095 != null && (!this.field5024.method7007(this.field6095) || this.field6095.getY() < 1)) {
            this.field6095 = null;
         }

         if (this.field6095 == null || this.field5054.nextInt(30) == 0 || this.field6095.method8317(this.method3431(), 2.0)) {
            this.field6095 = new BlockPos(
               this.getPosX() + (double)this.field5054.nextInt(7) - (double)this.field5054.nextInt(7),
               this.getPosY() + (double)this.field5054.nextInt(6) - 2.0,
               this.getPosZ() + (double)this.field5054.nextInt(7) - (double)this.field5054.nextInt(7)
            );
         }

         double var6 = (double)this.field6095.method8304() + 0.5 - this.getPosX();
         double var8 = (double)this.field6095.getY() + 0.1 - this.getPosY();
         double var10 = (double)this.field6095.method8306() + 0.5 - this.getPosZ();
         Vector3d var12 = this.method3433();
         Vector3d var13 = var12.method11339(
            (Math.signum(var6) * 0.5 - var12.field18048) * 0.1F,
            (Math.signum(var8) * 0.7F - var12.field18049) * 0.1F,
            (Math.signum(var10) * 0.5 - var12.field18050) * 0.1F
         );
         this.method3434(var13);
         float var14 = (float)(Class9679.method37814(var13.field18050, var13.field18048) * 180.0F / (float)Math.PI) - 90.0F;
         float var15 = Class9679.method37792(var14 - this.field5031);
         this.field4984 = 0.5F;
         this.field5031 += var15;
         if (this.field5054.nextInt(100) == 0 && this.field5024.method6738(var4).method23400(this.field5024, var4)) {
            this.method5365(true);
         }
      } else {
         boolean var5 = this.method3245();
         if (!this.field5024.method6738(var4).method23400(this.field5024, var3)) {
            this.method5365(false);
            if (!var5) {
               this.field5024.method6869((PlayerEntity)null, 1025, var3, 0);
            }
         } else {
            if (this.field5054.nextInt(200) == 0) {
               this.field4967 = (float)this.field5054.nextInt(360);
            }

            if (this.field5024.method7188(field6094, this) != null) {
               this.method5365(false);
               if (!var5) {
                  this.field5024.method6869((PlayerEntity)null, 1025, var3, 0);
               }
            }
         }
      }
   }

   @Override
   public boolean method2940() {
      return false;
   }

   @Override
   public boolean method2921(float var1, float var2) {
      return false;
   }

   @Override
   public void method2761(double var1, boolean var3, Class7380 var4, BlockPos var5) {
   }

   @Override
   public boolean method3371() {
      return true;
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (!this.method2760(var1)) {
         if (!this.field5024.field9020 && this.method5364()) {
            this.method5365(false);
         }

         return super.method2741(var1, var2);
      } else {
         return false;
      }
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      this.field5063.method35446(field6093, var1.method120("BatFlags"));
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method100("BatFlags", this.field5063.<Byte>method35445(field6093));
   }

   public static boolean method5366(Class8992<Class1114> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      if (var3.getY() < var1.method6776()) {
         int var7 = var1.method7015(var3);
         int var8 = 4;
         if (!method5367()) {
            if (var4.nextBoolean()) {
               return false;
            }
         } else {
            var8 = 7;
         }

         return var7 <= var4.nextInt(var8) ? method4264(var0, var1, var2, var3, var4) : false;
      } else {
         return false;
      }
   }

   private static boolean method5367() {
      LocalDate var2 = LocalDate.now();
      int var3 = var2.get(ChronoField.DAY_OF_MONTH);
      int var4 = var2.get(ChronoField.MONTH_OF_YEAR);
      return var4 == 10 && var3 >= 20 || var4 == 11 && var3 <= 3;
   }

   @Override
   public float method2957(Class2090 var1, Class8847 var2) {
      return var2.field39969 / 2.0F;
   }
}
