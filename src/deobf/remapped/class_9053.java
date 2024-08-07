package remapped;

public class class_9053 extends class_2550 {
   public int field_46360 = 1;

   public class_9053(EntityType<? extends class_9053> var1, World var2) {
      super(var1, var2);
   }

   public class_9053(World var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(EntityType.field_34216, var2, var4, var6, var8, var10, var12, var1);
   }

   public class_9053(World var1, LivingEntity var2, double var3, double var5, double var7) {
      super(EntityType.field_34216, var2, var3, var5, var7, var1);
   }

   @Override
   public void method_26160(class_7474 var1) {
      super.method_26160(var1);
      if (!this.world.field_33055) {
         boolean var4 = this.world.getGameRules().getBoolean(GameRules.MOB_GRIEFING);
         this.world
            .method_29574(
               (Entity)null,
               this.getPosX(),
               this.method_37309(),
               this.getPosZ(),
               (float)this.field_46360,
               var4,
               !var4 ? class_7298.field_37310 : class_7298.field_37311
            );
         this.method_37204();
      }
   }

   @Override
   public void method_26163(class_5631 var1) {
      super.method_26163(var1);
      if (!this.world.field_33055) {
         Entity var4 = var1.method_25524();
         Entity var5 = this.method_26166();
         var4.attackEntityFrom(DamageSource.method_28375(this, var5), 6.0F);
         if (var5 instanceof LivingEntity) {
            this.method_37096((LivingEntity)var5, var4);
         }
      }
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("ExplosionPower", this.field_46360);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      if (var1.contains("ExplosionPower", 99)) {
         this.field_46360 = var1.method_25947("ExplosionPower");
      }
   }
}
