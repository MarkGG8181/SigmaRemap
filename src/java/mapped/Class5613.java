package mapped;

import java.io.IOException;

public class Class5613 implements Packet<Class5110> {
   private static String[] field24909;
   private int field24910;
   private ResourceLocation field24911;
   private boolean field24912;

   public Class5613() {
   }

   public Class5613(int var1, Class4843<?> var2, boolean var3) {
      this.field24910 = var1;
      this.field24911 = var2.method14964();
      this.field24912 = var3;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24910 = var1.readByte();
      this.field24911 = var1.method35731();
      this.field24912 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24910);
      var1.method35732(this.field24911);
      var1.writeBoolean(this.field24912);
   }

   public void method17180(Class5110 var1) {
      var1.method15617(this);
   }

   public int method17641() {
      return this.field24910;
   }

   public ResourceLocation method17642() {
      return this.field24911;
   }

   public boolean method17643() {
      return this.field24912;
   }
}