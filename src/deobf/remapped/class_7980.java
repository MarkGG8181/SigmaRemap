package remapped;

public class class_7980 extends NearestAttackableTargetGoal<PlayerEntity> {
   private static String[] field_40870;

   public class_7980(class_6092 var1, class_6092 var2) {
      super(var2, PlayerEntity.class, true);
      this.field_40869 = var1;
   }

   @Override
   public boolean method_16795() {
      return this.field_40869.field_41768.method_43370() != class_423.field_1790 ? super.method_16795() : false;
   }

   @Override
   public Box method_19212(double var1) {
      Direction var5 = ((class_6092)this.field_4915).method_27914();
      if (var5.method_1029() != class_9249.field_47215) {
         return var5.method_1029() != class_9249.field_47219
            ? this.field_4915.getBoundingBox().method_18899(var1, 4.0, var1)
            : this.field_4915.getBoundingBox().method_18899(var1, var1, 4.0);
      } else {
         return this.field_4915.getBoundingBox().method_18899(4.0, var1, var1);
      }
   }
}
