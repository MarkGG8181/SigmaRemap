package mapped;

import java.io.IOException;

public class Class5539 implements Packet<Class5110> {
   private static String[] field24592;
   private int field24593;

   public Class5539() {
   }

   public Class5539(int var1) {
      this.field24593 = var1;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24593 = var1.readShort();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeShort(this.field24593);
   }

   public void method17180(Class5110 var1) {
      var1.method15627(this);
   }

   public int method17416() {
      return this.field24593;
   }
}
