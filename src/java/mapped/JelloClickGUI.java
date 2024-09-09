package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.gui.jello.BrainFreeze;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.unmapped.Screen;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.Util;
import totalcross.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JelloClickGUI extends Screen {
   public ClickGUIBlurOverlay field20940;
   private static Minecraft field20941 = Minecraft.getInstance();
   private static Animation field20942;
   private static boolean field20943;
   private static boolean field20944;
   private Map<ModuleCategory, JelloClickGUIPanels> categoryPanel = new HashMap<ModuleCategory, JelloClickGUIPanels>();
   public MusicPlayer field20946;
   public Class4280 field20947;
   public ConfigButtonOnClickGui field20948;
   public ModuleSettingUI field20949;
   public AlertPanel field20950;
   private static boolean field20951 = true;
   public JelloClickGUIPanels field20952 = null;

   public JelloClickGUI() {
      super("JelloScreen");
      field20944 = field20944 | !field20943;
      int var3 = 30;
      int var4 = 30;
      this.addToList(this.field20947 = new Class4280(this, "brainFreeze"));
      JelloClickGUI var5 = this;

      for (Module module : Client.getInstance().getModuleManager().getModuleMap().values()) {
         if (!this.categoryPanel.containsKey(module.getAdjustedCategoryBasedOnClientMode())) {
            JelloClickGUIPanels var8 = new JelloClickGUIPanels(this, module.getAdjustedCategoryBasedOnClientMode().getName(), var3, var4, module.getAdjustedCategoryBasedOnClientMode());
            this.categoryPanel.put(module.getAdjustedCategoryBasedOnClientMode(), var8);
            this.addToList(var8);
            var3 += var8.method13267() + 10;
            if (this.categoryPanel.size() == 4) {
               var3 = 30;
               var4 += var8.method13269() - 20;
            }

            var8.method13507(var2 -> var5.method13222(() -> {
                  var5.addToList(this.field20949 = new ModuleSettingUI(var5, "settings", 0, 0, this.field20897, this.field20898, var2));
                  this.field20949.method13292(true);
               }));
         }
      }

      this.addToList(this.field20946 = new MusicPlayer(this, "musicPlayer"));
      this.field20946.method13215(true);
      Class4235 var9;
      this.addToList(var9 = new Class4235(this, "more", this.method13267() - 69, this.method13269() - 55, 55, 41, ResourcesDecrypter.optionsPNG1));
      var9.method13307().method19406(ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.3F));
      var9.method13300(false);
      this.field20946.method13288(field20951);
      var9.doThis((var1, var2) -> this.method13222(() -> {
            if (this.field20948 != null && this.method13239(this.field20948)) {
               this.method13234(this.field20948);
            } else {
               this.addToList(this.field20948 = new ConfigButtonOnClickGui(this, "morepopover", this.method13267() - 14, this.method13269() - 14));
               this.field20948.method13292(true);
            }
         }));
      field20942 = new Animation(450, 125);
      this.field20940 = new ClickGUIBlurOverlay(this, this, "overlay");
      ColorUtils.method17739();
      ColorUtils.method17740(field20942.calcPercent());
   }

   public boolean method13314() {
      if (Client.getInstance().getMusicManager().method24334() && Client.getInstance().getMusicManager().method24335()) {
         return false;
      } else if (this.field20950 == null) {
         this.method13222(() -> {
            List<MiniAlert> var3 = new ArrayList();
            var3.add(new MiniAlert(AlertType.HEADER, "Music", 40));
            var3.add(new MiniAlert(AlertType.FIRSTLINE, "Jello Music requires:", 20));
            if (!Client.getInstance().getMusicManager().method24334()) {
               var3.add(new MiniAlert(AlertType.FIRSTLINE, "- Python 2.7.17", 30));
            }

            if (!Client.getInstance().getMusicManager().method24335()) {
               var3.add(new MiniAlert(AlertType.FIRSTLINE, "- Visual C++ 2010 x86", 30));
            }

            var3.add(new MiniAlert(AlertType.BUTTON, "Download", 55));
            this.method13233(this.field20950 = new AlertPanel(this, "music", true, "Dependencies.", var3.toArray(new MiniAlert[0])));
            this.field20950.method13036(var0 -> {
               if (!Client.getInstance().getMusicManager().method24334()) {
                  Util.getOSType().method8181("https://www.python.org/ftp/python/2.7.17/python-2.7.17-macosx10.9.pkg");
               }

               if (!Client.getInstance().getMusicManager().method24335()) {
                  Util.getOSType().method8181("https://www.microsoft.com/en-US/download/details.aspx?id=5555");
               }
            });
            this.field20950.method13604(var1 -> new Thread(() -> {
                this.method13222(() -> {
                   this.method13236(this.field20950);
                   this.field20950 = null;
                });
            }).start());
            this.field20950.method13603(true);
         });
         return true;
      } else {
         return true;
      }
   }

   public void method13315() {
      for (JelloClickGUIPanels var4 : this.categoryPanel.values()) {
         var4.method13504();
      }
   }

   @Override
   public void method13028(int var1, int var2) {
      this.field20946.method13288(this.field20946.method13267() < this.method13267() && this.field20946.method13269() < this.method13269());
      super.method13028(var1, var2);
      ColorUtils.method17740(Math.min(1.0F, field20942.calcPercent() * 4.0F));
      this.field20947.method13288(Client.getInstance().getModuleManager().getModuleByClass(BrainFreeze.class).isEnabled());
      if (this.field20948 != null) {
         int var5 = var1 - this.field20948.method13271();
         int var6 = var2 - this.field20948.method13272();
         boolean var7 = var5 >= -10 && var6 >= -10;
         if (!var7) {
            this.field20948.method13613();
         }
      }

      if (this.field20948 != null && this.field20948.method13614()) {
         this.method13236(this.field20948);
         this.field20948 = null;
      }

      if (field20942.getDirection() == Direction.BACKWARDS && this.field20949 != null && !this.field20949.field20671) {
         this.field20949.field20671 = true;
      }

      if (this.field20949 != null && this.field20949.field20671 && this.field20949.field20661.calcPercent() == 0.0F) {
         this.method13222(() -> {
            this.method13236(this.field20949);
            this.field20949 = null;
         });
      }

      if (field20944) {
         float var8 = (float)(0.03F * (60.0 / (double)this.method13313()));
         Direction var9 = field20942.getDirection();
         field20942.changeDirection(!field20943 ? Direction.FORWARDS : Direction.BACKWARDS);
         if (field20942.calcPercent() <= 0.0F && field20943) {
            field20943 = false;
            this.method13316(field20943);
         } else if (field20942.calcPercent() >= 1.0F && field20942.getDirection() == var9) {
            field20943 = true;
            this.method13316(field20943);
         }
      }

      if (field20944 && field20943) {
         ColorUtils.method17742();
      }
   }

   @Override
   public int method13313() {
      return Minecraft.getFps();
   }

   @Override
   public JSONObject method13160(JSONObject var1) {
      ColorUtils.method17742();
      this.method13234(this.field20940);
      return super.method13160(var1);
   }

   @Override
   public void method13161(JSONObject var1) {
      super.method13161(var1);
   }

   private void method13316(boolean var1) {
      field20944 = false;
      if (!var1) {
         field20941.displayGuiScreen(null);
      }
   }

   @Override
   public boolean method13078(int var1, int var2, int var3) {
      if (var3 <= 1) {
         return super.method13078(var1, var2, var3);
      } else {
         this.keyPressed(var3);
         return false;
      }
   }

   @Override
   public void keyPressed(int var1) {
      super.keyPressed(var1);
      int var4 = Client.getInstance().getModuleManager().method14668().method13728(ClickGui.class);
      if (var1 == 256 || var1 == var4 && this.field20949 == null && !this.method13227()) {
         if (field20944) {
            field20943 = !field20943;
         }

         field20944 = true;
      }
   }

   public float method13317(float var1, float var2) {
      return field20942.getDirection() != Direction.BACKWARDS
         ? (float)(Math.pow(2.0, (double)(-10.0F * var1)) * Math.sin((double)(var1 - var2 / 4.0F) * (Math.PI * 2) / (double)var2) + 1.0)
         : Class9782.method38557(var1, 0.0F, 1.0F, 1.0F);
   }

   @Override
   public void draw(float var1) {
      float var4 = field20944 && !field20943
         ? this.method13317(field20942.calcPercent(), 0.8F) * 0.5F + 0.5F
         : (!field20944 ? 1.0F : this.method13317(field20942.calcPercent(), 1.0F));
      float var5 = 0.2F * var1 * var4;
      RenderUtil.method11426(
         (float)this.field20895,
         (float)this.field20896,
         (float)(this.field20895 + this.field20897),
         (float)(this.field20896 + this.field20898),
         ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, var5)
      );
      Object var6 = null;
      float var7 = 1.0F;
      if (this.field20949 != null) {
         float var8 = Class9747.method38214(this.field20949.field20662.calcPercent(), 0.0F, 1.0F, 1.0F);
         if (this.field20949.field20662.getDirection() == Direction.BACKWARDS) {
            var8 = Class8056.method27663(this.field20949.field20662.calcPercent(), 0.0F, 1.0F, 1.0F);
         }

         var7 -= this.field20949.field20662.calcPercent() * 0.1F;
         var4 *= 1.0F + var8 * 0.2F;
      }

      if (Client.getInstance().getModuleManager().method14667().method20770() != null) {
         String var12 = Client.getInstance().getModuleManager().method14667().method20770().field31263;
         RenderUtil.drawString(
            ResourceRegistry.JelloLightFont20,
            (float)(this.field20897 - ResourceRegistry.JelloLightFont20.method23942(var12) - 80),
            (float)(this.field20898 - 47),
            var12,
            ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.5F * Math.max(0.0F, Math.min(1.0F, var4)))
         );
      }

      for (IconPanel var9 : this.method13241()) {
         float var10 = (float)(var9.method13265() + var9.method13269() / 2 - field20941.mainWindow.getHeight() / 2) * (1.0F - var4) * 0.5F;
         float var11 = (float)(var9.method13263() + var9.method13267() / 2 - field20941.mainWindow.getWidth() / 2) * (1.0F - var4) * 0.5F;
         var9.method13286((int)var11, (int)var10);
         var9.method13279(1.5F - var4 * 0.5F, 1.5F - var4 * 0.5F);
      }

      super.draw(var1 * Math.min(1.0F, var4) * var7);
      if (this.field20952 != null) {
         this.field20952.method13292(false);
      }

      this.field20940.method13292(false);
      this.method13234(this.field20940);
   }
}