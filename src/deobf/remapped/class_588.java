package remapped;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;

public class class_588 extends class_3725 {
   public class_588(class_3073 var1) {
      super(class_8469.field_43283, var1);
   }

   @Override
   public void method_29257(class_6486 var1, class_1331 var2, class_2522 var3, class_5834 var4, class_6098 var5) {
      super.method_29257(var1, var2, var3, var4, var5);
      class_3757 var8 = var1.method_28260(var2);
      if (var8 instanceof class_4797) {
         class_4797 var9 = (class_4797)var8;
         GameProfile var10 = null;
         if (var5.method_28002()) {
            class_5734 var11 = var5.method_27990();
            if (!var11.method_25939("SkullOwner", 10)) {
               if (var11.method_25939("SkullOwner", 8) && !StringUtils.isBlank(var11.method_25965("SkullOwner"))) {
                  var10 = new GameProfile((UUID)null, var11.method_25965("SkullOwner"));
               }
            } else {
               var10 = class_4338.method_20184(var11.method_25937("SkullOwner"));
            }
         }

         var9.method_22109(var10);
      }
   }
}