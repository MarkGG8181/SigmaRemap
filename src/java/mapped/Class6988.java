package mapped;

public class Class6988 {
   public static final int field30233 = 0;
   public static final int field30234 = 1;
   public static final int field30235 = 2;
   public static final int field30236 = 3;
   public static final int field30237 = 4;
   public static final int field30238 = 5;
   public static final int field30239 = 6;
   public static final int field30240 = 7;
   public static final int field30241 = 8;
   public static final int field30242 = 1;

   public static int method21637(String var0) {
      if (var0 != null) {
         var0 = var0.toLowerCase().trim();
         if (!var0.equals("alpha")) {
            if (!var0.equals("add")) {
               if (!var0.equals("subtract")) {
                  if (!var0.equals("multiply")) {
                     if (!var0.equals("dodge")) {
                        if (!var0.equals("burn")) {
                           if (!var0.equals("screen")) {
                              if (!var0.equals("overlay")) {
                                 if (!var0.equals("replace")) {
                                    Class7944.method26811("Unknown blend: " + var0);
                                    return 1;
                                 } else {
                                    return 8;
                                 }
                              } else {
                                 return 7;
                              }
                           } else {
                              return 6;
                           }
                        } else {
                           return 5;
                        }
                     } else {
                        return 4;
                     }
                  } else {
                     return 3;
                  }
               } else {
                  return 2;
               }
            } else {
               return 1;
            }
         } else {
            return 0;
         }
      } else {
         return 1;
      }
   }

   public static void method21638(int var0, float var1) {
      switch (var0) {
         case 0:
            Class7414.method23695();
            Class7414.method23715();
            Class7414.method23716(770, 771);
            Class7414.method23843(1.0F, 1.0F, 1.0F, var1);
            break;
         case 1:
            Class7414.method23695();
            Class7414.method23715();
            Class7414.method23716(770, 1);
            Class7414.method23843(1.0F, 1.0F, 1.0F, var1);
            break;
         case 2:
            Class7414.method23695();
            Class7414.method23715();
            Class7414.method23716(775, 0);
            Class7414.method23843(var1, var1, var1, 1.0F);
            break;
         case 3:
            Class7414.method23695();
            Class7414.method23715();
            Class7414.method23716(774, 771);
            Class7414.method23843(var1, var1, var1, var1);
            break;
         case 4:
            Class7414.method23695();
            Class7414.method23715();
            Class7414.method23716(1, 1);
            Class7414.method23843(var1, var1, var1, 1.0F);
            break;
         case 5:
            Class7414.method23695();
            Class7414.method23715();
            Class7414.method23716(0, 769);
            Class7414.method23843(var1, var1, var1, 1.0F);
            break;
         case 6:
            Class7414.method23695();
            Class7414.method23715();
            Class7414.method23716(1, 769);
            Class7414.method23843(var1, var1, var1, 1.0F);
            break;
         case 7:
            Class7414.method23695();
            Class7414.method23715();
            Class7414.method23716(774, 768);
            Class7414.method23843(var1, var1, var1, 1.0F);
            break;
         case 8:
            Class7414.method23696();
            Class7414.method23714();
            Class7414.method23843(1.0F, 1.0F, 1.0F, var1);
      }

      Class7414.method23804();
   }

   public static void method21639(float var0) {
      Class7414.method23695();
      Class7414.method23715();
      Class7414.method23716(770, 1);
      Class7414.method23843(1.0F, 1.0F, 1.0F, var0);
   }
}
