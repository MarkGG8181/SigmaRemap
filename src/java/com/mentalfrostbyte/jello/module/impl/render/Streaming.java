package com.mentalfrostbyte.jello.module.impl.render;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4410;
import com.mentalfrostbyte.jello.event.impl.TextReplaceEvent;
import com.mentalfrostbyte.jello.event.impl.Class4433;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.BooleanSetting;
import mapped.InputSetting;

public class Streaming extends Module {
    public Streaming() {
        super(ModuleCategory.RENDER, "Streaming", "Useful module when recording or streaming");
        this.registerSetting(new BooleanSetting("Hide skins", "Spoof all players skin", true));
        this.registerSetting(new BooleanSetting("Hide server name", "Spoof server name", false));
        this.registerSetting(new InputSetting("Server name", "The server name that you need to hide", "servernamehere"));
        this.registerSetting(new BooleanSetting("Hide date", "Hide date on scoreboard", false));
    }

    @EventTarget
    public void method16849(TextReplaceEvent var1) {
        if (this.isEnabled()) {
            if (this.getBooleanValueFromSetttingName("Hide server name") && this.getStringSettingValueByName("Server name").length() > 1) {
                var1.method13959(var1.method13958().replaceAll(this.getStringSettingValueByName("Server name"), "sigmaclient"));
                var1.method13959(var1.method13958().replaceAll(this.getStringSettingValueByName("Server name").toLowerCase(), "sigmaclient"));
                var1.method13959(var1.method13958().replaceAll(this.getStringSettingValueByName("Server name").toUpperCase(), "sigmaclient"));
            }
        }
    }

    @EventTarget
    public void method16850(Class4433 var1) {
    }

    @EventTarget
    public void method16851(Class4410 var1) {
        if (this.isEnabled()) {
            if (this.getBooleanValueFromSetttingName("Hide skins")) {
                var1.method13955(false);
            }
        }
    }
}