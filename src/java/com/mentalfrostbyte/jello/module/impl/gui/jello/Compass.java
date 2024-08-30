package com.mentalfrostbyte.jello.module.impl.gui.jello;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4415;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import mapped.Class5628;
import mapped.ClientColors;
import mapped.RenderUtil;
import net.minecraft.client.Minecraft;

import java.util.ArrayList;
import java.util.List;

public class Compass extends Module {
    public Compass() {
        super(ModuleCategory.GUI, "Compass", "Fornite style directions");
        this.method16005(false);
    }

    @EventTarget
    private void method16657(Class4415 var1) {
        if (this.isEnabled() && mc.player != null) {
            if (! Minecraft.getInstance().gameSettings.hideGUI) {
                byte var4 = 5;
                byte var5 = 60;
                int var6 = !Minecraft.getInstance().gameSettings.showDebugInfo ? 0 : 60;
                List<Integer> var7 = this.method16660((int) this.method16662(mc.player.rotationYaw), var4);
                int var8 = (Integer) var7.get(var4);
                if (var8 == 0 && this.method16662(mc.player.rotationYaw) > 345.0F) {
                    var8 = 360;
                }

                float var9 = 7.0F + this.method16662(mc.player.rotationYaw) - (float) var8;
                double var10 = var9 / 15.0F * (float) var5;
                RenderUtil.method11449(
                        (float) (mc.mainWindow.getWidth() / 2) - (float) (var4 * var5) * 1.5F,
                        -40.0F,
                        (float) (var4 * var5 * 2) * 1.5F,
                        (float) (220 + var6),
                        ResourcesDecrypter.shadowPNG,
                        Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.25F)
                );
                int var12 = 0;

                for (int var14 : var7) {
                    var12++;
                    double var15 = Math.max(0.0, Math.min(((double) (var12 * var5) - var10) / (double) ((float) (var5 * var4)), 1.0));
                    double var17 = Math.max(0.0, Math.min(2.25 - ((double) (var12 * var5) - var10) / (double) ((float) (var5 * var4)), 1.0));
                    float var19 = (float) Math.min(var15, var17);
                    this.method16658(mc.mainWindow.getWidth() / 2 + var12 * var5 - (int) var10 - (var4 + 1) * var5 - 2, 30 + var6, var5, var14, var19 * 0.8F);
                }
            }
        }
    }

    private void method16658(int var1, int var2, int var3, int var4, float var5) {
        String var8 = var4 + "";
        if (!var8.equals("0")) {
            if (!var8.equals("90")) {
                if (!var8.equals("180")) {
                    if (!var8.equals("270")) {
                        if (!var8.equals("45")) {
                            if (!var8.equals("135")) {
                                if (!var8.equals("225")) {
                                    if (var8.equals("315")) {
                                        var8 = "SE";
                                    }
                                } else {
                                    var8 = "NE";
                                }
                            } else {
                                var8 = "NW";
                            }
                        } else {
                            var8 = "SW";
                        }
                    } else {
                        var8 = "E";
                    }
                } else {
                    var8 = "N";
                }
            } else {
                var8 = "W";
            }
        } else {
            var8 = "S";
        }

        if (!var8.matches(".*\\d+.*")) {
            if (var8.length() != 1) {
                RenderUtil.method11439(
                        ResourceRegistry.JelloLightFont25,
                        (float) (var1 + (var3 - ResourceRegistry.JelloLightFont25.method23942(var8)) / 2),
                        (float) (var2 + 20),
                        var8,
                        Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, var5)
                );
            } else {
                RenderUtil.method11439(
                        ResourceRegistry.JelloMediumFont40,
                        (float) (var1 + (var3 - ResourceRegistry.JelloMediumFont40.method23942(var8)) / 2),
                        (float) (var2 + 10),
                        var8,
                        Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, var5)
                );
            }
        } else {
            RenderUtil.method11426(
                    (float) (var1 + var3 / 2 - 1),
                    (float) (var2 + 28),
                    (float) (var1 + var3 / 2 + 1),
                    (float) (var2 + 38),
                    Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, var5 * 0.5F)
            );
            RenderUtil.method11439(
                    ResourceRegistry.JelloLightFont18,
                    (float) (var1 + (var3 - ResourceRegistry.JelloLightFont18.method23942(var8)) / 2),
                    (float) (var2 + 40),
                    var8,
                    Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, var5)
            );
        }
    }

    private int method16659(int var1, int var2) {
        int var5 = Math.abs(var2 - var1) % 360;
        return var5 <= 180 ? var5 : 360 - var5;
    }

    private ArrayList<Integer> method16660(int var1, int var2) {
        int var5 = this.method16661(var1);
        ArrayList var6 = new ArrayList();

        for (int var7 = var5 - 15 * var2; var7 < var5; var7 += 15) {
            var6.add((int) this.method16662((float) var7));
        }

        for (int var8 = var5; var8 < var5 + 15 * (var2 + 1); var8 += 15) {
            var6.add((int) this.method16662((float) var8));
        }

        return var6;
    }

    private int method16661(int var1) {
        return (var1 + 7) / 15 * 15;
    }

    public float method16662(float var1) {
        var1 %= 360.0F;
        if (var1 < 0.0F) {
            var1 += 360.0F;
        }

        return var1;
    }
}