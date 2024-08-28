package mapped;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

public class Class8564 {
   private static String field38502 = null;
   private static String field38503 = null;
   private static boolean field38504 = false;
   private static boolean field38505 = false;
   private static boolean field38506 = false;
   private static boolean field38507 = false;
   private static final String field38508 = ".png";
   private static final ResourceLocation field38509 = Class8684.field39210;
   private static final ResourceLocation field38510 = Class8684.field39209;
   private static TextureManager field38511;
   private static int field38512 = 0;

   public static boolean method30588() {
      return field38504;
   }

   public static String method30589() {
      return field38502;
   }

   public static void method30590() {
      if (!field38505) {
         field38505 = true;
         field38506 = false;
      } else {
         field38512++;
      }
   }

   public static ResourceLocation method30591(ResourceLocation var0) {
      if (field38505) {
         Class290 var3 = field38511.method1076(var0);
         ResourceLocation var4 = null;
         if (var3 instanceof Class293) {
            var4 = ((Class293)var3).field1139;
         }

         if (field38507) {
            if (var4 == null) {
               var4 = field38509;
            }

            return var4;
         } else {
            if (var4 != null) {
               field38506 = true;
            }

            return var0;
         }
      } else {
         return var0;
      }
   }

   public static Class1713 method30592(Class1713 var0) {
      if (field38505) {
         Class1713 var3 = var0.field9352;
         if (field38507) {
            if (var3 == null) {
               var3 = var0.method7466().method1098(field38510);
            }

            return var3;
         } else {
            if (var3 != null) {
               field38506 = true;
            }

            return var0;
         }
      } else {
         return var0;
      }
   }

   public static Class8557 method30593(Class8557 var0) {
      if (field38505) {
         Class8557 var3 = var0.method30532();
         if (field38507) {
            return var3;
         } else {
            if (var3 != null) {
               field38506 = true;
            }

            return var0;
         }
      } else {
         return var0;
      }
   }

   public static boolean method30594() {
      return field38512 <= 0 ? field38506 : false;
   }

   public static void method30595() {
      Class8496.method30084();
      field38507 = true;
   }

   public static boolean method30596() {
      return field38507;
   }

   public static void method30597() {
      Class8496.method30084();
      field38507 = false;
   }

   public static void method30598() {
      if (field38512 <= 0) {
         field38505 = false;
         field38506 = false;
      } else {
         field38512--;
      }
   }

   public static void method30599() {
      field38511 = Minecraft.getInstance().getTextureManager();
      field38504 = false;
      field38502 = null;
      field38503 = null;
      if (Class7944.method26917()) {
         try {
            String var2 = "optifine/emissive.properties";
            ResourceLocation var3 = new ResourceLocation(var2);
            InputStream var4 = Class7944.method26863(var3);
            if (var4 == null) {
               return;
            }

            method30604("Loading " + var2);
            Class20 var5 = new Class20();
            var5.load(var4);
            var4.close();
            field38502 = var5.getProperty("suffix.emissive");
            if (field38502 != null) {
               field38503 = field38502 + ".png";
            }

            field38504 = field38502 != null;
         } catch (FileNotFoundException var6) {
            return;
         } catch (IOException var7) {
            var7.printStackTrace();
         }
      }
   }

   public static void method30600(Class289 var0, Set<ResourceLocation> var1) {
      if (field38504) {
         for (ResourceLocation var5 : var1) {
            method30601(var0, var5);
         }
      }
   }

   private static void method30601(Class289 var0, ResourceLocation var1) {
      String var4 = method30589();
      if (var4 != null && !var1.method8292().endsWith(var4)) {
         ResourceLocation var5 = new ResourceLocation(var1.method8293(), var1.method8292() + var4);
         ResourceLocation var6 = var0.method1096(var5);
         if (Class7944.method26866(var6)) {
            Class1713 var7 = var0.method1119(var1);
            Class1713 var8 = var0.method1119(var5);
            var8.field9353 = true;
            var7.field9352 = var8;
            var0.method1119(field38510);
         }
      }
   }

   public static void method30602(Class289 var0) {
      for (Class1713 var4 : var0.method1120()) {
         method30603(var4, var0);
      }
   }

   private static void method30603(Class1713 var0, Class289 var1) {
      if (var0.field9352 != null) {
         Class1713 var4 = var1.method1107(var0.method7465());
         if (var4 != null) {
            Class1713 var5 = var1.method1107(var0.field9352.method7465());
            if (var5 != null) {
               var5.field9353 = true;
               var4.field9352 = var5;
            }
         }
      }
   }

   private static void method30604(String var0) {
      Class7944.method26810("EmissiveTextures: " + var0);
   }

   private static void method30605(String var0) {
      Class7944.method26811("EmissiveTextures: " + var0);
   }

   public static boolean method30606(ResourceLocation var0) {
      return field38503 != null ? var0.method8292().endsWith(field38503) : false;
   }

   public static void method30607(ResourceLocation var0, Class293 var1) {
      if (var0 != null && var1 != null) {
         var1.field1140 = false;
         var1.field1139 = null;
         if (field38503 != null) {
            String var4 = var0.method8292();
            if (var4.endsWith(".png")) {
               if (!var4.endsWith(field38503)) {
                  String var5 = var4.substring(0, var4.length() - ".png".length()) + field38503;
                  ResourceLocation var6 = new ResourceLocation(var0.method8293(), var5);
                  if (Class7944.method26866(var6)) {
                     var1.field1139 = var6;
                  }
               } else {
                  var1.field1140 = true;
               }
            }
         }
      }
   }
}
