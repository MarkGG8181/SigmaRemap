package remapped;

public class ViperMCFly extends Module {
   private int field_38901;
   private int field_38899;
   private double field_38902;
   private double field_38903;
   private boolean field_38904;

   public ViperMCFly() {
      super(Category.MOVEMENT, "ViperMC", "A fly for ViperMC");
      this.addSetting(new FloatSetting<Float>("Speed", "Fly speed", 4.0F, Float.class, 0.2F, 6.0F, 0.1F));
   }

   @Override
   public void onEnable() {
      this.field_38902 = client.thePlayer.method_37309();
      this.field_38901 = 0;
      if (!client.gameOptions.keySneak.isKeyDown()) {
         if (!client.gameOptions.keySneak.isKeyDown()) {
            this.field_38904 = false;
         }
      } else {
         client.gameOptions.keySneak.pressed = false;
         this.field_38904 = true;
      }
   }

   @Override
   public void onDisable() {
      class_8865.method_40776(0.0);
      if (client.thePlayer.method_37098().field_7333 > 0.0) {
         class_314.method_1408(-0.0789);
      }
   }

   @EventListen
   private void method_34659(class_6435 var1) {
      if (this.method_42015()) {
         if (var1.method_29384() == client.gameOptions.keySneak.field_30027.field_17800) {
            var1.method_29715(true);
            this.field_38904 = true;
         }
      }
   }

   @EventListen
   private void method_34658(class_307 var1) {
      if (this.method_42015()) {
         if (var1.method_1364() == client.gameOptions.keySneak.field_30027.field_17800) {
            var1.method_29715(true);
            this.field_38904 = false;
         }
      }
   }

   @EventListen
   @class_7664
   public void method_34660(class_7767 var1) {
      if (this.method_42015()) {
         double var4 = (double)this.getFloatValueByName("Speed");
         if (this.field_38901 <= 0) {
            if (this.field_38901 != -1) {
               if (this.field_38901 == 0) {
                  if (!client.gameOptions.keyJump.isKeyDown() && var1.method_35236() > 0.0) {
                     var1.method_35235(-class_8865.method_40786());
                  }

                  class_314.method_1408(var1.method_35236());
                  class_8865.method_40777(var1, class_8865.method_40775());
               }
            } else {
               if (client.gameOptions.keyJump.isKeyDown()) {
                  var1.method_35235(!this.field_38904 ? var4 / 2.0 : class_8865.method_40786());
                  this.field_38903 = this.field_38902;
                  this.field_38902 = !this.field_38904 ? client.thePlayer.method_37309() + var1.method_35236() : this.field_38902;
               } else {
                  var1.method_35235(this.field_38904 && !class_314.method_1413(client.thePlayer, 0.01F) ? -var4 / 2.0 : class_8865.method_40786());
                  this.field_38903 = this.field_38902;
                  this.field_38902 = this.field_38904 && !class_314.method_1413(client.thePlayer, 0.01F)
                     ? client.thePlayer.method_37309() + var1.method_35236()
                     : this.field_38902;
               }

               class_314.method_1408(var1.method_35236());
               class_8865.method_40777(var1, var4);
            }
         } else {
            var1.method_35235(0.0);
            class_8865.method_40777(var1, 0.0);
         }
      }
   }

   @EventListen
   public void method_34664(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         this.field_38901++;
         if (this.field_38901 != 2) {
            if (this.field_38901 > 2) {
               if (this.field_38901 >= 20 && this.field_38901 % 20 == 0) {
                  var1.method_6455(-150.0 - Math.random() * 150.0);
                  this.field_38899 += 2;
               } else {
                  var1.method_29715(true);
               }
            }
         } else {
            var1.method_6455(-150.0 - Math.random() * 150.0);
            this.field_38899 += 2;
         }

         var1.method_6451(true);
         var1.method_6444(true);
      }
   }

   @EventListen
   public void method_34661(PacketEvent var1) {
      if (this.method_42015()) {
         Packet var4 = var1.method_557();
         if (!(var4 instanceof class_509)) {
            if (var4 instanceof class_5182) {
               class_5182 var5 = (class_5182)var4;
               String var6 = var5.method_23768().getString();
               if (this.field_38899 > 0 && (var6.contains("Now leaving: §") || var6.contains("Now entering: §"))) {
                  this.field_38899--;
                  var1.method_29715(true);
               }
            }
         } else {
            class_509 var7 = (class_509)var4;
            if (this.field_38901 >= 1) {
               this.field_38901 = -1;
            }

            this.field_38903 = this.field_38902;
            this.field_38902 = var7.field_3144;
            var7.field_3143 = client.thePlayer.rotationYaw;
            var7.field_3140 = client.thePlayer.rotationPitch;
         }
      }
   }

   @EventListen
   public void method_34662(class_2157 var1) {
      if (this.method_42015()) {
         Packet var4 = var1.method_10047();
         if (var4 instanceof class_4609) {
            class_4609 var5 = (class_4609)var4;
            if (this.field_38901 == -1) {
               var5.field_22416 = true;
            }
         }
      }
   }

   @EventListen
   public void method_34663(class_1711 var1) {
      if (this.method_42015()) {
         double var4 = this.field_38902 - this.field_38903;
         double var6 = this.field_38902;
         client.thePlayer.field_41736.field_7333 = var6;
         client.thePlayer.field_41713 = var6;
         client.thePlayer.field_3864 = var6;
         client.thePlayer.field_41698 = var6;
      }
   }
}
