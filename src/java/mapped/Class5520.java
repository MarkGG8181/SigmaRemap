package mapped;

import java.io.IOException;

public class Class5520 implements Packet<Class5116> {
   private static String[] field24487;
   private int field24488;
   private double field24489;
   private double field24490;
   private double field24491;
   private int field24492;

   public Class5520() {
   }

   public Class5520(ExperienceOrbEntity var1) {
      this.field24488 = var1.method3205();
      this.field24489 = var1.getPosX();
      this.field24490 = var1.getPosY();
      this.field24491 = var1.getPosZ();
      this.field24492 = var1.method4177();
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24488 = var1.method35714();
      this.field24489 = var1.readDouble();
      this.field24490 = var1.readDouble();
      this.field24491 = var1.readDouble();
      this.field24492 = var1.readShort();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24488);
      var1.writeDouble(this.field24489);
      var1.writeDouble(this.field24490);
      var1.writeDouble(this.field24491);
      var1.writeShort(this.field24492);
   }

   public void method17180(Class5116 var1) {
      var1.method15693(this);
   }

   public int method17353() {
      return this.field24488;
   }

   public double method17354() {
      return this.field24489;
   }

   public double method17355() {
      return this.field24490;
   }

   public double method17356() {
      return this.field24491;
   }

   public int method17357() {
      return this.field24492;
   }
}
