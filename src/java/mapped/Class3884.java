package mapped;

public class Class3884 extends Class3758 {
   private static String[] field20122;
   public final Class1867 field20123;
   public final Class6904 field20124;

   public Class3884(Class6904 var1, Class1867 var2) {
      this.field20124 = var1;
      this.field20123 = var2;
   }

   @Override
   public void method12725() {
      this.map(Class4750.field22544);
      this.method12733(var2 -> {
         int var5 = var2.<Integer>method30555(Class4750.field22544, 0);
         var2.method30580().<Class6036>method22438(Class6904.method21111(this.field20124)).method18666(var5, field20123);
      });
   }
}