package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.util.timer.Timer;

import java.util.ArrayList;
import java.util.List;

public class Class4304 extends Class4305 implements Class4347 {
   private static String[] field20875;
   public boolean field20876;
   public boolean field20877;
   public int field20878;
   public int field20879;
   public int field20880;
   public int field20881;
   public boolean field20882 = true;
   public boolean field20883 = false;
   public boolean field20884 = true;
   public boolean field20885 = true;
   public boolean field20886 = false;
   public final Timer field20887 = new Timer();
   public int field20888 = 300;
   public int field20889 = 2;
   private final List<Class6751> field20890 = new ArrayList<Class6751>();

   public Class4304(Class4305 var1, String var2, int var3, int var4, int var5, int var6, boolean var7) {
      super(var1, var2, var3, var4, var5, var6);
      this.field20876 = var7;
   }

   public Class4304(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Class6387 var7, boolean var8) {
      super(var1, var2, var3, var4, var5, var6, var7);
      this.field20876 = var8;
   }

   public Class4304(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Class6387 var7, String var8, boolean var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8);
      this.field20876 = var9;
   }

   public Class4304(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Class6387 var7, String var8, ClientResource var9, boolean var10) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      this.field20876 = var10;
   }

   @Override
   public boolean method13212() {
      return this.field20909 && !this.method13216();
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      if (this.method13214()) {
         if (!this.field20909 && !this.field20877) {
            this.field20880 = this.method13267() / 2;
            this.field20881 = this.method13269() / 2;
         }

         this.method13213(var1, var2);
      }
   }

   @Override
   public boolean method13078(int var1, int var2, int var3) {
      if (!super.method13078(var1, var2, var3)) {
         if (this.method13214()) {
            this.field20887.method27118();
            this.field20878 = var1;
            this.field20879 = var2;
            this.field20880 = this.field20878 - this.method13271();
            this.field20881 = this.field20879 - this.method13272();
         }

         return false;
      } else {
         return true;
      }
   }

   @Override
   public void method13095(int var1, int var2, int var3) {
      super.method13095(var1, var2, var3);
      if (this.method13214()) {
         this.field20887.method27119();
         this.field20887.method27120();
      }

      this.method13217(false);
   }

   @Override
   public void method13213(int var1, int var2) {
      boolean var5 = this.field20877;
      if (!this.method13216() && this.method13214()) {
         boolean var6 = this.field20884 && this.field20887.method27121() >= (long)this.field20888;
         boolean var7 = this.field20885
            && this.field20909
            && (Math.abs(this.field20878 - var1) > this.field20889 || Math.abs(this.field20879 - var2) > this.field20889);
         boolean var8 = this.field20886 && this.field20909;
         if (var6 || var7 || var8) {
            this.method13217(true);
         }
      } else if (this.method13216()) {
         this.method13264(var1 - this.field20880 - (this.field20892 == null ? 0 : this.field20892.method13271()));
         this.method13266(var2 - this.field20881 - (this.field20892 == null ? 0 : this.field20892.method13272()));
         if (this.field20882) {
            if (this.field20892 == null) {
               if (this.method13263() < 0) {
                  this.method13264(0);
               }

               if (this.method13263() + this.method13267() > Minecraft.getInstance().field1283.method8043()) {
                  this.method13264(Minecraft.getInstance().field1283.method8043() - this.method13267());
               }

               if (this.method13265() < 0) {
                  this.method13266(0);
               }

               if (this.method13265() + this.method13269() > Minecraft.getInstance().field1283.method8044()) {
                  this.method13266(Minecraft.getInstance().field1283.method8044() - this.method13269());
               }
            } else {
               if (this.method13263() < 0) {
                  this.method13264(0);
               }

               if (this.method13263() + this.method13267() > this.field20892.method13267()) {
                  this.method13264(this.field20892.method13267() - this.method13267());
               }

               if (this.method13265() < 0) {
                  this.method13266(0);
               }

               if (this.method13265() + this.method13269() > this.field20892.method13269() && !this.field20883) {
                  this.method13266(this.field20892.method13269() - this.method13269());
               }
            }
         }
      }

      if (this.method13216() && !var5) {
         this.field20887.method27119();
         this.field20887.method27120();
      }
   }

   @Override
   public boolean method13214() {
      return this.field20876;
   }

   @Override
   public void method13215(boolean var1) {
      this.field20876 = var1;
   }

   @Override
   public boolean method13216() {
      return this.field20877;
   }

   @Override
   public void method13217(boolean var1) {
      this.field20877 = var1;
      if (var1) {
         this.method13215(true);
         this.method13219();
      }
   }

   public Class4304 method13218(Class6751 var1) {
      this.field20890.add(var1);
      return this;
   }

   public void method13219() {
      for (Class6751 var4 : this.field20890) {
         var4.method20580(this);
      }
   }
}