package mapped;

import java.io.IOException;
import java.util.UUID;
import javax.annotation.Nullable;

public class Class5497 implements Packet<Class5110> {
   private static String[] field24399;
   private UUID field24400;

   public Class5497() {
   }

   public Class5497(UUID var1) {
      this.field24400 = var1;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24400 = var1.method35717();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35716(this.field24400);
   }

   public void method17180(Class5110 var1) {
      var1.method15632(this);
   }

   @Nullable
   public Entity method17283(Class1657 var1) {
      return var1.method6942(this.field24400);
   }
}