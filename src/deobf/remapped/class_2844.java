package remapped;

import java.util.List;

public class class_2844 extends class_8388 {
   private static String[] field_13945;

   public class_2844(class_6629<? extends class_2844> var1, World var2) {
      super(var1, var2);
   }

   public class_2844(World var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(class_6629.field_34267, var2, var4, var6, var8, var10, var12, var1);
   }

   public class_2844(World var1, class_5834 var2, double var3, double var5, double var7) {
      super(class_6629.field_34267, var2, var3, var5, var7, var1);
   }

   @Override
   public void method_26160(class_7474 var1) {
      super.method_26160(var1);
      Entity var4 = this.method_26166();
      if ((var1.method_33990() != class_1430.field_7718 || !((class_5631)var1).method_25524().method_37171(var4)) && !this.world.field_33055) {
         List var5 = this.world.<class_5834>method_25868(class_5834.class, this.method_37241().method_18899(4.0, 2.0, 4.0));
         class_4478 var6 = new class_4478(this.world, this.getPosX(), this.method_37309(), this.getPosZ());
         if (var4 instanceof class_5834) {
            var6.method_20782((class_5834)var4);
         }

         var6.method_20789(class_3090.field_15315);
         var6.method_20781(3.0F);
         var6.method_20787(600);
         var6.method_20780((7.0F - var6.method_20783()) / (float)var6.method_20791());
         var6.method_20788(new class_2250(Effects.field_19723, 1, 1));
         if (!var5.isEmpty()) {
            for (class_5834 var8 : var5) {
               double var9 = this.method_37275(var8);
               if (var9 < 16.0) {
                  var6.method_37256(var8.getPosX(), var8.method_37309(), var8.getPosZ());
                  break;
               }
            }
         }

         this.world.method_43364(2006, this.method_37075(), !this.method_37378() ? 1 : -1);
         this.world.method_7509(var6);
         this.method_37204();
      }
   }

   @Override
   public boolean method_37167() {
      return false;
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      return false;
   }

   @Override
   public class_5079 method_38645() {
      return class_3090.field_15315;
   }

   @Override
   public boolean method_38646() {
      return false;
   }
}
