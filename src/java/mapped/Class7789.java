package mapped;

import com.mentalfrostbyte.jello.unmapped.Class8005;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Class7789 {
   private static String[] field33418;
   private static final Minecraft field33419 = Minecraft.getInstance();

   public static boolean method25819(int var0) {
      Class8848 var3 = field33419.field1339.field4904.method18131(var0).method18265();
      return var3 == null || var3.method32107() instanceof Class3280;
   }

   public static int method25820() {
      float var2 = 0.0F;
      int var3 = -1;

      for (int var4 = 44; var4 >= 9; var4--) {
         Class8848 var5 = field33419.field1339.field4904.method18131(var4).method18265();
         if (!method25819(var4) && var5.method32184()) {
            float var6 = var5.method32107().method11745().method36158() * (float)var5.field39976;
            if (var6 > var2) {
               var3 = var4;
               var2 = var6;
            }
         }
      }

      return var3;
   }

   public static int method25821(Class<? extends Class3257> var0) {
      int var3 = 0;
      int var4 = -1;

      for (int var5 = 44; var5 >= 9; var5--) {
         Class8848 var6 = field33419.field1339.field4904.method18131(var5).method18265();
         if (!method25819(var5) && var0.isInstance(var6.method32107())) {
            int var7 = var6.field39976;
            if (var7 > var3) {
               var4 = var5;
               var3 = var7;
            }
         }
      }

      return var4;
   }

   public static int method25822(Class3257 var0) {
      int var3 = 0;
      int var4 = -1;

      for (int var5 = 44; var5 >= 9; var5--) {
         Class8848 var6 = field33419.field1339.field4904.method18131(var5).method18265();
         if (!method25819(var5) && var6.method32107() == var0) {
            int var7 = var6.field39976;
            if (var7 > var3) {
               var4 = var5;
               var3 = var7;
            }
         }
      }

      return var4;
   }

   public static int method25823(Class3257... var0) {
      int var3 = 0;
      int var4 = -1;

      for (int var5 = 44; var5 >= 9; var5--) {
         Class8848 var6 = field33419.field1339.field4904.method18131(var5).method18265();
         if (!method25819(var5)) {
            for (Class3257 var10 : var0) {
               if (var6.method32107() == var10) {
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

   public static int method25824(Class<? extends Class3257> var0, int... var1) {
      int var4 = 0;
      int var5 = -1;
      List var6 = Arrays.<int[]>asList(var1);

      for (int var7 = 44; var7 >= 9; var7--) {
         Class8848 var8 = field33419.field1339.field4904.method18131(var7).method18265();
         if (!method25819(var7) && var0.isInstance(var8.method32107()) && !var6.contains(Class3257.method11701(var8.method32107()))) {
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
         Class8848 var6 = field33419.field1339.field4904.method18131(var5).method18265();
         if (!method25819(var5) && Class3257.method11701(var6.method32107()) == var0) {
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
      field33419.field1337
         .method23144(field33419.field1339.field4904.field25471, var0, var1, !var2 ? Class2259.field14698 : Class2259.field14695, field33419.field1339);
   }

   public static void method25827(int var0) {
      field33419.field1337.method23144(field33419.field1339.field4904.field25471, var0, 1, Class2259.field14696, field33419.field1339);
   }

   public static boolean method25828(Class3279 var0, byte var1) {
      return var1 == 5 && method25829(var0) || var1 == 6 && method25830(var0) || var1 == 7 && method25831(var0) || var1 == 8 && method25832(var0);
   }

   public static boolean method25829(Class3279 var0) {
      return var0.method11805() == Class2106.field13736;
   }

   public static boolean method25830(Class3279 var0) {
      return var0.method11805() == Class2106.field13735;
   }

   public static boolean method25831(Class3279 var0) {
      return var0.method11805() == Class2106.field13734;
   }

   public static boolean method25832(Class3279 var0) {
      return var0.method11805() == Class2106.field13733;
   }

   public static int method25833() {
      int var2 = -1;
      float var3 = -1.0F;

      for (int var4 = 9; var4 <= 44; var4++) {
         Class8848 var5 = field33419.field1339.field4904.method18131(var4).method18265();
         if (!method25819(var4) && var5.method32107() instanceof Class3267) {
            float var6 = ((Class3267)var5.method32107()).method11784()
               + (float)Class7858.method26311(Class8122.field34908, var5)
               + (float)Class7858.method26311(Class8122.field34912, var5);
            if (var6 > var3 || var6 == var3 && var4 == 36) {
               var2 = var4;
               var3 = var6;
            }
         }
      }

      return var2;
   }

   public static int method25834() {
      Class7380 var2 = Class3209.method11536(1);
      return method25837(var2);
   }

   public static int method25835() {
      Class7380 var2 = Class3209.method11536(5);
      return method25837(var2);
   }

   public static int method25836() {
      Class7380 var2 = Class3209.method11536(3);
      return method25837(var2);
   }

   public static int method25837(Class7380 var0) {
      int var3 = -1;
      float var4 = 1.0F;

      for (int var5 = 44; var5 >= 9; var5--) {
         Class8848 var6 = field33419.field1339.field4904.method18131(var5).method18265();
         if (var6 != null) {
            float var7 = 0.0F;
            if (var0 == null) {
               if (!(var6.method32107() instanceof Class3267)) {
                  continue;
               }

               var7 = ((Class3267)var6.method32107()).method11784();
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

   public static int method25838(Class<? extends Class3257> var0) {
      int var3 = 0;

      for (int var4 = 44; var4 >= 9; var4--) {
         Class8848 var5 = field33419.field1339.field4904.method18131(var4).method18265();
         if (!method25819(var4) && var0.isInstance(var5.method32107())) {
            var3 += var5.field39976;
         }
      }

      return var3;
   }

   public static int method25839(Class<? extends Class3257> var0) {
      int var3 = 64;

      for (int var4 = 44; var4 >= 9; var4--) {
         Class8848 var5 = field33419.field1339.field4904.method18131(var4).method18265();
         if (!method25819(var4) && var0.isInstance(var5.method32107()) && var5.field39976 < var3) {
            var3 = var5.field39976;
         }
      }

      return var3;
   }

   public static int method25840(Class<? extends Class3257> var0) {
      HashSet var3 = new HashSet();

      for (int var4 = 44; var4 >= 9; var4--) {
         Class8848 var5 = field33419.field1339.field4904.method18131(var4).method18265();
         if (!method25819(var4) && var0.isInstance(var5.method32107())) {
            var3.add(var4);
         }
      }

      return var3.size();
   }

   public static int method25841() {
      int var2 = -1;
      float var3 = -1.0F;

      for (int var4 = 44; var4 >= 9; var4--) {
         Class8848 var5 = field33419.field1339.field4904.method18131(var4).method18265();
         if (!method25819(var4) && var5.method32107() instanceof Class3263) {
            float var6 = (float)Class7858.method26311(Class8122.field34919, var5);
            if (var6 > var3) {
               var2 = var4;
               var3 = var6;
            }
         }
      }

      return var2;
   }

   public static int method25842(Class<? extends Class3257> var0) {
      int var3 = 0;
      int var4 = -1;

      for (int var5 = 0; var5 < 9; var5++) {
         Class8848 var6 = field33419.field1339.field4902.method3618(var5);
         if (var6 != null && var0.isInstance(var6.method32107())) {
            int var7 = var6.field39976;
            if (var7 > var3) {
               var4 = var5;
               var3 = var7;
            }
         }
      }

      return var4;
   }

   public static int method25843(Class3257... var0) {
      int var3 = 0;
      int var4 = -1;

      for (int var5 = 0; var5 < 9; var5++) {
         Class8848 var6 = field33419.field1339.field4902.method3618(var5);
         if (var6 != null) {
            for (Class3257 var10 : var0) {
               if (var6.method32107() == var10) {
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

   public static int method25844(Class<? extends Class3257> var0, int... var1) {
      int var4 = 0;
      int var5 = -1;
      List var6 = Arrays.<int[]>asList(var1);

      for (int var7 = 0; var7 < 9; var7++) {
         Class8848 var8 = field33419.field1339.field4902.method3618(var7);
         if (var8 != null && var0.isInstance(var8.method32107()) && !var6.contains(Class3257.method11701(var8.method32107()))) {
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
         Class8848 var6 = field33419.field1339.field4902.method3618(var5);
         if (var6 != null && Class3257.method11701(var6.method32107()) == var0) {
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
         Class8848 var3 = field33419.field1339.field4902.method3618(var2);
         if (var3 == null) {
            return var2;
         }
      }

      return 0;
   }

   public static boolean method25847(int var0) {
      return method25848(field33419.field1339.field4904.method18131(var0).method18265());
   }

   public static boolean method25848(Class8848 var0) {
      if (var0.method32107() instanceof Class3279) {
         Class3279 var3 = (Class3279)var0.method32107();
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
      if (field33419.field1339.field4904.method18131(var0).method18265() != null) {
         if (field33419.field1339.field4904.method18131(var0).method18265().method32107() instanceof Class3279) {
            Class3279 var3 = (Class3279)field33419.field1339.field4904.method18131(var0).method18265().method32107();
            return var3.field18782 + Class7858.method26311(Class6069.method18810(0), field33419.field1339.field4904.method18131(var0).method18265());
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   public static int method25850(Class8848 var0) {
      if (var0 != null) {
         return var0.method32107() instanceof Class3279 ? ((Class3279)var0.method32107()).field18782 + Class7858.method26311(Class8122.field34896, var0) : 0;
      } else {
         return 0;
      }
   }

   public static int method25851(PlayerEntity var0) {
      int var3 = 0;

      for (int var4 = 5; var4 <= 8; var4++) {
         var3 += method25850(var0.field4902.method3618(var4));
      }

      return var3;
   }

   public static float method25852(PlayerEntity var0) {
      float var3 = (float)method25851(var0);
      float var4 = 0.0F;
      float var5 = method25853(var0.method3090());
      return var5 * (1.0F - Math.min(20.0F, Math.max(var3 / 5.0F, var3 - var5 / (var4 / 4.0F + 2.0F))) / 25.0F);
   }

   public static float method25853(Class8848 var0) {
      return var0 != null && var0.method32107() instanceof Class3267
         ? ((Class3267)var0.method32107()).method11784()
            + (float)Class7858.method26311(Class8122.field34908, var0)
            + (float)Class7858.method26311(Class8122.field34912, var0)
         : 1.0F;
   }

   public static float method25854(Class8848 var0) {
      if (var0 != null) {
         Class3257 var3 = var0.method32107();
         if (!(var3 instanceof Class3267)) {
            if (!(var3 instanceof Class3287)) {
               if (!(var3 instanceof Class3271)) {
                  if (!(var3 instanceof Class3264)) {
                     if (!(var3 instanceof Class3263)) {
                        if (!(var3 instanceof Class3323)) {
                           if (!(var3 instanceof Class3292)) {
                              if (var0.method32184() && var0.method32107().method11745() == Class8672.field39078) {
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
         Class8848 var4 = field33419.field1339.field4902.method3618(var3);
         var2.put(var3, method25854(var4) * (float)(field33419.field1339.field4902.field5443 != var3 ? 1 : 2));
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

   public static int method25857(int var0) {
      int var3 = method25856();
      method25869(field33419.field1339.field4904.field25471, var0, var3, Class2259.field14696, field33419.field1339);
      return var3;
   }

   public static List<Class2023> method25858(Class8848 var0) {
      if (var0 != null) {
         return var0.method32107() instanceof Class3323 ? Class9741.method38176(var0) : null;
      } else {
         return null;
      }
   }

   public static boolean method25859(Class8848 var0) {
      return var0 != null ? var0.method32107() instanceof Class3326 : false;
   }

   public static float method25860(Class8848 var0) {
      List<Class2023> var3 = method25858(var0);
      if (var3 != null) {
         float var4 = 0.0F;

         for (Class2023 var6 : var3) {
            if (var6.method8627() == Class8254.field35472) {
               var4 = (float)(var6.method8629() + 1);
            }

            if (var6.method8627() != Class8254.field35476) {
               if (var6.method8627() == Class8254.field35473) {
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

   public static float method25861(Class8848 var0) {
      List<Class2023> var3 = method25858(var0);
      if (var3 != null) {
         float var4 = 0.0F;

         for (Class2023 var6 : var3) {
            if (var6.method8627() != Class8254.field35467) {
               if (var6.method8627() == Class8254.field35468) {
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

   public static HashMap<Integer, Class8848> method25862() {
      HashMap var2 = new HashMap();

      for (int var3 = 44; var3 >= 9; var3--) {
         Class8848 var4 = field33419.field1339.field4904.method18131(var3).method18265();
         if (!method25819(var3) && var4.method32107() instanceof Class3323) {
            var2.put(var3, var4);
         }
      }

      return var2;
   }

   public static HashMap<Integer, Class8848> method25863() {
      HashMap var2 = new HashMap();

      for (int var3 = 44; var3 >= 9; var3--) {
         Class8848 var4 = field33419.field1339.field4904.method18131(var3).method18265();
         var2.put(var3, var4);
      }

      return var2;
   }

   public static boolean method25864(Class<? extends Class3257> var0) {
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

   public static Class8848 method25866(int var0) {
      return field33419.field1339.field4904.method18131(var0).method18265();
   }

   public static boolean method25867(Class8848 var0) {
      if (var0 != null) {
         if (var0.method32184()) {
            float var3 = var0.method32107().method11745().method36158() * (float)var0.field39976;
            int var4 = method25820();
            if (var4 != -1) {
               Class8848 var5 = method25866(var4);
               float var6 = var5.method32107().method11745().method36158() * (float)var5.field39976;
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

   public static boolean method25868(Class8848 var0) {
      if (var0 != null) {
         if (var0.method32107() instanceof Class3308) {
            int var3 = method25821(Class3308.class);
            if (var3 != -1) {
               Class8848 var4 = method25866(var3);
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

   public static Class8848 method25869(int var0, int var1, int var2, Class2259 var3, PlayerEntity var4) {
      return method25870(var0, var1, var2, var3, var4, false);
   }

   public static Class8848 method25870(int var0, int var1, int var2, Class2259 var3, PlayerEntity var4, boolean var5) {
      Class8848 var8 = null;
      if (var1 >= 0) {
         var8 = var4.field4905.method18131(var1).method18265().method32126();
      }

      short var9 = var4.field4905.method18139(field33419.field1339.field4902);
      Class8848 var10 = var4.field4905.method18132(var1, var2, var3, var4);
      if (var8 == null || Class8005.method27372().method18582() > Class5989.field26137.method18582() && !var5 || var3 == Class2259.field14696) {
         var8 = var10;
      }

      field33419.getClientPlayNetHandler().sendPacket(new Class5594(var0, var1, var2, var3, var8, var9));
      return var10;
   }

   public static void method25871(int var0) {
      field33419.field1337.method23144(field33419.field1339.field4904.field25471, var0, 1, Class2259.field14698, field33419.field1339);
   }

   public static boolean method25872(Class8848 var0) {
      if (var0 != null && var0.method32107() instanceof Class3279) {
         float var3 = (float)method25850(var0);

         for (int var4 = 5; var4 < 45; var4++) {
            if (field33419.field1339.field4904.method18131(var4).method18266()) {
               Class8848 var5 = field33419.field1339.field4904.method18131(var4).method18265();
               Class3257 var6 = var5.method32107();
               if (var6 instanceof Class3279) {
                  Class3279 var7 = (Class3279)var6;
                  if ((float)method25850(var5) > var3 && var7.method11805() == ((Class3279)var0.method32107()).method11805()) {
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

   public static void method25873(int var0, int var1) {
      field33419.field1337.method23144(field33419.field1339.field4904.field25471, var0, var1, Class2259.field14696, field33419.field1339);
   }

   public static boolean method25874(Class8848 var0) {
      if (var0 != null && var0.method32107() instanceof Class3323) {
         for (Class2023 var4 : method25858(var0)) {
            if (var4.method8627() == Class8254.field35485
               || var4.method8627() == Class8254.field35473
               || var4.method8627() == Class8254.field35468
               || var4.method8627() == Class8254.field35484) {
               return true;
            }
         }
      }

      return false;
   }

   public static boolean method25875() {
      for (Class5839 var3 : field33419.field1339.field4904.field25468) {
         if (!var3.method18266() && var3.field25579 > 8 && var3.field25579 < 45) {
            return false;
         }
      }

      return true;
   }

   public static boolean method25876(Class8848 var0) {
      return var0 != null && !var0.method32107().equals(Class8514.field37222);
   }

   public static List<Class8848> method25877(PlayerEntity var0) {
      ArrayList var3 = new ArrayList();

      for (Class5839 var5 : var0.field4904.field25468) {
         if (method25876(var5.method18265())) {
            var3.add(var5.method18265());
         }
      }

      return var3;
   }

   public static int method25878(Class3257 var0) {
      int var3 = 0;

      for (int var4 = 44; var4 >= 9; var4--) {
         Class8848 var5 = field33419.field1339.field4904.method18131(var4).method18265();
         if (!method25819(var4) && var5.method32107() == var0) {
            var3 += var5.field39976;
         }
      }

      return var3;
   }
}
