package com.mentalfrostbyte.jello.unmapped;

import com.google.gson.JsonArray;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.network.Class8930;
import com.mentalfrostbyte.jello.network.NetworkManager;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService;
import io.socket.client.Socket;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.entity.Entity;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;
import totalcross.json.JSONObject;

import java.io.IOException;
import java.math.BigInteger;
import java.net.Proxy;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class CombatTracker {
    public Thread field36052;
    public HashMap<UUID, Class8433> field36054 = new HashMap<UUID, Class8433>();
    public HttpClient field36055;
    public Socket field36057;
    public Class8930 field36058;
    private final Minecraft field36050 = Minecraft.getInstance();
    private String field36051;
    private final List<UUID> field36053 = new ArrayList<UUID>();
    private final NetworkManager field36056;

    public CombatTracker(NetworkManager var1) {
        Client.getInstance().getEventManager().register(this);
        this.field36055 = HttpClients.createDefault();
        this.field36056 = var1;
        this.field36058 = new Class8930(this);
        RandomModuleThread.field8342 = RandomModuleThread.field8342 | Client.getInstance().getNetworkManager().field38425 != null;
    }

    public static String method29518(String var0) {
        try {
            byte[] var3 = method29519(var0, "SHA-1");
            return new BigInteger(var3).toString(16).replace("-", "");
        } catch (NoSuchAlgorithmException var4) {
            throw new RuntimeException(var4);
        }
    }

    private static byte[] method29519(String var0, String var1) throws NoSuchAlgorithmException {
        MessageDigest var4 = MessageDigest.getInstance(var1);
        byte[] var5 = var0.getBytes(StandardCharsets.UTF_8);
        return var4.digest(var5);
    }

    // $VF: synthetic method
    public static Minecraft method29522(CombatTracker var0) {
        return var0.field36050;
    }

    // $VF: synthetic method
    public static void method29523(CombatTracker var0, GameProfile var1, String var2) throws AuthenticationException, IOException {
        var0.method29520(var1, var2);
    }

    public HashMap<UUID, Class8433> method29510() {
        return this.field36054;
    }

    public boolean method29511(Entity var1) {
        return var1 != null && this.field36054.containsKey(var1.getUniqueID());
    }

    public Class8433 method29512(Entity var1) {
        return this.field36054.get(var1.getUniqueID());
    }

    @EventTarget
    private void method29513(TickEvent var1) {
        if (this.field36050.player.ticksExisted % 100 == 0) {
            this.method29514();
            List<AbstractClientPlayerEntity> var4 = this.field36050.world.method6870();
            Iterator<AbstractClientPlayerEntity> var5 = var4.iterator();

            while (var5.hasNext()) {
                AbstractClientPlayerEntity var6 = var5.next();
                if (this.field36053.contains(var6.getUniqueID())
                        || Client.getInstance().getCombatManager().isValidTarget(var6)
                        || var6.getName().getUnformattedComponentText().equals("")) {
                    var5.remove();
                }
            }

            if (!var4.isEmpty()) {
                Iterator var10 = var4.iterator();
                int var7 = 0;
                JsonArray var8 = new JsonArray();

                while (var10.hasNext() && var7++ < 70) {
                    Entity var9 = (Entity) var10.next();
                    var8.add(var9.getName().getUnformattedComponentText());
                    this.field36053.add(var9.getUniqueID());
                }

                if (this.field36057 != null && this.field36057.connected()) {
                    this.field36057.emit("fetch", var8);
                }
            }
        }
    }

    private void method29514() {
        Iterator var3 = this.field36053.iterator();

        while (var3.hasNext()) {
            if (this.field36050.world.method7196((UUID) var3.next()) == null) {
                var3.remove();
            }
        }

        Iterator var4 = this.field36054.keySet().iterator();

        while (var3.hasNext()) {
            if (this.field36050.world.method7196((UUID) var4.next()) == null) {
                var4.remove();
            }
        }
    }

    public void method29515(String var1, String var2) {
        JSONObject var5 = new JSONObject();
        var5.put("target", var1);
        var5.put("message", var2);
        if (this.field36057 != null) {
            this.field36057.emit("message", var5);
        }
    }

    private void method29520(GameProfile var1, String var2) throws AuthenticationException, IOException {
        String var5 = this.field36050.session.getToken();
        YggdrasilAuthenticationService var6 = new YggdrasilAuthenticationService(Proxy.NO_PROXY, var5);
        YggdrasilMinecraftSessionService var7 = (YggdrasilMinecraftSessionService) var6.createMinecraftSessionService();
        var7.joinServer(var1, var5, var2);
        Client.getInstance();
        Client.getClientLogger().info("Jello Connect: successfully reached out mojangs servers " + var2);
        System.out
                .println("https://sessionserver.mojang.com/session/minecraft/hasJoined?serverId=" + var2 + "&username=" + this.field36050.session.getUsername());
    }

    private String method29521(String var1) {
        try {
            MessageDigest var4 = MessageDigest.getInstance("MD5");
            byte[] var5 = var4.digest(var1.getBytes());
            StringBuffer var6 = new StringBuffer();

            for (int var7 = 0; var7 < var5.length; var7++) {
                var6.append(Integer.toHexString(var5[var7] & 255 | 256), 1, 3);
            }

            return var6.toString();
        } catch (NoSuchAlgorithmException var8) {
            return null;
        }
    }
}
