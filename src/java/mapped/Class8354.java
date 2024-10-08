package mapped;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.IntArrayNBT;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;
import net.minecraft.state.StateHolder;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.UUIDCodec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Class8354 {
   private static final Logger field35896 = LogManager.getLogger();

   @Nullable
   public static GameProfile method29278(CompoundNBT var0) {
      String var3 = null;
      UUID var4 = null;
      if (var0.contains("Name", 8)) {
         var3 = var0.getString("Name");
      }

      if (var0.method106("Id")) {
         var4 = var0.method105("Id");
      }

      try {
         GameProfile var5 = new GameProfile(var4, var3);
         if (var0.contains("Properties", 10)) {
            CompoundNBT var6 = var0.getCompound("Properties");

            for (String var8 : var6.method97()) {
               ListNBT var9 = var6.method131(var8, 10);

               for (int var10 = 0; var10 < var9.size(); var10++) {
                  CompoundNBT var11 = var9.method153(var10);
                  String var12 = var11.getString("Value");
                  if (var11.contains("Signature", 8)) {
                     var5.getProperties().put(var8, new com.mojang.authlib.properties.Property(var8, var12, var11.getString("Signature")));
                  } else {
                     var5.getProperties().put(var8, new com.mojang.authlib.properties.Property(var8, var12));
                  }
               }
            }
         }

         return var5;
      } catch (Throwable var13) {
         return null;
      }
   }

   public static CompoundNBT method29279(CompoundNBT var0, GameProfile var1) {
      if (!Class9001.method33256(var1.getName())) {
         var0.method109("Name", var1.getName());
      }

      if (var1.getId() != null) {
         var0.method104("Id", var1.getId());
      }

      if (!var1.getProperties().isEmpty()) {
         CompoundNBT var4 = new CompoundNBT();

         for (String var6 : var1.getProperties().keySet()) {
            ListNBT var7 = new ListNBT();

            for (com.mojang.authlib.properties.Property var9 : var1.getProperties().get(var6)) {
               CompoundNBT var10 = new CompoundNBT();
               var10.method109("Value", var9.getValue());
               if (var9.hasSignature()) {
                  var10.method109("Signature", var9.getSignature());
               }

               var7.add(var10);
            }

            var4.put(var6, var7);
         }

         var0.put("Properties", var4);
      }

      return var0;
   }

   @VisibleForTesting
   public static boolean method29280(INBT var0, INBT var1, boolean var2) {
      if (var0 == var1) {
         return true;
      } else if (var0 == null) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (!var0.getClass().equals(var1.getClass())) {
         return false;
      } else if (!(var0 instanceof CompoundNBT)) {
         if (var0 instanceof ListNBT && var2) {
            ListNBT var11 = (ListNBT)var0;
            ListNBT var12 = (ListNBT)var1;
            if (var11.isEmpty()) {
               return var12.isEmpty();
            } else {
               for (int var13 = 0; var13 < var11.size(); var13++) {
                  INBT var14 = var11.get(var13);
                  boolean var15 = false;

                  for (int var10 = 0; var10 < var12.size(); var10++) {
                     if (method29280(var14, var12.get(var10), var2)) {
                        var15 = true;
                        break;
                     }
                  }

                  if (!var15) {
                     return false;
                  }
               }

               return true;
            }
         } else {
            return var0.equals(var1);
         }
      } else {
         CompoundNBT var5 = (CompoundNBT)var0;
         CompoundNBT var6 = (CompoundNBT)var1;

         for (String var8 : var5.method97()) {
            INBT var9 = var5.method116(var8);
            if (!method29280(var9, var6.method116(var8), var2)) {
               return false;
            }
         }

         return true;
      }
   }

   public static IntArrayNBT method29281(UUID var0) {
      return new IntArrayNBT(UUIDCodec.encodeUUID(var0));
   }

   public static UUID method29282(INBT var0) {
      if (var0.method75() == IntArrayNBT.field52) {
         int[] var3 = ((IntArrayNBT)var0).getIntArray();
         if (var3.length == 4) {
            return UUIDCodec.decodeUUID(var3);
         } else {
            throw new IllegalArgumentException("Expected UUID-Array to be of length 4, but found " + var3.length + ".");
         }
      } else {
         throw new IllegalArgumentException(
            "Expected UUID-Tag to be of type " + IntArrayNBT.field52.method21975() + ", but found " + var0.method75().method21975() + "."
         );
      }
   }

   public static BlockPos method29283(CompoundNBT var0) {
      return new BlockPos(var0.getInt("X"), var0.getInt("Y"), var0.getInt("Z"));
   }

   public static CompoundNBT method29284(BlockPos var0) {
      CompoundNBT var3 = new CompoundNBT();
      var3.putInt("X", var0.getX());
      var3.putInt("Y", var0.getY());
      var3.putInt("Z", var0.getZ());
      return var3;
   }

   public static BlockState method29285(CompoundNBT var0) {
      if (!var0.contains("Name", 8)) {
         return Blocks.AIR.getDefaultState();
      } else {
         Block var3 = Registry.BLOCK.getOrDefault(new ResourceLocation(var0.getString("Name")));
         BlockState var4 = var3.getDefaultState();
         if (var0.contains("Properties", 10)) {
            CompoundNBT var5 = var0.getCompound("Properties");
            StateContainer var6 = var3.getStateContainer();

            for (String var8 : var5.method97()) {
               Property var9 = var6.method35396(var8);
               if (var9 != null) {
                  var4 = method29286(var4, var9, var8, var5, var0);
               }
            }
         }

         return var4;
      }
   }

   private static <S extends StateHolder<?, S>, T extends Comparable<T>> S method29286(S var0, Property<T> var1, String var2, CompoundNBT var3, CompoundNBT var4) {
      Optional<T> var7 = var1.method30476(var3.getString(var2));
      if (!var7.isPresent()) {
         field35896.warn("Unable to read property: {} with value: {} for blockstate: {}", var2, var3.getString(var2), var4.toString());
         return var0;
      } else {
         return var0.with(var1, var7.get());
      }
   }

   public static CompoundNBT method29287(BlockState var0) {
      CompoundNBT var3 = new CompoundNBT();
      var3.method109("Name", Registry.BLOCK.getKey(var0.getBlock()).toString());
      ImmutableMap var4 = var0.method23468();
      if (!var4.isEmpty()) {
         CompoundNBT var5 = new CompoundNBT();
         UnmodifiableIterator var6 = var4.entrySet().iterator();

         while (var6.hasNext()) {
            Entry var7 = (Entry)var6.next();
            Property var8 = (Property)var7.getKey();
            var5.method109(var8.method30472(), method29288(var8, (Comparable<?>)var7.getValue()));
         }

         var3.put("Properties", var5);
      }

      return var3;
   }

   private static <T extends Comparable<T>> String method29288(Property<T> var0, Comparable<?> var1) {
      return var0.method30475((T)var1);
   }

   public static CompoundNBT method29289(DataFixer var0, Class2108 var1, CompoundNBT var2, int var3) {
      return method29290(var0, var1, var2, var3, SharedConstants.getVersion().getWorldVersion());
   }

   public static CompoundNBT method29290(DataFixer var0, Class2108 var1, CompoundNBT var2, int var3, int var4) {
      return (CompoundNBT)var0.update(var1.method8778(), new Dynamic(NBTDynamicOps.INSTANCE, var2), var3, var4).getValue();
   }
}
