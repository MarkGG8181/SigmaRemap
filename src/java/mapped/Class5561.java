package mapped;

import java.io.IOException;

public class Class5561 implements Packet<Class5110> {
   private static String[] field24675;
   private String field24676;
   private int field24677;
   private Class2153 field24678;
   private boolean field24679;
   private int field24680;
   private Class2205 field24681;

   public Class5561() {
   }

   public Class5561(String var1, int var2, Class2153 var3, boolean var4, int var5, Class2205 var6) {
      this.field24676 = var1;
      this.field24677 = var2;
      this.field24678 = var3;
      this.field24679 = var4;
      this.field24680 = var5;
      this.field24681 = var6;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24676 = var1.method35728(16);
      this.field24677 = var1.readByte();
      this.field24678 = var1.<Class2153>method35712(Class2153.class);
      this.field24679 = var1.readBoolean();
      this.field24680 = var1.readUnsignedByte();
      this.field24681 = var1.<Class2205>method35712(Class2205.class);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35729(this.field24676);
      var1.writeByte(this.field24677);
      var1.method35713(this.field24678);
      var1.writeBoolean(this.field24679);
      var1.writeByte(this.field24680);
      var1.method35713(this.field24681);
   }

   public void method17180(Class5110 var1) {
      var1.method15613(this);
   }

   public Class2153 method17481() {
      return this.field24678;
   }

   public boolean method17482() {
      return this.field24679;
   }

   public int method17483() {
      return this.field24680;
   }

   public Class2205 method17484() {
      return this.field24681;
   }
}