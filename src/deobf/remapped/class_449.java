package remapped;

import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class class_449 extends class_1829 {
   private static final class_7821<BlockPos> field_1870 = class_8073.<BlockPos>method_36641(class_449.class, class_2734.field_13353);
   private static final class_7821<Boolean> field_1871 = class_8073.<Boolean>method_36641(class_449.class, class_2734.field_13347);
   private static final class_7821<Integer> field_1869 = class_8073.<Integer>method_36641(class_449.class, class_2734.field_13366);
   private static final class_4931 field_1873 = new class_4931().method_22607(10.0).method_22601().method_22603().method_22602();
   public static final Predicate<class_91> field_1874 = var0 -> !var0.method_258() && var0.isAlive() && var0.method_37285();

   public class_449(EntityType<? extends class_449> var1, World var2) {
      super(var1, var2);
      this.field_29900 = new class_4469(this);
      this.field_29919 = new class_4323(this, 10);
      this.method_26871(true);
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      this.method_37192(this.method_37099());
      this.rotationPitch = 0.0F;
      return super.method_26864(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean method_26509() {
      return false;
   }

   @Override
   public void method_8085(int var1) {
   }

   public void method_2155(BlockPos var1) {
      this.field_41735.method_36633(field_1870, var1);
   }

   public BlockPos method_2163() {
      return this.field_41735.<BlockPos>method_36640(field_1870);
   }

   public boolean method_2161() {
      return this.field_41735.<Boolean>method_36640(field_1871);
   }

   public void method_2153(boolean var1) {
      this.field_41735.method_36633(field_1871, var1);
   }

   public int method_2159() {
      return this.field_41735.<Integer>method_36640(field_1869);
   }

   public void method_2157(int var1) {
      this.field_41735.method_36633(field_1869, var1);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_1870, BlockPos.field_7306);
      this.field_41735.method_36634(field_1871, false);
      this.field_41735.method_36634(field_1869, 2400);
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      var1.method_25931("TreasurePosX", this.method_2163().method_12173());
      var1.method_25931("TreasurePosY", this.method_2163().method_12165());
      var1.method_25931("TreasurePosZ", this.method_2163().method_12185());
      var1.putBoolean("GotFish", this.method_2161());
      var1.method_25931("Moistness", this.method_2159());
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      int var4 = var1.method_25947("TreasurePosX");
      int var5 = var1.method_25947("TreasurePosY");
      int var6 = var1.method_25947("TreasurePosZ");
      this.method_2155(new BlockPos(var4, var5, var6));
      super.method_37314(var1);
      this.method_2153(var1.getBoolean("GotFish"));
      this.method_2157(var1.method_25947("Moistness"));
   }

   @Override
   public void registerGoals() {
      this.goalSelector.addGoal(0, new class_7261(this));
      this.goalSelector.addGoal(0, new class_5506(this));
      this.goalSelector.addGoal(1, new class_8333(this));
      this.goalSelector.addGoal(2, new class_8214(this, 4.0));
      this.goalSelector.addGoal(4, new class_6585(this, 1.0, 10));
      this.goalSelector.addGoal(4, new class_9691(this));
      this.goalSelector.addGoal(5, new class_4407(this, PlayerEntity.class, 6.0F));
      this.goalSelector.addGoal(5, new class_5131(this, 10));
      this.goalSelector.addGoal(6, new class_9037(this, 1.2F, true));
      this.goalSelector.addGoal(8, new class_7878(this, null));
      this.goalSelector.addGoal(8, new class_5302(this));
      this.goalSelector.addGoal(9, new class_6837<class_337>(this, class_337.class, 8.0F, 1.0, 1.0));
      this.targetSelector.addGoal(1, new HurtByTargetGoal(this, class_337.class).setCallsForHelp());
   }

   public static class_1313 method_2164() {
      return class_5886.method_26846()
         .method_5984(class_7331.field_37468, 10.0)
         .method_5984(class_7331.field_37465, 1.2F)
         .method_5984(class_7331.field_37462, 3.0);
   }

   @Override
   public class_1249 method_26933(World var1) {
      return new class_9811(this, var1);
   }

   @Override
   public boolean method_26442(Entity var1) {
      boolean var4 = var1.attackEntityFrom(DamageSource.method_28345(this), (float)((int)this.method_26575(class_7331.field_37462)));
      if (var4) {
         this.method_37096(this, var1);
         this.method_37155(class_463.field_2613, 1.0F, 1.0F);
      }

      return var4;
   }

   @Override
   public int method_37099() {
      return 4800;
   }

   @Override
   public int method_26501(int var1) {
      return this.method_37099();
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return 0.3F;
   }

   @Override
   public int method_26862() {
      return 1;
   }

   @Override
   public int method_26903() {
      return 1;
   }

   @Override
   public boolean method_37158(Entity var1) {
      return true;
   }

   @Override
   public boolean method_26612(ItemStack var1) {
      class_6943 var4 = class_5886.method_26896(var1);
      return !this.method_26520(var4).method_28022() ? false : var4 == class_6943.field_35707 && super.method_26612(var1);
   }

   @Override
   public void method_26902(class_91 var1) {
      if (this.method_26520(class_6943.field_35707).method_28022()) {
         ItemStack var4 = var1.method_264();
         if (this.method_26899(var4)) {
            this.method_26562(var1);
            this.method_37349(class_6943.field_35707, var4);
            this.field_29923[class_6943.field_35707.method_31767()] = 2.0F;
            this.method_26467(var1, var4.method_27997());
            var1.method_37204();
         }
      }
   }

   @Override
   public void method_37123() {
      super.method_37123();
      if (!this.method_26859()) {
         if (!this.method_37110()) {
            this.method_2157(this.method_2159() - 1);
            if (this.method_2159() <= 0) {
               this.attackEntityFrom(DamageSource.field_31688, 1.0F);
            }

            if (this.onGround) {
               this.method_37215(
                  this.method_37098()
                     .method_6214(
                        (double)((this.field_41717.nextFloat() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.field_41717.nextFloat() * 2.0F - 1.0F) * 0.2F)
                     )
               );
               this.rotationYaw = this.field_41717.nextFloat() * 360.0F;
               this.onGround = false;
               this.field_41763 = true;
            }
         } else {
            this.method_2157(2400);
         }

         if (this.world.field_33055 && this.method_37285() && this.method_37098().method_6221() > 0.03) {
            class_1343 var3 = this.method_37307(0.0F);
            float var4 = class_9299.method_42840(this.rotationYaw * (float) (Math.PI / 180.0)) * 0.3F;
            float var5 = class_9299.method_42818(this.rotationYaw * (float) (Math.PI / 180.0)) * 0.3F;
            float var6 = 1.2F - this.field_41717.nextFloat() * 0.7F;

            for (int var7 = 0; var7 < 2; var7++) {
               this.world
                  .method_43361(
                     class_3090.field_15378,
                     this.getPosX() - var3.field_7336 * (double)var6 + (double)var4,
                     this.method_37309() - var3.field_7333,
                     this.getPosZ() - var3.field_7334 * (double)var6 + (double)var5,
                     0.0,
                     0.0,
                     0.0
                  );
               this.world
                  .method_43361(
                     class_3090.field_15378,
                     this.getPosX() - var3.field_7336 * (double)var6 - (double)var4,
                     this.method_37309() - var3.field_7333,
                     this.getPosZ() - var3.field_7334 * (double)var6 - (double)var5,
                     0.0,
                     0.0,
                     0.0
                  );
            }
         }
      } else {
         this.method_37192(this.method_37099());
      }
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 != 38) {
         super.method_37336(var1);
      } else {
         this.method_2165(class_3090.field_15361);
      }
   }

   private void method_2165(class_5079 var1) {
      for (int var4 = 0; var4 < 7; var4++) {
         double var5 = this.field_41717.nextGaussian() * 0.01;
         double var7 = this.field_41717.nextGaussian() * 0.01;
         double var9 = this.field_41717.nextGaussian() * 0.01;
         this.world.method_43361(var1, this.method_37361(1.0), this.method_37255() + 0.2, this.method_37383(1.0), var5, var7, var9);
      }
   }

   @Override
   public class_6910 method_26857(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.method_26617(var2);
      if (!var5.method_28022() && var5.method_27960().method_11250(class_391.field_1613)) {
         if (!this.world.field_33055) {
            this.method_37155(class_463.field_2435, 1.0F, 1.0F);
         }

         this.method_2153(true);
         if (!var1.playerAbilities.isCreativeMode) {
            var5.method_27970(1);
         }

         return class_6910.method_31659(this.world.field_33055);
      } else {
         return super.method_26857(var1, var2);
      }
   }

   public static boolean method_2156(EntityType<class_449> var0, class_9379 var1, class_2417 var2, BlockPos var3, Random var4) {
      if (var3.method_12165() > 45 && var3.method_12165() < var1.method_22552()) {
         Optional var7 = var1.method_2754(var3);
         return (
               !Objects.equals(var7, Optional.<class_5621<class_6325>>of(class_8606.field_44104))
                  || !Objects.equals(var7, Optional.<class_5621<class_6325>>of(class_8606.field_44084))
            )
            && var1.method_28258(var3).method_22007(class_6503.field_33094);
      } else {
         return false;
      }
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2253;
   }

   @Nullable
   @Override
   public class_8461 method_26599() {
      return class_463.field_2723;
   }

   @Nullable
   @Override
   public class_8461 method_26918() {
      return !this.method_37285() ? class_463.field_2394 : class_463.field_2617;
   }

   @Override
   public class_8461 method_37133() {
      return class_463.field_2154;
   }

   @Override
   public class_8461 method_37239() {
      return class_463.field_2399;
   }

   public boolean method_2162() {
      BlockPos var3 = this.method_26927().method_5603();
      return var3 == null ? false : var3.method_12170(this.method_37245(), 12.0);
   }

   @Override
   public void method_26431(class_1343 var1) {
      if (this.method_26530() && this.method_37285()) {
         this.method_37092(this.method_26423(), var1);
         this.method_37226(class_7412.field_37839, this.method_37098());
         this.method_37215(this.method_37098().method_6209(0.9));
         if (this.method_17809() == null) {
            this.method_37215(this.method_37098().method_6214(0.0, -0.005, 0.0));
         }
      } else {
         super.method_26431(var1);
      }
   }

   @Override
   public boolean method_26887(PlayerEntity var1) {
      return true;
   }
}
