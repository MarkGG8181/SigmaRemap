package mapped;

public class Class5956 extends Class5942<Class959> {
   public static final Class7826 field25968 = new Class7826(Class289.field1102, new ResourceLocation("entity/conduit/base"));
   public static final Class7826 field25969 = new Class7826(Class289.field1102, new ResourceLocation("entity/conduit/cage"));
   public static final Class7826 field25970 = new Class7826(Class289.field1102, new ResourceLocation("entity/conduit/wind"));
   public static final Class7826 field25971 = new Class7826(Class289.field1102, new ResourceLocation("entity/conduit/wind_vertical"));
   public static final Class7826 field25972 = new Class7826(Class289.field1102, new ResourceLocation("entity/conduit/open_eye"));
   public static final Class7826 field25973 = new Class7826(Class289.field1102, new ResourceLocation("entity/conduit/closed_eye"));
   private final Class7219 field25974 = new Class7219(16, 16, 0, 0);
   private final Class7219 field25975;
   private final Class7219 field25976;
   private final Class7219 field25977;

   public Class5956(Class8086 var1) {
      super(var1);
      this.field25974.method22675(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, 0.01F);
      this.field25975 = new Class7219(64, 32, 0, 0);
      this.field25975.method22673(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F);
      this.field25976 = new Class7219(32, 16, 0, 0);
      this.field25976.method22673(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F);
      this.field25977 = new Class7219(32, 16, 0, 0);
      this.field25977.method22673(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F);
   }

   public void method18462(Class959 var1, float var2, Class9332 var3, Class7733 var4, int var5, int var6) {
      float var9 = (float)var1.field5382 + var2;
      if (var1.method3903()) {
         float var10 = var1.method3907(var2) * (180.0F / (float)Math.PI);
         float var11 = Class9679.method37763(var9 * 0.1F) / 2.0F + 0.5F;
         var11 = var11 * var11 + var11;
         var3.method35294();
         var3.method35291(0.5, (double)(0.3F + var11 * 0.2F), 0.5);
         Class7680 var12 = new Class7680(0.5F, 1.0F, 0.5F);
         var12.method25280();
         var3.method35293(new Class8661(var12, var10, true));
         this.field25977.method22680(var3, field25969.method26200(var4, Class4520::method14312), var5, var6);
         var3.method35295();
         int var13 = var1.field5382 / 66 % 3;
         var3.method35294();
         var3.method35291(0.5, 0.5, 0.5);
         if (var13 != 1) {
            if (var13 == 2) {
               var3.method35293(Class7680.field32902.method25286(90.0F));
            }
         } else {
            var3.method35293(Class7680.field32898.method25286(90.0F));
         }

         Class5422 var14 = (var13 != 1 ? field25970 : field25971).method26200(var4, Class4520::method14312);
         this.field25975.method22680(var3, var14, var5, var6);
         var3.method35295();
         var3.method35294();
         var3.method35291(0.5, 0.5, 0.5);
         var3.method35292(0.875F, 0.875F, 0.875F);
         var3.method35293(Class7680.field32898.method25286(180.0F));
         var3.method35293(Class7680.field32902.method25286(180.0F));
         this.field25975.method22680(var3, var14, var5, var6);
         var3.method35295();
         Class9624 var15 = this.field25928.field34748;
         var3.method35294();
         var3.method35291(0.5, (double)(0.3F + var11 * 0.2F), 0.5);
         var3.method35292(0.5F, 0.5F, 0.5F);
         float var16 = -var15.method37507();
         var3.method35293(Class7680.field32900.method25286(var16));
         var3.method35293(Class7680.field32898.method25286(var15.method37506()));
         var3.method35293(Class7680.field32902.method25286(180.0F));
         float var17 = 1.3333334F;
         var3.method35292(1.3333334F, 1.3333334F, 1.3333334F);
         this.field25974.method22680(var3, (!var1.method3904() ? field25973 : field25972).method26200(var4, Class4520::method14312), var5, var6);
         var3.method35295();
      } else {
         float var18 = var1.method3907(0.0F);
         Class5422 var20 = field25968.method26200(var4, Class4520::method14309);
         var3.method35294();
         var3.method35291(0.5, 0.5, 0.5);
         var3.method35293(Class7680.field32900.method25286(var18));
         this.field25976.method22680(var3, var20, var5, var6);
         var3.method35295();
      }
   }
}