package mapped;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import net.minecraft.util.text.ITextComponent;

public class Class3624 extends Class3625 {
   private static String[] field19629;
   private final Set<Class878> field19630 = Sets.newHashSet();
   private final Set<Class878> field19631 = Collections.<Class878>unmodifiableSet(this.field19630);
   private boolean field19632 = true;

   public Class3624(ITextComponent var1, Class2303 var2, Class2300 var3) {
      super(Class9679.method37812(), var1, var2, var3);
   }

   @Override
   public void method12278(float var1) {
      if (var1 != this.field19635) {
         super.method12278(var1);
         this.method12285(Class2151.field14066);
      }
   }

   @Override
   public void method12279(Class2303 var1) {
      if (var1 != this.field19636) {
         super.method12279(var1);
         this.method12285(Class2151.field14068);
      }
   }

   @Override
   public void method12280(Class2300 var1) {
      if (var1 != this.field19637) {
         super.method12280(var1);
         this.method12285(Class2151.field14068);
      }
   }

   @Override
   public Class3625 method12281(boolean var1) {
      if (var1 != this.field19638) {
         super.method12281(var1);
         this.method12285(Class2151.field14069);
      }

      return this;
   }

   @Override
   public Class3625 method12282(boolean var1) {
      if (var1 != this.field19639) {
         super.method12282(var1);
         this.method12285(Class2151.field14069);
      }

      return this;
   }

   @Override
   public Class3625 method12283(boolean var1) {
      if (var1 != this.field19640) {
         super.method12283(var1);
         this.method12285(Class2151.field14069);
      }

      return this;
   }

   @Override
   public void method12284(ITextComponent var1) {
      if (!Objects.equal(var1, this.field19634)) {
         super.method12284(var1);
         this.method12285(Class2151.field14067);
      }
   }

   private void method12285(Class2151 var1) {
      if (this.field19632) {
         Class5472 var4 = new Class5472(var1, this);

         for (Class878 var6 : this.field19630) {
            var6.field4855.method15671(var4);
         }
      }
   }

   public void method12263(Class878 var1) {
      if (this.field19630.add(var1) && this.field19632) {
         var1.field4855.method15671(new Class5472(Class2151.field14064, this));
      }
   }

   public void method12265(Class878 var1) {
      if (this.field19630.remove(var1) && this.field19632) {
         var1.field4855.method15671(new Class5472(Class2151.field14065, this));
      }
   }

   public void method12266() {
      if (!this.field19630.isEmpty()) {
         for (Class878 var4 : Lists.newArrayList(this.field19630)) {
            this.method12265(var4);
         }
      }
   }

   public boolean method12286() {
      return this.field19632;
   }

   public void method12287(boolean var1) {
      if (var1 != this.field19632) {
         this.field19632 = var1;

         for (Class878 var5 : this.field19630) {
            var5.field4855.method15671(new Class5472(!var1 ? Class2151.field14065 : Class2151.field14064, this));
         }
      }
   }

   public Collection<Class878> method12288() {
      return this.field19631;
   }
}