package remapped;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class class_1595 extends class_1173 implements class_2354 {
   private final class_5479<class_1595> field_8312 = new class_5479<class_1595>(this, 1.0, 20, 15.0F);
   private final class_9037 field_8311 = new class_1054(this, this, 1.2, false);

   public class_1595(class_6629<? extends class_1595> var1, class_6486 var2) {
      super(var1, var2);
      this.method_7153();
   }

   @Override
   public void method_26851() {
      this.field_29916.method_3485(2, new class_5311(this));
      this.field_29916.method_3485(3, new class_2829(this, 1.0));
      this.field_29916.method_3485(3, new class_6837<class_9408>(this, class_9408.class, 6.0F, 1.0, 1.2));
      this.field_29916.method_3485(5, new class_2889(this, 1.0));
      this.field_29916.method_3485(6, new class_4407(this, class_704.class, 8.0F));
      this.field_29916.method_3485(6, new class_9691(this));
      this.field_29908.method_3485(1, new class_8420(this));
      this.field_29908.method_3485(2, new class_4138<class_704>(this, class_704.class, true));
      this.field_29908.method_3485(3, new class_4138<class_8127>(this, class_8127.class, true));
      this.field_29908.method_3485(3, new class_4138<class_3845>(this, class_3845.class, 10, true, false, class_3845.field_18768));
   }

   public static class_1313 method_7151() {
      return class_1173.method_5201().method_5984(class_7331.field_37465, 0.25);
   }

   @Override
   public void method_37207(class_1331 var1, class_2522 var2) {
      this.method_37155(this.method_7150(), 0.15F, 1.0F);
   }

   public abstract class_8461 method_7150();

   @Override
   public class_2780 method_26550() {
      return class_2780.field_13579;
   }

   @Override
   public void method_26606() {
      boolean var3 = this.method_26884();
      if (var3) {
         class_6098 var4 = this.method_26520(class_6943.field_35704);
         if (!var4.method_28022()) {
            if (var4.method_27959()) {
               var4.method_27999(var4.method_28026() + this.field_41717.nextInt(2));
               if (var4.method_28026() >= var4.method_27957()) {
                  this.method_26448(class_6943.field_35704);
                  this.method_37349(class_6943.field_35704, class_6098.field_31203);
               }
            }

            var3 = false;
         }

         if (var3) {
            this.method_37178(8);
         }
      }

      super.method_26606();
   }

   @Override
   public void method_37189() {
      super.method_37189();
      if (this.method_37243() instanceof class_4612) {
         class_4612 var3 = (class_4612)this.method_37243();
         this.field_29605 = var3.field_29605;
      }
   }

   @Override
   public void method_26870(class_9589 var1) {
      super.method_26870(var1);
      this.method_37349(class_6943.field_35707, new class_6098(class_4897.field_25206));
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, class_5734 var5) {
      var4 = super.method_26864(var1, var2, var3, var4, var5);
      this.method_26870(var2);
      this.method_26893(var2);
      this.method_7153();
      this.method_26871(this.field_41717.nextFloat() < 0.55F * var2.method_44284());
      if (this.method_26520(class_6943.field_35704).method_28022()) {
         LocalDate var8 = LocalDate.now();
         int var9 = var8.get(ChronoField.DAY_OF_MONTH);
         int var10 = var8.get(ChronoField.MONTH_OF_YEAR);
         if (var10 == 10 && var9 == 31 && this.field_41717.nextFloat() < 0.25F) {
            this.method_37349(class_6943.field_35704, new class_6098(!(this.field_41717.nextFloat() < 0.1F) ? class_4783.field_23281 : class_4783.field_23855));
            this.field_29918[class_6943.field_35704.method_31767()] = 0.0F;
         }
      }

      return var4;
   }

   public void method_7153() {
      if (this.field_41768 != null && !this.field_41768.field_33055) {
         this.field_29916.method_3488(this.field_8311);
         this.field_29916.method_3488(this.field_8312);
         class_6098 var3 = this.method_26617(class_8462.method_38934(this, class_4897.field_25206));
         if (var3.method_27960() != class_4897.field_25206) {
            this.field_29916.method_3485(4, this.field_8311);
         } else {
            byte var4 = 20;
            if (this.field_41768.method_43370() != class_423.field_1782) {
               var4 = 40;
            }

            this.field_8312.method_24899(var4);
            this.field_29916.method_3485(4, this.field_8312);
         }
      }
   }

   @Override
   public void method_10805(class_5834 var1, float var2) {
      class_6098 var5 = this.method_26475(this.method_26617(class_8462.method_38934(this, class_4897.field_25206)));
      class_6749 var6 = this.method_7152(var5, var2);
      double var7 = var1.method_37302() - this.method_37302();
      double var9 = var1.method_37080(0.3333333333333333) - var6.method_37309();
      double var11 = var1.method_37156() - this.method_37156();
      double var13 = (double)class_9299.method_42842(var7 * var7 + var11 * var11);
      var6.method_26161(var7, var9 + var13 * 0.2F, var11, 1.6F, (float)(14 - this.field_41768.method_43370().method_2097() * 4));
      this.method_37155(class_463.field_2526, 1.0F, 1.0F / (this.method_26594().nextFloat() * 0.4F + 0.8F));
      this.field_41768.method_7509(var6);
   }

   public class_6749 method_7152(class_6098 var1, float var2) {
      return class_8462.method_38930(this, var1, var2);
   }

   @Override
   public boolean method_26878(class_551 var1) {
      return var1 == class_4897.field_25206;
   }

   @Override
   public void method_37314(class_5734 var1) {
      super.method_37314(var1);
      this.method_7153();
   }

   @Override
   public void method_37349(class_6943 var1, class_6098 var2) {
      super.method_37349(var1, var2);
      if (!this.field_41768.field_33055) {
         this.method_7153();
      }
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return 1.74F;
   }

   @Override
   public double method_37106() {
      return -0.6;
   }
}