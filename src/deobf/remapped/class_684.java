package remapped;

import java.util.HashSet;
import java.util.Set;

public class class_684 extends class_9448 {
   private static String[] field_3768;

   public class_684() {
      super(class_9301.class);
   }

   @Override
   public Set<class_3841> method_43698(class_1331 var1, class_2522 var2, class_6590 var3) {
      HashSet var6 = new HashSet();
      class_2522 var7 = MinecraftClient.getInstance().field_9601.method_28262(var1);
      if (var7.method_8360() instanceof class_9301) {
         var6.add(new class_3841(var1, var7.method_10308(class_9301.field_47514, var2.<Integer>method_10313(class_9301.field_47514))));
      }

      return var6;
   }

   @Override
   public Set<class_3841> method_43697(class_1331 var1, class_2522 var2, class_6590 var3) {
      HashSet var6 = new HashSet();
      class_9529 var7 = new class_9529(new class_1343(0.0, 0.0, 0.0), class_240.field_817, var1, false);
      class_353 var8 = new class_353(this.field_48220.field_9601, this.field_48220.field_9632, class_2584.field_12791, new class_6098(var2.method_8360()), var7);
      var8.field_1379 = var1;
      var8.field_1381 = false;
      class_2522 var9 = var2.method_8360().method_29302(var8);
      var6.add(new class_3841(var1, var9.method_10308(class_9301.field_47514, var2.<Integer>method_10313(class_9301.field_47514))));
      return var6;
   }
}
