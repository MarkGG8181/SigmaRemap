package mapped;

import java.util.Map.Entry;

public class Class1003 extends Entity {
   public int field5555;
   public int field5556;
   public int field5557;
   private int field5558 = 5;
   private int field5559;
   private PlayerEntity field5560;
   private int field5561;

   public Class1003(Class1655 var1, double var2, double var4, double var6, int var8) {
      this(Class8992.field41029, var1);
      this.method3215(var2, var4, var6);
      this.field5031 = (float)(this.field5054.nextDouble() * 360.0);
      this.method3435(
         (this.field5054.nextDouble() * 0.2F - 0.1F) * 2.0, this.field5054.nextDouble() * 0.2 * 2.0, (this.field5054.nextDouble() * 0.2F - 0.1F) * 2.0
      );
      this.field5559 = var8;
   }

   public Class1003(Class8992<? extends Class1003> var1, Class1655 var2) {
      super(var1, var2);
   }

   @Override
   public boolean method2940() {
      return false;
   }

   @Override
   public void method2850() {
   }

   @Override
   public void tick() {
      super.tick();
      if (this.field5557 > 0) {
         this.field5557--;
      }

      this.field5025 = this.getPosX();
      this.field5026 = this.getPosY();
      this.field5027 = this.getPosZ();
      if (!this.method3263(Class8953.field40469)) {
         if (!this.method3247()) {
            this.method3434(this.method3433().method11339(0.0, -0.03, 0.0));
         }
      } else {
         this.method4174();
      }

      if (this.field5024.method6739(this.method3432()).method23486(Class8953.field40470)) {
         this.method3435(
            (double)((this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.2F),
            0.2F,
            (double)((this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.2F)
         );
         this.method2863(Class6067.field26606, 0.4F, 2.0F + this.field5054.nextFloat() * 0.4F);
      }

      if (!this.field5024.method7051(this.method3389())) {
         this.pushOutOfBlocks(this.getPosX(), (this.method3389().field28450 + this.method3389().field28453) / 2.0, this.getPosZ());
      }

      double var3 = 8.0;
      if (this.field5561 < this.field5555 - 20 + this.method3205() % 100) {
         if (this.field5560 == null || this.field5560.method3277(this) > 64.0) {
            this.field5560 = this.field5024.method7185(this, 8.0);
         }

         this.field5561 = this.field5555;
      }

      if (this.field5560 != null && this.field5560.method2800()) {
         this.field5560 = null;
      }

      if (this.field5560 != null) {
         Vector3d var5 = new Vector3d(
            this.field5560.getPosX() - this.getPosX(),
            this.field5560.getPosY() + (double)this.field5560.method3393() / 2.0 - this.getPosY(),
            this.field5560.getPosZ() - this.getPosZ()
         );
         double var6 = var5.method11349();
         if (var6 < 64.0) {
            double var8 = 1.0 - Math.sqrt(var6) / 8.0;
            this.method3434(this.method3433().method11338(var5.method11333().method11344(var8 * var8 * 0.1)));
         }
      }

      this.move(Class2107.field13742, this.method3433());
      float var10 = 0.98F;
      if (this.field5036) {
         var10 = this.field5024.method6738(new BlockPos(this.getPosX(), this.getPosY() - 1.0, this.getPosZ())).method23383().method11571() * 0.98F;
      }

      this.method3434(this.method3433().method11347((double)var10, 0.98, (double)var10));
      if (this.field5036) {
         this.method3434(this.method3433().method11347(1.0, -0.9, 1.0));
      }

      this.field5555++;
      this.field5556++;
      if (this.field5556 >= 6000) {
         this.method2904();
      }
   }

   private void method4174() {
      Vector3d var3 = this.method3433();
      this.method3435(var3.field18048 * 0.99F, Math.min(var3.field18049 + 5.0E-4F, 0.06F), var3.field18050 * 0.99F);
   }

   @Override
   public void method2925() {
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (!this.method2760(var1)) {
         this.method3141();
         this.field5558 = (int)((float)this.field5558 - var2);
         if (this.field5558 <= 0) {
            this.method2904();
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public void method2724(Class39 var1) {
      var1.method101("Health", (short)this.field5558);
      var1.method101("Age", (short)this.field5556);
      var1.method101("Value", (short)this.field5559);
   }

   @Override
   public void method2723(Class39 var1) {
      this.field5558 = var1.method121("Health");
      this.field5556 = var1.method121("Age");
      this.field5559 = var1.method121("Value");
   }

   @Override
   public void method3279(PlayerEntity var1) {
      if (!this.field5024.field9020 && this.field5557 == 0 && var1.field4910 == 0) {
         var1.field4910 = 2;
         var1.method2751(this, 1);
         Entry var4 = Class7858.method26340(Class8122.field34932, var1, Class8848::method32116);
         if (var4 != null) {
            Class8848 var5 = (Class8848)var4.getValue();
            if (!var5.method32105() && var5.method32116()) {
               int var6 = Math.min(this.method4176(this.field5559), var5.method32117());
               this.field5559 = this.field5559 - this.method4175(var6);
               var5.method32118(var5.method32117() - var6);
            }
         }

         if (this.field5559 > 0) {
            var1.method2781(this.field5559);
         }

         this.method2904();
      }
   }

   private int method4175(int var1) {
      return var1 / 2;
   }

   private int method4176(int var1) {
      return var1 * 2;
   }

   public int method4177() {
      return this.field5559;
   }

   public int method4178() {
      if (this.field5559 < 2477) {
         if (this.field5559 < 1237) {
            if (this.field5559 < 617) {
               if (this.field5559 < 307) {
                  if (this.field5559 < 149) {
                     if (this.field5559 < 73) {
                        if (this.field5559 < 37) {
                           if (this.field5559 < 17) {
                              if (this.field5559 < 7) {
                                 return this.field5559 < 3 ? 0 : 1;
                              } else {
                                 return 2;
                              }
                           } else {
                              return 3;
                           }
                        } else {
                           return 4;
                        }
                     } else {
                        return 5;
                     }
                  } else {
                     return 6;
                  }
               } else {
                  return 7;
               }
            } else {
               return 8;
            }
         } else {
            return 9;
         }
      } else {
         return 10;
      }
   }

   public static int method4179(int var0) {
      if (var0 < 2477) {
         if (var0 < 1237) {
            if (var0 < 617) {
               if (var0 < 307) {
                  if (var0 < 149) {
                     if (var0 < 73) {
                        if (var0 < 37) {
                           if (var0 < 17) {
                              if (var0 < 7) {
                                 return var0 < 3 ? 1 : 3;
                              } else {
                                 return 7;
                              }
                           } else {
                              return 17;
                           }
                        } else {
                           return 37;
                        }
                     } else {
                        return 73;
                     }
                  } else {
                     return 149;
                  }
               } else {
                  return 307;
               }
            } else {
               return 617;
            }
         } else {
            return 1237;
         }
      } else {
         return 2477;
      }
   }

   @Override
   public boolean method3360() {
      return false;
   }

   @Override
   public Packet<?> method2835() {
      return new Class5520(this);
   }
}
