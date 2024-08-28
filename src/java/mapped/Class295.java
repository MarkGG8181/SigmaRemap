package mapped;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class Class295 extends Class293 {
   private static String[] field1135;
   private CompletableFuture<Class1805> field1150;

   public Class295(Class191 var1, ResourceLocation var2, Executor var3) {
      super(var2);
      this.field1150 = CompletableFuture.<Class1805>supplyAsync(() -> Class1805.method7875(var1, var2), var3);
   }

   @Override
   public Class1805 method1146(Class191 var1) {
      if (this.field1150 == null) {
         return Class1805.method7875(var1, this.field1137);
      } else {
         Class1805 var4 = this.field1150.join();
         this.field1150 = null;
         return var4;
      }
   }

   public CompletableFuture<Void> method1165() {
      return this.field1150 != null ? this.field1150.<Void>thenApply(var0 -> null) : CompletableFuture.<Void>completedFuture((Void)null);
   }

   @Override
   public void method1134(TextureManager var1, Class191 var2, ResourceLocation var3, Executor var4) {
      this.field1150 = CompletableFuture.<Class1805>supplyAsync(() -> Class1805.method7875(var2, this.field1137), Util.method38492());
      this.field1150.thenRunAsync(() -> var1.method1073(this.field1137, this), method1166(var4));
   }

   private static Executor method1166(Executor var0) {
      return var1 -> var0.execute(() -> RenderSystem.method27810(var1::run));
   }
}
