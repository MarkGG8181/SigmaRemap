package mapped;

import javax.annotation.Nullable;

public class Class1075 extends Class1068 {
   private static String[] field5918;

   public Class1075(Class8992<? extends Class1075> var1, Class1655 var2) {
      super(var1, var2);
   }

   public static Class7037 method4998() {
      return method4951().method21849(Class9173.field42105, 15.0).method21849(Class9173.field42108, 0.2F);
   }

   @Override
   public void method4925() {
      this.method3085(Class9173.field42117).method38661(this.method4972());
   }

   @Override
   public Class7809 method3089() {
      return Class7809.field33506;
   }

   @Override
   public Class9455 method4241() {
      super.method4241();
      return Class6067.field27289;
   }

   @Override
   public Class9455 method2880() {
      super.method2880();
      return Class6067.field27290;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      super.method2879(var1);
      return Class6067.field27291;
   }

   @Nullable
   @Override
   public Class1045 method4389(Class1657 var1, Class1045 var2) {
      return Class8992.field41108.method33215(var1);
   }

   @Override
   public Class2274 method4285(PlayerEntity var1, Class79 var2) {
      Class8848 var5 = var1.method3094(var2);
      if (this.method4932()) {
         if (!this.method3005()) {
            if (!var1.method2851()) {
               if (!this.method3329()) {
                  if (!var5.method32105()) {
                     if (var5.method32107() == Class8514.field37886 && !this.method4943()) {
                        this.method4952(var1);
                        return Class2274.method9002(this.field5024.field9020);
                     }

                     Class2274 var6 = var5.method32125(var1, this, var2);
                     if (var6.method9000()) {
                        return var6;
                     }
                  }

                  this.method4920(var1);
                  return Class2274.method9002(this.field5024.field9020);
               } else {
                  return super.method4285(var1, var2);
               }
            } else {
               this.method4952(var1);
               return Class2274.method9002(this.field5024.field9020);
            }
         } else {
            return super.method4285(var1, var2);
         }
      } else {
         return Class2274.field14820;
      }
   }

   @Override
   public void method4929() {
   }
}
