package remapped;

import org.lwjgl.glfw.GLFW;

public class class_5787 extends class_9128 {
   private boolean field_29226;

   public class_5787() {
      super(class_5664.field_28710, "InvMove", "Move freely in the inventory");
      this.method_42010(new class_8563("AACP", "Bypass for AACP", true));
      this.field_29226 = false;
   }

   @class_9148
   private void method_26179(class_6435 var1) {
      if (this.method_42015()) {
         if (var1.method_29384() == field_46692.field_9577.field_45575.field_30027.field_17800 && field_46692.field_9632.method_37321()) {
            field_46692.method_8614().method_4813(new class_2317(field_46692.field_9632, class_4127.field_20100));
         }
      }
   }

   @class_9148
   private void method_26177(class_2157 var1) {
      if (this.method_42015()) {
         if (this.field_29226 && var1.method_10047() instanceof class_2317 && this.method_42007("AACP")) {
            class_2317 var4 = (class_2317)var1.method_10047();
            if (var4.method_10650() == class_4127.field_20099) {
               var1.method_29715(true);
            }
         }
      }
   }

   @class_9148
   private void method_26178(class_5596 var1) {
      if (this.method_42015()) {
         if (this.method_42007("AACP")) {
            boolean var4 = !(field_46692.field_9623 instanceof class_3431) || !(field_46692.field_9623 instanceof class_2141);
            if (this.field_29226 && !var4) {
               this.field_29226 = !this.field_29226;
               if (field_46692.field_9632.method_37321()) {
                  field_46692.method_8614().method_4813(new class_2317(field_46692.field_9632, class_4127.field_20099));
               }
            } else if (!this.field_29226 && var4) {
               this.field_29226 = !this.field_29226;
               if (field_46692.field_9632.method_37321()) {
                  field_46692.method_8614().method_4813(new class_2317(field_46692.field_9632, class_4127.field_20100));
               }
            }
         }

         if (field_46692.field_9623 instanceof class_2208 || SigmaMainClass.method_3328().method_3310().method_25291() <= 1) {
            if (field_46692.field_9623 instanceof class_5766) {
               return;
            }

            if (field_46692.field_9623 instanceof class_2713) {
               return;
            }

            if (field_46692.field_9623 instanceof class_9743) {
               return;
            }

            if (field_46692.field_9623 instanceof class_2546) {
               class_2546 var9 = (class_2546)field_46692.field_9623;
               if (var9.method_11595() == 5) {
                  return;
               }
            }

            if (SigmaMainClass.method_3328().method_3299().method_31001() != null && SigmaMainClass.method_3328().method_3299().method_31001().method_32121()) {
               for (class_5916 var14 : MinecraftClient.getInstance().field_9577.field_45395) {
                  var14.field_30024 = false;
               }

               return;
            }

            for (class_5916 var7 : field_46692.field_9577.field_45395) {
               if (var7.field_30027.field_17800 > 0
                  && field_46692.field_9577.field_45560.field_30027.field_17800 != var7.field_30027.field_17800
                  && var7.field_30027.field_17800 > 4) {
                  int var8 = GLFW.glfwGetKey(field_46692.field_9602.method_43181(), var7.field_30027.field_17800);
                  var7.field_30024 = var8 == 1;
               }
            }
         }
      }
   }
}