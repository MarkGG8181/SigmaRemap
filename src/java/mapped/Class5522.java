package mapped;

import java.io.IOException;

public class Class5522 implements Packet<Class5110> {
   private static String[] field24495;
   public String field24496;

   public Class5522() {
   }

   public Class5522(String var1) {
      if (var1.length() > 256) {
         var1 = var1.substring(0, 256);
      }

      this.field24496 = var1;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24496 = var1.method35728(256);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35729(this.field24496);
   }

   public void method17180(Class5110 var1) {
      var1.method15611(this);
   }

   public String method17359() {
      return this.field24496;
   }
}
