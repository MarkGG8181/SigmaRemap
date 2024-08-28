package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class Class957 extends Class956 implements Class935 {
   private static final Logger field5371 = LogManager.getLogger();
   private long field5372;
   private int field5373;
   private BlockPos field5374;
   private boolean field5375;

   public Class957() {
      super(Class4387.field21441);
   }

   @Override
   public Class39 method3646(Class39 var1) {
      super.method3646(var1);
      var1.method103("Age", this.field5372);
      if (this.field5374 != null) {
         var1.method99("ExitPortal", Class8354.method29284(this.field5374));
      }

      if (this.field5375) {
         var1.method115("ExactTeleport", this.field5375);
      }

      return var1;
   }

   @Override
   public void method3645(Class7380 var1, Class39 var2) {
      super.method3645(var1, var2);
      this.field5372 = var2.method123("Age");
      if (var2.method119("ExitPortal", 10)) {
         this.field5374 = Class8354.method29283(var2.method130("ExitPortal"));
      }

      this.field5375 = var2.method132("ExactTeleport");
   }

   @Override
   public double method3773() {
      return 256.0;
   }

   @Override
   public void method3647() {
      boolean var3 = this.method3872();
      boolean var4 = this.method3873();
      this.field5372++;
      if (!var4) {
         if (!this.field5324.field9020) {
            List var5 = this.field5324.<Entity>method6772(Entity.class, new Class6488(this.method3774()), Class957::method3871);
            if (!var5.isEmpty()) {
               this.method3877((Entity)var5.get(this.field5324.field9016.nextInt(var5.size())));
            }

            if (this.field5372 % 2400L == 0L) {
               this.method3876();
            }
         }
      } else {
         this.field5373--;
      }

      if (var3 != this.method3872() || var4 != this.method3873()) {
         this.method3622();
      }
   }

   public static boolean method3871(Entity var0) {
      return Class8088.field34763.test(var0) && !var0.method3415().method3219();
   }

   public boolean method3872() {
      return this.field5372 < 200L;
   }

   public boolean method3873() {
      return this.field5373 > 0;
   }

   public float method3874(float var1) {
      return Class9679.method37777(((float)this.field5372 + var1) / 200.0F, 0.0F, 1.0F);
   }

   public float method3875(float var1) {
      return 1.0F - Class9679.method37777(((float)this.field5373 - var1) / 40.0F, 0.0F, 1.0F);
   }

   @Nullable
   @Override
   public Class5610 method3776() {
      return new Class5610(this.field5325, 8, this.method3777());
   }

   @Override
   public Class39 method3777() {
      return this.method3646(new Class39());
   }

   public void method3876() {
      if (!this.field5324.field9020) {
         this.field5373 = 40;
         this.field5324.method6787(this.method3774(), this.method3775().method23383(), 1, 0);
         this.method3622();
      }
   }

   @Override
   public boolean method3751(int var1, int var2) {
      if (var1 != 1) {
         return super.method3751(var1, var2);
      } else {
         this.field5373 = 40;
         return true;
      }
   }

   public void method3877(Entity var1) {
      if (this.field5324 instanceof Class1657 && !this.method3873()) {
         this.field5373 = 100;
         if (this.field5374 == null && this.field5324.method6813() == Class1655.field9001) {
            this.method3879((Class1657)this.field5324);
         }

         if (this.field5374 != null) {
            BlockPos var4 = !this.field5375 ? this.method3878() : this.field5374;
            Entity var5;
            if (!(var1 instanceof Class895)) {
               var5 = var1.method3415();
            } else {
               Entity var6 = ((Class895)var1).method3460();
               if (var6 instanceof Class878) {
                  Class9551.field44468.method15169((Class878)var6, this.field5324.method6738(this.method3774()));
               }

               if (var6 == null) {
                  var5 = var1;
               } else {
                  var5 = var6;
                  var1.method2904();
               }
            }

            var5.method3218();
            var5.method3384((double)var4.method8304() + 0.5, (double)var4.getY(), (double)var4.method8306() + 0.5);
         }

         this.method3876();
      }
   }

   private BlockPos method3878() {
      BlockPos var3 = method3880(this.field5324, this.field5374.method8336(0, 2, 0), 5, false);
      field5371.debug("Best exit position for portal at {} is {}", this.field5374, var3);
      return var3.method8311();
   }

   private void method3879(Class1657 var1) {
      Vector3d var4 = new Vector3d((double)this.method3774().method8304(), 0.0, (double)this.method3774().method8306()).method11333();
      Vector3d var5 = var4.method11344(1024.0);

      for (int var6 = 16; method3881(var1, var5).method7065() > 0 && var6-- > 0; var5 = var5.method11338(var4.method11344(-16.0))) {
         field5371.debug("Skipping backwards past nonempty chunk at {}", var5);
      }

      for (int var7 = 16; method3881(var1, var5).method7065() == 0 && var7-- > 0; var5 = var5.method11338(var4.method11344(16.0))) {
         field5371.debug("Skipping forward past empty chunk at {}", var5);
      }

      field5371.debug("Found chunk at {}", var5);
      Class1674 var8 = method3881(var1, var5);
      this.field5374 = method3882(var8);
      if (this.field5374 != null) {
         field5371.debug("Found block at {}", this.field5374);
      } else {
         this.field5374 = new BlockPos(var5.field18048 + 0.5, 75.0, var5.field18050 + 0.5);
         field5371.debug("Failed to find suitable block, settling on {}", this.field5374);
         Class9104.field41637.method26521(var1, var1.method6883().method7370(), new Random(this.field5374.method8332()), this.field5374);
      }

      this.field5374 = method3880(var1, this.field5374, 16, true);
      field5371.debug("Creating portal at {}", this.field5374);
      this.field5374 = this.field5374.method8339(10);
      this.method3883(var1, this.field5374);
      this.method3622();
   }

   private static BlockPos method3880(Class1665 var0, BlockPos var1, int var2, boolean var3) {
      BlockPos var6 = null;

      for (int var7 = -var2; var7 <= var2; var7++) {
         for (int var8 = -var2; var8 <= var2; var8++) {
            if (var7 != 0 || var8 != 0 || var3) {
               for (int var9 = 255; var9 > (var6 != null ? var6.getY() : 0); var9--) {
                  BlockPos var10 = new BlockPos(var1.method8304() + var7, var9, var1.method8306() + var8);
                  Class7380 var11 = var0.method6738(var10);
                  if (var11.method23456(var0, var10) && (var3 || !var11.method23448(Blocks.BEDROCK))) {
                     var6 = var10;
                     break;
                  }
               }
            }
         }
      }

      return var6 != null ? var6 : var1;
   }

   private static Class1674 method3881(Class1655 var0, Vector3d var1) {
      return var0.method6824(Class9679.method37769(var1.field18048 / 16.0), Class9679.method37769(var1.field18050 / 16.0));
   }

   @Nullable
   private static BlockPos method3882(Class1674 var0) {
      Class7481 var3 = var0.method7072();
      BlockPos var4 = new BlockPos(var3.method24356(), 30, var3.method24357());
      int var5 = var0.method7065() + 16 - 1;
      BlockPos var6 = new BlockPos(var3.method24358(), var5, var3.method24359());
      BlockPos var7 = null;
      double var8 = 0.0;

      for (BlockPos var11 : BlockPos.method8359(var4, var6)) {
         Class7380 var12 = var0.method6738(var11);
         BlockPos var13 = var11.method8311();
         BlockPos var14 = var11.method8339(2);
         if (var12.method23448(Blocks.field36651) && !var0.method6738(var13).method23456(var0, var13) && !var0.method6738(var14).method23456(var0, var14)) {
            double var15 = var11.method8320(0.0, 0.0, 0.0, true);
            if (var7 == null || var15 < var8) {
               var7 = var11;
               var8 = var15;
            }
         }
      }

      return var7;
   }

   private void method3883(Class1657 var1, BlockPos var2) {
      Class2898.field17964.method11216(Class4701.method14745(this.method3774(), false)).method26521(var1, var1.method6883().method7370(), new Random(), var2);
   }

   @Override
   public boolean method3870(Direction var1) {
      return Block.method11546(this.method3775(), this.field5324, this.method3774(), var1);
   }

   public int method3884() {
      int var3 = 0;

      for (Direction var7 : Direction.values()) {
         var3 += !this.method3870(var7) ? 0 : 1;
      }

      return var3;
   }

   public void method3885(BlockPos var1, boolean var2) {
      this.field5375 = var2;
      this.field5374 = var1;
   }
}