package remapped;

public class class_7548 extends class_5783 {
   private static String[] field_38497;

   public class_7548(class_6629<? extends class_7548> var1, class_6486 var2) {
      super(var1, var2);
   }

   public class_7548(class_6486 var1, class_9310 var2) {
      this(class_6629.field_34328, var1);
      super.method_26159(var2);
      this.method_37256(
         var2.method_37302() - (double)(var2.method_37086() + 1.0F) * 0.5 * (double)class_9299.method_42818(var2.field_29605 * (float) (Math.PI / 180.0)),
         var2.method_37388() - 0.1F,
         var2.method_37156() + (double)(var2.method_37086() + 1.0F) * 0.5 * (double)class_9299.method_42840(var2.field_29605 * (float) (Math.PI / 180.0))
      );
   }

   public class_7548(class_6486 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(class_6629.field_34328, var1);
      this.method_37256(var2, var4, var6);

      for (int var16 = 0; var16 < 7; var16++) {
         double var17 = 0.4 + 0.1 * (double)var16;
         var1.method_43361(class_3090.field_15383, var2, var4, var6, var8 * var17, var10, var12 * var17);
      }

      this.method_37214(var8, var10, var12);
   }

   @Override
   public void method_37123() {
      super.method_37123();
      class_1343 var3 = this.method_37098();
      class_7474 var4 = class_8462.method_38935(this, this::method_26164);
      if (var4 != null) {
         this.method_26160(var4);
      }

      double var5 = this.method_37302() + var3.field_7336;
      double var7 = this.method_37309() + var3.field_7333;
      double var9 = this.method_37156() + var3.field_7334;
      this.method_26167();
      float var11 = 0.99F;
      float var12 = 0.06F;
      if (!this.field_41768.method_28256(this.method_37241()).noneMatch(class_1873::method_8345)) {
         if (!this.method_37134()) {
            this.method_37215(var3.method_6209(0.99F));
            if (!this.method_37078()) {
               this.method_37215(this.method_37098().method_6214(0.0, -0.06F, 0.0));
            }

            this.method_37256(var5, var7, var9);
         } else {
            this.method_37204();
         }
      } else {
         this.method_37204();
      }
   }

   @Override
   public void method_26163(class_5631 var1) {
      super.method_26163(var1);
      class_8145 var4 = this.method_26166();
      if (var4 instanceof class_5834) {
         var1.method_25524().method_37181(class_6199.method_28358(this, (class_5834)var4).method_28359(), 1.0F);
      }
   }

   @Override
   public void method_26165(class_9529 var1) {
      super.method_26165(var1);
      if (!this.field_41768.field_33055) {
         this.method_37204();
      }
   }

   @Override
   public void method_37329() {
   }

   @Override
   public class_6310<?> method_37142() {
      return new class_6589(this);
   }
}
