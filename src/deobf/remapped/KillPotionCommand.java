package remapped;

import com.mentalfrostbyte.jello.commands.CommandException;

public class KillPotionCommand extends Command {
   public KillPotionCommand() {
      super("killpotion", "Gives you a potion to kill creative players!");
   }

   @Override
   public void run(String var1, class_5273[] var2, class_860 var3) throws CommandException {
      if (var2.length <= 0) {
         if (!field_18219.playerController.method_42149()) {
            ItemStack var6 = new ItemStack(class_4897.field_25226);
            CompoundNBT var7 = new CompoundNBT();
            var7.putInt("Amplifier", 125);
            var7.putInt("Duration", 2000);
            var7.putInt("Id", 6);
            class_3416 var8 = new class_3416();
            var8.add(var7);
            var6.method_27954("CustomPotionEffects", var8);
            field_18219.method_8614().sendPacket(new class_6362(36 + class_2740.method_12347(), var6));
            var3.method_3731("Requested server a killpotion!");
         } else {
            throw new class_2900("Creative mode only!");
         }
      } else {
         throw new class_2900("Too many arguments");
      }
   }
}
