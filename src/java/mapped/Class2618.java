package mapped;

import java.util.EnumSet;

public class Class2618 extends Class2595 {
   private static String[] field16893;
   private final Class1012 field16894;
   private PlayerEntity field16895;
   private final Class1655 field16896;
   private final float field16897;
   private int field16898;
   private final Class8522 field16899;

   public Class2618(Class1012 var1, float var2) {
      this.field16894 = var1;
      this.field16896 = var1.field5024;
      this.field16897 = var2;
      this.field16899 = new Class8522().method30203((double)var2).method30204().method30205().method30207();
      this.method10809(EnumSet.<Class2240>of(Class2240.field14658));
   }

   @Override
   public boolean method10803() {
      this.field16895 = this.field16896.method7188(this.field16899, this.field16894);
      return this.field16895 != null ? this.method10825(this.field16895) : false;
   }

   @Override
   public boolean method10806() {
      if (this.field16895.method3066()) {
         return this.field16894.method3277(this.field16895) > (double)(this.field16897 * this.field16897)
            ? false
            : this.field16898 > 0 && this.method10825(this.field16895);
      } else {
         return false;
      }
   }

   @Override
   public void method10804() {
      this.field16894.method4385(true);
      this.field16898 = 40 + this.field16894.method3013().nextInt(40);
   }

   @Override
   public void method10807() {
      this.field16894.method4385(false);
      this.field16895 = null;
   }

   @Override
   public void method10805() {
      this.field16894
         .method4227()
         .method28042(this.field16895.getPosX(), this.field16895.method3442(), this.field16895.getPosZ(), 10.0F, (float)this.field16894.method4259());
      this.field16898--;
   }

   private boolean method10825(PlayerEntity var1) {
      for (Class79 var7 : Class79.values()) {
         Class8848 var8 = var1.method3094(var7);
         if (this.field16894.method4393() && var8.method32107() == Class8514.field37935) {
            return true;
         }

         if (this.field16894.method4381(var8)) {
            return true;
         }
      }

      return false;
   }
}
