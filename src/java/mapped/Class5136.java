package mapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class Class5136 implements Class5119 {
   private static String[] field23344;
   private final Map<BlockPos, Class9180> field23345 = Maps.newHashMap();

   public void method15907(BlockPos var1, int var2, String var3, int var4) {
      this.field23345.put(var1, new Class9180(var2, var3, Util.method38487() + (long)var4));
   }

   @Override
   public void method15814() {
      this.field23345.clear();
   }

   @Override
   public void method15813(Class9332 var1, Class7733 var2, double var3, double var5, double var7) {
      long var11 = Util.method38487();
      this.field23345.entrySet().removeIf(var2x -> var11 > var2x.getValue().field42161);
      this.field23345.forEach(this::method15908);
   }

   private void method15908(BlockPos var1, Class9180 var2) {
      RenderSystem.pushMatrix();
      RenderSystem.enableBlend();
      RenderSystem.method27836(Class2339.field15997, Class1981.field12932, Class2339.field15990, Class1981.field12936);
      RenderSystem.method27889(0.0F, 1.0F, 0.0F, 0.75F);
      RenderSystem.method27862();
      Class8023.method27456(var1, 0.02F, var2.method34331(), var2.method34332(), var2.method34333(), var2.method34334());
      if (!var2.field42160.isEmpty()) {
         double var5 = (double)var1.method8304() + 0.5;
         double var7 = (double)var1.getY() + 1.2;
         double var9 = (double)var1.method8306() + 0.5;
         Class8023.method27462(var2.field42160, var5, var7, var9, -1, 0.01F, true, 0.0F, true);
      }

      RenderSystem.method27861();
      RenderSystem.disableBlend();
      RenderSystem.popMatrix();
   }
}