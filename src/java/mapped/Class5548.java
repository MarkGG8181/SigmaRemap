package mapped;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.io.IOException;
import java.util.Map;

public class Class5548 implements Packet<Class5116> {
   private static String[] field24639;
   private Object2IntMap<Class9007<?>> field24640;

   public Class5548() {
   }

   public Class5548(Object2IntMap<Class9007<?>> var1) {
      this.field24640 = var1;
   }

   public void method17180(Class5116 var1) {
      var1.method15699(this);
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      int var4 = var1.method35714();
      this.field24640 = new Object2IntOpenHashMap(var4);

      for (int var5 = 0; var5 < var4; var5++) {
         this.method17457(Class2348.field16088.method9172(var1.method35714()), var1);
      }
   }

   private <T> void method17457(Class49<T> var1, PacketBuffer var2) {
      int var5 = var2.method35714();
      int var6 = var2.method35714();
      this.field24640.put(var1.method172(var1.method171().method9172(var5)), var6);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24640.size());
      ObjectIterator var4 = this.field24640.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         Class9007 var6 = (Class9007)var5.getKey();
         var1.writeVarInt(Class2348.field16088.method9171(var6.method33275()));
         var1.writeVarInt(this.method17458(var6));
         var1.writeVarInt(var5.getIntValue());
      }
   }

   private <T> int method17458(Class9007<T> var1) {
      return var1.method33275().method171().method9171(var1.method33276());
   }

   public Map<Class9007<?>, Integer> method17459() {
      return this.field24640;
   }
}
