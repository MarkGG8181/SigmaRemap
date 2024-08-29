package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class LibreCraftFly extends Module {
    private int field23910;
    private boolean field23911;

    public LibreCraftFly() {
        super(ModuleCategory.MOVEMENT, "LibreCraft", "A fly for LibreCraft");
        this.registerSetting(new NumberSetting<Float>("Speed", "Fly speed", 4.0F, Float.class, 0.3F, 10.0F, 0.1F));
    }

    @Override
    public void onEnable() {
        this.field23910 = 0;
        if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
            if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
                this.field23911 = false;
            }
        } else {
            mc.gameSettings.keyBindSneak.field13071 = false;
            this.field23911 = true;
        }
    }

    @Override
    public void onDisable() {
        Class9567.method37090(0.0);
        if (mc.player.method3433().field18049 > 0.0) {
            Class5628.method17725(-0.0789);
        }
    }

    @EventTarget
    private void method16791(Class4430 var1) {
        if (this.isEnabled()) {
            if (var1.method13977() == mc.gameSettings.keyBindSneak.field13070.field34875) {
                var1.method13900(true);
                this.field23911 = true;
            }
        }
    }

    @EventTarget
    private void method16792(Class4426 var1) {
        if (this.isEnabled()) {
            if (var1.method13973() == mc.gameSettings.keyBindSneak.field13070.field34875) {
                var1.method13900(true);
                this.field23911 = false;
            }
        }
    }

    @EventTarget
    @LowerPriority
    public void method16793(Class4435 var1) {
        if (this.isEnabled()) {
            if (this.field23910 <= 0) {
                if (this.field23910 != -1) {
                    if (this.field23910 == 0) {
                        var1.method13995(0.0);
                        Class5628.method17725(var1.method13994());
                        Class9567.method37088(var1, 0.35);
                    }
                } else {
                    var1.method13995(0.299);
                    Class5628.method17725(var1.method13994());
                    Class9567.method37088(var1, this.getNumberValueBySettingName("Speed"));
                }
            } else {
                var1.method13995(0.0);
                Class9567.method37088(var1, 0.0);
            }
        }
    }

    @EventTarget
    public void method16794(Class4399 var1) {
        if (this.isEnabled() && var1.method13921()) {
            this.field23910++;
            if (this.field23910 != 2) {
                if (this.field23910 > 2) {
                    if (this.field23910 >= 20 && this.field23910 % 20 == 0) {
                        var1.method13912(0.1);
                    } else {
                        var1.method13900(true);
                    }
                }
            } else {
                var1.method13912(0.1);
            }

            var1.method13908(true);
        }
    }

    @EventTarget
    public void method16795(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            Packet var4 = var1.getPacket();
            if (mc.player != null && var4 instanceof Class5473) {
                Class5473 var5 = (Class5473) var4;
                if (this.field23910 >= 1) {
                    this.field23910 = -1;
                }

                var5.field24300 = mc.player.rotationYaw;
                var5.field24301 = mc.player.rotationPitch;
            }
        }
    }
}