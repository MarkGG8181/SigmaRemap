package remapped;

import com.mojang.datafixers.util.Pair;
import java.io.IOException;

public class MurdererModule extends Module {
   public String field_9548 = "IBreakerman";
   private class_8343 field_9549;
   private boolean field_9546 = true;
   private boolean field_9550;

   public MurdererModule() {
      super(Category.MISC, "Murderer", "Detects murderer in murder mystery minigame on hypixel");
      this.addSetting(new BooleanSetting("GUI", "Shows a GUI with info on the murderer", true));
      this.addSetting(new BooleanSetting("Chat Message", "Sends a message with the murderer's name", true));
   }

   @EventListen
   private void method_8421(PacketEvent var1) throws IOException {
      if (this.method_42015()) {
         if (var1.method_557() instanceof class_9014) {
            class_9014 var4 = (class_9014)var1.method_557();

            for (Pair var6 : var4.method_41363()) {
               if (var6.getSecond() != null
                  && ((ItemStack)var6.getSecond()).method_27960() instanceof class_2235
                  && client.theWorld.method_29534(var4.method_41364()) instanceof PlayerEntity) {
                  Entity var7 = client.theWorld.method_29534(var4.method_41364());
                  if (!this.field_9548.toString().equalsIgnoreCase(var7.method_45509().getString())) {
                     if (this.method_42007("Chat Message")) {
                        client.thePlayer.method_27307("Murderer is " + var7.method_45509() + ", detected by Jello client");
                     }

                     this.field_9548 = var7.method_45509().getUnformattedComponentText();
                     this.field_9546 = true;
                     this.field_9550 = true;
                  }

                  this.field_9548 = var7.method_45509().getUnformattedComponentText();
               }
            }
         }

         if (var1.method_557() instanceof class_7786) {
            this.field_9550 = false;
         }
      }
   }

   @EventListen
   private void method_8422(class_3278 var1) throws IOException {
      if (this.method_42015()) {
         if (this.field_9550) {
            if (this.method_42007("GUI")) {
               FontRenderer var4 = class_5320.field_27152;
               byte var5 = -1;
               int var6 = MinecraftClient.getInstance().window.method_43166();
               int var7 = MinecraftClient.getInstance().window.method_43163();
               if (this.field_9546 && this.field_9549 != null) {
                  this.field_9546 = false;
               }

               if (this.field_9549 != null) {
                  FontManager.method_94(
                     (float)(var6 - var4.method_18547(this.field_9548) - 90), (float)(var7 - 130), (float)(var6 - 10), (float)(var7 - 10), 1342177280
                  );
                  FontManager.method_96((float)(var6 - var4.method_18547(this.field_9548) - 80), (float)(var7 - 120), 50.0F, 100.0F, this.field_9549);
                  FontManager.method_87(
                     var4,
                     (float)(var6 - var4.method_18547(this.field_9548) - 20),
                     (float)(var7 - var4.method_18548(this.field_9548) - 60),
                     this.field_9548,
                     -1
                  );
               }
            }
         }
      }
   }
}
