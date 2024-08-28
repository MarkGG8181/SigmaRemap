package mapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.DataFixer;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;

public class Class837 extends Screen {
   private static final Logger field4624 = LogManager.getLogger();
   private static final Object2IntMap<Class8705<Class1655>> field4625 = Util.<Object2IntMap<Class8705<Class1655>>>method38508(
      new Object2IntOpenCustomHashMap(Util.method38509()), var0 -> {
         var0.put(Class1655.field8999, -13408734);
         var0.put(Class1655.field9000, -10075085);
         var0.put(Class1655.field9001, -8943531);
         var0.defaultReturnValue(-2236963);
      }
   );
   private final BooleanConsumer field4626;
   private final Class7958 field4627;

   @Nullable
   public static Class837 method2560(Minecraft var0, BooleanConsumer var1, DataFixer var2, Class1814 var3, boolean var4) {
      Class8905 var7 = Class8904.method32457();

      try (Class1811 var8 = var0.method1503(var7, Minecraft::method1497, Minecraft::method1498, false, var3)) {
         Class6611 var10 = var8.method7959();
         var3.method8000(var7, var10);
         ImmutableSet var11 = var10.method20087().method26266();
         return new Class837(var1, var2, var3, var10.method20099(), var4, var11);
      } catch (Exception var24) {
         field4624.warn("Failed to load datapacks, can't optimize world", var24);
         return null;
      }
   }

   private Class837(BooleanConsumer var1, DataFixer var2, Class1814 var3, Class8898 var4, boolean var5, ImmutableSet<Class8705<Class1655>> var6) {
      super(new TranslationTextComponent("optimizeWorld.title", var4.method32426()));
      this.field4626 = var1;
      this.field4627 = new Class7958(var3, var2, var6, var5);
   }

   @Override
   public void method1921() {
      super.method1921();
      this.<Class1206>method2455(new Class1206(this.field4564 / 2 - 100, this.field4565 / 4 + 150, 200, 20, Class7127.field30659, var1 -> {
         this.field4627.method27059();
         this.field4626.accept(false);
      }));
   }

   @Override
   public void method1919() {
      if (this.field4627.method27062()) {
         this.field4626.accept(true);
      }
   }

   @Override
   public void method1945() {
      this.field4626.accept(false);
   }

   @Override
   public void method1931() {
      this.field4627.method27059();
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      this.method2469(var1);
      method5691(var1, this.field4568, this.field4560, this.field4564 / 2, 20, 16777215);
      int var7 = this.field4564 / 2 - 150;
      int var8 = this.field4564 / 2 + 150;
      int var9 = this.field4565 / 4 + 100;
      int var10 = var9 + 10;
      method5691(var1, this.field4568, this.field4627.method27069(), this.field4564 / 2, var9 - 9 - 2, 10526880);
      if (this.field4627.method27066() > 0) {
         method5686(var1, var7 - 1, var9 - 1, var8 + 1, var10 + 1, -16777216);
         method5693(var1, this.field4568, new TranslationTextComponent("optimizeWorld.info.converted", this.field4627.method27067()), var7, 40, 10526880);
         method5693(var1, this.field4568, new TranslationTextComponent("optimizeWorld.info.skipped", this.field4627.method27068()), var7, 52, 10526880);
         method5693(var1, this.field4568, new TranslationTextComponent("optimizeWorld.info.total", this.field4627.method27066()), var7, 64, 10526880);
         int var11 = 0;
         UnmodifiableIterator var12 = this.field4627.method27063().iterator();

         while (var12.hasNext()) {
            Class8705 var13 = (Class8705)var12.next();
            int var14 = Class9679.method37767(this.field4627.method27064(var13) * (float)(var8 - var7));
            method5686(var1, var7 + var11, var9, var7 + var11 + var14, var10, field4625.getInt(var13));
            var11 += var14;
         }

         int var15 = this.field4627.method27067() + this.field4627.method27068();
         method5690(var1, this.field4568, var15 + " / " + this.field4627.method27066(), this.field4564 / 2, var9 + 18 + 2, 10526880);
         method5690(
            var1,
            this.field4568,
            Class9679.method37767(this.field4627.method27065() * 100.0F) + "%",
            this.field4564 / 2,
            var9 + (var10 - var9) / 2 - 4,
            10526880
         );
      }

      super.method1923(var1, var2, var3, var4);
   }
}