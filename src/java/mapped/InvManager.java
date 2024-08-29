package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.PremiumModule;
import com.mentalfrostbyte.jello.unmapped.Class8005;
import com.mentalfrostbyte.jello.util.timer.Timer;

import java.util.ArrayList;

public class InvManager extends PremiumModule {
    public static int field23654 = 36;
    public static int field23655 = 37;
    public static int field23656 = 38;
    public static int field23657 = 39;
    public ArrayList<Integer> field23661 = new ArrayList<Integer>();
    private final Timer field23658 = new Timer();
    private boolean field23659;
    private boolean field23660;

    public InvManager() {
        super("InvManager", "Drops all useless items from your inventory", ModuleCategory.ITEM);
        this.registerSetting(new ModeSetting("Mode", "The way it will move items in your inventory", 0, "Basic", "OpenInv", "FakeInv"));
        this.registerSetting(new NumberSetting<Float>("Delay", "Inventory clicks delay", 0.3F, Float.class, 0.01F, 1.0F, 0.01F));
        this.registerSetting(new NumberSetting<Float>("Block Cap", "Maximum blocks.", 150.0F, Float.class, 0.0F, 256.0F, 10.0F));
        this.registerSetting(new ModeSetting("Clean Type", "Clean type", 0, "Skywars", "All"));
        this.registerSetting(new BooleanSetting("Fake Items", "Bypass for fake items (AAC).", false));
        this.registerSetting(new BooleanSetting("Cleaner", "Cleans your inventory.", true));
        this.registerSetting(new BooleanSetting("Sword", "Keeps only sword as weapon.", true));
        this.registerSetting(new ModeSetting("Tools", "How tools are handled.", 0, "Keep", "Organize", "Throw"));
        this.registerSetting(new BooleanSetting("Archery", "Cleans bows and arrows.", true));
        this.registerSetting(new BooleanSetting("Food", "Cleans food. Keeps Golden Apples.", false));
        this.registerSetting(new BooleanSetting("Heads", "Cleans Heads.", false));
        this.registerSetting(new BooleanSetting("Auto Shield", "Automatically equip shields for 1.9+.", false));
    }

    public static boolean method16431(ItemStack var0) {
        float var3 = method16433(var0);
        Module var4 = Client.getInstance().getModuleManager().getModuleByClass(InvManager.class);

        for (int var5 = 9; var5 < 45; var5++) {
            if (mc.player.field4904.method18131(var5).method18266()) {
                ItemStack var6 = mc.player.field4904.method18131(var5).method18265();
                if (method16433(var6) > var3 && (var6.getItem() instanceof ItemSword || !var4.getBooleanValueFromSetttingName("Sword"))) {
                    return false;
                }
            }
        }

        return var0.getItem() instanceof ItemSword || !var4.getBooleanValueFromSetttingName("Sword");
    }

    public static float method16433(ItemStack var0) {
        float var3 = 0.0F;
        Item var4 = var0.getItem();
        if (var4 instanceof Class3264) {
            Class3264 var5 = (Class3264) var4;
            var3 += (float) var5.method11711();
        }

        if (var4 instanceof ItemSword) {
            ItemSword var6 = (ItemSword) var4;
            var3 += var6.method11784();
        }

        return var3 + (float) Class7858.method26311(Class8122.field34908, var0) * 1.25F + (float) Class7858.method26311(Class8122.field34912, var0) * 0.01F;
    }

    public static int method16437(Item var0) {
        int var3 = 0;

        for (int var4 = 0; var4 < 45; var4++) {
            if (mc.player.field4904.method18131(var4).method18266()) {
                ItemStack var5 = mc.player.field4904.method18131(var4).method18265();
                if (var5.getItem() == var0) {
                    var3 += var5.field39976;
                }
            }
        }

        return var3;
    }

    public static boolean method16442(ItemStack var0) {
        Item var3 = var0.getItem();
        if (var3 instanceof Class3268) {
            float var4 = method16445(var0);

            for (int var5 = 9; var5 < 45; var5++) {
                if (mc.player.field4904.method18131(var5).method18266()) {
                    ItemStack var6 = mc.player.field4904.method18131(var5).method18265();
                    if (method16445(var6) > var4 && var6.getItem() instanceof Class3268) {
                        return false;
                    }
                }
            }

            return true;
        } else {
            return false;
        }
    }

    public static boolean method16443(ItemStack var0) {
        Item var3 = var0.getItem();
        if (var3 instanceof Class3270) {
            float var4 = method16445(var0);

            for (int var5 = 9; var5 < 45; var5++) {
                if (mc.player.field4904.method18131(var5).method18266()) {
                    ItemStack var6 = mc.player.field4904.method18131(var5).method18265();
                    if (method16445(var6) > var4 && var6.getItem() instanceof Class3270) {
                        return false;
                    }
                }
            }

            return true;
        } else {
            return false;
        }
    }

    public static boolean method16444(ItemStack var0) {
        Item var3 = var0.getItem();
        if (var3 instanceof Class3265) {
            float var4 = method16445(var0);

            for (int var5 = 9; var5 < 45; var5++) {
                if (mc.player.field4904.method18131(var5).method18266()) {
                    ItemStack var6 = mc.player.field4904.method18131(var5).method18265();
                    if (method16445(var6) > var4 && var6.getItem() instanceof Class3265 && !method16431(var0)) {
                        return false;
                    }
                }
            }

            return true;
        } else {
            return false;
        }
    }

    public static float method16445(ItemStack var0) {
        Item var3 = var0.getItem();
        if (var3 instanceof Class3264) {
            String var4 = var3.method11717().getString().toLowerCase();
            Class3264 var5 = (Class3264) var3;
            float var6 = 1.0F;
            if (!(var3 instanceof Class3268)) {
                if (!(var3 instanceof Class3270)) {
                    if (!(var3 instanceof Class3265)) {
                        return 1.0F;
                    }

                    var6 = var5.method11708(var0, Blocks.field36422.method11579());
                    if (var4.toLowerCase().contains("gold")) {
                        var6 -= 5.0F;
                    }
                } else {
                    var6 = var5.method11708(var0, Blocks.field36396.method11579());
                    if (var4.toLowerCase().contains("gold")) {
                        var6 -= 5.0F;
                    }
                }
            } else {
                var6 = var5.method11708(var0, Blocks.STONE.method11579());
                if (var4.toLowerCase().contains("gold")) {
                    var6 -= 5.0F;
                }
            }

            var6 = (float) ((double) var6 + (double) Class7858.method26311(Class8122.field34915, var0) * 0.0075);
            return (float) ((double) var6 + (double) Class7858.method26311(Class8122.field34917, var0) / 100.0);
        } else {
            return 0.0F;
        }
    }

    @Override
    public void onEnable() {
        this.field23659 = mc.currentScreen instanceof InventoryScreen;
        this.field23660 = false;
    }

    @EventTarget
    public void method16430(TickEvent var1) {
        if (!this.field23658.method27123()) {
            this.field23658.method27118();
        }

        if (this.isEnabled() && !Class5290.field23798) {
            String mode = this.getStringSettingValueByName("Mode");
            if (!this.getStringSettingValueByName("Mode").equals("OpenInv") || mc.currentScreen instanceof InventoryScreen) {
                long delayValue = (long) (this.getNumberValueBySettingName("Delay") * 20.0F);
                if (mc.currentScreen instanceof InventoryScreen) {
                    this.field23659 = false;
                }

                if (this.field23660 && (long) Client.getInstance().method19939().method31333() >= delayValue) {
                    this.field23660 = !this.field23660;
                    this.method16446(this.field23659);
                    Class7789.method25870(mc.player.field4904.field25471, 45, 0, Class2259.field14694, mc.player, true);
                    this.field23658.method27120();
                } else {
                    if (mc.currentScreen == null || mc.currentScreen instanceof InventoryScreen || mc.currentScreen instanceof ChatScreen) {
                        if (this.field23658.method27121() > delayValue && field23654 >= 36) {
                            if (mc.player.field4904.method18131(field23654).method18266()) {
                                if (!method16431(mc.player.field4904.method18131(field23654).method18265())) {
                                    this.method16432(field23654, mode.equals("FakeInv"));
                                }
                            } else {
                                this.method16432(field23654, mode.equals("FakeInv"));
                            }
                        }

                        boolean var7 = this.getStringSettingValueByName("Tools").equals("Organize");
                        if ((long) Client.getInstance().method19939().method31333() >= delayValue && field23655 >= 36 && var7) {
                            this.method16438(field23655, mode.equals("FakeInv"));
                        }

                        if ((long) Client.getInstance().method19939().method31333() >= delayValue && field23657 >= 36 && var7) {
                            this.method16439(field23657, mode.equals("FakeInv"));
                        }

                        if ((long) Client.getInstance().method19939().method31333() >= delayValue && field23656 >= 36 && var7) {
                            this.method16440(field23656, mode.equals("FakeInv"));
                        }

                        if ((long) Client.getInstance().method19939().method31333() >= delayValue && this.getBooleanValueFromSetttingName("Auto Shield")) {
                            this.method16441(mode.equals("FakeInv"));
                        }

                        if ((long) Client.getInstance().method19939().method31333() >= delayValue && this.getBooleanValueFromSetttingName("Cleaner")) {
                            for (int var8 = 9; var8 < 45; var8++) {
                                if (mc.player.field4904.method18131(var8).method18266()) {
                                    ItemStack var9 = mc.player.field4904.method18131(var8).method18265();
                                    if (this.method16434(var9, var8)) {
                                        this.method16446(mode.equals("FakeInv"));
                                        Class7789.method25871(var8);
                                        this.field23658.method27120();
                                        if (delayValue > 0L) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }

                    if (!this.field23659 && !(mc.currentScreen instanceof InventoryScreen) && this.field23658.method27121() > 0L && !this.field23660) {
                        this.field23659 = true;
                        mc.getConnection().sendPacket(new Class5482(-1));
                    }
                }
            }
        }
    }

    public void method16432(int var1, boolean var2) {
        for (int var5 = 9; var5 < 45; var5++) {
            if (mc.player.field4904.method18131(var5).method18266()) {
                ItemStack var6 = mc.player.field4904.method18131(var5).method18265();
                if (method16431(var6) && method16433(var6) > 0.0F && (var6.getItem() instanceof ItemSword || !this.getBooleanValueFromSetttingName("Sword"))) {
                    this.method16446(var2);
                    Class7789.method25873(var5, var1 - 36);
                    this.field23658.method27120();
                    break;
                }
            }
        }
    }

    public boolean method16434(ItemStack var1, int var2) {
        Item var5 = var1.getItem();
        if (var1.method32149().getString().toLowerCase().contains("(right click)")
                || var1.method32149().getString().toLowerCase().contains("(clique direito)")
                || var1.method32149().getString().toLowerCase().contains("(click derecho)")) {
            return false;
        } else if (var1.method32149().getString().toLowerCase().contains("§k||")) {
            return false;
        } else if (var2 == field23654 && method16431(mc.player.field4904.method18131(var2).method18265())) {
            return false;
        } else if (var5 instanceof Class3334 && this.getBooleanValueFromSetttingName("Auto Shield")) {
            return false;
        } else if (this.getStringSettingValueByName("Tools").equals("Throw")
                || (
                var2 != field23655 && !this.getStringSettingValueByName("Tools").equals("Keep")
                        || !method16442(mc.player.field4904.method18131(var2).method18265())
                        || field23655 < 0
        )
                && (
                var2 != field23656 && !this.getStringSettingValueByName("Tools").equals("Keep")
                        || !method16444(mc.player.field4904.method18131(var2).method18265())
                        || field23656 < 0
        )
                && (
                var2 != field23657 && !this.getStringSettingValueByName("Tools").equals("Keep")
                        || !method16443(mc.player.field4904.method18131(var2).method18265())
                        || field23657 < 0
        )) {
            if (var5 instanceof Class3279) {
                if (Class7789.method25847(var2)) {
                    return false;
                }

                for (Class2106 var9 : Class2106.values()) {
                    if (mc.player.field4904.method18131(8 - var9.method8773()).method18266()) {
                        ItemStack var10 = mc.player.field4904.method18131(8 - var9.method8773()).method18265();
                        if (!Class7789.method25872(var10)) {
                        }
                    }
                }
            }

            if (var5 instanceof Class3292
                    && (this.method16436() > (int) this.getNumberValueBySettingName("Block Cap") || BlockFly.blocksToNotPlace.contains(((Class3292) var5).method11845()))) {
                return true;
            } else if (var5 == Items.field37883 && Client.getInstance().getModuleManager().getModuleByClass(Class5258.class).isEnabled()) {
                return method16437(Items.field37883) > 1;
            } else if (var5 == Items.field37882 && Client.getInstance().getModuleManager().getModuleByClass(Class5258.class).isEnabled()) {
                return method16437(Items.field37882) > 1;
            } else if (var5 instanceof Class3323 && Class7789.method25874(var1)) {
                return true;
            } else if (var5 == Items.field37873) {
                return false;
            } else if (var5.method11744() && this.getBooleanValueFromSetttingName("Food") && var5.method11745() != Class8672.field39078) {
                return true;
            } else if (var5 instanceof Class3269 || var5 instanceof Class3264 || var5 instanceof ItemSword || var5 instanceof Class3279) {
                return true;
            } else if ((var5 instanceof Class3263 || var5 instanceof Class3308) && this.getBooleanValueFromSetttingName("Archery")) {
                return true;
            } else {
                return var5 instanceof SkullItem && this.getBooleanValueFromSetttingName("Heads") || var5.method11717().getString().toLowerCase().contains("tnt")
                        || var5.method11717().getString().toLowerCase().contains("stick")
                        || var5.method11717().getString().toLowerCase().contains("egg")
                        || var5.method11717().getString().toLowerCase().contains("string")
                        || var5.method11717().getString().toLowerCase().contains("cake")
                        || var5.method11717().getString().toLowerCase().contains("mushroom")
                        || var5.method11717().getString().toLowerCase().contains("flint")
                        || var5.method11717().getString().toLowerCase().contains("dyePowder")
                        || var5.method11717().getString().toLowerCase().contains("feather")
                        || var5.method11717().getString().toLowerCase().contains("bucket")
                        || var5.method11717().getString().toLowerCase().contains("chest") && !var1.method32149().getString().toLowerCase().contains("collect")
                        || var5.method11717().getString().toLowerCase().contains("snow")
                        || var5.method11717().getString().toLowerCase().contains("fish")
                        || var5.method11717().getString().toLowerCase().contains("enchant")
                        || var5.method11717().getString().toLowerCase().contains("exp")
                        || var5.method11717().getString().toLowerCase().contains("shears")
                        || var5.method11717().getString().toLowerCase().contains("anvil")
                        || var5.method11717().getString().toLowerCase().contains("torch")
                        || var5.method11717().getString().toLowerCase().contains("seeds")
                        || var5.method11717().getString().toLowerCase().contains("leather")
                        || var5.method11717().getString().toLowerCase().contains("reeds")
                        || var5.method11717().getString().toLowerCase().contains("record")
                        || var5.method11717().getString().toLowerCase().contains("snowball")
                        || var5 instanceof Class3328
                        || var5 == Items.field37901
                        || var5 == Items.field37840
                        || var5.method11717().getString().toLowerCase().contains("piston");
            }
        } else {
            return false;
        }
    }

    public ArrayList<Integer> method16435() {
        return this.field23661;
    }

    private int method16436() {
        int var3 = 0;

        for (int var4 = 0; var4 < 45; var4++) {
            if (mc.player.field4904.method18131(var4).method18266()) {
                ItemStack var5 = mc.player.field4904.method18131(var4).method18265();
                Item var6 = var5.getItem();
                if (var5.getItem() instanceof Class3292 && !BlockFly.blocksToNotPlace.contains(((Class3292) var6).method11845())) {
                    var3 += var5.field39976;
                }
            }
        }

        return var3;
    }

    private void method16438(int var1, boolean var2) {
        for (int var5 = 9; var5 < 45; var5++) {
            if (mc.player.field4904.method18131(var5).method18266()) {
                ItemStack var6 = mc.player.field4904.method18131(var5).method18265();
                if (method16442(var6) && field23655 != var5 && !method16431(var6)) {
                    if (mc.player.field4904.method18131(field23655).method18266()) {
                        if (!method16442(mc.player.field4904.method18131(field23655).method18265())) {
                            this.method16446(var2);
                            Class7789.method25873(var5, field23655 - 36);
                            this.field23658.method27120();
                            if (this.getNumberValueBySettingName("Delay") > 0.0F) {
                                return;
                            }
                        }
                    } else {
                        this.method16446(var2);
                        Class7789.method25873(var5, field23655 - 36);
                        this.field23658.method27120();
                        if (this.getNumberValueBySettingName("Delay") > 0.0F) {
                            return;
                        }
                    }
                }
            }
        }
    }

    private void method16439(int var1, boolean var2) {
        for (int var5 = 9; var5 < 45; var5++) {
            if (mc.player.field4904.method18131(var5).method18266()) {
                ItemStack var6 = mc.player.field4904.method18131(var5).method18265();
                if (method16443(var6) && field23657 != var5 && !method16431(var6)) {
                    if (mc.player.field4904.method18131(field23657).method18266()) {
                        if (!method16443(mc.player.field4904.method18131(field23657).method18265())) {
                            this.method16446(var2);
                            Class7789.method25873(var5, field23657 - 36);
                            this.field23658.method27120();
                            if (this.getNumberValueBySettingName("Delay") > 0.0F) {
                                return;
                            }
                        }
                    } else {
                        this.method16446(var2);
                        Class7789.method25873(var5, field23657 - 36);
                        this.field23658.method27120();
                        if (this.getNumberValueBySettingName("Delay") > 0.0F) {
                            return;
                        }
                    }
                }
            }
        }
    }

    private void method16440(int var1, boolean var2) {
        for (int var5 = 9; var5 < 45; var5++) {
            if (mc.player.field4904.method18131(var5).method18266()) {
                ItemStack var6 = mc.player.field4904.method18131(var5).method18265();
                if (method16444(var6) && field23656 != var5 && !method16431(var6)) {
                    if (mc.player.field4904.method18131(field23656).method18266()) {
                        if (!method16444(mc.player.field4904.method18131(field23656).method18265())) {
                            this.method16446(var2);
                            Class7789.method25873(var5, field23656 - 36);
                            this.field23658.method27120();
                            if (this.getNumberValueBySettingName("Delay") > 0.0F) {
                                return;
                            }
                        }
                    } else {
                        this.method16446(var2);
                        Class7789.method25873(var5, field23656 - 36);
                        this.field23658.method27120();
                        if (this.getNumberValueBySettingName("Delay") > 0.0F) {
                            return;
                        }
                    }
                }
            }
        }
    }

    private void method16441(boolean var1) {
        if (!mc.player.field4904.method18131(45).method18266()) {
            for (int var4 = 9; var4 < 45; var4++) {
                ItemStack var5 = mc.player.field4904.method18131(var4).method18265();
                if (var5.getItem() instanceof Class3334) {
                    this.method16446(var1);
                    this.field23658.method27120();
                    Class7789.method25870(mc.player.field4904.field25471, var4, 0, Class2259.field14694, mc.player, true);
                    this.field23660 = true;
                    return;
                }
            }
        }
    }

    private void method16446(boolean var1) {
        if (var1 && this.field23659 && !(mc.currentScreen instanceof InventoryScreen) && Class8005.method27349() <= Class5989.field26136.method18582()) {
            mc.getConnection().sendPacket(new CClientStatusPacket(CClientStatusPacketState.field14279));
            this.field23659 = false;
        }
    }
}