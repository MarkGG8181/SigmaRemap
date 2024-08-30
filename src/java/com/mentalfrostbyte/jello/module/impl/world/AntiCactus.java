package com.mentalfrostbyte.jello.module.impl.world;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4398;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.BooleanSetting;
import mapped.Class3220;
import mapped.Class3399;
import mapped.VoxelShapes;

public class AntiCactus extends Module {
    public AntiCactus() {
        super(ModuleCategory.WORLD, "AntiCactus", "Prevent you from taking damage from cactus");
        this.registerSetting(new BooleanSetting("Above", "Avoid damage above cactus also", true));
    }

    @EventTarget
    private void method16182(Class4398 var1) {
        if (this.isEnabled()) {
            if (mc.world.getBlockState(var1.method13902()).getBlock() instanceof Class3220) {
                var1.method13905(VoxelShapes.create(0.0, 0.0, 0.0, 1.0, !this.getBooleanValueFromSetttingName("Above") ? 0.9375 : 0.999, 1.0));
            }

            if (mc.world.getBlockState(var1.method13902()).getBlock() instanceof Class3399) {
                var1.method13905(VoxelShapes.create(-0.01, 0.0, -0.01, 1.02, 1.9375, 1.02));
            }
        }
    }
}