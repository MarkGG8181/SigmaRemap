package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.impl.combat.Criticals;
import com.mentalfrostbyte.jello.module.impl.combat.KillAura;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.network.play.client.CUseEntityPacket;
import net.minecraft.util.Hand;
import net.minecraft.util.math.EntityRayTraceResult;

/**
 * Decompiler seems to have fucked up, I guess
 */
public class KillAuraAttackLambda implements Runnable {
   public final float field1477;
   public final KillAura killauraModule;

   public KillAuraAttackLambda(KillAura var1, float var2) {
      this.killauraModule = var1;
      this.field1477 = var2;
   }

   @Override
   public void run() {
      boolean var3 = (float)Math.round((float)Math.random() * 100.0F) <= this.killauraModule.getNumberValueBySettingName("Hit Chance");
      float var4 = Math.max(KillAura.mc.player.getDistance(KillAura.timedEntityIdk.getEntity()), this.killauraModule.getNumberValueBySettingName("Range"));
      EntityRayTraceResult var5;
      if (!this.killauraModule.getStringSettingValueByName("Attack Mode").equals("Pre")) {
         var5 = MultiUtilities.method17712(
            KillAura.getRotations(this.killauraModule).yaw, KillAura.getRotations(this.killauraModule).pitch, var4, (double)this.field1477
         );
      } else {
         double var6 = Math.sqrt(
            KillAura.mc.player.getMotion().x * KillAura.mc.player.getMotion().x
               + KillAura.mc.player.getMotion().z * KillAura.mc.player.getMotion().z
         );
          var5 = MultiUtilities.method17712(KillAura.getRotations2(this.killauraModule).yaw, KillAura.getRotations2(this.killauraModule).pitch, var4, (double) this.field1477 + var6);
      }

      if (KillAura.target != null
         && KillAura.interactAB.isBlocking()
         && !this.killauraModule.getStringSettingValueByName("Autoblock Mode").equals("Vanilla")) {
         KillAura.interactAB.method36816();
      }

      String mode = this.killauraModule.getStringSettingValueByName("Mode");
      if (var3 && (var5 != null || !this.killauraModule.getBooleanValueFromSettingName("Raytrace") || mode.equals("Multi"))) {
         for (TimedEntity timedEnt : KillAura.entities) {
            Entity entity = timedEnt.getEntity();
            if (var5 != null && this.killauraModule.getBooleanValueFromSettingName("Raytrace") && !mode.equals("Multi")) {
               entity = var5.getEntity();
            }

            if (entity == null) {
               return;
            }

            boolean noSwing = this.killauraModule.getBooleanValueFromSettingName("No swing");
            Minecraft mc = KillAura.mc;
            boolean isOnePointEight = false;
            /*
            if (JelloPortal.getCurrentVersion() != null) {
               isOnePointEight = JelloPortal.getCurrentVersion().equals(ViaVerList._1_8_x);
            }
             */

            if (isOnePointEight && !noSwing) {
               mc.player.swingArm(Hand.MAIN_HAND);
            }

            mc.getConnection().getNetworkManager().sendNoEventPacket(new CUseEntityPacket(entity, mc.player.isSneaking()));
            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.getEnchantmentByID(12), mc.player.getHeldItem(Hand.MAIN_HAND)) > 0) {
               mc.particles.addParticleEmitter(entity, ParticleTypes.field34065);
            }

            boolean canSwing = (double) mc.player.getCooledAttackStrength(0.5F) > 0.9 || isOnePointEight;
            boolean attackable = canSwing
                    && mc.player.fallDistance > 0.0F
                    && !mc.player.onGround
                    && !mc.player.isOnLadder()
                    && !mc.player.isInWater()
                    && !mc.player.isPotionActive(Effects.BLINDNESS)
                    && !mc.player.isPassenger();
            if (attackable || mc.player.onGround && Client.getInstance().getModuleManager().getModuleByClass(Criticals.class).isEnabled()) {
               mc.particles.addParticleEmitter(entity, ParticleTypes.CRIT);
            }

            mc.player.resetCooldown();
            if (!isOnePointEight && !noSwing) {
               mc.player.swingArm(Hand.MAIN_HAND);
            }

            mc.playerController.attackEntity(mc.player, entity);
         }

         if (mode.equals("Multi2")) {
            KillAura.method16847(this.killauraModule, KillAura.method16846(this.killauraModule) + 1);
         }
      } else if (!this.killauraModule.getBooleanValueFromSettingName("No swing")) {
         KillAura.mc.player.swingArm(Hand.MAIN_HAND);
      }

      if (KillAura.target != null && KillAura.interactAB.method36817() && this.killauraModule.getStringSettingValueByName("Autoblock Mode").equals("Basic1")) {
         KillAura.interactAB
            .block(KillAura.target, KillAura.getRotations(this.killauraModule).yaw, KillAura.getRotations(this.killauraModule).pitch);
      }
   }
}
