package mapped;

public class Class3333 extends Class3257 {
   private static String[] field18841;

   public Class3333(Class5643 var1) {
      super(var1);
   }

   @Override
   public Class6794<Class8848> method11700(Class1655 var1, PlayerEntity var2, Class79 var3) {
      Class8848 var6 = var2.method3094(var3);
      var1.method6743(
         (PlayerEntity)null,
         var2.getPosX(),
         var2.getPosY(),
         var2.getPosZ(),
         Class6067.field27108,
         Class2266.field14734,
         0.5F,
         0.4F / (field18735.nextFloat() * 0.4F + 0.8F)
      );
      if (!var1.field9020) {
         Class894 var7 = new Class894(var1, var2);
         var7.method3511(var6);
         var7.method3463(var2, var2.field5032, var2.field5031, 0.0F, 1.5F, 1.0F);
         var1.method6916(var7);
      }

      var2.method2913(Class8876.field40098.method172(this));
      if (!var2.field4919.field29609) {
         var6.method32182(1);
      }

      return Class6794.<Class8848>method20700(var6, var1.method6714());
   }
}
