package remapped;

import net.minecraft.util.text.ITextComponent;

public interface class_4668<T extends class_4088, U extends Screen & class_4378<T>> {
   default void method_21601(ITextComponent var1, class_4165<T> var2, MinecraftClient var3, int var4) {
      Screen var7 = this.method_21600((T)var2.method_19322(var4, var3.thePlayer.inventory), var3.thePlayer.inventory, var1);
      var3.thePlayer.field_3874 = ((class_4378)var7).method_20393();
      var3.method_8609(var7);
   }

   U method_21600(T var1, class_7051 var2, ITextComponent var3);
}
