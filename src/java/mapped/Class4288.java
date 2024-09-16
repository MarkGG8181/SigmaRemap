package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.ColorUtils;

public class Class4288 extends Class4278 {
   private final Class4339 field20780;
   public final Class4292 field20781;

   public Class4288(Class4292 var1, Class4292 var2, int var3) {
      super(var2, "verticalScrollBarButton", 0, 0, var3, 10, true);
      this.field20781 = var1;
      this.field20886 = true;
      this.field20780 = (Class4339)var2.getIconPanel();
      this.method13300(false);
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      float var5 = (float)this.field20780.method13517().getHeight();
      float var6 = (float)this.iconPanel.getIconPanel().getHeight();
      float var7 = (float)this.iconPanel.getHeight();
      float var8 = var6 / var5;
      float var9 = var7 * var8;
      float var10 = 20.0F;
      if (!(var9 < 20.0F)) {
         if (var9 > var7) {
            var9 = var7;
         }
      } else {
         var9 = 20.0F;
      }

      this.setHeight((int)var9);
      if (!this.field20877 && this.getHeight() != this.iconPanel.getHeight()) {
         if (this.field20781.field20793 >= 0) {
            if (this.field20781.field20793 + this.iconPanel.getIconPanel().getHeight() > this.field20780.method13517().getHeight()) {
               this.field20781.field20793 = this.field20780.method13517().getHeight() - this.iconPanel.getIconPanel().getHeight();
            }
         } else {
            this.field20781.field20793 = 0;
         }

         float var16 = var5 - var6;
         float var13 = (float)this.field20781.field20793 / var16;
         float var14 = (float)(this.iconPanel.getHeight() - this.getHeight());
         float var15 = var14 * var13 + 0.5F;
         this.setY((int)var15);
      } else if (this.method13216()) {
         float var12 = (float)this.getY() / (float)this.iconPanel.getHeight();
         this.field20781.field20793 = (int)(var12 * (float)this.field20780.method13517().getHeight());
         if (this.field20781.field20793 >= 0) {
            if (this.field20781.field20793 + this.iconPanel.getIconPanel().getHeight() > this.field20780.method13517().getHeight()) {
               this.field20781.field20793 = this.field20780.method13517().getHeight() - this.iconPanel.getIconPanel().getHeight();
            }
         } else {
            this.field20781.field20793 = 0;
         }

         this.field20781.field20797.method27120();
         this.field20781.field20797.start();
      }
   }

   @Override
   public void draw(float var1) {
      byte var4 = 5;
      var1 *= !this.field20877 ? (!this.field20908 ? 0.3F : 0.7F) : 0.75F;
      int var5 = this.x;
      int var6 = this.width;
      if (Client.getInstance().getClientMode() != ClientMode.JELLO) {
         var4 = 0;
         var6 -= 7;
         var5 += 7;
         RenderUtil.drawRect(
            (float)var5,
            (float)(this.y + var4),
            (float)(var5 + var6),
            (float)(this.y + this.getHeight() - var4),
            ColorUtils.applyAlpha(ClientColors.MID_GREY.getColor, 1.0F * var1)
         );
      } else {
         RenderUtil.method11454((float)var5, (float)this.y, (float)var6, (float)var4, ResourcesDecrypter.verticalScrollBarTopPNG, var1);
         RenderUtil.method11454((float)var5, (float)(this.y + this.height - var4), (float)var6, (float)var4, ResourcesDecrypter.verticalScrollBarBottomPNG, var1);
         RenderUtil.drawRect(
            (float)var5,
            (float)(this.y + var4),
            (float)(var5 + var6),
            (float)(this.y + this.getHeight() - var4),
            ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.45F * var1)
         );
      }

      super.draw(var1);
   }
}
