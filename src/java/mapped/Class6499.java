package mapped;

import java.util.HashSet;
import java.util.Set;

public class Class6499 extends Class6490 {
   private static String[] field28459;

   public Class6499() {
      super(Class3461.class);
   }

   @Override
   public Set<Class8189> method19687(BlockPos var1, Class7380 var2, Class8982 var3) {
      HashSet var6 = new HashSet();
      if (var2.<Class84>method23463(Class3461.field19297) == Class84.field210) {
         Class7380 var7 = var3.method33184(var1.method8311());
         if (var7.method23383() instanceof Class3461) {
            Class7380 var8 = var2.method23465(Class3461.field19295, var7.<Class183>method23463(Class3461.field19295));
            var6.add(new Class8189(var1, var8));
            var6.add(
               new Class8189(
                  var1.method8311(),
                  var7.method23465(Class3461.field19293, var8.<Direction>method23463(Class3461.field19293))
                     .method23465(Class3461.field19294, var8.<Boolean>method23463(Class3461.field19294))
               )
            );
         }
      }

      if (var2.<Class84>method23463(Class3461.field19297) == Class84.field209) {
         Class7380 var9 = var3.method33184(var1.method8313());
         if (var9.method23383() instanceof Class3461) {
            Class7380 var10 = var2.method23465(Class3461.field19293, var9.<Direction>method23463(Class3461.field19293))
               .method23465(Class3461.field19294, var9.<Boolean>method23463(Class3461.field19294));
            var6.add(new Class8189(var1, var10));
            var6.add(new Class8189(var1.method8313(), var9.method23465(Class3461.field19295, var10.<Class183>method23463(Class3461.field19295))));
         }
      }

      return var6;
   }
}
