package mapped;

import javax.annotation.Nullable;

public class Class3208 extends Block implements Class3207 {
   private static String[] field18604;
   public static final Class8552<Class86> field18605 = Class8820.field39770;
   public static final Class8551 field18606 = Class8820.field39710;
   public static final Class6408 field18607 = Block.method11539(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final Class6408 field18608 = Block.method11539(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   public Class3208(AbstractBlock var1) {
      super(var1);
      this.method11578(this.method11579().method23465(field18605, Class86.field219).method23465(field18606, Boolean.valueOf(false)));
   }

   @Override
   public boolean method11534(Class7380 var1) {
      return var1.<Class86>method23463(field18605) != Class86.field220;
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field18605, field18606);
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      Class86 var7 = var1.<Class86>method23463(field18605);
      switch (Class3497.field19372[var7.ordinal()]) {
         case 1:
            return Class8022.method27426();
         case 2:
            return field18608;
         default:
            return field18607;
      }
   }

   @Nullable
   @Override
   public Class7380 method11495(Class5909 var1) {
      BlockPos var4 = var1.method18345();
      Class7380 var5 = var1.method18360().method6738(var4);
      if (!var5.method23448(this)) {
         Class7379 var6 = var1.method18360().method6739(var4);
         Class7380 var7 = this.method11579()
            .method23465(field18605, Class86.field219)
            .method23465(field18606, Boolean.valueOf(var6.method23472() == Class9479.field44066));
         Direction var8 = var1.method18354();
         return var8 != Direction.field672 && (var8 == Direction.field673 || !(var1.method18355().field18049 - (double)var4.getY() > 0.5))
            ? var7
            : var7.method23465(field18605, Class86.field218);
      } else {
         return var5.method23465(field18605, Class86.field220).method23465(field18606, Boolean.valueOf(false));
      }
   }

   @Override
   public boolean method11497(Class7380 var1, Class5909 var2) {
      Class8848 var5 = var2.method18357();
      Class86 var6 = var1.<Class86>method23463(field18605);
      if (var6 == Class86.field220 || var5.method32107() != this.method11581()) {
         return false;
      } else if (!var2.method18347()) {
         return true;
      } else {
         boolean var7 = var2.method18355().field18049 - (double)var2.method18345().getY() > 0.5;
         Direction var8 = var2.method18354();
         return var6 != Class86.field219
            ? var8 == Direction.field672 || !var7 && var8.method544().method324()
            : var8 == Direction.field673 || var7 && var8.method544().method324();
      }
   }

   @Override
   public Class7379 method11498(Class7380 var1) {
      return !var1.<Boolean>method23463(field18606) ? super.method11498(var1) : Class9479.field44066.method25078(false);
   }

   @Override
   public boolean method11532(Class1660 var1, BlockPos var2, Class7380 var3, Class7379 var4) {
      return var3.method23463(field18605) == Class86.field220 ? false : Class3207.super.method11532(var1, var2, var3, var4);
   }

   @Override
   public boolean method11531(Class1665 var1, BlockPos var2, Class7380 var3, Class7631 var4) {
      return var3.method23463(field18605) == Class86.field220 ? false : Class3207.super.method11531(var1, var2, var3, var4);
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>method23463(field18606)) {
         var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
      }

      return super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      switch (Class3497.field19373[var4.ordinal()]) {
         case 1:
            return false;
         case 2:
            return var2.method6739(var3).method23486(Class8953.field40469);
         case 3:
            return false;
         default:
            return false;
      }
   }
}