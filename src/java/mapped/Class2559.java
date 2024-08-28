package mapped;

import com.google.gson.*;

import java.lang.reflect.Type;

public class Class2559 implements JsonDeserializer<Class9226>, JsonSerializer<Class9226> {
   public Class9226 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = Class8963.method32781(var1, "version");
      return new Class9226(Class8963.method32763(var6, "name"), Class8963.method32777(var6, "protocol"));
   }

   public JsonElement serialize(Class9226 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var6 = new JsonObject();
      var6.addProperty("name", var1.method34704());
      var6.addProperty("protocol", var1.method34705());
      return var6;
   }
}
