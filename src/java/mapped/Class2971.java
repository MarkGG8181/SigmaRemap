package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

import java.util.List;

public class Class2971 extends Class2961<Class4712> {
   private static final List<Class6692> field18085 = ImmutableList.of(new Class6692(Class8992.field41036, 1, 2, 4));

   public Class2971(Codec<Class4712> var1) {
      super(var1);
   }

   @Override
   public boolean method11357() {
      return false;
   }

   public boolean method11361(Class5646 var1, Class1685 var2, long var3, Class2420 var5, int var6, int var7, Class8907 var8, Class7481 var9, Class4712 var10) {
      for (Class8907 var14 : var2.method7202(var6 * 16 + 9, var1.method17807(), var7 * 16 + 9, 16)) {
         if (!var14.method32507().method24277(this)) {
            return false;
         }
      }

      for (Class8907 var16 : var2.method7202(var6 * 16 + 9, var1.method17807(), var7 * 16 + 9, 29)) {
         if (var16.method32527() != Class100.field285 && var16.method32527() != Class100.field287) {
            return false;
         }
      }

      return true;
   }

   @Override
   public Class7072<Class4712> method11359() {
      return Class5451::new;
   }

   @Override
   public List<Class6692> method11374() {
      return field18085;
   }
}
