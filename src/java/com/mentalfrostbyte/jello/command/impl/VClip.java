package com.mentalfrostbyte.jello.command.impl;

import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;
import mapped.Class2033;
import mapped.Class2193;
import mapped.Class6669;
import mapped.Class8623;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;

import java.util.Collections;

public class VClip extends Command {
   public VClip() {
      super("vclip", "Vertical clip through blocks", "vc");
      this.registerSubCommands(new String[]{"offset"});
   }

   @Override
   public void run(String var1, Class8623[] var2, Class6669 var3) throws CommandException {
      if (var2.length != 0) {
         if (var2.length <= 1) {
            if (var2[0].method30895() != Class2193.field14336) {
               throw new CommandException("Invalid vertical distance \"" + var2[0].method30899() + "\"");
            } else {
               mc.getConnection()
                  .handlePlayerPosLook(
                     new SPlayerPositionLookPacket(
                        mc.player.getPosX(),
                        mc.player.getPosY() + var2[0].method30896(),
                        mc.player.getPosZ(),
                        mc.player.rotationYaw,
                        mc.player.rotationPitch,
                        Collections.<Class2033>emptySet(),
                        (int)(2.147483647E9 * Math.random())
                     )
                  );
               var3.method20327("VClip'd to position " + (mc.player.getPosY() + var2[0].method30896()));
            }
         } else {
            throw new CommandException("Too many arguments");
         }
      } else {
         throw new CommandException();
      }
   }
}