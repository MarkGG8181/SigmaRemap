package mapped;

public class Class2653 extends Class2647 {
   private static String[] field16989;
   public final Class1029 field17005;

   public Class2653(Class1029 var1) {
      super(var1, 1.0, true);
      this.field17005 = var1;
   }

   @Override
   public double method10859(Class880 var1) {
      float var4 = this.field17005.method3429() - 0.1F;
      return (double)(var4 * 2.0F * var4 * 2.0F + var1.method3429());
   }
}
