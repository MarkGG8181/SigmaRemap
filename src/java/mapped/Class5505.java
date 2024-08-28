package mapped;

import java.io.IOException;
import javax.annotation.Nullable;

public class Class5505 implements Packet<Class5110> {
   private static String[] field24438;
   private int field24439;
   private Class1968 field24440;
   private Vector3d field24441;
   private Class79 field24442;
   private boolean field24443;

   public Class5505() {
   }

   public Class5505(Entity var1, boolean var2) {
      this.field24439 = var1.method3205();
      this.field24440 = Class1968.field12833;
      this.field24443 = var2;
   }

   public Class5505(Entity var1, Class79 var2, boolean var3) {
      this.field24439 = var1.method3205();
      this.field24440 = Class1968.field12832;
      this.field24442 = var2;
      this.field24443 = var3;
   }

   public Class5505(Entity var1, Class79 var2, Vector3d var3, boolean var4) {
      this.field24439 = var1.method3205();
      this.field24440 = Class1968.field12834;
      this.field24442 = var2;
      this.field24441 = var3;
      this.field24443 = var4;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24439 = var1.method35714();
      this.field24440 = var1.<Class1968>method35712(Class1968.class);
      if (this.field24440 == Class1968.field12834) {
         this.field24441 = new Vector3d((double)var1.readFloat(), (double)var1.readFloat(), (double)var1.readFloat());
      }

      if (this.field24440 == Class1968.field12832 || this.field24440 == Class1968.field12834) {
         this.field24442 = var1.<Class79>method35712(Class79.class);
      }

      this.field24443 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24439);
      var1.method35713(this.field24440);
      if (this.field24440 == Class1968.field12834) {
         var1.writeFloat((float)this.field24441.field18048);
         var1.writeFloat((float)this.field24441.field18049);
         var1.writeFloat((float)this.field24441.field18050);
      }

      if (this.field24440 == Class1968.field12832 || this.field24440 == Class1968.field12834) {
         var1.method35713(this.field24442);
      }

      var1.writeBoolean(this.field24443);
   }

   public void method17180(Class5110 var1) {
      var1.method15620(this);
   }

   @Nullable
   public Entity method17315(Class1655 var1) {
      return var1.method6774(this.field24439);
   }

   public Class1968 method17316() {
      return this.field24440;
   }

   @Nullable
   public Class79 method17317() {
      return this.field24442;
   }

   public Vector3d method17318() {
      return this.field24441;
   }

   public boolean method17319() {
      return this.field24443;
   }
}