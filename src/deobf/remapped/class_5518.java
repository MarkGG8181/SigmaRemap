package remapped;

import java.util.List;
import net.minecraft.util.text.ITextComponent;

public class class_5518 extends class_2451 {
   public class_5518(class_317 var1) {
      super(var1);
   }

   @Override
   public ItemStack method_11207() {
      return class_9541.method_43999(super.method_11207(), class_3697.field_18108);
   }

   @Override
   public ItemStack method_11242(ItemStack var1, World var2, class_5834 var3) {
      PlayerEntity var6 = !(var3 instanceof PlayerEntity) ? null : (PlayerEntity)var3;
      if (var6 instanceof class_9359) {
         class_8807.field_45081.method_43401((class_9359)var6, var1);
      }

      if (!var2.field_33055) {
         for (class_2250 var8 : class_9541.method_43993(var1)) {
            if (!var8.method_10339().method_6535()) {
               var3.method_26558(new class_2250(var8));
            } else {
               var8.method_10339().method_6539(var6, var6, var3, var8.method_10333(), 1.0);
            }
         }
      }

      if (var6 != null) {
         var6.method_3211(class_6234.field_31907.method_43790(this));
         if (!var6.playerAbilities.isCreativeMode) {
            var1.method_27970(1);
         }
      }

      if (var6 == null || !var6.playerAbilities.isCreativeMode) {
         if (var1.method_28022()) {
            return new ItemStack(class_4897.field_24812);
         }

         if (var6 != null) {
            var6.inventory.method_32414(new ItemStack(class_4897.field_24812));
         }
      }

      return var1;
   }

   @Override
   public int method_11230(ItemStack var1) {
      return 32;
   }

   @Override
   public class_6209 method_11233(ItemStack var1) {
      return class_6209.field_31739;
   }

   @Override
   public class_954<ItemStack> method_11231(World var1, PlayerEntity var2, Hand var3) {
      return class_4754.method_21939(var1, var2, var3);
   }

   @Override
   public String method_11217(ItemStack var1) {
      return class_9541.method_43990(var1).method_27405(this.method_11216() + ".effect.");
   }

   @Override
   public void method_11218(ItemStack var1, World var2, List<ITextComponent> var3, class_4605 var4) {
      class_9541.method_43988(var1, var3, 1.0F);
   }

   @Override
   public boolean method_11252(ItemStack var1) {
      return super.method_11252(var1) || !class_9541.method_43993(var1).isEmpty();
   }

   @Override
   public void method_11239(class_8230 var1, class_2831<ItemStack> var2) {
      if (this.method_11224(var1)) {
         for (class_6004 var6 : class_8669.field_44365) {
            if (var6 != class_3697.field_18134) {
               var2.add(class_9541.method_43999(new ItemStack(this), var6));
            }
         }
      }
   }
}
