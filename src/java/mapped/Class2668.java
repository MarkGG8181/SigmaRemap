package mapped;

import java.util.EnumSet;

public class Class2668 extends Class2595 {
   private static String[] field17041;
   private final Class1006 field17042;
   private double field17043;
   private double field17044;
   private int field17045;

   public Class2668(Class1006 var1) {
      this.field17042 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658));
   }

   @Override
   public boolean method10803() {
      return this.field17042.method3013().nextFloat() < 0.02F;
   }

   @Override
   public boolean method10806() {
      return this.field17045 >= 0;
   }

   @Override
   public void method10804() {
      double var3 = (Math.PI * 2) * this.field17042.method3013().nextDouble();
      this.field17043 = Math.cos(var3);
      this.field17044 = Math.sin(var3);
      this.field17045 = 20 + this.field17042.method3013().nextInt(20);
   }

   @Override
   public void method10805() {
      this.field17045--;
      this.field17042
         .method4227()
         .method28041(this.field17042.getPosX() + this.field17043, this.field17042.method3442(), this.field17042.getPosZ() + this.field17044);
   }
}