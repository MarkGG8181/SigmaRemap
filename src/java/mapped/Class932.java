package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;

public abstract class Class932 extends Class944 implements Class920, Class949, Class933 {
   private Class7969 field5279 = Class7969.field34259;
   private ITextComponent field5280;

   public Class932(Class4387<?> var1) {
      super(var1);
   }

   @Override
   public void method3645(Class7380 var1, Class39 var2) {
      super.method3645(var1, var2);
      this.field5279 = Class7969.method27093(var2);
      if (var2.method119("CustomName", 8)) {
         this.field5280 = ITextComponent$Serializer.func_240643_a_(var2.method126("CustomName"));
      }
   }

   @Override
   public Class39 method3646(Class39 var1) {
      super.method3646(var1);
      this.field5279.method27092(var1);
      if (this.field5280 != null) {
         var1.method109("CustomName", ITextComponent$Serializer.toJson(this.field5280));
      }

      return var1;
   }

   public void method3695(ITextComponent var1) {
      this.field5280 = var1;
   }

   @Override
   public ITextComponent method2941() {
      return this.field5280 == null ? this.method3686() : this.field5280;
   }

   @Override
   public ITextComponent method2954() {
      return this.method2941();
   }

   @Nullable
   @Override
   public ITextComponent method3380() {
      return this.field5280;
   }

   public abstract ITextComponent method3686();

   public boolean method3696(PlayerEntity var1) {
      return method3697(var1, this.field5279, this.method2954());
   }

   public static boolean method3697(PlayerEntity var0, Class7969 var1, ITextComponent var2) {
      if (!var0.method2800() && !var1.method27091(var0.method3090())) {
         var0.method2785(new TranslationTextComponent("container.isLocked", var2), true);
         var0.method2834(Class6067.field26448, Class2266.field14732, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   @Override
   public Class5812 method3627(int var1, Class974 var2, PlayerEntity var3) {
      return !this.method3696(var3) ? null : this.method3690(var1, var2);
   }

   public abstract Class5812 method3690(int var1, Class974 var2);
}