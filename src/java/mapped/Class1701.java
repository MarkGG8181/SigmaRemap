package mapped;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class Class1701 implements AutoCloseable {
   private static String[] field9262;
   private static final CompletableFuture<Class2341> field9263 = CompletableFuture.<Class2341>completedFuture(Class2341.field16010);
   private final Class192 field9264 = new Class193(Class1946.field12611);
   private final Class6099 field9265;
   private final Class282 field9266 = new Class282();
   private final Class286 field9267 = new Class286();
   private final Class283 field9268 = new Class283();
   private final Class284 field9269 = new Class284(this.field9268);
   private final Class285 field9270 = new Class285(this.field9268);
   private final Class301 field9271;

   public Class1701(Class2085 var1, int var2) {
      this.field9265 = new Class6099(var1);
      this.field9271 = new Class301(var2, this.field9265.method18842());
      this.field9264.method587(this.field9267);
      this.field9264.method587(this.field9268);
      this.field9264.method587(this.field9266);
      this.field9264.method587(this.field9269);
      this.field9264.method587(this.field9271);
      this.field9264.method587(this.field9270);
   }

   public Class301 method7330() {
      return this.field9271;
   }

   public Class283 method7331() {
      return this.field9268;
   }

   public Class284 method7332() {
      return this.field9269;
   }

   public Class8933 method7333() {
      return this.field9267.method1068();
   }

   public Class282 method7334() {
      return this.field9266;
   }

   public Class6099 method7335() {
      return this.field9265;
   }

   public Class285 method7336() {
      return this.field9270;
   }

   public Class191 method7337() {
      return this.field9264;
   }

   public static CompletableFuture<Class1701> method7338(List<Class303> var0, Class2085 var1, int var2, Executor var3, Executor var4) {
      Class1701 var7 = new Class1701(var1, var2);
      CompletableFuture var8 = var7.field9264.method585(var3, var4, var0, field9263);
      return var8.whenComplete((var1x, var2x) -> {
         if (var2x != null) {
            var7.close();
         }
      }).<Class1701>thenApply(var1x -> var7);
   }

   public void method7339() {
      this.field9267.method1068().method32661();
   }

   @Override
   public void close() {
      this.field9264.close();
   }
}