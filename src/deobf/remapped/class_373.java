package remapped;

public class class_373 extends class_2255<class_945> {
   private static String[] field_1519;

   public class_373(class_3569 var1) {
      super(var1);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void method_1835(class_945 var1, float var2, class_7966 var3, class_2565 var4, int var5, int var6) {
      if (MinecraftClient.getInstance().thePlayer.method_3184() || MinecraftClient.getInstance().thePlayer.method_37221()) {
         BlockPos var9 = var1.method_4116();
         BlockPos var10 = var1.method_4096();
         if (var10.getX() >= 1
            && var10.getY() >= 1
            && var10.getZ() >= 1
            && (var1.method_4085() == class_589.field_3417 || var1.method_4085() == class_589.field_3414)) {
            double var11 = (double)var9.getX();
            double var13 = (double)var9.getZ();
            double var15 = (double)var9.getY();
            double var17 = var15 + (double)var10.getY();
            double var19;
            double var21;
            switch (var1.method_4089()) {
               case field_46148:
                  var19 = (double)var10.getX();
                  var21 = (double)(-var10.getZ());
                  break;
               case field_46144:
                  var19 = (double)(-var10.getX());
                  var21 = (double)var10.getZ();
                  break;
               default:
                  var19 = (double)var10.getX();
                  var21 = (double)var10.getZ();
            }

            double var23;
            double var25;
            double var27;
            double var29;
            switch (var1.method_4120()) {
               case field_34334:
                  var23 = var21 < 0.0 ? var11 : var11 + 1.0;
                  var25 = var19 < 0.0 ? var13 + 1.0 : var13;
                  var27 = var23 - var21;
                  var29 = var25 + var19;
                  break;
               case field_34338:
                  var23 = var19 < 0.0 ? var11 : var11 + 1.0;
                  var25 = var21 < 0.0 ? var13 : var13 + 1.0;
                  var27 = var23 - var19;
                  var29 = var25 - var21;
                  break;
               case field_34335:
                  var23 = var21 < 0.0 ? var11 + 1.0 : var11;
                  var25 = var19 < 0.0 ? var13 : var13 + 1.0;
                  var27 = var23 + var21;
                  var29 = var25 - var19;
                  break;
               default:
                  var23 = var19 < 0.0 ? var11 + 1.0 : var11;
                  var25 = var21 < 0.0 ? var13 + 1.0 : var13;
                  var27 = var23 + var19;
                  var29 = var25 + var21;
            }

            float var31 = 1.0F;
            float var32 = 0.9F;
            float var33 = 0.5F;
            class_7907 var34 = var4.method_11645(RenderLayer.method_16744());
            if (var1.method_4085() == class_589.field_3417 || var1.method_4091()) {
               WorldRenderer.method_20013(var3, var34, var23, var15, var25, var27, var17, var29, 0.9F, 0.9F, 0.9F, 1.0F, 0.5F, 0.5F, 0.5F);
            }

            if (var1.method_4085() == class_589.field_3417 && var1.method_4111()) {
               this.method_1836(var1, var34, var9, true, var3);
               this.method_1836(var1, var34, var9, false, var3);
            }
         }
      }
   }

   private void method_1836(class_945 var1, class_7907 var2, BlockPos var3, boolean var4, class_7966 var5) {
      World var8 = var1.method_17402();
      BlockPos var9 = var1.method_17399();
      BlockPos var10 = var9.method_6105(var3);

      for (BlockPos var12 : BlockPos.method_6076(var10, var10.method_6105(var1.method_4096()).method_6104(-1, -1, -1))) {
         class_2522 var13 = var8.method_28262(var12);
         boolean var14 = var13.method_8345();
         boolean var15 = var13.method_8350(class_4783.field_23227);
         if (var14 || var15) {
            float var16 = !var14 ? 0.0F : 0.05F;
            double var17 = (double)((float)(var12.getX() - var9.getX()) + 0.45F - var16);
            double var19 = (double)((float)(var12.getY() - var9.getY()) + 0.45F - var16);
            double var21 = (double)((float)(var12.getZ() - var9.getZ()) + 0.45F - var16);
            double var23 = (double)((float)(var12.getX() - var9.getX()) + 0.55F + var16);
            double var25 = (double)((float)(var12.getY() - var9.getY()) + 0.55F + var16);
            double var27 = (double)((float)(var12.getZ() - var9.getZ()) + 0.55F + var16);
            if (!var4) {
               if (!var14) {
                  WorldRenderer.method_20013(var5, var2, var17, var19, var21, var23, var25, var27, 1.0F, 0.25F, 0.25F, 1.0F, 1.0F, 0.25F, 0.25F);
               } else {
                  WorldRenderer.method_20013(var5, var2, var17, var19, var21, var23, var25, var27, 0.5F, 0.5F, 1.0F, 1.0F, 0.5F, 0.5F, 1.0F);
               }
            } else {
               WorldRenderer.method_20013(var5, var2, var17, var19, var21, var23, var25, var27, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            }
         }
      }
   }

   public boolean method_1837(class_945 var1) {
      return true;
   }
}
