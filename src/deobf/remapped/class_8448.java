package remapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class class_8448 implements class_2995 {
   private static String[] field_43204;
   private final Map<class_1331, class_7351> field_43203 = Maps.newHashMap();

   public void method_38854(class_1331 var1, int var2, String var3, int var4) {
      this.field_43203.put(var1, new class_7351(var2, var3, class_9665.method_44650() + (long)var4));
   }

   @Override
   public void method_13699() {
      this.field_43203.clear();
   }

   @Override
   public void method_13698(class_7966 var1, class_2565 var2, double var3, double var5, double var7) {
      long var11 = class_9665.method_44650();
      this.field_43203.entrySet().removeIf(var2x -> var11 > var2x.getValue().field_37577);
      this.field_43203.forEach(this::method_38855);
   }

   private void method_38855(class_1331 var1, class_7351 var2) {
      class_3542.method_16438();
      class_3542.method_16488();
      class_3542.method_16425(class_5033.field_26042, class_8535.field_43697, class_5033.field_26047, class_8535.field_43699);
      class_3542.method_16480(0.0F, 1.0F, 0.0F, 0.75F);
      class_3542.method_16354();
      class_3372.method_15560(var1, 0.02F, var2.method_33495(), var2.method_33493(), var2.method_33494(), var2.method_33492());
      if (!var2.field_37578.isEmpty()) {
         double var5 = (double)var1.method_12173() + 0.5;
         double var7 = (double)var1.method_12165() + 1.2;
         double var9 = (double)var1.method_12185() + 0.5;
         class_3372.method_15555(var2.field_37578, var5, var7, var9, -1, 0.01F, true, 0.0F, true);
      }

      class_3542.method_16432();
      class_3542.method_16448();
      class_3542.method_16489();
   }
}
