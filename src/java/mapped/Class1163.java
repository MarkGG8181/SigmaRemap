package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class1163 extends Class1161 {
   private static String[] field6318;
   public final Class806 field6319;

   private Class1163(Class806 var1) {
      super(var1, null);
      this.field6319 = var1;
   }

   @Override
   public void method5544(Class9332 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.method5563(var1, var2, var4, var3, var7, var8);
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      Class806.method2111(this.field6319, true);
      return true;
   }

   private void method5563(Class9332 var1, int var2, int var3, int var4, int var5, int var6) {
      int var9 = var4 + 8;
      byte var10 = 0;
      boolean var11 = false;
      if (var3 <= var5 && var5 <= (int)Class806.method2156(this.field6319).method6044() && var4 <= var6 && var6 <= var4 + 32) {
         var11 = true;
      }

      int var12 = 8388479;
      if (var11 && !this.field6319.method2012()) {
         var12 = 6077788;
      }

      for (ITextComponent var14 : Class806.method2166()) {
         Class1193.method5691(var1, Class806.method2167(this.field6319), var14, this.field6319.field4564 / 2, var9 + var10, var12);
         var10 += 10;
      }
   }

   // $VF: synthetic method
   public Class1163(Class806 var1, Class375 var2) {
      this(var1);
   }
}