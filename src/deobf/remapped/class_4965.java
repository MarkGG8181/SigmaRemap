package remapped;

import java.util.List;

public class class_4965 extends class_337 {
   private static String[] field_25712;
   public static final float field_25713 = class_6629.field_34324.method_30459() / class_6629.field_34307.method_30459();

   public class_4965(class_6629<? extends class_4965> var1, World var2) {
      super(var1, var2);
      this.method_26883();
      if (this.field_1260 != null) {
         this.field_1260.method_38232(400);
      }
   }

   public static class_1313 method_22810() {
      return class_337.method_1544()
         .method_5984(class_7331.field_37465, 0.3F)
         .method_5984(class_7331.field_37462, 8.0)
         .method_5984(class_7331.field_37468, 80.0);
   }

   @Override
   public int method_1548() {
      return 60;
   }

   @Override
   public class_8461 method_26918() {
      return !this.method_37134() ? class_463.field_2542 : class_463.field_2275;
   }

   @Override
   public class_8461 method_26541(class_6199 var1) {
      return !this.method_37134() ? class_463.field_2473 : class_463.field_2910;
   }

   @Override
   public class_8461 method_26599() {
      return !this.method_37134() ? class_463.field_2150 : class_463.field_2872;
   }

   @Override
   public class_8461 method_1554() {
      return class_463.field_2354;
   }

   @Override
   public void method_26919() {
      super.method_26919();
      short var3 = 1200;
      if ((this.field_41697 + this.method_37145()) % 1200 == 0) {
         class_1425 var4 = Effects.field_19748;
         List var5 = ((class_6331)this.field_41768).method_28990(var1 -> this.method_37275(var1) < 2500.0 && var1.field_47807.method_39515());
         byte var6 = 2;
         short var7 = 6000;
         short var8 = 1200;

         for (class_9359 var10 : var5) {
            if (!var10.isPotionActive(var4) || var10.method_26553(var4).method_10333() < 2 || var10.method_26553(var4).method_10347() < 1200) {
               var10.field_47794.method_4156(new class_2161(class_2161.field_10788, !this.method_37378() ? 1.0F : 0.0F));
               var10.method_26558(new class_2250(var4, 6000, 2));
            }
         }
      }

      if (!this.method_26848()) {
         this.method_26843(this.method_37075(), 16);
      }
   }
}
