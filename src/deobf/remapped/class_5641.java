package remapped;

public class class_5641 extends class_9128 {
   private class_8145 field_28608;
   private double field_28607;

   public class_5641() {
      super(class_5664.field_28714, "Smooth", "Automatically aims at players");
      this.method_42010(new class_2748<Float>("Range", "Range value", 4.0F, Float.class, 2.8F, 8.0F, 0.01F));
   }

   @class_9148
   private void method_25540(class_3368 var1) {
      if (this.method_42015()) {
         if (!(field_46692.field_9632.field_41755 > 45.0F)) {
            class_8145 var4 = ((class_2329)this.method_42017()).method_10678(this.method_42002("Range"));
            if (var4 != null) {
               double var5 = (double)(field_46692.field_9632.field_41755 - this.method_25542(var4)[1]);
               double var7 = (double)(field_46692.field_9632.field_41701 - this.method_25542(var4)[0]);
               if (var7 < 0.0) {
                  var7 *= -1.0;
               }

               if (var5 < 0.0) {
                  var5 *= -1.0;
               }

               double var9 = var4.method_37302() - var4.field_41754;
               double var11 = var4.method_37156() - var4.field_41724;
               double var13 = var9 * 2.14 + var11 * 2.14;
               if (var13 < 0.0) {
                  var13 *= -1.0;
               }

               double var15 = 0.05 * (double) MinecraftClient.method_8501() * (var13 + 1.0);
               if (field_46692.field_9632.field_41755 > this.method_25542(var4)[1]) {
                  field_46692.field_9632.field_41755 = (float)((double)field_46692.field_9632.field_41755 - (var15 * var5 / 90.0 + Math.min(0.5, var7)));
               }

               if (field_46692.field_9632.field_41755 < this.method_25542(var4)[1]) {
                  field_46692.field_9632.field_41755 = (float)((double)field_46692.field_9632.field_41755 + var15 * var5 / 90.0 + Math.min(0.5, var7));
               }

               if (field_46692.field_9632.field_41701 > this.method_25542(var4)[0]) {
                  field_46692.field_9632.field_41701 = (float)((double)field_46692.field_9632.field_41701 - (var15 * var7 / 90.0 + Math.min(0.5, var5)));
               }

               if (field_46692.field_9632.field_41701 < this.method_25542(var4)[0]) {
                  field_46692.field_9632.field_41701 = (float)((double)field_46692.field_9632.field_41701 + var15 * var7 / 90.0 + Math.min(0.5, var5));
               }

               field_46692.field_9632.field_29618 = field_46692.field_9632.field_41701;
            }
         }
      }
   }

   public float[] method_25542(class_8145 var1) {
      if (field_46692.field_9662 == null && this.field_28608 != null) {
         this.field_28607 = Math.random();
      }

      this.field_28608 = field_46692.field_9662;
      double var4 = var1.method_37302() - field_46692.field_9632.method_37302() + Math.cos((double)(var1.method_37267() + 90.0F) * Math.PI / 180.0) * 0.14;
      double var6 = var1.method_37309() - 1.6 - this.field_28607 + (double)var1.method_37277() - field_46692.field_9632.method_37309();
      double var8 = var1.method_37156() - field_46692.field_9632.method_37156() + Math.sin((double)(var1.method_37267() + 90.0F) * Math.PI / 180.0) * 0.14;
      double var10 = (double)class_9299.method_42842(var4 * var4 + var8 * var8);
      float var12 = this.method_25541(field_46692.field_9632.field_41701, (float)(Math.atan2(var8, var4) * 180.0 / Math.PI) - 90.0F, 360.0F);
      float var13 = this.method_25541(field_46692.field_9632.field_41755, (float)(-(Math.atan2(var6, var10) * 180.0 / Math.PI)), 360.0F);
      return new float[]{var12, var13};
   }

   private float method_25541(float var1, float var2, float var3) {
      float var6 = class_9299.method_42810(var2 - var1);
      if (var6 > var3) {
         var6 = var3;
      }

      if (var6 < -var3) {
         var6 = -var3;
      }

      return var1 + var6;
   }
}