package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.unmapped.Class4305;

public class Class4261 extends Class4247 {
   private static String[] field20672;
   public Class7312 field20673;

   public Class4261(Class4305 var1, String var2, int var3, int var4, int var5, int var6, boolean var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   public Class4261(Class4305 var1, String var2, int var3, int var4, int var5, int var6, boolean var7, Class7312 var8) {
      super(var1, var2, var3, var4, var5, var6, var7);
      this.field20673 = var8;
   }

   public Class4261(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Class6387 var7, boolean var8, Class7312 var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8);
      this.field20673 = var9;
   }

   public Class4261(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Class6387 var7, String var8, boolean var9, Class7312 var10) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      this.field20673 = var10;
   }

   public Class4261(
           Class4305 var1, String var2, int var3, int var4, int var5, int var6, Class6387 var7, String var8, ClientResource var9, boolean var10, Class7312 var11
   ) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      this.field20673 = var11;
   }

   @Override
   public void method13028(int var1, int var2) {
      this.field20673.method23108();
   }

   @Override
   public void method13027(float var1) {
      this.method13086().method23109(this.method13263(), this.method13265(), this.method13267(), this.method13269(), var1);
      super.method13027(var1);
   }

   public Class7312 method13086() {
      return this.field20673;
   }

   public void method13087(Class7312 var1) {
      this.field20673 = var1;
   }
}