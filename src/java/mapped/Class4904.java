package mapped;

import com.google.gson.JsonObject;

public class Class4904 extends Class4874<Class4458> {
   private static final ResourceLocation field22738 = new ResourceLocation("item_used_on_block");

   @Override
   public ResourceLocation method15044() {
      return field22738;
   }

   public Class4458 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class8576 var6 = Class8576.method30653(var1.get("location"));
      Class8634 var7 = Class8634.method31017(var1.get("item"));
      return new Class4458(var2, var6, var7);
   }

   public void method15155(Class878 var1, BlockPos var2, Class8848 var3) {
      Class7380 var6 = var1.method2798().method6738(var2);
      this.method15053(var1, var4 -> var4.method14096(var6, var1.method2798(), var2, var3));
   }

   // $VF: synthetic method
   public static ResourceLocation method15157() {
      return field22738;
   }
}