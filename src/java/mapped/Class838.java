package mapped;

import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class838 extends Screen {
   private static String[] field4628;
   public List<Class1197> field4629 = this.field4566;
   public Class9834 field4630 = Minecraft.getInstance().field1294;
   public boolean field4631 = false;

   public Class838(ITextComponent var1) {
      super(var1);
   }

   public void method2563(Class1197 var1) {
   }

   public void method2564(Class1197 var1) {
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      boolean var8 = super.method1958(var1, var3, var5);
      this.field4631 = true;
      Class1197 var9 = method2566((int)var1, (int)var3, this.field4629);
      if (var9 != null && var9.field6482) {
         if (var5 == 1 && var9 instanceof Class1230) {
            Class1230 var10 = (Class1230)var9;
            if (var10.method5811() == Class5805.field25344) {
               var9.method5739(super.field4562.method1546());
            }
         }

         if (var5 != 0) {
            if (var5 == 1) {
               this.method2564(var9);
            }
         } else {
            this.method2563(var9);
         }

         return true;
      } else {
         return var8;
      }
   }

   @Override
   public boolean method2565(double var1, double var3, int var5) {
      if (!this.field4631) {
         return false;
      } else {
         this.field4631 = false;
         this.method5532(false);
         return this.method5533() != null && this.method5533().method2565(var1, var3, var5) ? true : super.method2565(var1, var3, var5);
      }
   }

   @Override
   public boolean method2516(double var1, double var3, int var5, double var6, double var8) {
      return this.field4631 ? super.method2516(var1, var3, var5, var6, var8) : false;
   }

   public static Class1197 method2566(int var0, int var1, List<Class1197> var2) {
      for (int var5 = 0; var5 < var2.size(); var5++) {
         Class1197 var6 = (Class1197)var2.get(var5);
         if (var6.field6483) {
            int var7 = Class7540.method24650(var6);
            int var8 = Class7540.method24651(var6);
            if (var0 >= var6.field6477 && var1 >= var6.field6478 && var0 < var6.field6477 + var7 && var1 < var6.field6478 + var8) {
               return var6;
            }
         }
      }

      return null;
   }

   public static void method2567(Class9332 var0, Class9834 var1, Class9125 var2, int var3, int var4, int var5) {
      var1.method38802(var0, var2, (float)(var3 - var1.method38822(var2) / 2), (float)var4, var5);
   }
}