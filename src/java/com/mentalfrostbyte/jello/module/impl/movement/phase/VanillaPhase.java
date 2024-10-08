package com.mentalfrostbyte.jello.module.impl.movement.phase;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.EventPushBlock;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.MovementUtils;
import mapped.*;
import net.minecraft.util.Direction;
import net.minecraft.util.math.vector.Vector3d;

public class VanillaPhase extends Module {
    public VanillaPhase() {
        super(ModuleCategory.MOVEMENT, "Vanilla", "Vanilla phase");
    }

    @EventTarget
    private void method16711(EventUpdate var1) {
        if (this.isEnabled()) {
            if (mc.player.collidedHorizontally) {
                Class9629 var4 = MultiUtilities.method17760(1.0E-4);
                double var5 = /*JelloPortal.getCurrentVersionApplied() != ViaVerList._1_8_x.getVersionNumber() ? 1.0E-6 :*/ 0.0625;
                if (((Direction) var4.method37538()).getAxis() != Direction.Axis.X) {
                    var1.setZ(
                            (double) Math.round((((Vector3d) var4.method37539()).z + 1.1921022E-8) * 10000.0) / 10000.0
                                    + (double) ((Direction) var4.method37538()).getZOffset() * var5
                    );
                } else {
                    var1.setX(
                            (double) Math.round((((Vector3d) var4.method37539()).x + 1.1921022E-8) * 10000.0) / 10000.0
                                    + (double) ((Direction) var4.method37538()).getXOffset() * var5
                    );
                }
            }
        }
    }

    @EventTarget
    private void method16712(EventMove var1) {
        if (this.isEnabled()) {
            if (mc.player.collidedHorizontally || MultiUtilities.method17761()) {
                MovementUtils.setSpeed(var1, 0.0);
                MovementUtils.method37095(1.7);
            }
        }
    }

    @EventTarget
    private void method16713(EventPushBlock var1) {
        if (this.isEnabled()) {
            var1.setCancelled(true);
        }
    }
}
