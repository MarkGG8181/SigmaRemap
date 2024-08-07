package remapped;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.Map.Entry;
import org.lwjgl.opengl.GL11;

public class NameTagsModule extends Module {
   private HashMap<BlockPos, class_1325> field_6693 = new HashMap<BlockPos, class_1325>();
   private BlockPos field_6694;
   private static class_5023 field_6699 = new class_5023();
   private static HashMap<String, class_8343> field_6698 = new HashMap<String, class_8343>();
   public static NameTagsModule field_6701;
   private List<Entity> field_6696 = new ArrayList<Entity>();
   private boolean field_6697 = false;
   private HashMap<UUID, String> field_6695 = new HashMap<UUID, String>();
   public int field_6702 = class_314.method_1444(class_314.method_1442(class_1255.field_6918.field_6917, class_1255.field_6929.field_6917, 75.0F), 0.5F);

   public NameTagsModule() {
      super(Category.RENDER, "NameTags", "Render better name tags");
      this.addSetting(new BooleanSetting("Magnify", "Scales nametags to keep them readable", true));
      this.addSetting(new BooleanSetting("Furnaces", "Shows furnaces info once open", true));
      this.addSetting(new BooleanSetting("Mob Owners", "Shows mob owners", true));
      this.method_42011(false);
      field_6701 = this;
   }

   @EventListen
   private void method_5292(class_5596 var1) {
      if (this.method_42015()) {
         this.field_6697 = this.method_42007("Furnaces");
         if (!this.field_6697) {
            this.field_6693.clear();
         } else {
            Iterator var4 = this.field_6693.entrySet().iterator();

            while (var4.hasNext()) {
               Entry var5 = (Entry)var4.next();
               if (!(client.theWorld.method_28262((BlockPos)var5.getKey()).method_8360() instanceof class_3744)) {
                  var4.remove();
               }

               ((class_1325)var5.getValue()).method_6054();
            }
         }

         this.field_6696.clear();

         for (Entity var7 : class_7494.method_34088(class_314.method_1435())) {
            if (var7 != client.thePlayer
               && var7 != FreeCamModule.field_48917
               && var7 != BlinkModule.field_27898
               && !var7.method_37109()
               && !SigmaMainClass.getInstance().method_3331().method_20495(var7)) {
               this.field_6696.add(var7);
            }
         }
      }
   }

   @EventListen
   private void method_5299(class_2157 var1) {
      if (this.method_42015()) {
         if (var1.method_10047() instanceof class_8585) {
            class_8585 var4 = (class_8585)var1.method_10047();
            if (client.theWorld.method_28262(var4.method_39484().method_43955()).method_8360() instanceof class_3744) {
               this.field_6694 = var4.method_39484().method_43955();
            }
         }

         if (var1.method_10047() instanceof class_5955) {
            class_5955 var7 = (class_5955)var1.method_10047();
            class_1325 var5 = this.method_5302(var7.method_27202());
            if (var5 == null) {
               return;
            }

            if (client.screen instanceof class_309) {
               class_309 var6 = (class_309) client.screen;
               var5.field_7295 = var6.method_20393().method_18878(0).method_35898();
               var5.field_7288 = new ItemStack(var6.method_20393().method_18878(1).method_35898().method_27960());
               var5.field_7288.field_31206 = var6.method_20393().method_18878(1).method_35898().field_31206;
               var5.field_7291 = var6.method_20393().method_18878(2).method_35898();
            }
         }
      }
   }

   @EventListen
   private void method_5298(PacketEvent var1) {
      if (this.method_42015()) {
         if (var1.method_557() instanceof class_5149) {
            class_5149 var4 = (class_5149)var1.method_557();
            if (var4.method_23575() != class_4165.field_20254) {
               return;
            }

            this.field_6693.put(this.field_6694, new class_1325(var4.method_23577()));
         }

         if (var1.method_557() instanceof class_5491) {
            class_5491 var6 = (class_5491)var1.method_557();
            class_1325 var5 = this.method_5302(var6.method_24952());
            if (var5 == null) {
               return;
            }

            if (var6.method_24956() == 0) {
               var5.field_7295 = new ItemStack(var6.method_24953().method_27960());
               var5.field_7295.field_31206 = var6.method_24953().field_31206;
            } else if (var6.method_24956() == 1) {
               var5.field_7288 = new ItemStack(var6.method_24953().method_27960());
               var5.field_7288.field_31206 = var6.method_24953().field_31206;
            } else if (var6.method_24956() == 2) {
               var5.field_7291 = new ItemStack(var6.method_24953().method_27960());
               var5.field_7291.field_31206 = var6.method_24953().field_31206;
            }
         }

         if (var1.method_557() instanceof class_5403) {
            class_5403 var7 = (class_5403)var1.method_557();
            class_1325 var8 = this.method_5302(var7.method_24598());
            if (var8 == null) {
               return;
            }

            switch (var7.method_24595()) {
               case 0:
                  var8.field_7294 = var7.method_24594();
                  break;
               case 1:
                  var8.field_7287 = var7.method_24594();
                  break;
               case 2:
                  var8.field_7292 = (float)var7.method_24594();
                  break;
               case 3:
                  var8.field_7290 = (float)var7.method_24594();
            }
         }
      }
   }

   private class_1325 method_5302(int var1) {
      for (Entry var5 : this.field_6693.entrySet()) {
         if (((class_1325)var5.getValue()).field_7289 == var1) {
            return (class_1325)var5.getValue();
         }
      }

      return null;
   }

   @EventListen
   public void method_5293(class_3368 var1) {
      if (this.method_42015()) {
         RenderSystem.method_16420(33986, 240.0F, 240.0F);
         boolean var4 = this.method_42007("Magnify");

         for (Entity var6 : this.field_6696) {
            float var7 = 1.0F;
            if (var4) {
               var7 = (float)Math.max(1.0, Math.sqrt(class_9189.method_42352(var6) / 30.0));
            }

            this.method_5289(
               class_9189.method_42357(var6).field_42648,
               class_9189.method_42357(var6).field_42646 + (double)var6.method_37074(),
               class_9189.method_42357(var6).field_42649,
               var6,
               var7,
               null
            );
            var6.method_37372().method_36633(Entity.field_41699, false);
         }

         for (Entry var11 : this.field_6693.entrySet()) {
            float var13 = 1.0F;
            if (var4) {
               var13 = (float)Math.max(0.8F, Math.sqrt(class_9189.method_42355((BlockPos)var11.getKey()) / 30.0));
            }

            this.method_5290((BlockPos)var11.getKey(), (class_1325)var11.getValue(), var13);
         }

         if (this.method_42007("Mob Owners")) {
            for (Entity var12 : client.theWorld.method_736()) {
               if (var12 == client.thePlayer && (var12 instanceof class_8990 || var12 instanceof class_3551)) {
                  UUID var14 = !(var12 instanceof class_8990) ? ((class_3551)var12).method_19081() : ((class_8990)var12).method_41211();
                  if (var14 != null) {
                     if (!this.field_6695.containsKey(var14)) {
                        this.field_6695.put(var14, null);
                        new Thread(() -> {
                           try {
                              List var4x = class_314.method_1414(var14.toString());
                              if (var4x == null || var4x.isEmpty()) {
                                 return;
                              }

                              this.field_6695.put(var14, (String)var4x.get(var4x.size() - 1));
                           } catch (Exception var5) {
                              var5.printStackTrace();
                           }
                        }).start();
                     }

                     if (this.field_6695.get(var14) != null) {
                        float var8 = 1.0F;
                        if (this.method_42007("Magnify")) {
                           var8 = (float)Math.max(1.0, Math.sqrt(class_9189.method_42352(var12) / 30.0));
                        }

                        this.method_5289(
                           class_9189.method_42357(var12).field_42648,
                           class_9189.method_42357(var12).field_42646 + (double)var12.method_37074(),
                           class_9189.method_42357(var12).field_42649,
                           var12,
                           var8,
                           this.field_6695.get(var14)
                        );
                        var12.method_37372().method_36633(Entity.field_41699, false);
                     }
                  }
               }
            }
         }

         GL11.glDisable(2896);
         RenderSystem.method_16420(33986, 240.0F, 240.0F);
         class_9162.method_42212();
         TextureManager var10000 = client.getTextureManager();
         client.getTextureManager();
         var10000.bindTexture(TextureManager.field_40364);
      }
   }

   private void method_5297(float var1, float var2, float var3, float var4) {
      GL11.glColor4f(var1 / 255.0F, var2 / 255.0F, var3 / 255.0F, var4);
      GL11.glTranslatef(0.0F, 0.0F, 0.3F);
      GL11.glNormal3f(0.0F, 0.0F, 1.0F);
      GL11.glRotated(-37.0, 1.0, 0.0, 0.0);
      GL11.glBegin(6);
      GL11.glVertex2f(0.0F, 0.0F);
      GL11.glVertex2f(0.0F, 0.5F);
      GL11.glVertex2f(0.5F, 0.5F);
      GL11.glVertex2f(0.5F, 0.0F);
      GL11.glEnd();
   }

   public void method_5290(BlockPos var1, class_1325 var2, float var3) {
      FontRenderer var6 = class_5320.field_27141;
      String var7 = "None";
      if (var2.field_7295 != null) {
         var7 = var2.field_7295.field_31206 + " " + var2.field_7295.method_28008();
      }

      float var8 = (float)((double)var1.getX() - client.gameRenderer.method_35949().method_41627().method_61() + 0.5);
      float var9 = (float)((double)var1.getY() - client.gameRenderer.method_35949().method_41627().method_60() + 1.0);
      float var10 = (float)((double)var1.getZ() - client.gameRenderer.method_35949().method_41627().method_62() + 0.5);
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(3042);
      GL11.glEnable(2848);
      GL11.glDisable(3553);
      GL11.glDisable(2929);
      GL11.glDisable(2896);
      GL11.glDepthMask(false);
      float var11 = Math.min(var2.field_7292 / var2.field_7290, 1.0F);
      float var12 = Math.min((float)var2.field_7294 / (float)var2.field_7287, 1.0F);
      byte var13 = 14;
      GL11.glPushMatrix();
      GL11.glAlphaFunc(519, 0.0F);
      GL11.glTranslated((double)var8, (double)(var9 + 0.6F - 0.33333334F * (1.0F - var3)), (double)var10);
      GL11.glRotatef(client.gameRenderer.method_35949().method_41640(), 0.0F, -1.0F, 0.0F);
      GL11.glRotatef(client.gameRenderer.method_35949().method_41638(), 1.0F, 0.0F, 0.0F);
      GL11.glPushMatrix();
      float var14 = 0.008F;
      GL11.glScalef(-var14 * var3, -var14 * var3, -var14 * var3);
      int var15 = 0;
      ItemStack var16 = var2.method_6050();
      if (var16 != null) {
         var15 = Math.max(class_5320.field_27152.method_18547(var16.method_28008().getString()), 50);
      } else {
         var15 = 37;
      }

      int var17 = 51 + var15 + var13 * 2;
      int var18 = 85 + var13 * 2;
      GL11.glTranslated((double)(-var17 / 2), (double)(-var18 / 2), 0.0);
      byte var19 = 40;
      FontManager.method_94(0.0F, 0.0F, (float)var17, (float)var18, this.field_6702);
      FontManager.method_128(0.0F, 0.0F, (float)var17, (float)var18, 20.0F, 0.5F);
      FontManager.method_87(var6, (float)var13, (float)(var13 - 5), "Furnace", class_1255.field_6918.field_6917);
      if (var16 == null) {
         FontManager.method_87(
            class_5320.field_27152, (float)(var13 + 15), (float)(var13 + 40), "Empty", class_314.method_1444(class_1255.field_6918.field_6917, 0.6F)
         );
      }

      ItemStack var20 = var2.method_6050();
      if (var20 != null) {
         FontManager.method_126(var20, var13, var13 + 27, 45, 45);
         FontManager.method_87(class_5320.field_27152, (float)(var13 + 51), 40.0F, var20.method_28008().getString(), class_1255.field_6918.field_6917);
         FontManager.method_87(class_5320.field_27138, (float)(var13 + 51), 62.0F, "Count: " + var20.field_31206, class_1255.field_6918.field_6917);
      }

      FontManager.method_94(0.0F, (float)var18 - 12.0F, Math.min((float)var17 * var12, (float)var17), (float)var18 - 6.0F, class_314.method_1444(-106750, 0.3F));
      FontManager.method_94(
         0.0F, (float)var18 - 6.0F, Math.min((float)var17 * var11, (float)var17), (float)var18, class_314.method_1444(class_1255.field_6918.field_6917, 0.75F)
      );
      GL11.glPopMatrix();
      GL11.glPopMatrix();
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glEnable(2896);
      GL11.glDisable(2848);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
   }

   public void method_5289(double var1, double var3, double var5, Entity var7, float var8, String var9) {
      FontRenderer var12 = class_5320.field_27141;
      String var13 = var9 == null ? var7.method_45509().getString().replaceAll("§.", "") : var9;
      if (SigmaMainClass.getInstance().getModuleManager().getModuleByClass(NameProtectModule.class).method_42015() && var13.equals(client.method_8502().method_5366())) {
         var13 = SigmaMainClass.getInstance().getModuleManager().getModuleByClass(NameProtectModule.class).getStringValueByName("Username");
      }

      if (var13.length() != 0) {
         float var14 = (float)(var1 - client.gameRenderer.method_35949().method_41627().method_61());
         float var15 = (float)(var3 - client.gameRenderer.method_35949().method_41627().method_60());
         float var16 = (float)(var5 - client.gameRenderer.method_35949().method_41627().method_62());
         GL11.glBlendFunc(770, 771);
         GL11.glEnable(3042);
         GL11.glEnable(2848);
         GL11.glDisable(2929);
         GL11.glDisable(2896);
         GL11.glDepthMask(false);
         String var17 = (float)Math.round(((LivingEntity)var7).method_26551() * 10.0F) / 10.0F + "";
         float var18 = Math.min(((LivingEntity)var7).method_26551() / ((LivingEntity)var7).method_26465(), 1.0F);
         GL11.glPushMatrix();
         GL11.glAlphaFunc(519, 0.0F);
         GL11.glTranslated((double)var14, (double)(var15 + 0.6F - 0.33333334F * (1.0F - var8)), (double)var16);
         GL11.glRotatef(client.gameRenderer.method_35949().method_41640(), 0.0F, -1.0F, 0.0F);
         GL11.glRotatef(client.gameRenderer.method_35949().method_41638(), 1.0F, 0.0F, 0.0F);
         GL11.glScalef(-0.009F * var8, -0.009F * var8, -0.009F * var8);
         int var19 = this.field_6702;
         if (!SigmaMainClass.getInstance().method_3307().method_14460(var7)) {
            if (SigmaMainClass.getInstance().method_3307().method_14469(var7)) {
               var19 = class_314.method_1444(-6750208, 0.5F);
            }
         } else {
            var19 = class_314.method_1444(-16171506, 0.5F);
         }

         int var20 = class_314.method_1444(
            !(var7 instanceof PlayerEntity) ? class_1255.field_6918.field_6917 : new Color(class_5876.method_26762((PlayerEntity)var7)).getRGB(), 0.5F
         );
         int var21 = var12.method_18547(var13) / 2;
         if (!field_6698.containsKey(var13)) {
            FontManager.method_128((float)(-var21 - 10), -25.0F, (float)(var21 * 2 + 20), (float)(var12.method_15654() + 27), 20.0F, 0.5F);
         } else {
            int var22 = Color.getHSBColor((float)(System.currentTimeMillis() % 10000L) / 10000.0F, 0.5F, 1.0F).getRGB();
            FontManager.method_99(
               (float)(-var21 - 10 - 31),
               -25.0F,
               (float)(var12.method_15654() + 27),
               (float)(var12.method_15654() + 27),
               field_6698.get(var13),
               class_314.method_1444(var22, 0.7F)
            );
            FontManager.method_99(
               (float)(-var21 - 10 - 31 + var12.method_15654() + 27),
               -25.0F,
               14.0F,
               (float)(var12.method_15654() + 27),
               NotificationIcons.shadow_right,
               class_314.method_1444(class_1255.field_6918.field_6917, 0.6F)
            );
            FontManager.method_128((float)(-var21 - 10 - 31), -25.0F, (float)(var21 * 2 + 20 + 31 + 27), (float)(var12.method_15654() + 27), 20.0F, 0.5F);
            GL11.glTranslatef(27.0F, 0.0F, 0.0F);
         }

         FontManager.method_94((float)(-var21 - 10), -25.0F, (float)(var21 + 10), (float)(var12.method_15654() + 2), var19);
         FontManager.method_94(
            (float)(-var21 - 10),
            (float)(var12.method_15654() - 1) - (float)((LivingEntity)var7).field_29645 / 3.0F,
            Math.min((float)(var21 * 2 + 20) * (var18 - 0.5F), (float)(var21 + 10)),
            (float)(var12.method_15654() + 2),
            var20
         );
         GL11.glPushMatrix();
         GL11.glTranslated((double)(-var12.method_18547(var13) / 2), 0.0, 0.0);
         int var26 = class_5320.field_27138.method_18547("Health: 20.0");
         String var23 = "Health: ";
         int var24 = var12.method_18547(var13);
         if (var26 > var24) {
            var23 = "H: ";
         }

         FontManager.method_87(var12, 0.0F, -20.0F, var13, class_1255.field_6918.field_6917);
         FontManager.method_87(class_5320.field_27138, 0.0F, 10.0F, var23 + var17, class_1255.field_6918.field_6917);
         class_4567 var25 = SigmaMainClass.getInstance().getAccountManager().sigmaIRC.method_20845(var7);
         if (var25 != null) {
            FontManager.method_87(class_5320.field_27138, 0.0F, -30.0F, var25.field_22258, class_1255.field_6918.field_6917);
         }

         GL11.glPopMatrix();
         GL11.glPopMatrix();
         GL11.glEnable(2929);
         GL11.glEnable(2896);
         GL11.glDisable(2848);
         GL11.glDepthMask(true);
         GL11.glDisable(3042);
      }
   }

   @EventListen
   public void method_5294(class_2563 var1) {
      if (this.method_42015() && var1.method_11643() instanceof PlayerEntity) {
         var1.method_29715(true);
      }
   }

   static {
      field_6698.put("Tomygaims", NotificationIcons.tomymental);
      field_6698.put("Andro24", NotificationIcons.andro);
      field_6698.put("Gretorm", NotificationIcons.lp);
      field_6698.put("Flyinqq", NotificationIcons.cody);
      field_6698.put("cxbot", NotificationIcons.cx);
   }
}
