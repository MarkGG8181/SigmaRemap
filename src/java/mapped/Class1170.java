package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1170 extends Class1155<Class1170> {
   private static String[] field6342;
   private final Class9007<ResourceLocation> field6343;
   private final ITextComponent field6344;
   public final Class1280 field6345;

   public Class1170(Class1280 var1, Class9007 var2) {
      this.field6345 = var1;
      this.field6343 = var2;
      this.field6344 = new TranslationTextComponent(Class1305.method6192(var2));
   }

   @Override
   public void method5544(Class9332 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      Class1193.method5693(var1, this.field6345.field6835.field4568, this.field6344, var4 + 2, var3 + 1, var2 % 2 != 0 ? 9474192 : 16777215);
      String var13 = this.field6343.method33277(Class1305.method6193(this.field6345.field6835).method28961(this.field6343));
      Class1193.method5692(
         var1,
         this.field6345.field6835.field4568,
         var13,
         var4 + 2 + 213 - this.field6345.field6835.field4568.method38820(var13),
         var3 + 1,
         var2 % 2 != 0 ? 9474192 : 16777215
      );
   }
}
