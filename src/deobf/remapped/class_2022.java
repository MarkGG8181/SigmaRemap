package remapped;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Random;
import javax.annotation.Nullable;

public class class_2022 extends class_1944 {
   private static final class_7821<Byte> field_10248 = class_8073.<Byte>method_36641(class_2022.class, class_2734.field_13361);
   private static final class_4931 field_10249 = new class_4931().method_22607(4.0).method_22601();
   private class_1331 field_10246;

   public class_2022(class_6629<? extends class_2022> var1, World var2) {
      super(var1, var2);
      this.method_9395(true);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_10248, (byte)0);
   }

   @Override
   public float method_26439() {
      return 0.1F;
   }

   @Override
   public float method_26547() {
      return super.method_26547() * 0.95F;
   }

   @Nullable
   @Override
   public class_8461 method_26918() {
      return this.method_9392() && this.field_41717.nextInt(4) != 0 ? null : class_463.field_2747;
   }

   @Override
   public class_8461 method_26541(class_6199 var1) {
      return class_463.field_2789;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2733;
   }

   @Override
   public boolean method_37177() {
      return false;
   }

   @Override
   public void method_26596(Entity var1) {
   }

   @Override
   public void method_26428() {
   }

   public static class_1313 method_9394() {
      return class_5886.method_26846().method_5984(class_7331.field_37468, 6.0);
   }

   public boolean method_9392() {
      return (this.field_41735.<Byte>method_36640(field_10248) & 1) != 0;
   }

   public void method_9395(boolean var1) {
      byte var4 = this.field_41735.<Byte>method_36640(field_10248);
      if (!var1) {
         this.field_41735.method_36633(field_10248, (byte)(var4 & -2));
      } else {
         this.field_41735.method_36633(field_10248, (byte)(var4 | 1));
      }
   }

   @Override
   public void method_37123() {
      super.method_37123();
      if (!this.method_9392()) {
         this.method_37215(this.method_37098().method_6210(1.0, 0.6, 1.0));
      } else {
         this.method_37215(class_1343.field_7335);
         this.method_37222(this.method_37302(), (double)class_9299.method_42847(this.method_37309()) + 1.0 - (double)this.method_37074(), this.method_37156());
      }
   }

   @Override
   public void method_26919() {
      super.method_26919();
      class_1331 var3 = this.method_37075();
      class_1331 var4 = var3.method_6081();
      if (!this.method_9392()) {
         if (this.field_10246 != null && (!this.field_41768.method_22548(this.field_10246) || this.field_10246.method_12165() < 1)) {
            this.field_10246 = null;
         }

         if (this.field_10246 == null || this.field_41717.nextInt(30) == 0 || this.field_10246.method_12170(this.method_37245(), 2.0)) {
            this.field_10246 = new class_1331(
               this.method_37302() + (double)this.field_41717.nextInt(7) - (double)this.field_41717.nextInt(7),
               this.method_37309() + (double)this.field_41717.nextInt(6) - 2.0,
               this.method_37156() + (double)this.field_41717.nextInt(7) - (double)this.field_41717.nextInt(7)
            );
         }

         double var6 = (double)this.field_10246.method_12173() + 0.5 - this.method_37302();
         double var8 = (double)this.field_10246.method_12165() + 0.1 - this.method_37309();
         double var10 = (double)this.field_10246.method_12185() + 0.5 - this.method_37156();
         class_1343 var12 = this.method_37098();
         class_1343 var13 = var12.method_6214(
            (Math.signum(var6) * 0.5 - var12.field_7336) * 0.1F,
            (Math.signum(var8) * 0.7F - var12.field_7333) * 0.1F,
            (Math.signum(var10) * 0.5 - var12.field_7334) * 0.1F
         );
         this.method_37215(var13);
         float var14 = (float)(class_9299.method_42821(var13.field_7334, var13.field_7336) * 180.0F / (float)Math.PI) - 90.0F;
         float var15 = class_9299.method_42810(var14 - this.field_41701);
         this.field_29673 = 0.5F;
         this.field_41701 += var15;
         if (this.field_41717.nextInt(100) == 0 && this.field_41768.method_28262(var4).method_8356(this.field_41768, var4)) {
            this.method_9395(true);
         }
      } else {
         boolean var5 = this.method_37378();
         if (!this.field_41768.method_28262(var4).method_8356(this.field_41768, var3)) {
            this.method_9395(false);
            if (!var5) {
               this.field_41768.method_43365((class_704)null, 1025, var3, 0);
            }
         } else {
            if (this.field_41717.nextInt(200) == 0) {
               this.field_29618 = (float)this.field_41717.nextInt(360);
            }

            if (this.field_41768.method_25859(field_10249, this) != null) {
               this.method_9395(false);
               if (!var5) {
                  this.field_41768.method_43365((class_704)null, 1025, var3, 0);
               }
            }
         }
      }
   }

   @Override
   public boolean method_37126() {
      return false;
   }

   @Override
   public boolean method_37270(float var1, float var2) {
      return false;
   }

   @Override
   public void method_37105(double var1, boolean var3, class_2522 var4, class_1331 var5) {
   }

   @Override
   public boolean method_37276() {
      return true;
   }

   @Override
   public boolean method_37181(class_6199 var1, float var2) {
      if (!this.method_37180(var1)) {
         if (!this.field_41768.field_33055 && this.method_9392()) {
            this.method_9395(false);
         }

         return super.method_37181(var1, var2);
      } else {
         return false;
      }
   }

   @Override
   public void method_37314(class_5734 var1) {
      super.method_37314(var1);
      this.field_41735.method_36633(field_10248, var1.method_25950("BatFlags"));
   }

   @Override
   public void method_37376(class_5734 var1) {
      super.method_37376(var1);
      var1.method_25921("BatFlags", this.field_41735.<Byte>method_36640(field_10248));
   }

   public static boolean method_9393(class_6629<class_2022> var0, class_9379 var1, class_2417 var2, class_1331 var3, Random var4) {
      if (var3.method_12165() < var1.method_22552()) {
         int var7 = var1.method_22573(var3);
         byte var8 = 4;
         if (!method_9396()) {
            if (var4.nextBoolean()) {
               return false;
            }
         } else {
            var8 = 7;
         }

         return var7 <= var4.nextInt(var8) ? method_26908(var0, var1, var2, var3, var4) : false;
      } else {
         return false;
      }
   }

   private static boolean method_9396() {
      LocalDate var2 = LocalDate.now();
      int var3 = var2.get(ChronoField.DAY_OF_MONTH);
      int var4 = var2.get(ChronoField.MONTH_OF_YEAR);
      return var4 == 10 && var3 >= 20 || var4 == 11 && var3 <= 3;
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return var2.field_31200 / 2.0F;
   }
}
