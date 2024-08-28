package mapped;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

public abstract class Class884 extends Class882 {
   private static final Class9289<Byte> field5097 = Class9361.<Byte>method35441(Class884.class, Class7784.field33390);
   private static final Class9289<Byte> field5098 = Class9361.<Byte>method35441(Class884.class, Class7784.field33390);
   private Class7380 field5099;
   public boolean field5100;
   public int field5101;
   public Class2192 field5102 = Class2192.field14331;
   public int field5103;
   private int field5104;
   private double field5105 = 2.0;
   private int field5106;
   private Class9455 field5107 = this.method3476();
   private IntOpenHashSet field5108;
   private List<Entity> field5109;

   public Class884(Class8992<? extends Class884> var1, Class1655 var2) {
      super(var1, var2);
   }

   public Class884(Class8992<? extends Class884> var1, double var2, double var4, double var6, Class1655 var8) {
      this(var1, var8);
      this.method3215(var2, var4, var6);
   }

   public Class884(Class8992<? extends Class884> var1, Class880 var2, Class1655 var3) {
      this(var1, var2.getPosX(), var2.method3442() - 0.1F, var2.getPosZ(), var3);
      this.method3459(var2);
      if (var2 instanceof PlayerEntity) {
         this.field5102 = Class2192.field14332;
      }
   }

   public void method3471(Class9455 var1) {
      this.field5107 = var1;
   }

   @Override
   public boolean method3291(double var1) {
      double var5 = this.method3389().method19675() * 10.0;
      if (Double.isNaN(var5)) {
         var5 = 1.0;
      }

      var5 = var5 * 64.0 * method3377();
      return var1 < var5 * var5;
   }

   @Override
   public void method2850() {
      this.field5063.method35442(field5097, (byte)0);
      this.field5063.method35442(field5098, (byte)0);
   }

   @Override
   public void method3462(double var1, double var3, double var5, float var7, float var8) {
      super.method3462(var1, var3, var5, var7, var8);
      this.field5104 = 0;
   }

   @Override
   public void method3131(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.method3215(var1, var3, var5);
      this.method3214(var7, var8);
   }

   @Override
   public void method3325(double var1, double var3, double var5) {
      super.method3325(var1, var3, var5);
      this.field5104 = 0;
   }

   @Override
   public void tick() {
      super.tick();
      boolean var3 = this.method3493();
      Vector3d var4 = this.method3433();
      if (this.field5034 == 0.0F && this.field5033 == 0.0F) {
         float var5 = Class9679.method37766(method3234(var4));
         this.field5031 = (float)(Class9679.method37814(var4.field18048, var4.field18050) * 180.0F / (float)Math.PI);
         this.field5032 = (float)(Class9679.method37814(var4.field18049, (double)var5) * 180.0F / (float)Math.PI);
         this.field5033 = this.field5031;
         this.field5034 = this.field5032;
      }

      BlockPos var32 = this.method3432();
      Class7380 var6 = this.field5024.method6738(var32);
      if (!var6.method23393() && !var3) {
         Class6408 var7 = var6.method23414(this.field5024, var32);
         if (!var7.method19516()) {
            Vector3d var8 = this.method3431();

            for (Class6488 var23 : var7.method19521()) {
               if (var23.method19668(var32).method19673(var8)) {
                  this.field5100 = true;
                  break;
               }
            }
         }
      }

      if (this.field5103 > 0) {
         this.field5103--;
      }

      if (this.method3253()) {
         this.method3223();
      }

      if (this.field5100 && !var3) {
         if (this.field5099 != var6 && this.method3472()) {
            this.method3473();
         } else if (!this.field5024.field9020) {
            this.method3474();
         }

         this.field5101++;
      } else {
         this.field5101 = 0;
         Vector3d var33 = this.method3431();
         Vector3d var34 = var33.method11338(var4);
         Object var35 = this.field5024.method7036(new Class6809(var33, var34, Class2271.field14774, Class1985.field12962, this));
         if (((Class8710)var35).method31417() != Class2100.field13689) {
            var34 = ((Class8710)var35).method31419();
         }

         while (!this.field5041) {
            Class8709 var36 = this.method3479(var33, var34);
            if (var36 != null) {
               var35 = var36;
            }

            if (var35 != null && ((Class8710)var35).method31417() == Class2100.field13691) {
               Entity var24 = ((Class8709)var35).method31416();
               Entity var25 = this.method3460();
               if (var24 instanceof PlayerEntity && var25 instanceof PlayerEntity && !((PlayerEntity)var25).method2742((PlayerEntity)var24)) {
                  var35 = null;
                  var36 = null;
               }
            }

            if (var35 != null && !var3) {
               this.method3464((Class8710)var35);
               this.field5078 = true;
            }

            if (var36 == null || this.method3489() <= 0) {
               break;
            }

            var35 = null;
         }

         var4 = this.method3433();
         double var10 = var4.field18048;
         double var12 = var4.field18049;
         double var14 = var4.field18050;
         if (this.method3487()) {
            for (int var26 = 0; var26 < 4; var26++) {
               this.field5024
                  .method6746(
                     Class7940.field34054,
                     this.getPosX() + var10 * (double)var26 / 4.0,
                     this.getPosY() + var12 * (double)var26 / 4.0,
                     this.getPosZ() + var14 * (double)var26 / 4.0,
                     -var10,
                     -var12 + 0.2,
                     -var14
                  );
            }
         }

         double var16 = this.getPosX() + var10;
         double var18 = this.getPosY() + var12;
         double var20 = this.getPosZ() + var14;
         float var22 = Class9679.method37766(method3234(var4));
         if (!var3) {
            this.field5031 = (float)(Class9679.method37814(var10, var14) * 180.0F / (float)Math.PI);
         } else {
            this.field5031 = (float)(Class9679.method37814(-var10, -var14) * 180.0F / (float)Math.PI);
         }

         this.field5032 = (float)(Class9679.method37814(var12, (double)var22) * 180.0F / (float)Math.PI);
         this.field5032 = method3469(this.field5034, this.field5032);
         this.field5031 = method3469(this.field5033, this.field5031);
         float var27 = 0.99F;
         float var28 = 0.05F;
         if (this.method3250()) {
            for (int var29 = 0; var29 < 4; var29++) {
               float var30 = 0.25F;
               this.field5024.method6746(Class7940.field34052, var16 - var10 * 0.25, var18 - var12 * 0.25, var20 - var14 * 0.25, var10, var12, var14);
            }

            var27 = this.method3491();
         }

         this.method3434(var4.method11344((double)var27));
         if (!this.method3247() && !var3) {
            Vector3d var37 = this.method3433();
            this.method3435(var37.field18048, var37.field18049 - 0.05F, var37.field18050);
         }

         this.method3215(var16, var18, var20);
         this.method3240();
      }
   }

   private boolean method3472() {
      return this.field5100 && this.field5024.method7051(new Class6488(this.method3431(), this.method3431()).method19664(0.06));
   }

   private void method3473() {
      this.field5100 = false;
      Vector3d var3 = this.method3433();
      this.method3434(
         var3.method11347((double)(this.field5054.nextFloat() * 0.2F), (double)(this.field5054.nextFloat() * 0.2F), (double)(this.field5054.nextFloat() * 0.2F))
      );
      this.field5104 = 0;
   }

   @Override
   public void move(Class2107 var1, Vector3d var2) {
      super.move(var1, var2);
      if (var1 != Class2107.field13742 && this.method3472()) {
         this.method3473();
      }
   }

   public void method3474() {
      this.field5104++;
      if (this.field5104 >= 1200) {
         this.method2904();
      }
   }

   private void method3475() {
      if (this.field5109 != null) {
         this.field5109.clear();
      }

      if (this.field5108 != null) {
         this.field5108.clear();
      }
   }

   @Override
   public void method3465(Class8709 var1) {
      super.method3465(var1);
      Entity var4 = var1.method31416();
      float var5 = (float)this.method3433().method11348();
      int var6 = Class9679.method37774(Class9679.method37778((double)var5 * this.field5105, 0.0, 2.147483647E9));
      if (this.method3489() > 0) {
         if (this.field5108 == null) {
            this.field5108 = new IntOpenHashSet(5);
         }

         if (this.field5109 == null) {
            this.field5109 = Lists.newArrayListWithCapacity(5);
         }

         if (this.field5108.size() >= this.method3489() + 1) {
            this.method2904();
            return;
         }

         this.field5108.add(var4.method3205());
      }

      if (this.method3487()) {
         long var9 = (long)this.field5054.nextInt(var6 / 2 + 2);
         var6 = (int)Math.min(var9 + (long)var6, 2147483647L);
      }

      Entity var7 = this.method3460();
      Class8654 var8;
      if (var7 != null) {
         var8 = Class8654.method31118(this, var7);
         if (var7 instanceof Class880) {
            ((Class880)var7).method3020(var4);
         }
      } else {
         var8 = Class8654.method31118(this, this);
      }

      boolean var11 = var4.method3204() == Class8992.field41025;
      int var12 = var4.method3222();
      if (this.method3327() && !var11) {
         var4.method3221(5);
      }

      if (!var4.method2741(var8, (float)var6)) {
         var4.method2966(var12);
         this.method3434(this.method3433().method11344(-0.1));
         this.field5031 += 180.0F;
         this.field5033 += 180.0F;
         if (!this.field5024.field9020 && this.method3433().method11349() < 1.0E-7) {
            if (this.field5102 == Class2192.field14332) {
               this.method3303(this.method3480(), 0.1F);
            }

            this.method2904();
         }
      } else {
         if (var11) {
            return;
         }

         if (var4 instanceof Class880) {
            Class880 var13 = (Class880)var4;
            if (!this.field5024.field9020 && this.method3489() <= 0) {
               var13.method3077(var13.method3076() + 1);
            }

            if (this.field5106 > 0) {
               Vector3d var14 = this.method3433().method11347(1.0, 0.0, 1.0).method11333().method11344((double)this.field5106 * 0.6);
               if (var14.method11349() > 0.0) {
                  var13.method3280(var14.field18048, 0.1, var14.field18050);
               }
            }

            if (!this.field5024.field9020 && var7 instanceof Class880) {
               Class7858.method26320(var13, var7);
               Class7858.method26321((Class880)var7, var13);
            }

            this.method3478(var13);
            if (var7 != null && var13 != var7 && var13 instanceof PlayerEntity && var7 instanceof Class878 && !this.method3245()) {
               ((Class878)var7).field4855.method15671(new Class5534(Class5534.field24566, 0.0F));
            }

            if (!var4.method3066() && this.field5109 != null) {
               this.field5109.add(var13);
            }

            if (!this.field5024.field9020 && var7 instanceof Class878) {
               Class878 var15 = (Class878)var7;
               if (this.field5109 != null && this.method3488()) {
                  Class9551.field44497.method15149(var15, this.field5109);
               } else if (!var4.method3066() && this.method3488()) {
                  Class9551.field44497.method15149(var15, Arrays.<Entity>asList(var4));
               }
            }
         }

         this.method2863(this.field5107, 1.0F, 1.2F / (this.field5054.nextFloat() * 0.2F + 0.9F));
         if (this.method3489() <= 0) {
            this.method2904();
         }
      }
   }

   @Override
   public void method3466(Class8711 var1) {
      this.field5099 = this.field5024.method6738(var1.method31423());
      super.method3466(var1);
      Vector3d var4 = var1.method31419().method11337(this.getPosX(), this.getPosY(), this.getPosZ());
      this.method3434(var4);
      Vector3d var5 = var4.method11333().method11344(0.05F);
      this.method3446(this.getPosX() - var5.field18048, this.getPosY() - var5.field18049, this.getPosZ() - var5.field18050);
      this.method2863(this.method3477(), 1.0F, 1.2F / (this.field5054.nextFloat() * 0.2F + 0.9F));
      this.field5100 = true;
      this.field5103 = 7;
      this.method3484(false);
      this.method3485((byte)0);
      this.method3471(Class6067.field26361);
      this.method3494(false);
      this.method3475();
   }

   public Class9455 method3476() {
      return Class6067.field26361;
   }

   public final Class9455 method3477() {
      return this.field5107;
   }

   public void method3478(Class880 var1) {
   }

   @Nullable
   public Class8709 method3479(Vector3d var1, Vector3d var2) {
      return Class9456.method36387(this.field5024, this, var1, var2, this.method3389().method19661(this.method3433()).method19664(1.0), this::method3467);
   }

   @Override
   public boolean method3467(Entity var1) {
      return super.method3467(var1) && (this.field5108 == null || !this.field5108.contains(var1.method3205()));
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method101("life", (short)this.field5104);
      if (this.field5099 != null) {
         var1.method99("inBlockState", Class8354.method29287(this.field5099));
      }

      var1.method100("shake", (byte)this.field5103);
      var1.method115("inGround", this.field5100);
      var1.method100("pickup", (byte)this.field5102.ordinal());
      var1.method108("damage", this.field5105);
      var1.method115("crit", this.method3487());
      var1.method100("PierceLevel", this.method3489());
      var1.method109("SoundEvent", Class2348.field16069.method9181(this.field5107).toString());
      var1.method115("ShotFromCrossbow", this.method3488());
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      this.field5104 = var1.method121("life");
      if (var1.method119("inBlockState", 10)) {
         this.field5099 = Class8354.method29285(var1.method130("inBlockState"));
      }

      this.field5103 = var1.method120("shake") & 255;
      this.field5100 = var1.method132("inGround");
      if (var1.method119("damage", 99)) {
         this.field5105 = var1.method125("damage");
      }

      if (!var1.method119("pickup", 99)) {
         if (var1.method119("player", 99)) {
            this.field5102 = !var1.method132("player") ? Class2192.field14331 : Class2192.field14332;
         }
      } else {
         this.field5102 = Class2192.method8902(var1.method120("pickup"));
      }

      this.method3484(var1.method132("crit"));
      this.method3485(var1.method120("PierceLevel"));
      if (var1.method119("SoundEvent", 8)) {
         this.field5107 = Class2348.field16069.method9187(new ResourceLocation(var1.method126("SoundEvent"))).orElse(this.method3476());
      }

      this.method3494(var1.method132("ShotFromCrossbow"));
   }

   @Override
   public void method3459(Entity var1) {
      super.method3459(var1);
      if (var1 instanceof PlayerEntity) {
         this.field5102 = !((PlayerEntity)var1).field4919.field29609 ? Class2192.field14332 : Class2192.field14333;
      }
   }

   @Override
   public void method3279(PlayerEntity var1) {
      if (!this.field5024.field9020 && (this.field5100 || this.method3493()) && this.field5103 <= 0) {
         boolean var4 = this.field5102 == Class2192.field14332
            || this.field5102 == Class2192.field14333 && var1.field4919.field29609
            || this.method3493() && this.method3460().method3375() == var1.method3375();
         if (this.field5102 == Class2192.field14332 && !var1.field4902.method4045(this.method3480())) {
            var4 = false;
         }

         if (var4) {
            var1.method2751(this, 1);
            this.method2904();
         }
      }
   }

   public abstract Class8848 method3480();

   @Override
   public boolean method2940() {
      return false;
   }

   public void method3481(double var1) {
      this.field5105 = var1;
   }

   public double method3482() {
      return this.field5105;
   }

   public void method3483(int var1) {
      this.field5106 = var1;
   }

   @Override
   public boolean method3360() {
      return false;
   }

   @Override
   public float method3181(Class2090 var1, Class8847 var2) {
      return 0.13F;
   }

   public void method3484(boolean var1) {
      this.method3486(1, var1);
   }

   public void method3485(byte var1) {
      this.field5063.method35446(field5098, var1);
   }

   private void method3486(int var1, boolean var2) {
      byte var5 = this.field5063.<Byte>method35445(field5097);
      if (!var2) {
         this.field5063.method35446(field5097, (byte)(var5 & ~var1));
      } else {
         this.field5063.method35446(field5097, (byte)(var5 | var1));
      }
   }

   public boolean method3487() {
      byte var3 = this.field5063.<Byte>method35445(field5097);
      return false;
   }

   public boolean method3488() {
      byte var3 = this.field5063.<Byte>method35445(field5097);
      return false;
   }

   public byte method3489() {
      return this.field5063.<Byte>method35445(field5098);
   }

   public void method3490(Class880 var1, float var2) {
      int var5 = Class7858.method26322(Class8122.field34919, var1);
      int var6 = Class7858.method26322(Class8122.field34920, var1);
      this.method3481((double)(var2 * 2.0F) + this.field5054.nextGaussian() * 0.25 + (double)((float)this.field5024.method6997().method8905() * 0.11F));
      if (var5 > 0) {
         this.method3481(this.method3482() + (double)var5 * 0.5 + 0.5);
      }

      if (var6 > 0) {
         this.method3483(var6);
      }

      if (Class7858.method26322(Class8122.field34921, var1) > 0) {
         this.method3221(100);
      }
   }

   public float method3491() {
      return 0.6F;
   }

   public void method3492(boolean var1) {
      this.field5052 = var1;
      this.method3486(2, var1);
   }

   public boolean method3493() {
      return this.field5024.field9020 ? (this.field5063.<Byte>method35445(field5097) & 2) != 0 : this.field5052;
   }

   public void method3494(boolean var1) {
      this.method3486(4, var1);
   }

   @Override
   public Packet<?> method2835() {
      Entity var3 = this.method3460();
      return new Class5487(this, var3 != null ? var3.method3205() : 0);
   }
}