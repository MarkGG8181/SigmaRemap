package remapped;

public class class_8725 extends class_7934 {
   private static String[] field_44713;
   private final class_6946 field_44715;
   private final class_704 field_44712;
   private int field_44714;

   public class_8725(class_704 var1, class_6946 var2, class_6867 var3, int var4, int var5, int var6) {
      super(var3, var4, var5, var6);
      this.field_44712 = var1;
      this.field_44715 = var2;
   }

   @Override
   public boolean method_35889(class_6098 var1) {
      return false;
   }

   @Override
   public class_6098 method_35899(int var1) {
      if (this.method_35884()) {
         this.field_44714 = this.field_44714 + Math.min(var1, this.method_35898().method_27997());
      }

      return super.method_35899(var1);
   }

   @Override
   public void method_35894(class_6098 var1, int var2) {
      this.field_44714 += var2;
      this.method_35893(var1);
   }

   @Override
   public void method_35885(int var1) {
      this.field_44714 += var1;
   }

   @Override
   public void method_35893(class_6098 var1) {
      if (this.field_44714 > 0) {
         var1.method_27964(this.field_44712.field_41768, this.field_44712, this.field_44714);
      }

      if (this.field_40591 instanceof class_9031) {
         ((class_9031)this.field_40591).method_41424(this.field_44712);
      }

      this.field_44714 = 0;
   }

   @Override
   public class_6098 method_35892(class_704 var1, class_6098 var2) {
      this.method_35893(var2);
      class_2831 var5 = var1.field_41768.method_29549().method_23147(class_1510.field_7997, this.field_44715, var1.field_41768);

      for (int var6 = 0; var6 < var5.size(); var6++) {
         class_6098 var7 = this.field_44715.method_31498(var6);
         class_6098 var8 = (class_6098)var5.get(var6);
         if (!var7.method_28022()) {
            this.field_44715.method_31497(var6, 1);
            var7 = this.field_44715.method_31498(var6);
         }

         if (!var8.method_28022()) {
            if (!var7.method_28022()) {
               if (class_6098.method_28019(var7, var8) && class_6098.method_27956(var7, var8)) {
                  var8.method_28030(var7.method_27997());
                  this.field_44715.method_31503(var6, var8);
               } else if (!this.field_44712.field_3853.method_32414(var8)) {
                  this.field_44712.method_3153(var8, false);
               }
            } else {
               this.field_44715.method_31503(var6, var8);
            }
         }
      }

      return var2;
   }
}