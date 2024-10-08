package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;

public class Class5692 extends Class5651<Class1042, Class2802<Class1042>> {
   private static final ResourceLocation field25061 = new ResourceLocation("textures/entity/villager/villager.png");

   public Class5692(EntityRendererManager var1, IReloadableResourceManager var2) {
      super(var1, new Class2802<Class1042>(0.0F), 0.5F);
      this.addLayer(new Class235<Class1042, Class2802<Class1042>>(this));
      this.addLayer(new Class218<Class1042, Class2802<Class1042>>(this, var2, "villager"));
      this.addLayer(new Class239<Class1042, Class2802<Class1042>>(this));
   }

   public ResourceLocation method17843(Class1042 var1) {
      return field25061;
   }

   public void method17857(Class1042 var1, MatrixStack var2, float var3) {
      float var6 = 0.9375F;
      if (!var1.isChild()) {
         this.shadowSize = 0.5F;
      } else {
         var6 = (float)((double)var6 * 0.5);
         this.shadowSize = 0.25F;
      }

      var2.scale(var6, var6, var6);
   }
}
