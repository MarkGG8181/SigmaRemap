package remapped;

import java.lang.reflect.Field;
import javax.crypto.Cipher;

public class class_4414 {
   public static void method_20543() {
      try {
         if (Cipher.getMaxAllowedKeyLength("AES") < 256) {
            Field var2 = Class.forName("javax.crypto.JceSecurity").getDeclaredField("isRestricted");
            var2.setAccessible(true);
            var2.set(null, Boolean.FALSE);
         }
      } catch (Exception var3) {
         System.out.println("Could not override JCE cryptography strength policy setting");
         System.out.println(var3.getMessage());
      }
   }
}
