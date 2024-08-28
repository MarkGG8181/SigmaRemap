package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7049 {
   public static void method21956(CommandDispatcher<Class6619> var0) {
      RequiredArgumentBuilder var3 = (RequiredArgumentBuilder)((RequiredArgumentBuilder)Class6099.method18840("targets", Class8700.method31353())
            .executes(var0x -> method21957((Class6619)var0x.getSource(), Class8700.method31354(var0x, "targets"), (Class2266)null, (ResourceLocation)null)))
         .then(
            Class6099.method18839("*")
               .then(
                  Class6099.method18840("sound", Class8303.method29031())
                     .suggests(Class9222.field42455)
                     .executes(
                        var0x -> method21957(
                              (Class6619)var0x.getSource(), Class8700.method31354(var0x, "targets"), (Class2266)null, Class8303.method29036(var0x, "sound")
                           )
                     )
               )
         );

      for (Class2266 var7 : Class2266.values()) {
         var3.then(
            ((LiteralArgumentBuilder)Class6099.method18839(var7.method8995())
                  .executes(var1 -> method21957((Class6619)var1.getSource(), Class8700.method31354(var1, "targets"), var7, (ResourceLocation)null)))
               .then(
                  Class6099.method18840("sound", Class8303.method29031())
                     .suggests(Class9222.field42455)
                     .executes(
                        var1 -> method21957((Class6619)var1.getSource(), Class8700.method31354(var1, "targets"), var7, Class8303.method29036(var1, "sound"))
                     )
               )
         );
      }

      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("stopsound").requires(var0x -> var0x.method20129(2))).then(var3));
   }

   private static int method21957(Class6619 var0, Collection<Class878> var1, Class2266 var2, ResourceLocation var3) {
      Class5488 var6 = new Class5488(var3, var2);

      for (Class878 var8 : var1) {
         var8.field4855.method15671(var6);
      }

      if (var2 == null) {
         if (var3 == null) {
            var0.method20179(new TranslationTextComponent("commands.stopsound.success.sourceless.any"), true);
         } else {
            var0.method20179(new TranslationTextComponent("commands.stopsound.success.sourceless.sound", var3), true);
         }
      } else if (var3 == null) {
         var0.method20179(new TranslationTextComponent("commands.stopsound.success.source.any", var2.method8995()), true);
      } else {
         var0.method20179(new TranslationTextComponent("commands.stopsound.success.source.sound", var3, var2.method8995()), true);
      }

      return var1.size();
   }
}