package mapped;

import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextProperties;

public interface Class5991 {
   Class5991 field26162 = new Class5992();

   static Class5991 method18584(Class9834 var0, ITextProperties var1, int var2) {
      return method18587(
         var0,
         var0.method38828(var1, var2)
            .stream()
            .<Class9806>map(var1x -> new Class9806(var1x, var0.method38822(var1x), null))
            .collect(ImmutableList.toImmutableList())
      );
   }

   static Class5991 method18585(Class9834 var0, ITextProperties var1, int var2, int var3) {
      return method18587(
         var0,
         var0.method38828(var1, var2)
            .stream()
            .limit((long)var3)
            .<Class9806>map(var1x -> new Class9806(var1x, var0.method38822(var1x), null))
            .collect(ImmutableList.toImmutableList())
      );
   }

   static Class5991 method18586(Class9834 var0, ITextComponent... var1) {
      return method18587(
         var0,
         Arrays.<ITextComponent>stream(var1)
            .<Class9125>map(ITextComponent::func_241878_f)
            .<Class9806>map(var1x -> new Class9806(var1x, var0.method38822(var1x), null))
            .collect(ImmutableList.toImmutableList())
      );
   }

   static Class5991 method18587(Class9834 var0, List<Class9806> var1) {
      return !var1.isEmpty() ? new Class5993(var1, var0) : field26162;
   }

   int method18588(Class9332 var1, int var2, int var3);

   int method18589(Class9332 var1, int var2, int var3, int var4, int var5);

   int method18590(Class9332 var1, int var2, int var3, int var4, int var5);

   int method18591(Class9332 var1, int var2, int var3, int var4, int var5);

   int method18592();
}
