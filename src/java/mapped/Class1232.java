package mapped;

import net.minecraft.client.AbstractOption;
import net.minecraft.client.GameSettings;
import net.minecraft.client.gui.widget.Widget;

import java.util.List;
import java.util.Optional;

public class Class1232 extends Class1234 implements Class1233 {
   private static String[] field6580;
   private final Class5807 field6581;

   public Class1232(GameSettings var1, int var2, int var3, int var4, int var5, Class5807 var6) {
      super(var1, var2, var3, var4, var5, (double)((float)var6.method18083(var6.getValue(var1))));
      this.field6581 = var6;
      this.method5813();
   }

   @Override
   public void method5812() {
      this.field6581.method18089(this.field6582, this.field6581.method18084(this.field6584));
      this.field6582.saveOptions();
   }

   @Override
   public void method5813() {
      this.setMessage(this.field6581.method18091(this.field6582));
   }

   @Override
   public Optional<List<Class9125>> method5810() {
      return this.field6581.method17951();
   }

   public static int method5814(Widget var0) {
      return var0.field6475;
   }

   public static int method5815(Widget var0) {
      return var0.field6476;
   }

   public AbstractOption method5811() {
      return this.field6581;
   }
}
