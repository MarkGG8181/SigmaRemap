package mapped;

import java.util.EnumSet;
import java.util.Random;

public class Class2744 extends Class2736 {
   private static String[] field17257;
   private Direction field17271;
   private boolean field17272;

   public Class2744(Class1107 var1) {
      super(var1, 1.0, 10);
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      if (this.field17258.method4232() == null) {
         if (this.field17258.method4230().method21664()) {
            Random var3 = this.field17258.method3013();
            if (this.field17258.field5024.method6789().method17135(Class5462.field24224) && var3.nextInt(10) == 0) {
               this.field17271 = Direction.method552(var3);
               BlockPos var4 = new BlockPos(this.field17258.getPosX(), this.field17258.getPosY() + 0.5, this.field17258.getPosZ())
                  .method8349(this.field17271);
               Class7380 var5 = this.field17258.field5024.method6738(var4);
               if (Class3442.method12119(var5)) {
                  this.field17272 = true;
                  return true;
               }
            }

            this.field17272 = false;
            return super.method10803();
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      return !this.field17272 ? super.method10806() : false;
   }

   @Override
   public void method10804() {
      if (this.field17272) {
         Class1655 var3 = this.field17258.field5024;
         BlockPos var4 = new BlockPos(this.field17258.getPosX(), this.field17258.getPosY() + 0.5, this.field17258.getPosZ())
            .method8349(this.field17271);
         Class7380 var5 = var3.method6738(var4);
         if (Class3442.method12119(var5)) {
            var3.method6725(var4, Class3442.method12121(var5.method23383()), 3);
            this.field17258.method4239();
            this.field17258.method2904();
         }
      } else {
         super.method10804();
      }
   }
}