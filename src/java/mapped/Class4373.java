package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import org.lwjgl.opengl.GL11;

public class Class4373 extends Class4247 {
   private static String[] field21368;
   public boolean field21369;
   public Animation field21370 = new Animation(70, 90);

   public Class4373(Class4305 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
   }

   public boolean method13703() {
      return this.field21369;
   }

   public void method13704(boolean var1) {
      this.method13705(var1, true);
   }

   public void method13705(boolean var1, boolean var2) {
      if (var1 != this.method13703()) {
         this.field21369 = var1;
         this.field21370.changeDirection(!this.field21369 ? Direction.FORWARDS : Direction.BACKWARDS);
         if (var2) {
            this.method13037();
         }
      }
   }

   @Override
   public void method13027(float var1) {
      float var4 = !this.method13212() ? 0.43F : 0.6F;
      Class3192.method11475(
         (float)this.field20895,
         (float)this.field20896,
         (float)this.field20897,
         (float)this.field20898,
         10.0F,
         Class5628.method17688(-4144960, var4 * this.field21370.calcPercent() * var1)
      );
      float var5 = (1.0F - this.field21370.calcPercent()) * var1;
      Class3192.method11475(
         (float)this.field20895,
         (float)this.field20896,
         (float)this.field20897,
         (float)this.field20898,
         10.0F,
         Class5628.method17688(Class5628.method17690(-14047489, Class1979.field12891.field12910, !this.method13212() ? 1.0F : 0.9F), var5)
      );
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(this.method13263() + this.method13267() / 2), (float)(this.method13265() + this.method13269() / 2), 0.0F);
      GL11.glScalef(1.5F - 0.5F * var5, 1.5F - 0.5F * var5, 0.0F);
      GL11.glTranslatef((float)(-this.method13263() - this.method13267() / 2), (float)(-this.method13265() - this.method13269() / 2), 0.0F);
      Class3192.method11449(
         (float)this.field20895,
         (float)this.field20896,
         (float)this.field20897,
         (float)this.field20898,
         ResourcesDecrypter.checkPNG,
         Class5628.method17688(Class1979.field12896.field12910, var5)
      );
      GL11.glPopMatrix();
      var5 *= var5;
      super.method13027(var1);
   }

   @Override
   public void method13089(int var1, int var2, int var3) {
      this.method13705(!this.field21369, true);
   }
}