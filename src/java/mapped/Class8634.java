package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.util.Map;

public class Class8634 {
   public static final Class8634 field38839 = new Class8634();
   private final Class7608<Class3257> field38840;
   private final Class3257 field38841;
   private final Class8840 field38842;
   private final Class8840 field38843;
   private final Class8605[] field38844;
   private final Class8605[] field38845;
   private final Class8812 field38846;
   private final Class8811 field38847;

   public Class8634() {
      this.field38840 = null;
      this.field38841 = null;
      this.field38846 = null;
      this.field38842 = Class8840.field39936;
      this.field38843 = Class8840.field39936;
      this.field38844 = Class8605.field38716;
      this.field38845 = Class8605.field38716;
      this.field38847 = Class8811.field39645;
   }

   public Class8634(
      Class7608<Class3257> var1, Class3257 var2, Class8840 var3, Class8840 var4, Class8605[] var5, Class8605[] var6, Class8812 var7, Class8811 var8
   ) {
      this.field38840 = var1;
      this.field38841 = var2;
      this.field38842 = var3;
      this.field38843 = var4;
      this.field38844 = var5;
      this.field38845 = var6;
      this.field38846 = var7;
      this.field38847 = var8;
   }

   public boolean method31016(Class8848 var1) {
      if (this == field38839) {
         return true;
      } else if (this.field38840 != null && !this.field38840.method24917(var1.method32107())) {
         return false;
      } else if (this.field38841 != null && var1.method32107() != this.field38841) {
         return false;
      } else if (this.field38842.method32015(var1.method32179())) {
         if (!this.field38843.method32004() && !var1.method32115()) {
            return false;
         } else if (this.field38843.method32015(var1.method32119() - var1.method32117())) {
            if (!this.field38847.method31808(var1)) {
               return false;
            } else {
               if (this.field38844.length > 0) {
                  Map var4 = Class7858.method26313(var1.method32147());

                  for (Class8605 var8 : this.field38844) {
                     if (!var8.method30835(var4)) {
                        return false;
                     }
                  }
               }

               if (this.field38845.length > 0) {
                  Map var9 = Class7858.method26313(Class3290.method11830(var1));

                  for (Class8605 var14 : this.field38845) {
                     if (!var14.method30835(var9)) {
                        return false;
                     }
                  }
               }

               Class8812 var10 = Class9741.method38185(var1);
               return this.field38846 == null || this.field38846 == var10;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static Class8634 method31017(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = Class8963.method32781(var0, "item");
         Class8840 var4 = Class8840.method32016(var3.get("count"));
         Class8840 var5 = Class8840.method32016(var3.get("durability"));
         if (!var3.has("data")) {
            Class8811 var6 = Class8811.method31812(var3.get("nbt"));
            Class3257 var7 = null;
            if (var3.has("item")) {
               ResourceLocation var8 = new ResourceLocation(Class8963.method32763(var3, "item"));
               var7 = Class2348.field16075.method9187(var8).orElseThrow(() -> new JsonSyntaxException("Unknown item id '" + var8 + "'"));
            }

            Class7608 var12 = null;
            if (var3.has("tag")) {
               ResourceLocation var9 = new ResourceLocation(Class8963.method32763(var3, "tag"));
               var12 = Class9443.method36296().method32658().method27135(var9);
               if (var12 == null) {
                  throw new JsonSyntaxException("Unknown item tag '" + var9 + "'");
               }
            }

            Class8812 var13 = null;
            if (var3.has("potion")) {
               ResourceLocation var10 = new ResourceLocation(Class8963.method32763(var3, "potion"));
               var13 = Class2348.field16076.method9187(var10).orElseThrow(() -> new JsonSyntaxException("Unknown potion '" + var10 + "'"));
            }

            Class8605[] var14 = Class8605.method30838(var3.get("enchantments"));
            Class8605[] var11 = Class8605.method30838(var3.get("stored_enchantments"));
            return new Class8634(var12, var7, var4, var5, var14, var11, var13, var6);
         } else {
            throw new JsonParseException("Disallowed data tag found");
         }
      } else {
         return field38839;
      }
   }

   public JsonElement method31018() {
      if (this == field38839) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var3 = new JsonObject();
         if (this.field38841 != null) {
            var3.addProperty("item", Class2348.field16075.method9181(this.field38841).toString());
         }

         if (this.field38840 != null) {
            var3.addProperty("tag", Class9443.method36296().method32658().method27136(this.field38840).toString());
         }

         var3.add("count", this.field38842.method32005());
         var3.add("durability", this.field38843.method32005());
         var3.add("nbt", this.field38847.method31811());
         if (this.field38844.length > 0) {
            JsonArray var4 = new JsonArray();

            for (Class8605 var8 : this.field38844) {
               var4.add(var8.method30836());
            }

            var3.add("enchantments", var4);
         }

         if (this.field38845.length > 0) {
            JsonArray var9 = new JsonArray();

            for (Class8605 var13 : this.field38845) {
               var9.add(var13.method30836());
            }

            var3.add("stored_enchantments", var9);
         }

         if (this.field38846 != null) {
            var3.addProperty("potion", Class2348.field16076.method9181(this.field38846).toString());
         }

         return var3;
      }
   }

   public static Class8634[] method31019(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonArray var3 = Class8963.method32784(var0, "items");
         Class8634[] var4 = new Class8634[var3.size()];

         for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5] = method31017(var3.get(var5));
         }

         return var4;
      } else {
         return new Class8634[0];
      }
   }
}