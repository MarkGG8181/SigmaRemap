package mapped;

public class Class908 extends Entity {
   private static String[] field5185;
   public final Class1007 field5186;
   public final String field5187;
   private final Class8847 field5188;

   public Class908(Class1007 var1, String var2, float var3, float var4) {
      super(var1.method3204(), var1.field5024);
      this.field5188 = Class8847.method32101(var3, var4);
      this.method3385();
      this.field5186 = var1;
      this.field5187 = var2;
   }

   @Override
   public void method2850() {
   }

   @Override
   public void method2723(Class39 var1) {
   }

   @Override
   public void method2724(Class39 var1) {
   }

   @Override
   public boolean method3139() {
      return true;
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      return !this.method2760(var1) ? this.field5186.method4325(this, var1, var2) : false;
   }

   @Override
   public boolean method3359(Entity var1) {
      return this == var1 || this.field5186 == var1;
   }

   @Override
   public Packet<?> method2835() {
      throw new UnsupportedOperationException();
   }

   @Override
   public Class8847 method2981(Class2090 var1) {
      return this.field5188;
   }
}
