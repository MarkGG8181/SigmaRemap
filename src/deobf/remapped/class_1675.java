package remapped;

import org.json.JSONException;

public class class_1675 {
   private class_1293 field_8675;
   public class_1293 field_8678;
   public String field_8677;

   public class_1675() {
   }

   public class_1675(String var1, class_1293 var2) {
      this.field_8677 = var1;
      this.field_8678 = var2;
   }

   public class_1675(String var1, class_1675 var2) {
      this.field_8677 = var1;
      this.field_8678 = var2.field_8678;
   }

   public class_1675 method_7504(class_1293 var1) throws JSONException {
      this.field_8678 = var1.method_5848("modConfig");
      this.field_8677 = var1.method_5861("name");
      return this;
   }

   public class_1293 method_7500(class_1293 var1) {
      var1.method_5820("modConfig", this.field_8678);
      var1.method_5820("name", this.field_8677);
      return var1;
   }

   public class_1293 method_7499() {
      return this.field_8675;
   }

   public class_1675 method_7498(String var1) {
      return new class_1675(var1, this.field_8678);
   }

   public void method_7503() {
      class_1336 var3 = null;

      try {
         var3 = class_3332.method_15293(this.field_8678, "mods");
      } catch (class_7584 var10) {
      }

      if (var3 != null) {
         for (int var4 = 0; var4 < var3.method_6142(); var4++) {
            class_1293 var5 = var3.method_6143(var4);
            String var6 = null;

            try {
               var6 = class_3332.method_15291(var5, "name", null);
            } catch (class_7584 var9) {
               SigmaMainClass.method_3328().method_3326().method_12862("Invalid name in mod list config");
            }

            for (class_9128 var8 : SigmaMainClass.method_3328().method_3298().method_843().values()) {
               if (var8.method_41992().equals(var6) && var8.method_42004() != class_5664.field_28708 && var8.method_42004() != class_5664.field_28709) {
                  var5.method_5820("enabled", "false");
               }
            }
         }
      }
   }

   public void method_7502(class_1293 var1, class_9128 var2) {
      class_1336 var5 = null;

      try {
         var5 = class_3332.method_15293(this.field_8678, "mods");
      } catch (class_7584 var12) {
      }

      boolean var6 = false;
      if (var5 != null) {
         for (int var7 = 0; var7 < var5.method_6142(); var7++) {
            class_1293 var8 = var5.method_6143(var7);
            String var9 = null;

            try {
               var9 = class_3332.method_15291(var8, "name", null);
            } catch (class_7584 var11) {
               SigmaMainClass.method_3328().method_3326().method_12862("Invalid name in mod list config");
            }

            if (var2.method_41992().equals(var9)) {
               if (var2.method_42004() != class_5664.field_28708 && var2.method_42004() != class_5664.field_28709) {
                  var5.method_6154(var7, var1);
               }

               var6 = true;
            }
         }
      }

      if (!var6) {
         var5.method_6159(var1);
      }
   }

   public class_1293 method_7501(class_9128 var1) {
      class_1336 var4 = null;

      try {
         var4 = class_3332.method_15293(this.field_8678, "mods");
      } catch (class_7584 var10) {
      }

      if (var4 != null) {
         for (int var5 = 0; var5 < var4.method_6142(); var5++) {
            class_1293 var6 = var4.method_6143(var5);
            String var7 = null;

            try {
               var7 = class_3332.method_15291(var6, "name", null);
            } catch (class_7584 var9) {
               SigmaMainClass.method_3328().method_3326().method_12862("Invalid name in mod list config");
            }

            if (var1.method_41992().equals(var7)) {
               return var6;
            }
         }
      }

      return null;
   }
}