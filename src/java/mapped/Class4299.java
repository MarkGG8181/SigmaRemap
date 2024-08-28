package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Class4299 extends Class4278 {
   public Texture field20829;
   public Texture field20830;
   public Texture field20831;
   public Texture field20832;
   public Texture field20833;
   public TreeMap<Long, Double> field20834 = new TreeMap<Long, Double>();
   public float field20835 = 0.5F;
   public float field20836 = 0.0F;
   public long field20837 = System.currentTimeMillis();

   public Class4299(Class4305 var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1, var2, var3, var4, 700, 512, false);
      this.field20829 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/games/bg.png");
      this.field20830 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/games/fg.png");
      this.field20831 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/games/pipe.png");
      this.field20832 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/games/pipe2.png");
      this.field20833 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/games/bird.png");
   }

   private void method13183() {
   }

   private void method13184() {
      short var3 = 2200;
      byte var4 = 2;
      if (this.field20834.isEmpty()) {
         this.field20834.put(System.currentTimeMillis() + (long)(var3 * 2), 0.25 + Math.random() * 0.5);
      }

      for (long var5 = this.field20834.lastKey(); var5 < System.currentTimeMillis() + (long)(var3 * var4); var5 = this.field20834.lastKey()) {
         this.field20834.put(var5 + (long)var3, 0.25 + Math.random() * 0.5);
      }

      Iterator var7 = this.field20834.entrySet().iterator();

      while (var7.hasNext()) {
         Entry var8 = (Entry)var7.next();
         if ((Long)var8.getKey() < System.currentTimeMillis() - (long)(var3 * 2)) {
            var7.remove();
         }
      }
   }

   @Override
   public void method13065(int var1) {
      super.method13065(var1);
      if (var1 == 32) {
         this.field20836 = 0.045F;
      }
   }

   @Override
   public void method13027(float var1) {
      this.method13184();
      Class3192.method11415(this);

      for (int var4 = 0; var4 < 3; var4++) {
         Class3192.method11455((float)(this.field20895 + 288 * var4), (float)this.field20896, 288.0F, 512.0F, this.field20829);
      }

      float var16 = 60.0F / (float) Minecraft.method1586();
      float var5 = 0.026F * var16;
      this.field20835 = Math.max(Math.min(1.0F, this.field20835 + this.field20836 - var5), 0.0F);
      this.field20836 = Math.max(-var5, this.field20836 * 0.965F);
      byte var6 = 100;
      short var7 = 2200;
      int var8 = this.field20898 - 112;

      for (Entry var10 : this.field20834.entrySet()) {
         int var11 = (int)((Long)var10.getKey() - System.currentTimeMillis());
         float var12 = (float)var11 / 12.0F;
         float var13 = (float)var7 / 12.0F;
         Class3192.method11449(
            (float)this.field20895 + var13 + var12,
            (float)(this.field20896 - 320 + (int)((double)var8 * (Double)var10.getValue()) - var6 / 2),
            52.0F,
            320.0F,
            this.field20831,
            Class1979.field12896.field12910
         );
         Class3192.method11449(
            (float)this.field20895 + var13 + var12,
            (float)(this.field20896 + (int)((double)var8 * (Double)var10.getValue()) + var6 / 2),
            52.0F,
            320.0F,
            this.field20832,
            Class1979.field12896.field12910
         );
         if (var12 > -52.0F && var12 < 0.0F) {
            float var14 = (float)(var6 - 24) / (float)var8;
            boolean var15 = (double)this.field20835 < (Double)var10.getValue() - (double)(var14 / 2.0F)
               || (double)this.field20835 > (Double)var10.getValue() + (double)(var14 / 2.0F);
            if (var15) {
            }
         }
      }

      short var17 = 3400;
      float var18 = (float)(System.currentTimeMillis() % (long)var17) / (float)var17;

      for (int var19 = 0; var19 < 4; var19++) {
         Class3192.method11455((float)(this.field20895 + 288 * var19) - 288.0F * var18, (float)(this.field20896 + var8), 288.0F, 112.0F, this.field20830);
      }

      Class3192.method11436(
         (float)this.field20895 + (float)var7 / 12.0F, (float)this.field20896 + (float)var8 * (1.0F - this.field20835), 10.0F, Class1979.field12901.field12910
      );
      Class3192.method11422();
      this.field20837 = System.currentTimeMillis();
      super.method13027(var1);
   }
}
