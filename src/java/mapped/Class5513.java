package mapped;

import java.io.IOException;
import javax.annotation.Nullable;

public class Class5513 implements Packet<Class5116> {
   private static String[] field24462;
   private ResourceLocation field24463;

   public Class5513() {
   }

   public Class5513(ResourceLocation var1) {
      this.field24463 = var1;
   }

   public void method17180(Class5116 var1) {
      var1.method15766(this);
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      if (var1.readBoolean()) {
         this.field24463 = var1.method35731();
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeBoolean(this.field24463 != null);
      if (this.field24463 != null) {
         var1.method35732(this.field24463);
      }
   }

   @Nullable
   public ResourceLocation method17335() {
      return this.field24463;
   }
}
