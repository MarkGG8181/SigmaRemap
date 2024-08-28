package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.util.timer.Timer;
import org.lwjgl.glfw.GLFW;

import java.util.ArrayList;
import java.util.List;

public class Class4281 extends Class4278 {
   public static final Class6387 field20741 = new Class6387(
      -892679478, -892679478, -892679478, Class1979.field12891.field12910, Class2218.field14488, Class2218.field14492
   );
   public static final Class6387 field20742 = new Class6387(-1, -1, -1, Class1979.field12896.field12910, Class2218.field14488, Class2218.field14492);
   private String field20743 = "";
   private float field20744;
   private final float field20745 = 2.0F;
   private float field20746;
   private float field20747;
   private final float field20748 = 2.0F;
   private int field20749;
   private int field20750;
   private int field20751;
   private boolean field20752;
   private boolean field20753;
   private boolean field20754 = false;
   private String field20755 = Character.toString('·');
   private Timer field20756 = new Timer();
   private final List<Class7902> field20757 = new ArrayList<Class7902>();
   private boolean field20758 = true;

   public Class4281(Class4305 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, field20741, "", false);
      this.field20756.method27118();
   }

   public Class4281(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Class6387 var7) {
      super(var1, var2, var3, var4, var5, var6, var7, "", false);
      this.field20756.method27118();
   }

   public Class4281(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Class6387 var7, String var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, false);
      this.field20756.method27118();
   }

   public Class4281(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Class6387 var7, String var8, String var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, ResourceRegistry.JelloLightFont25, false);
      this.field20743 = var9;
      this.field20756.method27118();
   }

   public Class4281(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Class6387 var7, String var8, String var9, ClientResource var10) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, false);
      this.field20743 = var9;
      this.field20756.method27118();
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      String var5 = this.field20912;
      if (this.field20754) {
         var5 = this.field20912.replaceAll(".", this.field20755);
      }

      if (this.method13298() && this.field20905) {
         Client.getInstance().getGuiManager().method33459(GuiManager.field41346);
      }

      this.field20744 = this.field20744 + ((!this.field20905 ? 0.0F : 1.0F) - this.field20744) / 2.0F;
      if (this.field20905) {
         if (this.field20752) {
            this.field20749 = Class8906.method32494(var5, this.field20913, (float)this.method13271(), var1, this.field20746);
         }
      } else {
         this.field20749 = 0;
         this.field20750 = 0;
         this.field20747 = 0.0F;
      }

      this.field20749 = Math.min(Math.max(0, this.field20749), var5.length());
      this.field20751 = this.field20749;
   }

   public void method13146() {
      this.field20746 = 0.0F;
   }

   public void method13147(String var1) {
      this.field20755 = var1;
   }

   @Override
   public boolean method13078(int var1, int var2, int var3) {
      if (!super.method13078(var1, var2, var3)) {
         String var6 = this.field20912;
         if (this.field20754) {
            var6 = this.field20912.replaceAll(".", this.field20755);
         }

         this.field20752 = true;
         this.field20749 = Class8906.method32494(var6, this.field20913, (float)this.method13271(), var1, this.field20746);
         if (!Class9798.method38639(Minecraft.getInstance().field1283.method8039(), 340)
            && !Class9798.method38639(Minecraft.getInstance().field1283.method8039(), 344)) {
            this.field20750 = this.field20749;
         }

         return false;
      } else {
         return true;
      }
   }

   public void method13148() {
      this.method13242();
      this.field20749 = this.field20912.length();
      this.field20750 = 0;
      this.field20751 = this.field20749;
   }

   @Override
   public void method13095(int var1, int var2, int var3) {
      super.method13095(var1, var2, var3);
      this.field20752 = false;
   }

   @Override
   public void method13065(int var1) {
      super.method13065(var1);
      if (this.field20905) {
         switch (var1) {
            case 65:
               if (this.method13149()) {
                  this.field20749 = this.field20912.length();
                  this.field20750 = 0;
                  this.field20751 = this.field20749;
               }
               break;
            case 67:
               if (this.method13149() && this.field20750 != this.field20751) {
                  GLFW.glfwSetClipboardString(
                     Minecraft.getInstance().field1283.method8039(),
                     this.field20912.substring(Math.min(this.field20750, this.field20751), Math.max(this.field20750, this.field20751))
                  );
               }
               break;
            case 86:
               if (this.method13149()) {
                  String var12 = "";

                  try {
                     var12 = GLFW.glfwGetClipboardString(Minecraft.getInstance().field1283.method8039());
                     if (var12 == null) {
                        var12 = "";
                     }
                  } catch (Exception var7) {
                  }

                  if (var12 != "") {
                     if (this.field20750 != this.field20751) {
                        this.field20912 = Class8906.method32493(this.field20912, var12, this.field20750, this.field20751);
                        if (this.field20749 > this.field20750) {
                           this.field20749 = this.field20749 - (Math.max(this.field20750, this.field20751) - Math.min(this.field20750, this.field20751));
                        }

                        this.field20749 = this.field20749 + var12.length();
                        this.field20750 = this.field20749;
                     } else {
                        this.field20912 = Class8906.method32492(this.field20912, var12, this.field20749);
                        this.field20749 = this.field20749 + var12.length();
                        this.field20750 = this.field20749;
                     }

                     this.method13152();
                  }
               }
               break;
            case 88:
               if (this.method13149() && this.field20750 != this.field20751) {
                  GLFW.glfwSetClipboardString(
                     Minecraft.getInstance().field1283.method8039(),
                     this.field20912.substring(Math.min(this.field20750, this.field20751), Math.max(this.field20750, this.field20751))
                  );
                  this.field20912 = Class8906.method32493(this.field20912, "", this.field20750, this.field20751);
                  if (this.field20749 > this.field20750) {
                     this.field20749 = this.field20749 - (Math.max(this.field20750, this.field20751) - Math.min(this.field20750, this.field20751));
                  }

                  this.field20750 = this.field20749;
                  this.field20751 = this.field20749;
                  this.method13152();
               }
               break;
            case 256:
               this.method13145(false);
               break;
            case 259:
               if (this.field20912.length() > 0) {
                  if (this.field20750 != this.field20751) {
                     this.field20912 = Class8906.method32493(this.field20912, "", this.field20750, this.field20751);
                     if (this.field20749 > this.field20750) {
                        this.field20749 = this.field20749 - (Math.max(this.field20750, this.field20751) - Math.min(this.field20750, this.field20751));
                     }
                  } else if (this.method13149()) {
                     int var11 = -1;

                     for (int var14 = Math.max(this.field20749 - 1, 0); var14 >= 0; var14--) {
                        if ((String.valueOf(this.field20912.charAt(var14)).equalsIgnoreCase(" ") || var14 == 0) && Math.abs(this.field20749 - var14) > 1) {
                           var11 = var14 + (var14 == 0 ? 0 : 1);
                           break;
                        }
                     }

                     if (var11 != -1) {
                        this.field20912 = Class8906.method32493(this.field20912, "", var11, this.field20749);
                        this.field20749 = var11;
                     }
                  } else {
                     this.field20912 = Class8906.method32493(this.field20912, "", this.field20749 - 1, this.field20749);
                     this.field20749--;
                  }

                  this.method13152();
               }

               this.field20750 = this.field20749;
               break;
            case 262:
               if (!this.method13149()) {
                  this.field20749++;
               } else {
                  int var10 = -1;

                  for (int var13 = this.field20749; var13 < this.field20912.length(); var13++) {
                     try {
                        if ((String.valueOf(this.field20912.charAt(var13)).equalsIgnoreCase(" ") || var13 == this.field20912.length() - 1)
                           && (Math.abs(this.field20749 - var13) > 1 || var13 == this.field20912.length() - 1)) {
                           var10 = var13 + 1;
                           break;
                        }
                     } catch (Exception var9) {
                        break;
                     }
                  }

                  if (var10 != -1) {
                     this.field20749 = var10;
                  }
               }

               if (!Class9798.method38639(Minecraft.getInstance().field1283.method8039(), 340)
                  && !Class9798.method38639(Minecraft.getInstance().field1283.method8039(), 344)) {
                  this.field20750 = this.field20749;
               }
               break;
            case 263:
               if (!this.method13149()) {
                  this.field20749--;
               } else {
                  int var4 = -1;

                  for (int var5 = Math.max(this.field20749 - 1, 0); var5 >= 0; var5--) {
                     try {
                        if ((String.valueOf(this.field20912.charAt(var5)).equalsIgnoreCase(" ") || var5 == 0) && Math.abs(this.field20749 - var5) > 1) {
                           var4 = var5;
                           break;
                        }
                     } catch (Exception var8) {
                        break;
                     }
                  }

                  if (var4 != -1) {
                     this.field20749 = var4;
                  }
               }

               if (!Class9798.method38639(Minecraft.getInstance().field1283.method8039(), 340)
                  && !Class9798.method38639(Minecraft.getInstance().field1283.method8039(), 344)) {
                  this.field20750 = this.field20749;
               }
               break;
            case 268:
               this.field20749 = 0;
               if (!Class9798.method38639(Minecraft.getInstance().field1283.method8039(), 340)
                  && !Class9798.method38639(Minecraft.getInstance().field1283.method8039(), 344)) {
                  this.field20750 = this.field20749;
               }
               break;
            case 269:
               this.field20749 = this.field20912.length();
               if (!Class9798.method38639(Minecraft.getInstance().field1283.method8039(), 340)
                  && !Class9798.method38639(Minecraft.getInstance().field1283.method8039(), 344)) {
                  this.field20750 = this.field20749;
               }
         }
      }
   }

   public boolean method13149() {
      return Class9798.method38639(Minecraft.getInstance().field1283.method8039(), 341)
         || Class9798.method38639(Minecraft.getInstance().field1283.method8039(), 345)
         || Class9798.method38639(Minecraft.getInstance().field1283.method8039(), 343);
   }

   @Override
   public void method13150(char var1) {
      super.method13150(var1);
      if (this.method13297() && Class8906.method32486(var1)) {
         if (this.field20750 == this.field20751) {
            this.field20912 = Class8906.method32492(this.field20912, Character.toString(var1), this.field20749);
         } else {
            this.field20912 = Class8906.method32493(this.field20912, Character.toString(var1), this.field20750, this.field20751);
         }

         this.field20749++;
         this.field20750 = this.field20749;
         this.method13152();
      }
   }

   @Override
   public void method13027(float var1) {
      this.method13225();
      float var4 = 1000.0F;
      boolean var5 = !this.field20905 ? false : (float)this.field20756.method27121() > var4 / 2.0F;
      if ((float)this.field20756.method27121() > var4) {
         this.field20756.method27120();
      }

      String var6 = this.field20912;
      if (this.field20754) {
         var6 = this.field20912.replaceAll(".", this.field20755);
      }

      Class3192.method11421(this.method13263(), this.method13265(), this.method13263() + this.field20897, this.method13265() + this.field20898, true);
      int var7 = this.field20895 + 4;
      int var8 = this.field20897 - 4;
      float var9 = (float)var7 + this.field20746 + (float)this.field20913.method23942(var6.substring(0, this.field20749));
      if (this.method13297()) {
         Class3192.method11426(
            var9 + (float)(var6.isEmpty() ? 0 : -1),
            (float)(this.field20896 + this.field20898 / 2 - this.field20913.method23941(var6) / 2 + 2),
            var9 + (float)(var6.isEmpty() ? 1 : 0),
            (float)(this.field20896 + this.field20898 / 2 + this.field20913.method23941(var6) / 2 - 1),
            Class5628.method17688(this.field20914.method19409(), !var5 ? 0.1F * var1 : 0.8F)
         );
         float var10 = (float)(var7 + this.field20913.method23942(var6.substring(0, this.field20749))) + this.field20747;
         if (var10 < (float)var7) {
            this.field20747 += (float)var7 - var10;
            this.field20747 = this.field20747 - Math.min((float)var8, this.field20747);
         }

         if (var10 > (float)(var7 + var8)) {
            this.field20747 += (float)(var7 + var8) - var10;
         }
      }

      this.field20746 = this.field20746 + (this.field20747 - this.field20746) / 2.0F;
      this.field20750 = Math.min(Math.max(0, this.field20750), var6.length());
      this.field20751 = Math.min(Math.max(0, this.field20751), var6.length());
      float var14 = (float)var7 + this.field20746 + (float)this.field20913.method23942(var6.substring(0, this.field20750));
      float var11 = (float)var7 + this.field20746 + (float)this.field20913.method23942(var6.substring(0, this.field20751));
      Class3192.method11426(
         var14,
         (float)(this.field20896 + this.field20898 / 2 - this.field20913.method23941(var6) / 2),
         var11,
         (float)(this.field20896 + this.field20898 / 2 + this.field20913.method23941(var6) / 2),
         Class5628.method17688(-5516546, var1)
      );
      Class2218 var12 = this.field20914.method19411();
      Class2218 var13 = this.field20914.method19413();
      Class3192.method11440(
         this.field20913,
         (float)var7 + this.field20746,
         (float)(this.field20896 + this.field20898 / 2),
         var6.length() == 0 && (!this.field20905 || var6.length() <= 0) ? this.field20743 : var6,
         Class5628.method17688(this.field20914.method19409(), (this.field20744 / 2.0F + 0.4F) * var1 * (this.field20905 && var6.length() > 0 ? 1.0F : 0.5F)),
         var12,
         var13
      );
      Class3192.method11422();
      if (this.field20758) {
         Class3192.method11426(
            (float)this.field20895,
            (float)(this.field20896 + this.field20898 - 2),
            (float)(this.field20895 + this.field20897),
            (float)(this.field20896 + this.field20898),
            Class5628.method17688(this.field20914.method19405(), (this.field20744 / 2.0F + 0.5F) * var1)
         );
      }

      super.method13027(var1);
   }

   public final void method13151(Class7902 var1) {
      this.field20757.add(var1);
   }

   public void method13152() {
      for (Class7902 var4 : this.field20757) {
         var4.method26474(this);
      }
   }

   public String method13153() {
      return this.field20743;
   }

   public void method13154(String var1) {
      this.field20743 = var1;
   }

   public void method13155(boolean var1) {
      this.field20754 = var1;
   }

   public void method13156(boolean var1) {
      this.field20758 = var1;
   }
}