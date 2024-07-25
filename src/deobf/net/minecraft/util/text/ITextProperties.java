package net.minecraft.util.text;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import remapped.class_3256;

public interface ITextProperties {
   Optional<class_3256> field_240650_b_ = Optional.<class_3256>of(class_3256.field_16155);
   ITextProperties field_240651_c_ = new ITextProperties$1();

   <T> Optional<T> func_230438_a_(ITextProperties$class_42<T> var1);

   <T> Optional<T> func_230439_a_(ITextProperties$class_41<T> var1, Style var2);

   static ITextProperties func_240652_a_(String p_240652_0_) {
      return new ITextProperties$2(p_240652_0_);
   }

   static ITextProperties func_240653_a_(String p_240653_0_, Style p_240653_1_) {
      return new ITextProperties$3(p_240653_0_, p_240653_1_);
   }

   static ITextProperties func_240655_a_(ITextProperties... p_240655_0_) {
      return func_240654_a_(ImmutableList.copyOf(p_240655_0_));
   }

   static ITextProperties func_240654_a_(List<ITextProperties> p_240654_0_) {
      return new ITextProperties$4(p_240654_0_);
   }

   default String getString() {
      StringBuilder var3 = new StringBuilder();
      this.func_230438_a_(p_241754_1_ -> {
         var3.append(p_241754_1_);
         return Optional.empty();
      });
      return var3.toString();
   }
}
