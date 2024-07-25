package remapped;

import com.google.common.collect.Iterables;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import java.nio.charset.StandardCharsets;
import net.minecraft.util.text.StringTextComponent;

public class class_3182 extends SimpleChannelInboundHandler<ByteBuf> {
   public class_3182(class_1635 var1) {
      this.field_15901 = var1;
   }

   public void channelActive(ChannelHandlerContext var1) throws Exception {
      super.channelActive(var1);
      ByteBuf var4 = Unpooled.buffer();

      try {
         var4.writeByte(254);
         var4.writeByte(1);
         var4.writeByte(250);
         char[] var5 = "MC|PingHost".toCharArray();
         var4.writeShort(var5.length);

         for (char var9 : var5) {
            var4.writeChar(var9);
         }

         var4.writeShort(7 + 2 * this.field_15901.field_8502.method_37039().length());
         var4.writeByte(127);
         var5 = this.field_15901.field_8502.method_37039().toCharArray();
         var4.writeShort(var5.length);

         for (char var17 : var5) {
            var4.writeChar(var17);
         }

         var4.writeInt(this.field_15901.field_8502.method_37038());
         var1.channel().writeAndFlush(var4).addListener(ChannelFutureListener.CLOSE_ON_FAILURE);
      } finally {
         var4.release();
      }
   }

   public void channelRead0(ChannelHandlerContext var1, ByteBuf var2) throws Exception {
      short var5 = var2.readUnsignedByte();
      if (var5 == 255) {
         String var6 = new String(var2.readBytes(var2.readShort() * 2).array(), StandardCharsets.UTF_16BE);
         String[] var7 = (String[])Iterables.toArray(class_7081.method_32585().split(var6), String.class);
         if ("§1".equals(var7[0])) {
            int var8 = class_9299.method_42787(var7[1], 0);
            String var9 = var7[2];
            String var10 = var7[3];
            int var11 = class_9299.method_42787(var7[4], -1);
            int var12 = class_9299.method_42787(var7[5], -1);
            this.field_15901.field_8500.field_12663 = -1;
            this.field_15901.field_8500.field_12666 = new StringTextComponent(var9);
            this.field_15901.field_8500.field_12672 = new StringTextComponent(var10);
            this.field_15901.field_8500.field_12671 = class_7081.method_32591(var11, var12);
         }
      }

      var1.close();
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) throws Exception {
      var1.close();
   }
}