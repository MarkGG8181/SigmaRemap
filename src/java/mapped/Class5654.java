package mapped;

import net.minecraft.util.ResourceLocation;

public class Class5654 extends Class5651<Class1048, Class2805<Class1048>> {
   private static final ResourceLocation field25006 = new ResourceLocation("textures/entity/dolphin.png");

   public Class5654(EntityRendererManager var1) {
      super(var1, new Class2805<Class1048>(), 0.7F);
      this.addLayer(new Class259(this));
   }

   public ResourceLocation method17843(Class1048 var1) {
      return field25006;
   }
}
