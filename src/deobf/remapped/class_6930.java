package remapped;

public class class_6930 extends class_8085 {
   private static String[] field_35603;

   @Override
   public class_6098 method_43688(class_8743 var1, class_6098 var2) {
      this.method_36717(false);
      class_2451 var5 = var2.method_27960();
      if (var5 instanceof class_6201) {
         class_240 var6 = var1.method_40141().<class_240>method_10313(class_6451.field_32900);
         class_1331 var7 = var1.method_40142().method_6098(var6);
         class_240 var8 = !var1.method_40140().method_22548(var7.method_6100()) ? class_240.field_817 : var6;
         this.method_36717(((class_6201)var5).method_28394(new class_9519(var1.method_40140(), var7, var6, var2, var8)).method_31662());
      }

      return var2;
   }
}
