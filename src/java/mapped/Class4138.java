package mapped;

public class Class4138 extends Class4057 {
   public Class4138() {
      super(Class8992.field41028, "evoker_fangs", 0.0F, new String[]{"evocation_fangs"});
   }

   @Override
   public Class2828 method12822() {
      return new Class2804();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2804) {
         Class2804 var5 = (Class2804)var1;
         if (!var2.equals("base")) {
            if (!var2.equals("upper_jaw")) {
               return !var2.equals("lower_jaw") ? null : (Class7219)Class9299.method35075(var5, Class9299.field43045, 2);
            } else {
               return (Class7219)Class9299.method35075(var5, Class9299.field43045, 1);
            }
         } else {
            return (Class7219)Class9299.method35075(var5, Class9299.field43045, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"base", "upper_jaw", "lower_jaw"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      Class8853 var5 = Minecraft.getInstance().method1554();
      Class5722 var6 = new Class5722(var5);
      if (Class9299.field43138.method20238()) {
         Class9299.method35082(var6, Class9299.field43138, var1);
         var6.field25098 = var2;
         return (Class9492)var6;
      } else {
         Class7944.method26811("Field not found: RenderEvokerFangs.model");
         return null;
      }
   }
}
