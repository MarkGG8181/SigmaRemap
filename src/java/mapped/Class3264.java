package mapped;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.google.common.collect.Multimap;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Set;

public class Class3264 extends Class3266 implements Class3260 {
   private final Set<Block> field18751;
   public final float field18752;
   private final float field18753;
   private final Multimap<Class4869, Class9689> field18754;

   public Class3264(float var1, float var2, Class2283 var3, Set<Block> var4, Class5643 var5) {
      super(var3, var5);
      this.field18751 = var4;
      this.field18752 = var3.method9011();
      this.field18753 = var1 + var3.method9012();
      Builder var8 = ImmutableMultimap.builder();
      var8.put(Attributes.field42110, new Class9689(field18733, "Tool modifier", (double)this.field18753, AttributeModifierOperation.ADDITION));
      var8.put(Attributes.ATTACK_SPEED, new Class9689(field18734, "Tool modifier", (double)var2, AttributeModifierOperation.ADDITION));
      this.field18754 = var8.build();
   }

   @Override
   public float method11708(ItemStack var1, BlockState var2) {
      return !this.field18751.contains(var2.getBlock()) ? 1.0F : this.field18752;
   }

   @Override
   public boolean method11713(ItemStack var1, LivingEntity var2, LivingEntity var3) {
      var1.method32121(2, var3, var0 -> var0.method3184(Class2106.field13731));
      return true;
   }

   @Override
   public boolean method11714(ItemStack var1, World var2, BlockState var3, BlockPos var4, LivingEntity var5) {
      if (!var2.isRemote && var3.method23405(var2, var4) != 0.0F) {
         var1.method32121(1, var5, var0 -> var0.method3184(Class2106.field13731));
      }

      return true;
   }

   @Override
   public Multimap<Class4869, Class9689> method11740(Class2106 var1) {
      return var1 != Class2106.field13731 ? super.method11740(var1) : this.field18754;
   }

   public float method11779() {
      return this.field18753;
   }
}
