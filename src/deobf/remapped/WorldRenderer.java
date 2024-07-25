package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonSyntaxException;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.Nullable;
import net.minecraft.util.text.StringTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class WorldRenderer implements class_6491, AutoCloseable {
   private static final Logger LOGGER = LogManager.getLogger();
   private static final Identifier MOON_PHASES = new Identifier("textures/environment/moon_phases.png");
   private static final Identifier SUN = new Identifier("textures/environment/sun.png");
   private static final Identifier CLOUDS = new Identifier("textures/environment/clouds.png");
   private static final Identifier END_SKY = new Identifier("textures/environment/end_sky.png");
   private static final Identifier FORCEFIELD = new Identifier("textures/misc/forcefield.png");
   private static final Identifier RAIN = new Identifier("textures/environment/rain.png");
   private static final Identifier SNOW = new Identifier("textures/environment/snow.png");
   public static final Direction[] DIRECTIONS = Direction.values();
   private final MinecraftClient client;
   private final TextureManager textureManager;
   public final EntityRenderDispatcher field_20988;
   private final class_3017 field_20973;
   private class_174 field_20970;
   private Set<class_3511> field_20924 = new ObjectLinkedOpenHashSet();
   private ObjectList<class_1261> field_20982 = new ObjectArrayList(69696);
   private final Set<class_3757> field_20972 = Sets.newHashSet();
   private class_7626 field_20966;
   private final class_2868 field_20943 = class_7985.field_40915;
   private class_7995 field_20962;
   private class_7995 field_20955;
   private class_7995 field_20984;
   private boolean field_20986 = true;
   private class_7995 field_20947;
   private final class_9119 field_20989 = new class_9119(100);
   private int field_20997;
   private final Int2ObjectMap<class_9259> field_20945 = new Int2ObjectOpenHashMap();
   private final Long2ObjectMap<SortedSet<class_9259>> field_20948 = new Long2ObjectOpenHashMap();
   private final Map<class_1331, class_3560> field_20971 = Maps.newHashMap();
   public class_4230 field_21000;
   private class_4067 field_20926;
   private class_4230 field_21001;
   private class_4230 field_20929;
   private class_4230 field_20996;
   private class_4230 field_20958;
   private class_4230 field_21006;
   private class_4067 field_20930;
   private double field_20964 = Double.MIN_VALUE;
   private double field_21002 = Double.MIN_VALUE;
   private double field_20954 = Double.MIN_VALUE;
   private int field_20933 = Integer.MIN_VALUE;
   private int field_21007 = Integer.MIN_VALUE;
   private int field_21013 = Integer.MIN_VALUE;
   private double field_20999 = Double.MIN_VALUE;
   private double field_20925 = Double.MIN_VALUE;
   private double field_20978 = Double.MIN_VALUE;
   private double field_20993 = Double.MIN_VALUE;
   private double field_20995 = Double.MIN_VALUE;
   private int field_20944 = Integer.MIN_VALUE;
   private int field_20919 = Integer.MIN_VALUE;
   private int field_20957 = Integer.MIN_VALUE;
   private class_1343 field_20975 = class_1343.field_7335;
   private class_9655 field_20992;
   private class_6705 field_20968;
   private final class_2868 field_20969 = class_7985.field_40918;
   private int field_20922 = -1;
   private int field_20937;
   private int field_20979;
   private boolean field_20987;
   private class_2359 field_20946;
   private final class_2637[] field_21004 = new class_2637[8];
   private final class_7370 field_21012 = new class_7370(0.0, 0.0, 0.0);
   private double field_20952;
   private double field_20991;
   private double field_20939;
   private boolean field_20985 = true;
   private int field_20959;
   private int field_20965;
   private final float[] field_20931 = new float[1024];
   private final float[] field_21014 = new float[1024];
   public Entity field_21016;
   public Set field_20941 = new LinkedHashSet();
   public Set field_20921 = new LinkedHashSet();
   private Set<class_3511> field_20983 = new ObjectLinkedOpenHashSet();
   private Deque field_20980 = new ArrayDeque();
   private List<class_1261> field_20961 = new ArrayList<class_1261>(1024);
   private List<class_1261> field_21011 = new ArrayList<class_1261>(1024);
   private ObjectList field_20949 = new ObjectArrayList(1024);
   private List field_20934 = new ArrayList(1024);
   private List field_20976 = new ArrayList(1024);
   private ObjectList field_21015 = new ObjectArrayList(1024);
   private List field_20940 = new ArrayList(1024);
   private List field_20950 = new ArrayList(1024);
   private int field_20927 = 0;
   private int field_20981 = 0;
   private static final Set field_21003 = Collections.<Direction>unmodifiableSet(new HashSet(Arrays.asList(Direction.field_803)));
   private int field_20920;
   private int field_20963 = 0;
   private class_4460 field_20960 = new class_4460(class_4783.field_23184.method_29260(), new class_1331(0, 0, 0));
   public boolean field_20932 = false;
   public boolean field_20923 = false;
   private boolean field_21009 = false;
   private static int field_20953 = 0;
   public int field_20956 = -1;
   public static final int field_20998 = 201435902;
   private static boolean field_21005 = false;
   private Map<String, List<Entity>> field_20974 = new HashMap<String, List<Entity>>();
   private Map<RenderLayer, Map> field_20967 = new LinkedHashMap<class_3581, Map>();

   @Nullable
   private class_3511 method_20003(class_1331 var1, class_3511 var2, Direction var3) {
      class_1331 var4 = var2.method_16143(var3);
      if (class_9299.method_42805(var1.method_12173() - var4.method_12173()) > this.field_20922 * 16) {
         return null;
      } else if (var4.method_12165() >= 0 && var4.method_12165() < 256) {
         return class_9299.method_42805(var1.method_12185() - var4.method_12185()) > this.field_20922 * 16 ? null : this.field_20966.method_34563(var4);
      } else {
         return null;
      }
   }

   public WorldRenderer(MinecraftClient var1, class_3017 var2) {
      this.client = var1;
      this.field_20988 = var1.method_8587();
      this.field_20973 = var2;
      this.textureManager = var1.method_8577();

      for (int var3 = 0; var3 < 32; var3++) {
         for (int var4 = 0; var4 < 32; var4++) {
            float var5 = (float)(var4 - 16);
            float var6 = (float)(var3 - 16);
            float var7 = class_9299.method_42843(var5 * var5 + var6 * var6);
            this.field_20931[var3 << 5 | var4] = -var6 / var7;
            this.field_21014[var3 << 5 | var4] = var5 / var7;
         }
      }

      this.method_20039();
      this.method_20074();
      this.method_20050();
   }

   private void method_20072(class_5778 var1, float var2, double var3, double var5, double var7) {
      if (class_7860.field_40157.method_3596()) {
         class_4159 var9 = (class_4159)class_7860.method_35555(this.field_20970.method_738(), class_7860.field_40157);
         if (var9 != null) {
            var9.method_19298(this.field_20997, var2, this.field_20970, this.client, var1, var3, var5, var7);
            return;
         }
      }

      float var48 = this.client.field_9601.method_29578(var2);
      if (!(var48 <= 0.0F)) {
         if (class_3111.method_14421()) {
            return;
         }

         var1.method_26126();
         class_174 var10 = this.client.field_9601;
         int var11 = class_9299.method_42847(var3);
         int var12 = class_9299.method_42847(var5);
         int var13 = class_9299.method_42847(var7);
         class_8042 var14 = class_8042.method_36499();
         class_9633 var15 = var14.method_36501();
         class_3542.method_16374();
         class_3542.method_16393();
         class_3542.method_16465(0.0F, 1.0F, 0.0F);
         class_3542.method_16488();
         class_3542.method_16437();
         class_3542.method_16433();
         class_3542.method_16428();
         byte var16 = 5;
         if (class_3111.method_14283()) {
            var16 = 10;
         }

         class_3542.method_16387(MinecraftClient.method_8497());
         byte var17 = -1;
         float var18 = (float)this.field_20997 + var2;
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         class_2921 var19 = new class_2921();

         for (int var20 = var13 - var16; var20 <= var13 + var16; var20++) {
            for (int var21 = var11 - var16; var21 <= var11 + var16; var21++) {
               int var22 = (var20 - var13 + 16) * 32 + var21 - var11 + 16;
               double var23 = (double)this.field_20931[var22] * 0.5;
               double var25 = (double)this.field_21014[var22] * 0.5;
               var19.method_13362(var21, 0, var20);
               class_6325 var27 = var10.method_22561(var19);
               if (var27.method_28866() != class_6750.field_34851) {
                  int var28 = var10.method_22563(class_3801.field_18595, var19).method_12165();
                  int var29 = var12 - var16;
                  int var30 = var12 + var16;
                  if (var29 < var28) {
                     var29 = var28;
                  }

                  if (var30 < var28) {
                     var30 = var28;
                  }

                  int var31 = var28;
                  if (var28 < var12) {
                     var31 = var12;
                  }

                  if (var29 != var30) {
                     Random var32 = new Random((long)(var21 * var21 * 3121 + var21 * 45238971 ^ var20 * var20 * 418711 + var20 * 13761));
                     var19.method_13362(var21, var29, var20);
                     float var33 = var27.method_28865(var19);
                     if (var33 >= 0.15F) {
                        if (var17 != 0) {
                           if (var17 >= 0) {
                              var14.method_36500();
                           }

                           var17 = 0;
                           this.client.method_8577().method_35674(RAIN);
                           var15.method_44471(7, class_7985.field_40902);
                        }

                        int var34 = this.field_20997 + var21 * var21 * 3121 + var21 * 45238971 + var20 * var20 * 418711 + var20 * 13761 & 31;
                        float var35 = -((float)var34 + var2) / 32.0F * (3.0F + var32.nextFloat());
                        double var36 = (double)((float)var21 + 0.5F) - var3;
                        double var38 = (double)((float)var20 + 0.5F) - var7;
                        float var40 = class_9299.method_42842(var36 * var36 + var38 * var38) / (float)var16;
                        float var41 = ((1.0F - var40 * var40) * 0.5F + 0.5F) * var48;
                        var19.method_13362(var21, var31, var20);
                        int var42 = method_20002(var10, var19);
                        var15.method_35761((double)var21 - var3 - var23 + 0.5, (double)var30 - var5, (double)var20 - var7 - var25 + 0.5)
                           .method_35745(0.0F, (float)var29 * 0.25F + var35)
                           .method_35742(1.0F, 1.0F, 1.0F, var41)
                           .method_35747(var42)
                           .method_35735();
                        var15.method_35761((double)var21 - var3 + var23 + 0.5, (double)var30 - var5, (double)var20 - var7 + var25 + 0.5)
                           .method_35745(1.0F, (float)var29 * 0.25F + var35)
                           .method_35742(1.0F, 1.0F, 1.0F, var41)
                           .method_35747(var42)
                           .method_35735();
                        var15.method_35761((double)var21 - var3 + var23 + 0.5, (double)var29 - var5, (double)var20 - var7 + var25 + 0.5)
                           .method_35745(1.0F, (float)var30 * 0.25F + var35)
                           .method_35742(1.0F, 1.0F, 1.0F, var41)
                           .method_35747(var42)
                           .method_35735();
                        var15.method_35761((double)var21 - var3 - var23 + 0.5, (double)var29 - var5, (double)var20 - var7 - var25 + 0.5)
                           .method_35745(0.0F, (float)var30 * 0.25F + var35)
                           .method_35742(1.0F, 1.0F, 1.0F, var41)
                           .method_35747(var42)
                           .method_35735();
                     } else {
                        if (var17 != 1) {
                           if (var17 >= 0) {
                              var14.method_36500();
                           }

                           var17 = 1;
                           this.client.method_8577().method_35674(SNOW);
                           var15.method_44471(7, class_7985.field_40902);
                        }

                        float var49 = -((float)(this.field_20997 & 511) + var2) / 512.0F;
                        float var50 = (float)(var32.nextDouble() + (double)var18 * 0.01 * (double)((float)var32.nextGaussian()));
                        float var51 = (float)(var32.nextDouble() + (double)(var18 * (float)var32.nextGaussian()) * 0.001);
                        double var37 = (double)((float)var21 + 0.5F) - var3;
                        double var39 = (double)((float)var20 + 0.5F) - var7;
                        float var52 = class_9299.method_42842(var37 * var37 + var39 * var39) / (float)var16;
                        float var53 = ((1.0F - var52 * var52) * 0.3F + 0.5F) * var48;
                        var19.method_13362(var21, var31, var20);
                        int var43 = method_20002(var10, var19);
                        int var44 = var43 >> 16 & 65535;
                        int var45 = (var43 & 65535) * 3;
                        int var46 = (var44 * 3 + 240) / 4;
                        int var47 = (var45 * 3 + 240) / 4;
                        var15.method_35761((double)var21 - var3 - var23 + 0.5, (double)var30 - var5, (double)var20 - var7 - var25 + 0.5)
                           .method_35745(0.0F + var50, (float)var29 * 0.25F + var49 + var51)
                           .method_35742(1.0F, 1.0F, 1.0F, var53)
                           .method_35748(var47, var46)
                           .method_35735();
                        var15.method_35761((double)var21 - var3 + var23 + 0.5, (double)var30 - var5, (double)var20 - var7 + var25 + 0.5)
                           .method_35745(1.0F + var50, (float)var29 * 0.25F + var49 + var51)
                           .method_35742(1.0F, 1.0F, 1.0F, var53)
                           .method_35748(var47, var46)
                           .method_35735();
                        var15.method_35761((double)var21 - var3 + var23 + 0.5, (double)var29 - var5, (double)var20 - var7 + var25 + 0.5)
                           .method_35745(1.0F + var50, (float)var30 * 0.25F + var49 + var51)
                           .method_35742(1.0F, 1.0F, 1.0F, var53)
                           .method_35748(var47, var46)
                           .method_35735();
                        var15.method_35761((double)var21 - var3 - var23 + 0.5, (double)var29 - var5, (double)var20 - var7 - var25 + 0.5)
                           .method_35745(0.0F + var50, (float)var30 * 0.25F + var49 + var51)
                           .method_35742(1.0F, 1.0F, 1.0F, var53)
                           .method_35748(var47, var46)
                           .method_35735();
                     }
                  }
               }
            }
         }

         if (var17 >= 0) {
            var14.method_36500();
         }

         class_3542.method_16361();
         class_3542.method_16448();
         class_3542.method_16433();
         class_3542.method_16458();
         var1.method_26122();
      }
   }

   public void method_20011(Camera var1) {
      float var2 = this.client.field_9601.method_29578(1.0F) / (MinecraftClient.method_8528() ? 1.0F : 2.0F);
      if (!class_3111.method_14283()) {
         var2 /= 2.0F;
      }

      if (!(var2 <= 0.0F) && class_3111.method_14356()) {
         Random var3 = new Random((long)this.field_20997 * 312987231L);
         class_174 var4 = this.client.field_9601;
         class_1331 var5 = new class_1331(var1.method_41627());
         class_1331 var6 = null;
         int var7 = (int)(100.0F * var2 * var2) / (this.client.field_9577.field_45505 == class_9761.field_49576 ? 2 : 1);

         for (int var8 = 0; var8 < var7; var8++) {
            int var9 = var3.nextInt(21) - 10;
            int var10 = var3.nextInt(21) - 10;
            class_1331 var11 = var4.method_22563(class_3801.field_18595, var5.method_6104(var9, 0, var10)).method_6100();
            class_6325 var12 = var4.method_22561(var11);
            if (var11.method_12165() > 0
               && var11.method_12165() <= var5.method_12165() + 10
               && var11.method_12165() >= var5.method_12165() - 10
               && var12.method_28866() == class_6750.field_34844
               && var12.method_28865(var11) >= 0.15F) {
               var6 = var11;
               if (this.client.field_9577.field_45505 == class_9761.field_49573) {
                  break;
               }

               double var13 = var3.nextDouble();
               double var15 = var3.nextDouble();
               class_2522 var17 = var4.method_28262(var11);
               class_4774 var18 = var4.method_28258(var11);
               class_4190 var19 = var17.method_8324(var4, var11);
               double var20 = var19.method_19499(class_9249.field_47216, var13, var15);
               double var22 = (double)var18.method_22008(var4, var11);
               double var24 = Math.max(var20, var22);
               class_2427 var26 = !var18.method_22007(class_6503.field_33095) && !var17.method_8350(class_4783.field_23215) && !class_8474.method_39004(var17)
                  ? class_3090.field_15386
                  : class_3090.field_15376;
               this.client
                  .field_9601
                  .method_43361(
                     var26, (double)var11.method_12173() + var13, (double)var11.method_12165() + var24, (double)var11.method_12185() + var15, 0.0, 0.0, 0.0
                  );
            }
         }

         if (var6 != null && var3.nextInt(3) < this.field_20965++) {
            this.field_20965 = 0;
            if (var6.method_12165() > var5.method_12165() + 1
               && var4.method_22563(class_3801.field_18595, var5).method_12165() > class_9299.method_42848((float)var5.method_12165())) {
               this.client.field_9601.method_721(var6, class_463.field_2554, class_562.field_3330, 0.1F, 0.5F, false);
            } else {
               this.client.field_9601.method_721(var6, class_463.field_2741, class_562.field_3330, 0.2F, 1.0F, false);
            }
         }
      }
   }

   @Override
   public void close() {
      if (this.field_20926 != null) {
         this.field_20926.close();
      }

      if (this.field_20930 != null) {
         this.field_20930.close();
      }
   }

   @Override
   public void method_29609(class_7832 var1) {
      this.textureManager.method_35674(FORCEFIELD);
      class_3542.method_16490(3553, 10242, 10497);
      class_3542.method_16490(3553, 10243, 10497);
      class_3542.method_16446(0);
      this.method_20026();
      if (MinecraftClient.method_8497()) {
         this.method_20048();
      }
   }

   public void method_20026() {
      if (this.field_20926 != null) {
         this.field_20926.close();
      }

      Identifier var1 = new Identifier("shaders/post/entity_outline.json");

      try {
         this.field_20926 = new class_4067(this.client.method_8577(), this.client.method_8498(), this.client.method_8584(), var1);
         this.field_20926.method_18750(this.client.method_8552().method_43178(), this.client.method_8552().method_43198());
         this.field_21000 = this.field_20926.method_18758("final");
      } catch (IOException var3) {
         LOGGER.warn("Failed to load shader: {}", var1, var3);
         this.field_20926 = null;
         this.field_21000 = null;
      } catch (JsonSyntaxException var4) {
         LOGGER.warn("Failed to parse shader: {}", var1, var4);
         this.field_20926 = null;
         this.field_21000 = null;
      }
   }

   private void method_20048() {
      this.method_20021();
      Identifier var1 = new Identifier("shaders/post/transparency.json");

      try {
         class_4067 var2 = new class_4067(this.client.method_8577(), this.client.method_8498(), this.client.method_8584(), var1);
         var2.method_18750(this.client.method_8552().method_43178(), this.client.method_8552().method_43198());
         class_4230 var10 = var2.method_18758("translucent");
         class_4230 var11 = var2.method_18758("itemEntity");
         class_4230 var12 = var2.method_18758("particles");
         class_4230 var14 = var2.method_18758("weather");
         class_4230 var7 = var2.method_18758("clouds");
         this.field_20930 = var2;
         this.field_21001 = var10;
         this.field_20929 = var11;
         this.field_20996 = var12;
         this.field_20958 = var14;
         this.field_21006 = var7;
      } catch (Exception var9) {
         String var3 = var9 instanceof JsonSyntaxException ? "parse" : "load";
         String var4 = "Failed to " + var3 + " shader: " + var1;
         class_7320 var5 = new class_7320(var4, var9);
         if (this.client.method_8521().method_29123().size() > 1) {
            StringTextComponent var6;
            try {
               var6 = new StringTextComponent(this.client.method_8498().method_35458(var1).method_18579());
            } catch (IOException var8) {
               var6 = null;
            }

            this.client.field_9577.field_45397 = class_4615.field_22437;
            this.client.method_8615(var5, var6);
         } else {
            class_159 var13 = this.client.method_8546(new class_159(var4, var5));
            this.client.field_9577.field_45397 = class_4615.field_22437;
            this.client.field_9577.method_40873();
            LOGGER.fatal(var4, var5);
            this.client.method_8593();
            MinecraftClient.method_8608(var13);
         }
      }
   }

   private void method_20021() {
      if (this.field_20930 != null) {
         this.field_20930.close();
         this.field_21001.method_19722();
         this.field_20929.method_19722();
         this.field_20996.method_19722();
         this.field_20958.method_19722();
         this.field_21006.method_19722();
         this.field_20930 = null;
         this.field_21001 = null;
         this.field_20929 = null;
         this.field_20996 = null;
         this.field_20958 = null;
         this.field_21006 = null;
      }
   }

   public void method_20069() {
      if (this.method_20036()) {
         class_3542.method_16488();
         class_3542.method_16425(class_5033.field_26042, class_8535.field_43697, class_5033.field_26048, class_8535.field_43691);
         this.field_21000.method_19714(this.client.method_8552().method_43178(), this.client.method_8552().method_43198(), false);
         class_3542.method_16448();
      }
   }

   public boolean method_20036() {
      return !class_3111.method_14424() && !class_3111.method_14248()
         ? this.field_21000 != null && this.field_20926 != null && this.client.field_9632 != null
         : false;
   }

   private void method_20050() {
      class_8042 var1 = class_8042.method_36499();
      class_9633 var2 = var1.method_36501();
      if (this.field_20984 != null) {
         this.field_20984.close();
      }

      this.field_20984 = new class_7995(this.field_20943);
      this.method_20078(var2, -16.0F, true);
      var2.method_44487();
      this.field_20984.method_36285(var2);
   }

   private void method_20074() {
      class_8042 var1 = class_8042.method_36499();
      class_9633 var2 = var1.method_36501();
      if (this.field_20955 != null) {
         this.field_20955.close();
      }

      this.field_20955 = new class_7995(this.field_20943);
      this.method_20078(var2, 16.0F, false);
      var2.method_44487();
      this.field_20955.method_36285(var2);
   }

   private void method_20078(class_9633 var1, float var2, boolean var3) {
      byte var4 = 64;
      byte var5 = 6;
      var1.method_44471(7, class_7985.field_40915);
      int var6 = (this.field_20927 / 64 + 1) * 64 + 64;

      for (int var7 = -var6; var7 <= var6; var7 += 64) {
         for (int var8 = -var6; var8 <= var6; var8 += 64) {
            float var9 = (float)var7;
            float var10 = (float)(var7 + 64);
            if (var3) {
               var10 = (float)var7;
               var9 = (float)(var7 + 64);
            }

            var1.method_35761((double)var9, (double)var2, (double)var8).method_35735();
            var1.method_35761((double)var10, (double)var2, (double)var8).method_35735();
            var1.method_35761((double)var10, (double)var2, (double)(var8 + 64)).method_35735();
            var1.method_35761((double)var9, (double)var2, (double)(var8 + 64)).method_35735();
         }
      }
   }

   private void method_20039() {
      class_8042 var1 = class_8042.method_36499();
      class_9633 var2 = var1.method_36501();
      if (this.field_20962 != null) {
         this.field_20962.close();
      }

      this.field_20962 = new class_7995(this.field_20943);
      this.method_20033(var2);
      var2.method_44487();
      this.field_20962.method_36285(var2);
   }

   private void method_20033(class_9633 var1) {
      Random var2 = new Random(10842L);
      var1.method_44471(7, class_7985.field_40915);

      for (int var3 = 0; var3 < 1500; var3++) {
         double var4 = (double)(var2.nextFloat() * 2.0F - 1.0F);
         double var6 = (double)(var2.nextFloat() * 2.0F - 1.0F);
         double var8 = (double)(var2.nextFloat() * 2.0F - 1.0F);
         double var10 = (double)(0.15F + var2.nextFloat() * 0.1F);
         double var12 = var4 * var4 + var6 * var6 + var8 * var8;
         if (var12 < 1.0 && var12 > 0.01) {
            var12 = 1.0 / Math.sqrt(var12);
            var4 *= var12;
            var6 *= var12;
            var8 *= var12;
            double var14 = var4 * 100.0;
            double var16 = var6 * 100.0;
            double var18 = var8 * 100.0;
            double var20 = Math.atan2(var4, var8);
            double var22 = Math.sin(var20);
            double var24 = Math.cos(var20);
            double var26 = Math.atan2(Math.sqrt(var4 * var4 + var8 * var8), var6);
            double var28 = Math.sin(var26);
            double var30 = Math.cos(var26);
            double var32 = var2.nextDouble() * Math.PI * 2.0;
            double var34 = Math.sin(var32);
            double var36 = Math.cos(var32);

            for (int var38 = 0; var38 < 4; var38++) {
               double var39 = 0.0;
               double var41 = (double)((var38 & 2) - 1) * var10;
               double var43 = (double)((var38 + 1 & 2) - 1) * var10;
               double var45 = 0.0;
               double var47 = var41 * var36 - var43 * var34;
               double var49 = var43 * var36 + var41 * var34;
               double var51 = var47 * var28 + 0.0 * var30;
               double var53 = 0.0 * var28 - var47 * var30;
               double var55 = var53 * var22 - var49 * var24;
               double var57 = var49 * var22 + var53 * var24;
               var1.method_35761(var14 + var55, var16 + var51, var18 + var57).method_35735();
            }
         }
      }
   }

   public void method_20092(class_174 var1) {
      this.field_20964 = Double.MIN_VALUE;
      this.field_21002 = Double.MIN_VALUE;
      this.field_20954 = Double.MIN_VALUE;
      this.field_20933 = Integer.MIN_VALUE;
      this.field_21007 = Integer.MIN_VALUE;
      this.field_21013 = Integer.MIN_VALUE;
      this.field_20988.method_28140(var1);
      this.field_20970 = var1;
      if (class_3111.method_14326()) {
         class_8421.method_38768();
      }

      class_5161.method_23652();
      this.field_20960.method_20678((class_2522)null, (class_1331)null);
      class_5630.method_25517(this.field_20970);
      class_6588.method_30223(this.field_20970);
      if (var1 != null) {
         this.method_19998();
      } else {
         this.field_20924.clear();
         this.field_20983.clear();
         this.method_20055();
         if (this.field_20966 != null) {
            this.field_20966.method_34568();
            this.field_20966 = null;
         }

         if (this.field_20968 != null) {
            this.field_20968.method_30732();
         }

         this.field_20968 = null;
         this.field_20972.clear();
      }
   }

   public void method_19998() {
      if (this.field_20970 != null) {
         if (MinecraftClient.method_8497()) {
            this.method_20048();
         } else {
            this.method_20021();
         }

         this.field_20970.method_753();
         if (this.field_20968 == null) {
            this.field_20968 = new class_6705(
               this.field_20970, this, Util.getMainWorkerExecutor(), this.client.method_8533(), this.field_20973.method_13792()
            );
         } else {
            this.field_20968.method_30736(this.field_20970);
         }

         this.field_20985 = true;
         this.field_20986 = true;
         class_6416.method_29328(class_3111.method_14371());
         class_2174.method_10117();
         if (class_3111.method_14326()) {
            class_8421.method_38768();
         }

         class_153.method_613();
         field_21005 = MinecraftClient.method_8541();
         this.field_20922 = this.client.field_9577.field_45537;
         this.field_20927 = this.field_20922 * 16;
         this.field_20981 = this.field_20927 * this.field_20927;
         this.method_20039();
         this.method_20074();
         this.method_20050();
         if (this.field_20966 != null) {
            this.field_20966.method_34568();
         }

         this.method_20042();
         synchronized (this.field_20972) {
            this.field_20972.clear();
         }

         this.field_20966 = new class_7626(this.field_20968, this.field_20970, this.client.field_9577.field_45537, this);
         if (this.field_20970 != null) {
            Entity var4 = this.client.method_8516();
            if (var4 != null) {
               this.field_20966.method_34566(var4.method_37302(), var4.method_37156());
            }
         }
      }

      if (this.client.field_9632 == null) {
         this.field_21009 = true;
      }
   }

   public void method_20042() {
      this.field_20924.clear();
      this.field_20968.method_30733();
   }

   public void method_20060(int var1, int var2) {
      this.method_20018();
      if (this.field_20926 != null) {
         this.field_20926.method_18750(var1, var2);
      }

      if (this.field_20930 != null) {
         this.field_20930.method_18750(var1, var2);
      }
   }

   public String method_20005() {
      int var1 = this.field_20966.field_38807.length;
      int var2 = this.method_20044();
      return String.format(
         "C: %d/%d %sD: %d, %s",
         var2,
         var1,
         this.client.field_9631 ? "(s) " : "",
         this.field_20922,
         this.field_20968 == null ? "null" : this.field_20968.method_30724()
      );
   }

   public int method_20044() {
      int var1 = 0;
      ObjectListIterator var2 = this.field_20982.iterator();

      while (var2.hasNext()) {
         class_1261 var3 = (class_1261)var2.next();
         if (!var3.field_6947.method_16150().method_40691()) {
            var1++;
         }
      }

      return var1;
   }

   public String method_20056() {
      return "E: " + this.field_20937 + "/" + this.field_20970.method_741() + ", B: " + this.field_20979 + ", " + class_3111.method_14244();
   }

   public void method_20016(Camera var1, class_2359 var2, boolean var3, int var4, boolean var5) {
      class_1343 var6 = var1.method_41627();
      if (this.client.field_9577.field_45537 != this.field_20922) {
         this.method_19998();
      }

      this.field_20970.method_29599().method_16056("camera");
      double var7 = this.client.field_9632.method_37302() - this.field_20964;
      double var9 = this.client.field_9632.method_37309() - this.field_21002;
      double var11 = this.client.field_9632.method_37156() - this.field_20954;
      if (this.field_20933 != this.client.field_9632.field_41742
         || this.field_21007 != this.client.field_9632.field_41747
         || this.field_21013 != this.client.field_9632.field_41714
         || var7 * var7 + var9 * var9 + var11 * var11 > 16.0) {
         this.field_20964 = this.client.field_9632.method_37302();
         this.field_21002 = this.client.field_9632.method_37309();
         this.field_20954 = this.client.field_9632.method_37156();
         this.field_20933 = this.client.field_9632.field_41742;
         this.field_21007 = this.client.field_9632.field_41747;
         this.field_21013 = this.client.field_9632.field_41714;
         this.field_20966.method_34566(this.client.field_9632.method_37302(), this.client.field_9632.method_37156());
      }

      if (class_3111.method_14326()) {
         class_8421.method_38763(this);
      }

      this.field_20968.method_30739(var6);
      this.field_20970.method_29599().method_16050("cull");
      this.client.method_8562().method_16050("culling");
      class_1331 var13 = var1.method_41630();
      class_3511 var14 = this.field_20966.method_34563(var13);
      byte var15 = 16;
      class_1331 var16 = new class_1331(
         class_9299.method_42847(var6.field_7336 / 16.0) * 16,
         class_9299.method_42847(var6.field_7333 / 16.0) * 16,
         class_9299.method_42847(var6.field_7334 / 16.0) * 16
      );
      float var17 = var1.method_41638();
      float var18 = var1.method_41640();
      this.field_20985 = this.field_20985
         || !this.field_20924.isEmpty()
         || var6.field_7336 != this.field_20999
         || var6.field_7333 != this.field_20925
         || var6.field_7334 != this.field_20978
         || (double)var17 != this.field_20993
         || (double)var18 != this.field_20995;
      this.field_20999 = var6.field_7336;
      this.field_20925 = var6.field_7333;
      this.field_20978 = var6.field_7334;
      this.field_20993 = (double)var17;
      this.field_20995 = (double)var18;
      this.client.method_8562().method_16050("update");
      class_5099.field_26297.method_24314();
      int var19 = this.method_20027();
      if (var19 != this.field_20963) {
         this.field_20963 = var19;
         this.field_20985 = true;
      }

      Entity var20 = var1.method_41633();
      int var21 = 256;
      if (!class_5161.method_23654()) {
         this.field_20985 = true;
      }

      if (!var3 && this.field_20985 && class_3111.method_14369() && !class_6588.field_33945) {
         var21 = class_5161.method_23653(this.field_20970, var20, this.field_20922);
      }

      class_3511 var22 = this.field_20966.method_34563(new class_1331(var20.method_37302(), var20.method_37309(), var20.method_37156()));
      if (class_6588.field_33945) {
         this.field_20982 = this.field_21015;
         this.field_20961 = this.field_20940;
         this.field_21011 = this.field_20950;
         if (!var3 && this.field_20985) {
            this.method_20055();
            if (var22 != null && var22.method_16189().method_12165() > var21) {
               this.field_20961.add(var22.method_16166());
            }

            Iterator var23 = class_7685.method_34827(this.field_20970, 0.0, var20, this.field_20922, this.field_20966);

            while (var23.hasNext()) {
               class_3511 var24 = (class_3511)var23.next();
               if (var24 != null && var24.method_16189().method_12165() <= var21) {
                  class_1261 var25 = var24.method_16166();
                  if (!var24.field_17205.get().method_40691()) {
                     this.field_20982.add(var25);
                  }

                  if (class_5475.method_24890(var24.method_16174())) {
                     this.field_20961.add(var25);
                  }

                  if (var24.method_16150().method_40699().size() > 0) {
                     this.field_21011.add(var25);
                  }
               }
            }
         }
      } else {
         this.field_20982 = this.field_20949;
         this.field_20961 = this.field_20934;
         this.field_21011 = this.field_20976;
      }

      if (!var3 && this.field_20985 && !class_6588.field_33945) {
         this.field_20985 = false;
         this.method_20055();
         this.field_20980.clear();
         Deque var41 = this.field_20980;
         Entity.method_37327(
            class_9299.method_42827((double)this.client.field_9577.field_45537 / 8.0, 1.0, 2.5) * (double)this.client.field_9577.field_45475
         );
         boolean var43 = this.client.field_9631;
         class_1331 var45 = var1.method_41630();
         int var26 = var45.method_12165();
         int var27 = var26 >> 4 << 4;
         if (var27 > var21) {
            var21 += 16;
            if (var27 > var21 && var21 < 256) {
               if (var22 != null) {
                  this.field_20961.add(var22.method_16166());
               }

               class_1343 var28 = new class_1343((double)var45.method_12173(), (double)var21, (double)var45.method_12185());
               class_1343 var29 = new class_1343(var28.method_61(), var28.method_60(), var28.method_62());
               class_2426 var30 = var1.method_41634();
               class_2426 var31 = new class_2426(var30.method_11057(), 0.0F, var30.method_11055());
               if (!var31.method_11066()) {
                  var31 = new class_2426(1.0F, 0.0F, 0.0F);
               }

               double var32 = (double)(var31.method_11057() * 16.0F);
               double var34 = (double)(var31.method_11055() * 16.0F);
               double var36 = (double)(this.field_20922 * 16);

               for (double var38 = var36 * var36; var29.method_6204(var28) < var38; var29 = var29.method_6214(var32, 0.0, var34)) {
                  class_3511 var40 = this.field_20966.method_34563(new class_1331(var29));
                  if (var40 == null) {
                     break;
                  }

                  if (var2.method_10824(var40.field_17221)) {
                     var40.method_16187(var4);
                     var41.add(new class_1261(var40, (Direction)null, 0));
                     break;
                  }
               }
            }
         }

         if (var41.isEmpty()) {
            if (var14 != null && var14.method_16189().method_12165() <= var21) {
               if (var5 && this.field_20970.method_28262(var13).method_8321(this.field_20970, var13)) {
                  var43 = false;
               }

               var14.method_16187(var4);
               var41.add(new class_1261(var14, (Direction)null, 0));
            } else {
               int var49 = var16.method_12165() > 0 ? Math.min(var21, 248) : 8;
               if (var22 != null) {
                  this.field_20961.add(var22.method_16166());
               }

               int var52 = class_9299.method_42847(var6.field_7336 / 16.0) * 16;
               int var54 = class_9299.method_42847(var6.field_7334 / 16.0) * 16;
               ArrayList var56 = Lists.newArrayList();

               for (int var58 = -this.field_20922; var58 <= this.field_20922; var58++) {
                  for (int var33 = -this.field_20922; var33 <= this.field_20922; var33++) {
                     class_3511 var61 = this.field_20966.method_34563(new class_1331(var52 + (var58 << 4) + 8, var49, var54 + (var33 << 4) + 8));
                     if (var61 != null && var2.method_10824(var61.field_17221)) {
                        var61.method_16187(var4);
                        class_1261 var35 = var61.method_16166();
                        class_1261.method_5680(var35, (Direction)null, 0, 0);
                        var56.add(var35);
                     }
                  }
               }

               var56.sort(Comparator.comparingDouble(var1x -> var13.method_12180(var1x.field_6947.method_16189().method_6104(8, 8, 8))));
               var41.addAll(var56);
            }
         }

         this.client.method_8562().method_16056("iteration");
         boolean var50 = class_3111.method_14420();

         while (!var41.isEmpty()) {
            class_1261 var53 = (class_1261)var41.poll();
            class_3511 var55 = var53.field_6947;
            Direction var57 = class_1261.method_5679(var53);
            class_8845 var59 = var55.field_17205.get();
            if (!var59.method_40691() || var55.method_16181()) {
               this.field_20982.add(var53);
            }

            if (class_5475.method_24890(var55.method_16174())) {
               this.field_20961.add(var53);
            }

            if (var59.method_40699().size() > 0) {
               this.field_21011.add(var53);
            }

            Direction[] var60 = var43 ? class_5161.method_23651(class_1261.method_5677(var53)) : Direction.field_803;

            for (Direction var37 : var60) {
               if (!var43 || var57 == null || var59.method_40688(var57.method_1046(), var37)) {
                  class_3511 var65 = this.method_20004(var16, var55, var37, var50, var21);
                  if (var65 != null && var65.method_16187(var4) && var2.method_10824(var65.field_17221)) {
                     int var39 = class_1261.method_5677(var53) | 1 << var37.ordinal();
                     class_1261 var66 = var65.method_16166();
                     class_1261.method_5680(var66, var37, var39, class_1261.method_5674(var53) + 1);
                     var41.add(var66);
                  }
               }
            }
         }

         this.client.method_8562().method_16054();
      }

      class_5099.field_26297.method_24313();
      if (class_6588.field_33945) {
         class_6588.method_30205();
      } else {
         this.client.method_8562().method_16050("rebuildNear");
         Set var42 = this.field_20924;
         this.field_20924 = this.field_20983;
         this.field_20983 = var42;
         this.field_20924.clear();
         class_5099.field_26292.method_24314();
         ObjectListIterator var44 = this.field_20982.iterator();

         while (var44.hasNext()) {
            class_1261 var46 = (class_1261)var44.next();
            class_3511 var47 = var46.field_6947;
            if (var47.method_16181() || var42.contains(var47)) {
               this.field_20985 = true;
               class_1331 var48 = var47.method_16189();
               boolean var51 = (double)class_1750.method_7807(
                     var16, (float)(var48.method_12173() + 8), (float)(var48.method_12165() + 8), (float)(var48.method_12185() + 8)
                  )
                  < 768.0;
               if (!var47.method_16137() && !var51) {
                  this.field_20924.add(var47);
               } else if (!var47.method_16160()) {
                  this.field_20921.add(var47);
               } else {
                  this.client.method_8562().method_16056("build near");
                  this.field_20968.method_30726(var47);
                  var47.method_16135();
                  this.client.method_8562().method_16054();
               }
            }
         }

         class_5099.field_26292.method_24313();
         this.field_20924.addAll(var42);
         this.client.method_8562().method_16054();
      }
   }

   @Nullable
   private class_3511 method_20004(class_1331 var1, class_3511 var2, Direction var3, boolean var4, int var5) {
      class_3511 var6 = var2.method_16165(var3);
      if (var6 == null) {
         return null;
      } else if (var6.method_16189().method_12165() > var5) {
         return null;
      } else {
         if (var4) {
            class_1331 var7 = var6.method_16189();
            int var8 = var1.method_12173() - var7.method_12173();
            int var9 = var1.method_12185() - var7.method_12185();
            int var10 = var8 * var8 + var9 * var9;
            if (var10 > this.field_20981) {
               return null;
            }
         }

         return var6;
      }
   }

   private void method_20067(class_8107 var1, class_8107 var2, double var3, double var5, double var7, class_2359 var9) {
      this.field_20946 = var9;
      class_8107 var10 = var2.method_36824();
      var10.method_36832(var1);
      var10.method_36809();
      this.field_21012.field_37664 = var3;
      this.field_21012.field_37663 = var5;
      this.field_21012.field_37665 = var7;
      this.field_21004[0] = new class_2637(-1.0F, -1.0F, -1.0F, 1.0F);
      this.field_21004[1] = new class_2637(1.0F, -1.0F, -1.0F, 1.0F);
      this.field_21004[2] = new class_2637(1.0F, 1.0F, -1.0F, 1.0F);
      this.field_21004[3] = new class_2637(-1.0F, 1.0F, -1.0F, 1.0F);
      this.field_21004[4] = new class_2637(-1.0F, -1.0F, 1.0F, 1.0F);
      this.field_21004[5] = new class_2637(1.0F, -1.0F, 1.0F, 1.0F);
      this.field_21004[6] = new class_2637(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_21004[7] = new class_2637(-1.0F, 1.0F, 1.0F, 1.0F);

      for (int var11 = 0; var11 < 8; var11++) {
         this.field_21004[var11].method_11929(var10);
         this.field_21004[var11].method_11919();
      }
   }

   public void method_20059(class_7966 var1, float var2, long var3, boolean var5, Camera var6, GameRenderer var7, class_5778 var8, class_8107 var9) {
      class_3569.field_17468.method_16590(this.field_20970, this.client.method_8577(), this.client.textRenderer, var6, this.client.field_9587);
      this.field_20988.method_28116(this.field_20970, var6, this.client.field_9662);
      class_3492 var10 = this.field_20970.method_29599();
      var10.method_16050("light_updates");
      this.client.field_9601.method_745().method_14813().method_21571(Integer.MAX_VALUE, true, true);
      class_1343 var11 = var6.method_41627();
      double var12 = var11.method_61();
      double var14 = var11.method_60();
      double var16 = var11.method_62();
      class_8107 var18 = var1.method_36058().method_28620();
      var10.method_16050("culling");
      boolean var19 = this.field_20946 != null;
      class_2359 var20;
      if (var19) {
         var20 = this.field_20946;
         var20.method_10820(this.field_21012.field_37664, this.field_21012.field_37663, this.field_21012.field_37665);
      } else {
         var20 = new class_2359(var18, var9);
         var20.method_10820(var12, var14, var16);
      }

      this.client.method_8562().method_16050("captureFrustum");
      if (this.field_20987) {
         this.method_20067(var18, var9, var11.field_7336, var11.field_7333, var11.field_7334, var19 ? new class_2359(var18, var9) : var20);
         this.field_20987 = false;
      }

      var10.method_16050("clear");
      if (class_3111.method_14424()) {
         class_6588.method_30316(0, 0, this.client.method_8552().method_43178(), this.client.method_8552().method_43198());
      } else {
         class_3542.method_16392(0, 0, this.client.method_8552().method_43178(), this.client.method_8552().method_43198());
      }

      class_6377.method_29157(var6, var2, this.client.field_9601, this.client.field_9577.field_45537, var7.method_35956(var2));
      class_3542.method_16402(16640, MinecraftClient.IS_SYSTEM_MAC);
      boolean var21 = class_3111.method_14424();
      if (var21) {
         class_6588.method_30182();
      }

      if (var21) {
         class_6588.method_30194(var1, var6, var2);
      }

      var20.field_11841 = class_3111.method_14424() && !class_6588.method_30227();
      float var22 = var7.method_35955();
      boolean var23 = this.client.field_9601.method_738().method_34252(class_9299.method_42847(var12), class_9299.method_42847(var14))
         || this.client.field_9614.method_13972().method_21877();
      if ((class_3111.method_14391() || class_3111.method_14282() || class_3111.method_14417()) && !class_6588.field_33945) {
         class_6377.method_29160(var6, class_1026.field_5679, var22, var23, var2);
         var10.method_16050("sky");
         if (var21) {
            class_6588.method_30204();
         }

         this.method_20077(var1, var2);
         if (var21) {
            class_6588.method_30209();
         }
      } else {
         class_1920.method_8775();
      }

      var10.method_16050("fog");
      class_6377.method_29160(var6, class_1026.field_5676, Math.max(var22 - 16.0F, 32.0F), var23, var2);
      var10.method_16050("terrain_setup");
      this.method_20090(var6, var20, this.client.field_9632.method_37221());
      this.method_20016(var6, var20, var19, this.field_20959++, this.client.field_9632.method_37221());
      var10.method_16050("updatechunks");
      byte var24 = 30;
      int var25 = this.client.field_9577.field_45439;
      long var26 = 33333333L;
      long var28;
      if ((double)var25 == class_1013.field_5277.method_38573()) {
         var28 = 0L;
      } else {
         var28 = (long)(1000000000 / var25);
      }

      long var30 = Util.getMeasuringTimeNano() - var3;
      long var32 = this.field_20989.method_41974(var30);
      long var34 = var32 * 3L / 2L;
      long var36 = class_9299.method_42830(var34, var28, 33333333L);
      class_5099.field_26308.method_24314();
      this.method_20024(var3 + var36);
      class_5099.field_26308.method_24313();
      var10.method_16050("terrain");
      class_5099.field_26298.method_24314();
      if (this.client.field_9577.field_45432) {
         this.client.method_8562().method_16050("finish");
         GL11.glFinish();
         this.client.method_8562().method_16050("terrain");
      }

      if (class_3111.method_14365() && class_6377.field_32581) {
         class_1920.method_8856(false);
      }

      this.method_20045(class_3581.method_16751(), var1, var12, var14, var16);
      this.client.method_8577().method_35679(class_8359.field_42824).method_37049(false, this.client.field_9577.field_45577 > 0);
      this.method_20045(class_3581.method_16756(), var1, var12, var14, var16);
      this.client.method_8577().method_35679(class_8359.field_42824).method_37057();
      this.method_20045(class_3581.method_16771(), var1, var12, var14, var16);
      if (var21) {
         class_293.method_1324();
      }

      class_5099.field_26298.method_24313();
      if (this.field_20970.method_738().method_34245()) {
         class_2083.method_9720(var1.method_36058().method_28620());
      } else {
         class_2083.method_9714(var1.method_36058().method_28620());
      }

      if (var21) {
         class_6588.method_30305();
      }

      class_6823.method_31303();
      var10.method_16050("entities");
      field_20953++;
      this.field_20937 = 0;
      this.field_20979 = 0;
      this.field_20920 = 0;
      if (this.field_20929 != null) {
         this.field_20929.method_19712(MinecraftClient.IS_SYSTEM_MAC);
         this.field_20929.method_19710(this.client.method_8584());
         this.client.method_8584().method_19717(false);
      }

      if (this.field_20958 != null) {
         this.field_20958.method_19712(MinecraftClient.IS_SYSTEM_MAC);
      }

      if (this.method_20036()) {
         this.field_21000.method_19712(MinecraftClient.IS_SYSTEM_MAC);
         this.client.method_8584().method_19717(false);
      }

      boolean var38 = false;
      class_3758 var39 = this.field_20973.method_13796();
      if (class_3111.method_14238()) {
         class_6151.method_28223();
      }

      for (class_1261 var41 : this.field_20961) {
         class_3511 var42 = var41.field_6947;
         class_2654 var43 = var42.method_16174();

         for (Entity var45 : var43.method_11979()[var42.method_16189().method_12165() / 16]) {
            if ((this.field_20988.method_28135(var45, var20, var12, var14, var16) || var45.method_37315(this.client.field_9632))
               && (
                  var45 != var6.method_41633()
                     || var6.method_41648()
                     || var6.method_41633() instanceof class_5834 && ((class_5834)var6.method_41633()).method_26507()
               )
               && (!(var45 instanceof class_5989) || var6.method_41633() == var45)) {
               String var46 = var45.getClass().getName();
               Object var47 = this.field_20974.get(var46);
               if (var47 == null) {
                  var47 = new ArrayList();
                  this.field_20974.put(var46, (List<Entity>)var47);
               }

               var47.add(var45);
            }
         }
      }

      for (List var58 : this.field_20974.values()) {
         for (Entity var65 : var58) {
            this.field_20937++;
            if (var65.field_41697 == 0) {
               var65.field_41754 = var65.method_37302();
               var65.field_41713 = var65.method_37309();
               var65.field_41724 = var65.method_37156();
            }

            Object var71;
            if (this.method_20036() && this.client.method_8563(var65)) {
               var38 = true;
               class_3643 var76 = this.field_20973.method_13791();
               var71 = var76;
               int var81 = var65.method_37324();
               short var85 = 255;
               int var48 = var81 >> 16 & 0xFF;
               int var49 = var81 >> 8 & 0xFF;
               int var50 = var81 & 0xFF;
               var76.method_16962(var48, var49, var50, 255);
            } else {
               var71 = var39;
            }

            this.field_21016 = var65;
            if (var21) {
               class_6588.method_30181(var65);
            }

            this.method_20009(var65, var12, var14, var16, var2, var1, (class_2565)var71);
            this.field_21016 = null;
         }

         var58.clear();
      }

      this.method_20032(var1);
      var39.method_17416(class_3581.method_16734(class_8359.field_42824));
      var39.method_17416(class_3581.method_16747(class_8359.field_42824));
      var39.method_17416(class_3581.method_16755(class_8359.field_42824));
      var39.method_17416(class_3581.method_16730(class_8359.field_42824));
      if (var21) {
         class_6588.method_30260();
         class_6588.method_30189();
      }

      var10.method_16050("blockentities");
      class_3913.method_18117();
      boolean var57 = class_7860.field_40135.method_3596();
      class_2359 var59 = var20;

      for (class_1261 var66 : this.field_21011) {
         List var72 = var66.field_6947.method_16150().method_40699();
         if (!var72.isEmpty()) {
            for (class_3757 var82 : var72) {
               if (var57) {
                  class_4092 var86 = (class_4092)class_7860.method_35555(var82, class_7860.field_40135);
                  if (var86 != null && !var59.method_10824(var86)) {
                     continue;
                  }
               }

               if (var21) {
                  class_6588.method_30117(var82);
               }

               class_1331 var88 = var82.method_17399();
               Object var89 = var39;
               var1.method_36063();
               if (MinecraftClient.getInstance().field_9591) {
                  var1.method_36065((double)var88.method_12173() - var12, (double)var88.method_12165() - var14, (double)var88.method_12185() - var16);
               }

               SortedSet var91 = (SortedSet)this.field_20948.get(var88.method_6077());
               if (var91 != null && !var91.isEmpty()) {
                  int var51 = ((class_9259)var91.last()).method_42656();
                  if (var51 >= 0) {
                     class_6279 var52 = var1.method_36058();
                     class_3764 var53 = new class_3764(
                        this.field_20973.method_13793().method_11645(class_6560.field_33452.get(var51)), var52.method_28620(), var52.method_28618()
                     );
                     var89 = (class_2565)var2x -> {
                        class_7907 var3x = var39.method_11645(var2x);
                        return var2x.method_16713() ? class_2764.method_12575(var53, var3x) : var3x;
                     };
                  }
               }

               class_3569.field_17468.method_16586(var82, var2, var1, (class_2565)var89);
               var1.method_36064();
               this.field_20920++;
            }
         }
      }

      synchronized (this.field_20972) {
         for (class_3757 var73 : this.field_20972) {
            if (var57) {
               class_4092 var78 = (class_4092)class_7860.method_35555(var73, class_7860.field_40135);
               if (var78 != null && !var59.method_10824(var78)) {
                  continue;
               }
            }

            if (var21) {
               class_6588.method_30117(var73);
            }

            class_1331 var83 = var73.method_17399();
            var1.method_36063();
            var1.method_36065((double)var83.method_12173() - var12, (double)var83.method_12165() - var14, (double)var83.method_12185() - var16);
            class_3569.field_17468.method_16586(var73, var2, var1, var39);
            var1.method_36064();
            this.field_20920++;
         }
      }

      this.method_20032(var1);
      var39.method_17416(class_3581.method_16751());
      var39.method_17416(class_5276.method_24074());
      var39.method_17416(class_5276.method_24083());
      var39.method_17416(class_5276.method_24070());
      var39.method_17416(class_5276.method_24071());
      var39.method_17416(class_5276.method_24080());
      var39.method_17416(class_5276.method_24082());
      var39.method_17416(class_5276.method_24081());
      this.field_20973.method_13791().method_16961();
      if (class_3111.method_14238()) {
         class_6151.method_28222();
      }

      if (var38) {
         this.field_20926.method_18755(var2);
         this.client.method_8584().method_19717(false);
      }

      if (var21) {
         class_6588.method_30256();
      }

      this.field_20932 = true;
      var10.method_16050("destroyProgress");
      ObjectIterator var63 = this.field_20948.long2ObjectEntrySet().iterator();

      while (var63.hasNext()) {
         Entry var68 = (Entry)var63.next();
         class_1331 var74 = class_1331.method_6088(var68.getLongKey());
         double var79 = (double)var74.method_12173() - var12;
         double var87 = (double)var74.method_12165() - var14;
         double var90 = (double)var74.method_12185() - var16;
         if (!(var79 * var79 + var87 * var87 + var90 * var90 > 1024.0)) {
            SortedSet var92 = (SortedSet)var68.getValue();
            if (var92 != null && !var92.isEmpty()) {
               int var93 = ((class_9259)var92.last()).method_42656();
               var1.method_36063();
               var1.method_36065((double)var74.method_12173() - var12, (double)var74.method_12165() - var14, (double)var74.method_12185() - var16);
               class_6279 var94 = var1.method_36058();
               class_3764 var54 = new class_3764(
                  this.field_20973.method_13793().method_11645(class_6560.field_33452.get(var93)), var94.method_28620(), var94.method_28618()
               );
               this.client.method_8505().method_3711(this.field_20970.method_28262(var74), var74, this.field_20970, var1, var54);
               var1.method_36064();
            }
         }
      }

      this.field_20932 = false;
      field_20953--;
      this.method_20032(var1);
      class_7474 var64 = this.client.field_9587;
      if (var5 && var64 != null && var64.method_33990() == class_1430.field_7717) {
         var10.method_16050("outline");
         class_1331 var69 = ((class_9529)var64).method_43955();
         class_2522 var75 = this.field_20970.method_28262(var69);
         boolean var80;
         if (class_7860.field_39999.method_3596() && class_7860.field_39840.method_3596()) {
            var80 = !class_7860.method_35566(class_7860.field_39840, this, var6, var64, var2, var1, var39)
               && !class_7860.method_35565(var75, class_7860.field_39999, this.field_20970, var69)
               && this.field_20970.method_6673().method_9813(var69);
         } else {
            var80 = !var75.method_8345() && this.field_20970.method_6673().method_9813(var69);
         }

         if (var80) {
            class_7907 var84 = var39.method_11645(class_3581.method_16744());
            this.method_20053(var1, var84, var6.method_41633(), var12, var14, var16, var69, var75);
         }

         if (var21) {
            var39.method_17416(class_3581.method_16744());
         }
      } else if (var64 != null && var64.method_33990() == class_1430.field_7718) {
         class_7860.field_39840.method_3582(this, var6, var64, var2, var1, var39);
      }

      class_3542.method_16438();
      class_3542.method_16358(var1.method_36058().method_28620());
      boolean var70 = class_1920.method_8779();
      class_1920.method_8804();
      this.client.field_9612.method_15550(var1, var39, var12, var14, var16);
      class_1920.method_8840(var70);
      class_3542.method_16489();
      var39.method_17416(class_5276.method_24072());
      var39.method_17416(class_5276.method_24081());
      var39.method_17416(class_5276.method_24084());
      var39.method_17416(class_3581.method_16707());
      var39.method_17416(class_3581.method_16711());
      var39.method_17416(class_3581.method_16716());
      var39.method_17416(class_3581.method_16715());
      var39.method_17416(class_3581.method_16739());
      var39.method_17416(class_3581.method_16757());
      var39.method_17416(class_3581.method_16763());
      var39.method_17416(class_3581.method_16728());
      this.field_20973.method_13793().method_17415();
      if (var21) {
         var39.method_17415();
         class_6588.method_30137();
         class_293.method_1318(var7, var1, var6, var2);
         class_6588.method_30326();
      }

      if (this.field_20930 != null) {
         var39.method_17416(class_3581.method_16744());
         var39.method_17415();
         this.field_21001.method_19712(MinecraftClient.IS_SYSTEM_MAC);
         this.field_21001.method_19710(this.client.method_8584());
         var10.method_16050("translucent");
         this.method_20045(class_3581.method_16762(), var1, var12, var14, var16);
         var10.method_16050("string");
         this.method_20045(class_3581.method_16765(), var1, var12, var14, var16);
         this.field_20996.method_19712(MinecraftClient.IS_SYSTEM_MAC);
         this.field_20996.method_19710(this.client.method_8584());
         class_5348.field_27312.method_24420();
         var10.method_16050("particles");
         this.client.field_9572.method_43046(var1, var39, var8, var6, var2, var20);
         class_5348.field_27312.method_24422();
      } else {
         var10.method_16050("translucent");
         if (var21) {
            class_6588.method_30157();
         }

         this.method_20045(class_3581.method_16762(), var1, var12, var14, var16);
         if (var21) {
            class_6588.method_30177();
         }

         var39.method_17416(class_3581.method_16744());
         var39.method_17415();
         var10.method_16050("string");
         this.method_20045(class_3581.method_16765(), var1, var12, var14, var16);
         var10.method_16050("particles");
         if (var21) {
            class_6588.method_30163();
         }

         this.client.field_9572.method_43046(var1, var39, var8, var6, var2, var20);
         if (var21) {
            class_6588.method_30192();
         }
      }

      class_1920.method_8856(true);
      class_3542.method_16438();
      class_3542.method_16358(var1.method_36058().method_28620());
      if (this.client.field_9577.method_40860() != class_9655.field_49168) {
         if (this.field_20930 != null) {
            this.field_21006.method_19712(MinecraftClient.IS_SYSTEM_MAC);
            class_5348.field_27300.method_24420();
            var10.method_16050("clouds");
            this.method_20023(var1, var2, var12, var14, var16);
            class_5348.field_27300.method_24422();
         } else {
            var10.method_16050("clouds");
            this.method_20023(var1, var2, var12, var14, var16);
         }
      }

      if (this.field_20930 != null) {
         class_5348.field_27313.method_24420();
         var10.method_16050("weather");
         this.method_20072(var8, var2, var12, var14, var16);
         this.method_20079(var6);
         class_5348.field_27313.method_24422();
         this.field_20930.method_18755(var2);
         this.client.method_8584().method_19717(false);
      } else {
         class_3542.method_16387(false);
         if (class_3111.method_14424()) {
            class_1920.method_8867(class_6588.method_30318());
         }

         var10.method_16050("weather");
         if (var21) {
            class_6588.method_30101();
         }

         this.method_20072(var8, var2, var12, var14, var16);
         if (var21) {
            class_6588.method_30217();
         }

         this.method_20079(var6);
         class_3542.method_16387(true);
      }

      this.method_20035(var6);
      class_3542.method_16486(7424);
      class_3542.method_16387(true);
      class_3542.method_16448();
      class_3542.method_16489();
      class_6377.method_29162();
   }

   public void method_20032(class_7966 var1) {
      if (!var1.method_36059()) {
         throw new IllegalStateException("Pose stack not empty");
      }
   }

   public void method_20009(Entity var1, double var2, double var4, double var6, float var8, class_7966 var9, class_2565 var10) {
      double var11 = class_9299.method_42794((double)var8, var1.field_41754, var1.method_37302());
      double var13 = class_9299.method_42794((double)var8, var1.field_41713, var1.method_37309());
      double var15 = class_9299.method_42794((double)var8, var1.field_41724, var1.method_37156());
      float var17 = class_9299.method_42795(var8, var1.field_41711, var1.field_41701);
      this.field_20988.method_28115(var1, var11 - var2, var13 - var4, var15 - var6, var17, var8, var9, var10, this.field_20988.method_28120(var1, var8));
   }

   public void method_20045(class_3581 var1, class_7966 var2, double var3, double var5, double var7) {
      var1.method_24420();
      boolean var9 = class_3111.method_14424();
      if (var1 == class_3581.method_16762() && !class_6588.field_33945) {
         this.client.method_8562().method_16056("translucent_sort");
         double var10 = var3 - this.field_20952;
         double var12 = var5 - this.field_20991;
         double var14 = var7 - this.field_20939;
         if (var10 * var10 + var12 * var12 + var14 * var14 > 1.0) {
            this.field_20952 = var3;
            this.field_20991 = var5;
            this.field_20939 = var7;
            int var16 = 0;
            this.field_20941.clear();
            ObjectListIterator var17 = this.field_20982.iterator();

            while (var17.hasNext()) {
               class_1261 var18 = (class_1261)var17.next();
               if (var16 < 15 && var18.field_6947.method_16150().method_40693(var1)) {
                  this.field_20941.add(var18.field_6947);
                  var16++;
               }
            }
         }

         this.client.method_8562().method_16054();
      }

      this.client.method_8562().method_16056("filterempty");
      if (var9) {
         class_293.method_1326(var1);
      }

      boolean var29 = class_153.method_611();
      class_3542.method_16438();
      class_3542.method_16476();
      class_3542.method_16358(var2.method_36058().method_28620());
      this.client.method_8562().method_16051(() -> "render_" + var1);
      boolean var11 = var1 != class_3581.method_16762();
      ObjectListIterator var30 = this.field_20982.listIterator(var11 ? 0 : this.field_20982.size());
      if (class_3111.method_14351()) {
         int var31 = Integer.MIN_VALUE;
         int var33 = Integer.MIN_VALUE;
         class_6076 var34 = null;
         Map var36 = this.field_20967.computeIfAbsent(var1, var0 -> new LinkedHashMap(16));
         Map var38 = null;
         List var39 = null;

         while (var11 ? var30.hasNext() : var30.hasPrevious()) {
            class_1261 var19 = var11 ? (class_1261)var30.next() : (class_1261)var30.previous();
            class_3511 var20 = var19.field_6947;
            if (!var20.method_16150().method_40698(var1)) {
               class_7995 var21 = var20.method_16180(var1);
               class_6076 var22 = var21.method_36284();
               if (var20.field_17207 != var31 || var20.field_17222 != var33) {
                  class_1401 var23 = class_1401.method_6476(var20.field_17207, var20.field_17222);
                  var38 = var36.computeIfAbsent(var23, var0 -> new LinkedHashMap(8));
                  var31 = var20.field_17207;
                  var33 = var20.field_17222;
                  var34 = null;
               }

               if (var22 != var34) {
                  var39 = var38.computeIfAbsent(var22, var0 -> new ArrayList());
                  var34 = var22;
               }

               var39.add(var21);
               if (class_153.method_611()) {
                  BitSet var44 = var20.method_16150().method_40690(var1);
                  if (var44 != null) {
                     class_153.method_614(var44);
                  }
               }
            }
         }

         for (java.util.Map.Entry var41 : var36.entrySet()) {
            class_1401 var42 = (class_1401)var41.getKey();
            Map var43 = (Map)var41.getValue();

            for (java.util.Map.Entry var24 : var43.entrySet()) {
               class_6076 var25 = (class_6076)var24.getKey();
               List var26 = (List)var24.getValue();

               for (class_7995 var28 : var26) {
                  var28.method_36282(7);
               }

               this.method_20057(var42.method_6475(), 0, var42.method_6478(), var3, var5, var7, var25);
               var26.clear();
            }
         }
      } else {
         while (var11 ? var30.hasNext() : var30.hasPrevious()) {
            class_1261 var13 = var11 ? (class_1261)var30.next() : (class_1261)var30.previous();
            class_3511 var32 = var13.field_6947;
            if (!var32.method_16150().method_40698(var1)) {
               class_7995 var15 = var32.method_16180(var1);
               class_1920.method_8757();
               class_1331 var35 = var32.method_16189();
               class_1920.method_8876((double)var35.method_12173() - var3, (double)var35.method_12165() - var5, (double)var35.method_12185() - var7);
               var15.method_36280();
               class_7985.field_40918.method_13179(0L);
               class_1920.method_8780();
               if (var9) {
                  class_293.method_1299();
               }

               var15.method_36282(7);
               class_1920.method_8761();
               if (var29) {
                  BitSet var37 = var32.method_16150().method_40690(var1);
                  if (var37 != null) {
                     class_153.method_614(var37);
                  }
               }
            }
         }
      }

      class_1920.method_8935();
      class_3542.method_16489();
      class_7995.method_36279();
      class_3542.method_16473();
      class_7985.field_40918.method_13173();
      this.client.method_8562().method_16054();
      if (var9) {
         class_293.method_1323(var1);
      }

      var1.method_24422();
   }

   private void method_20057(int var1, int var2, int var3, double var4, double var6, double var8, class_6076 var10) {
      class_1920.method_8757();
      class_1920.method_8876((double)var1 - var4, (double)var2 - var6, (double)var3 - var8);
      var10.method_27822();
      class_1920.method_8780();
      class_1920.method_8761();
   }

   private void method_20035(Camera var1) {
      class_8042 var2 = class_8042.method_36499();
      class_9633 var3 = var2.method_36501();
      if (this.client.field_9569 || this.client.field_9605) {
         double var4 = var1.method_41627().method_61();
         double var6 = var1.method_41627().method_60();
         double var8 = var1.method_41627().method_62();
         class_3542.method_16387(true);
         class_3542.method_16393();
         class_3542.method_16488();
         class_3542.method_16437();
         class_3542.method_16354();

         for (ObjectListIterator var10 = this.field_20982.iterator(); var10.hasNext(); class_3542.method_16489()) {
            class_1261 var11 = (class_1261)var10.next();
            class_3511 var12 = var11.field_6947;
            class_3542.method_16438();
            class_1331 var13 = var12.method_16189();
            class_3542.method_16483((double)var13.method_12173() - var4, (double)var13.method_12165() - var6, (double)var13.method_12185() - var8);
            if (this.client.field_9569) {
               var3.method_44471(1, class_7985.field_40903);
               class_3542.method_16484(10.0F);
               int var14 = class_1261.method_5674(var11) == 0 ? 0 : class_9299.method_42792((float)class_1261.method_5674(var11) / 50.0F, 0.9F, 0.9F);
               int var15 = var14 >> 16 & 0xFF;
               int var16 = var14 >> 8 & 0xFF;
               int var17 = var14 & 0xFF;
               Direction var18 = class_1261.method_5679(var11);
               if (var18 != null) {
                  var3.method_35761(8.0, 8.0, 8.0).method_35743(var15, var16, var17, 255).method_35735();
                  var3.method_35761((double)(8 - 16 * var18.method_1041()), (double)(8 - 16 * var18.method_1054()), (double)(8 - 16 * var18.method_1034()))
                     .method_35743(var15, var16, var17, 255)
                     .method_35735();
               }

               var2.method_36500();
               class_3542.method_16484(1.0F);
            }

            if (this.client.field_9605 && !var12.method_16150().method_40691()) {
               var3.method_44471(1, class_7985.field_40903);
               class_3542.method_16484(10.0F);
               int var24 = 0;

               for (Direction var30 : DIRECTIONS) {
                  for (Direction var22 : DIRECTIONS) {
                     boolean var23 = var12.method_16150().method_40688(var30, var22);
                     if (!var23) {
                        var24++;
                        var3.method_35761((double)(8 + 8 * var30.method_1041()), (double)(8 + 8 * var30.method_1054()), (double)(8 + 8 * var30.method_1034()))
                           .method_35743(1, 0, 0, 1)
                           .method_35735();
                        var3.method_35761((double)(8 + 8 * var22.method_1041()), (double)(8 + 8 * var22.method_1054()), (double)(8 + 8 * var22.method_1034()))
                           .method_35743(1, 0, 0, 1)
                           .method_35735();
                     }
                  }
               }

               var2.method_36500();
               class_3542.method_16484(1.0F);
               if (var24 > 0) {
                  var3.method_44471(7, class_7985.field_40903);
                  float var26 = 0.5F;
                  float var28 = 0.2F;
                  var3.method_35761(0.5, 15.5, 0.5).method_35742(0.9F, 0.9F, 0.0F, 0.2F).method_35735();
                  var3.method_35761(15.5, 15.5, 0.5).method_35742(0.9F, 0.9F, 0.0F, 0.2F).method_35735();
                  var3.method_35761(15.5, 15.5, 15.5).method_35742(0.9F, 0.9F, 0.0F, 0.2F).method_35735();
                  var3.method_35761(0.5, 15.5, 15.5).method_35742(0.9F, 0.9F, 0.0F, 0.2F).method_35735();
                  var3.method_35761(0.5, 0.5, 15.5).method_35742(0.9F, 0.9F, 0.0F, 0.2F).method_35735();
                  var3.method_35761(15.5, 0.5, 15.5).method_35742(0.9F, 0.9F, 0.0F, 0.2F).method_35735();
                  var3.method_35761(15.5, 0.5, 0.5).method_35742(0.9F, 0.9F, 0.0F, 0.2F).method_35735();
                  var3.method_35761(0.5, 0.5, 0.5).method_35742(0.9F, 0.9F, 0.0F, 0.2F).method_35735();
                  var3.method_35761(0.5, 15.5, 0.5).method_35742(0.9F, 0.9F, 0.0F, 0.2F).method_35735();
                  var3.method_35761(0.5, 15.5, 15.5).method_35742(0.9F, 0.9F, 0.0F, 0.2F).method_35735();
                  var3.method_35761(0.5, 0.5, 15.5).method_35742(0.9F, 0.9F, 0.0F, 0.2F).method_35735();
                  var3.method_35761(0.5, 0.5, 0.5).method_35742(0.9F, 0.9F, 0.0F, 0.2F).method_35735();
                  var3.method_35761(15.5, 0.5, 0.5).method_35742(0.9F, 0.9F, 0.0F, 0.2F).method_35735();
                  var3.method_35761(15.5, 0.5, 15.5).method_35742(0.9F, 0.9F, 0.0F, 0.2F).method_35735();
                  var3.method_35761(15.5, 15.5, 15.5).method_35742(0.9F, 0.9F, 0.0F, 0.2F).method_35735();
                  var3.method_35761(15.5, 15.5, 0.5).method_35742(0.9F, 0.9F, 0.0F, 0.2F).method_35735();
                  var3.method_35761(0.5, 0.5, 0.5).method_35742(0.9F, 0.9F, 0.0F, 0.2F).method_35735();
                  var3.method_35761(15.5, 0.5, 0.5).method_35742(0.9F, 0.9F, 0.0F, 0.2F).method_35735();
                  var3.method_35761(15.5, 15.5, 0.5).method_35742(0.9F, 0.9F, 0.0F, 0.2F).method_35735();
                  var3.method_35761(0.5, 15.5, 0.5).method_35742(0.9F, 0.9F, 0.0F, 0.2F).method_35735();
                  var3.method_35761(0.5, 15.5, 15.5).method_35742(0.9F, 0.9F, 0.0F, 0.2F).method_35735();
                  var3.method_35761(15.5, 15.5, 15.5).method_35742(0.9F, 0.9F, 0.0F, 0.2F).method_35735();
                  var3.method_35761(15.5, 0.5, 15.5).method_35742(0.9F, 0.9F, 0.0F, 0.2F).method_35735();
                  var3.method_35761(0.5, 0.5, 15.5).method_35742(0.9F, 0.9F, 0.0F, 0.2F).method_35735();
                  var2.method_36500();
               }
            }
         }

         class_3542.method_16387(true);
         class_3542.method_16448();
         class_3542.method_16361();
         class_3542.method_16432();
      }

      if (this.field_20946 != null) {
         class_3542.method_16393();
         class_3542.method_16354();
         class_3542.method_16488();
         class_3542.method_16437();
         class_3542.method_16484(10.0F);
         class_3542.method_16438();
         class_3542.method_16413(
            (float)(this.field_21012.field_37664 - var1.method_41627().field_7336),
            (float)(this.field_21012.field_37663 - var1.method_41627().field_7333),
            (float)(this.field_21012.field_37665 - var1.method_41627().field_7334)
         );
         class_3542.method_16387(true);
         var3.method_44471(7, class_7985.field_40903);
         this.method_20086(var3, 0, 1, 2, 3, 0, 1, 1);
         this.method_20086(var3, 4, 5, 6, 7, 1, 0, 0);
         this.method_20086(var3, 0, 1, 5, 4, 1, 1, 0);
         this.method_20086(var3, 2, 3, 7, 6, 0, 0, 1);
         this.method_20086(var3, 0, 4, 7, 3, 0, 1, 0);
         this.method_20086(var3, 1, 5, 6, 2, 1, 0, 1);
         var2.method_36500();
         class_3542.method_16387(false);
         var3.method_44471(1, class_7985.field_40915);
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         this.method_20006(var3, 0);
         this.method_20006(var3, 1);
         this.method_20006(var3, 1);
         this.method_20006(var3, 2);
         this.method_20006(var3, 2);
         this.method_20006(var3, 3);
         this.method_20006(var3, 3);
         this.method_20006(var3, 0);
         this.method_20006(var3, 4);
         this.method_20006(var3, 5);
         this.method_20006(var3, 5);
         this.method_20006(var3, 6);
         this.method_20006(var3, 6);
         this.method_20006(var3, 7);
         this.method_20006(var3, 7);
         this.method_20006(var3, 4);
         this.method_20006(var3, 0);
         this.method_20006(var3, 4);
         this.method_20006(var3, 1);
         this.method_20006(var3, 5);
         this.method_20006(var3, 2);
         this.method_20006(var3, 6);
         this.method_20006(var3, 3);
         this.method_20006(var3, 7);
         var2.method_36500();
         class_3542.method_16489();
         class_3542.method_16387(true);
         class_3542.method_16448();
         class_3542.method_16361();
         class_3542.method_16432();
         class_3542.method_16484(1.0F);
      }
   }

   private void method_20006(class_7907 var1, int var2) {
      var1.method_35761(
            (double)this.field_21004[var2].method_11923(), (double)this.field_21004[var2].method_11922(), (double)this.field_21004[var2].method_11927()
         )
         .method_35735();
   }

   private void method_20086(class_7907 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      float var9 = 0.25F;
      var1.method_35761(
            (double)this.field_21004[var2].method_11923(), (double)this.field_21004[var2].method_11922(), (double)this.field_21004[var2].method_11927()
         )
         .method_35742((float)var6, (float)var7, (float)var8, 0.25F)
         .method_35735();
      var1.method_35761(
            (double)this.field_21004[var3].method_11923(), (double)this.field_21004[var3].method_11922(), (double)this.field_21004[var3].method_11927()
         )
         .method_35742((float)var6, (float)var7, (float)var8, 0.25F)
         .method_35735();
      var1.method_35761(
            (double)this.field_21004[var4].method_11923(), (double)this.field_21004[var4].method_11922(), (double)this.field_21004[var4].method_11927()
         )
         .method_35742((float)var6, (float)var7, (float)var8, 0.25F)
         .method_35735();
      var1.method_35761(
            (double)this.field_21004[var5].method_11923(), (double)this.field_21004[var5].method_11922(), (double)this.field_21004[var5].method_11927()
         )
         .method_35742((float)var6, (float)var7, (float)var8, 0.25F)
         .method_35735();
   }

   public void method_20084() {
      this.field_20997++;
      if (this.field_20997 % 20 == 0) {
         ObjectIterator var1 = this.field_20945.values().iterator();

         while (var1.hasNext()) {
            class_9259 var2 = (class_9259)var1.next();
            int var3 = var2.method_42660();
            if (this.field_20997 - var3 > 400) {
               var1.remove();
               this.method_20082(var2);
            }
         }
      }

      if (class_3111.method_14351() && this.field_20997 % 20 == 0) {
         this.field_20967.clear();
      }
   }

   private void method_20082(class_9259 var1) {
      long var2 = var1.method_42661().method_6077();
      Set var4 = (Set)this.field_20948.get(var2);
      var4.remove(var1);
      if (var4.isEmpty()) {
         this.field_20948.remove(var2);
      }
   }

   private void method_20087(class_7966 var1) {
      if (class_3111.method_14391()) {
         class_3542.method_16458();
         class_3542.method_16488();
         class_3542.method_16437();
         class_3542.method_16387(false);
         this.textureManager.method_35674(END_SKY);
         class_8042 var2 = class_8042.method_36499();
         class_9633 var3 = var2.method_36501();

         for (int var4 = 0; var4 < 6; var4++) {
            var1.method_36063();
            if (var4 == 1) {
               var1.method_36060(class_2426.field_12080.method_11074(90.0F));
            }

            if (var4 == 2) {
               var1.method_36060(class_2426.field_12080.method_11074(-90.0F));
            }

            if (var4 == 3) {
               var1.method_36060(class_2426.field_12080.method_11074(180.0F));
            }

            if (var4 == 4) {
               var1.method_36060(class_2426.field_12076.method_11074(90.0F));
            }

            if (var4 == 5) {
               var1.method_36060(class_2426.field_12076.method_11074(-90.0F));
            }

            class_8107 var5 = var1.method_36058().method_28620();
            var3.method_44471(7, class_7985.field_40905);
            int var6 = 40;
            int var7 = 40;
            int var8 = 40;
            if (class_3111.method_14438()) {
               class_1343 var9 = new class_1343((double)var6 / 255.0, (double)var7 / 255.0, (double)var8 / 255.0);
               var9 = class_9300.method_42927(var9, this.field_20970, this.client.method_8516(), 0.0F);
               var6 = (int)(var9.field_7336 * 255.0);
               var7 = (int)(var9.field_7333 * 255.0);
               var8 = (int)(var9.field_7334 * 255.0);
            }

            var3.method_35762(var5, -100.0F, -100.0F, -100.0F).method_35745(0.0F, 0.0F).method_35743(var6, var7, var8, 255).method_35735();
            var3.method_35762(var5, -100.0F, -100.0F, 100.0F).method_35745(0.0F, 16.0F).method_35743(var6, var7, var8, 255).method_35735();
            var3.method_35762(var5, 100.0F, -100.0F, 100.0F).method_35745(16.0F, 16.0F).method_35743(var6, var7, var8, 255).method_35735();
            var3.method_35762(var5, 100.0F, -100.0F, -100.0F).method_35745(16.0F, 0.0F).method_35743(var6, var7, var8, 255).method_35735();
            var2.method_36500();
            var1.method_36064();
         }

         class_3542.method_16387(true);
         class_3542.method_16432();
         class_3542.method_16448();
         class_3542.method_16374();
      }
   }

   public void method_20077(class_7966 var1, float var2) {
      if (class_7860.field_40239.method_3596()) {
         class_9731 var3 = (class_9731)class_7860.method_35555(this.field_20970.method_738(), class_7860.field_40239);
         if (var3 != null) {
            var3.method_44933(this.field_20997, var2, var1, this.field_20970, this.client);
            return;
         }
      }

      if (this.client.field_9601.method_738().method_34244() == class_9571.field_48695) {
         this.method_20087(var1);
      } else if (this.client.field_9601.method_738().method_34244() == class_9571.field_48694) {
         class_3542.method_16354();
         boolean var20 = class_3111.method_14424();
         if (var20) {
            class_6588.method_30299();
         }

         class_1343 var4 = this.field_20970.method_750(this.client.gameRenderer.method_35949().method_41630(), var2);
         var4 = class_9300.method_42885(
            var4,
            this.client.field_9601,
            this.client.method_8516().method_37302(),
            this.client.method_8516().method_37309() + 1.0,
            this.client.method_8516().method_37156()
         );
         if (var20) {
            class_6588.method_30238(var4);
         }

         float var5 = (float)var4.field_7336;
         float var6 = (float)var4.field_7333;
         float var7 = (float)var4.field_7334;
         class_6377.method_29161();
         class_9633 var8 = class_8042.method_36499().method_36501();
         class_3542.method_16387(false);
         class_3542.method_16353();
         if (var20) {
            class_6588.method_30159();
         }

         class_3542.method_16404(var5, var6, var7);
         if (var20) {
            class_6588.method_30168(var1);
         }

         if (class_3111.method_14391()) {
            this.field_20955.method_36280();
            this.field_20943.method_13179(0L);
            this.field_20955.method_36283(var1.method_36058().method_28620(), 7);
            class_7995.method_36279();
            this.field_20943.method_13173();
         }

         class_3542.method_16367();
         if (var20) {
            class_6588.method_30180();
         }

         class_3542.method_16458();
         class_3542.method_16488();
         class_3542.method_16437();
         float[] var9 = this.field_20970.method_738().method_34248(this.field_20970.method_13578(var2), var2);
         if (var9 != null && class_3111.method_14282()) {
            class_3542.method_16354();
            if (var20) {
               class_6588.method_30299();
            }

            class_3542.method_16486(7425);
            var1.method_36063();
            var1.method_36060(class_2426.field_12080.method_11074(90.0F));
            float var10 = class_9299.method_42818(this.field_20970.method_29553(var2)) < 0.0F ? 180.0F : 0.0F;
            var1.method_36060(class_2426.field_12076.method_11074(var10));
            var1.method_36060(class_2426.field_12076.method_11074(90.0F));
            float var11 = var9[0];
            float var12 = var9[1];
            float var13 = var9[2];
            class_8107 var14 = var1.method_36058().method_28620();
            var8.method_44471(6, class_7985.field_40903);
            var8.method_35762(var14, 0.0F, 100.0F, 0.0F).method_35742(var11, var12, var13, var9[3]).method_35735();
            byte var15 = 16;

            for (int var16 = 0; var16 <= 16; var16++) {
               float var17 = (float)var16 * (float) (Math.PI * 2) / 16.0F;
               float var18 = class_9299.method_42818(var17);
               float var19 = class_9299.method_42840(var17);
               var8.method_35762(var14, var18 * 120.0F, var19 * 120.0F, -var19 * 40.0F * var9[3]).method_35742(var9[0], var9[1], var9[2], 0.0F).method_35735();
            }

            var8.method_44487();
            class_138.method_554(var8);
            var1.method_36064();
            class_3542.method_16486(7424);
         }

         class_3542.method_16432();
         if (var20) {
            class_6588.method_30248();
         }

         class_3542.method_16425(class_5033.field_26042, class_8535.field_43691, class_5033.field_26047, class_8535.field_43699);
         var1.method_36063();
         float var22 = 1.0F - this.field_20970.method_29578(var2);
         class_3542.method_16480(1.0F, 1.0F, 1.0F, var22);
         var1.method_36060(class_2426.field_12074.method_11074(-90.0F));
         class_6167.method_28272(this.field_20970, this.textureManager, var1, var2);
         if (var20) {
            class_6588.method_30212(var1);
         }

         var1.method_36060(class_2426.field_12080.method_11074(this.field_20970.method_13578(var2) * 360.0F));
         if (var20) {
            class_6588.method_30312(var1);
         }

         class_8107 var23 = var1.method_36058().method_28620();
         float var24 = 30.0F;
         if (class_3111.method_14448()) {
            this.textureManager.method_35674(SUN);
            var8.method_44471(7, class_7985.field_40912);
            var8.method_35762(var23, -var24, 100.0F, -var24).method_35745(0.0F, 0.0F).method_35735();
            var8.method_35762(var23, var24, 100.0F, -var24).method_35745(1.0F, 0.0F).method_35735();
            var8.method_35762(var23, var24, 100.0F, var24).method_35745(1.0F, 1.0F).method_35735();
            var8.method_35762(var23, -var24, 100.0F, var24).method_35745(0.0F, 1.0F).method_35735();
            var8.method_44487();
            class_138.method_554(var8);
         }

         var24 = 20.0F;
         if (class_3111.method_14241()) {
            this.textureManager.method_35674(MOON_PHASES);
            int var26 = this.field_20970.method_13575();
            int var28 = var26 % 4;
            int var30 = var26 / 4 % 2;
            float var31 = (float)(var28 + 0) / 4.0F;
            float var34 = (float)(var30 + 0) / 2.0F;
            float var35 = (float)(var28 + 1) / 4.0F;
            float var36 = (float)(var30 + 1) / 2.0F;
            var8.method_44471(7, class_7985.field_40912);
            var8.method_35762(var23, -var24, -100.0F, var24).method_35745(var35, var36).method_35735();
            var8.method_35762(var23, var24, -100.0F, var24).method_35745(var31, var36).method_35735();
            var8.method_35762(var23, var24, -100.0F, -var24).method_35745(var31, var34).method_35735();
            var8.method_35762(var23, -var24, -100.0F, -var24).method_35745(var35, var34).method_35735();
            var8.method_44487();
            class_138.method_554(var8);
         }

         class_3542.method_16354();
         if (var20) {
            class_6588.method_30299();
         }

         float var27 = this.field_20970.method_761(var2) * var22;
         if (var27 > 0.0F && class_3111.method_14417() && !class_6167.method_28273(this.field_20970)) {
            class_3542.method_16480(var27, var27, var27, var27);
            this.field_20962.method_36280();
            this.field_20943.method_13179(0L);
            this.field_20962.method_36283(var1.method_36058().method_28620(), 7);
            class_7995.method_36279();
            this.field_20943.method_13173();
         }

         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         class_3542.method_16448();
         class_3542.method_16374();
         class_3542.method_16353();
         if (var20) {
            class_6588.method_30159();
         }

         var1.method_36064();
         class_3542.method_16354();
         if (var20) {
            class_6588.method_30299();
         }

         class_3542.method_16404(0.0F, 0.0F, 0.0F);
         double var29 = this.client.field_9632.method_37335(var2).field_7333 - this.field_20970.method_749().method_3496();
         boolean var32 = false;
         if (var29 < 0.0) {
            var1.method_36063();
            var1.method_36065(0.0, 12.0, 0.0);
            this.field_20984.method_36280();
            this.field_20943.method_13179(0L);
            this.field_20984.method_36283(var1.method_36058().method_28620(), 7);
            class_7995.method_36279();
            this.field_20943.method_13173();
            var1.method_36064();
            var32 = true;
         }

         if (this.field_20970.method_738().method_34249()) {
            class_3542.method_16404(var5 * 0.2F + 0.04F, var6 * 0.2F + 0.04F, var7 * 0.6F + 0.1F);
         } else {
            class_3542.method_16404(var5, var6, var7);
         }

         class_3542.method_16432();
         class_3542.method_16387(true);
         class_3542.method_16367();
      }
   }

   public void method_20023(class_7966 var1, float var2, double var3, double var5, double var7) {
      if (!class_3111.method_14396()) {
         if (class_7860.field_39862.method_3596()) {
            class_3597 var9 = (class_3597)class_7860.method_35555(this.field_20970.method_738(), class_7860.field_39862);
            if (var9 != null) {
               var9.method_16791(this.field_20997, var2, var1, this.field_20970, this.client, var3, var5, var7);
               return;
            }
         }

         float var31 = this.field_20970.method_738().method_34243();
         if (!Float.isNaN(var31)) {
            if (class_3111.method_14424()) {
               class_6588.method_30170();
            }

            class_3542.method_16393();
            class_3542.method_16488();
            class_3542.method_16374();
            class_3542.method_16428();
            class_3542.method_16433();
            class_3542.method_16425(class_5033.field_26042, class_8535.field_43697, class_5033.field_26047, class_8535.field_43697);
            class_3542.method_16353();
            class_3542.method_16387(true);
            float var10 = 12.0F;
            float var11 = 4.0F;
            double var12 = 2.0E-4;
            double var14 = (double)(((float)this.field_20997 + var2) * 0.03F);
            double var16 = (var3 + var14) / 12.0;
            double var18 = (double)(var31 - (float)var5 + 0.33F);
            var18 += this.client.field_9577.field_45398 * 128.0;
            double var20 = var7 / 12.0 + 0.33F;
            var16 -= (double)(class_9299.method_42847(var16 / 2048.0) * 2048);
            var20 -= (double)(class_9299.method_42847(var20 / 2048.0) * 2048);
            float var22 = (float)(var16 - (double)class_9299.method_42847(var16));
            float var23 = (float)(var18 / 4.0 - (double)class_9299.method_42847(var18 / 4.0)) * 4.0F;
            float var24 = (float)(var20 - (double)class_9299.method_42847(var20));
            class_1343 var25 = this.field_20970.method_742(var2);
            int var26 = (int)Math.floor(var16);
            int var27 = (int)Math.floor(var18 / 4.0);
            int var28 = (int)Math.floor(var20);
            if (var26 != this.field_20944
               || var27 != this.field_20919
               || var28 != this.field_20957
               || this.client.field_9577.method_40860() != this.field_20992
               || this.field_20975.method_6204(var25) > 2.0E-4) {
               this.field_20944 = var26;
               this.field_20919 = var27;
               this.field_20957 = var28;
               this.field_20975 = var25;
               this.field_20992 = this.client.field_9577.method_40860();
               this.field_20986 = true;
            }

            if (this.field_20986) {
               this.field_20986 = false;
               class_9633 var29 = class_8042.method_36499().method_36501();
               if (this.field_20947 != null) {
                  this.field_20947.close();
               }

               this.field_20947 = new class_7995(class_7985.field_40911);
               this.method_20030(var29, var16, var18, var20, var25);
               var29.method_44487();
               this.field_20947.method_36285(var29);
            }

            this.textureManager.method_35674(CLOUDS);
            var1.method_36063();
            var1.method_36062(12.0F, 1.0F, 12.0F);
            var1.method_36065((double)(-var22), (double)var23, (double)(-var24));
            if (this.field_20947 != null) {
               this.field_20947.method_36280();
               class_7985.field_40911.method_13179(0L);
               int var35 = this.field_20992 == class_9655.field_49167 ? 0 : 1;

               for (int var30 = var35; var30 < 2; var30++) {
                  if (var30 == 0) {
                     class_3542.method_16405(false, false, false, false);
                  } else {
                     class_3542.method_16405(true, true, true, true);
                  }

                  this.field_20947.method_36283(var1.method_36058().method_28620(), 7);
               }

               class_7995.method_36279();
               class_7985.field_40911.method_13173();
            }

            var1.method_36064();
            class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
            class_3542.method_16458();
            class_3542.method_16361();
            class_3542.method_16448();
            class_3542.method_16367();
            if (class_3111.method_14424()) {
               class_6588.method_30198();
            }
         }
      }
   }

   private void method_20030(class_9633 var1, double var2, double var4, double var6, class_1343 var8) {
      float var9 = 4.0F;
      float var10 = 0.00390625F;
      byte var11 = 8;
      byte var12 = 4;
      float var13 = 9.765625E-4F;
      float var14 = (float)class_9299.method_42847(var2) * 0.00390625F;
      float var15 = (float)class_9299.method_42847(var6) * 0.00390625F;
      float var16 = (float)var8.field_7336;
      float var17 = (float)var8.field_7333;
      float var18 = (float)var8.field_7334;
      float var19 = var16 * 0.9F;
      float var20 = var17 * 0.9F;
      float var21 = var18 * 0.9F;
      float var22 = var16 * 0.7F;
      float var23 = var17 * 0.7F;
      float var24 = var18 * 0.7F;
      float var25 = var16 * 0.8F;
      float var26 = var17 * 0.8F;
      float var27 = var18 * 0.8F;
      var1.method_44471(7, class_7985.field_40911);
      float var28 = (float)Math.floor(var4 / 4.0) * 4.0F;
      if (class_3111.method_14443()) {
         for (int var29 = -3; var29 <= 4; var29++) {
            for (int var30 = -3; var30 <= 4; var30++) {
               float var31 = (float)(var29 * 8);
               float var32 = (float)(var30 * 8);
               if (var28 > -5.0F) {
                  var1.method_35761((double)(var31 + 0.0F), (double)(var28 + 0.0F), (double)(var32 + 8.0F))
                     .method_35745((var31 + 0.0F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                     .method_35742(var22, var23, var24, 0.8F)
                     .method_35755(0.0F, -1.0F, 0.0F)
                     .method_35735();
                  var1.method_35761((double)(var31 + 8.0F), (double)(var28 + 0.0F), (double)(var32 + 8.0F))
                     .method_35745((var31 + 8.0F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                     .method_35742(var22, var23, var24, 0.8F)
                     .method_35755(0.0F, -1.0F, 0.0F)
                     .method_35735();
                  var1.method_35761((double)(var31 + 8.0F), (double)(var28 + 0.0F), (double)(var32 + 0.0F))
                     .method_35745((var31 + 8.0F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                     .method_35742(var22, var23, var24, 0.8F)
                     .method_35755(0.0F, -1.0F, 0.0F)
                     .method_35735();
                  var1.method_35761((double)(var31 + 0.0F), (double)(var28 + 0.0F), (double)(var32 + 0.0F))
                     .method_35745((var31 + 0.0F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                     .method_35742(var22, var23, var24, 0.8F)
                     .method_35755(0.0F, -1.0F, 0.0F)
                     .method_35735();
               }

               if (var28 <= 5.0F) {
                  var1.method_35761((double)(var31 + 0.0F), (double)(var28 + 4.0F - 9.765625E-4F), (double)(var32 + 8.0F))
                     .method_35745((var31 + 0.0F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                     .method_35742(var16, var17, var18, 0.8F)
                     .method_35755(0.0F, 1.0F, 0.0F)
                     .method_35735();
                  var1.method_35761((double)(var31 + 8.0F), (double)(var28 + 4.0F - 9.765625E-4F), (double)(var32 + 8.0F))
                     .method_35745((var31 + 8.0F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                     .method_35742(var16, var17, var18, 0.8F)
                     .method_35755(0.0F, 1.0F, 0.0F)
                     .method_35735();
                  var1.method_35761((double)(var31 + 8.0F), (double)(var28 + 4.0F - 9.765625E-4F), (double)(var32 + 0.0F))
                     .method_35745((var31 + 8.0F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                     .method_35742(var16, var17, var18, 0.8F)
                     .method_35755(0.0F, 1.0F, 0.0F)
                     .method_35735();
                  var1.method_35761((double)(var31 + 0.0F), (double)(var28 + 4.0F - 9.765625E-4F), (double)(var32 + 0.0F))
                     .method_35745((var31 + 0.0F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                     .method_35742(var16, var17, var18, 0.8F)
                     .method_35755(0.0F, 1.0F, 0.0F)
                     .method_35735();
               }

               if (var29 > -1) {
                  for (int var33 = 0; var33 < 8; var33++) {
                     var1.method_35761((double)(var31 + (float)var33 + 0.0F), (double)(var28 + 0.0F), (double)(var32 + 8.0F))
                        .method_35745((var31 + (float)var33 + 0.5F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                        .method_35742(var19, var20, var21, 0.8F)
                        .method_35755(-1.0F, 0.0F, 0.0F)
                        .method_35735();
                     var1.method_35761((double)(var31 + (float)var33 + 0.0F), (double)(var28 + 4.0F), (double)(var32 + 8.0F))
                        .method_35745((var31 + (float)var33 + 0.5F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                        .method_35742(var19, var20, var21, 0.8F)
                        .method_35755(-1.0F, 0.0F, 0.0F)
                        .method_35735();
                     var1.method_35761((double)(var31 + (float)var33 + 0.0F), (double)(var28 + 4.0F), (double)(var32 + 0.0F))
                        .method_35745((var31 + (float)var33 + 0.5F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                        .method_35742(var19, var20, var21, 0.8F)
                        .method_35755(-1.0F, 0.0F, 0.0F)
                        .method_35735();
                     var1.method_35761((double)(var31 + (float)var33 + 0.0F), (double)(var28 + 0.0F), (double)(var32 + 0.0F))
                        .method_35745((var31 + (float)var33 + 0.5F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                        .method_35742(var19, var20, var21, 0.8F)
                        .method_35755(-1.0F, 0.0F, 0.0F)
                        .method_35735();
                  }
               }

               if (var29 <= 1) {
                  for (int var38 = 0; var38 < 8; var38++) {
                     var1.method_35761((double)(var31 + (float)var38 + 1.0F - 9.765625E-4F), (double)(var28 + 0.0F), (double)(var32 + 8.0F))
                        .method_35745((var31 + (float)var38 + 0.5F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                        .method_35742(var19, var20, var21, 0.8F)
                        .method_35755(1.0F, 0.0F, 0.0F)
                        .method_35735();
                     var1.method_35761((double)(var31 + (float)var38 + 1.0F - 9.765625E-4F), (double)(var28 + 4.0F), (double)(var32 + 8.0F))
                        .method_35745((var31 + (float)var38 + 0.5F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                        .method_35742(var19, var20, var21, 0.8F)
                        .method_35755(1.0F, 0.0F, 0.0F)
                        .method_35735();
                     var1.method_35761((double)(var31 + (float)var38 + 1.0F - 9.765625E-4F), (double)(var28 + 4.0F), (double)(var32 + 0.0F))
                        .method_35745((var31 + (float)var38 + 0.5F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                        .method_35742(var19, var20, var21, 0.8F)
                        .method_35755(1.0F, 0.0F, 0.0F)
                        .method_35735();
                     var1.method_35761((double)(var31 + (float)var38 + 1.0F - 9.765625E-4F), (double)(var28 + 0.0F), (double)(var32 + 0.0F))
                        .method_35745((var31 + (float)var38 + 0.5F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                        .method_35742(var19, var20, var21, 0.8F)
                        .method_35755(1.0F, 0.0F, 0.0F)
                        .method_35735();
                  }
               }

               if (var30 > -1) {
                  for (int var39 = 0; var39 < 8; var39++) {
                     var1.method_35761((double)(var31 + 0.0F), (double)(var28 + 4.0F), (double)(var32 + (float)var39 + 0.0F))
                        .method_35745((var31 + 0.0F) * 0.00390625F + var14, (var32 + (float)var39 + 0.5F) * 0.00390625F + var15)
                        .method_35742(var25, var26, var27, 0.8F)
                        .method_35755(0.0F, 0.0F, -1.0F)
                        .method_35735();
                     var1.method_35761((double)(var31 + 8.0F), (double)(var28 + 4.0F), (double)(var32 + (float)var39 + 0.0F))
                        .method_35745((var31 + 8.0F) * 0.00390625F + var14, (var32 + (float)var39 + 0.5F) * 0.00390625F + var15)
                        .method_35742(var25, var26, var27, 0.8F)
                        .method_35755(0.0F, 0.0F, -1.0F)
                        .method_35735();
                     var1.method_35761((double)(var31 + 8.0F), (double)(var28 + 0.0F), (double)(var32 + (float)var39 + 0.0F))
                        .method_35745((var31 + 8.0F) * 0.00390625F + var14, (var32 + (float)var39 + 0.5F) * 0.00390625F + var15)
                        .method_35742(var25, var26, var27, 0.8F)
                        .method_35755(0.0F, 0.0F, -1.0F)
                        .method_35735();
                     var1.method_35761((double)(var31 + 0.0F), (double)(var28 + 0.0F), (double)(var32 + (float)var39 + 0.0F))
                        .method_35745((var31 + 0.0F) * 0.00390625F + var14, (var32 + (float)var39 + 0.5F) * 0.00390625F + var15)
                        .method_35742(var25, var26, var27, 0.8F)
                        .method_35755(0.0F, 0.0F, -1.0F)
                        .method_35735();
                  }
               }

               if (var30 <= 1) {
                  for (int var40 = 0; var40 < 8; var40++) {
                     var1.method_35761((double)(var31 + 0.0F), (double)(var28 + 4.0F), (double)(var32 + (float)var40 + 1.0F - 9.765625E-4F))
                        .method_35745((var31 + 0.0F) * 0.00390625F + var14, (var32 + (float)var40 + 0.5F) * 0.00390625F + var15)
                        .method_35742(var25, var26, var27, 0.8F)
                        .method_35755(0.0F, 0.0F, 1.0F)
                        .method_35735();
                     var1.method_35761((double)(var31 + 8.0F), (double)(var28 + 4.0F), (double)(var32 + (float)var40 + 1.0F - 9.765625E-4F))
                        .method_35745((var31 + 8.0F) * 0.00390625F + var14, (var32 + (float)var40 + 0.5F) * 0.00390625F + var15)
                        .method_35742(var25, var26, var27, 0.8F)
                        .method_35755(0.0F, 0.0F, 1.0F)
                        .method_35735();
                     var1.method_35761((double)(var31 + 8.0F), (double)(var28 + 0.0F), (double)(var32 + (float)var40 + 1.0F - 9.765625E-4F))
                        .method_35745((var31 + 8.0F) * 0.00390625F + var14, (var32 + (float)var40 + 0.5F) * 0.00390625F + var15)
                        .method_35742(var25, var26, var27, 0.8F)
                        .method_35755(0.0F, 0.0F, 1.0F)
                        .method_35735();
                     var1.method_35761((double)(var31 + 0.0F), (double)(var28 + 0.0F), (double)(var32 + (float)var40 + 1.0F - 9.765625E-4F))
                        .method_35745((var31 + 0.0F) * 0.00390625F + var14, (var32 + (float)var40 + 0.5F) * 0.00390625F + var15)
                        .method_35742(var25, var26, var27, 0.8F)
                        .method_35755(0.0F, 0.0F, 1.0F)
                        .method_35735();
                  }
               }
            }
         }
      } else {
         boolean var34 = true;
         byte var35 = 32;

         for (byte var36 = -32; var36 < 32; var36 += 32) {
            for (byte var37 = -32; var37 < 32; var37 += 32) {
               var1.method_35761((double)(var36 + 0), (double)var28, (double)(var37 + 32))
                  .method_35745((float)(var36 + 0) * 0.00390625F + var14, (float)(var37 + 32) * 0.00390625F + var15)
                  .method_35742(var16, var17, var18, 0.8F)
                  .method_35755(0.0F, -1.0F, 0.0F)
                  .method_35735();
               var1.method_35761((double)(var36 + 32), (double)var28, (double)(var37 + 32))
                  .method_35745((float)(var36 + 32) * 0.00390625F + var14, (float)(var37 + 32) * 0.00390625F + var15)
                  .method_35742(var16, var17, var18, 0.8F)
                  .method_35755(0.0F, -1.0F, 0.0F)
                  .method_35735();
               var1.method_35761((double)(var36 + 32), (double)var28, (double)(var37 + 0))
                  .method_35745((float)(var36 + 32) * 0.00390625F + var14, (float)(var37 + 0) * 0.00390625F + var15)
                  .method_35742(var16, var17, var18, 0.8F)
                  .method_35755(0.0F, -1.0F, 0.0F)
                  .method_35735();
               var1.method_35761((double)(var36 + 0), (double)var28, (double)(var37 + 0))
                  .method_35745((float)(var36 + 0) * 0.00390625F + var14, (float)(var37 + 0) * 0.00390625F + var15)
                  .method_35742(var16, var17, var18, 0.8F)
                  .method_35755(0.0F, -1.0F, 0.0F)
                  .method_35735();
            }
         }
      }
   }

   public void method_20024(long var1) {
      var1 = (long)((double)var1 + 1.0E8);
      this.field_20985 = this.field_20985 | this.field_20968.method_30730();
      long var3 = Util.getMeasuringTimeNano();
      boolean var5 = false;
      if (this.field_20921.size() > 0) {
         Iterator var6 = this.field_20921.iterator();

         while (var6.hasNext()) {
            class_3511 var7 = (class_3511)var6.next();
            if (!this.field_20968.method_30727(var7)) {
               break;
            }

            var7.method_16135();
            var6.remove();
            this.field_20924.remove(var7);
            this.field_20941.remove(var7);
         }
      }

      if (this.field_20941.size() > 0) {
         Iterator var16 = this.field_20941.iterator();
         if (var16.hasNext()) {
            class_3511 var18 = (class_3511)var16.next();
            if (this.field_20968.method_30742(var18)) {
               var16.remove();
            }
         }
      }

      double var17 = 0.0;
      int var8 = class_3111.method_14307();
      if (!this.field_20924.isEmpty()) {
         Iterator var9 = this.field_20924.iterator();

         while (var9.hasNext()) {
            class_3511 var10 = (class_3511)var9.next();
            boolean var11 = var10.method_16182();
            boolean var12;
            if (!var10.method_16137() && !var11) {
               var12 = this.field_20968.method_30727(var10);
            } else {
               var12 = this.field_20968.method_30728(var10);
            }

            if (!var12) {
               break;
            }

            var10.method_16135();
            var9.remove();
            if (!var11) {
               double var13 = 2.0 * class_7967.method_36069(var10);
               var17 += var13;
               if (var17 > (double)var8) {
                  break;
               }
            }
         }
      }
   }

   private void method_20079(Camera var1) {
      class_9633 var2 = class_8042.method_36499().method_36501();
      class_2098 var3 = this.field_20970.method_6673();
      double var4 = (double)(this.client.field_9577.field_45537 * 16);
      if (!(var1.method_41627().field_7336 < var3.method_9828() - var4)
         || !(var1.method_41627().field_7336 > var3.method_9821() + var4)
         || !(var1.method_41627().field_7334 < var3.method_9816() - var4)
         || !(var1.method_41627().field_7334 > var3.method_9825() + var4)) {
         if (class_3111.method_14424()) {
            class_6588.method_30315();
            class_6588.method_30236(class_6588.field_33784);
         }

         double var6 = 1.0 - var3.method_9808(var1.method_41627().field_7336, var1.method_41627().field_7334) / var4;
         var6 = Math.pow(var6, 4.0);
         double var8 = var1.method_41627().field_7336;
         double var10 = var1.method_41627().field_7333;
         double var12 = var1.method_41627().field_7334;
         class_3542.method_16488();
         class_3542.method_16428();
         class_3542.method_16425(class_5033.field_26042, class_8535.field_43691, class_5033.field_26047, class_8535.field_43699);
         this.textureManager.method_35674(FORCEFIELD);
         class_3542.method_16387(MinecraftClient.method_8497());
         class_3542.method_16438();
         int var14 = var3.method_9839().method_18609();
         float var15 = (float)(var14 >> 16 & 0xFF) / 255.0F;
         float var16 = (float)(var14 >> 8 & 0xFF) / 255.0F;
         float var17 = (float)(var14 & 0xFF) / 255.0F;
         class_3542.method_16480(var15, var16, var17, (float)var6);
         class_3542.method_16475(-3.0F, -3.0F);
         class_3542.method_16464();
         class_3542.method_16433();
         class_3542.method_16374();
         class_3542.method_16393();
         float var18 = (float)(Util.getMeasuringTimeMs() % 3000L) / 3000.0F;
         float var19 = 0.0F;
         float var20 = 0.0F;
         float var21 = 128.0F;
         var2.method_44471(7, class_7985.field_40912);
         double var22 = Math.max((double)class_9299.method_42847(var12 - var4), var3.method_9825());
         double var24 = Math.min((double)class_9299.method_42815(var12 + var4), var3.method_9816());
         if (var8 > var3.method_9828() - var4) {
            float var26 = 0.0F;

            for (double var27 = var22; var27 < var24; var26 += 0.5F) {
               double var29 = Math.min(1.0, var24 - var27);
               float var31 = (float)var29 * 0.5F;
               this.method_20083(var2, var8, var10, var12, var3.method_9828(), 256, var27, var18 + var26, var18 + 0.0F);
               this.method_20083(var2, var8, var10, var12, var3.method_9828(), 256, var27 + var29, var18 + var31 + var26, var18 + 0.0F);
               this.method_20083(var2, var8, var10, var12, var3.method_9828(), 0, var27 + var29, var18 + var31 + var26, var18 + 128.0F);
               this.method_20083(var2, var8, var10, var12, var3.method_9828(), 0, var27, var18 + var26, var18 + 128.0F);
               var27++;
            }
         }

         if (var8 < var3.method_9821() + var4) {
            float var35 = 0.0F;

            for (double var38 = var22; var38 < var24; var35 += 0.5F) {
               double var41 = Math.min(1.0, var24 - var38);
               float var44 = (float)var41 * 0.5F;
               this.method_20083(var2, var8, var10, var12, var3.method_9821(), 256, var38, var18 + var35, var18 + 0.0F);
               this.method_20083(var2, var8, var10, var12, var3.method_9821(), 256, var38 + var41, var18 + var44 + var35, var18 + 0.0F);
               this.method_20083(var2, var8, var10, var12, var3.method_9821(), 0, var38 + var41, var18 + var44 + var35, var18 + 128.0F);
               this.method_20083(var2, var8, var10, var12, var3.method_9821(), 0, var38, var18 + var35, var18 + 128.0F);
               var38++;
            }
         }

         var22 = Math.max((double)class_9299.method_42847(var8 - var4), var3.method_9821());
         var24 = Math.min((double)class_9299.method_42815(var8 + var4), var3.method_9828());
         if (var12 > var3.method_9816() - var4) {
            float var36 = 0.0F;

            for (double var39 = var22; var39 < var24; var36 += 0.5F) {
               double var42 = Math.min(1.0, var24 - var39);
               float var45 = (float)var42 * 0.5F;
               this.method_20083(var2, var8, var10, var12, var39, 256, var3.method_9816(), var18 + var36, var18 + 0.0F);
               this.method_20083(var2, var8, var10, var12, var39 + var42, 256, var3.method_9816(), var18 + var45 + var36, var18 + 0.0F);
               this.method_20083(var2, var8, var10, var12, var39 + var42, 0, var3.method_9816(), var18 + var45 + var36, var18 + 128.0F);
               this.method_20083(var2, var8, var10, var12, var39, 0, var3.method_9816(), var18 + var36, var18 + 128.0F);
               var39++;
            }
         }

         if (var12 < var3.method_9825() + var4) {
            float var37 = 0.0F;

            for (double var40 = var22; var40 < var24; var37 += 0.5F) {
               double var43 = Math.min(1.0, var24 - var40);
               float var46 = (float)var43 * 0.5F;
               this.method_20083(var2, var8, var10, var12, var40, 256, var3.method_9825(), var18 + var37, var18 + 0.0F);
               this.method_20083(var2, var8, var10, var12, var40 + var43, 256, var3.method_9825(), var18 + var46 + var37, var18 + 0.0F);
               this.method_20083(var2, var8, var10, var12, var40 + var43, 0, var3.method_9825(), var18 + var46 + var37, var18 + 128.0F);
               this.method_20083(var2, var8, var10, var12, var40, 0, var3.method_9825(), var18 + var37, var18 + 128.0F);
               var40++;
            }
         }

         var2.method_44487();
         class_138.method_554(var2);
         class_3542.method_16361();
         class_3542.method_16458();
         class_3542.method_16475(0.0F, 0.0F);
         class_3542.method_16382();
         class_3542.method_16374();
         class_3542.method_16425(class_5033.field_26042, class_8535.field_43697, class_5033.field_26047, class_8535.field_43699);
         class_3542.method_16448();
         class_3542.method_16489();
         class_3542.method_16387(true);
         if (class_3111.method_14424()) {
            class_6588.method_30118();
         }
      }
   }

   private void method_20083(class_9633 var1, double var2, double var4, double var6, double var8, int var10, double var11, float var13, float var14) {
      var1.method_35761(var8 - var2, (double)var10 - var4, var11 - var6).method_35745(var13, var14).method_35735();
   }

   private void method_20053(class_7966 var1, class_7907 var2, Entity var3, double var4, double var6, double var8, class_1331 var10, class_2522 var11) {
      method_20046(
         var1,
         var2,
         var11.method_8335(this.field_20970, var10, class_214.method_926(var3)),
         (double)var10.method_12173() - var4,
         (double)var10.method_12165() - var6,
         (double)var10.method_12185() - var8,
         0.0F,
         0.0F,
         0.0F,
         0.4F
      );
   }

   public static void method_20051(
      class_7966 var0, class_7907 var1, class_4190 var2, double var3, double var5, double var7, float var9, float var10, float var11, float var12
   ) {
      List var13 = var2.method_19492();
      int var14 = class_9299.method_42815((double)var13.size() / 3.0);

      for (int var15 = 0; var15 < var13.size(); var15++) {
         class_4092 var16 = (class_4092)var13.get(var15);
         float var17 = ((float)var15 % (float)var14 + 1.0F) / (float)var14;
         float var18 = (float)(var15 / var14);
         float var19 = var17 * (float)(var18 == 0.0F ? 1 : 0);
         float var20 = var17 * (float)(var18 == 1.0F ? 1 : 0);
         float var21 = var17 * (float)(var18 == 2.0F ? 1 : 0);
         method_20046(var0, var1, class_3370.method_15523(var16.method_18918(0.0, 0.0, 0.0)), var3, var5, var7, var19, var20, var21, 1.0F);
      }
   }

   private static void method_20046(
      class_7966 var0, class_7907 var1, class_4190 var2, double var3, double var5, double var7, float var9, float var10, float var11, float var12
   ) {
      class_8107 var13 = var0.method_36058().method_28620();
      var2.method_19489((var12x, var14, var16, var18, var20, var22) -> {
         var1.method_35762(var13, (float)(var12x + var3), (float)(var14 + var5), (float)(var16 + var7)).method_35742(var9, var10, var11, var12).method_35735();
         var1.method_35762(var13, (float)(var18 + var3), (float)(var20 + var5), (float)(var22 + var7)).method_35742(var9, var10, var11, var12).method_35735();
      });
   }

   public static void method_20014(class_7966 var0, class_7907 var1, class_4092 var2, float var3, float var4, float var5, float var6) {
      method_20013(
         var0,
         var1,
         var2.field_19941,
         var2.field_19937,
         var2.field_19938,
         var2.field_19940,
         var2.field_19939,
         var2.field_19942,
         var3,
         var4,
         var5,
         var6,
         var3,
         var4,
         var5
      );
   }

   public static void method_20012(
      class_7966 var0,
      class_7907 var1,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      float var14,
      float var15,
      float var16,
      float var17
   ) {
      method_20013(var0, var1, var2, var4, var6, var8, var10, var12, var14, var15, var16, var17, var14, var15, var16);
   }

   public static void method_20013(
      class_7966 var0,
      class_7907 var1,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      float var14,
      float var15,
      float var16,
      float var17,
      float var18,
      float var19,
      float var20
   ) {
      class_8107 var21 = var0.method_36058().method_28620();
      float var22 = (float)var2;
      float var23 = (float)var4;
      float var24 = (float)var6;
      float var25 = (float)var8;
      float var26 = (float)var10;
      float var27 = (float)var12;
      var1.method_35762(var21, var22, var23, var24).method_35742(var14, var19, var20, var17).method_35735();
      var1.method_35762(var21, var25, var23, var24).method_35742(var14, var19, var20, var17).method_35735();
      var1.method_35762(var21, var22, var23, var24).method_35742(var18, var15, var20, var17).method_35735();
      var1.method_35762(var21, var22, var26, var24).method_35742(var18, var15, var20, var17).method_35735();
      var1.method_35762(var21, var22, var23, var24).method_35742(var18, var19, var16, var17).method_35735();
      var1.method_35762(var21, var22, var23, var27).method_35742(var18, var19, var16, var17).method_35735();
      var1.method_35762(var21, var25, var23, var24).method_35742(var14, var15, var16, var17).method_35735();
      var1.method_35762(var21, var25, var26, var24).method_35742(var14, var15, var16, var17).method_35735();
      var1.method_35762(var21, var25, var26, var24).method_35742(var14, var15, var16, var17).method_35735();
      var1.method_35762(var21, var22, var26, var24).method_35742(var14, var15, var16, var17).method_35735();
      var1.method_35762(var21, var22, var26, var24).method_35742(var14, var15, var16, var17).method_35735();
      var1.method_35762(var21, var22, var26, var27).method_35742(var14, var15, var16, var17).method_35735();
      var1.method_35762(var21, var22, var26, var27).method_35742(var14, var15, var16, var17).method_35735();
      var1.method_35762(var21, var22, var23, var27).method_35742(var14, var15, var16, var17).method_35735();
      var1.method_35762(var21, var22, var23, var27).method_35742(var14, var15, var16, var17).method_35735();
      var1.method_35762(var21, var25, var23, var27).method_35742(var14, var15, var16, var17).method_35735();
      var1.method_35762(var21, var25, var23, var27).method_35742(var14, var15, var16, var17).method_35735();
      var1.method_35762(var21, var25, var23, var24).method_35742(var14, var15, var16, var17).method_35735();
      var1.method_35762(var21, var22, var26, var27).method_35742(var14, var15, var16, var17).method_35735();
      var1.method_35762(var21, var25, var26, var27).method_35742(var14, var15, var16, var17).method_35735();
      var1.method_35762(var21, var25, var23, var27).method_35742(var14, var15, var16, var17).method_35735();
      var1.method_35762(var21, var25, var26, var27).method_35742(var14, var15, var16, var17).method_35735();
      var1.method_35762(var21, var25, var26, var24).method_35742(var14, var15, var16, var17).method_35735();
      var1.method_35762(var21, var25, var26, var27).method_35742(var14, var15, var16, var17).method_35735();
   }

   public static void method_20064(
      class_9633 var0, double var1, double var3, double var5, double var7, double var9, double var11, float var13, float var14, float var15, float var16
   ) {
      var0.method_35761(var1, var3, var5).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var1, var3, var5).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var1, var3, var5).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var1, var3, var11).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var1, var9, var5).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var1, var9, var11).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var1, var9, var11).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var1, var3, var11).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var7, var9, var11).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var7, var3, var11).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var7, var3, var11).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var7, var3, var5).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var7, var9, var11).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var7, var9, var5).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var7, var9, var5).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var7, var3, var5).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var1, var9, var5).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var1, var3, var5).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var1, var3, var5).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var7, var3, var5).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var1, var3, var11).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var7, var3, var11).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var7, var3, var11).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var1, var9, var5).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var1, var9, var5).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var1, var9, var11).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var7, var9, var5).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var7, var9, var11).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var7, var9, var11).method_35742(var13, var14, var15, var16).method_35735();
      var0.method_35761(var7, var9, var11).method_35742(var13, var14, var15, var16).method_35735();
   }

   public void method_20066(class_6163 var1, class_1331 var2, class_2522 var3, class_2522 var4, int var5) {
      this.method_20065(var2, false);
   }

   private void method_20065(class_1331 var1, boolean var2) {
      for (int var3 = var1.method_12185() - 1; var3 <= var1.method_12185() + 1; var3++) {
         for (int var4 = var1.method_12173() - 1; var4 <= var1.method_12173() + 1; var4++) {
            for (int var5 = var1.method_12165() - 1; var5 <= var1.method_12165() + 1; var5++) {
               this.method_20071(var4 >> 4, var5 >> 4, var3 >> 4, var2);
            }
         }
      }
   }

   public void method_20093(int var1, int var2, int var3, int var4, int var5, int var6) {
      for (int var7 = var3 - 1; var7 <= var6 + 1; var7++) {
         for (int var8 = var1 - 1; var8 <= var4 + 1; var8++) {
            for (int var9 = var2 - 1; var9 <= var5 + 1; var9++) {
               this.method_20070(var8 >> 4, var9 >> 4, var7 >> 4);
            }
         }
      }
   }

   public void method_20094(class_1331 var1, class_2522 var2, class_2522 var3) {
      if (this.client.method_8535().method_33944(var2, var3)) {
         this.method_20093(var1.method_12173(), var1.method_12165(), var1.method_12185(), var1.method_12173(), var1.method_12165(), var1.method_12185());
      }
   }

   public void method_20085(int var1, int var2, int var3) {
      for (int var4 = var3 - 1; var4 <= var3 + 1; var4++) {
         for (int var5 = var1 - 1; var5 <= var1 + 1; var5++) {
            for (int var6 = var2 - 1; var6 <= var2 + 1; var6++) {
               this.method_20070(var5, var6, var4);
            }
         }
      }
   }

   public void method_20070(int var1, int var2, int var3) {
      this.method_20071(var1, var2, var3, false);
   }

   private void method_20071(int var1, int var2, int var3, boolean var4) {
      this.field_20966.method_34569(var1, var2, var3, var4);
   }

   public void method_20088(class_8461 var1, class_1331 var2) {
      this.method_20089(var1, var2, var1 == null ? null : class_7738.method_35031(var1));
   }

   public void method_20089(class_8461 var1, class_1331 var2, class_7738 var3) {
      class_3560 var4 = this.field_20971.get(var2);
      if (var4 != null) {
         this.client.method_8590().method_16336(var4);
         this.field_20971.remove(var2);
      }

      if (var1 != null) {
         class_7738 var5 = class_7738.method_35031(var1);
         if (class_7860.field_40144.method_45472()) {
            var5 = var3;
         }

         if (var5 != null) {
            this.client.field_9614.method_13974(var5.method_35029());
         }

         class_4949 var6 = class_4949.method_22679(var1, (double)var2.method_12173(), (double)var2.method_12165(), (double)var2.method_12185());
         this.field_20971.put(var2, var6);
         this.client.method_8590().method_16345(var6);
      }

      this.method_20080(this.field_20970, var2, var1 != null);
   }

   private void method_20080(World var1, class_1331 var2, boolean var3) {
      for (class_5834 var5 : var1.<class_5834>method_25868(class_5834.class, new class_4092(var2).method_18898(3.0))) {
         var5.method_26424(var2, var3);
      }
   }

   public void method_20040(class_5079 var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      this.method_20041(var1, var2, false, var3, var5, var7, var9, var11, var13);
   }

   public void method_20041(class_5079 var1, boolean var2, boolean var3, double var4, double var6, double var8, double var10, double var12, double var14) {
      try {
         this.method_20063(var1, var2, var3, var4, var6, var8, var10, var12, var14);
      } catch (Throwable var19) {
         class_159 var17 = class_159.method_643(var19, "Exception while adding particle");
         class_6544 var18 = var17.method_639("Particle being added");
         var18.method_29850("ID", class_8669.field_44387.method_39797(var1.method_23357()));
         var18.method_29850("Parameters", var1.method_23358());
         var18.method_29851("Position", () -> class_6544.method_29844(var4, var6, var8));
         throw new class_3297(var17);
      }
   }

   private <T extends class_5079> void method_20061(T var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this.method_20040(var1, var1.method_23357().method_39479(), var2, var4, var6, var8, var10, var12);
   }

   @Nullable
   private class_9733 method_20062(class_5079 var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      return this.method_20063(var1, var2, false, var3, var5, var7, var9, var11, var13);
   }

   @Nullable
   private class_9733 method_20063(class_5079 var1, boolean var2, boolean var3, double var4, double var6, double var8, double var10, double var12, double var14) {
      Camera var16 = this.client.gameRenderer.method_35949();
      if (this.client != null && var16.method_41642() && this.client.field_9572 != null) {
         class_9761 var17 = this.method_20020(var3);
         if (var1 == class_3090.field_15377 && !class_3111.method_14418()) {
            return null;
         } else if (var1 == class_3090.field_15339 && !class_3111.method_14418()) {
            return null;
         } else if (var1 == class_3090.field_15343 && !class_3111.method_14418()) {
            return null;
         } else if (var1 == class_3090.field_15350 && !class_3111.method_14268()) {
            return null;
         } else if (var1 == class_3090.field_15376 && !class_3111.method_14246()) {
            return null;
         } else if (var1 == class_3090.field_15319 && !class_3111.method_14246()) {
            return null;
         } else if (var1 == class_3090.field_15353 && !class_3111.method_14426()) {
            return null;
         } else if (var1 == class_3090.field_15364 && !class_3111.method_14426()) {
            return null;
         } else if (var1 == class_3090.field_15338 && !class_3111.method_14426()) {
            return null;
         } else if (var1 == class_3090.field_15324 && !class_3111.method_14426()) {
            return null;
         } else if (var1 == class_3090.field_15342 && !class_3111.method_14426()) {
            return null;
         } else if (var1 == class_3090.field_15356 && !class_3111.method_14433()) {
            return null;
         } else if (var1 == class_3090.field_15321 && !class_3111.method_14301()) {
            return null;
         } else if (var1 == class_3090.field_15365 && !class_3111.method_14301()) {
            return null;
         } else if (var1 == class_3090.field_15317 && !class_3111.method_14413()) {
            return null;
         } else if (var1 == class_3090.field_15358 && !class_3111.method_14338()) {
            return null;
         } else if (var1 == class_3090.field_15336 && !class_3111.method_14338()) {
            return null;
         } else if (var1 == class_3090.field_15366 && !class_3111.method_14429()) {
            return null;
         } else {
            if (!var2) {
               double var18 = 1024.0;
               if (var1 == class_3090.field_15322) {
                  var18 = 38416.0;
               }

               if (var16.method_41627().method_6203(var4, var6, var8) > var18) {
                  return null;
               }

               if (var17 == class_9761.field_49573) {
                  return null;
               }
            }

            class_9733 var20 = this.client.field_9572.method_43062(var1, var4, var6, var8, var10, var12, var14);
            if (var1 == class_3090.field_15340) {
               class_9300.method_42921(var20, this.field_20970, var4, var6, var8, this.field_20960);
            }

            if (var1 == class_3090.field_15346) {
               class_9300.method_42921(var20, this.field_20970, var4, var6, var8, this.field_20960);
            }

            if (var1 == class_3090.field_15386) {
               class_9300.method_42921(var20, this.field_20970, var4, var6, var8, this.field_20960);
            }

            if (var1 == class_3090.field_15328) {
               class_9300.method_42900(var20);
            }

            if (var1 == class_3090.field_15356) {
               class_9300.method_42877(var20);
            }

            if (var1 == class_3090.field_15317) {
               class_9300.method_42862(var20, this.field_20970, var4, var6, var8);
            }

            return var20;
         }
      } else {
         return null;
      }
   }

   private class_9761 method_20020(boolean var1) {
      class_9761 var2 = this.client.field_9577.field_45505;
      if (var1 && var2 == class_9761.field_49573 && this.field_20970.field_33033.nextInt(10) == 0) {
         var2 = class_9761.field_49576;
      }

      if (var2 == class_9761.field_49576 && this.field_20970.field_33033.nextInt(3) == 0) {
         var2 = class_9761.field_49573;
      }

      return var2;
   }

   public void method_20034() {
   }

   public void method_20081(int var1, class_1331 var2, int var3) {
      switch (var1) {
         case 1023:
         case 1028:
         case 1038:
            Camera var4 = this.client.gameRenderer.method_35949();
            if (var4.method_41642()) {
               double var5 = (double)var2.method_12173() - var4.method_41627().field_7336;
               double var7 = (double)var2.method_12165() - var4.method_41627().field_7333;
               double var9 = (double)var2.method_12185() - var4.method_41627().field_7334;
               double var11 = Math.sqrt(var5 * var5 + var7 * var7 + var9 * var9);
               double var13 = var4.method_41627().field_7336;
               double var15 = var4.method_41627().field_7333;
               double var17 = var4.method_41627().field_7334;
               if (var11 > 0.0) {
                  var13 += var5 / var11 * 2.0;
                  var15 += var7 / var11 * 2.0;
                  var17 += var9 / var11 * 2.0;
               }

               if (var1 == 1023) {
                  this.field_20970.method_29527(var13, var15, var17, class_463.field_2197, class_562.field_3332, 1.0F, 1.0F, false);
               } else if (var1 == 1038) {
                  this.field_20970.method_29527(var13, var15, var17, class_463.field_2767, class_562.field_3332, 1.0F, 1.0F, false);
               } else {
                  this.field_20970.method_29527(var13, var15, var17, class_463.field_2368, class_562.field_3332, 5.0F, 1.0F, false);
               }
            }
      }
   }

   public void method_20038(class_704 var1, int var2, class_1331 var3, int var4) {
      Random var5 = this.field_20970.field_33033;
      switch (var2) {
         case 1000:
            this.field_20970.method_721(var3, class_463.field_2033, class_562.field_3322, 1.0F, 1.0F, false);
            break;
         case 1001:
            this.field_20970.method_721(var3, class_463.field_2665, class_562.field_3322, 1.0F, 1.2F, false);
            break;
         case 1002:
            this.field_20970.method_721(var3, class_463.field_2794, class_562.field_3322, 1.0F, 1.2F, false);
            break;
         case 1003:
            this.field_20970.method_721(var3, class_463.field_1994, class_562.field_3328, 1.0F, 1.2F, false);
            break;
         case 1004:
            this.field_20970.method_721(var3, class_463.field_2784, class_562.field_3328, 1.0F, 1.2F, false);
            break;
         case 1005:
            this.field_20970.method_721(var3, class_463.field_2301, class_562.field_3322, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1006:
            this.field_20970.method_721(var3, class_463.field_2708, class_562.field_3322, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1007:
            this.field_20970.method_721(var3, class_463.field_2289, class_562.field_3322, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1008:
            this.field_20970.method_721(var3, class_463.field_2666, class_562.field_3322, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1009:
            this.field_20970.method_721(var3, class_463.field_2472, class_562.field_3322, 0.5F, 2.6F + (var5.nextFloat() - var5.nextFloat()) * 0.8F, false);
            break;
         case 1010:
            if (class_2451.method_11220(var4) instanceof class_7738) {
               if (class_7860.field_40144.method_45472()) {
                  this.method_20089(((class_7738)class_2451.method_11220(var4)).method_35032(), var3, (class_7738)class_2451.method_11220(var4));
               } else {
                  this.method_20088(((class_7738)class_2451.method_11220(var4)).method_35032(), var3);
               }
            } else {
               this.method_20088((class_8461)null, var3);
            }
            break;
         case 1011:
            this.field_20970.method_721(var3, class_463.field_2293, class_562.field_3322, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1012:
            this.field_20970.method_721(var3, class_463.field_2334, class_562.field_3322, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1013:
            this.field_20970.method_721(var3, class_463.field_2452, class_562.field_3322, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1014:
            this.field_20970.method_721(var3, class_463.field_2329, class_562.field_3322, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1015:
            this.field_20970.method_721(var3, class_463.field_2569, class_562.field_3332, 10.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1016:
            this.field_20970.method_721(var3, class_463.field_2600, class_562.field_3332, 10.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1017:
            this.field_20970.method_721(var3, class_463.field_1987, class_562.field_3332, 10.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1018:
            this.field_20970.method_721(var3, class_463.field_2346, class_562.field_3332, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1019:
            this.field_20970.method_721(var3, class_463.field_2765, class_562.field_3332, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1020:
            this.field_20970.method_721(var3, class_463.field_2111, class_562.field_3332, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1021:
            this.field_20970.method_721(var3, class_463.field_2043, class_562.field_3332, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1022:
            this.field_20970.method_721(var3, class_463.field_2011, class_562.field_3332, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1024:
            this.field_20970.method_721(var3, class_463.field_2138, class_562.field_3332, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1025:
            this.field_20970.method_721(var3, class_463.field_2284, class_562.field_3328, 0.05F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1026:
            this.field_20970.method_721(var3, class_463.field_2241, class_562.field_3332, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1027:
            this.field_20970.method_721(var3, class_463.field_2040, class_562.field_3328, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1029:
            this.field_20970.method_721(var3, class_463.field_2884, class_562.field_3322, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1030:
            this.field_20970.method_721(var3, class_463.field_2829, class_562.field_3322, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1031:
            this.field_20970.method_721(var3, class_463.field_2802, class_562.field_3322, 0.3F, this.field_20970.field_33033.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1032:
            this.client.method_8590().method_16345(class_4949.method_22680(class_463.field_2294, var5.nextFloat() * 0.4F + 0.8F, 0.25F));
            break;
         case 1033:
            this.field_20970.method_721(var3, class_463.field_2280, class_562.field_3322, 1.0F, 1.0F, false);
            break;
         case 1034:
            this.field_20970.method_721(var3, class_463.field_2045, class_562.field_3322, 1.0F, 1.0F, false);
            break;
         case 1035:
            this.field_20970.method_721(var3, class_463.field_2290, class_562.field_3322, 1.0F, 1.0F, false);
            break;
         case 1036:
            this.field_20970.method_721(var3, class_463.field_2503, class_562.field_3322, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1037:
            this.field_20970.method_721(var3, class_463.field_2574, class_562.field_3322, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1039:
            this.field_20970.method_721(var3, class_463.field_2868, class_562.field_3332, 0.3F, this.field_20970.field_33033.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1040:
            this.field_20970.method_721(var3, class_463.field_2787, class_562.field_3328, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1041:
            this.field_20970.method_721(var3, class_463.field_2547, class_562.field_3328, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1042:
            this.field_20970.method_721(var3, class_463.field_2132, class_562.field_3322, 1.0F, this.field_20970.field_33033.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1043:
            this.field_20970.method_721(var3, class_463.field_2778, class_562.field_3322, 1.0F, this.field_20970.field_33033.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1044:
            this.field_20970.method_721(var3, class_463.field_1971, class_562.field_3322, 1.0F, this.field_20970.field_33033.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1500:
            class_7689.method_34836(this.field_20970, var3, var4 > 0);
            break;
         case 1501:
            this.field_20970.method_721(var3, class_463.field_2430, class_562.field_3322, 0.5F, 2.6F + (var5.nextFloat() - var5.nextFloat()) * 0.8F, false);

            for (int var40 = 0; var40 < 8; var40++) {
               this.field_20970
                  .method_43361(
                     class_3090.field_15319,
                     (double)var3.method_12173() + var5.nextDouble(),
                     (double)var3.method_12165() + 1.2,
                     (double)var3.method_12185() + var5.nextDouble(),
                     0.0,
                     0.0,
                     0.0
                  );
            }
            break;
         case 1502:
            this.field_20970.method_721(var3, class_463.field_2575, class_562.field_3322, 0.5F, 2.6F + (var5.nextFloat() - var5.nextFloat()) * 0.8F, false);

            for (int var39 = 0; var39 < 5; var39++) {
               double var42 = (double)var3.method_12173() + var5.nextDouble() * 0.6 + 0.2;
               double var44 = (double)var3.method_12165() + var5.nextDouble() * 0.6 + 0.2;
               double var45 = (double)var3.method_12185() + var5.nextDouble() * 0.6 + 0.2;
               this.field_20970.method_43361(class_3090.field_15376, var42, var44, var45, 0.0, 0.0, 0.0);
            }
            break;
         case 1503:
            this.field_20970.method_721(var3, class_463.field_2689, class_562.field_3322, 1.0F, 1.0F, false);

            for (int var38 = 0; var38 < 16; var38++) {
               double var41 = (double)var3.method_12173() + (5.0 + var5.nextDouble() * 6.0) / 16.0;
               double var43 = (double)var3.method_12165() + 0.8125;
               double var11 = (double)var3.method_12185() + (5.0 + var5.nextDouble() * 6.0) / 16.0;
               this.field_20970.method_43361(class_3090.field_15376, var41, var43, var11, 0.0, 0.0, 0.0);
            }
            break;
         case 2000:
            Direction var6 = Direction.method_1033(var4);
            int var7 = var6.method_1041();
            int var8 = var6.method_1054();
            int var9 = var6.method_1034();
            double var10 = (double)var3.method_12173() + (double)var7 * 0.6 + 0.5;
            double var12 = (double)var3.method_12165() + (double)var8 * 0.6 + 0.5;
            double var14 = (double)var3.method_12185() + (double)var9 * 0.6 + 0.5;

            for (int var46 = 0; var46 < 10; var46++) {
               double var48 = var5.nextDouble() * 0.2 + 0.01;
               double var50 = var10 + (double)var7 * 0.01 + (var5.nextDouble() - 0.5) * (double)var9 * 0.5;
               double var51 = var12 + (double)var8 * 0.01 + (var5.nextDouble() - 0.5) * (double)var8 * 0.5;
               double var53 = var14 + (double)var9 * 0.01 + (var5.nextDouble() - 0.5) * (double)var7 * 0.5;
               double var54 = (double)var7 * var48 + var5.nextGaussian() * 0.01;
               double var55 = (double)var8 * var48 + var5.nextGaussian() * 0.01;
               double var62 = (double)var9 * var48 + var5.nextGaussian() * 0.01;
               this.method_20061(class_3090.field_15376, var50, var51, var53, var54, var55, var62);
            }
            break;
         case 2001:
            class_2522 var16 = class_6414.method_29293(var4);
            if (!class_8835.method_40652(var16, this.field_20970, var3)) {
               class_4618 var47 = var16.method_8316();
               if (class_7860.field_40208.method_3596()) {
                  var47 = (class_4618)class_7860.method_35555(var16, class_7860.field_40208, this.field_20970, var3, null);
               }

               this.field_20970
                  .method_721(var3, var47.method_21390(), class_562.field_3322, (var47.method_21395() + 1.0F) / 2.0F, var47.method_21393() * 0.8F, false);
            }

            this.client.field_9572.method_43048(var3, var16);
            break;
         case 2002:
         case 2007:
            class_1343 var17 = class_1343.method_6200(var3);

            for (int var18 = 0; var18 < 8; var18++) {
               this.method_20061(
                  new class_8661(class_3090.field_15351, new class_6098(class_4897.field_25226)),
                  var17.field_7336,
                  var17.field_7333,
                  var17.field_7334,
                  var5.nextGaussian() * 0.15,
                  var5.nextDouble() * 0.2,
                  var5.nextGaussian() * 0.15
               );
            }

            float var49 = (float)(var4 >> 16 & 0xFF) / 255.0F;
            float var19 = (float)(var4 >> 8 & 0xFF) / 255.0F;
            float var20 = (float)(var4 >> 0 & 0xFF) / 255.0F;
            class_2427 var21 = var2 == 2007 ? class_3090.field_15324 : class_3090.field_15338;

            for (int var52 = 0; var52 < 100; var52++) {
               double var23 = var5.nextDouble() * 4.0;
               double var25 = var5.nextDouble() * Math.PI * 2.0;
               double var27 = Math.cos(var25) * var23;
               double var61 = 0.01 + var5.nextDouble() * 0.5;
               double var64 = Math.sin(var25) * var23;
               class_9733 var66 = this.method_20062(
                  var21,
                  var21.method_23357().method_39479(),
                  var17.field_7336 + var27 * 0.1,
                  var17.field_7333 + 0.3,
                  var17.field_7334 + var64 * 0.1,
                  var27,
                  var61,
                  var64
               );
               if (var66 != null) {
                  float var34 = 0.75F + var5.nextFloat() * 0.25F;
                  var66.method_44953(var49 * var34, var19 * var34, var20 * var34);
                  var66.method_44963((float)var23);
               }
            }

            this.field_20970.method_721(var3, class_463.field_2805, class_562.field_3328, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 2003:
            double var22 = (double)var3.method_12173() + 0.5;
            double var24 = (double)var3.method_12165();
            double var26 = (double)var3.method_12185() + 0.5;

            for (int var58 = 0; var58 < 8; var58++) {
               this.method_20061(
                  new class_8661(class_3090.field_15351, new class_6098(class_4897.field_24519)),
                  var22,
                  var24,
                  var26,
                  var5.nextGaussian() * 0.15,
                  var5.nextDouble() * 0.2,
                  var5.nextGaussian() * 0.15
               );
            }

            for (double var59 = 0.0; var59 < Math.PI * 2; var59 += Math.PI / 20) {
               this.method_20061(
                  class_3090.field_15356,
                  var22 + Math.cos(var59) * 5.0,
                  var24 - 0.4,
                  var26 + Math.sin(var59) * 5.0,
                  Math.cos(var59) * -5.0,
                  0.0,
                  Math.sin(var59) * -5.0
               );
               this.method_20061(
                  class_3090.field_15356,
                  var22 + Math.cos(var59) * 5.0,
                  var24 - 0.4,
                  var26 + Math.sin(var59) * 5.0,
                  Math.cos(var59) * -7.0,
                  0.0,
                  Math.sin(var59) * -7.0
               );
            }
            break;
         case 2004:
            for (int var57 = 0; var57 < 20; var57++) {
               double var60 = (double)var3.method_12173() + 0.5 + (var5.nextDouble() - 0.5) * 2.0;
               double var63 = (double)var3.method_12165() + 0.5 + (var5.nextDouble() - 0.5) * 2.0;
               double var65 = (double)var3.method_12185() + 0.5 + (var5.nextDouble() - 0.5) * 2.0;
               this.field_20970.method_43361(class_3090.field_15376, var60, var63, var65, 0.0, 0.0, 0.0);
               this.field_20970.method_43361(class_3090.field_15321, var60, var63, var65, 0.0, 0.0, 0.0);
            }
            break;
         case 2005:
            class_8579.method_39458(this.field_20970, var3, var4);
            break;
         case 2006:
            for (int var56 = 0; var56 < 200; var56++) {
               float var29 = var5.nextFloat() * 4.0F;
               float var30 = var5.nextFloat() * (float) (Math.PI * 2);
               double var31 = (double)(class_9299.method_42840(var30) * var29);
               double var33 = 0.01 + var5.nextDouble() * 0.5;
               double var35 = (double)(class_9299.method_42818(var30) * var29);
               class_9733 var37 = this.method_20062(
                  class_3090.field_15315,
                  false,
                  (double)var3.method_12173() + var31 * 0.1,
                  (double)var3.method_12165() + 0.3,
                  (double)var3.method_12185() + var35 * 0.1,
                  var31,
                  var33,
                  var35
               );
               if (var37 != null) {
                  var37.method_44963(var29);
               }
            }

            if (var4 == 1) {
               this.field_20970.method_721(var3, class_463.field_2176, class_562.field_3332, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            }
            break;
         case 2008:
            this.field_20970
               .method_43361(
                  class_3090.field_15339,
                  (double)var3.method_12173() + 0.5,
                  (double)var3.method_12165() + 0.5,
                  (double)var3.method_12185() + 0.5,
                  0.0,
                  0.0,
                  0.0
               );
            break;
         case 2009:
            for (int var28 = 0; var28 < 8; var28++) {
               this.field_20970
                  .method_43361(
                     class_3090.field_15385,
                     (double)var3.method_12173() + var5.nextDouble(),
                     (double)var3.method_12165() + 1.2,
                     (double)var3.method_12185() + var5.nextDouble(),
                     0.0,
                     0.0,
                     0.0
                  );
            }
            break;
         case 3000:
            this.field_20970
               .method_29543(
                  class_3090.field_15377,
                  true,
                  (double)var3.method_12173() + 0.5,
                  (double)var3.method_12165() + 0.5,
                  (double)var3.method_12185() + 0.5,
                  0.0,
                  0.0,
                  0.0
               );
            this.field_20970
               .method_721(
                  var3,
                  class_463.field_2333,
                  class_562.field_3322,
                  10.0F,
                  (1.0F + (this.field_20970.field_33033.nextFloat() - this.field_20970.field_33033.nextFloat()) * 0.2F) * 0.7F,
                  false
               );
            break;
         case 3001:
            this.field_20970.method_721(var3, class_463.field_1942, class_562.field_3332, 64.0F, 0.8F + this.field_20970.field_33033.nextFloat() * 0.3F, false);
      }
   }

   public void method_20073(int var1, class_1331 var2, int var3) {
      if (var3 >= 0 && var3 < 10) {
         class_9259 var5 = (class_9259)this.field_20945.get(var1);
         if (var5 != null) {
            this.method_20082(var5);
         }

         if (var5 == null
            || var5.method_42661().method_12173() != var2.method_12173()
            || var5.method_42661().method_12165() != var2.method_12165()
            || var5.method_42661().method_12185() != var2.method_12185()) {
            var5 = new class_9259(var1, var2);
            this.field_20945.put(var1, var5);
         }

         var5.method_42659(var3);
         var5.method_42657(this.field_20997);
         ((SortedSet)this.field_20948.computeIfAbsent(var5.method_42661().method_6077(), var0 -> Sets.newTreeSet())).add(var5);
      } else {
         class_9259 var4 = (class_9259)this.field_20945.remove(var1);
         if (var4 != null) {
            this.method_20082(var4);
         }
      }
   }

   public boolean method_20019() {
      return this.field_20924.isEmpty() && this.field_20968.method_30740();
   }

   public void method_20018() {
      this.field_20985 = true;
      this.field_20986 = true;
   }

   public int method_20025() {
      return this.field_20966.field_38807.length;
   }

   public int method_20054() {
      return this.field_20982.size();
   }

   public int method_20031() {
      return this.field_20937;
   }

   public int method_20001() {
      return this.field_20920;
   }

   public int method_20027() {
      if (this.field_20970 == null) {
         return 0;
      } else {
         class_5360 var1 = this.field_20970.method_745();
         return var1 == null ? 0 : var1.method_24467();
      }
   }

   public int method_20058() {
      return this.field_20924.size();
   }

   public class_3511 method_20068(class_1331 var1) {
      return this.field_20966.method_34563(var1);
   }

   public class_174 method_20043() {
      return this.field_20970;
   }

   private void method_20055() {
      if (field_20953 > 0) {
         this.field_20982 = new ObjectArrayList(this.field_20982.size() + 16);
         this.field_20961 = new ArrayList<class_1261>(this.field_20961.size() + 16);
         this.field_21011 = new ArrayList<class_1261>(this.field_21011.size() + 16);
      } else {
         this.field_20982.clear();
         this.field_20961.clear();
         this.field_21011.clear();
      }
   }

   public void method_20000() {
      if (this.field_21009) {
         this.method_19998();
         this.field_21009 = false;
      }
   }

   public void method_20028() {
      if (this.field_20968 != null) {
         this.field_20968.method_30743();
      }
   }

   public void method_20047() {
      if (this.field_20968 != null) {
         this.field_20968.method_30731();
      }
   }

   public int method_20022() {
      return this.field_20959;
   }

   public int method_20049() {
      return ++this.field_20959;
   }

   public class_3017 method_20017() {
      return this.field_20973;
   }

   public List<class_1261> method_20037() {
      return this.field_20961;
   }

   public List<class_1261> method_20075() {
      return this.field_21011;
   }

   private void method_20090(Camera var1, class_2359 var2, boolean var3) {
      if (this.field_20956 == 0) {
         this.method_20015(var1, var2, var3);
         this.client.field_9614.method_13991().method_18692(201435902);
      }

      if (this.field_20956 > -1) {
         this.field_20956--;
      }
   }

   private void method_20015(Camera var1, class_2359 var2, boolean var3) {
      int var4 = this.client.field_9577.field_45536;
      boolean var5 = this.client.field_9577.field_45406;

      try {
         this.client.field_9577.field_45536 = 1000;
         this.client.field_9577.field_45406 = false;
         WorldRenderer var6 = class_3111.method_14387();
         int var7 = var6.method_20027();
         long var8 = System.currentTimeMillis();
         class_3111.method_14277("Loading visible chunks");
         long var10 = System.currentTimeMillis() + 5000L;
         int var12 = 0;
         boolean var13 = false;

         do {
            var13 = false;

            for (int var14 = 0; var14 < 100; var14++) {
               var6.method_20018();
               var6.method_20016(var1, var2, false, this.field_20959++, var3);
               if (!var6.method_20019()) {
                  var13 = true;
               }

               var12 += var6.method_20058();

               while (!var6.method_20019()) {
                  var6.method_20024(System.nanoTime() + 1000000000L);
               }

               var12 -= var6.method_20058();
               if (!var13) {
                  break;
               }
            }

            if (var6.method_20027() != var7) {
               var13 = true;
               var7 = var6.method_20027();
            }

            if (System.currentTimeMillis() > var10) {
               class_3111.method_14280("Chunks loaded: " + var12);
               var10 = System.currentTimeMillis() + 5000L;
            }
         } while (var13);

         class_3111.method_14280("Chunks loaded: " + var12);
         class_3111.method_14280("Finished loading visible chunks");
         class_6705.field_34625 = 0;
      } finally {
         this.client.field_9577.field_45536 = var4;
         this.client.field_9577.field_45406 = var5;
      }
   }

   public class_2645 method_20008() {
      return class_2310.field_11561;
   }

   public void method_20007(Collection<class_3757> var1, Collection<class_3757> var2) {
      synchronized (this.field_20972) {
         this.field_20972.removeAll(var1);
         this.field_20972.addAll(var2);
      }
   }

   public static int method_20002(class_5561 var0, class_1331 var1) {
      return method_20052(var0, var0.method_28262(var1), var1);
   }

   public static int method_20052(class_5561 var0, class_2522 var1, class_1331 var2) {
      if (var1.method_8342(var0, var2)) {
         return 15728880;
      } else {
         int var3 = var0.method_25266(class_2957.field_14437, var2);
         int var4 = var0.method_25266(class_2957.field_14440, var2);
         int var5 = var1.method_11478(var0, var2);
         if (var4 < var5) {
            var4 = var5;
         }

         int var6 = var3 << 20 | var4 << 4;
         if (class_3111.method_14326() && var0 instanceof class_6163 && (!field_21005 || !var1.method_8321(var0, var2))) {
            var6 = class_8421.method_38765(var2, var6);
         }

         return var6;
      }
   }

   @Nullable
   public class_4230 method_20029() {
      return this.field_21000;
   }

   @Nullable
   public class_4230 method_20010() {
      return this.field_21001;
   }

   @Nullable
   public class_4230 method_20076() {
      return this.field_20929;
   }

   @Nullable
   public class_4230 method_20096() {
      return this.field_20996;
   }

   @Nullable
   public class_4230 method_20095() {
      return this.field_20958;
   }

   @Nullable
   public class_4230 method_20091() {
      return this.field_21006;
   }
}