package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9504 {
   public static void method36698(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("say").requires(var0x -> var0x.method20129(2)))
            .then(Class6099.method18840("message", Class7026.method21755()).executes(var0x -> {
               ITextComponent var3 = Class7026.method21756(var0x, "message");
               TranslationTextComponent var4 = new TranslationTextComponent("chat.type.announcement", ((Class6619)var0x.getSource()).method20169(), var3);
               Entity var5 = ((Class6619)var0x.getSource()).method20173();
               if (var5 == null) {
                  ((Class6619)var0x.getSource()).method20177().method1367().method19484(var4, ChatType.SYSTEM, Util.field45724);
               } else {
                  ((Class6619)var0x.getSource()).method20177().method1367().method19484(var4, ChatType.CHAT, var5.method3375());
               }

               return 1;
            }))
      );
   }
}