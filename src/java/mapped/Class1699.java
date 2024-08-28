package mapped;

public class Class1699 implements AutoCloseable {
   private final Class291 field9248;
   private final Class1806 field9249;
   private final ResourceLocation field9250;
   private boolean field9251;
   private float field9252;
   private final Class214 field9253;
   private final Minecraft field9254;
   private boolean field9255 = true;
   private boolean field9256 = false;
   private Class7680 field9257 = new Class7680();
   public static final int field9258 = method7321(15, 15);

   public Class1699(Class214 var1, Minecraft var2) {
      this.field9253 = var1;
      this.field9254 = var2;
      this.field9248 = new Class291(16, 16, false);
      this.field9250 = this.field9254.getTextureManager().method1077("light_map", this.field9248);
      this.field9249 = this.field9248.method1141();

      for (int var5 = 0; var5 < 16; var5++) {
         for (int var6 = 0; var6 < 16; var6++) {
            this.field9249.method7890(var6, var5, -1);
         }
      }

      this.field9248.method1140();
   }

   @Override
   public void close() {
      this.field9248.close();
   }

   public void method7315() {
      this.field9252 = (float)((double)this.field9252 + (Math.random() - Math.random()) * Math.random() * Math.random() * 0.1);
      this.field9252 = (float)((double)this.field9252 * 0.9);
      this.field9251 = true;
   }

   public void method7316() {
      RenderSystem.method27860(33986);
      RenderSystem.method27862();
      RenderSystem.method27860(33984);
      if (Class7944.method26921()) {
         Class8981.method33127();
      }
   }

   public void method7317() {
      if (this.field9255) {
         RenderSystem.method27860(33986);
         RenderSystem.method27878(5890);
         RenderSystem.method27879();
         float var3 = 0.00390625F;
         RenderSystem.scalef(0.00390625F, 0.00390625F, 0.00390625F);
         RenderSystem.translatef(8.0F, 8.0F, 8.0F);
         RenderSystem.method27878(5888);
         this.field9254.getTextureManager().bindTexture(this.field9250);
         RenderSystem.method27863(3553, 10241, 9729);
         RenderSystem.method27863(3553, 10240, 9729);
         RenderSystem.method27863(3553, 10242, 33071);
         RenderSystem.method27863(3553, 10243, 33071);
         RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.method27861();
         RenderSystem.method27860(33984);
         if (Class7944.method26921()) {
            Class8981.method33126();
         }
      }
   }

   public void method7318(float var1) {
      if (this.field9251) {
         this.field9251 = false;
         this.field9254.method1574().method22503("lightTex");
         Class1656 var4 = this.field9254.field1338;
         if (var4 != null) {
            this.field9256 = false;
            if (Class7944.method26911()) {
               boolean var5 = this.field9254.field1339.method3033(Class8254.field35482) || this.field9254.field1339.method3033(Class8254.field35495);
               if (Class9680.method37875(var4, this.field9252, this.field9249, var5, var1)) {
                  this.field9248.method1140();
                  this.field9251 = false;
                  this.field9254.method1574().method22505();
                  this.field9256 = true;
                  return;
               }
            }

            float var24 = var4.method6872(1.0F);
            float var6;
            if (var4.method6876() <= 0) {
               var6 = var24 * 0.95F + 0.05F;
            } else {
               var6 = 1.0F;
            }

            float var7 = this.field9254.field1339.method5416();
            float var8;
            if (!this.field9254.field1339.method3033(Class8254.field35482)) {
               if (var7 > 0.0F && this.field9254.field1339.method3033(Class8254.field35495)) {
                  var8 = var7;
               } else {
                  var8 = 0.0F;
               }
            } else {
               var8 = Class214.method750(this.field9254.field1339, var1);
            }

            Class7680 var9 = new Class7680(var24, var24, 1.0F);
            var9.method25284(new Class7680(1.0F, 1.0F, 1.0F), 0.35F);
            float var10 = this.field9252 + 1.5F;
            Class7680 var11 = new Class7680();

            for (int var12 = 0; var12 < 16; var12++) {
               for (int var13 = 0; var13 < 16; var13++) {
                  float var14 = this.method7320(var4, var12) * var6;
                  float var15 = this.method7320(var4, var13) * var10;
                  float var16 = var15 * ((var15 * 0.6F + 0.4F) * 0.6F + 0.4F);
                  float var17 = var15 * (var15 * var15 * 0.6F + 0.4F);
                  var11.method25275(var15, var16, var17);
                  if (!var4.method6830().method19306()) {
                     Class7680 var18 = this.method7325(var9);
                     var18.method25272(var14);
                     var11.method25277(var18);
                     var11.method25284(this.method7324(0.75F, 0.75F, 0.75F), 0.04F);
                     if (this.field9253.method766(var1) > 0.0F) {
                        float var19 = this.field9253.method766(var1);
                        Class7680 var20 = this.method7325(var11);
                        var20.method25273(0.7F, 0.6F, 0.6F);
                        var11.method25284(var20, var19);
                     }
                  } else {
                     var11.method25284(this.method7324(0.99F, 1.12F, 1.0F), 0.25F);
                  }

                  var11.method25274(0.0F, 1.0F);
                  if (var8 > 0.0F) {
                     float var25 = Math.max(var11.method25269(), Math.max(var11.method25270(), var11.method25271()));
                     if (var25 < 1.0F) {
                        float var27 = 1.0F / var25;
                        Class7680 var29 = this.method7325(var11);
                        var29.method25272(var27);
                        var11.method25284(var29, var8);
                     }
                  }

                  float var26 = (float)this.field9254.field1299.field44672;
                  Class7680 var28 = this.method7325(var11);
                  var28.method25288(this::method7319);
                  var11.method25284(var28, var26);
                  var11.method25284(this.method7324(0.75F, 0.75F, 0.75F), 0.04F);
                  var11.method25274(0.0F, 1.0F);
                  var11.method25272(255.0F);
                  short var30 = 255;
                  int var21 = (int)var11.method25269();
                  int var22 = (int)var11.method25270();
                  int var23 = (int)var11.method25271();
                  this.field9249.method7890(var13, var12, 0xFF000000 | var23 << 16 | var22 << 8 | var21);
               }
            }

            this.field9248.method1140();
            this.field9254.method1574().method22505();
         }
      }
   }

   private float method7319(float var1) {
      float var4 = 1.0F - var1;
      return 1.0F - var4 * var4 * var4 * var4;
   }

   private float method7320(Class1655 var1, int var2) {
      return var1.method6812().method36890(var2);
   }

   public static int method7321(int var0, int var1) {
      return var0 << 4 | var1 << 20;
   }

   public static int method7322(int var0) {
      return (var0 & 65535) >> 4;
   }

   public static int method7323(int var0) {
      return var0 >> 20 & 65535;
   }

   private Class7680 method7324(float var1, float var2, float var3) {
      this.field9257.method25275(var1, var2, var3);
      return this.field9257;
   }

   private Class7680 method7325(Class7680 var1) {
      this.field9257.method25275(var1.method25269(), var1.method25270(), var1.method25271());
      return this.field9257;
   }

   public boolean method7326() {
      return this.field9255;
   }

   public void method7327(boolean var1) {
      this.field9255 = var1;
   }

   public boolean method7328() {
      return this.field9256;
   }
}