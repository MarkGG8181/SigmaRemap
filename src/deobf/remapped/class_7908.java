package remapped;

import java.util.UUID;

public class class_7908 implements class_1979 {
   private static String[] field_40429;
   private class_8145 field_40430;

   @Override
   public int method_9095() {
      UUID var3 = this.field_40430.method_37328();
      long var4 = var3.getLeastSignificantBits();
      return (int)(var4 & 2147483647L);
   }

   @Override
   public class_1331 method_9092() {
      return this.field_40430.method_37372().field_41301;
   }

   @Override
   public class_6325 method_9094() {
      return this.field_40430.method_37372().field_41296;
   }

   @Override
   public String method_9093() {
      return !this.field_40430.method_45507() ? null : this.field_40430.method_45508().getString();
   }

   @Override
   public int method_9097() {
      if (this.field_40430 instanceof class_5834) {
         class_5834 var3 = (class_5834)this.field_40430;
         return (int)var3.method_26551();
      } else {
         return 0;
      }
   }

   @Override
   public int method_9096() {
      if (this.field_40430 instanceof class_5834) {
         class_5834 var3 = (class_5834)this.field_40430;
         return (int)var3.method_26465();
      } else {
         return 0;
      }
   }

   public class_8145 method_35765() {
      return this.field_40430;
   }

   public void method_35766(class_8145 var1) {
      this.field_40430 = var1;
   }
}