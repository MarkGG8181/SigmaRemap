package mapped;

import java.io.IOException;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class Class5565 implements Packet<Class5116> {
   private static String[] field24692;
   public Class1900 field24693;
   public int field24694;
   public int field24695;
   public int field24696;
   public ITextComponent field24697;

   public Class5565() {
   }

   public Class5565(Class8039 var1, Class1900 var2) {
      this(var1, var2, StringTextComponent.EMPTY);
   }

   public Class5565(Class8039 var1, Class1900 var2, ITextComponent var3) {
      this.field24693 = var2;
      Class880 var6 = var1.method27601();
      switch (Class6746.field29450[var2.ordinal()]) {
         case 1:
            this.field24696 = var1.method27604();
            this.field24695 = var6 == null ? -1 : var6.method3205();
            break;
         case 2:
            this.field24694 = var1.method27607().method3205();
            this.field24695 = var6 == null ? -1 : var6.method3205();
            this.field24697 = var3;
      }
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24693 = var1.<Class1900>method35712(Class1900.class);
      if (this.field24693 != Class1900.field11156) {
         if (this.field24693 == Class1900.field11157) {
            this.field24694 = var1.method35714();
            this.field24695 = var1.readInt();
            this.field24697 = var1.method35710();
         }
      } else {
         this.field24696 = var1.method35714();
         this.field24695 = var1.readInt();
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35713(this.field24693);
      if (this.field24693 != Class1900.field11156) {
         if (this.field24693 == Class1900.field11157) {
            var1.writeVarInt(this.field24694);
            var1.writeInt(this.field24695);
            var1.method35711(this.field24697);
         }
      } else {
         var1.writeVarInt(this.field24696);
         var1.writeInt(this.field24695);
      }
   }

   public void method17180(Class5116 var1) {
      var1.method15755(this);
   }

   @Override
   public boolean method17181() {
      return this.field24693 == Class1900.field11157;
   }
}
