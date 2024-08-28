package mapped;

import com.google.common.collect.Iterables;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Map;

import com.mojang.brigadier.tree.CommandNode;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8842 {
   private static final SimpleCommandExceptionType field39943 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.help.failed"));

   public static void method32029(CommandDispatcher<Class6619> var0) {
      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("help").executes(var1 -> {
         Map<CommandNode<Class6619>, String> var4 = var0.getSmartUsage(var0.getRoot(), var1.getSource());

         for (String var6 : var4.values()) {
            ((Class6619)var1.getSource()).method20179(new StringTextComponent("/" + var6), false);
         }

         return var4.size();
      })).then(Class6099.method18840("command", StringArgumentType.greedyString()).executes(var1 -> {
         ParseResults var4 = var0.parse(StringArgumentType.getString(var1, "command"), var1.getSource());
         if (var4.getContext().getNodes().isEmpty()) {
            throw field39943.create();
         } else {
            Map<String, String> var5 = var0.getSmartUsage(((ParsedCommandNode)Iterables.getLast(var4.getContext().getNodes())).getNode(), var1.getSource());

            for (String var7 : var5.values()) {
               ((Class6619)var1.getSource()).method20179(new StringTextComponent("/" + var4.getReader().getString() + " " + var7), false);
            }

            return var5.size();
         }
      })));
   }
}
