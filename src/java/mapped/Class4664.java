package mapped;

import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public interface Class4664 {
   void method14632(JsonObject var1);

   default JsonObject method14637() {
      JsonObject var3 = new JsonObject();
      var3.addProperty("type", Class2348.field16086.method9181(this.method14633()).toString());
      this.method14632(var3);
      return var3;
   }

   ResourceLocation method14634();

   Class6504<?> method14633();

   @Nullable
   JsonObject method14635();

   @Nullable
   ResourceLocation method14636();
}