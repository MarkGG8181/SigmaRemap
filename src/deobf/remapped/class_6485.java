package remapped;

public class class_6485 extends class_741 {
   private static String[] field_33028;

   public class_6485(class_317 var1, class_6414 var2, class_6414 var3) {
      super(var2, var3, var1);
   }

   @Override
   public boolean method_28391(BlockPos var1, World var2, PlayerEntity var3, ItemStack var4, class_2522 var5) {
      boolean var8 = super.method_28391(var1, var2, var3, var4, var5);
      if (!var2.field_33055 && !var8 && var3 != null) {
         var3.method_3244((class_8398)var2.method_28260(var1));
      }

      return var8;
   }
}
