package mapped;

public class Class2681 extends Class2680 {
   private static String[] field17091;
   private final Class1090 field17092;

   public Class2681(Class1090 var1, double var2, Class120 var4, boolean var5) {
      super(var1, var2, var4, var5);
      this.field17092 = var1;
   }

   @Override
   public boolean method10899() {
      return super.method10899() && !Class1090.method5079(this.field17092);
   }
}
