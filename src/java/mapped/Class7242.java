package mapped;

import java.util.concurrent.Executor;

public class Class7242 implements Class7243 {
   private final Class7243 field31094;
   private final Class322<Runnable> field31095;

   public Class7242(Class7243 var1, Executor var2) {
      this.field31094 = var1;
      this.field31095 = Class322.method1650(var2, "progressListener");
   }

   @Override
   public void method22736(Class7481 var1) {
      this.field31095.method1641(() -> this.field31094.method22736(var1));
   }

   @Override
   public void method22737(Class7481 var1, Class9176 var2) {
      this.field31095.method1641(() -> this.field31094.method22737(var1, var2));
   }

   @Override
   public void method22738() {
      this.field31095.method1641(this.field31094::method22738);
   }
}
