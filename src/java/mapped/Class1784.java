package mapped;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Class1784 implements Class1783 {
   @Override
   public void close() throws IOException {
   }

   @Override
   public ResourceLocation method7762() {
      return null;
   }

   @Override
   public InputStream method7763() {
      String var3 = "{\"targets\":[\"jelloswap\",\"jello\"],\"passes\":[{\"name\":\"blur\",\"intarget\":\"minecraft:main\",\"outtarget\":\"jelloswap\",\"uniforms\":[{\"name\":\"BlurDir\",\"values\":[1,0]},{\"name\":\"Radius\",\"values\":[20]}]},{\"name\":\"blur\",\"intarget\":\"jelloswap\",\"outtarget\":\"jello\",\"uniforms\":[{\"name\":\"BlurDir\",\"values\":[0,1]},{\"name\":\"Radius\",\"values\":[20]}]}]}";
      return new ByteArrayInputStream(var3.getBytes());
   }

   @Override
   public <T> T method7764(Class7170<T> var1) {
      return null;
   }

   @Override
   public String method7765() {
      return null;
   }
}
