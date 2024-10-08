package com.mentalfrostbyte.jello.module.impl.player;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;

public class NoViewReset extends Module {
    public NoViewReset() {
        super(ModuleCategory.PLAYER, "NoViewReset", "Prevents the server from resetting your client yaw/pitch");
    }

    @EventTarget
    private void method16723(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            if (mc.player != null) {
                if (mc.player.ticksExisted >= 10) {
                    if (mc.player != null && var1.getPacket() instanceof SPlayerPositionLookPacket) {
                        SPlayerPositionLookPacket var4 = (SPlayerPositionLookPacket) var1.getPacket();
                        mc.player.prevRotationYaw = var4.yaw;
                        mc.player.prevRotationPitch = var4.pitch;
                        var4.yaw = mc.player.rotationYaw;
                        var4.pitch = mc.player.rotationPitch;
                    }
                }
            }
        }
    }
}
