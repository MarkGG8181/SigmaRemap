package remapped;

import org.lwjgl.glfw.GLFW;

public class GameIdlerModule extends Module {
   public GameIdlerModule() {
      super(Category.MISC, "GameIdler", "Lowers your fps when the game is idle to increase performance");
   }

   @EventListen
   private void method_44358(class_3278 var1) {
      if (this.method_42015()) {
         boolean var4 = GLFW.glfwGetWindowAttrib(client.window.method_43181(), 131073) == 1;
         if (var4) {
            MinecraftClient.getInstance().window.method_43194(client.gameOptions.field_45439);
         } else {
            MinecraftClient.getInstance().window.method_43194(5);
         }
      }
   }

   @Override
   public void onDisable() {
      MinecraftClient.getInstance().window.method_43194(client.gameOptions.field_45439);
   }
}