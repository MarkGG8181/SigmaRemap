package mapped;

public class Class4134 extends Class4057 {
   public Class4134() {
      super(Class8992.field41086, "squid", 0.7F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2879();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2879) {
         Class2879 var5 = (Class2879)var1;
         if (var2.equals("body")) {
            return (Class7219)Class9299.method35072(var5, Class9299.field43113);
         } else {
            String var6 = "tentacle";
            if (!var2.startsWith(var6)) {
               return null;
            } else {
               Class7219[] var7 = (Class7219[])Class9299.method35072(var5, Class9299.field43114);
               if (var7 == null) {
                  return null;
               } else {
                  String var8 = var2.substring(var6.length());
                  int var9 = Class7944.method26899(var8, -1);
                  var9--;
                  return var9 >= 0 && var9 < var7.length ? var7[var9] : null;
               }
            }
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"body", "tentacle1", "tentacle2", "tentacle3", "tentacle4", "tentacle5", "tentacle6", "tentacle7", "tentacle8"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      Class8853 var5 = Minecraft.getInstance().method1554();
      Class5682 var6 = new Class5682(var5);
      var6.field25086 = (Class2879<Class1055>)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}