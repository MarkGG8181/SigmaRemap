package mapped;

import com.mojang.serialization.Codec;
import org.apache.commons.lang3.mutable.MutableBoolean;

import java.util.Random;

public class Class2934 extends Class2898<Class4713> {
   public Class2934(Codec<Class4713> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, Class5646 var2, Random var3, BlockPos var4, Class4713 var5) {
      MutableBoolean var8 = new MutableBoolean();
      var5.field22353.method26507(new Class9010(var1, var2), var3, var4).forEach(var5x -> {
         if (var5.field22352.get().method26521(var1, var2, var3, var5x)) {
            var8.setTrue();
         }
      });
      return var8.isTrue();
   }

   @Override
   public String toString() {
      return String.format("< %s [%s] >", this.getClass().getSimpleName(), Class2348.field16112.method9181(this));
   }
}