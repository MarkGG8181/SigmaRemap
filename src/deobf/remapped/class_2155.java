package remapped;

public class class_2155 extends class_2509 {
   private static String[] field_10767;

   public class_2155(class_317 var1) {
      super(EntityType.field_34319, var1);
   }

   @Override
   public boolean method_11437(PlayerEntity var1, Direction var2, ItemStack var3, BlockPos var4) {
      return !World.method_29556(var4) && var1.method_3208(var4, var2, var3);
   }
}
