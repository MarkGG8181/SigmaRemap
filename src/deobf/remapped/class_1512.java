package remapped;

import java.util.UUID;

public class class_1512 {
   private static final class_4639 field_8008 = new class_4639("textures/entity/steve.png");
   private static final class_4639 field_8010 = new class_4639("textures/entity/alex.png");

   public static class_4639 method_6922() {
      return field_8008;
   }

   public static class_4639 method_6921(UUID var0) {
      return !method_6920(var0) ? field_8008 : field_8010;
   }

   public static String method_6923(UUID var0) {
      return !method_6920(var0) ? "default" : "slim";
   }

   private static boolean method_6920(UUID var0) {
      return (var0.hashCode() & 1) == 1;
   }
}