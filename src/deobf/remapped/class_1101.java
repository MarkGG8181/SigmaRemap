package remapped;

public class class_1101 extends class_7067<class_7548> {
   private static final class_4639 field_6330 = new class_4639("textures/entity/llama/spit.png");
   private final class_8716<class_7548> field_6328 = new class_8716<class_7548>();

   public class_1101(class_6122 var1) {
      super(var1);
   }

   public void method_4893(class_7548 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      var4.method_36063();
      var4.method_36065(0.0, 0.15F, 0.0);
      var4.method_36060(class_2426.field_12074.method_11074(class_9299.method_42795(var3, var1.field_41711, var1.field_41701) - 90.0F));
      var4.method_36060(class_2426.field_12076.method_11074(class_9299.method_42795(var3, var1.field_41762, var1.field_41755)));
      this.field_6328.method_29700(var1, var3, 0.0F, -0.1F, 0.0F, 0.0F);
      class_7907 var9 = var5.method_11645(this.field_6328.method_45498(field_6330));
      this.field_6328.method_45499(var4, var9, var6, class_5367.field_27381, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.method_36064();
      super.method_32551(var1, var2, var3, var4, var5, var6);
   }

   public class_4639 method_4892(class_7548 var1) {
      return field_6330;
   }
}
