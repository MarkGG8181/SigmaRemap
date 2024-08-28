package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.Class8603;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;

public class Class4272 extends Class4247 {
   public Animation field20703 = new Animation(300, 200, Direction.BACKWARDS);
   private final int field20704;
   private Class4339 field20705;
   public static Class8233 field20706;
   private Class4285 field20707;

   public Class4272(Class4305 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, 0, Class6387.field27961, false);
      Class4274 var9;
      this.method13230(
         var9 = new Class4274(this, "blankButton", 25, 0, ResourceRegistry.field38854.method23942("Blank"), 30, Class6387.field27961, "Blank", ResourceRegistry.field38854)
      );
      var9.method13251((var1x, var2x) -> {
         Class4357 var5x = (Class4357)this.method13258();
         var5x.method13612();
      });
      Class4274 var10;
      this.method13230(
         var10 = new Class4274(
            this,
            "dupeButton",
            var5 - 25 - ResourceRegistry.field38854.method23942("Duplicate"),
            0,
            ResourceRegistry.field38854.method23942("Duplicate"),
            30,
            Class6387.field27961,
            "Duplicate",
            ResourceRegistry.field38854
         )
      );
      var10.method13251((var1x, var2x) -> {
         Class4357 var5x = (Class4357)this.method13258();
         var5x.method13610();
      });
      this.method13230(this.field20707 = new Class4285(this, "loading", (var5 - 30) / 2, 100, 30, 30));
      this.method13230(this.field20705 = new Class4339(this, "defaultProfiles", 0, 40, var5, var6 - 40));
      field20706 = new Class8233(
         var2x -> {
            this.field20707.method13288(false);
            Class4357 var5x = (Class4357)this.method13258();

            for (String var7 : var2x) {
               Class4240 var8;
               this.field20705
                  .method13230(
                     var8 = new Class4240(
                        this.field20705, "p_" + var7, 0, 0, var5, 30, new Class6387(-723724, -2039584, 0, -14671840), var7, ResourceRegistry.field38853
                     )
                  );
               var8.method13251((var3x, var4x) -> {
                  this.method13118(true);
                  new Thread(() -> {
                     Client.getInstance();
                     Class6814 var5xx = Client.getInstance().getModuleManager().method14667();
                     Class7286 var6x = var5xx.method20770();
                     Class7286 var7x = field20706.method28657(var6x, var7);
                     var5x.method13611(var7x);
                     this.method13118(false);
                  }).start();
               });
            }

            this.field20705.method13517().method13246(new Class7262(1));
         }
      );
      this.field20704 = var6;
   }

   public void method13118(boolean var1) {
      this.field20705.method13288(!var1);
      this.field20707.method13288(var1);
   }

   public void method13119(boolean var1) {
      this.field20703.changeDirection(!var1 ? Direction.BACKWARDS : Direction.FORWARDS);
   }

   public boolean method13120() {
      return this.field20703.method25319() == Direction.FORWARDS;
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
   }

   @Override
   public void method13027(float var1) {
      float var4 = Class8603.method30791(this.field20703.calcPercent(), 0.1, 0.81, 0.14, 1.0);
      if (this.field20703.method25319() == Direction.BACKWARDS) {
         var4 = Class8603.method30791(this.field20703.calcPercent(), 0.61, 0.01, 0.87, 0.16);
      }

      this.method13270((int)((float)this.field20704 * var4));
      if (this.field20703.calcPercent() != 0.0F) {
         Class3192.method11449(
            (float)this.field20895,
            (float)(this.field20896 + this.field20898),
            (float)this.field20897,
            50.0F,
            ResourcesDecrypter.shadowBottomPNG,
            Class5628.method17688(Class1979.field12896.field12910, this.field20703.calcPercent() * var1 * 0.3F)
         );
         Class3192.method11415(this);
         Class3192.method11424(
            (float)this.field20895, (float)this.field20896, (float)this.field20897, (float)this.field20898, Class5628.method17688(-723724, var1)
         );
         if (field20706 != null && Class8233.field35347 != null && Class8233.field35347.isEmpty()) {
            Class3192.method11439(
               ResourceRegistry.field38852,
               (float)(this.field20895 + 40),
               (float)(this.field20896 + 110),
               "No Default Profiles Available",
               Class1979.field12899.field12910
            );
         }

         super.method13027(var1);
         Class3192.method11422();
      }
   }
}
