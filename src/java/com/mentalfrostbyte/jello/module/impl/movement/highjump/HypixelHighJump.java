package com.mentalfrostbyte.jello.module.impl.movement.highjump;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.Class5628;
import mapped.Class9567;
import mapped.NumberSetting;

public class HypixelHighJump extends Module {
   private int field23405;
   private boolean field23406;
   private double field23407;

   public HypixelHighJump() {
      super(ModuleCategory.MOVEMENT, "Hypixel", "Highjump for Hypixel");
      this.registerSetting(new NumberSetting<Float>("Motion", "Highjump motion", 0.75F, Float.class, 0.42F, 5.0F, 0.05F));
   }

   @Override
   public void onEnable() {
      this.field23405 = -1;
      this.field23406 = false;
      this.field23407 = 999.0;
   }

   @EventTarget
   public void method16018(Class4435 var1) {
      if (this.isEnabled() && mc.player != null) {
         if (mc.player.fallDistance > 3.0F + this.getNumberValueBySettingName("Motion") * 4.0F && var1.method13994() < -0.3) {
            if (this.field23406) {
               if (mc.player.getPosY() + var1.method13994() < this.field23407) {
                  var1.method13995(this.field23407 - mc.player.getPosY());
                  this.field23406 = false;
               }
            } else {
               this.field23405 = 0;
            }
         }

         if (this.field23405 >= 0) {
            this.field23405++;
            var1.method13995(0.0);
            Class9567.method37088(var1, 0.0);
            var1.method13995((double)this.getNumberValueBySettingName("Motion"));
            this.field23406 = true;
            this.field23407 = mc.player.getPosY();
            this.field23405 = -1;
         }

         if (this.field23406 && Class5628.method17730(mc.player, 0.001F)) {
            this.field23406 = !this.field23406;
         }

         Class5628.method17725(var1.method13994());
      }
   }

   @EventTarget
   public void method16019(Class4399 var1) {
      if (this.isEnabled()) {
         if (this.field23405 >= 0) {
            var1.method13908(true);
         }
      }
   }
}