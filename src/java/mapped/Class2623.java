package mapped;

import java.util.EnumSet;
import java.util.List;

public class Class2623 extends Class2595 {
   private static String[] field16915;
   private int field16916;
   public final Class1097 field16917;

   public Class2623(Class1097 var1) {
      this.field16917 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      if (this.field16916 <= this.field16917.field5055
         && !this.field16917.method3005()
         && !this.field16917.method3250()
         && this.field16917.method5230()
         && this.field16917.method5186() <= 0) {
         List var3 = this.field16917
            .field5024
            .<Class1000>method6772(Class1000.class, this.field16917.method3389().method19663(6.0, 6.0, 6.0), Class1097.method5243());
         return !var3.isEmpty() || !this.field16917.method2943(Class2106.field13731).method32105();
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      return !this.field16917.method3250() && (this.field16917.method5210() || Class1097.method5244(this.field16917).nextInt(600) != 1)
         ? Class1097.method5245(this.field16917).nextInt(2000) != 1
         : false;
   }

   @Override
   public void method10805() {
      if (!this.field16917.method5189() && !this.field16917.method2943(Class2106.field13731).method32105()) {
         Class1097.method5246(this.field16917);
      }
   }

   @Override
   public void method10804() {
      List var3 = this.field16917
         .field5024
         .<Class1000>method6772(Class1000.class, this.field16917.method3389().method19663(8.0, 8.0, 8.0), Class1097.method5243());
      if (!var3.isEmpty() && this.field16917.method2943(Class2106.field13731).method32105()) {
         this.field16917.method4230().method21655((Entity)var3.get(0), 1.2F);
      } else if (!this.field16917.method2943(Class2106.field13731).method32105()) {
         Class1097.method5246(this.field16917);
      }

      this.field16916 = 0;
   }

   @Override
   public void method10807() {
      Class8848 var3 = this.field16917.method2943(Class2106.field13731);
      if (!var3.method32105()) {
         this.field16917.method3302(var3);
         this.field16917.method2944(Class2106.field13731, Class8848.field39973);
         int var4 = !this.field16917.method5210()
            ? Class1097.method5248(this.field16917).nextInt(150) + 10
            : Class1097.method5247(this.field16917).nextInt(50) + 10;
         this.field16916 = this.field16917.field5055 + var4 * 20;
      }

      this.field16917.method5190(false);
   }
}