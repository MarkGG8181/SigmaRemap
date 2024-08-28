package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.PremiumModule;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.unmapped.Class8005;
import com.mentalfrostbyte.jello.util.timer.Timer;

public class Class5267 extends PremiumModule {
    private int field23696;
    private final Timer field23697 = new Timer();
    private final Timer field23698 = new Timer();
    private boolean field23699;

    public Class5267() {
        super("Cubecraft2", "A fly for 1.9+ cubecraft", ModuleCategory.MOVEMENT);
    }

    @Override
    public void isInDevelopment() {
        this.field23696 = 0;
        if (!mc.field1299.field44637.method8509()) {
            this.field23699 = false;
        } else {
            mc.field1299.field44637.field13071 = false;
            this.field23699 = true;
        }

        if (Class5628.method17718() && Class8005.method27349() == Class5989.field26129.method18582()) {
            Client.getInstance().getNotificationManager().post(new Notification("Cubecraft2 fly", "This fly was made for 1.9+ only"));
        }

        this.field23698.method27119();
        this.field23698.method27120();
    }

    @Override
    public void method15965() {
        Class9567.method37090(0.2);
        Class5628.method17725(-0.0789);
        if (Class5628.method17730(mc.field1339, 0.001F)) {
            Class9567.method37090(0.0);
            Class5628.method17725(-0.0789);
        } else {
            double var3 = mc.field1339.getPosX();
            double var5 = mc.field1339.getPosY();
            double var7 = mc.field1339.getPosZ();
            mc.getClientPlayNetHandler().sendPacket(new Class5605(var3, -150.0, var7, false));
            Class9567.method37090(0.0);
            Class5628.method17725(0.0);
            this.field23696 = -3;
            this.field23697.method27120();
            this.field23697.method27118();
        }
    }

    @EventTarget
    private void method16483(Class4430 var1) {
        if (this.method15996()) {
            if (var1.method13977() == mc.field1299.field44637.field13070.field34875) {
                var1.method13900(true);
                this.field23699 = true;
            }
        }
    }

    @EventTarget
    private void method16484(Class4426 var1) {
        if (this.method15996()) {
            if (var1.method13973() == mc.field1299.field44637.field13070.field34875) {
                var1.method13900(true);
                this.field23699 = false;
            }
        }
    }

    @EventTarget
    @LowerPriority
    public void method16485(Class4435 var1) {
        if (this.method15996()) {
            this.field23696++;
            if (this.field23696 != 1) {
                if (this.field23696 != 2) {
                    var1.method13995(0.0);
                    Class9567.method37088(var1, 0.0);
                } else {
                    var1.method13995(-9.999999999E-5);
                    Class9567.method37088(var1, 0.28);
                }
            } else {
                var1.method13995(!mc.field1299.field44636.method8509() ? (!this.field23699 ? 1.0E-4 : -0.99) : (!this.field23699 ? 0.99 : 1.0E-4));
                Class9567.method37088(var1, !mc.field1299.field44636.method8509() ? (!this.field23699 ? 3.7 : 2.8) : (!this.field23699 ? 2.8 : 3.7));
            }

            Class5628.method17725(var1.method13994());
        } else {
            if (this.field23696 < 0) {
                if (this.field23696 != -3) {
                    if (this.field23696 != -2) {
                        if (this.field23696 == -1) {
                            this.field23696++;
                            var1.method13995(-0.4);
                            Class9567.method37088(var1, 0.0);
                        }
                    } else {
                        var1.method13995(0.4);
                        this.field23696++;
                        Class9567.method37088(var1, 0.0);
                    }
                } else {
                    if (this.field23697.method27121() > 1000L) {
                        this.field23696++;
                        this.field23697.method27120();
                        this.field23697.method27119();
                    }

                    var1.method13995(0.0);
                    Class9567.method37088(var1, 0.0);
                }
            }
        }
    }

    @EventTarget
    public void method16486(Class4399 var1) {
        if (this.field23696 == -3) {
            var1.method13900(true);
        }

        if (this.method15996() && var1.method13921()) {
            var1.method13908(true);
            var1.method13920(true);
            if (this.field23696 != 3) {
                if (this.field23696 > 3) {
                    if (this.field23698.method27123() && this.field23698.method27121() > 2000L) {
                        var1.method13912(-150.0);
                        this.field23698.method27120();
                    } else {
                        var1.method13900(true);
                    }
                }
            } else {
                var1.method13912(-150.0);
                this.field23698.method27118();
            }
        }
    }

    @EventTarget
    public void method16487(Class4396 var1) {
        if (this.method15996() || this.field23696 < 0) {
            Packet var4 = var1.method13898();
            if (var4 instanceof Class5473) {
                Class5473 var5 = (Class5473) var4;
                var5.field24300 = mc.field1339.field5031;
                var5.field24301 = mc.field1339.field5032;
                this.field23698.method27120();
                this.field23698.method27119();
                if (this.field23696 != -3) {
                    this.field23696 = 0;
                } else {
                    this.field23696++;
                }
            }
        }
    }
}