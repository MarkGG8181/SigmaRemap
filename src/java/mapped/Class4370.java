package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.unmapped.Class4305;

public class Class4370 extends Class4247 {
   private static String[] field21362;
   private float field21363;
   public boolean field21364 = false;

   public static float method13693(float var0, float var1, float var2) {
      return (var2 - var0) / (var1 - var0);
   }

   public static float method13694(float var0, float var1, float var2, float var3, int var4) {
      float var7 = Math.abs(var2 - var1) / var3;
      float var8 = var1 + var0 * var7 * var3;
      return (float)Math.round((double)var8 * Math.pow(10.0, (double)var4)) / (float)Math.pow(10.0, (double)var4);
   }

   public Class4370(Class4305 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.method13695();
   }

   public Class4370(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Class6387 var7) {
      super(var1, var2, var3, var4, var5, var6, var7, false);
      this.method13695();
   }

   public Class4370(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Class6387 var7, String var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, false);
      this.method13695();
   }

   public Class4370(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Class6387 var7, String var8, ClientResource var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, false);
      this.method13695();
   }

   private void method13695() {
   }

   @Override
   public void method13028(int var1, int var2) {
      int var5 = this.method13309() - this.method13271();
      if (this.field21364) {
         this.method13698((float)var5 / (float)this.method13267());
      }

      super.method13028(var1, var2);
   }

   @Override
   public void method13027(float var1) {
      Class3192.method11424((float)(this.field20895 + this.field20897), (float)(this.field20896 + 1), 1.0F, (float)(this.field20898 - 2), -8882056);
      Class3192.method11424((float)(this.field20895 + 1), (float)this.field20896, (float)(this.field20897 - 1), (float)this.field20898, -8882056);
      Class3192.method11424((float)this.field20895, (float)(this.field20896 + 1), 1.0F, (float)(this.field20898 - 2), -6250336);
      Class3192.method11424(
         (float)(this.field20895 + 1), (float)this.field20896, (float)this.field20897 * this.field21363 - 1.0F, (float)this.field20898, -6250336
      );
      this.method13696(Math.round((float)this.field20895 + (float)this.field20897 * this.field21363) - 2, this.field20896 - 3);
      super.method13027(var1);
   }

   public void method13696(int var1, int var2) {
      Class3192.method11424((float)(var1 + 1), (float)(var2 + 1), 4.0F, 8.0F, -3618616);
      Class3192.method11424((float)(var1 + 1), (float)(var2 + 1), 1.0F, 1.0F, -4934476);
      Class3192.method11424((float)(var1 + 4), (float)(var2 + 1), 1.0F, 1.0F, -4934476);
      Class3192.method11424((float)(var1 + 1), (float)(var2 + 8), 1.0F, 1.0F, -4934476);
      Class3192.method11424((float)(var1 + 4), (float)(var2 + 8), 1.0F, 1.0F, -4934476);
      Class3192.method11424((float)var1, (float)(var2 + 1), 1.0F, 8.0F, -4934476);
      Class3192.method11424((float)(var1 + 5), (float)(var2 + 1), 1.0F, 8.0F, -4934476);
      Class3192.method11424((float)(var1 + 1), (float)var2, 4.0F, 1.0F, -4934476);
      Class3192.method11424((float)(var1 + 1), (float)(var2 + 9), 4.0F, 1.0F, -4934476);
   }

   @Override
   public boolean method13078(int var1, int var2, int var3) {
      this.field21364 = true;
      return super.method13078(var1, var2, var3);
   }

   @Override
   public void method13095(int var1, int var2, int var3) {
      this.field21364 = false;
   }

   public float method13697() {
      return this.field21363;
   }

   public void method13698(float var1) {
      this.method13699(var1, true);
   }

   public void method13699(float var1, boolean var2) {
      var1 = Math.min(Math.max(var1, 0.0F), 1.0F);
      float var5 = this.field21363;
      this.field21363 = var1;
      if (var2 && var5 != var1) {
         this.method13037();
      }
   }
}