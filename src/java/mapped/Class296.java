package mapped;

import java.io.IOException;
import java.io.InputStream;

public class Class296 extends Class293 {
   private static String[] field1151;

   public Class296() {
      super(Class1272.method6019());
   }

   public Class1805 method1173(Class191 var1) {
      Minecraft var4 = Minecraft.getInstance();
      Class306 var5 = var4.method1539().method25146();

      try (InputStream var6 = var5.method1223(Class1946.field12610, Class1272.method6019())) {
         return new Class1805((Class9620)null, Class1806.method7879(var6));
      } catch (IOException var21) {
         return new Class1805(var21);
      }
   }
}