package remapped;

public class class_461 extends class_1543 {
   private static String[] field_1918;

   public class_461(class_131 var1) {
      super(15, 15, 215, 5);
      this.field_1917 = var1;
   }

   @Override
   public void method_6993(class_7966 var1, int var2, int var3, boolean var4) {
      class_4502.method_20935(this.field_1917.field_324).method_8577().method_35674(class_4502.method_20933());
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var7 = !var4 ? 0.0F : 19.0F;
      AbstractGui.method_9778(var1, var2, var3, var7, 0.0F, 18, 18, 37, 18);
      if (var4) {
         class_4502.method_20929(this.field_1917.field_324, class_4502.method_20934());
      }
   }

   @Override
   public void method_6992(int var1) {
      class_4502.method_20924(this.field_1917.field_324, var1);
   }
}
