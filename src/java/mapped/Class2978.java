package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Class2978 extends Class2961<Class4726> {
   private static final String[] field18089 = new String[]{
      "ruined_portal/portal_1",
      "ruined_portal/portal_2",
      "ruined_portal/portal_3",
      "ruined_portal/portal_4",
      "ruined_portal/portal_5",
      "ruined_portal/portal_6",
      "ruined_portal/portal_7",
      "ruined_portal/portal_8",
      "ruined_portal/portal_9",
      "ruined_portal/portal_10"
   };
   private static final String[] field18090 = new String[]{"ruined_portal/giant_portal_1", "ruined_portal/giant_portal_2", "ruined_portal/giant_portal_3"};

   public Class2978(Codec<Class4726> var1) {
      super(var1);
   }

   @Override
   public Class7072<Class4726> method11359() {
      return Class5454::new;
   }

   private static boolean method11383(BlockPos var0, Class8907 var1) {
      return var1.method32503(var0) < 0.15F;
   }

   private static int method11384(Random var0, Class5646 var1, Class2219 var2, boolean var3, int var4, int var5, Class9764 var6) {
      int var9;
      if (var2 != Class2219.field14499) {
         if (var2 != Class2219.field14497) {
            if (var2 != Class2219.field14498) {
               if (var2 != Class2219.field14495) {
                  var9 = var4;
               } else {
                  var9 = var4 - var5 + method11385(var0, 2, 8);
               }
            } else {
               int var10 = var4 - var5;
               var9 = method11386(var0, 15, var10);
            }
         } else {
            int var19 = var4 - var5;
            var9 = method11386(var0, 70, var19);
         }
      } else if (!var3) {
         if (!(var0.nextFloat() < 0.5F)) {
            var9 = method11385(var0, 29, 100);
         } else {
            var9 = method11385(var0, 27, 29);
         }
      } else {
         var9 = method11385(var0, 32, 100);
      }

      ImmutableList<BlockPos> var20 = ImmutableList.of(
         new BlockPos(var6.field45678, 0, var6.field45680),
         new BlockPos(var6.field45681, 0, var6.field45680),
         new BlockPos(var6.field45678, 0, var6.field45683),
         new BlockPos(var6.field45681, 0, var6.field45683)
      );
      List<Class1665> var11 = var20.stream().map(var1x -> var1.method17798(var1x.method8304(), var1x.method8306())).collect(Collectors.toList());
      Class101 var12 = var2 != Class2219.field14496 ? Class101.field295 : Class101.field297;
      Mutable var13 = new Mutable();

      int var14;
      for (var14 = var9; var14 > 15; var14--) {
         int var15 = 0;
         var13.method8372(0, var14, 0);

         for (Class1665 var17 : var11) {
            Class7380 var18 = var17.method6738(var13);
            if (var18 != null && var12.method287().test(var18)) {
               if (++var15 == 3) {
                  return var14;
               }
            }
         }
      }

      return var14;
   }

   private static int method11385(Random var0, int var1, int var2) {
      return var0.nextInt(var2 - var1 + 1) + var1;
   }

   private static int method11386(Random var0, int var1, int var2) {
      return var1 >= var2 ? var2 : method11385(var0, var1, var2);
   }

   // $VF: synthetic method
   public static String[] method11388() {
      return field18090;
   }

   // $VF: synthetic method
   public static String[] method11389() {
      return field18089;
   }

   // $VF: synthetic method
   public static int method11390(Random var0, Class5646 var1, Class2219 var2, boolean var3, int var4, int var5, Class9764 var6) {
      return method11384(var0, var1, var2, var3, var4, var5, var6);
   }

   // $VF: synthetic method
   public static boolean method11391(BlockPos var0, Class8907 var1) {
      return method11383(var0, var1);
   }
}