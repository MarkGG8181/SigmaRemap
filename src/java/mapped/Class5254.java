package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4420;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.PremiumModule;
import com.mentalfrostbyte.jello.unmapped.Class8005;
import com.mentalfrostbyte.jello.util.timer.Timer;
import org.lwjgl.opengl.GL11;

import java.util.*;
import java.util.stream.Collectors;

public class Class5254 extends PremiumModule {
    private static float field23629;
    private static float field23630;
    private static boolean field23631;
    private static final boolean field23634 = false;
    private final Timer field23628 = new Timer();
    private BlockPos field23632;
    private Entity field23633;
    private Runnable field23635 = null;
    private int field23636;
    private List<BlockPos> field23637 = new ArrayList<BlockPos>();

    public Class5254() {
        super("AutoCrystal", "Automatically detonates crystals", ModuleCategory.WORLD);
        this.method15972(new Class6005("Mode", "Mode", 0, "Single", "Switch"));
        this.method15972(new Class6009<Float>("Range", "Range value", 4.0F, Float.class, 2.8F, 8.0F, 0.01F));
        this.method15972(new Class6009<Float>("CPS", "Click per seconds", 9.0F, Float.class, 1.0F, 20.0F, 1.0F));
        this.method15972(new Class6004("Players", "Hit players", true));
        this.method15972(new Class6004("Animals/Monsters", "Hit animals and monsters", false));
        this.method15972(new Class6004("Invisible", "Hit invisible entites", true));
    }

    public static BlockPos method16376() {
        return new BlockPos(
                Math.floor(mc.field1339.getPosX()), Math.floor(mc.field1339.getPosY()), Math.floor(mc.field1339.getPosZ())
        );
    }

    public static float method16380(double var0, double var2, double var4, Entity var6) {
        float var9 = 12.0F;
        double var10 = Math.sqrt(var6.method3276(var0, var2, var4)) / (double) var9;
        Vector3d var12 = new Vector3d(var0, var2, var4);
        double var13 = Class7782.method25783(var12, var6);
        double var15 = (1.0 - var10) * var13;
        float var17 = (float) ((int) ((var15 * var15 + var15) / 2.0 * 7.0 * (double) var9 + 1.0));
        double var18 = 1.0;
        if (var6 instanceof Class880) {
            var18 = method16382(
                    (Class880) var6, method16381(var17), new Class7782(mc.field1338, null, null, null, var0, var2, var4, 6.0F, false, Class2141.field14015)
            );
        }

        return (float) var18;
    }

    private static float method16381(float var0) {
        int var3 = mc.field1338.method6997().method8905();
        return var0 * (var3 != 0 ? (var3 != 2 ? (var3 != 1 ? 1.5F : 0.5F) : 1.0F) : 0.0F);
    }

    public static float method16382(Class880 var0, float var1, Class7782 var2) {
        if (!(var0 instanceof PlayerEntity)) {
            return Class8913.method32581(var1, (float) var0.method3070(), (float) var0.method3086(Class9173.field42114));
        } else {
            PlayerEntity var5 = (PlayerEntity) var0;
            Class8654 var6 = Class8654.method31126(var2);
            var1 = Class8913.method32581(var1, (float) var5.method3070(), (float) var5.method3086(Class9173.field42114));
            int var7 = Class7858.method26317(var5.method2947(), var6);
            float var8 = Class9679.method37777((float) var7, 0.0F, 20.0F);
            var1 *= 1.0F - var8 / 25.0F;
            if (var0.method3033(Class7144.method22287(11))) {
                var1 -= var1 / 4.0F;
            }

            return Math.max(var1 - var5.method2959(), 0.0F);
        }
    }

    private static void method16383() {
        if (field23631) {
            field23629 = mc.field1339.field5031;
            field23630 = mc.field1339.field5032;
            field23631 = false;
        }
    }

    // $VF: synthetic method
    public static Minecraft method16394() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16395() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16396() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16397() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16398() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16399() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16400() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16401() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16402() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16403() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16404() {
        return mc;
    }

    @Override
    public void isInDevelopment() {
        this.field23628.method27120();
        this.field23628.method27118();
        this.field23635 = null;
    }

    @EventTarget
    public void method16374(Class4399 var1) {
        if (!var1.method13921()) {
            if (this.field23635 != null) {
                this.field23635.run();
                this.field23635 = null;
            }
        } else {
            this.field23636++;
            List var4 = this.method16385(20.0F);
            if (var4 == null || var4.isEmpty()) {
                this.field23633 = null;
                return;
            }

            this.field23633 = (Entity) var4.get(0);
            if ((float) this.field23636 >= 20.0F / this.method15977("CPS")) {
                Class1001 var5 = mc.field1338
                        .method6772(
                                Entity.class, this.field23633.field5035.method19662(2.0, 4.0, 2.0).method19662(-2.0, -3.0, -2.0), var0 -> var0 instanceof Class1001
                        )
                        .stream()
                        .map(var0 -> (Class1001) var0)
                        .filter(var0 -> var0.method3275(mc.field1339) < 6.0F)
                        .filter(var1x -> (double) var1x.method3275(this.field23633) < 3.6)
                        .min(Comparator.comparing(var1x -> method16380(var1x.getPosX(), var1x.getPosY(), var1x.getPosZ(), this.field23633)))
                        .orElse(null);
                if (var5 != null) {
                    Class7461 var9 = Class9142.method34148(var5.field5028);
                    var1.method13918(var9.field32084);
                    var1.method13916(var9.field32085);
                    this.field23636 = 0;
                    this.field23635 = new Class540(this, var5);
                    return;
                }
            }

            int var8 = this.method16386();
            if (var8 < 0) {
                return;
            }

            this.field23637 = this.method16377();
            this.field23637
                    .sort(Comparator.comparing(var1x -> this.field23633.method3276(var1x.field13027, var1x.field13028, var1x.field13029)));
            if (this.field23637 != null && !this.field23637.isEmpty()) {
                BlockPos var6 = this.field23637
                        .stream()
                        .max(
                                Comparator.comparing(
                                        var1x -> method16380(var1x.method8304(), var1x.getY(), var1x.method8306(), this.field23633)
                                )
                        )
                        .orElse(null);
                if (var6 != null) {
                    Class7461 var7 = Class9142.method34148(
                            new Vector3d((double) var6.field13027 + 0.5, (double) var6.field13028 + 0.5, (double) var6.field13029 + 0.5)
                    );
                    var1.method13918(var7.field32084);
                    var1.method13916(var7.field32085);
                    this.field23635 = new Class335(this, var6, var8);
                }
            }
        }
    }

    @EventTarget
    public void method16375(Class4420 var1) {
        int var4 = Class5628.method17688(100000000, 0.2F);
        GL11.glPushMatrix();
        GL11.glDisable(2929);

        for (BlockPos var6 : this.field23637) {
            double var7 = (double) var6.method8304() - mc.field1295.method768().method37504().method11320();
            double var9 = (double) var6.getY() - mc.field1295.method768().method37504().method11321();
            double var11 = (double) var6.method8306() - mc.field1295.method768().method37504().method11322();
            Class9388 var13 = new Class9388(var7, var9 + 1.0, var11, var7 + 1.0, var9 + 1.0, var11 + 1.0);
            Class3192.method11459(var13, var4);
        }

        var4 = Class5628.method17688(9000000, 1.0F);
        if (this.field23633 != null) {
            double var14 = this.field23633.getPosX() - mc.field1295.method768().method37504().method11320();
            double var19 = this.field23633.getPosY() - mc.field1295.method768().method37504().method11321() + 0.5;
            double var20 = this.field23633.getPosZ() - mc.field1295.method768().method37504().method11322();
            float var16 = 0.3F;
            Class9388 var17 = new Class9388(var14 - (double) var16, var19 + 0.9, var20 - (double) var16, var14 + (double) var16, var19 + 1.0, var20 + (double) var16);
            Class3192.method11459(var17, var4);
        }

        GL11.glEnable(2929);
        GL11.glPopMatrix();
    }

    private List<BlockPos> method16377() {
        Class25 var3 = Class25.method67();
        var3.addAll(this.method16379(method16376(), 6.0F, 6, false, true, 0).stream().filter(this::method16378).collect(Collectors.toList()));
        return var3;
    }

    private boolean method16378(BlockPos var1) {
        BlockPos var4 = var1.method8336(0, 1, 0);
        BlockPos var5 = var1.method8336(0, 2, 0);
        return (
                mc.field1338.method6738(var1).method23383() == Blocks.BEDROCK
                        || mc.field1338.method6738(var1).method23383() == Blocks.field36527
        )
                && mc.field1338.method6738(var4).method23383() == Blocks.AIR
                && mc.field1338.method6738(var5).method23383() == Blocks.AIR
                && mc.field1338.method7182(Entity.class, new Class6488(var4)).isEmpty();
    }

    public List<BlockPos> method16379(BlockPos var1, float var2, int var3, boolean var4, boolean var5, int var6) {
        ArrayList var9 = new ArrayList();
        int var10 = var1.method8304();
        int var11 = var1.getY();
        int var12 = var1.method8306();

        for (int var13 = var10 - (int) var2; (float) var13 <= (float) var10 + var2; var13++) {
            for (int var14 = var12 - (int) var2; (float) var14 <= (float) var12 + var2; var14++) {
                for (int var15 = !var5 ? var11 : var11 - (int) var2; (float) var15 < (!var5 ? (float) (var11 + var3) : (float) var11 + var2); var15++) {
                    double var16 = (var10 - var13) * (var10 - var13) + (var12 - var14) * (var12 - var14) + (!var5 ? 0 : (var11 - var15) * (var11 - var15));
                    if (var16 < (double) (var2 * var2) && (!var4 || !(var16 < (double) ((var2 - 1.0F) * (var2 - 1.0F))))) {
                        BlockPos var18 = new BlockPos(var13, var15 + var6, var14);
                        var9.add(var18);
                    }
                }
            }
        }

        return var9;
    }

    private void method16384(Vector3d var1) {
        Class7461 var4 = Class9142.method34148(var1);
        field23629 = var4.field32084;
        field23630 = var4.field32085;
        field23631 = true;
    }

    public List<Entity> method16385(float var1) {
        List var4 = Class5628.method17708();
        Iterator var5 = var4.iterator();

        while (var5.hasNext()) {
            Entity var6 = (Entity) var5.next();
            if (var6 != mc.field1339) {
                if (!Client.getInstance().getFriendManager().method26997(var6)) {
                    if (var6 instanceof Class880) {
                        if (((Class880) var6).method3042() != 0.0F) {
                            if (!(mc.field1339.method3275(var6) > var1)) {
                                if (mc.field1339.method3026((Class880) var6)) {
                                    if (!(var6 instanceof Class1005)) {
                                        if (!this.method15974("Players") && var6 instanceof PlayerEntity) {
                                            var5.remove();
                                        } else if (var6 instanceof PlayerEntity && Client.getInstance().getCombatManager().method29346(var6)) {
                                            var5.remove();
                                        } else if (!this.method15974("Invisible") && var6.method3342()) {
                                            var5.remove();
                                        } else if (!this.method15974("Animals/Monsters") && !(var6 instanceof PlayerEntity)) {
                                            var5.remove();
                                        } else if (mc.field1339.method3421() != null && mc.field1339.method3421().equals(var6)) {
                                            var5.remove();
                                        } else if (!var6.method3362()) {
                                            if (var6 instanceof PlayerEntity
                                                    && Class8781.method31662((PlayerEntity) var6)
                                                    && Client.getInstance().getModuleManager().method14662(Class5275.class).method15996()) {
                                                var5.remove();
                                            }
                                        } else {
                                            var5.remove();
                                        }
                                    } else {
                                        var5.remove();
                                    }
                                } else {
                                    var5.remove();
                                }
                            } else {
                                var5.remove();
                            }
                        } else {
                            var5.remove();
                        }
                    } else {
                        var5.remove();
                    }
                } else {
                    var5.remove();
                }
            } else {
                var5.remove();
            }
        }

        Collections.sort(var4, new Class3603(this));
        return var4;
    }

    public int method16386() {
        for (int var3 = 36; var3 < 45; var3++) {
            if (mc.field1339.field4904.method18131(var3).method18266()) {
                Class8848 var4 = mc.field1339.field4904.method18131(var3).method18265();
                if (var4.method32107() == Class8514.field38108) {
                    return var3 - 36;
                }
            }
        }

        for (int var5 = 9; var5 < 36; var5++) {
            if (mc.field1339.field4904.method18131(var5).method18266()) {
                Class8848 var6 = mc.field1339.field4904.method18131(var5).method18265();
                if (var6.method32107() == Class8514.field38108) {
                    if (Class8005.method27349() <= Class5989.field26136.method18582()) {
                        mc.getClientPlayNetHandler().sendPacket(new Class5564(Class2175.field14279));
                    }

                    Class7789.method25873(var5, 8);
                    mc.getClientPlayNetHandler().sendPacket(new Class5482(-1));
                    return 5;
                }
            }
        }

        return -1;
    }
}