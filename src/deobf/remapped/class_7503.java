package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Supplier;

public class class_7503 implements Supplier<JsonElement> {
   private final Identifier field_38307;

   public class_7503(Identifier var1) {
      this.field_38307 = var1;
   }

   public JsonElement get() {
      JsonObject var3 = new JsonObject();
      var3.addProperty("parent", this.field_38307.toString());
      return var3;
   }
}
