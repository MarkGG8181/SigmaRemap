package remapped;

public final class class_2943 extends class_8085 {
   private static String[] field_14364;

   @Override
   public class_6098 method_43688(class_8743 var1, class_6098 var2) {
      class_1331 var5 = var1.method_40142().method_6098(var1.method_40141().<class_240>method_10313(class_6451.field_32900));

      for (class_4109 var7 : var1.method_40140()
         .<class_4109>method_25869(class_4109.class, new class_4092(var5), var0 -> var0.method_37330() && var0.method_19052())) {
         if (var7.method_19069(var2) && !var7.method_19067() && var7.method_19043()) {
            var7.method_37166(401, var2.method_27953(1));
            this.method_36717(true);
            return var2;
         }
      }

      return super.method_43688(var1, var2);
   }
}