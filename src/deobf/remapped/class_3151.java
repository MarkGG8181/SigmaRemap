package remapped;

public abstract class class_3151 implements class_8932<class_6867> {
   public final class_1510<?> field_15673;
   public final Identifier field_15670;
   public final String field_15674;
   public final class_8137 field_15675;
   public final ItemStack field_15669;
   public final float field_15671;
   public final int field_15672;

   public class_3151(class_1510<?> var1, Identifier var2, String var3, class_8137 var4, ItemStack var5, float var6, int var7) {
      this.field_15673 = var1;
      this.field_15670 = var2;
      this.field_15674 = var3;
      this.field_15675 = var4;
      this.field_15669 = var5;
      this.field_15671 = var6;
      this.field_15672 = var7;
   }

   @Override
   public boolean method_41052(class_6867 var1, World var2) {
      return this.field_15675.test(var1.method_31498(0));
   }

   @Override
   public ItemStack method_41042(class_6867 var1) {
      return this.field_15669.method_27973();
   }

   @Override
   public boolean method_41047(int var1, int var2) {
      return true;
   }

   @Override
   public class_2831<class_8137> method_41043() {
      class_2831 var3 = class_2831.method_12874();
      var3.add(this.field_15675);
      return var3;
   }

   public float method_14548() {
      return this.field_15671;
   }

   @Override
   public ItemStack method_41044() {
      return this.field_15669;
   }

   @Override
   public String method_41051() {
      return this.field_15674;
   }

   public int method_14546() {
      return this.field_15672;
   }

   @Override
   public Identifier method_41050() {
      return this.field_15670;
   }

   @Override
   public class_1510<?> method_41045() {
      return this.field_15673;
   }
}
