package mapped;

import com.google.common.base.Preconditions;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Class5989 {
   private static final Int2ObjectMap<Class5989> field26127 = new Int2ObjectOpenHashMap();
   public static final List<Class5989> field26128 = new ArrayList<Class5989>();
   public static final Class5989 field26129 = method18564(47, "1.8.x");
   public static final Class5989 field26130 = method18564(107, "1.9");
   public static final Class5989 field26131 = method18564(108, "1.9.1");
   public static final Class5989 field26132 = method18564(109, "1.9.2");
   public static final Class5989 field26133 = method18566(110, "1.9.3/4", new Class8664("1.9", 3, 4));
   public static final Class5989 field26134 = method18564(210, "1.10.x");
   public static final Class5989 field26135 = method18564(315, "1.11");
   public static final Class5989 field26136 = method18566(316, "1.11.1/2", new Class8664("1.11", 1, 2));
   public static final Class5989 field26137 = method18564(335, "1.12");
   public static final Class5989 field26138 = method18564(338, "1.12.1");
   public static final Class5989 field26139 = method18564(340, "1.12.2");
   public static final Class5989 field26140 = method18564(393, "1.13");
   public static final Class5989 field26141 = method18564(401, "1.13.1");
   public static final Class5989 field26142 = method18564(404, "1.13.2");
   public static final Class5989 field26143 = method18564(477, "1.14");
   public static final Class5989 field26144 = method18564(480, "1.14.1");
   public static final Class5989 field26145 = method18564(485, "1.14.2");
   public static final Class5989 field26146 = method18564(490, "1.14.3");
   public static final Class5989 field26147 = method18564(498, "1.14.4");
   public static final Class5989 field26148 = method18564(573, "1.15");
   public static final Class5989 field26149 = method18564(575, "1.15.1");
   public static final Class5989 field26150 = method18564(578, "1.15.2");
   public static final Class5989 field26151 = method18564(735, "1.16");
   public static final Class5989 field26152 = method18564(736, "1.16.1");
   public static final Class5989 field26153 = method18564(751, "1.16.2");
   public static final Class5989 field26154 = method18564(753, "1.16.3");
   public static final Class5989 field26155 = method18564(754, "1.16.4");
   public static final Class5989 field26156 = method18564(-1, "UNKNOWN");
   private final int field26157;
   private final int field26158;
   private final String field26159;
   private final boolean field26160;
   private final Set<String> field26161;

   public static Class5989 method18564(int var0, String var1) {
      return method18565(var0, -1, var1);
   }

   public static Class5989 method18565(int var0, int var1, String var2) {
      return method18567(var0, var1, var2, null);
   }

   public static Class5989 method18566(int var0, String var1, Class8664 var2) {
      return method18567(var0, -1, var1, var2);
   }

   public static Class5989 method18567(int var0, int var1, String var2, Class8664 var3) {
      Class5989 var6 = new Class5989(var0, var1, var2, var3);
      field26128.add(var6);
      field26127.put(var6.method18573(), var6);
      if (var6.method18581()) {
         field26127.put(var6.method18575(), var6);
      }

      return var6;
   }

   public static boolean method18568(int var0) {
      return field26127.containsKey(var0);
   }

   @NotNull
   public static Class5989 method18569(int var0) {
      Class5989 var3 = (Class5989)field26127.get(var0);
      return var3 == null ? new Class5989(var0, "Unknown (" + var0 + ")") : var3;
   }

   public static int method18570(Class5989 var0) {
      return field26128.indexOf(var0);
   }

   public static List<Class5989> method18571() {
      return Collections.<Class5989>unmodifiableList(new ArrayList(field26127.values()));
   }

   @Nullable
   public static Class5989 method18572(String var0) {
      ObjectIterator var3 = field26127.values().iterator();

      while (var3.hasNext()) {
         Class5989 var4 = (Class5989)var3.next();
         String var5 = var4.method18580();
         if (var5.equals(var0)) {
            return var4;
         }

         if (!var4.method18579()) {
            if (var4.method18577() && var4.method18578().contains(var0)) {
               return var4;
            }
         } else {
            String var6 = var5.substring(0, var5.length() - 2);
            if (var6.equals(var0) || var0.startsWith(var5.substring(0, var5.length() - 1))) {
               return var4;
            }
         }
      }

      return null;
   }

   public Class5989(int var1, String var2) {
      this(var1, -1, var2, null);
   }

   public Class5989(int var1, int var2, String var3, Class8664 var4) {
      this.field26157 = var1;
      this.field26158 = var2;
      this.field26159 = var3;
      this.field26160 = var3.endsWith(".x");
      Preconditions.checkArgument(!this.field26160 || var4 == null, "A version cannot be a wildcard and a range at the same time!");
      if (var4 == null) {
         this.field26161 = Collections.<String>singleton(var3);
      } else {
         this.field26161 = new HashSet<String>();

         for (int var7 = var4.method31198(); var7 <= var4.method31199(); var7++) {
            if (var7 == 0) {
               this.field26161.add(var4.method31197());
            }

            this.field26161.add(var4.method31197() + "." + var7);
         }
      }
   }

   public int method18573() {
      return this.field26157;
   }

   public int method18574() {
      Preconditions.checkArgument(this.method18581());
      return this.field26158;
   }

   public int method18575() {
      Preconditions.checkArgument(this.method18581());
      return 1073741824 | this.field26158;
   }

   public int method18576() {
      return this.field26158 != -1 ? 1073741824 | this.field26158 : this.field26157;
   }

   public boolean method18577() {
      return this.field26161.size() != 1;
   }

   public Set<String> method18578() {
      return Collections.<String>unmodifiableSet(this.field26161);
   }

   public boolean method18579() {
      return this.field26160;
   }

   public String method18580() {
      return this.field26159;
   }

   public boolean method18581() {
      return this.field26158 != -1;
   }

   @Deprecated
   public int method18582() {
      return this.field26157;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class5989 var4 = (Class5989)var1;
            return this.field26157 == var4.field26157;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return this.field26157;
   }

   @Override
   public String toString() {
      return String.format("%s(%d)", this.field26159, this.field26157);
   }
}
