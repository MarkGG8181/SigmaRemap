package mapped;

import java.util.Objects;
import java.util.Optional;
import java.util.Random;

public class Class1037 extends Class1038 implements Class1022 {
   private static String[] field5754;
   private boolean field5755;
   public final Class6997 field5756;
   public final Class6991 field5757;

   public Class1037(Class8992<? extends Class1037> var1, Class1655 var2) {
      super(var1, var2);
      this.field5051 = 1.0F;
      this.field5596 = new Class6835(this);
      this.method4224(Class2163.field14191, 0.0F);
      this.field5756 = new Class6997(this, var2);
      this.field5757 = new Class6991(this, var2);
   }

   @Override
   public void method4639() {
      this.field5600.method20002(1, new Class2670(this, 1.0));
      this.field5600.method20002(2, new Class2599(this, 1.0, 40, 10.0F));
      this.field5600.method20002(2, new Class2655(this, 1.0, false));
      this.field5600.method20002(5, new Class2629(this, 1.0));
      this.field5600.method20002(6, new Class2659(this, 1.0, this.field5024.method6776()));
      this.field5600.method20002(7, new Class2736(this, 1.0));
      this.field5601.method20002(1, new Class2704(this, Class1037.class).method10918(Class1063.class));
      this.field5601.method20002(2, new Class2709<PlayerEntity>(this, PlayerEntity.class, 10, true, false, this::method4646));
      this.field5601.method20002(3, new Class2709<Class1043>(this, Class1043.class, false));
      this.field5601.method20002(3, new Class2709<Class1058>(this, Class1058.class, true));
      this.field5601.method20002(5, new Class2709<Class1088>(this, Class1088.class, 10, true, false, Class1088.field5963));
   }

   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, Class39 var5) {
      var4 = super.method4276(var1, var2, var3, var4, var5);
      if (this.method2943(Class2106.field13732).method32105() && this.field5054.nextFloat() < 0.03F) {
         this.method2944(Class2106.field13732, new Class8848(Class8514.field38146));
         this.field5605[Class2106.field13732.method8773()] = 2.0F;
      }

      return var4;
   }

   public static boolean method4640(Class8992<Class1037> var0, Class1659 var1, Class2202 var2, BlockPos var3, Random var4) {
      Optional var7 = var1.method7178(var3);
      boolean var8 = var1.method6997() != Class2197.field14351
         && method4340(var1, var3, var4)
         && (var2 == Class2202.field14393 || var1.method6739(var3).method23486(Class8953.field40469));
      return !Objects.equals(var7, Optional.<Class8705<Class8907>>of(Class9495.field44128))
            && !Objects.equals(var7, Optional.<Class8705<Class8907>>of(Class9495.field44132))
         ? var4.nextInt(40) == 0 && method4641(var1, var3) && var8
         : var4.nextInt(15) == 0 && var8;
   }

   private static boolean method4641(Class1660 var0, BlockPos var1) {
      return var1.getY() < var0.method6776() - 5;
   }

   @Override
   public boolean method4642() {
      return false;
   }

   @Override
   public Class9455 method4241() {
      return !this.method3250() ? Class6067.field26514 : Class6067.field26515;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return !this.method3250() ? Class6067.field26518 : Class6067.field26519;
   }

   @Override
   public Class9455 method2880() {
      return !this.method3250() ? Class6067.field26516 : Class6067.field26517;
   }

   @Override
   public Class9455 method4643() {
      return Class6067.field26521;
   }

   @Override
   public Class9455 method2859() {
      return Class6067.field26522;
   }

   @Override
   public Class8848 method4644() {
      return Class8848.field39973;
   }

   @Override
   public void method4270(Class9755 var1) {
      if ((double)this.field5054.nextFloat() > 0.9) {
         int var4 = this.field5054.nextInt(16);
         if (var4 >= 10) {
            this.method2944(Class2106.field13731, new Class8848(Class8514.field37906));
         } else {
            this.method2944(Class2106.field13731, new Class8848(Class8514.field38144));
         }
      }
   }

   @Override
   public boolean method4250(Class8848 var1, Class8848 var2) {
      if (var2.method32107() != Class8514.field38146) {
         if (var2.method32107() != Class8514.field38144) {
            return var1.method32107() != Class8514.field38144 ? super.method4250(var1, var2) : true;
         } else {
            return var1.method32107() != Class8514.field38144 ? false : var1.method32117() < var2.method32117();
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method4645() {
      return false;
   }

   @Override
   public boolean method4266(Class1662 var1) {
      return var1.method7050(this);
   }

   public boolean method4646(Class880 var1) {
      return var1 == null ? false : !this.field5024.method6740() || var1.method3250();
   }

   @Override
   public boolean method2952() {
      return !this.method2951();
   }

   private boolean method4647() {
      if (this.field5755) {
         return true;
      } else {
         Class880 var3 = this.method4232();
         return var3 != null && var3.method3250();
      }
   }

   @Override
   public void method2915(Vector3d var1) {
      if (this.method3138() && this.method3250() && this.method4647()) {
         this.method3265(0.01F, var1);
         this.move(Class2107.field13742, this.method3433());
         this.method3434(this.method3433().method11344(0.9));
      } else {
         super.method2915(var1);
      }
   }

   @Override
   public void method2916() {
      if (!this.field5024.field9020) {
         if (this.method3138() && this.method3250() && this.method4647()) {
            this.field5599 = this.field5756;
            this.method3339(true);
         } else {
            this.field5599 = this.field5757;
            this.method3339(false);
         }
      }
   }

   public boolean method4648() {
      Class8238 var3 = this.method4230().method21657();
      if (var3 != null) {
         BlockPos var4 = var3.method28712();
         if (var4 != null) {
            double var5 = this.method3276((double)var4.method8304(), (double)var4.getY(), (double)var4.method8306());
            if (var5 < 4.0) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void method4530(Class880 var1, float var2) {
      Class886 var5 = new Class886(this.field5024, this, new Class8848(Class8514.field38144));
      double var6 = var1.getPosX() - this.getPosX();
      double var8 = var1.method3440(0.3333333333333333) - var5.getPosY();
      double var10 = var1.getPosZ() - this.getPosZ();
      double var12 = (double)Class9679.method37766(var6 * var6 + var10 * var10);
      var5.method3462(var6, var8 + var12 * 0.2F, var10, 1.6F, (float)(14 - this.field5024.method6997().method8905() * 4));
      this.method2863(Class6067.field26520, 1.0F, 1.0F / (this.method3013().nextFloat() * 0.4F + 0.8F));
      this.field5024.method6916(var5);
   }

   public void method4649(boolean var1) {
      this.field5755 = var1;
   }

   // $VF: synthetic method
   public static Class6990 method4650(Class1037 var0, Class6990 var1) {
      return var0.field5599 = var1;
   }

   // $VF: synthetic method
   public static boolean method4651(Class1037 var0) {
      return var0.method4647();
   }

   // $VF: synthetic method
   public static boolean method4652(Class1037 var0) {
      return var0.field5755;
   }
}