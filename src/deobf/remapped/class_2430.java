package remapped;

import io.netty.buffer.ByteBuf;

public class class_2430 extends class_7437 {
   public class_2430() {
      super("Flat Item Array");
   }

   public class_9530[] method_11081(ByteBuf var1) throws Exception {
      short var4 = class_8039.field_41166.method_42475(var1);
      class_9530[] var5 = new class_9530[var4];

      for (int var6 = 0; var6 < var4; var6++) {
         var5[var6] = class_8039.field_41184.method_9912(var1);
      }

      return var5;
   }

   public void method_11080(ByteBuf var1, class_9530[] var2) throws Exception {
      class_8039.field_41166.method_42477(var1, (short)var2.length);

      for (class_9530 var8 : var2) {
         class_8039.field_41184.method_33275(var1, var8);
      }
   }
}
