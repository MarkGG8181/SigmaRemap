package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class Class5572 implements Packet<Class5116> {
   private static String[] field24712;
   private Class2338 field24713;
   private List<ResourceLocation> field24714;
   private List<ResourceLocation> field24715;
   private Class9223 field24716;

   public Class5572() {
   }

   public Class5572(Class2338 var1, Collection<ResourceLocation> var2, Collection<ResourceLocation> var3, Class9223 var4) {
      this.field24713 = var1;
      this.field24714 = ImmutableList.copyOf(var2);
      this.field24715 = ImmutableList.copyOf(var3);
      this.field24716 = var4;
   }

   public void method17180(Class5116 var1) {
      var1.method15700(this);
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24713 = var1.<Class2338>method35712(Class2338.class);
      this.field24716 = Class9223.method34690(var1);
      int var4 = var1.method35714();
      this.field24714 = Lists.newArrayList();

      for (int var5 = 0; var5 < var4; var5++) {
         this.field24714.add(var1.method35731());
      }

      if (this.field24713 == Class2338.field15982) {
         var4 = var1.method35714();
         this.field24715 = Lists.newArrayList();

         for (int var7 = 0; var7 < var4; var7++) {
            this.field24715.add(var1.method35731());
         }
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35713(this.field24713);
      this.field24716.method34691(var1);
      var1.writeVarInt(this.field24714.size());

      for (ResourceLocation var5 : this.field24714) {
         var1.method35732(var5);
      }

      if (this.field24713 == Class2338.field15982) {
         var1.writeVarInt(this.field24715.size());

         for (ResourceLocation var7 : this.field24715) {
            var1.method35732(var7);
         }
      }
   }

   public List<ResourceLocation> method17499() {
      return this.field24714;
   }

   public List<ResourceLocation> method17500() {
      return this.field24715;
   }

   public Class9223 method17501() {
      return this.field24716;
   }

   public Class2338 method17502() {
      return this.field24713;
   }
}
