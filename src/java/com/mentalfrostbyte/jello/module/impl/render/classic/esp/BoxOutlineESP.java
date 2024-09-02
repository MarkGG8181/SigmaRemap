package com.mentalfrostbyte.jello.module.impl.render.classic.esp;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import mapped.*;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class BoxOutlineESP extends Module {
    public int field23719 = ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.8F);

    public BoxOutlineESP() {
        super(ModuleCategory.RENDER, "Box Outline", "Draws a line arround players");
        this.registerSetting(new ColorSetting("Color", "The tracers color", ClientColors.LIGHT_GREYISH_BLUE.getColor));
    }

    @EventTarget
    private void method16506(Render3DEvent var1) {
        if (this.isEnabled()) {
            if (mc.player != null && mc.world != null) {
                this.method16509();
                RenderUtil.method11476();
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                this.method16508(false);
                RenderUtil.method11477(Class2329.field15941);
                GL11.glLineWidth(3.0F);
                RenderSystem.method27819(518, 0.0F);
                RenderSystem.disableAlphaTest();
                this.method16507();
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.1F);
                GL11.glEnable(3042);
                GL11.glDisable(2896);
                this.method16508(true);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                RenderUtil.method11478();
                this.method16510();
            }
        }
    }

    private void method16507() {
        if (Client.getInstance().getClientMode() == ClientMode.JELLO) {
            mc.world
                    .field9025
                    .forEach(
                            (var1, var2) -> {
                                boolean var5 = ColorUtils.method17744(var2) == Class2258.field14690 && this.method16004().getBooleanValueFromSetttingName("Show Players");
                                boolean var6 = !var2.method3342() || this.method16004().getBooleanValueFromSetttingName("Show Invisibles");
                                if (!Client.getInstance().getCombatManager().method29346(var2) && var5 && var6 && var2 != mc.player) {
                                    double var7 = Class9647.method37623(var2).field43722;
                                    double var9 = Class9647.method37623(var2).field43723;
                                    double var11 = Class9647.method37623(var2).field43724;
                                    GL11.glPushMatrix();
                                    GL11.glAlphaFunc(519, 0.0F);
                                    GL11.glTranslated(var7, var9, var11);
                                    GL11.glTranslatef(0.0F, var2.method3430(), 0.0F);
                                    GL11.glTranslatef(0.0F, 0.1F, 0.0F);
                                    GL11.glRotatef(mc.gameRenderer.getActiveRenderInfo().method37507(), 0.0F, -1.0F, 0.0F);
                                    GL11.glScalef(-0.11F, -0.11F, -0.11F);
                                    RenderUtil.method11450(
                                            -var2.method3429() * 22.0F,
                                            -var2.method3430() * 5.5F,
                                            var2.method3429() * 44.0F,
                                            var2.method3430() * 21.0F,
                                            ResourcesDecrypter.shadowPNG,
                                            this.field23719,
                                            false
                                    );
                                    ResourcesDecrypter.shoutIconPNG.bind();
                                    GL11.glPopMatrix();
                                }
                            }
                    );
        }
    }

    private void method16508(boolean var1) {
        for (Entity var5 : mc.world.method6835()) {
            if (!Client.getInstance().getCombatManager().method29346(var5)) {
                boolean var6 = ColorUtils.method17744(var5) == Class2258.field14690 && this.method16004().getBooleanValueFromSetttingName("Show Players");
                boolean var7 = ColorUtils.method17744(var5) == Class2258.field14689 && this.method16004().getBooleanValueFromSetttingName("Show Mobs");
                boolean var8 = ColorUtils.method17744(var5) == Class2258.field14691 && this.method16004().getBooleanValueFromSetttingName("Show Passives");
                boolean var9 = !var5.method3342() || this.method16004().getBooleanValueFromSetttingName("Show Invisibles");
                if ((var7 || var6 || var8) && var9 && var5 != mc.player) {
                    GL11.glPushMatrix();
                    GL11.glTranslated(
                            -mc.gameRenderer.getActiveRenderInfo().method37504().method11320(),
                            -mc.gameRenderer.getActiveRenderInfo().method37504().method11321(),
                            -mc.gameRenderer.getActiveRenderInfo().method37504().method11322()
                    );
                    GL11.glDisable(2929);
                    GL11.glEnable(3042);
                    int var10 = this.parseSettingValueToIntBySettingName("Color");
                    double var11 = (var5.getPosX() - var5.lastTickPosX) * (double) mc.timer.renderPartialTicks - (var5.getPosX() - var5.lastTickPosX);
                    double var13 = (var5.getPosY() - var5.lastTickPosY) * (double) mc.timer.renderPartialTicks - (var5.getPosY() - var5.lastTickPosY);
                    double var15 = (var5.getPosZ() - var5.lastTickPosZ) * (double) mc.timer.renderPartialTicks - (var5.getPosZ() - var5.lastTickPosZ);
                    Class9388 var17 = new Class9388(var5.getBoundingBox().method19667(var11, var13, var15)).method35648(0.1F);
                    if (var1) {
                        RenderUtil.renderWireframeBox(var17, 3.0F, ColorUtils.applyAlpha(var10, Client.getInstance().getClientMode() != ClientMode.JELLO ? 0.8F : 0.35F));
                    } else {
                        RenderUtil.render3DColoredBox(var17, ClientColors.LIGHT_GREYISH_BLUE.getColor);
                    }

                    GL11.glDisable(3042);
                    GL11.glPopMatrix();
                }
            }
        }
    }

    private void method16509() {
        GL11.glLineWidth(3.0F);
        GL11.glPointSize(3.0F);
        GL11.glEnable(2832);
        GL11.glEnable(2848);
        GL11.glEnable(3042);
        GL11.glDisable(2896);
        GL11.glEnable(3008);
        GL11.glDisable(3553);
        GL11.glDisable(2903);
        GL11.glDisable(2929);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.gameRenderer.field818.method7316();
    }

    private void method16510() {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(2896);
        GL11.glEnable(3553);
        GL11.glEnable(2903);
        RenderSystem.method27905(33986, 240.0F, 240.0F);
        TextureImpl.method36180();
        TextureManager var10000 = mc.getTextureManager();
        mc.getTextureManager();
        var10000.bindTexture(TextureManager.field1094);
        mc.gameRenderer.field818.method7317();
    }
}
