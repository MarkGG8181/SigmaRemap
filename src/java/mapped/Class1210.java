package mapped;

import net.minecraft.util.text.StringTextComponent;

public class Class1210 extends Class1206 {
   private static String[] field6511;
   public final int field6523;

   public Class1210(int var1, int var2, int var3, int var4, int var5, String var6, Class7192 var7) {
      super(var2, var3, var4, var5, new StringTextComponent(var6), var7);
      this.field6523 = var1;
   }

   public Class1210(int var1, int var2, int var3, int var4, int var5, String var6) {
      this(var1, var2, var3, var4, var5, var6, var0 -> {
      });
   }

   public Class1210(int var1, int var2, int var3, String var4) {
      this(var1, var2, var3, 200, 20, var4, var0 -> {
      });
   }

   public void method5766(String var1) {
      super.method5743(new StringTextComponent(var1));
   }
}
