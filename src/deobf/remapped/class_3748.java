package remapped;

public class class_3748 implements class_2995 {
   private static String[] field_18323;
   private final MinecraftClient field_18324;

   public class_3748(MinecraftClient var1) {
      this.field_18324 = var1;
   }

   @Override
   public void method_13698(class_7966 var1, class_2565 var2, double var3, double var5, double var7) {
      BlockPos var11 = this.field_18324.thePlayer.method_37075();
      World var12 = this.field_18324.thePlayer.world;
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.color4f(0.0F, 1.0F, 0.0F, 0.75F);
      RenderSystem.method_16354();
      RenderSystem.method_16484(6.0F);

      for (BlockPos var14 : BlockPos.method_6076(var11.method_6104(-10, -10, -10), var11.method_6104(10, 10, 10))) {
         class_4774 var15 = var12.method_28258(var14);
         if (var15.method_22007(class_6503.field_33094)) {
            double var16 = (double)((float)var14.getY() + var15.method_22008(var12, var14));
            class_3372.method_15562(
               new Box(
                     (double)((float)var14.getX() + 0.01F),
                     (double)((float)var14.getY() + 0.01F),
                     (double)((float)var14.getZ() + 0.01F),
                     (double)((float)var14.getX() + 0.99F),
                     var16,
                     (double)((float)var14.getZ() + 0.99F)
                  )
                  .method_18918(-var3, -var5, -var7),
               1.0F,
               1.0F,
               1.0F,
               0.2F
            );
         }
      }

      for (BlockPos var19 : BlockPos.method_6076(var11.method_6104(-10, -10, -10), var11.method_6104(10, 10, 10))) {
         class_4774 var20 = var12.method_28258(var19);
         if (var20.method_22007(class_6503.field_33094)) {
            class_3372.method_15553(
               String.valueOf(var20.method_21996()),
               (double)var19.getX() + 0.5,
               (double)((float)var19.getY() + var20.method_22008(var12, var19)),
               (double)var19.getZ() + 0.5,
               -16777216
            );
         }
      }

      RenderSystem.method_16432();
      RenderSystem.disableBlend();
   }
}
