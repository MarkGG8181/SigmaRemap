package remapped;

import com.google.common.collect.Maps;
import java.util.Map;

public final class class_2511 extends class_1762<class_3551, class_3192<class_3551>> {
   private static final Map<class_2185, class_4639> field_12460 = class_9665.<Map<class_2185, class_4639>>method_44659(
      Maps.newEnumMap(class_2185.class), var0 -> {
         var0.put(class_2185.field_10876, new class_4639("textures/entity/horse/horse_white.png"));
         var0.put(class_2185.field_10868, new class_4639("textures/entity/horse/horse_creamy.png"));
         var0.put(class_2185.field_10867, new class_4639("textures/entity/horse/horse_chestnut.png"));
         var0.put(class_2185.field_10873, new class_4639("textures/entity/horse/horse_brown.png"));
         var0.put(class_2185.field_10877, new class_4639("textures/entity/horse/horse_black.png"));
         var0.put(class_2185.field_10871, new class_4639("textures/entity/horse/horse_gray.png"));
         var0.put(class_2185.field_10870, new class_4639("textures/entity/horse/horse_darkbrown.png"));
      }
   );

   public class_2511(class_6122 var1) {
      super(var1, new class_3192<class_3551>(0.0F), 1.1F);
      this.method_29100(new class_6601(this));
      this.method_29100(new class_5792(this));
   }

   public class_4639 method_11439(class_3551 var1) {
      return field_12460.get(var1.method_16524());
   }
}