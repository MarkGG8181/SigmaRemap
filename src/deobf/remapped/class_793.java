package remapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class class_793 implements class_8773 {
   private final class_1092 field_4260;
   private final MinecraftClient field_4259;
   private int field_4262 = -1;
   private CompletableFuture<Suggestions> field_4261;

   public class_793(class_1092 var1, MinecraftClient var2) {
      this.field_4260 = var1;
      this.field_4259 = var2;
   }

   @Override
   public Collection<String> method_40307() {
      ArrayList var3 = Lists.newArrayList();

      for (class_753 var5 : this.field_4260.method_4798()) {
         var3.add(var5.method_3392().getName());
      }

      return var3;
   }

   @Override
   public Collection<String> method_40313() {
      return (Collection<String>)(this.field_4259.field_9587 != null && this.field_4259.field_9587.method_33990() == class_1430.field_7718
         ? Collections.<String>singleton(((class_5631)this.field_4259.field_9587).method_25524().method_37225())
         : Collections.<String>emptyList());
   }

   @Override
   public Collection<String> method_40330() {
      return this.field_4260.method_4805().method_29562().method_4854();
   }

   @Override
   public Collection<class_4639> method_40309() {
      return this.field_4259.method_8590().method_16338();
   }

   @Override
   public Stream<class_4639> method_40326() {
      return this.field_4260.method_4812().method_23145();
   }

   @Override
   public boolean method_40314(int var1) {
      class_5989 var4 = this.field_4259.field_9632;
      return var4 == null ? var1 == 0 : var4.method_37163(var1);
   }

   @Override
   public CompletableFuture<Suggestions> method_40316(CommandContext<class_8773> var1, SuggestionsBuilder var2) {
      if (this.field_4261 != null) {
         this.field_4261.cancel(false);
      }

      this.field_4261 = new CompletableFuture<Suggestions>();
      int var5 = ++this.field_4262;
      this.field_4260.method_4813(new class_6248(var5, var1.getInput()));
      return this.field_4261;
   }

   private static String method_3522(double var0) {
      return String.format(Locale.ROOT, "%.2f", var0);
   }

   private static String method_3523(int var0) {
      return Integer.toString(var0);
   }

   @Override
   public Collection<class_7461> method_40322() {
      class_7474 var3 = this.field_4259.field_9587;
      if (var3 != null && var3.method_33990() == class_1430.field_7717) {
         class_1331 var4 = ((class_9529)var3).method_43955();
         return Collections.<class_7461>singleton(
            new class_7461(method_3523(var4.method_12173()), method_3523(var4.method_12165()), method_3523(var4.method_12185()))
         );
      } else {
         return class_8773.super.method_40322();
      }
   }

   @Override
   public Collection<class_7461> method_40323() {
      class_7474 var3 = this.field_4259.field_9587;
      if (var3 != null && var3.method_33990() == class_1430.field_7717) {
         class_1343 var4 = var3.method_33993();
         return Collections.<class_7461>singleton(new class_7461(method_3522(var4.field_7336), method_3522(var4.field_7333), method_3522(var4.field_7334)));
      } else {
         return class_8773.super.method_40323();
      }
   }

   @Override
   public Set<class_5621<class_6486>> method_40317() {
      return this.field_4260.method_4817();
   }

   @Override
   public class_6322 method_40327() {
      return this.field_4260.method_4806();
   }

   public void method_3521(int var1, Suggestions var2) {
      if (var1 == this.field_4262) {
         this.field_4261.complete(var2);
         this.field_4261 = null;
         this.field_4262 = -1;
      }
   }
}