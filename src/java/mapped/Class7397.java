package mapped;

public class Class7397 extends Class7395 {
   private static String[] field31656;
   public final Class1110 field31661;

   public Class7397(Class1110 var1, MobEntity var2) {
      super(var2);
      this.field31661 = var1;
   }

   @Override
   public void method23626() {
      this.field31661.rotationYawHead = this.field31661.renderYawOffset;
      this.field31661.renderYawOffset = this.field31661.rotationYaw;
   }
}
