package remapped;

public class class_6865 extends class_9128 {
   private double field_35374;
   private float field_35375;
   private float field_35370;
   private boolean field_35371;
   private float field_35372 = 1.0F;

   public class_6865() {
      super(class_5664.field_28716, "Legit", "Legit Sprint jumping.");
      this.method_42010(new class_8563("Sprint", "Sprints when walking", true));
      this.method_42010(new class_8563("AutoJump", "Automatically jumps for you.", true));
   }

   @class_9148
   public void method_31490(class_7767 var1) {
      if (this.method_42015()) {
         if (field_46692.field_9632.field_41726
            && field_46692.field_9632.field_41774
            && (field_46692.field_9632.field_29673 != 0.0F || field_46692.field_9632.field_29676 != 0.0F)
            && this.method_42007("AutoJump")) {
            field_46692.field_9632.method_26595();
            var1.method_35235(field_46692.field_9632.method_37098().field_7333);
         }

         double var4 = var1.method_35233().field_7333;
         var1.method_35233().field_7333 = 0.0;
         double var6 = var1.method_35233().method_6217();
         var1.method_35233().field_7333 = var4;
         this.field_35374 = var6;
         float var8 = class_8865.method_40773()[1];
         float var9 = class_8865.method_40773()[2];
         float var10 = class_8865.method_40773()[0];
         if (var8 == 0.0F && var9 == 0.0F) {
            var1.method_35232(0.0);
            var1.method_35229(0.0);
         }

         double var11 = Math.cos(Math.toRadians((double)var10));
         double var13 = Math.sin(Math.toRadians((double)var10));
         this.field_35374 = this.field_35374 * (double)this.field_35372;
         var1.method_35232((double)var8 * this.field_35374 * var11 + (double)var9 * this.field_35374 * var13 + (double)this.field_35375);
         var1.method_35229((double)var8 * this.field_35374 * var13 - (double)var9 * this.field_35374 * var11 + (double)this.field_35370);
         field_46692.field_9632.method_37098().field_7336 = var1.method_35234();
         field_46692.field_9632.method_37098().field_7333 = var1.method_35236();
         if (this.field_35375 != 0.0F || this.field_35370 != 0.0F) {
            this.field_35375 = (float)((double)this.field_35375 * 0.85);
            this.field_35370 = (float)((double)this.field_35370 * 0.85);
            this.field_35372 = Math.min(1.0F, this.field_35372 + 0.1F);
         }

         if (field_46692.field_9632.field_41726 && !this.field_35371) {
            this.field_35375 = 0.0F;
            this.field_35370 = 0.0F;
            this.field_35372 = Math.min(1.0F, this.field_35372 + 0.33F);
         }

         this.field_35371 = false;
      }
   }

   @class_9148
   private void method_31489(class_139 var1) {
      if (this.method_42015()) {
         if (field_46692.field_9632 != null && var1.method_557() instanceof class_4548) {
            class_4548 var4 = (class_4548)var1.method_557();
            if (var4.method_21093() == field_46692.field_9632.method_37145()) {
               this.field_35375 = this.field_35375 + (float)var4.field_22171 / 8000.0F;
               this.field_35370 = this.field_35370 + (float)var4.field_22167 / 8000.0F;
               this.field_35371 = true;
               this.field_35372 = 0.0F;
            }
         }
      }
   }
}
