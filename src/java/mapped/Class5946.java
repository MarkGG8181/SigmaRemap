package mapped;

import java.util.List;

public class Class5946 extends Class5942<Class950> {
   public static final ResourceLocation field25936 = new ResourceLocation("textures/entity/beacon_beam.png");

   public Class5946(Class8086 var1) {
      super(var1);
   }

   public void method18462(Class950 var1, float var2, Class9332 var3, Class7733 var4, int var5, int var6) {
      long var9 = var1.method3734().method6783();
      List var11 = var1.method3823();
      int var12 = 0;

      for (int var13 = 0; var13 < var11.size(); var13++) {
         Class7934 var14 = (Class7934)var11.get(var13);
         method18468(var3, var4, var2, var9, var12, var13 != var11.size() - 1 ? var14.method26686() : 1024, var14.method26685());
         var12 += var14.method26686();
      }
   }

   private static void method18468(Class9332 var0, Class7733 var1, float var2, long var3, int var5, int var6, float[] var7) {
      method18469(var0, var1, field25936, var2, 1.0F, var3, var5, var6, var7, 0.2F, 0.25F);
   }

   public static void method18469(
           Class9332 var0, Class7733 var1, ResourceLocation var2, float var3, float var4, long var5, int var7, int var8, float[] var9, float var10, float var11
   ) {
      int var14 = var7 + var8;
      var0.method35294();
      var0.method35291(0.5, 0.0, 0.5);
      float var15 = (float)Math.floorMod(var5, 40L) + var3;
      float var16 = var8 >= 0 ? -var15 : var15;
      float var17 = Class9679.method37807(var16 * 0.2F - (float)Class9679.method37767(var16 * 0.1F));
      float var18 = var9[0];
      float var19 = var9[1];
      float var20 = var9[2];
      var0.method35294();
      var0.method35293(Class7680.field32900.method25286(var15 * 2.25F - 45.0F));
      float var21 = 0.0F;
      float var22 = 0.0F;
      float var23 = -var10;
      float var24 = 0.0F;
      float var25 = 0.0F;
      float var26 = -var10;
      float var27 = 0.0F;
      float var28 = 1.0F;
      float var29 = -1.0F + var17;
      float var30 = (float)var8 * var4 * (0.5F / var10) + var29;
      method18470(
         var0,
         var1.method25597(Class4520.method14320(var2, false)),
         var18,
         var19,
         var20,
         1.0F,
         var7,
         var14,
         0.0F,
         var10,
         var10,
         0.0F,
         var23,
         0.0F,
         0.0F,
         var26,
         0.0F,
         1.0F,
         var30,
         var29
      );
      var0.method35295();
      var21 = -var11;
      float var31 = -var11;
      var22 = -var11;
      var23 = -var11;
      var27 = 0.0F;
      var28 = 1.0F;
      var29 = -1.0F + var17;
      var30 = (float)var8 * var4 + var29;
      method18470(
         var0,
         var1.method25597(Class4520.method14320(var2, true)),
         var18,
         var19,
         var20,
         0.125F,
         var7,
         var14,
         var21,
         var31,
         var11,
         var22,
         var23,
         var11,
         var11,
         var11,
         0.0F,
         1.0F,
         var30,
         var29
      );
      var0.method35295();
   }

   private static void method18470(
      Class9332 var0,
      Class5422 var1,
      float var2,
      float var3,
      float var4,
      float var5,
      int var6,
      int var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16,
      float var17,
      float var18,
      float var19
   ) {
      Class8892 var22 = var0.method35296();
      Class9367 var23 = var22.method32361();
      Class8967 var24 = var22.method32362();
      method18471(var23, var24, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var16, var17, var18, var19);
      method18471(var23, var24, var1, var2, var3, var4, var5, var6, var7, var14, var15, var12, var13, var16, var17, var18, var19);
      method18471(var23, var24, var1, var2, var3, var4, var5, var6, var7, var10, var11, var14, var15, var16, var17, var18, var19);
      method18471(var23, var24, var1, var2, var3, var4, var5, var6, var7, var12, var13, var8, var9, var16, var17, var18, var19);
   }

   private static void method18471(
      Class9367 var0,
      Class8967 var1,
      Class5422 var2,
      float var3,
      float var4,
      float var5,
      float var6,
      int var7,
      int var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      method18472(var0, var1, var2, var3, var4, var5, var6, var8, var9, var10, var14, var15);
      method18472(var0, var1, var2, var3, var4, var5, var6, var7, var9, var10, var14, var16);
      method18472(var0, var1, var2, var3, var4, var5, var6, var7, var11, var12, var13, var16);
      method18472(var0, var1, var2, var3, var4, var5, var6, var8, var11, var12, var13, var15);
   }

   private static void method18472(
      Class9367 var0,
      Class8967 var1,
      Class5422 var2,
      float var3,
      float var4,
      float var5,
      float var6,
      int var7,
      float var8,
      float var9,
      float var10,
      float var11
   ) {
      var2.method17040(var0, var8, (float)var7, var9)
         .method17033(var3, var4, var5, var6)
         .method17027(var10, var11)
         .method17035(Class213.field798)
         .method17034(15728880)
         .method17041(var1, 0.0F, 1.0F, 0.0F)
         .method17031();
   }

   public boolean method18461(Class950 var1) {
      return true;
   }
}
