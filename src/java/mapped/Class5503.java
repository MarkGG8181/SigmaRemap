package mapped;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.io.IOException;
import java.util.List;
import net.minecraft.util.text.ITextComponent;

public class Class5503 implements Packet<Class5116> {
   private Class2176 field24429;
   public List<Class8790> field24430 = Lists.newArrayList();

   public Class5503() {
   }

   public Class5503(Class2176 var1, Class878... var2) {
      this.field24429 = var1;

      for (Class878 var8 : var2) {
         this.field24430.add(new Class8790(var8.method2906(), var8.field4891, var8.field4857.method33863(), var8.method2819()));
      }
   }

   public Class5503(Class2176 var1, Iterable<Class878> var2) {
      this.field24429 = var1;

      for (Class878 var6 : var2) {
         this.field24430.add(new Class8790(var6.method2906(), var6.field4891, var6.field4857.method33863(), var6.method2819()));
      }
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24429 = var1.<Class2176>method35712(Class2176.class);
      int var4 = var1.method35714();

      for (int var5 = 0; var5 < var4; var5++) {
         GameProfile var6 = null;
         int var7 = 0;
         Class1894 var8 = null;
         ITextComponent var9 = null;
         switch (Class9002.field41159[this.field24429.ordinal()]) {
            case 1:
               var6 = new GameProfile(var1.method35717(), var1.method35728(16));
               int var10 = var1.method35714();
               int var11 = 0;

               for (; var11 < var10; var11++) {
                  String var12 = var1.method35728(32767);
                  String var13 = var1.method35728(32767);
                  if (var1.readBoolean()) {
                     var6.getProperties().put(var12, new Property(var12, var13, var1.method35728(32767)));
                  } else {
                     var6.getProperties().put(var12, new Property(var12, var13));
                  }
               }

               var8 = Class1894.method8159(var1.method35714());
               var7 = var1.method35714();
               if (var1.readBoolean()) {
                  var9 = var1.method35710();
               }
               break;
            case 2:
               var6 = new GameProfile(var1.method35717(), (String)null);
               var8 = Class1894.method8159(var1.method35714());
               break;
            case 3:
               var6 = new GameProfile(var1.method35717(), (String)null);
               var7 = var1.method35714();
               break;
            case 4:
               var6 = new GameProfile(var1.method35717(), (String)null);
               if (var1.readBoolean()) {
                  var9 = var1.method35710();
               }
               break;
            case 5:
               var6 = new GameProfile(var1.method35717(), (String)null);
         }

         this.field24430.add(new Class8790(var6, var7, var8, var9));
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35713(this.field24429);
      var1.writeVarInt(this.field24430.size());

      for (Class8790 var5 : this.field24430) {
         switch (Class9002.field41159[this.field24429.ordinal()]) {
            case 1:
               var1.method35716(var5.method31726().getId());
               var1.method35729(var5.method31726().getName());
               var1.writeVarInt(var5.method31726().getProperties().size());

               for (Property var7 : var5.method31726().getProperties().values()) {
                  var1.method35729(var7.getName());
                  var1.method35729(var7.getValue());
                  if (var7.hasSignature()) {
                     var1.writeBoolean(true);
                     var1.method35729(var7.getSignature());
                  } else {
                     var1.writeBoolean(false);
                  }
               }

               var1.writeVarInt(var5.method31728().method8152());
               var1.writeVarInt(var5.method31727());
               if (var5.method31729() == null) {
                  var1.writeBoolean(false);
               } else {
                  var1.writeBoolean(true);
                  var1.method35711(var5.method31729());
               }
               break;
            case 2:
               var1.method35716(var5.method31726().getId());
               var1.writeVarInt(var5.method31728().method8152());
               break;
            case 3:
               var1.method35716(var5.method31726().getId());
               var1.writeVarInt(var5.method31727());
               break;
            case 4:
               var1.method35716(var5.method31726().getId());
               if (var5.method31729() == null) {
                  var1.writeBoolean(false);
               } else {
                  var1.writeBoolean(true);
                  var1.method35711(var5.method31729());
               }
               break;
            case 5:
               var1.method35716(var5.method31726().getId());
         }
      }
   }

   public void method17180(Class5116 var1) {
      var1.method15731(this);
   }

   public List<Class8790> method17307() {
      return this.field24430;
   }

   public Class2176 method17308() {
      return this.field24429;
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("action", this.field24429).add("entries", this.field24430).toString();
   }
}