package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class class_4577 extends class_8273<class_9370> {
   private static final class_4639 field_22279 = new class_4639("killed_by_crossbow");

   @Override
   public class_4639 method_3899() {
      return field_22279;
   }

   public class_9370 method_21225(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_8938[] var6 = class_8938.method_41070(var1, "victims", var3);
      class_7781 var7 = class_7781.method_35310(var1.get("unique_entity_types"));
      return new class_9370(var2, var6, var7);
   }

   public void method_21226(class_9359 var1, Collection<class_8145> var2) {
      ArrayList var5 = Lists.newArrayList();
      HashSet var6 = Sets.newHashSet();

      for (class_8145 var8 : var2) {
         var6.add(var8.method_37387());
         var5.add(class_865.method_3739(var1, var8));
      }

      this.method_38137(var1, var2x -> var2x.method_43338(var5, var6.size()));
   }
}
