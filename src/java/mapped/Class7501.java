package mapped;

import com.google.common.collect.ImmutableList;
import java.util.List;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7501 implements Class7502 {
   private final List<String> field32222;

   public Class7501(Class8848 var1) {
      this.field32222 = method24458(var1);
   }

   private static List<String> method24458(Class8848 var0) {
      Class39 var3 = var0.method32142();
      return (List<String>)(var3 != null && Class3285.method11817(var3)
         ? Class870.method2696(var3)
         : ImmutableList.of(ITextComponent$Serializer.toJson(new TranslationTextComponent("book.invalid.tag").mergeStyle(TextFormatting.DARK_RED))));
   }

   @Override
   public int method24459() {
      return this.field32222.size();
   }

   @Override
   public ITextProperties method24460(int var1) {
      String var4 = this.field32222.get(var1);

      try {
         IFormattableTextComponent var5 = ITextComponent$Serializer.func_240643_a_(var4);
         if (var5 != null) {
            return var5;
         }
      } catch (Exception var6) {
      }

      return ITextProperties.func_240652_a_(var4);
   }
}