package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

import java.util.List;
import java.util.function.Predicate;

public class Class1079 extends Class1009 implements Class1080, Class1022 {
   private static final DataParameter<Integer> field5923 = EntityDataManager.<Integer>createKey(Class1079.class, DataSerializers.field33391);
   private static final DataParameter<Integer> field5924 = EntityDataManager.<Integer>createKey(Class1079.class, DataSerializers.field33391);
   private static final DataParameter<Integer> field5925 = EntityDataManager.<Integer>createKey(Class1079.class, DataSerializers.field33391);
   private static final List<DataParameter<Integer>> field5926 = ImmutableList.of(field5923, field5924, field5925);
   private static final DataParameter<Integer> field5927 = EntityDataManager.<Integer>createKey(Class1079.class, DataSerializers.field33391);
   private final float[] field5928 = new float[2];
   private final float[] field5929 = new float[2];
   private final float[] field5930 = new float[2];
   private final float[] field5931 = new float[2];
   private final int[] field5932 = new int[2];
   private final int[] field5933 = new int[2];
   private int field5934;
   private final Class3624 field5935 = (Class3624)new Class3624(this.getDisplayName(), Class2303.field15725, Class2300.field15703).method12281(true);
   private static final Predicate<LivingEntity> field5936 = var0 -> var0.method3089() != Class7809.field33506 && var0.method3170();
   private static final Class8522 field5937 = new Class8522().method30203(20.0).method30209(field5936);

   public Class1079(EntityType<? extends Class1079> var1, World var2) {
      super(var1, var2);
      this.method3043(this.method3075());
      this.method4230().method21674(true);
      this.field5594 = 50;
   }

   @Override
   public void method4219() {
      this.field5600.method20002(0, new Class2733(this));
      this.field5600.method20002(2, new Class2598(this, 1.0, 40, 20.0F));
      this.field5600.method20002(5, new Class2737(this, 1.0));
      this.field5600.method20002(6, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.method20002(7, new Class2668(this));
      this.field5601.method20002(1, new Class2704(this));
      this.field5601.method20002(2, new Class2709<Class1006>(this, Class1006.class, 0, false, false, field5936));
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5923, 0);
      this.dataManager.register(field5924, 0);
      this.dataManager.register(field5925, 0);
      this.dataManager.register(field5927, 0);
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      var1.method102("Invul", this.method5012());
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      this.method5013(var1.method122("Invul"));
      if (this.method3381()) {
         this.field5935.method12284(this.getDisplayName());
      }
   }

   @Override
   public void method3379(ITextComponent var1) {
      super.method3379(var1);
      this.field5935.method12284(this.getDisplayName());
   }

   @Override
   public SoundEvent method4241() {
      return Sounds.field27239;
   }

   @Override
   public SoundEvent method2879(Class8654 var1) {
      return Sounds.field27242;
   }

   @Override
   public SoundEvent method2880() {
      return Sounds.field27241;
   }

   @Override
   public void method2871() {
      Vector3d var3 = this.method3433().method11347(1.0, 0.6, 1.0);
      if (!this.world.isRemote && this.method5014(0) > 0) {
         Entity var4 = this.world.getEntityByID(this.method5014(0));
         if (var4 != null) {
            double var5 = var3.y;
            if (this.getPosY() < var4.getPosY() || !this.method5016() && this.getPosY() < var4.getPosY() + 5.0) {
               var5 = Math.max(0.0, var5);
               var5 += 0.3 - var5 * 0.6F;
            }

            var3 = new Vector3d(var3.x, var5, var3.z);
            Vector3d var7 = new Vector3d(var4.getPosX() - this.getPosX(), 0.0, var4.getPosZ() - this.getPosZ());
            if (method3234(var7) > 9.0) {
               Vector3d var8 = var7.method11333();
               var3 = var3.method11339(var8.x * 0.3 - var3.x * 0.6, 0.0, var8.z * 0.3 - var3.z * 0.6);
            }
         }
      }

      this.method3434(var3);
      if (method3234(var3) > 0.05) {
         this.rotationYaw = (float) MathHelper.method37814(var3.z, var3.x) * (180.0F / (float)Math.PI) - 90.0F;
      }

      super.method2871();

      for (int var33 = 0; var33 < 2; var33++) {
         this.field5931[var33] = this.field5929[var33];
         this.field5930[var33] = this.field5928[var33];
      }

      for (int var34 = 0; var34 < 2; var34++) {
         int var9 = this.method5014(var34 + 1);
         Entity var10 = null;
         if (var9 > 0) {
            var10 = this.world.getEntityByID(var9);
         }

         if (var10 == null) {
            this.field5929[var34] = this.method5007(this.field5929[var34], this.field4965, 10.0F);
         } else {
            double var11 = this.method5004(var34 + 1);
            double var13 = this.method5005(var34 + 1);
            double var15 = this.method5006(var34 + 1);
            double var17 = var10.getPosX() - var11;
            double var19 = var10.method3442() - var13;
            double var21 = var10.getPosZ() - var15;
            double var23 = (double) MathHelper.method37766(var17 * var17 + var21 * var21);
            float var25 = (float)(MathHelper.method37814(var21, var17) * 180.0F / (float)Math.PI) - 90.0F;
            float var26 = (float)(-(MathHelper.method37814(var19, var23) * 180.0F / (float)Math.PI));
            this.field5928[var34] = this.method5007(this.field5928[var34], var26, 40.0F);
            this.field5929[var34] = this.method5007(this.field5929[var34], var25, 10.0F);
         }
      }

      boolean var35 = this.method5016();

      for (int var37 = 0; var37 < 3; var37++) {
         double var27 = this.method5004(var37);
         double var29 = this.method5005(var37);
         double var31 = this.method5006(var37);
         this.world
            .method6746(
               ParticleTypes.field34092,
               var27 + this.rand.nextGaussian() * 0.3F,
               var29 + this.rand.nextGaussian() * 0.3F,
               var31 + this.rand.nextGaussian() * 0.3F,
               0.0,
               0.0,
               0.0
            );
         if (var35 && this.world.rand.nextInt(4) == 0) {
            this.world
               .method6746(
                  ParticleTypes.field34068,
                  var27 + this.rand.nextGaussian() * 0.3F,
                  var29 + this.rand.nextGaussian() * 0.3F,
                  var31 + this.rand.nextGaussian() * 0.3F,
                  0.7F,
                  0.7F,
                  0.5
               );
         }
      }

      if (this.method5012() > 0) {
         for (int var38 = 0; var38 < 3; var38++) {
            this.world
               .method6746(
                  ParticleTypes.field34068,
                  this.getPosX() + this.rand.nextGaussian(),
                  this.getPosY() + (double)(this.rand.nextFloat() * 3.3F),
                  this.getPosZ() + this.rand.nextGaussian(),
                  0.7F,
                  0.7F,
                  0.9F
               );
         }
      }
   }

   @Override
   public void method4258() {
      if (this.method5012() <= 0) {
         super.method4258();

         for (int var3 = 1; var3 < 3; var3++) {
            if (this.ticksExisted >= this.field5932[var3 - 1]) {
               this.field5932[var3 - 1] = this.ticksExisted + 10 + this.rand.nextInt(10);
               if (this.world.method6997() == Difficulty.field14353 || this.world.method6997() == Difficulty.field14354) {
                  int var4 = var3 - 1;
                  int var5 = this.field5933[var3 - 1];
                  this.field5933[var4] = this.field5933[var3 - 1] + 1;
                  if (var5 > 15) {
                     float var6 = 10.0F;
                     float var7 = 5.0F;
                     double var8 = MathHelper.method37784(this.rand, this.getPosX() - 10.0, this.getPosX() + 10.0);
                     double var10 = MathHelper.method37784(this.rand, this.getPosY() - 5.0, this.getPosY() + 5.0);
                     double var12 = MathHelper.method37784(this.rand, this.getPosZ() - 10.0, this.getPosZ() + 10.0);
                     this.method5009(var3 + 1, var8, var10, var12, true);
                     this.field5933[var3 - 1] = 0;
                  }
               }

               int var23 = this.method5014(var3);
               if (var23 <= 0) {
                  List var27 = this.world.<LivingEntity>method7195(LivingEntity.class, field5937, this, this.getBoundingBox().method19663(20.0, 8.0, 20.0));

                  for (int var29 = 0; var29 < 10 && !var27.isEmpty(); var29++) {
                     LivingEntity var31 = (LivingEntity)var27.get(this.rand.nextInt(var27.size()));
                     if (var31 != this && var31.isAlive() && this.method3135(var31)) {
                        if (!(var31 instanceof PlayerEntity)) {
                           this.method5015(var3, var31.getEntityId());
                        } else if (!((PlayerEntity)var31).abilities.disableDamage) {
                           this.method5015(var3, var31.getEntityId());
                        }
                        break;
                     }

                     var27.remove(var31);
                  }
               } else {
                  Entity var26 = this.world.getEntityByID(var23);
                  if (var26 == null || !var26.isAlive() || this.getDistanceSq(var26) > 900.0 || !this.method3135(var26)) {
                     this.method5015(var3, 0);
                  } else if (var26 instanceof PlayerEntity && ((PlayerEntity)var26).abilities.disableDamage) {
                     this.method5015(var3, 0);
                  } else {
                     this.method5008(var3 + 1, (LivingEntity)var26);
                     this.field5932[var3 - 1] = this.ticksExisted + 40 + this.rand.nextInt(20);
                     this.field5933[var3 - 1] = 0;
                  }
               }
            }
         }

         if (this.method4232() == null) {
            this.method5015(0, 0);
         } else {
            this.method5015(0, this.method4232().getEntityId());
         }

         if (this.field5934 > 0) {
            this.field5934--;
            if (this.field5934 == 0 && this.world.method6789().method17135(Class5462.field24224)) {
               int var21 = MathHelper.floor(this.getPosY());
               int var24 = MathHelper.floor(this.getPosX());
               int var28 = MathHelper.floor(this.getPosZ());
               boolean var30 = false;

               for (int var32 = -1; var32 <= 1; var32++) {
                  for (int var14 = -1; var14 <= 1; var14++) {
                     for (int var15 = 0; var15 <= 3; var15++) {
                        int var16 = var24 + var32;
                        int var17 = var21 + var15;
                        int var18 = var28 + var14;
                        BlockPos var19 = new BlockPos(var16, var17, var18);
                        BlockState var20 = this.world.getBlockState(var19);
                        if (method5002(var20)) {
                           var30 = this.world.method7180(var19, true, this) || var30;
                        }
                     }
                  }
               }

               if (var30) {
                  this.world.method6869((PlayerEntity)null, 1022, this.getPosition(), 0);
               }
            }
         }

         if (this.ticksExisted % 20 == 0) {
            this.method3041(1.0F);
         }

         this.field5935.method12278(this.getHealth() / this.method3075());
      } else {
         int var22 = this.method5012() - 1;
         if (var22 <= 0) {
            Class2141 var25 = !this.world.method6789().method17135(Class5462.field24224) ? Class2141.field14014 : Class2141.field14016;
            this.world.method6756(this, this.getPosX(), this.method3442(), this.getPosZ(), 7.0F, false, var25);
            if (!this.method3245()) {
               this.world.method6801(1023, this.getPosition(), 0);
            }
         }

         this.method5013(var22);
         if (this.ticksExisted % 10 == 0) {
            this.method3041(10.0F);
         }
      }
   }

   public static boolean method5002(BlockState var0) {
      return !var0.isAir() && !BlockTags.field32792.method24917(var0.getBlock());
   }

   public void method5003() {
      this.method5013(220);
      this.method3043(this.method3075() / 3.0F);
   }

   @Override
   public void method2928(BlockState var1, Vector3d var2) {
   }

   @Override
   public void method3400(ServerPlayerEntity var1) {
      super.method3400(var1);
      this.field5935.method12263(var1);
   }

   @Override
   public void method3401(ServerPlayerEntity var1) {
      super.method3401(var1);
      this.field5935.method12265(var1);
   }

   private double method5004(int var1) {
      if (var1 > 0) {
         float var4 = (this.field4965 + (float)(180 * (var1 - 1))) * (float) (Math.PI / 180.0);
         float var5 = MathHelper.cos(var4);
         return this.getPosX() + (double)var5 * 1.3;
      } else {
         return this.getPosX();
      }
   }

   private double method5005(int var1) {
      return var1 > 0 ? this.getPosY() + 2.2 : this.getPosY() + 3.0;
   }

   private double method5006(int var1) {
      if (var1 > 0) {
         float var4 = (this.field4965 + (float)(180 * (var1 - 1))) * (float) (Math.PI / 180.0);
         float var5 = MathHelper.sin(var4);
         return this.getPosZ() + (double)var5 * 1.3;
      } else {
         return this.getPosZ();
      }
   }

   private float method5007(float var1, float var2, float var3) {
      float var6 = MathHelper.method37792(var2 - var1);
      if (var6 > var3) {
         var6 = var3;
      }

      if (var6 < -var3) {
         var6 = -var3;
      }

      return var1 + var6;
   }

   private void method5008(int var1, LivingEntity var2) {
      this.method5009(
         var1, var2.getPosX(), var2.getPosY() + (double)var2.method3393() * 0.5, var2.getPosZ(), var1 == 0 && this.rand.nextFloat() < 0.001F
      );
   }

   private void method5009(int var1, double var2, double var4, double var6, boolean var8) {
      if (!this.method3245()) {
         this.world.method6869((PlayerEntity)null, 1024, this.getPosition(), 0);
      }

      double var11 = this.method5004(var1);
      double var13 = this.method5005(var1);
      double var15 = this.method5006(var1);
      double var17 = var2 - var11;
      double var19 = var4 - var13;
      double var21 = var6 - var15;
      Class902 var23 = new Class902(this.world, this, var17, var19, var21);
      var23.setShooter(this);
      if (var8) {
         var23.method3533(true);
      }

      var23.method3446(var11, var13, var15);
      this.world.method6916(var23);
   }

   @Override
   public void method4530(LivingEntity var1, float var2) {
      this.method5008(0, var1);
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (this.method2760(var1)) {
         return false;
      } else if (var1 == Class8654.field38999 || var1.method31109() instanceof Class1079) {
         return false;
      } else if (this.method5012() > 0 && var1 != Class8654.field39004) {
         return false;
      } else {
         if (this.method5016()) {
            Entity var5 = var1.method31113();
            if (var5 instanceof AbstractArrowEntity) {
               return false;
            }
         }

         Entity var7 = var1.method31109();
         if (var7 != null && !(var7 instanceof PlayerEntity) && var7 instanceof LivingEntity && ((LivingEntity)var7).method3089() == this.method3089()) {
            return false;
         } else {
            if (this.field5934 <= 0) {
               this.field5934 = 20;
            }

            for (int var6 = 0; var6 < this.field5933.length; var6++) {
               this.field5933[var6] = this.field5933[var6] + 3;
            }

            return super.method2741(var1, var2);
         }
      }
   }

   @Override
   public void method3054(Class8654 var1, int var2, boolean var3) {
      super.method3054(var1, var2, var3);
      ItemEntity var6 = this.method3300(Items.field38066);
      if (var6 != null) {
         var6.method4136();
      }
   }

   @Override
   public void method3447() {
      if (this.world.method6997() == Difficulty.field14351 && this.method4256()) {
         this.method2904();
      } else {
         this.field4973 = 0;
      }
   }

   @Override
   public boolean method2921(float var1, float var2) {
      return false;
   }

   @Override
   public boolean method3035(Class2023 var1) {
      return false;
   }

   public static Class7037 method2997() {
      return Class1009.method4343()
         .method21849(Attributes.field42105, 300.0)
         .method21849(Attributes.MOVEMENT_SPEED, 0.6F)
         .method21849(Attributes.field42106, 40.0)
         .method21849(Attributes.field42113, 4.0);
   }

   public float method5010(int var1) {
      return this.field5929[var1];
   }

   public float method5011(int var1) {
      return this.field5928[var1];
   }

   public int method5012() {
      return this.dataManager.<Integer>method35445(field5927);
   }

   public void method5013(int var1) {
      this.dataManager.method35446(field5927, var1);
   }

   public int method5014(int var1) {
      return this.dataManager.<Integer>method35445(field5926.get(var1));
   }

   public void method5015(int var1, int var2) {
      this.dataManager.method35446(field5926.get(var1), var2);
   }

   @Override
   public boolean method5016() {
      return this.getHealth() <= this.method3075() / 2.0F;
   }

   @Override
   public Class7809 method3089() {
      return Class7809.field33506;
   }

   @Override
   public boolean method3313(Entity var1) {
      return false;
   }

   @Override
   public boolean method3367() {
      return false;
   }

   @Override
   public boolean method3036(Class2023 var1) {
      return var1.method8627() != Effects.WITHER ? super.method3036(var1) : false;
   }
}
