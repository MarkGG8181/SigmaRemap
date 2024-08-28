package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;

public class Class3271 extends Class3257 implements Class3260 {
   private static final Logger field18771 = LogManager.getLogger();

   public Class3271(Class5643 var1) {
      super(var1);
   }

   public static boolean method11789(Class8848 var0) {
      Class39 var3 = var0.method32142();
      return var3 != null && (var3.method118("LodestoneDimension") || var3.method118("LodestonePos"));
   }

   @Override
   public boolean method11732(Class8848 var1) {
      return method11789(var1) || super.method11732(var1);
   }

   public static Optional<Class8705<Class1655>> method11790(Class39 var0) {
      return Class1655.field8998.parse(Class8063.field34602, var0.method116("LodestoneDimension")).result();
   }

   @Override
   public void method11724(Class8848 var1, Class1655 var2, Entity var3, int var4, boolean var5) {
      if (!var2.field9020 && method11789(var1)) {
         Class39 var8 = var1.method32143();
         if (var8.method118("LodestoneTracked") && !var8.method132("LodestoneTracked")) {
            return;
         }

         Optional var9 = method11790(var8);
         if (var9.isPresent()
            && var9.get() == var2.method6813()
            && var8.method118("LodestonePos")
            && !((Class1657)var2).method6951().method6664(Class4913.field22771, Class8354.method29283(var8.method130("LodestonePos")))) {
            var8.method133("LodestonePos");
         }
      }
   }

   @Override
   public Class2274 method11707(Class5911 var1) {
      BlockPos var4 = var1.method18345();
      Class1655 var5 = var1.method18360();
      if (!var5.method6738(var4).method23448(Class8487.field37129)) {
         return super.method11707(var1);
      } else {
         var5.method6742((PlayerEntity)null, var4, Class6067.field26749, Class2266.field14735, 1.0F, 1.0F);
         PlayerEntity var6 = var1.method18358();
         Class8848 var7 = var1.method18357();
         boolean var8 = !var6.field4919.field29609 && var7.method32179() == 1;
         if (!var8) {
            Class8848 var9 = new Class8848(Class8514.field37905, 1);
            Class39 var10 = !var7.method32141() ? new Class39() : var7.method32142().method79();
            var9.method32148(var10);
            if (!var6.field4919.field29609) {
               var7.method32182(1);
            }

            this.method11791(var5.method6813(), var4, var10);
            if (!var6.field4902.method4045(var9)) {
               var6.method2882(var9, false);
            }
         } else {
            this.method11791(var5.method6813(), var4, var7.method32143());
         }

         return Class2274.method9002(var5.field9020);
      }
   }

   private void method11791(Class8705<Class1655> var1, BlockPos var2, Class39 var3) {
      var3.method99("LodestonePos", Class8354.method29284(var2));
      Class1655.field8998
         .encodeStart(Class8063.field34602, var1)
         .resultOrPartial(field18771::error)
         .ifPresent(var1x -> var3.method99("LodestoneDimension", var1x));
      var3.method115("LodestoneTracked", true);
   }

   @Override
   public String method11720(Class8848 var1) {
      return !method11789(var1) ? super.method11720(var1) : "item.minecraft.lodestone_compass";
   }
}
