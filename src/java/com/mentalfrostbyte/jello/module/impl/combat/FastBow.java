package com.mentalfrostbyte.jello.module.impl.combat;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.CPlayerDiggingPacket;
import mapped.Class3263;
import mapped.Class5603;
import mapped.Direction;
import net.minecraft.util.math.BlockPos;

public class FastBow extends Module {
    private int field23627;

    public FastBow() {
        super(ModuleCategory.COMBAT, "FastBow", "Shoots arrows faster");
    }

    @EventTarget
    private void method16373(TickEvent var1) {
        if (this.isEnabled()) {
            if (mc.player.method3090() != null
                    && mc.player.method3090().getItem() instanceof Class3263
                    && mc.player.onGround) {
                for (int var4 = 0; var4 < 25; var4++) {
                    mc.getConnection().sendPacket(new Class5603(true));
                }

                mc.getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.field13489, BlockPos.ZERO, Direction.DOWN));
            }
        }
    }
}