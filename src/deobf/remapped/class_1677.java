package remapped;

public class class_1677 extends class_7164<class_107, class_151> {
   public static final class_4639[] field_8682 = new class_4639[]{
      new class_4639("textures/entity/parrot/parrot_red_blue.png"),
      new class_4639("textures/entity/parrot/parrot_blue.png"),
      new class_4639("textures/entity/parrot/parrot_green.png"),
      new class_4639("textures/entity/parrot/parrot_yellow_blue.png"),
      new class_4639("textures/entity/parrot/parrot_grey.png")
   };

   public class_1677(class_6122 var1) {
      super(var1, new class_151(), 0.3F);
   }

   public class_4639 method_7506(class_107 var1) {
      return field_8682[var1.method_330()];
   }

   public float method_7507(class_107 var1, float var2) {
      float var5 = class_9299.method_42795(var2, var1.field_269, var1.field_262);
      float var6 = class_9299.method_42795(var2, var1.field_263, var1.field_270);
      return (class_9299.method_42818(var5) + 1.0F) * var6;
   }
}
