package mapped;

public class Class5738 extends Class5715<Class904> {
   private static final ResourceLocation field25159 = new ResourceLocation("textures/entity/fishing_hook.png");
   private static final Class4520 field25160 = Class4520.method14310(field25159);

   public Class5738(Class8853 var1) {
      super(var1);
   }

   public void method17853(Class904 var1, float var2, float var3, Class9332 var4, Class7733 var5, int var6) {
      PlayerEntity var9 = var1.method3544();
      if (var9 != null) {
         var4.method35294();
         var4.method35294();
         var4.method35292(0.5F, 0.5F, 0.5F);
         var4.method35293(this.field25097.method32230());
         var4.method35293(Class7680.field32900.method25286(180.0F));
         Class8892 var10 = var4.method35296();
         Class9367 var11 = var10.method32361();
         Class8967 var12 = var10.method32362();
         Class5422 var13 = var5.method25597(field25160);
         method17922(var13, var11, var12, var6, 0.0F, 0, 0, 1);
         method17922(var13, var11, var12, var6, 1.0F, 0, 1, 1);
         method17922(var13, var11, var12, var6, 1.0F, 1, 1, 0);
         method17922(var13, var11, var12, var6, 0.0F, 1, 0, 0);
         var4.method35295();
         int var14 = var9.method2967() != Class2205.field14418 ? -1 : 1;
         Class8848 var15 = var9.method3090();
         if (var15.method32107() != Class8514.field37906) {
            var14 = -var14;
         }

         float var16 = var9.method3137(var3);
         float var17 = Class9679.method37763(Class9679.method37765(var16) * (float) Math.PI);
         float var18 = Class9679.method37821(var3, var9.field4966, var9.field4965) * (float) (Math.PI / 180.0);
         double var19 = (double)Class9679.method37763(var18);
         double var21 = (double)Class9679.method37764(var18);
         double var23 = (double)var14 * 0.35;
         double var25 = 0.8;
         double var27;
         double var29;
         double var31;
         float var36;
         if ((this.field25097.field40020 == null || this.field25097.field40020.method37173().method8246()) && var9 == Minecraft.getInstance().field1339) {
            double var33 = this.field25097.field40020.field44669;
            var33 /= 100.0;
            Vector3d var35 = new Vector3d((double)var14 * -0.36 * var33, -0.045 * var33, 0.4);
            var35 = var35.method11350(-Class9679.method37821(var3, var9.field5034, var9.field5032) * (float) (Math.PI / 180.0));
            var35 = var35.method11351(-Class9679.method37821(var3, var9.field5033, var9.field5031) * (float) (Math.PI / 180.0));
            var35 = var35.method11351(var17 * 0.5F);
            var35 = var35.method11350(-var17 * 0.7F);
            var27 = Class9679.method37822((double)var3, var9.field5025, var9.getPosX()) + var35.field18048;
            var29 = Class9679.method37822((double)var3, var9.field5026, var9.getPosY()) + var35.field18049;
            var31 = Class9679.method37822((double)var3, var9.field5027, var9.getPosZ()) + var35.field18050;
            var36 = var9.method3393();
         } else {
            var27 = Class9679.method37822((double)var3, var9.field5025, var9.getPosX()) - var21 * var23 - var19 * 0.8;
            var29 = var9.field5026 + (double)var9.method3393() + (var9.getPosY() - var9.field5026) * (double)var3 - 0.45;
            var31 = Class9679.method37822((double)var3, var9.field5027, var9.getPosZ()) - var19 * var23 + var21 * 0.8;
            var36 = !var9.method3336() ? 0.0F : -0.1875F;
         }

         double var49 = Class9679.method37822((double)var3, var1.field5025, var1.getPosX());
         double var37 = Class9679.method37822((double)var3, var1.field5026, var1.getPosY()) + 0.25;
         double var39 = Class9679.method37822((double)var3, var1.field5027, var1.getPosZ());
         float var41 = (float)(var27 - var49);
         float var42 = (float)(var29 - var37) + var36;
         float var43 = (float)(var31 - var39);
         Class5422 var44 = var5.method25597(Class4520.method14345());
         Class9367 var45 = var4.method35296().method32361();
         byte var46 = 16;

         for (int var47 = 0; var47 < 16; var47++) {
            method17923(var41, var42, var43, var44, var45, method17921(var47, 16));
            method17923(var41, var42, var43, var44, var45, method17921(var47 + 1, 16));
         }

         var4.method35295();
         super.method17853(var1, var2, var3, var4, var5, var6);
      }
   }

   private static float method17921(int var0, int var1) {
      return (float)var0 / (float)var1;
   }

   private static void method17922(Class5422 var0, Class9367 var1, Class8967 var2, int var3, float var4, int var5, int var6, int var7) {
      var0.method17040(var1, var4 - 0.5F, (float)var5 - 0.5F, 0.0F)
         .method17026(255, 255, 255, 255)
         .method17027((float)var6, (float)var7)
         .method17035(Class213.field798)
         .method17034(var3)
         .method17041(var2, 0.0F, 1.0F, 0.0F)
         .method17031();
   }

   private static void method17923(float var0, float var1, float var2, Class5422 var3, Class9367 var4, float var5) {
      var3.method17040(var4, var0 * var5, var1 * (var5 * var5 + var5) * 0.5F + 0.25F, var2 * var5).method17026(0, 0, 0, 255).method17031();
   }

   public ResourceLocation method17843(Class904 var1) {
      return field25159;
   }
}