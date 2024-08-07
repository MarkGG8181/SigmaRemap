package remapped;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.lwjgl.opengl.GL11;

public class SearchModule extends Module {
   public List<class_2953> field_47903 = new ArrayList<class_2953>();
   public Set<class_2034> field_47901 = new HashSet<class_2034>();

   public SearchModule() {
      super(Category.RENDER, "Search", "Searches blocks through the world");
      FloatSetting var3;
      this.addSetting(var3 = new FloatSetting<Float>("Chunk Range", "Range at which search scans blocks", 5.0F, Float.class, 1.0F, 12.0F, 1.0F));
      BooleanSetting var4;
      this.addSetting(var4 = new BooleanSetting("Holes", "Shows 1x1 explosion protection holes", false));
      this.addSetting(new ColorSetting("Color", "The rendered block color", class_1255.field_6920.field_6917, true));
      MultiSetting var5;
      this.addSetting(var5 = new MultiSetting("Blocks", "Blocks to render", true));
      var5.setModeClass(var1 -> this.field_47903.clear());
      var3.setModeClass(var1 -> this.field_47903.clear());
      var4.setModeClass(var1 -> this.field_47903.clear());
   }

   @EventListen
   public void method_43312(PacketEvent var1) {
      if (this.method_42015()) {
         if (var1.method_557() instanceof class_4267) {
            class_4267 var4 = (class_4267)var1.method_557();
            this.method_43310(client.theWorld.method_29542(var4.method_19867()).method_27352());
         }

         if (var1.method_557() instanceof class_4467) {
            class_4467 var5 = (class_4467)var1.method_557();
            this.method_43310(new class_2034(var5.field_21788.field_13231, var5.field_21788.field_13229));
         }

         if (var1.method_557() instanceof class_4808 && MinecraftClient.getInstance().theWorld != null) {
            class_4808 var6 = (class_4808)var1.method_557();
            this.method_43310(new class_2034(var6.method_22149(), var6.method_22151()));
         }
      }
   }

   public void method_43310(class_2034 var1) {
      for (class_2953 var5 : this.field_47903) {
         if (var5.method_13515(var1)) {
            this.field_47901.add(var5.method_13513());
         }
      }
   }

   @EventListen
   public void method_43311(class_717 var1) {
      this.field_47903.clear();
      this.field_47901.clear();
   }

   public List<BlockPos> method_43317(class_2034 var1) {
      ArrayList var4 = new ArrayList();
      int var5 = var1.field_10328 * 16;
      int var6 = var1.field_10327 * 16;
      byte var7 = 1;
      int var8 = var5 + 15;
      int var9 = var6 + 15;
      short var10 = 255;

      for (float var11 = (float)var7; var11 <= (float)var10 && !(var11 > 100.0F); var11++) {
         for (float var12 = (float)var5; var12 <= (float)var8; var12++) {
            for (float var13 = (float)var6; var13 <= (float)var9; var13++) {
               BlockPos var14 = new BlockPos((double)var12, (double)var11, (double)var13);
               var4.add(var14);
            }
         }
      }

      return var4;
   }

   public List<BlockPos> method_43315(class_2034 var1) {
      ArrayList var4 = new ArrayList();
      if (var1 == null) {
         return null;
      } else {
         List var5 = (List)this.getSettingValueByName("Blocks");

         for (BlockPos var7 : this.method_43317(var1)) {
            String var8 = class_8669.field_44462.method_39797(client.theWorld.method_28262(var7).method_8360()).toString();
            if (var5.contains(var8)) {
               var4.add(var7);
            }
         }

         if (this.getBooleanValueByName("Holes")) {
            label57:
            for (BlockPos var13 : this.method_43317(var1)) {
               if (client.theWorld.method_28262(var13).method_8360() == class_4783.field_23184) {
                  for (Direction var11 : Direction.values()) {
                     if (var11 != Direction.field_817
                        && client.theWorld.method_28262(var13.method_6105(var11.method_1037())).method_8360() != class_4783.field_23881
                        && client.theWorld.method_28262(var13.method_6105(var11.method_1037())).method_8360() != class_4783.field_23433) {
                        continue label57;
                     }
                  }

                  var4.add(var13.method_6100());
               }
            }
         }

         return var4;
      }
   }

   @EventListen
   public void method_43316(class_5596 var1) {
      if (this.method_42015()) {
         if (client.thePlayer.field_41697 < 20) {
            this.field_47903.clear();
         } else {
            int var4 = (int)this.getFloatValueByName("Chunk Range");
            ArrayList var5 = new ArrayList();

            for (int var6 = -5; var6 < 5; var6++) {
               for (int var7 = -5; var7 < 5; var7++) {
                  var5.add(new class_2034(client.thePlayer.field_41742 + var6, client.thePlayer.field_41714 + var7));
               }
            }

            Iterator var11 = this.field_47903.iterator();

            while (var11.hasNext()) {
               class_2953 var12 = (class_2953)var11.next();
               if (var12.method_13514(new class_2034(client.thePlayer.field_41742, client.thePlayer.field_41714)) > 7
                  || this.field_47901.contains(var12.method_13513())) {
                  var11.remove();
               }
            }

            this.field_47901.clear();

            label52:
            for (class_2034 var8 : var5) {
               for (class_2953 var10 : this.field_47903) {
                  if (var10.method_13515(var8)) {
                     continue label52;
                  }
               }

               this.field_47903.add(new class_2953(var8.field_10328, var8.field_10327, this.method_43315(var8)));
               break;
            }
         }
      }
   }

   @Override
   public void onEnable() {
      this.field_47903.clear();
      this.field_47901.clear();
   }

   @EventListen
   public void method_43314(class_3368 var1) {
      if (this.method_42015()) {
         this.method_43313();
      }
   }

   public void method_43313() {
      int var3 = class_314.method_1444(this.getIntValueByName("Color"), 0.14F);
      GL11.glPushMatrix();
      GL11.glDisable(2929);

      for (class_2953 var5 : this.field_47903) {
         for (BlockPos var7 : var5.field_14428) {
            double var8 = (double)var7.getX() - client.gameRenderer.method_35949().method_41627().method_61();
            double var10 = (double)var7.getY() - client.gameRenderer.method_35949().method_41627().method_60();
            double var12 = (double)var7.getZ() - client.gameRenderer.method_35949().method_41627().method_62();
            class_8194 var14 = new class_8194(var8, var10, var12, var8 + 1.0, var10 + 1.0, var12 + 1.0);
            FontManager.method_83(var14, var3);
         }
      }

      GL11.glEnable(2929);
      GL11.glPopMatrix();
   }
}
