package mapped;

import java.util.Arrays;

public final class Class6486 {
   private static String[] field28435;
   private static final Direction[] field28436 = Direction.values();
   private static final int field28437 = Class2156.values().length;
   public final boolean field28438;
   private final boolean field28439;
   private final int field28440;
   private final Class6408[] field28441;
   public final Class6408 field28442;
   public final boolean field28443;
   private final boolean[] field28444;
   public final boolean field28445;

   Class6486(Class7380 var1) {
      Block var4 = var1.method23383();
      this.field28438 = var1.method23409(Class1666.field9078, BlockPos.field13032);
      this.field28439 = var4.method11493(var1, Class1666.field9078, BlockPos.field13032);
      this.field28440 = var4.method11996(var1, Class1666.field9078, BlockPos.field13032);
      if (var1.method23410()) {
         this.field28441 = new Class6408[field28436.length];
         Class6408 var5 = var4.method11503(var1, Class1666.field9078, BlockPos.field13032);

         for (Direction var9 : field28436) {
            this.field28441[var9.ordinal()] = Class8022.method27442(var5, var9);
         }
      } else {
         this.field28441 = null;
      }

      this.field28442 = var4.method11502(var1, Class1666.field9078, BlockPos.field13032, Class4832.method14947());
      this.field28443 = Arrays.<Class113>stream(Class113.values())
         .anyMatch(var1x -> this.field28442.method19512(var1x) < 0.0 || this.field28442.method19513(var1x) > 1.0);
      this.field28444 = new boolean[field28436.length * field28437];

      for (Direction var16 : field28436) {
         for (Class2156 var12 : Class2156.values()) {
            this.field28444[method19650(var16, var12)] = var12.method8876(var1, Class1666.field9078, BlockPos.field13032, var16);
         }
      }

      this.field28445 = Block.method11550(var1.method23414(Class1666.field9078, BlockPos.field13032));
   }

   public boolean method19649(Direction var1, Class2156 var2) {
      return this.field28444[method19650(var1, var2)];
   }

   private static int method19650(Direction var0, Class2156 var1) {
      return var0.ordinal() * field28437 + var1.ordinal();
   }

   // $VF: synthetic method
   public static boolean method19652(Class6486 var0) {
      return var0.field28439;
   }

   // $VF: synthetic method
   public static int method19653(Class6486 var0) {
      return var0.field28440;
   }

   // $VF: synthetic method
   public static Class6408[] method19654(Class6486 var0) {
      return var0.field28441;
   }
}