package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.notification.Notification;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$Action;

public class Class5231 extends Module {
    private Class5340 field23580;

    public Class5231() {
        super(ModuleCategory.MISC, "Cubecraft", "Gameplay for Cubecraft");
    }

    @Override
    public void method15953() {
        this.field23580 = (Class5340) this.method16004();
    }

    @EventTarget
    private void method16296(Class4396 var1) {
        if (this.method15996() && field23386.field1339 != null) {
            Packet var4 = var1.method13898();
            if (var4 instanceof Class5616) {
                Class5616 var5 = (Class5616) var4;
                String var6 = var5.method17648().getString();
                String var7 = var5.method17648().getString();
                String var8 = field23386.field1339.method2941().getString().toLowerCase();
                if (this.field23580.method15974("AutoL")
                        && (
                        var6.toLowerCase().contains("was slain by " + var8)
                                || var6.toLowerCase().contains("burned to death while fighting " + var8)
                                || var6.toLowerCase().contains("was shot by " + var8)
                                || var6.toLowerCase().contains("burnt to a crisp while fighting " + var8)
                                || var6.toLowerCase().contains("couldn't fly while escaping " + var8)
                                || var6.toLowerCase().contains("thought they could survive in the void while escaping " + var8)
                                || var6.toLowerCase().contains("fell to their death while escaping " + var8)
                                || var6.toLowerCase().contains("died in the void while escaping " + var8)
                )) {
                    this.field23580.method16761(var6);
                }

                if (var7.contains("§a§lPlay Again §r§8• §r§6§lAuto Mode §r§8• §r§c§lLeave") && this.field23580.method15974("Auto Join")) {
                    for (ITextComponent var10 : var5.method17648().getSiblings()) {
                        ClickEvent var11 = var10.getStyle().getClickEvent();
                        if (var11 != null && var11.getAction() == ClickEvent$Action.RUN_COMMAND && var11.getValue().contains("playagain")) {
                            this.field23580.method16759(new Class7200(var11.getValue(), (long) this.field23580.method15977("Auto Join delay") * 1000L));
                            Client.getInstance()
                                    .getNotificationManager()
                                    .post(
                                            new Notification("Auto Join", "Joining a new game in 3 seconds.", (int) (this.field23580.method15977("Auto Join delay") - 1.0F) * 1000)
                                    );
                            break;
                        }
                    }
                }

                if (this.field23580.method15974("AutoGG") && var7.equalsIgnoreCase("§e" + field23386.field1339.method2941().getString() + "§r§a won the game!§r")) {
                    this.field23580.method16760();
                }
            }
        }
    }
}
