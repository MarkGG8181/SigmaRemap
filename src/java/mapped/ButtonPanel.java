package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.util.ColorUtils;

public class ButtonPanel extends Class4247 {
   private static String[] field20583;
   public float field20584;
   private int field20585 = 0;
   public int field20586 = 0;

   public ButtonPanel(IconPanel var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
   }

   public ButtonPanel(IconPanel var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7) {
      super(var1, var2, var3, var4, var5, var6, var7, false);
   }

   public ButtonPanel(IconPanel var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, String var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, false);
   }

   public ButtonPanel(IconPanel var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, String var8, ClientResource font) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, font, false);
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      this.field20584 = this.field20584 + (!this.method13298() ? -0.1F : 0.1F);
      this.field20584 = Math.min(Math.max(0.0F, this.field20584), 1.0F);
   }

   @Override
   public void draw(float var1) {
      float var4 = !this.isHovered() ? 0.3F : (!this.method13216() ? (!this.method13212() ? Math.max(var1 * this.field20584, 0.0F) : 1.5F) : 0.0F);
      int var5 = ColorUtils.applyAlpha(
         ColorUtils.method17690(this.field20914.method19405(), this.field20914.method19403(), 1.0F - var4),
         (float)(this.field20914.method19405() >> 24 & 0xFF) / 255.0F * var1
      );
      int var6 = var5 >> 24 & 0xFF;
      int var7 = var5 >> 16 & 0xFF;
      int var8 = var5 >> 8 & 0xFF;
      int var9 = var5 & 0xFF;
      if (this.field20586 <= 0) {
         RenderUtil.drawRect(
            (float)this.getX(),
            (float)this.getY(),
            (float)(this.getX() + this.getWidth()),
            (float)(this.getY() + this.getHeight()),
            var5
         );
      } else {
         RenderUtil.method11474(
            (float)this.getX(), (float)this.getY(), (float)this.getWidth(), (float)this.getHeight(), (float)this.field20586, var5
         );
      }

      int var10 = this.getX()
         + (
            this.field20914.method19411() != Class2218.field14492
               ? 0
               : (this.field20914.method19411() != Class2218.field14490 ? this.getWidth() / 2 : this.getWidth())
         );
      int var11 = this.getY()
         + (
            this.field20914.method19413() != Class2218.field14492
               ? 0
               : (this.field20914.method19413() != Class2218.field14491 ? this.getHeight() / 2 : this.getHeight())
         );
      if (this.method13303() != null) {
         RenderUtil.method11440(
            this.method13305(),
            (float)(this.field20585 + var10),
            (float)var11,
            this.method13303(),
            ColorUtils.applyAlpha(this.field20914.method19409(), var1),
            this.field20914.method19411(),
            this.field20914.method19413()
         );
      }

      super.draw(var1);
   }

   public void setX(int var1) {
      this.field20585 = var1;
   }

   public int method13035() {
      return this.field20585;
   }
}
