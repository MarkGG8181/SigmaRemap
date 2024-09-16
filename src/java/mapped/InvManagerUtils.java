package mapped;

import com.mentalfrostbyte.jello.unmapped.JelloPortal;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.ClickType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.play.client.CClickWindowPacket;
import net.minecraft.potion.EffectInstance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.Map.Entry;

public class InvManagerUtils {
   private static String[] field33418;
   private static final Minecraft field33419 = Minecraft.getInstance();

   public static boolean method25819(int var0) {
      ItemStack var3 = field33419.player.container.getSlot(var0).getStack();
      return var3 == null || var3.getItem() instanceof Class3280;
   }

   public static int method25820() {
      float var2 = 0.0F;
      int var3 = -1;

      for (int var4 = 44; var4 >= 9; var4--) {
         ItemStack var5 = field33419.player.container.getSlot(var4).getStack();
         if (!method25819(var4) && var5.method32184()) {
            float var6 = var5.getItem().method11745().method36158() * (float)var5.field39976;
            if (var6 > var2) {
               var3 = var4;
               var2 = var6;
            }
         }
      }

      return var3;
   }

   public static int method25821(Class<? extends Item> var0) {
      int var3 = 0;
      int var4 = -1;

      for (int var5 = 44; var5 >= 9; var5--) {
         ItemStack var6 = field33419.player.container.getSlot(var5).getStack();
         if (!method25819(var5) && var0.isInstance(var6.getItem())) {
            int var7 = var6.field39976;
            if (var7 > var3) {
               var4 = var5;
               var3 = var7;
            }
         }
      }

      return var4;
   }

   public static int findItemSlot(Item var0) {
      int var3 = 0;
      int var4 = -1;

      for (int var5 = 44; var5 >= 9; var5--) {
         ItemStack var6 = field33419.player.container.getSlot(var5).getStack();
         if (!method25819(var5) && var6.getItem() == var0) {
            int var7 = var6.field39976;
            if (var7 > var3) {
               var4 = var5;
               var3 = var7;
            }
         }
      }

      return var4;
   }

   public static int method25823(Item... var0) {
      int var3 = 0;
      int var4 = -1;

      for (int var5 = 44; var5 >= 9; var5--) {
         ItemStack var6 = field33419.player.container.getSlot(var5).getStack();
         if (!method25819(var5)) {
            for (Item var10 : var0) {
               if (var6.getItem() == var10) {
                  int var11 = var6.field39976;
                  if (var11 > var3) {
                     var4 = var5;
                     var3 = var11;
                  }
               }
            }
         }
      }

      return var4;
   }

   public static int method25824(Class<? extends Item> var0, int... var1) {
      int var4 = 0;
      int var5 = -1;
      List var6 = Arrays.<int[]>asList(var1);

      for (int var7 = 44; var7 >= 9; var7--) {
         ItemStack var8 = field33419.player.container.getSlot(var7).getStack();
         if (!method25819(var7) && var0.isInstance(var8.getItem()) && !var6.contains(Item.method11701(var8.getItem()))) {
            int var9 = var8.field39976;
            if (var9 > var4) {
               var5 = var7;
               var4 = var9;
            }
         }
      }

      return var5;
   }

   public static int method25825(int var0) {
      int var3 = 0;
      int var4 = -1;

      for (int var5 = 44; var5 >= 9; var5--) {
         ItemStack var6 = field33419.player.container.getSlot(var5).getStack();
         if (!method25819(var5) && Item.method11701(var6.getItem()) == var0) {
            int var7 = var6.field39976;
            if (var7 > var3) {
               var4 = var5;
               var3 = var7;
            }
         }
      }

      return var4;
   }

   public static void method25826(int var0, int var1, boolean var2) {
      field33419.playerController
         .windowClickFixed(field33419.player.container.field25471, var0, var1, !var2 ? ClickType.field14698 : ClickType.field14695, field33419.player);
   }

   public static void method25827(int var0) {
      field33419.playerController.windowClickFixed(field33419.player.container.field25471, var0, 1, ClickType.field14696, field33419.player);
   }

   public static boolean method25828(ArmorItem var0, byte var1) {
      return var1 == 5 && method25829(var0) || var1 == 6 && method25830(var0) || var1 == 7 && method25831(var0) || var1 == 8 && method25832(var0);
   }

   public static boolean method25829(ArmorItem var0) {
      return var0.method11805() == EquipmentSlotType.field13736;
   }

   public static boolean method25830(ArmorItem var0) {
      return var0.method11805() == EquipmentSlotType.field13735;
   }

   public static boolean method25831(ArmorItem var0) {
      return var0.method11805() == EquipmentSlotType.field13734;
   }

   public static boolean method25832(ArmorItem var0) {
      return var0.method11805() == EquipmentSlotType.field13733;
   }

   public static int method25833() {
      int var2 = -1;
      float var3 = -1.0F;

      for (int var4 = 9; var4 <= 44; var4++) {
         ItemStack var5 = field33419.player.container.getSlot(var4).getStack();
         if (!method25819(var4) && var5.getItem() instanceof ItemSword) {
            float var6 = ((ItemSword)var5.getItem()).method11784()
               + (float) EnchantmentHelper.method26311(Class8122.field34908, var5)
               + (float) EnchantmentHelper.method26311(Class8122.field34912, var5);
            if (var6 > var3 || var6 == var3 && var4 == 36) {
               var2 = var4;
               var3 = var6;
            }
         }
      }

      return var2;
   }

   public static int method25834() {
      BlockState var2 = Block.method11536(1);
      return findBestToolForBlock(var2);
   }

   public static int method25835() {
      BlockState var2 = Block.method11536(5);
      return findBestToolForBlock(var2);
   }

   public static int method25836() {
      BlockState var2 = Block.method11536(3);
      return findBestToolForBlock(var2);
   }

   public static int findBestToolForBlock(BlockState var0) {
      int var3 = -1;
      float var4 = 1.0F;

      for (int var5 = 44; var5 >= 9; var5--) {
         ItemStack var6 = field33419.player.container.getSlot(var5).getStack();
         if (var6 != null) {
            float var7 = 0.0F;
            if (var0 == null) {
               if (!(var6.getItem() instanceof ItemSword)) {
                  continue;
               }

               var7 = ((ItemSword)var6.getItem()).method11784();
            } else {
               var7 = var6.method32109(var0);
            }

            if (var7 > var4) {
               var3 = var5;
               var4 = var7;
            }
         }
      }

      return var3;
   }

   public static int method25838(Class<? extends Item> var0) {
      int var3 = 0;

      for (int var4 = 44; var4 >= 9; var4--) {
         ItemStack var5 = field33419.player.container.getSlot(var4).getStack();
         if (!method25819(var4) && var0.isInstance(var5.getItem())) {
            var3 += var5.field39976;
         }
      }

      return var3;
   }

   public static int method25839(Class<? extends Item> var0) {
      int var3 = 64;

      for (int var4 = 44; var4 >= 9; var4--) {
         ItemStack var5 = field33419.player.container.getSlot(var4).getStack();
         if (!method25819(var4) && var0.isInstance(var5.getItem()) && var5.field39976 < var3) {
            var3 = var5.field39976;
         }
      }

      return var3;
   }

   public static int method25840(Class<? extends Item> var0) {
      HashSet var3 = new HashSet();

      for (int var4 = 44; var4 >= 9; var4--) {
         ItemStack var5 = field33419.player.container.getSlot(var4).getStack();
         if (!method25819(var4) && var0.isInstance(var5.getItem())) {
            var3.add(var4);
         }
      }

      return var3.size();
   }

   public static int method25841() {
      int var2 = -1;
      float var3 = -1.0F;

      for (int var4 = 44; var4 >= 9; var4--) {
         ItemStack var5 = field33419.player.container.getSlot(var4).getStack();
         if (!method25819(var4) && var5.getItem() instanceof BowItem) {
            float var6 = (float) EnchantmentHelper.method26311(Class8122.field34919, var5);
            if (var6 > var3) {
               var2 = var4;
               var3 = var6;
            }
         }
      }

      return var2;
   }

   public static int method25842(Class<? extends Item> var0) {
      int var3 = 0;
      int var4 = -1;

      for (int var5 = 0; var5 < 9; var5++) {
         ItemStack var6 = field33419.player.inventory.getStackInSlot(var5);
         if (var6 != null && var0.isInstance(var6.getItem())) {
            int var7 = var6.field39976;
            if (var7 > var3) {
               var4 = var5;
               var3 = var7;
            }
         }
      }

      return var4;
   }

   public static int method25843(Item... var0) {
      int var3 = 0;
      int var4 = -1;

      for (int var5 = 0; var5 < 9; var5++) {
         ItemStack var6 = field33419.player.inventory.getStackInSlot(var5);
         if (var6 != null) {
            for (Item var10 : var0) {
               if (var6.getItem() == var10) {
                  int var11 = var6.field39976;
                  if (var11 > var3) {
                     var4 = var5;
                     var3 = var11;
                  }
               }
            }
         }
      }

      return var4;
   }

   public static int method25844(Class<? extends Item> var0, int... var1) {
      int var4 = 0;
      int var5 = -1;
      List var6 = Arrays.<int[]>asList(var1);

      for (int var7 = 0; var7 < 9; var7++) {
         ItemStack var8 = field33419.player.inventory.getStackInSlot(var7);
         if (var8 != null && var0.isInstance(var8.getItem()) && !var6.contains(Item.method11701(var8.getItem()))) {
            int var9 = var8.field39976;
            if (var9 > var4) {
               var5 = var7;
               var4 = var9;
            }
         }
      }

      return var5;
   }

   public static int method25845(int var0) {
      int var3 = 0;
      int var4 = -1;

      for (int var5 = 0; var5 < 9; var5++) {
         ItemStack var6 = field33419.player.inventory.getStackInSlot(var5);
         if (var6 != null && Item.method11701(var6.getItem()) == var0) {
            int var7 = var6.field39976;
            if (var7 > var3) {
               var4 = var5;
               var3 = var7;
            }
         }
      }

      return var4;
   }

   public static int method25846() {
      for (int var2 = 0; var2 < 9; var2++) {
         ItemStack var3 = field33419.player.inventory.getStackInSlot(var2);
         if (var3 == null) {
            return var2;
         }
      }

      return 0;
   }

   public static boolean method25847(int var0) {
      return method25848(field33419.player.container.getSlot(var0).getStack());
   }

   public static boolean method25848(ItemStack var0) {
      if (var0.getItem() instanceof ArmorItem) {
         ArmorItem var3 = (ArmorItem)var0.getItem();
         int var4 = method25850(var0);
         if (!method25829(var3)) {
            if (!method25830(var3)) {
               if (!method25831(var3)) {
                  return !method25832(var3) ? false : var4 > method25849(8);
               } else {
                  return var4 > method25849(7);
               }
            } else {
               return var4 > method25849(6);
            }
         } else {
            return var4 > method25849(5);
         }
      } else {
         return false;
      }
   }

   public static int method25849(int var0) {
      if (field33419.player.container.getSlot(var0).getStack() != null) {
         if (field33419.player.container.getSlot(var0).getStack().getItem() instanceof ArmorItem) {
            ArmorItem var3 = (ArmorItem)field33419.player.container.getSlot(var0).getStack().getItem();
            return var3.field18782 + EnchantmentHelper.method26311(Class6069.method18810(0), field33419.player.container.getSlot(var0).getStack());
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   public static int method25850(ItemStack var0) {
      if (var0 != null) {
         return var0.getItem() instanceof ArmorItem ? ((ArmorItem)var0.getItem()).field18782 + EnchantmentHelper.method26311(Class8122.field34896, var0) : 0;
      } else {
         return 0;
      }
   }

   public static int method25851(PlayerEntity var0) {
      int var3 = 0;

      for (int var4 = 5; var4 <= 8; var4++) {
         var3 += method25850(var0.inventory.getStackInSlot(var4));
      }

      return var3;
   }

   public static float method25852(PlayerEntity var0) {
      float var3 = (float)method25851(var0);
      float var4 = 0.0F;
      float var5 = method25853(var0.getHeldItemMainhand());
      return var5 * (1.0F - Math.min(20.0F, Math.max(var3 / 5.0F, var3 - var5 / (var4 / 4.0F + 2.0F))) / 25.0F);
   }

   public static float method25853(ItemStack var0) {
      return var0 != null && var0.getItem() instanceof ItemSword
         ? ((ItemSword)var0.getItem()).method11784()
            + (float) EnchantmentHelper.method26311(Class8122.field34908, var0)
            + (float) EnchantmentHelper.method26311(Class8122.field34912, var0)
         : 1.0F;
   }

   public static float method25854(ItemStack var0) {
      if (var0 != null) {
         Item var3 = var0.getItem();
         if (!(var3 instanceof ItemSword)) {
            if (!(var3 instanceof Class3287)) {
               if (!(var3 instanceof Class3271)) {
                  if (!(var3 instanceof Class3264)) {
                     if (!(var3 instanceof BowItem)) {
                        if (!(var3 instanceof Class3323)) {
                           if (!(var3 instanceof Class3292)) {
                              if (var0.method32184() && var0.getItem().method11745() == Class8672.field39078) {
                                 return 1.0F;
                              } else if (!(var3 instanceof Class3335)) {
                                 if (!var0.method32184()) {
                                    if (!(var3 instanceof Class3319)) {
                                       return !(var3 instanceof Class3333) ? 0.0F : 0.25F;
                                    } else {
                                       return 0.25F;
                                    }
                                 } else {
                                    return 0.5F;
                                 }
                              } else {
                                 return 1.0F;
                              }
                           } else {
                              return 1.0F;
                           }
                        } else {
                           return 1.25F;
                        }
                     } else {
                        return 1.5F;
                     }
                  } else {
                     return 1.5F;
                  }
               } else {
                  return 1.5F;
               }
            } else {
               return 1.5F;
            }
         } else {
            return 2.0F;
         }
      } else {
         return -1.0F;
      }
   }

   public static HashMap<Integer, Float> method25855() {
      HashMap var2 = new HashMap();

      for (int var3 = 0; var3 < 9; var3++) {
         ItemStack var4 = field33419.player.inventory.getStackInSlot(var3);
         var2.put(var3, method25854(var4) * (float)(field33419.player.inventory.currentItem != var3 ? 1 : 2));
      }

      return var2;
   }

   public static int method25856() {
      HashMap<Integer, Float> var2 = method25855();
      TreeMap<Integer, Float> var3 = new TreeMap(Collections.reverseOrder());
      var3.putAll(var2);
      Entry<Integer, Float> var4 = null;

      for (Entry<Integer, Float> var6 : var3.entrySet()) {
         if (var4 == null || var4.getValue() > var6.getValue()) {
            var4 = var6;
         }
      }

      return var4.getKey();
   }

   public static int swapToolToHotbar(int var0) {
      int var3 = method25856();
      method25869(field33419.player.container.field25471, var0, var3, ClickType.field14696, field33419.player);
      return var3;
   }

   public static List<EffectInstance> getPotionEffects(ItemStack var0) {
      if (var0 != null) {
         return var0.getItem() instanceof Class3323 ? Class9741.method38176(var0) : null;
      } else {
         return null;
      }
   }

   public static boolean method25859(ItemStack var0) {
      return var0 != null ? var0.getItem() instanceof Class3326 : false;
   }

   public static float method25860(ItemStack var0) {
      List<EffectInstance> var3 = getPotionEffects(var0);
      if (var3 != null) {
         float var4 = 0.0F;

         for (EffectInstance var6 : var3) {
            if (var6.getPotion() == Effects.INSTANT_HEALTH) {
               var4 = (float)(var6.method8629() + 1);
            }

            if (var6.getPotion() != Effects.REGENERATION) {
               if (var6.getPotion() == Effects.INSTANT_DAMAGE) {
                  var4 = (float)(-var6.method8629() + 1);
               }
            } else {
               var4 = (float)(var6.method8629() + 1) / 2.0F;
            }
         }

         return var4;
      } else {
         return 0.0F;
      }
   }

   public static float method25861(ItemStack var0) {
      List<EffectInstance> var3 = getPotionEffects(var0);
      if (var3 != null) {
         float var4 = 0.0F;

         for (EffectInstance var6 : var3) {
            if (var6.getPotion() != Effects.SPEED) {
               if (var6.getPotion() == Effects.SLOWNESS) {
                  var4 = (float)(-var6.method8629() + 1);
               }
            } else {
               var4 = (float)(var6.method8629() + 1);
            }
         }

         return var4;
      } else {
         return 0.0F;
      }
   }

   public static HashMap<Integer, ItemStack> method25862() {
      HashMap var2 = new HashMap();

      for (int var3 = 44; var3 >= 9; var3--) {
         ItemStack var4 = field33419.player.container.getSlot(var3).getStack();
         if (!method25819(var3) && var4.getItem() instanceof Class3323) {
            var2.put(var3, var4);
         }
      }

      return var2;
   }

   public static HashMap<Integer, ItemStack> method25863() {
      HashMap var2 = new HashMap();

      for (int var3 = 44; var3 >= 9; var3--) {
         ItemStack var4 = field33419.player.container.getSlot(var3).getStack();
         var2.put(var3, var4);
      }

      return var2;
   }

   public static boolean method25864(Class<? extends Item> var0) {
      for (Entry var4 : method25863().entrySet()) {
         if (var4 != null && var0.isInstance(var4.getValue())) {
            return true;
         }
      }

      return false;
   }

   public static boolean method25865(int var0) {
      return var0 > 35;
   }

   public static ItemStack method25866(int var0) {
      return field33419.player.container.getSlot(var0).getStack();
   }

   public static boolean method25867(ItemStack var0) {
      if (var0 != null) {
         if (var0.method32184()) {
            float var3 = var0.getItem().method11745().method36158() * (float)var0.field39976;
            int var4 = method25820();
            if (var4 != -1) {
               ItemStack var5 = method25866(var4);
               float var6 = var5.getItem().method11745().method36158() * (float)var5.field39976;
               return var3 > var6;
            } else {
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static boolean method25868(ItemStack var0) {
      if (var0 != null) {
         if (var0.getItem() instanceof Class3308) {
            int var3 = method25821(Class3308.class);
            if (var3 != -1) {
               ItemStack var4 = method25866(var3);
               int var5 = var4.field39976;
               int var6 = var0.field39976;
               return var6 > var5;
            } else {
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static ItemStack method25869(int var0, int var1, int var2, ClickType var3, PlayerEntity var4) {
      return fixedClick(var0, var1, var2, var3, var4, false);
   }

   public static ItemStack fixedClick(int var0, int var1, int var2, ClickType var3, PlayerEntity var4, boolean var5) {
      ItemStack var8 = null;
      if (var1 >= 0) {
         var8 = var4.field4905.getSlot(var1).getStack().copy();
      }

      short var9 = var4.field4905.getNextTransactionID(field33419.player.inventory);
      ItemStack var10 = var4.field4905.slotClick(var1, var2, var3, var4);
      if (var8 == null || JelloPortal.getCurrentVersion().getVersionNumber() > ViaVerList._1_12.getVersionNumber() && !var5 || var3 == ClickType.field14696) {
         var8 = var10;
      }

      field33419.getConnection().sendPacket(new CClickWindowPacket(var0, var1, var2, var3, var8, var9));
      return var10;
   }

   public static void method25871(int var0) {
      field33419.playerController.windowClickFixed(field33419.player.container.field25471, var0, 1, ClickType.field14698, field33419.player);
   }

   public static boolean method25872(ItemStack var0) {
      if (var0 != null && var0.getItem() instanceof ArmorItem) {
         float var3 = (float)method25850(var0);

         for (int var4 = 5; var4 < 45; var4++) {
            if (field33419.player.container.getSlot(var4).getHasStack()) {
               ItemStack var5 = field33419.player.container.getSlot(var4).getStack();
               Item var6 = var5.getItem();
               if (var6 instanceof ArmorItem) {
                  ArmorItem var7 = (ArmorItem)var6;
                  if ((float)method25850(var5) > var3 && var7.method11805() == ((ArmorItem)var0.getItem()).method11805()) {
                     return false;
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static void moveItemToHotbar(int var0, int var1) {
      field33419.playerController.windowClickFixed(field33419.player.container.field25471, var0, var1, ClickType.field14696, field33419.player);
   }

   public static boolean method25874(ItemStack var0) {
      if (var0 != null && var0.getItem() instanceof Class3323) {
         for (EffectInstance var4 : getPotionEffects(var0)) {
            if (var4.getPotion() == Effects.POISON
               || var4.getPotion() == Effects.INSTANT_DAMAGE
               || var4.getPotion() == Effects.SLOWNESS
               || var4.getPotion() == Effects.WEAKNESS) {
               return true;
            }
         }
      }

      return false;
   }

   public static boolean method25875() {
      for (Slot var3 : field33419.player.container.field25468) {
         if (!var3.getHasStack() && var3.field25579 > 8 && var3.field25579 < 45) {
            return false;
         }
      }

      return true;
   }

   public static boolean method25876(ItemStack var0) {
      return var0 != null && !var0.getItem().equals(Items.field37222);
   }

   public static List<ItemStack> method25877(PlayerEntity var0) {
      ArrayList var3 = new ArrayList();

      for (Slot var5 : var0.container.field25468) {
         if (method25876(var5.getStack())) {
            var3.add(var5.getStack());
         }
      }

      return var3;
   }

   public static int method25878(Item var0) {
      int var3 = 0;

      for (int var4 = 44; var4 >= 9; var4--) {
         ItemStack var5 = field33419.player.container.getSlot(var4).getStack();
         if (!method25819(var4) && var5.getItem() == var0) {
            var3 += var5.field39976;
         }
      }

      return var3;
   }
}
