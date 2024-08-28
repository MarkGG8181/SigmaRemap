package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.List;

public class Class3288 extends Class3287 {
   private final Class8992<?> field18799;

   public Class3288(Class8992<?> var1, Class7631 var2, Class5643 var3) {
      super(var2, var3);
      this.field18799 = var1;
   }

   @Override
   public void method11824(World var1, ItemStack var2, BlockPos var3) {
      if (var1 instanceof ServerWorld) {
         this.method11827((ServerWorld)var1, var2, var3);
      }
   }

   @Override
   public void method11826(PlayerEntity var1, Class1660 var2, BlockPos var3) {
      var2.method6742(var1, var3, Class6067.field26427, Class2266.field14734, 1.0F, 1.0F);
   }

   private void method11827(ServerWorld var1, ItemStack var2, BlockPos var3) {
      Entity var6 = this.field18799.method33200(var1, var2, (PlayerEntity)null, var3, Class2202.field14402, true, false);
      if (var6 != null) {
         ((Class1049)var6).method4794(true);
      }
   }

   @Override
   public void method11730(ItemStack var1, World var2, List<ITextComponent> var3, Class2216 var4) {
      if (this.field18799 == Class8992.field41095) {
         Class39 var7 = var1.method32142();
         if (var7 != null && var7.method119("BucketVariantTag", 3)) {
            int var8 = var7.method122("BucketVariantTag");
            TextFormatting[] var9 = new TextFormatting[]{TextFormatting.ITALIC, TextFormatting.GRAY};
            String var10 = "color.minecraft." + Class1052.method4814(var8);
            String var11 = "color.minecraft." + Class1052.method4815(var8);

            for (int var12 = 0; var12 < Class1052.field5817.length; var12++) {
               if (var8 == Class1052.field5817[var12]) {
                  var3.add(new TranslationTextComponent(Class1052.method4813(var12)).mergeStyle(var9));
                  return;
               }
            }

            var3.add(new TranslationTextComponent(Class1052.method4816(var8)).mergeStyle(var9));
            TranslationTextComponent var13 = new TranslationTextComponent(var10);
            if (!var10.equals(var11)) {
               var13.appendString(", ").append(new TranslationTextComponent(var11));
            }

            var13.mergeStyle(var9);
            var3.add(var13);
         }
      }
   }
}
