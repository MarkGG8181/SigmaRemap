package mapped;

import java.util.Spliterators.AbstractSpliterator;
import java.util.function.Consumer;

public final class Class8182 extends AbstractSpliterator<Class7481> {
   private static String[] field35195;
   private Class7481 field35196;
   public final Class7481 field35197;
   public final Class7481 field35198;
   public final int field35199;
   public final int field35200;

   public Class8182(long var1, int var3, Class7481 var4, Class7481 var5, int var6, int var7) {
      super(var1, var3);
      this.field35197 = var4;
      this.field35198 = var5;
      this.field35199 = var6;
      this.field35200 = var7;
   }

   @Override
   public boolean tryAdvance(Consumer<? super Class7481> var1) {
      if (this.field35196 != null) {
         int var4 = this.field35196.field32174;
         int var5 = this.field35196.field32175;
         if (var4 != this.field35198.field32174) {
            this.field35196 = new Class7481(var4 + this.field35200, var5);
         } else {
            if (var5 == this.field35198.field32175) {
               return false;
            }

            this.field35196 = new Class7481(this.field35197.field32174, var5 + this.field35199);
         }
      } else {
         this.field35196 = this.field35197;
      }

      var1.accept(this.field35196);
      return true;
   }
}