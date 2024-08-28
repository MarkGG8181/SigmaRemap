package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;

public class Class7737 {
   public static final Codec<Class7737> field33229 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Class7940.field34120.fieldOf("options").forGetter(var0x -> var0x.field33230),
               Codec.FLOAT.fieldOf("probability").forGetter(var0x -> var0x.field33231)
            )
            .apply(var0, Class7737::new)
   );
   private final Class7436 field33230;
   private final float field33231;

   public Class7737(Class7436 var1, float var2) {
      this.field33230 = var1;
      this.field33231 = var2;
   }

   public Class7436 method25614() {
      return this.field33230;
   }

   public boolean method25615(Random var1) {
      return var1.nextFloat() <= this.field33231;
   }
}
