package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5230 extends Module {
    private Class5340 field23579;

    public Class5230() {
        super(ModuleCategory.MISC, "Funcraft", "Gameplay for Funcraft");
    }

    @Override
    public void method15953() {
        this.field23579 = (Class5340) this.method16004();
    }

    @EventTarget
    private void method16295(Class4396 var1) {
        if (this.method15996() && mc.field1339 != null) {
            Packet var4 = var1.method13898();
            if (var4 instanceof Class5616) {
                Class5616 var5 = (Class5616) var4;
                String var6 = var5.method17648().getString();
                String var7 = mc.field1339.method2941().getString().toLowerCase();
                if (this.field23579.method15974("AutoL")
                        && (var6.toLowerCase().contains("a été tué par " + var7) || var6.toLowerCase().contains("a été tué par le vide et " + var7))) {
                    this.field23579.method16761(var6);
                }
            }
        }
    }
}