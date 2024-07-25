package remapped;

import com.google.common.collect.Lists;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nonnull;
import org.apache.commons.lang3.Validate;

public class class_2831<E> extends AbstractList<E> {
   private static String[] field_13873;
   private final List<E> field_13871;
   private final E field_13872;

   public static <E> class_2831<E> method_12874() {
      return new class_2831<E>();
   }

   public static <E> class_2831<E> method_12872(int var0, E var1) {
      Validate.notNull(var1);
      Object[] var4 = new Object[var0];
      Arrays.fill(var4, var1);
      return new class_2831<E>(Arrays.<E>asList((E[])var4), (E)var1);
   }

   @SafeVarargs
   public static <E> class_2831<E> method_12871(E var0, E... var1) {
      return new class_2831<E>(Arrays.<E>asList((E[])var1), (E)var0);
   }

   public class_2831() {
      this(Lists.newArrayList(), null);
   }

   public class_2831(List<E> var1, E var2) {
      this.field_13871 = var1;
      this.field_13872 = (E)var2;
   }

   @Nonnull
   @Override
   public E get(int var1) {
      return this.field_13871.get(var1);
   }

   @Override
   public E set(int var1, E var2) {
      Validate.notNull(var2);
      return this.field_13871.set(var1, (E)var2);
   }

   @Override
   public void add(int var1, E var2) {
      Validate.notNull(var2);
      this.field_13871.add(var1, (E)var2);
   }

   @Override
   public E remove(int var1) {
      return this.field_13871.remove(var1);
   }

   @Override
   public int size() {
      return this.field_13871.size();
   }

   @Override
   public void clear() {
      if (this.field_13872 != null) {
         for (int var3 = 0; var3 < this.size(); var3++) {
            this.set(var3, this.field_13872);
         }
      } else {
         super.clear();
      }
   }
}
