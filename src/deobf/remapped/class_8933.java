package remapped;

public enum class_8933 implements class_7126 {
   field_45779;

   @Override
   public int method_32737(class_2431 var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var9 = new int[1];
      if (!this.method_41054(var9, var6)
         && !this.method_41055(var9, var2, var3, var4, var5, var6, 38, 37)
         && !this.method_41055(var9, var2, var3, var4, var5, var6, 39, 37)
         && !this.method_41055(var9, var2, var3, var4, var5, var6, 32, 5)) {
         if (var6 != 2 || var2 != 12 && var3 != 12 && var5 != 12 && var4 != 12) {
            if (var6 != 6) {
               return var6;
            } else if (var2 != 2
               && var3 != 2
               && var5 != 2
               && var4 != 2
               && var2 != 30
               && var3 != 30
               && var5 != 30
               && var4 != 30
               && var2 != 12
               && var3 != 12
               && var5 != 12
               && var4 != 12) {
               return var2 != 21 && var4 != 21 && var3 != 21 && var5 != 21 && var2 != 168 && var4 != 168 && var3 != 168 && var5 != 168 ? var6 : 23;
            } else {
               return 1;
            }
         } else {
            return 34;
         }
      } else {
         return var9[0];
      }
   }

   private boolean method_41054(int[] var1, int var2) {
      if (class_7930.method_35856(var2, 3)) {
         var1[0] = var2;
         return true;
      } else {
         return false;
      }
   }

   private boolean method_41055(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var6 != var7) {
         return false;
      } else {
         if (class_7930.method_35856(var2, var7)
            && class_7930.method_35856(var3, var7)
            && class_7930.method_35856(var5, var7)
            && class_7930.method_35856(var4, var7)) {
            var1[0] = var6;
         } else {
            var1[0] = var8;
         }

         return true;
      }
   }
}