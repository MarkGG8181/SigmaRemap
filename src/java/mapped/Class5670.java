package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;

public class Class5670 extends Class5661<Class1100, Class2896> {
   private static final ResourceLocation field25034 = new ResourceLocation("textures/entity/illager/vex.png");
   private static final ResourceLocation field25035 = new ResourceLocation("textures/entity/illager/vex_charging.png");

   public Class5670(EntityRendererManager var1) {
      super(var1, new Class2896(), 0.3F);
   }

   public int method17858(Class1100 var1, BlockPos var2) {
      return 15;
   }

   public ResourceLocation method17843(Class1100 var1) {
      return !var1.method5275() ? field25034 : field25035;
   }

   public void method17857(Class1100 var1, MatrixStack var2, float var3) {
      var2.scale(0.4F, 0.4F, 0.4F);
   }
}
