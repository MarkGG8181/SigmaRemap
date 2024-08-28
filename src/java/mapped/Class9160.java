package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9160 {
   public static void method34194(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("spawnpoint").requires(var0x -> var0x.method20129(2)))
               .executes(
                  var0x -> method34195(
                        (Class6619)var0x.getSource(),
                        Collections.<Class878>singleton(((Class6619)var0x.getSource()).method20175()),
                        new BlockPos(((Class6619)var0x.getSource()).method20171()),
                        0.0F
                     )
               ))
            .then(
               ((RequiredArgumentBuilder)Class6099.method18840("targets", Class8700.method31353())
                     .executes(
                        var0x -> method34195(
                              (Class6619)var0x.getSource(),
                              Class8700.method31354(var0x, "targets"),
                              new BlockPos(((Class6619)var0x.getSource()).method20171()),
                              0.0F
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)Class6099.method18840("pos", Class6849.method20826())
                           .executes(
                              var0x -> method34195(
                                    (Class6619)var0x.getSource(), Class8700.method31354(var0x, "targets"), Class6849.method20828(var0x, "pos"), 0.0F
                                 )
                           ))
                        .then(
                           Class6099.method18840("angle", Class9076.method33816())
                              .executes(
                                 var0x -> method34195(
                                       (Class6619)var0x.getSource(),
                                       Class8700.method31354(var0x, "targets"),
                                       Class6849.method20828(var0x, "pos"),
                                       Class9076.method33817(var0x, "angle")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method34195(Class6619 var0, Collection<Class878> var1, BlockPos var2, float var3) {
      Class8705 var6 = var0.method20172().method6813();

      for (Class878 var8 : var1) {
         var8.method2829(var6, var2, var3, true, false);
      }

      String var9 = var6.method31399().toString();
      if (var1.size() != 1) {
         var0.method20179(
            new TranslationTextComponent(
               "commands.spawnpoint.success.multiple", var2.method8304(), var2.getY(), var2.method8306(), var3, var9, var1.size()
            ),
            true
         );
      } else {
         var0.method20179(
            new TranslationTextComponent(
               "commands.spawnpoint.success.single",
               var2.method8304(),
               var2.getY(),
               var2.method8306(),
               var3,
               var9,
               ((Class878)var1.iterator().next()).method2954()
            ),
            true
         );
      }

      return var1.size();
   }
}