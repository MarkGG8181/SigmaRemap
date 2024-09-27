package net.minecraft.network.play.server;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;

import java.io.IOException;
import java.util.List;

public class SEntityEquipmentPacket implements IPacket<IClientPlayNetHandler> {
    private int entityID;
   private final List<Pair<EquipmentSlotType, ItemStack>> field_241789_b_;

   public SEntityEquipmentPacket() {
      this.field_241789_b_ = Lists.newArrayList();
   }

   public SEntityEquipmentPacket(int var1, List<Pair<EquipmentSlotType, ItemStack>> var2) {
      this.entityID = var1;
      this.field_241789_b_ = var2;
   }

   @Override
   public void readPacketData(PacketBuffer buf) throws IOException {
      this.entityID = buf.readVarInt();
      EquipmentSlotType[] aequipmentslottype = EquipmentSlotType.values();
      int i;

      do
      {
         i = buf.readByte();
         EquipmentSlotType equipmentslottype = aequipmentslottype[i & 127];
         ItemStack itemstack = buf.readItemStack();
         this.field_241789_b_.add(Pair.of(equipmentslottype, itemstack));
      }
      while ((i & -128) != 0);
   }

   @Override
   public void writePacketData(PacketBuffer buf) throws IOException {
      buf.writeVarInt(this.entityID);
      int i = this.field_241789_b_.size();

      for (int j = 0; j < i; ++j)
      {
         Pair<EquipmentSlotType, ItemStack> pair = this.field_241789_b_.get(j);
         EquipmentSlotType equipmentslottype = pair.getFirst();
         boolean flag = j != i - 1;
         int k = equipmentslottype.ordinal();
         buf.writeByte(flag ? k | -128 : k);
         buf.writeItemStack(pair.getSecond());
      }
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleEntityEquipment(this);
   }

   public int getEntityID() {
      return this.entityID;
   }

   public List<Pair<EquipmentSlotType, ItemStack>> func_241790_c_() {
      return this.field_241789_b_;
   }
}
