package remapped;

public class class_9239 extends class_2833 {
   private static String[] field_47203;
   private final class_3578 field_47202;

   public class_9239(class_3578 var1) {
      super(var1);
      this.field_47202 = var1;
   }

   @Override
   public void method_12883() {
      if (this.field_47202.method_37261(class_6503.field_33094)) {
         this.field_47202.method_37215(this.field_47202.method_37098().method_6214(0.0, 0.005, 0.0));
      }

      if (this.field_13878 == class_1737.field_8946 && !this.field_47202.method_26927().method_5591()) {
         float var3 = (float)(this.field_13885 * this.field_47202.method_26575(class_7331.field_37465));
         this.field_47202.method_26461(class_9299.method_42795(0.125F, this.field_47202.method_26423(), var3));
         double var4 = this.field_13884 - this.field_47202.method_37302();
         double var6 = this.field_13886 - this.field_47202.method_37309();
         double var8 = this.field_13880 - this.field_47202.method_37156();
         if (var6 != 0.0) {
            double var11 = (double)class_9299.method_42842(var4 * var4 + var6 * var6 + var8 * var8);
            this.field_47202
               .method_37215(this.field_47202.method_37098().method_6214(0.0, (double)this.field_47202.method_26423() * (var6 / var11) * 0.1, 0.0));
         }

         if (var4 != 0.0 || var8 != 0.0) {
            float var10 = (float)(class_9299.method_42821(var8, var4) * 180.0F / (float)Math.PI) - 90.0F;
            this.field_47202.field_41701 = this.method_12882(this.field_47202.field_41701, var10, 90.0F);
            this.field_47202.field_29605 = this.field_47202.field_41701;
         }
      } else {
         this.field_47202.method_26461(0.0F);
      }
   }
}