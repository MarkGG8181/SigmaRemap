package mapped;

import java.util.function.Supplier;

public class Class8112<T> {
   private static String[] field34867;
   private Supplier<T> field34868;
   private T field34869;

   public Class8112(Supplier<T> var1) {
      this.field34868 = var1;
   }

   public T method28097() {
      Supplier var3 = this.field34868;
      if (var3 != null) {
         this.field34869 = (T)var3.get();
         this.field34868 = null;
      }

      return this.field34869;
   }
}
