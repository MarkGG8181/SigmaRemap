package mapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Class8708 {
   private static String[] field39309;
   private static Class2348<Class8907> field39310 = method31404(Minecraft.getInstance().field1338);
   public static Class8907 field39311 = field39310.method9189(Class9495.field44122);
   public static Class8907 field39312 = field39310.method9189(Class9495.field44127);
   public static Class8907 field39313 = field39310.method9189(Class9495.field44178);

   public static void method31403(Class1655 var0) {
      field39310 = method31404(var0);
      field39311 = field39310.method9189(Class9495.field44122);
      field39312 = field39310.method9189(Class9495.field44127);
      field39313 = field39310.method9189(Class9495.field44178);
   }

   public static Class2348<Class8907> method31404(Class1655 var0) {
      return var0 == null
         ? Class8904.method32457().<Class8907>method32453(Class2348.field16106)
         : var0.method6867().<Class8907>method32453(Class2348.field16106);
   }

   public static Class2348<Class8907> method31405() {
      return field39310;
   }

   public static ResourceLocation method31406(Class8907 var0) {
      return method31405().method9181(var0);
   }

   public static int method31407(Class8907 var0) {
      return method31405().method9171(var0);
   }

   public static int method31408(ResourceLocation var0) {
      Class8907 var3 = method31410(var0);
      return method31405().method9171(var3);
   }

   public static Class8507 method31409(ResourceLocation var0) {
      return Class8507.method30138(var0);
   }

   public static Class8907 method31410(ResourceLocation var0) {
      return method31405().method9184(var0);
   }

   public static Set<ResourceLocation> method31411() {
      return method31405().method9190();
   }

   public static List<Class8907> method31412() {
      return Lists.newArrayList(field39310);
   }

   public static List<Class8507> method31413() {
      return method31414(method31411());
   }

   public static List<Class8507> method31414(Collection<ResourceLocation> var0) {
      ArrayList var3 = new ArrayList();

      for (ResourceLocation var5 : var0) {
         Class8507 var6 = Class8507.method30138(var5);
         if (var6 != null) {
            var3.add(var6);
         }
      }

      return var3;
   }

   public static Class8907 method31415(Class1663 var0, BlockPos var1) {
      Class8907 var4 = field39311;
      if (!(var0 instanceof Class1664)) {
         if (var0 instanceof Class1662) {
            var4 = ((Class1662)var0).method7003(var1);
         }
      } else {
         var4 = ((Class1664)var0).method7028(var1);
      }

      return var4;
   }
}
