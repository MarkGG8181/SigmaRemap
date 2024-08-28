package mapped;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;

public final class Class8423<E> implements Codec<Class2350<E>> {
   private final Codec<Class2350<E>> field36097;
   private final Class8705<? extends Class2348<E>> field36098;
   private final Codec<E> field36099;

   public static <E> Class8423<E> method29595(Class8705<? extends Class2348<E>> var0, Lifecycle var1, Codec<E> var2) {
      return new Class8423<E>(var0, var1, var2);
   }

   private Class8423(Class8705<? extends Class2348<E>> var1, Lifecycle var2, Codec<E> var3) {
      this.field36097 = Class2350.<E>method9257(var1, var2, var3);
      this.field36098 = var1;
      this.field36099 = var3;
   }

   public <T> DataResult<T> encode(Class2350<E> var1, DynamicOps<T> var2, T var3) {
      return this.field36097.encode(var1, var2, var3);
   }

   public <T> DataResult<Pair<Class2350<E>, T>> decode(DynamicOps<T> var1, T var2) {
      DataResult<Pair<Class2350<E>, T>> var5 = this.field36097.decode(var1, var2);
      return !(var1 instanceof Class6711)
         ? var5
         : var5.flatMap(
            var2x -> ((Class6711)var1)
                  .<E>method20474(var2x.getFirst(), this.field36098, this.field36099)
                  .map(var1xx -> Pair.of(var1xx, var2x.getSecond()))
         );
   }

   @Override
   public String toString() {
      return "RegistryDataPackCodec[" + this.field36097 + " " + this.field36098 + " " + this.field36099 + "]";
   }
}