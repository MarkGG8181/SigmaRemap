package mapped;

public class Class4062 extends Class4060 {
   public Class4062() {
      super(Class8992.field41067, "pillager", 0.5F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2823(0.0F, 0.0F, 64, 64);
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      Class8853 var5 = Minecraft.getInstance().method1554();
      Class5680 var6 = new Class5680(var5);
      var6.field25086 = (Class2823<Class1024>) var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}
