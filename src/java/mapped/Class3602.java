package mapped;

import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;

import java.util.Comparator;

public class Class3602 implements Comparator<Module> {
   private static String[] field19562;
   public final Class5246 field19563;

   public Class3602(Class5246 var1) {
      this.field19563 = var1;
   }

   public int compare(Module var1, Module var2) {
      int var5 = ResourceRegistry.field38854.method23942(var1.method15991());
      int var6 = ResourceRegistry.field38854.method23942(var2.method15991());
      if (var5 <= var6) {
         return var5 != var6 ? 1 : 0;
      } else {
         return -1;
      }
   }
}
