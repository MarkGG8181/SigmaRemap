package mapped;

import com.mentalfrostbyte.jello.unmapped.Class8402;
import io.socket.emitter.Emitter;

public class Class5767 implements Emitter.Listener {
   private static String[] field25223;
   public final Class8402 field25224;

   public Class5767(Class8402 var1) {
      this.field25224 = var1;
   }

   @Override
   public void call(Object... var1) {
      JSONObject var4 = (JSONObject)var1[0];
      System.out.println(var4);
   }
}