package mapped;

import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class3412 extends Class3209 {
   private static final ITextComponent field19096 = new TranslationTextComponent("container.stonecutter");
   public static final Class8553 field19097 = Class3198.field18484;
   public static final Class6408 field19098 = Class3209.method11539(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   public Class3412(Class7929 var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field19097, Direction.NORTH));
   }

   @Override
   public Class7380 method11495(Class5909 var1) {
      return this.method11579().method23465(field19097, var1.method18350().method536());
   }

   @Override
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Class79 var5, Class8711 var6) {
      if (!var2.field9020) {
         var4.method2766(var1.method23445(var2, var3));
         var4.method2911(Class8876.field40171);
         return Class2274.field14819;
      } else {
         return Class2274.field14818;
      }
   }

   @Nullable
   @Override
   public Class949 method11528(Class7380 var1, Class1655 var2, BlockPos var3) {
      return new Class953((var2x, var3x, var4) -> new Class5811(var2x, var3x, Class8786.method31714(var2, var3)), field19096);
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field19098;
   }

   @Override
   public boolean method11534(Class7380 var1) {
      return true;
   }

   @Override
   public Class1855 method11526(Class7380 var1) {
      return Class1855.field9887;
   }

   @Override
   public Class7380 method11500(Class7380 var1, Class80 var2) {
      return var1.method23465(field19097, var2.method252(var1.<Direction>method23463(field19097)));
   }

   @Override
   public Class7380 method11501(Class7380 var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field19097)));
   }

   @Override
   public void method11489(Class7558<Class3209, Class7380> var1) {
      var1.method24737(field19097);
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
