package mapped;

public class Class5744 extends Class5651<Class1099, Class2797<Class1099>> {
   private static final ResourceLocation field25167 = new ResourceLocation("textures/entity/zombie/zombie.png");
   private final float field25168;

   public Class5744(Class8853 var1, float var2) {
      super(var1, new Class2796(), 0.5F * var2);
      this.field25168 = var2;
      this.method17880(new Class242<Class1099, Class2797<Class1099>>(this));
      this.method17880(new Class255<Class1099, Class2797<Class1099>, Class2796>(this, new Class2796(0.5F, true), new Class2796(1.0F, true)));
   }

   public void method17857(Class1099 var1, Class9332 var2, float var3) {
      var2.method35292(this.field25168, this.field25168, this.field25168);
   }

   public ResourceLocation method17843(Class1099 var1) {
      return field25167;
   }
}