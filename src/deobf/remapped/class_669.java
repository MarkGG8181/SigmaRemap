package remapped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class class_669 extends class_9128 {
   private boolean field_3720;
   private int field_3718;

   public class_669() {
      super(class_5664.field_28716, "Vanilla", "Regular vanilla fly");
      this.method_42010(new class_2748<Float>("Speed", "Fly speed", 4.0F, Float.class, 0.28F, 10.0F, 0.01F));
      this.method_42010(new class_8563("Kick bypass", "Bypass vanilla kick for flying", true));
   }

   @Override
   public void method_42006() {
      if (!field_46692.field_9577.field_45560.method_27060()) {
         if (!field_46692.field_9577.field_45560.method_27060()) {
            this.field_3720 = false;
         }
      } else {
         field_46692.field_9577.field_45560.field_30024 = false;
         this.field_3720 = true;
      }
   }

   @Override
   public void method_42020() {
      class_314.method_1408(-0.08);
      double var3 = class_8865.method_40775();
      class_8865.method_40776(var3);
      if (this.field_3720) {
         field_46692.field_9577.field_45560.field_30024 = true;
      }
   }

   @class_9148
   private void method_3072(class_6435 var1) {
      if (this.method_42015()) {
         if (var1.method_29384() == field_46692.field_9577.field_45560.field_30027.field_17800) {
            var1.method_29715(true);
            this.field_3720 = true;
         }
      }
   }

   @class_9148
   private void method_3075(class_307 var1) {
      if (this.method_42015()) {
         if (var1.method_1364() == field_46692.field_9577.field_45560.field_30027.field_17800) {
            var1.method_29715(true);
            this.field_3720 = false;
         }
      }
   }

   @class_9148
   public void method_3074(class_1393 var1) {
      if (this.method_42015()) {
         if (!field_46692.field_9632.field_41726 && this.method_42007("Kick bypass")) {
            if (this.field_3718 > 0 && this.field_3718 % 30 == 0 && !class_314.method_1413(field_46692.field_9632, 0.01F)) {
               if (class_3347.method_15349() != class_412.field_1747.method_2055()) {
                  var1.method_6455(var1.method_6454() - 0.04);
               } else {
                  double var4 = this.method_3073();
                  if (var4 < 0.0) {
                     return;
                  }

                  double var6 = var1.method_6454();
                  ArrayList var8 = new ArrayList();
                  if (!(var6 - var4 > 9.0)) {
                     field_46692.method_8614().method_4813(new class_9515(var1.method_6450(), var4, var1.method_6438(), true));
                  } else {
                     while (var6 > var4 + 9.0) {
                        var6 -= 9.0;
                        var8.add(var6);
                        field_46692.method_8614().method_4813(new class_9515(var1.method_6450(), var6, var1.method_6438(), true));
                     }

                     for (Double var10 : var8) {
                        field_46692.method_8614().method_4813(new class_9515(var1.method_6450(), var10, var1.method_6438(), true));
                     }

                     field_46692.method_8614().method_4813(new class_9515(var1.method_6450(), var4, var1.method_6438(), true));
                     Collections.reverse(var8);

                     for (Double var12 : var8) {
                        field_46692.method_8614().method_4813(new class_9515(var1.method_6450(), var12, var1.method_6438(), true));
                     }

                     field_46692.method_8614().method_4813(new class_9515(var1.method_6450(), var1.method_6454(), var1.method_6438(), true));
                  }

                  this.field_3718 = 0;
               }
            }
         }
      }
   }

   @class_9148
   public void method_3071(class_7767 var1) {
      if (this.method_42015()) {
         if (!class_314.method_1413(field_46692.field_9632, 0.01F)) {
            this.field_3718++;
         } else {
            this.field_3718 = 0;
         }

         double var4 = (double)this.method_42002("Speed");
         double var6 = !field_46692.field_9577.field_45450.field_30024 ? 0.0 : var4 / 2.0;
         if (field_46692.field_9577.field_45450.field_30024 && field_46692.field_9577.field_45560.field_30024) {
            var6 = 0.0;
         } else if (!this.field_3720) {
            if (field_46692.field_9577.field_45450.field_30024) {
               var6 = var4 / 2.0;
            }
         } else {
            var6 = -var4 / 2.0;
         }

         class_8865.method_40777(var1, var4);
         var1.method_35235(var6);
         class_314.method_1408(var1.method_35236());
      }
   }

   private double method_3073() {
      if (!(field_46692.field_9632.method_37245().field_7333 < 1.0)) {
         if (!field_46692.field_9632.field_41726) {
            class_4092 var3 = field_46692.field_9632.field_41712.method_18928(0.0, -field_46692.field_9632.method_37245().field_7333, 0.0);
            Iterator var4 = field_46692.field_9601.method_6680(field_46692.field_9632, var3).iterator();
            double var5 = -1.0;

            while (var4.hasNext()) {
               class_4190 var7 = (class_4190)var4.next();
               if (var7.method_19483().field_19939 > var5) {
                  var5 = var7.method_19483().field_19939;
               }
            }

            return var5;
         } else {
            return field_46692.field_9632.method_37309();
         }
      } else {
         return -1.0;
      }
   }
}