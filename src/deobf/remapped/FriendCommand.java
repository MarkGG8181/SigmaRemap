package remapped;

import com.mentalfrostbyte.jello.commands.CommandException;
import java.util.List;
import java.util.regex.Pattern;

public class FriendCommand extends Command {
   public FriendCommand() {
      super("friend", "Manage friends", "friends", "f");
      this.addArgument(new String[]{"add/remove/list/clear"});
   }

   @Override
   public void run(String var1, class_5273[] var2, class_860 var3) throws CommandException {
      if (var2.length == 0) {
         throw new class_2900();
      } else if (var2[0].method_24063() == class_1451.field_7816) {
         String var6 = var2[0].method_24060();
         String var7 = var6.toLowerCase();
         switch (var7) {
            case "add":
               if (var2.length != 2) {
                  var3.method_3731("Usage : .friend add <name>");
               } else {
                  Pattern var14 = Pattern.compile("[a-zA-Z0-9_]{2,16}");
                  boolean var15 = var14.matcher(var2[1].method_24060()).matches();
                  if (var15) {
                     boolean var16 = SigmaMainClass.getInstance().method_3307().method_14464(var2[1].method_24060());
                     if (!var16) {
                        var3.method_3731("\"" + var2[1].method_24060() + "\" is already your friend.");
                     } else {
                        var3.method_3731("\"" + var2[1].method_24060() + "\" is now your friend.");
                     }
                  } else {
                     var3.method_3731("Invalid name \"" + var2[1].method_24060() + "\"");
                  }
               }
               break;
            case "remove":
               if (var2.length != 2) {
                  var3.method_3731("Usage : .friend remove <name>");
               } else {
                  boolean var13 = SigmaMainClass.getInstance().method_3307().method_14467(var2[1].method_24060());
                  if (!var13) {
                     var3.method_3731("\"" + var2[1].method_24060() + "\" is not your friend :(.");
                  } else {
                     var3.method_3731("\"" + var2[1].method_24060() + "\" is no longer your friend.");
                  }
               }
               break;
            case "list":
               List var9 = SigmaMainClass.getInstance().method_3307().method_14465();
               if (var9.isEmpty()) {
                  var3.method_3731("You have no friends :(");
               } else {
                  var3.method_3731("Friends : (" + var9.size() + ")");
                  String var10 = "";

                  for (String var12 : var9) {
                     if (var12.equals(var9.get(var9.size() - 1))) {
                        var10 = var10.concat(var12 + ".");
                     } else {
                        var10 = var10.concat(var12 + ", ");
                     }
                  }

                  var3.method_3731(var10);
               }
               break;
            case "clear":
               if (SigmaMainClass.getInstance().method_3307().method_14472()) {
                  var3.method_3731("Cleared all your friends.");
               } else {
                  var3.method_3731("You have no friends :(.");
               }
               break;
            default:
               throw new class_2900();
         }
      } else {
         throw new class_2900();
      }
   }
}
