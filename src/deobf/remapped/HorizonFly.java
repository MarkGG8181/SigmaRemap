package remapped;

public class HorizonFly extends Module {
   private int field_13556;
   private double field_13555;

   public HorizonFly() {
      super(Category.MOVEMENT, "Horizon", "A fly for Horizon anticheat");
   }

   @Override
   public void onEnable() {
      this.field_13555 = client.thePlayer.method_37309();
      this.field_13556 = 10;
      client.theTimer.timerSpeed = 0.6F;
   }

   @Override
   public void onDisable() {
      class_8865.method_40776(0.0);
      if (client.thePlayer.method_37098().field_7333 > 0.0) {
         class_314.method_1408(-0.0789);
      }

      client.theTimer.timerSpeed = 1.0F;
   }

   @EventListen
   @class_7664
   public void method_12636(class_7767 var1) {
      if (this.method_42015()) {
         double var4 = Math.sqrt(var1.method_35234() * var1.method_35234() + var1.method_35231() * var1.method_35231());
         if (this.field_13556 <= 9) {
            if (this.field_13556 != -1) {
               if (this.field_13556 != 0) {
                  if (this.field_13556 >= 1) {
                     class_8865.method_40777(var1, var4 + 5.0E-4);
                  }
               } else {
                  class_8865.method_40777(var1, var4 + 0.0015);
               }
            } else {
               var1.method_35235(class_8865.method_40786());
               class_314.method_1408(var1.method_35236());
               class_8865.method_40777(var1, 0.125);
            }
         } else {
            class_8865.method_40777(var1, 0.0);
         }
      }
   }

   @EventListen
   public void method_12634(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         this.field_13556++;
         if (this.field_13556 != 11) {
            if (this.field_13556 > 11 && this.field_13556 >= 20 && this.field_13556 % 20 == 0) {
               var1.method_6455(0.0);
            }
         } else {
            var1.method_6455(0.0);
         }

         var1.method_6444(true);
      }
   }

   @EventListen
   public void method_12637(PacketEvent var1) {
      if (this.method_42015()) {
         Packet var4 = var1.method_557();
         if (var4 instanceof class_509) {
            class_509 var5 = (class_509)var4;
            if (this.field_13556 >= 1) {
               this.field_13556 = -1;
            }

            this.field_13555 = var5.field_3144;
            var5.field_3143 = client.thePlayer.rotationYaw;
            var5.field_3140 = client.thePlayer.rotationPitch;
         }
      }
   }

   @EventListen
   public void method_12638(class_2157 var1) {
      if (this.method_42015()) {
         Packet var4 = var1.method_10047();
         if (var4 instanceof class_4609) {
            class_4609 var5 = (class_4609)var4;
            if (this.field_13556 == -1) {
               var5.field_22416 = true;
            }
         }
      }
   }

   @EventListen
   public void method_12635(class_1711 var1) {
      if (this.method_42015()) {
         double var4 = this.field_13555;
         client.thePlayer.field_41736.field_7333 = var4;
         client.thePlayer.field_41713 = var4;
         client.thePlayer.field_3864 = var4;
         client.thePlayer.field_41698 = var4;
      }
   }
}
