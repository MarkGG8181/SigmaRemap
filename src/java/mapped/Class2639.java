package mapped;

public class Class2639 extends Class2595 {
   private static String[] field16962;
   private final Class1112 field16963;
   public int field16964;

   public Class2639(Class1112 var1) {
      this.field16963 = var1;
   }

   @Override
   public boolean method10803() {
      return this.field16963.method4232() != null;
   }

   @Override
   public void method10804() {
      this.field16964 = 0;
   }

   @Override
   public void method10807() {
      this.field16963.method5358(false);
   }

   @Override
   public void method10805() {
      Class880 var3 = this.field16963.method4232();
      double var4 = 64.0;
      if (var3.method3277(this.field16963) < 4096.0 && this.field16963.method3135(var3)) {
         Class1655 var6 = this.field16963.field5024;
         this.field16964++;
         if (this.field16964 == 10 && !this.field16963.method3245()) {
            var6.method6869((PlayerEntity)null, 1015, this.field16963.method3432(), 0);
         }

         if (this.field16964 == 20) {
            double var7 = 4.0;
            Vector3d var9 = this.field16963.method3281(1.0F);
            double var10 = var3.getPosX() - (this.field16963.getPosX() + var9.field18048 * 4.0);
            double var12 = var3.method3440(0.5) - (0.5 + this.field16963.method3440(0.5));
            double var14 = var3.getPosZ() - (this.field16963.getPosZ() + var9.field18050 * 4.0);
            if (!this.field16963.method3245()) {
               var6.method6869((PlayerEntity)null, 1016, this.field16963.method3432(), 0);
            }

            Class899 var16 = new Class899(var6, this.field16963, var10, var12, var14);
            var16.field5139 = this.field16963.method5359();
            var16.method3215(
               this.field16963.getPosX() + var9.field18048 * 4.0, this.field16963.method3440(0.5) + 0.5, var16.getPosZ() + var9.field18050 * 4.0
            );
            var6.method6916(var16);
            this.field16964 = -40;
         }
      } else if (this.field16964 > 0) {
         this.field16964--;
      }

      this.field16963.method5358(this.field16964 > 10);
   }
}