package remapped;

public class class_485 extends class_7164<class_6011, class_4217<class_6011>> {
   private static final class_4639 field_3010 = new class_4639("textures/entity/squid.png");

   public class_485(class_6122 var1) {
      super(var1, new class_4217<class_6011>(), 0.7F);
   }

   public class_4639 method_2292(class_6011 var1) {
      return field_3010;
   }

   public void method_2291(class_6011 var1, class_7966 var2, float var3, float var4, float var5) {
      float var8 = class_9299.method_42795(var5, var1.field_30611, var1.field_30616);
      float var9 = class_9299.method_42795(var5, var1.field_30610, var1.field_30618);
      var2.method_36065(0.0, 0.5, 0.0);
      var2.method_36060(class_2426.field_12074.method_11074(180.0F - var4));
      var2.method_36060(class_2426.field_12080.method_11074(var8));
      var2.method_36060(class_2426.field_12074.method_11074(var9));
      var2.method_36065(0.0, -1.2F, 0.0);
   }

   public float method_2293(class_6011 var1, float var2) {
      return class_9299.method_42795(var2, var1.field_30608, var1.field_30609);
   }
}
