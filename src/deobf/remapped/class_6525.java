package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class class_6525 extends class_1710<class_209> {
   public class_6525(Codec<class_209> var1) {
      super(var1);
   }

   public Stream<class_1331> method_29712(Random var1, class_209 var2, class_1331 var3) {
      double var6 = class_6325.field_32304.method_31321((double)var3.method_12173() / var2.field_707, (double)var3.method_12185() / var2.field_707, false);
      int var8 = (int)Math.ceil((var6 + var2.field_703) * (double)var2.field_705);
      return IntStream.range(0, var8).<class_1331>mapToObj(var1x -> var3);
   }
}