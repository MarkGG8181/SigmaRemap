package remapped;

import javax.annotation.Nullable;

public class class_3348 extends class_6749 {
   private static final class_7821<Byte> field_16515 = class_8073.<Byte>method_36641(class_3348.class, class_2734.field_13361);
   private static final class_7821<Boolean> field_16516 = class_8073.<Boolean>method_36641(class_3348.class, class_2734.field_13347);
   private class_6098 field_16520 = new class_6098(class_4897.field_25086);
   private boolean field_16518;
   public int field_16517;

   public class_3348(class_6629<? extends class_3348> var1, class_6486 var2) {
      super(var1, var2);
   }

   public class_3348(class_6486 var1, class_5834 var2, class_6098 var3) {
      super(class_6629.field_34284, var2, var1);
      this.field_16520 = var3.method_27973();
      this.field_41735.method_36633(field_16515, (byte)class_2931.method_13431(var3));
      this.field_41735.method_36633(field_16516, var3.method_27977());
   }

   public class_3348(class_6486 var1, double var2, double var4, double var6) {
      super(class_6629.field_34284, var2, var4, var6, var1);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_16515, (byte)0);
      this.field_41735.method_36634(field_16516, false);
   }

   @Override
   public void method_37123() {
      if (this.field_34840 > 4) {
         this.field_16518 = true;
      }

      class_8145 var3 = this.method_26166();
      if ((this.field_16518 || this.method_30926()) && var3 != null) {
         byte var4 = this.field_41735.<Byte>method_36640(field_16515);
         if (var4 > 0 && !this.method_15351()) {
            if (!this.field_41768.field_33055 && this.field_34835 == class_4237.field_20563) {
               this.method_37311(this.method_30925(), 0.1F);
            }

            this.method_37204();
         } else if (var4 > 0) {
            this.method_30919(true);
            class_1343 var5 = new class_1343(
               var3.method_37302() - this.method_37302(), var3.method_37388() - this.method_37309(), var3.method_37156() - this.method_37156()
            );
            this.method_37222(this.method_37302(), this.method_37309() + var5.field_7333 * 0.015 * (double)var4, this.method_37156());
            if (this.field_41768.field_33055) {
               this.field_41713 = this.method_37309();
            }

            double var6 = 0.05 * (double)var4;
            this.method_37215(this.method_37098().method_6209(0.95).method_6215(var5.method_6213().method_6209(var6)));
            if (this.field_16517 == 0) {
               this.method_37155(class_463.field_2181, 10.0F, 1.0F);
            }

            this.field_16517++;
         }
      }

      super.method_37123();
   }

   private boolean method_15351() {
      class_8145 var3 = this.method_26166();
      return var3 != null && var3.method_37330() ? !(var3 instanceof class_9359) || !var3.method_37221() : false;
   }

   @Override
   public class_6098 method_30925() {
      return this.field_16520.method_27973();
   }

   public boolean method_15352() {
      return this.field_41735.<Boolean>method_36640(field_16516);
   }

   @Nullable
   @Override
   public class_5631 method_30939(class_1343 var1, class_1343 var2) {
      return !this.field_16518 ? super.method_30939(var1, var2) : null;
   }

   @Override
   public void method_26163(class_5631 var1) {
      class_8145 var4 = var1.method_25524();
      float var5 = 8.0F;
      if (var4 instanceof class_5834) {
         class_5834 var6 = (class_5834)var4;
         var5 += class_2931.method_13425(this.field_16520, var6.method_26550());
      }

      class_8145 var12 = this.method_26166();
      class_6199 var7 = class_6199.method_28368(this, (class_8145)(var12 != null ? var12 : this));
      this.field_16518 = true;
      class_8461 var8 = class_463.field_2442;
      if (var4.method_37181(var7, var5)) {
         if (var4.method_37387() == class_6629.field_34308) {
            return;
         }

         if (var4 instanceof class_5834) {
            class_5834 var9 = (class_5834)var4;
            if (var12 instanceof class_5834) {
               class_2931.method_13429(var9, var12);
               class_2931.method_13406((class_5834)var12, var9);
            }

            this.method_30935(var9);
         }
      }

      this.method_37215(this.method_37098().method_6210(-0.01, -0.1, -0.01));
      float var13 = 1.0F;
      if (this.field_41768 instanceof class_6331 && this.field_41768.method_29570() && class_2931.method_13424(this.field_16520)) {
         class_1331 var10 = var4.method_37075();
         if (this.field_41768.method_25263(var10)) {
            class_900 var11 = class_6629.field_34224.method_30484(this.field_41768);
            var11.method_37196(class_1343.method_6200(var10));
            var11.method_3857(!(var12 instanceof class_9359) ? null : (class_9359)var12);
            this.field_41768.method_7509(var11);
            var8 = class_463.field_2225;
            var13 = 5.0F;
         }
      }

      this.method_37155(var8, var13, 1.0F);
   }

   @Override
   public class_8461 method_30933() {
      return class_463.field_2570;
   }

   @Override
   public void method_37347(class_704 var1) {
      class_8145 var4 = this.method_26166();
      if (var4 == null || var4.method_37328() == var1.method_37328()) {
         super.method_37347(var1);
      }
   }

   @Override
   public void method_37314(class_5734 var1) {
      super.method_37314(var1);
      if (var1.method_25939("Trident", 10)) {
         this.field_16520 = class_6098.method_28015(var1.method_25937("Trident"));
      }

      this.field_16518 = var1.method_25933("DealtDamage");
      this.field_41735.method_36633(field_16515, (byte)class_2931.method_13431(this.field_16520));
   }

   @Override
   public void method_37376(class_5734 var1) {
      super.method_37376(var1);
      var1.method_25946("Trident", this.field_16520.method_27998(new class_5734()));
      var1.method_25934("DealtDamage", this.field_16518);
   }

   @Override
   public void method_30932() {
      byte var3 = this.field_41735.<Byte>method_36640(field_16515);
      if (this.field_34835 != class_4237.field_20563 || var3 <= 0) {
         super.method_30932();
      }
   }

   @Override
   public float method_30920() {
      return 0.99F;
   }

   @Override
   public boolean method_37185(double var1, double var3, double var5) {
      return true;
   }
}