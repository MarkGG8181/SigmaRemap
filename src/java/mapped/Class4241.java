package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import org.lwjgl.opengl.GL11;

public class Class4241 extends Class4240 {
   public static final Class6387 field20587 = new Class6387(Class1979.field12896.field12910, Class5628.method17691(Class1979.field12896.field12910, 0.1F));
   public boolean field20588 = false;
   public Animation field20589 = new Animation(300, 250);

   public Class4241(Class4305 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, field20587);
   }

   @Override
   public void method13028(int var1, int var2) {
      this.field20589.changeDirection(!this.field20909 ? Direction.BACKWARDS : Direction.FORWARDS);
      super.method13028(var1, var2);
   }

   @Override
   public void method13027(float var1) {
      this.method13277(1.0F + this.field20589.calcPercent());
      this.method13278(1.0F + this.field20589.calcPercent());
      this.method13224();
      Class3192.method11439(
         this.method13305(), (float)this.method13263(), (float)this.method13265(), "" + this.field20589.calcPercent(), Class1979.field12891.field12910
      );
      GL11.glPushMatrix();
      super.method13226(var1);
      GL11.glPopMatrix();
   }
}