package mapped;

import it.unimi.dsi.fastutil.longs.LongSet;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import org.apache.commons.lang3.ArrayUtils;

import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Class42 extends Class27<Class35> {
   public static final Class7052<Class42> field91 = new Class7061();
   private long[] field92;

   public Class42(long[] var1) {
      this.field92 = var1;
   }

   public Class42(LongSet var1) {
      this.field92 = var1.toLongArray();
   }

   public Class42(List<Long> var1) {
      this(toArray(var1));
   }

   private static long[] toArray(List<Long> var0) {
      long[] var3 = new long[var0.size()];

      for (int var4 = 0; var4 < var0.size(); var4++) {
         Long var5 = (Long)var0.get(var4);
         var3[var4] = var5 != null ? var5 : 0L;
      }

      return var3;
   }

   @Override
   public void method73(DataOutput var1) throws IOException {
      var1.writeInt(this.field92.length);

      for (long var7 : this.field92) {
         var1.writeLong(var7);
      }
   }

   @Override
   public byte method74() {
      return 12;
   }

   @Override
   public Class7052<Class42> method75() {
      return field91;
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder("[L;");

      for (int var4 = 0; var4 < this.field92.length; var4++) {
         if (var4 != 0) {
            var3.append(',');
         }

         var3.append(this.field92[var4]).append('L');
      }

      return var3.append(']').toString();
   }

   public Class42 method79() {
      long[] var3 = new long[this.field92.length];
      System.arraycopy(this.field92, 0, var3, 0, this.field92.length);
      return new Class42(var3);
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof Class42 && Arrays.equals(this.field92, ((Class42)var1).field92);
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.field92);
   }

   @Override
   public ITextComponent method78(String var1, int var2) {
      IFormattableTextComponent var5 = new StringTextComponent("L").mergeStyle(field59);
      IFormattableTextComponent var6 = new StringTextComponent("[").append(var5).appendString(";");

      for (int var7 = 0; var7 < this.field92.length; var7++) {
         IFormattableTextComponent var8 = new StringTextComponent(String.valueOf(this.field92[var7])).mergeStyle(field58);
         var6.appendString(" ").append(var8).append(var5);
         if (var7 != this.field92.length - 1) {
            var6.appendString(",");
         }
      }

      var6.appendString("]");
      return var6;
   }

   public long[] method162() {
      return this.field92;
   }

   @Override
   public int size() {
      return this.field92.length;
   }

   public Class35 get(int var1) {
      return Class35.method94(this.field92[var1]);
   }

   public Class35 set(int var1, Class35 var2) {
      long var5 = this.field92[var1];
      this.field92[var1] = var2.method83();
      return Class35.method94(var5);
   }

   public void add(int var1, Class35 var2) {
      this.field92 = ArrayUtils.add(this.field92, var1, var2.method83());
   }

   @Override
   public boolean method70(int var1, Class30 var2) {
      if (!(var2 instanceof Class31)) {
         return false;
      } else {
         this.field92[var1] = ((Class31)var2).method83();
         return true;
      }
   }

   @Override
   public boolean method71(int var1, Class30 var2) {
      if (!(var2 instanceof Class31)) {
         return false;
      } else {
         this.field92 = ArrayUtils.add(this.field92, var1, ((Class31)var2).method83());
         return true;
      }
   }

   public Class35 remove(int var1) {
      long var4 = this.field92[var1];
      this.field92 = ArrayUtils.remove(this.field92, var1);
      return Class35.method94(var4);
   }

   @Override
   public byte method72() {
      return 4;
   }

   @Override
   public void clear() {
      this.field92 = new long[0];
   }
}