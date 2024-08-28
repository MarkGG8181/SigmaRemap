package mapped;

import com.google.common.collect.Iterables;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;

public enum Class1819 {
   field9817("replace") {
      @Override
      public void method8068(Class30 class30, Class9670 class9670, List<Class30> list) throws CommandSyntaxException {
         class9670.method37730(class30, Iterables.getLast(list)::method79);
      }
   },
   field9818("append") {
      @Override
      public void method8068(Class30 var1, Class9670 var2, List<Class30> var3) throws CommandSyntaxException {
         List<Class30> var6 = var2.method37728(var1, Class41::new);
         var6.forEach(var1x -> {
            if (var1x instanceof Class41) {
               var3.forEach(var1xx -> ((Class41)var1x).add(var1xx.method79()));
            }
         });
      }
   },
   field9819("merge") {
      public void method8068(Class30 var1, Class9670 var2, List<Class30> var3) throws CommandSyntaxException {
         List<Class30> var6 = var2.method37728(var1, Class39::new);
         var6.forEach(var1x -> {
            if (var1x instanceof Class39) {
               var3.forEach(var1xx -> {
                  if (var1xx instanceof Class39) {
                     ((Class39)var1x).method140((Class39)var1xx);
                  }
               });
            }
         });
      }
   };

   private final String field9820;
   private static final Class1819[] field9821 = new Class1819[]{field9817, field9818, field9819};

   public abstract void method8068(Class30 var1, Class9670 var2, List<Class30> var3) throws CommandSyntaxException;

   private Class1819(String var3) {
      this.field9820 = var3;
   }

   public static Class1819 method8069(String var0) {
      for (Class1819 var6 : values()) {
         if (var6.field9820.equals(var0)) {
            return var6;
         }
      }

      throw new IllegalArgumentException("Invalid merge strategy" + var0);
   }

   // $VF: synthetic method
   public static String method8070(Class1819 var0) {
      return var0.field9820;
   }
}