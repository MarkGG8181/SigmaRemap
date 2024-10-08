package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;

import java.util.List;

public class Class1250 extends Class1249 {
   private static String[] field6614;
   private final Class1896 field6621;
   private float field6622;

   public Class1250(Class1896 var1) {
      super(0, 0, 35, 27, false);
      this.field6621 = var1;
      this.method5821(153, 2, 35, 0, Class1254.field6630);
   }

   public void method5825(Minecraft var1) {
      Class6943 var4 = var1.player.method5397();
      List<RecipeList> var5 = var4.method21387(this.field6621);
      if (var1.player.openContainer instanceof Class5828) {
         for (RecipeList var7 : var5) {
            for (IRecipe var9 : var7.method34893(var4.method21370((Class5828<?>)var1.player.openContainer))) {
               if (var4.method21364(var9)) {
                  this.field6622 = 15.0F;
                  return;
               }
            }
         }
      }
   }

   @Override
   public void method5655(MatrixStack var1, int var2, int var3, float var4) {
      if (this.field6622 > 0.0F) {
         float var7 = 1.0F + 0.1F * (float)Math.sin((double)(this.field6622 / 15.0F * (float) Math.PI));
         RenderSystem.pushMatrix();
         RenderSystem.translatef((float)(this.field6477 + 8), (float)(this.field6478 + 12), 0.0F);
         RenderSystem.scalef(1.0F, var7, 1.0F);
         RenderSystem.translatef((float)(-(this.field6477 + 8)), (float)(-(this.field6478 + 12)), 0.0F);
      }

      Minecraft var11 = Minecraft.getInstance();
      var11.getTextureManager().bindTexture(this.field6615);
      RenderSystem.disableDepthTest();
      int var8 = this.field6617;
      int var9 = this.field6618;
      if (this.field6616) {
         var8 += this.field6619;
      }

      if (this.method5737()) {
         var9 += this.field6620;
      }

      int var10 = this.field6477;
      if (this.field6616) {
         var10 -= 2;
      }

      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.blit(var1, var10, this.field6478, var8, var9, this.field6475, this.field6476);
      RenderSystem.enableDepthTest();
      this.method5826(var11.getItemRenderer());
      if (this.field6622 > 0.0F) {
         RenderSystem.popMatrix();
         this.field6622 -= var4;
      }
   }

   private void method5826(ItemRenderer var1) {
      List var4 = this.field6621.method8164();
      int var5 = !this.field6616 ? 0 : -2;
      if (var4.size() != 1) {
         if (var4.size() == 2) {
            var1.method794((ItemStack)var4.get(0), this.field6477 + 3 + var5, this.field6478 + 5);
            var1.method794((ItemStack)var4.get(1), this.field6477 + 14 + var5, this.field6478 + 5);
         }
      } else {
         var1.method794((ItemStack)var4.get(0), this.field6477 + 9 + var5, this.field6478 + 5);
      }
   }

   public Class1896 method5827() {
      return this.field6621;
   }

   public boolean method5828(Class6943 var1) {
      List<RecipeList> var4 = var1.method21387(this.field6621);
      this.field6483 = false;
      if (var4 != null) {
         for (RecipeList var6 : var4) {
            if (var6.method34886() && var6.method34891()) {
               this.field6483 = true;
               break;
            }
         }
      }

      return this.field6483;
   }
}
