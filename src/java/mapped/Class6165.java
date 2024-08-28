package mapped;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public final class Class6165 {
   public final Class7284 field27580;
   public final Class7004 field27581;
   public final SocketFactory field27582;
   public final Class8110 field27583;
   public final List<Class2201> field27584;
   public final List<Class8574> field27585;
   public final ProxySelector field27586;
   public final Proxy field27587;
   public final SSLSocketFactory field27588;
   public final HostnameVerifier field27589;
   public final Class8388 field27590;

   public Class6165(
      String var1,
      int var2,
      Class7004 var3,
      SocketFactory var4,
      SSLSocketFactory var5,
      HostnameVerifier var6,
      Class8388 var7,
      Class8110 var8,
      Proxy var9,
      List<Class2201> var10,
      List<Class8574> var11,
      ProxySelector var12
   ) {
      this.field27580 = new Class7477().method24232(var5 == null ? "http" : "https").method24237(var1).method24238(var2).method24261();
      if (var3 != null) {
         this.field27581 = var3;
         if (var4 != null) {
            this.field27582 = var4;
            if (var8 != null) {
               this.field27583 = var8;
               if (var10 != null) {
                  this.field27584 = Class9474.<Class2201>method36540(var10);
                  if (var11 != null) {
                     this.field27585 = Class9474.<Class8574>method36540(var11);
                     if (var12 != null) {
                        this.field27586 = var12;
                        this.field27587 = var9;
                        this.field27588 = var5;
                        this.field27589 = var6;
                        this.field27590 = var7;
                     } else {
                        throw new NullPointerException("proxySelector == null");
                     }
                  } else {
                     throw new NullPointerException("connectionSpecs == null");
                  }
               } else {
                  throw new NullPointerException("protocols == null");
               }
            } else {
               throw new NullPointerException("proxyAuthenticator == null");
            }
         } else {
            throw new NullPointerException("socketFactory == null");
         }
      } else {
         throw new NullPointerException("dns == null");
      }
   }

   public Class7284 method19049() {
      return this.field27580;
   }

   public Class7004 method19050() {
      return this.field27581;
   }

   public SocketFactory method19051() {
      return this.field27582;
   }

   public Class8110 method19052() {
      return this.field27583;
   }

   public List<Class2201> method19053() {
      return this.field27584;
   }

   public List<Class8574> method19054() {
      return this.field27585;
   }

   public ProxySelector method19055() {
      return this.field27586;
   }

   @Nullable
   public Proxy method19056() {
      return this.field27587;
   }

   @Nullable
   public SSLSocketFactory method19057() {
      return this.field27588;
   }

   @Nullable
   public HostnameVerifier method19058() {
      return this.field27589;
   }

   @Nullable
   public Class8388 method19059() {
      return this.field27590;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof Class6165 && this.field27580.equals(((Class6165)var1).field27580) && this.method19060((Class6165)var1);
   }

   @Override
   public int hashCode() {
      int var3 = 17;
      var3 = 31 * var3 + this.field27580.hashCode();
      var3 = 31 * var3 + this.field27581.hashCode();
      var3 = 31 * var3 + this.field27583.hashCode();
      var3 = 31 * var3 + this.field27584.hashCode();
      var3 = 31 * var3 + this.field27585.hashCode();
      var3 = 31 * var3 + this.field27586.hashCode();
      var3 = 31 * var3 + (this.field27587 == null ? 0 : this.field27587.hashCode());
      var3 = 31 * var3 + (this.field27588 == null ? 0 : this.field27588.hashCode());
      var3 = 31 * var3 + (this.field27589 == null ? 0 : this.field27589.hashCode());
      return 31 * var3 + (this.field27590 == null ? 0 : this.field27590.hashCode());
   }

   public boolean method19060(Class6165 var1) {
      return this.field27581.equals(var1.field27581)
         && this.field27583.equals(var1.field27583)
         && this.field27584.equals(var1.field27584)
         && this.field27585.equals(var1.field27585)
         && this.field27586.equals(var1.field27586)
         && Class9474.method36534(this.field27587, var1.field27587)
         && Class9474.method36534(this.field27588, var1.field27588)
         && Class9474.method36534(this.field27589, var1.field27589)
         && Class9474.method36534(this.field27590, var1.field27590)
         && this.method19049().method22943() == var1.method19049().method22943();
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder().append("Address{").append(this.field27580.method22942()).append(":").append(this.field27580.method22943());
      if (this.field27587 == null) {
         var3.append(", proxySelector=").append(this.field27586);
      } else {
         var3.append(", proxy=").append(this.field27587);
      }

      var3.append("}");
      return var3.toString();
   }
}
