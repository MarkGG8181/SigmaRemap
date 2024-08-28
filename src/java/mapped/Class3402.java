package mapped;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class Class3402 extends Block {
   private static String[] field19063;
   public static final Class8551 field19064 = Class3392.field19023;
   public static final Class8551 field19065 = Class3392.field19019;
   public static final Class8551 field19066 = Class3392.field19020;
   public static final Class8551 field19067 = Class3392.field19021;
   public static final Class8551 field19068 = Class3392.field19022;
   public static final Map<Direction, Class8551> field19069 = Class3392.field19025
      .entrySet()
      .stream()
      .filter(var0 -> var0.getKey() != Direction.field672)
      .collect(Util.<Direction, Class8551>method38484());
   private static final Class6408 field19070 = Block.method11539(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final Class6408 field19071 = Block.method11539(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final Class6408 field19072 = Block.method11539(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final Class6408 field19073 = Block.method11539(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final Class6408 field19074 = Block.method11539(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<Class7380, Class6408> field19075;

   public Class3402(AbstractBlock var1) {
      super(var1);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field19064, Boolean.valueOf(false))
            .method23465(field19065, Boolean.valueOf(false))
            .method23465(field19066, Boolean.valueOf(false))
            .method23465(field19067, Boolean.valueOf(false))
            .method23465(field19068, Boolean.valueOf(false))
      );
      this.field19075 = ImmutableMap.copyOf(this.field18612.method35392().stream().collect(Collectors.toMap(Function.identity(), Class3402::method12030)));
   }

   private static Class6408 method12030(Class7380 var0) {
      Class6408 var3 = Class8022.method27425();
      if (var0.<Boolean>method23463(field19064)) {
         var3 = field19070;
      }

      if (var0.<Boolean>method23463(field19065)) {
         var3 = Class8022.method27431(var3, field19073);
      }

      if (var0.<Boolean>method23463(field19067)) {
         var3 = Class8022.method27431(var3, field19074);
      }

      if (var0.<Boolean>method23463(field19066)) {
         var3 = Class8022.method27431(var3, field19072);
      }

      if (var0.<Boolean>method23463(field19068)) {
         var3 = Class8022.method27431(var3, field19071);
      }

      return var3;
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return this.field19075.get(var1);
   }

   @Override
   public boolean method11492(Class7380 var1, Class1662 var2, BlockPos var3) {
      return this.method12031(this.method12035(var1, var2, var3));
   }

   private boolean method12031(Class7380 var1) {
      return this.method12032(var1) > 0;
   }

   private int method12032(Class7380 var1) {
      int var4 = 0;

      for (Class8551 var6 : field19069.values()) {
         if (var1.<Boolean>method23463(var6)) {
            var4++;
         }
      }

      return var4;
   }

   private boolean method12033(Class1665 var1, BlockPos var2, Direction var3) {
      if (var3 == Direction.field672) {
         return false;
      } else {
         BlockPos var6 = var2.method8349(var3);
         if (!method12034(var1, var6, var3)) {
            if (var3.method544() == Class113.field414) {
               return false;
            } else {
               Class8551 var7 = field19069.get(var3);
               Class7380 var8 = var1.method6738(var2.method8311());
               return var8.method23448(this) && var8.<Boolean>method23463(var7);
            }
         } else {
            return true;
         }
      }
   }

   public static boolean method12034(Class1665 var0, BlockPos var1, Direction var2) {
      Class7380 var5 = var0.method6738(var1);
      return Block.method11549(var5.method23414(var0, var1), var2.method536());
   }

   private Class7380 method12035(Class7380 var1, Class1665 var2, BlockPos var3) {
      BlockPos var6 = var3.method8311();
      if (var1.<Boolean>method23463(field19064)) {
         var1 = var1.method23465(field19064, Boolean.valueOf(method12034(var2, var6, Direction.field672)));
      }

      Class7380 var7 = null;

      for (Direction var9 : Class76.field161) {
         Class8551 var10 = method12039(var9);
         if (var1.<Boolean>method23463(var10)) {
            boolean var11 = this.method12033(var2, var3, var9);
            if (!var11) {
               if (var7 == null) {
                  var7 = var2.method6738(var6);
               }

               var11 = var7.method23448(this) && var7.<Boolean>method23463(var10);
            }

            var1 = var1.method23465(var10, Boolean.valueOf(var11));
         }
      }

      return var1;
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var2 != Direction.field672) {
         Class7380 var9 = this.method12035(var1, var4, var5);
         return this.method12031(var9) ? var9 : Blocks.AIR.method11579();
      } else {
         return super.method11491(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public void method11484(Class7380 var1, Class1657 var2, BlockPos var3, Random var4) {
      if (var2.field9016.nextInt(4) == 0) {
         Direction var7 = Direction.method552(var4);
         BlockPos var8 = var3.method8311();
         if (var7.method544().method324() && !var1.<Boolean>method23463(method12039(var7))) {
            if (this.method12038(var2, var3)) {
               BlockPos var19 = var3.method8349(var7);
               Class7380 var21 = var2.method6738(var19);
               if (!var21.method23393()) {
                  if (method12034(var2, var19, var7)) {
                     var2.method6725(var3, var1.method23465(method12039(var7), Boolean.valueOf(true)), 2);
                  }
               } else {
                  Direction var23 = var7.method537();
                  Direction var24 = var7.method538();
                  boolean var13 = var1.<Boolean>method23463(method12039(var23));
                  boolean var14 = var1.<Boolean>method23463(method12039(var24));
                  BlockPos var15 = var19.method8349(var23);
                  BlockPos var16 = var19.method8349(var24);
                  if (var13 && method12034(var2, var15, var23)) {
                     var2.method6725(var19, this.method11579().method23465(method12039(var23), Boolean.valueOf(true)), 2);
                  } else if (var14 && method12034(var2, var16, var24)) {
                     var2.method6725(var19, this.method11579().method23465(method12039(var24), Boolean.valueOf(true)), 2);
                  } else {
                     Direction var17 = var7.method536();
                     if (var13 && var2.method7007(var15) && method12034(var2, var3.method8349(var23), var17)) {
                        var2.method6725(var15, this.method11579().method23465(method12039(var17), Boolean.valueOf(true)), 2);
                     } else if (var14 && var2.method7007(var16) && method12034(var2, var3.method8349(var24), var17)) {
                        var2.method6725(var16, this.method11579().method23465(method12039(var17), Boolean.valueOf(true)), 2);
                     } else if ((double)var2.field9016.nextFloat() < 0.05 && method12034(var2, var19.method8311(), Direction.field673)) {
                        var2.method6725(var19, this.method11579().method23465(field19064, Boolean.valueOf(true)), 2);
                     }
                  }
               }
            }
         } else {
            if (var7 == Direction.field673 && var3.getY() < 255) {
               if (this.method12033(var2, var3, var7)) {
                  var2.method6725(var3, var1.method23465(field19064, Boolean.valueOf(true)), 2);
                  return;
               }

               if (var2.method7007(var8)) {
                  if (!this.method12038(var2, var3)) {
                     return;
                  }

                  Class7380 var18 = var1;

                  for (Direction var22 : Class76.field161) {
                     if (var4.nextBoolean() || !method12034(var2, var8.method8349(var22), Direction.field673)) {
                        var18 = var18.method23465(method12039(var22), Boolean.valueOf(false));
                     }
                  }

                  if (this.method12037(var18)) {
                     var2.method6725(var8, var18, 2);
                  }

                  return;
               }
            }

            if (var3.getY() > 0) {
               BlockPos var9 = var3.method8313();
               Class7380 var10 = var2.method6738(var9);
               if (var10.method23393() || var10.method23448(this)) {
                  Class7380 var11 = !var10.method23393() ? var10 : this.method11579();
                  Class7380 var12 = this.method12036(var1, var11, var4);
                  if (var11 != var12 && this.method12037(var12)) {
                     var2.method6725(var9, var12, 2);
                  }
               }
            }
         }
      }
   }

   private Class7380 method12036(Class7380 var1, Class7380 var2, Random var3) {
      for (Direction var7 : Class76.field161) {
         if (var3.nextBoolean()) {
            Class8551 var8 = method12039(var7);
            if (var1.<Boolean>method23463(var8)) {
               var2 = var2.method23465(var8, Boolean.valueOf(true));
            }
         }
      }

      return var2;
   }

   private boolean method12037(Class7380 var1) {
      return var1.<Boolean>method23463(field19065)
         || var1.<Boolean>method23463(field19066)
         || var1.<Boolean>method23463(field19067)
         || var1.<Boolean>method23463(field19068);
   }

   private boolean method12038(Class1665 var1, BlockPos var2) {
      Iterable<BlockPos> var6 = BlockPos.method8364(
         var2.method8304() - 4, var2.getY() - 1, var2.method8306() - 4, var2.method8304() + 4, var2.getY() + 1, var2.method8306() + 4
      );
      int var7 = 5;

      for (BlockPos var9 : var6) {
         if (var1.method6738(var9).method23448(this)) {
            if (--var7 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public boolean method11497(Class7380 var1, Class5909 var2) {
      Class7380 var5 = var2.method18360().method6738(var2.method18345());
      return !var5.method23448(this) ? super.method11497(var1, var2) : this.method12032(var5) < field19069.size();
   }

   @Nullable
   @Override
   public Class7380 method11495(Class5909 var1) {
      Class7380 var4 = var1.method18360().method6738(var1.method18345());
      boolean var5 = var4.method23448(this);
      Class7380 var6 = !var5 ? this.method11579() : var4;

      for (Direction var10 : var1.method18349()) {
         if (var10 != Direction.field672) {
            Class8551 var11 = method12039(var10);
            boolean var12 = var5 && var4.<Boolean>method23463(var11);
            if (!var12 && this.method12033(var1.method18360(), var1.method18345(), var10)) {
               return var6.method23465(var11, Boolean.valueOf(true));
            }
         }
      }

      return !var5 ? null : var6;
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field19064, field19065, field19066, field19067, field19068);
   }

   @Override
   public Class7380 method11500(Class7380 var1, Class80 var2) {
      switch (Class9257.field42565[var2.ordinal()]) {
         case 1:
            return var1.method23465(field19065, var1.<Boolean>method23463(field19067))
               .method23465(field19066, var1.<Boolean>method23463(field19068))
               .method23465(field19067, var1.<Boolean>method23463(field19065))
               .method23465(field19068, var1.<Boolean>method23463(field19066));
         case 2:
            return var1.method23465(field19065, var1.<Boolean>method23463(field19066))
               .method23465(field19066, var1.<Boolean>method23463(field19067))
               .method23465(field19067, var1.<Boolean>method23463(field19068))
               .method23465(field19068, var1.<Boolean>method23463(field19065));
         case 3:
            return var1.method23465(field19065, var1.<Boolean>method23463(field19068))
               .method23465(field19066, var1.<Boolean>method23463(field19065))
               .method23465(field19067, var1.<Boolean>method23463(field19066))
               .method23465(field19068, var1.<Boolean>method23463(field19067));
         default:
            return var1;
      }
   }

   @Override
   public Class7380 method11501(Class7380 var1, Class2089 var2) {
      switch (Class9257.field42566[var2.ordinal()]) {
         case 1:
            return var1.method23465(field19065, var1.<Boolean>method23463(field19067)).method23465(field19067, var1.<Boolean>method23463(field19065));
         case 2:
            return var1.method23465(field19066, var1.<Boolean>method23463(field19068)).method23465(field19068, var1.<Boolean>method23463(field19066));
         default:
            return super.method11501(var1, var2);
      }
   }

   public static Class8551 method12039(Direction var0) {
      return field19069.get(var0);
   }
}