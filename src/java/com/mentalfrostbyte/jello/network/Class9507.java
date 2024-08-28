package com.mentalfrostbyte.jello.network;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.util.TextureUtil;
import mapped.Texture;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Class9507 {
    private final String field44258;
    private final boolean field44259;
    private final long field44260 = System.currentTimeMillis();
    private boolean field44261 = true;
    private String field44262 = "";
    private BufferedImage field44263;
    private Texture field44264;

    public Class9507(String var1, boolean var2) {
        this.field44258 = var1;
        this.field44259 = var2;
        if (var2) {
            new Thread(() -> {
                try {
                    URL var4 = new URL("https://jelloprg.sigmaclient.info/captcha/" + var1 + ".png");
                    this.field44263 = ImageIO.read(var4);
                } catch (IOException ignored) {
                }
            }).start();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            if (this.field44264 != null) {
                Client.getInstance().method19927(this.field44264);
            }
        } finally {
            super.finalize();
        }
    }

    public Texture method36701() {
        if (this.field44264 == null && this.field44263 != null) {
            try {
                this.field44264 = TextureUtil.method32933("", this.field44263);
            } catch (IOException var4) {
                var4.printStackTrace();
            }
        }

        return this.field44264;
    }

    public boolean method36702() {
        return this.field44259;
    }

    public boolean method36703() {
        return this.field44261 && this.field44260 > System.currentTimeMillis() - 300000L;
    }

    public void method36704(boolean var1) {
        this.field44261 = var1;
    }

    public String method36705() {
        return this.field44262;
    }

    public void method36706(String var1) {
        this.field44262 = var1;
    }

    public String method36707() {
        return this.field44258;
    }
}