package mapped;

import java.io.IOException;
import java.util.List;

public class Class5614 implements Packet<Class5116> {
   private static String[] field24913;
   private int field24914;
   private List<Class8848> field24915;

   public Class5614() {
   }

   public Class5614(int var1, Class25<Class8848> var2) {
      this.field24914 = var1;
      this.field24915 = Class25.<Class8848>method68(var2.size(), Class8848.field39973);

      for (int var5 = 0; var5 < this.field24915.size(); var5++) {
         this.field24915.set(var5, ((Class8848)var2.get(var5)).method32126());
      }
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24914 = var1.readUnsignedByte();
      short var4 = var1.readShort();
      this.field24915 = Class25.<Class8848>method68(var4, Class8848.field39973);

      for (int var5 = 0; var5 < var4; var5++) {
         this.field24915.set(var5, var1.method35726());
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24914);
      var1.writeShort(this.field24915.size());

      for (Class8848 var5 : this.field24915) {
         var1.method35724(var5);
      }
   }

   public void method17180(Class5116 var1) {
      var1.method15711(this);
   }

   public int method17644() {
      return this.field24914;
   }

   public List<Class8848> method17645() {
      return this.field24915;
   }
}