package mapped;

import com.mentalfrostbyte.jello.unmapped.CombatTracker;
import io.socket.emitter.Emitter;
import totalcross.json.JSONObject;

public class Class5777 implements Emitter.Listener {
   public final CombatTracker field25249;

   public Class5777(CombatTracker var1) {
      this.field25249 = var1;
   }

   @Override
   public void call(Object... var1) {
      JSONObject var4 = (JSONObject)var1[0];
      if (var4.has("messageId")) {
         JSONObject var5 = new JSONObject();
         var5.put("messageId", var4.getString("messageId"));
         this.field25249.field36057.emit("message-received", var5);
         this.field25249.field36058.method32651(var4.getString("senderId"), var4.getString("message"), var4.method21770("timestamp"));
      }
   }
}
