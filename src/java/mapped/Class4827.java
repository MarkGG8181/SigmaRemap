package mapped;

import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.Collections;

public class Class4827 implements Class4826 {
   private final Class8848 field22599;

   public Class4827(Class8848 var1) {
      this.field22599 = var1;
   }

   @Override
   public Collection<Class8848> method14917() {
      return Collections.<Class8848>singleton(this.field22599);
   }

   @Override
   public JsonObject method14918() {
      JsonObject var3 = new JsonObject();
      var3.addProperty("item", Class2348.field16075.method9181(this.field22599.method32107()).toString());
      return var3;
   }
}