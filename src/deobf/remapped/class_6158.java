package remapped;

public class class_6158 extends class_2733 {
   public class_6158() {
      super(class_6629.field_34295, "magma_cube", 0.5F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_7307();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_7307) {
         class_7307 var5 = (class_7307)var1;
         if (var2.equals("core")) {
            return (class_1549)class_7860.method_35557(var5, class_7860.field_40113);
         } else {
            String var6 = "segment";
            if (!var2.startsWith(var6)) {
               return null;
            } else {
               class_1549[] var7 = (class_1549[])class_7860.method_35557(var5, class_7860.field_40162);
               if (var7 == null) {
                  return null;
               } else {
                  String var8 = var2.substring(var6.length());
                  int var9 = class_3111.method_14361(var8, -1);
                  var9--;
                  return var9 >= 0 && var9 < var7.length ? var7[var9] : null;
               }
            }
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"core", "segment1", "segment2", "segment3", "segment4", "segment5", "segment6", "segment7", "segment8"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = MinecraftClient.getInstance().method_8587();
      class_5038 var6 = new class_5038(var5);
      var6.field_32487 = (class_7307<class_3252>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}