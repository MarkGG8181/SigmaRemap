package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;

import java.util.EnumSet;
import java.util.List;

public class Class2671<T extends Class1026> extends Class2595 {
   private static String[] field17054;
   private final T field17055;
   public final Class1026 field17056;

   public Class2671(T var1, Class1026 var2) {
      this.field17056 = var1;
      this.field17055 = (T)var2;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      Class7699 var3 = this.field17055.method4551();
      if (this.field17055.method4552()
         && !this.field17055.method4551().method25388()
         && this.field17055.method4570()
         && !ItemStack.areItemStacksEqual1(this.field17055.getItemStackFromSlot(EquipmentSlotType.HEAD), Class7699.method25421())) {
         Class1026 var4 = var3.method25422(this.field17055.method4554());
         if (var4 == null || !var4.isAlive()) {
            List var5 = this.field17055
               .world
               .<ItemEntity>method6772(ItemEntity.class, this.field17055.getBoundingBox().method19663(16.0, 8.0, 16.0), Class1026.method4566());
            if (!var5.isEmpty()) {
               return this.field17055.method4230().method21655((Entity)var5.get(0), 1.15F);
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public void method10805() {
      if (this.field17055.method4230().method21643().method8317(this.field17055.getPositionVec(), 1.414)) {
         List var3 = this.field17055
            .world
            .<ItemEntity>method6772(ItemEntity.class, this.field17055.getBoundingBox().method19663(4.0, 4.0, 4.0), Class1026.method4566());
         if (!var3.isEmpty()) {
            this.field17055.method4246((ItemEntity)var3.get(0));
         }
      }
   }
}
