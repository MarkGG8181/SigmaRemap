package remapped;

public class class_8318 extends class_9128 {
   private int field_42613;
   private double field_42614;
   private double field_42612;

   public class_8318() {
      super(class_5664.field_28716, "Cubecraft", "Speed for Cubecraft");
      this.method_42010(new class_2826("Mode", "Mode", 0, "Basic", "Hop", "YPort"));
      this.method_42010(new class_2748<Float>("Speed", "Speed value", 0.75F, Float.class, 0.1F, 1.0F, 0.01F));
      this.method_42010(new class_8563("AutoJump", "Automatically jumps for you.", false));
   }

   @Override
   public void method_42006() {
      this.field_42613 = 0;
      this.field_42612 = -1.0;
   }

   @Override
   public void method_42020() {
      field_46692.field_9616.field_32603 = 1.0F;
      class_8865.method_40776(0.2);
      if (field_46692.field_9632.method_37098().field_7333 > 0.0) {
         class_314.method_1408(-0.078);
      }
   }

   @class_9148
   public void method_38349(class_7767 var1) {
      if (this.method_42015()
         && !class_727.method_3328().method_3298().method_847(class_3709.class).method_42015()
         && !class_314.method_1437(field_46692.field_9632)) {
         String var4 = this.method_42016("Mode");
         switch (var4) {
            case "Basic":
               this.field_42613++;
               this.field_42614 = 0.27;
               field_46692.field_9616.field_32603 = 0.7F;
               if (class_314.method_1413(field_46692.field_9632, 0.01F)) {
                  if (this.method_42007("AutoJump")) {
                     field_46692.field_9632.method_26595();
                     var1.method_35235(field_46692.field_9632.method_37098().field_7333);
                     class_8865.method_40777(var1, this.field_42614);
                  }

                  if (this.field_42613 == 1) {
                     this.field_42614 = (double)this.method_42002("Speed") * 2.4;
                  } else if (this.field_42613 == 2) {
                     field_46692.field_9616.field_32603 = 1.0F;
                     this.field_42614 = 0.26;
                  } else if (this.field_42613 >= 3) {
                     this.field_42613 = 0;
                     this.field_42614 = 0.26;
                  }
               } else {
                  if (field_46692.field_9616.field_32603 == 0.7F) {
                     field_46692.field_9616.field_32603 = 1.0F;
                  }

                  if (this.field_42613 == 1) {
                     this.field_42614 = 0.27;
                     if (var1.method_35236() > 0.0) {
                        this.field_42614 = 2.0;
                     }
                  } else if (this.field_42613 > 1) {
                     this.field_42613 = 0;
                  }
               }

               class_8865.method_40777(var1, this.field_42614);
               break;
            case "Hop":
               if (!field_46692.field_9632.field_41774 || !class_314.method_1413(field_46692.field_9632, 0.001F) || !class_8865.method_40772()) {
                  this.field_42613++;
                  if (this.field_42613 == 1) {
                     this.field_42614 = 0.4 + (double)class_8865.method_40770() * 0.1;
                  }

                  this.field_42614 -= 0.015;
                  if (field_46692.field_9577.field_45434.field_30024) {
                     this.field_42614 -= 0.07;
                  }

                  this.field_42614 = Math.max(this.field_42614, 0.2);
                  class_8865.method_40777(var1, this.field_42614);
               } else if (this.method_42007("AutoJump")) {
                  field_46692.field_9632.method_26595();
                  var1.method_35235(field_46692.field_9632.method_37098().field_7333);
                  class_8865.method_40777(var1, this.field_42614);
               }
               break;
            case "YPort":
               if (field_46692.field_9632.field_41726) {
                  if (class_314.method_1434()) {
                     var1.method_35235(0.53000000000001);
                     class_8865.method_40777(var1, 3.67 * (double)this.method_42002("Speed"));
                     this.field_42613 = 0;
                  }

                  this.field_42612 = field_46692.field_9632.method_37309();
                  if (!class_727.method_3328().method_3298().method_847(class_6803.class).method_42015()) {
                     field_46692.field_9616.field_32603 = 1.0F;
                  }
               } else {
                  field_46692.field_9616.field_32603 = 1.0F - this.method_42002("Speed") * 0.13F;
                  if (this.field_42613 == 0 && var1.method_35236() == 0.44100000858307864) {
                     this.field_42613 = 1;
                     class_8865.method_40777(var1, 0.286);
                     var1.method_35235(-0.265);
                     class_314.method_1408(var1.method_35236());
                  } else if (this.field_42613 == 1) {
                     this.field_42613 = -1;
                     class_8865.method_40777(var1, 0.285);
                  }
               }
         }
      }
   }

   @class_9148
   public void method_38351(class_1711 var1) {
      if (this.method_42015() && !(this.field_42612 < 0.0) && this.method_42016("Mode").equals("YPort")) {
         if (field_46692.field_9632.field_41726 && class_314.method_1413(field_46692.field_9632, 0.001F)) {
            this.field_42612 = field_46692.field_9632.method_37309();
         }

         field_46692.field_9632.field_41736.field_7333 = this.field_42612;
         field_46692.field_9632.field_41713 = this.field_42612;
         field_46692.field_9632.field_3864 = this.field_42612;
         field_46692.field_9632.field_41698 = this.field_42612;
         if (class_8865.method_40772()) {
            field_46692.field_9632.field_3859 = 0.099999994F;
         }
      }
   }

   @class_9148
   public void method_38350(class_2911 var1) {
      if (this.method_42015()) {
         var1.method_13313(0.4);
         this.field_42614 = 0.6 + (double)class_8865.method_40770() * 0.1;
         this.field_42613 = 0;
         var1.method_13315(this.field_42614);
      }
   }
}
