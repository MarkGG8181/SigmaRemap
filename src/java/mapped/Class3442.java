package mapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class Class3442 extends Class3209 {
   private static String[] field19245;
   private final Class3209 field19246;
   private static final Map<Class3209, Class3209> field19247 = Maps.newIdentityHashMap();

   public Class3442(Class3209 var1, Class7929 var2) {
      super(var2);
      this.field19246 = var1;
      field19247.put(var1, this);
   }

   public Class3209 method12118() {
      return this.field19246;
   }

   public static boolean method12119(Class7380 var0) {
      return field19247.containsKey(var0.method23383());
   }

   private void method12120(Class1657 var1, BlockPos var2) {
      Class1107 var5 = Class8992.field41077.method33215(var1);
      var5.method3273((double)var2.method8304() + 0.5, (double)var2.getY(), (double)var2.method8306() + 0.5, 0.0F, 0.0F);
      var1.method6916(var5);
      var5.method4239();
   }

   @Override
   public void method11965(Class7380 var1, Class1657 var2, BlockPos var3, Class8848 var4) {
      super.method11965(var1, var2, var3, var4);
      if (var2.method6789().method17135(Class5462.field24228) && Class7858.method26311(Class8122.field34916, var4) == 0) {
         this.method12120(var2, var3);
      }
   }

   @Override
   public void method11560(Class1655 var1, BlockPos var2, Class7782 var3) {
      if (var1 instanceof Class1657) {
         this.method12120((Class1657)var1, var2);
      }
   }

   public static Class7380 method12121(Class3209 var0) {
      return field19247.get(var0).method11579();
   }
}
