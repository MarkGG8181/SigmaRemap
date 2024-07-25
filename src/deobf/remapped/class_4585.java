package remapped;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBufferByte;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Hashtable;
import javax.imageio.ImageIO;

public class class_4585 implements class_7411 {
   private static final ColorModel field_22294 = new ComponentColorModel(ColorSpace.getInstance(1000), new int[]{8, 8, 8, 8}, true, false, 3, 0);
   private static final ColorModel field_22301 = new ComponentColorModel(ColorSpace.getInstance(1000), new int[]{8, 8, 8, 0}, false, false, 1, 0);
   private int field_22295;
   private int field_22293;
   private int field_22297;
   private int field_22300;
   private int field_22298;
   private boolean field_22296 = true;

   @Override
   public int method_5154() {
      return this.field_22295;
   }

   @Override
   public int method_5153() {
      return this.field_22293;
   }

   @Override
   public int method_5151() {
      return this.field_22298;
   }

   @Override
   public int method_5150() {
      return this.field_22300;
   }

   @Override
   public int method_5155() {
      return this.field_22297;
   }

   @Override
   public ByteBuffer method_33768(InputStream var1) throws IOException {
      return this.method_33770(var1, true, null);
   }

   @Override
   public ByteBuffer method_33770(InputStream var1, boolean var2, int[] var3) throws IOException {
      return this.method_33769(var1, var2, false, var3);
   }

   @Override
   public ByteBuffer method_33769(InputStream var1, boolean var2, boolean var3, int[] var4) throws IOException {
      if (var4 != null) {
         var3 = true;
      }

      BufferedImage var7 = ImageIO.read(var1);
      return this.method_21242(var7, var2, var3, var4);
   }

   public ByteBuffer method_21242(BufferedImage var1, boolean var2, boolean var3, int[] var4) {
      ByteBuffer var7 = null;
      byte var8 = 2;
      byte var9 = 2;

      while (var8 < var1.getWidth()) {
         var8 *= 2;
      }

      while (var9 < var1.getHeight()) {
         var9 *= 2;
      }

      this.field_22297 = var1.getWidth();
      this.field_22293 = var1.getHeight();
      this.field_22298 = var9;
      this.field_22300 = var8;
      boolean var10 = var1.getColorModel().hasAlpha() || var3;
      BufferedImage var12;
      if (!var10) {
         this.field_22295 = 24;
         WritableRaster var11 = Raster.createInterleavedRaster(0, var8, var9, 3, null);
         var12 = new BufferedImage(field_22301, var11, false, new Hashtable());
      } else {
         this.field_22295 = 32;
         WritableRaster var20 = Raster.createInterleavedRaster(0, var8, var9, 4, null);
         var12 = new BufferedImage(field_22294, var20, false, new Hashtable());
      }

      Graphics2D var13 = (Graphics2D)var12.getGraphics();
      if (var10) {
         var13.setColor(new Color(0.0F, 0.0F, 0.0F, 0.0F));
         var13.fillRect(0, 0, var8, var9);
      }

      if (!var2) {
         var13.drawImage(var1, 0, 0, null);
      } else {
         var13.scale(1.0, -1.0);
         var13.drawImage(var1, 0, -this.field_22293, null);
      }

      if (this.field_22296) {
         if (this.field_22293 < var9 - 1) {
            this.method_21240(var12, 0, 0, this.field_22297, 1, 0, var9 - 1);
            this.method_21240(var12, 0, this.field_22293 - 1, this.field_22297, 1, 0, 1);
         }

         if (this.field_22297 < var8 - 1) {
            this.method_21240(var12, 0, 0, 1, this.field_22293, var8 - 1, 0);
            this.method_21240(var12, this.field_22297 - 1, 0, 1, this.field_22293, 1, 0);
         }
      }

      byte[] var14 = ((DataBufferByte)var12.getRaster().getDataBuffer()).getData();
      if (var4 != null) {
         for (byte var15 = 0; var15 < var14.length; var15 += 4) {
            boolean var16 = true;

            for (int var17 = 0; var17 < 3; var17++) {
               int var18 = var14[var15 + var17] >= 0 ? var14[var15 + var17] : 256 + var14[var15 + var17];
               if (var18 != var4[var17]) {
                  var16 = false;
               }
            }

            if (var16) {
               var14[var15 + 3] = 0;
            }
         }
      }

      var7 = ByteBuffer.allocateDirect(var14.length);
      var7.order(ByteOrder.nativeOrder());
      var7.put(var14, 0, var14.length);
      ((Buffer)var7).flip();
      var13.dispose();
      return var7;
   }

   @Override
   public ByteBuffer method_5152() {
      throw new RuntimeException("ImageIOImageData doesn't store it's image.");
   }

   private void method_21240(BufferedImage var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      Graphics2D var10 = (Graphics2D)var1.getGraphics();
      var10.drawImage(var1.getSubimage(var2, var3, var4, var5), var2 + var6, var3 + var7, null);
   }

   @Override
   public void method_33771(boolean var1) {
      this.field_22296 = var1;
   }
}