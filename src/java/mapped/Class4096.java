package mapped;

public class Class4096 extends Class4057 {
   public Class4096() {
      super(Class8992.field41105, "wolf", 0.5F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2859();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2859) {
         Class2859 var5 = (Class2859)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("body")) {
               if (!var2.equals("leg1")) {
                  if (!var2.equals("leg2")) {
                     if (!var2.equals("leg3")) {
                        if (!var2.equals("leg4")) {
                           if (!var2.equals("tail")) {
                              return !var2.equals("mane") ? null : (Class7219)Class9299.field43132.method36565(var5, 9);
                           } else {
                              return (Class7219)Class9299.field43132.method36565(var5, 7);
                           }
                        } else {
                           return (Class7219)Class9299.field43132.method36565(var5, 6);
                        }
                     } else {
                        return (Class7219)Class9299.field43132.method36565(var5, 5);
                     }
                  } else {
                     return (Class7219)Class9299.field43132.method36565(var5, 4);
                  }
               } else {
                  return (Class7219)Class9299.field43132.method36565(var5, 3);
               }
            } else {
               return (Class7219)Class9299.field43132.method36565(var5, 2);
            }
         } else {
            return (Class7219)Class9299.field43132.method36565(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"head", "body", "leg1", "leg2", "leg3", "leg4", "tail", "mane"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      Class8853 var5 = Minecraft.getInstance().method1554();
      Class5690 var6 = new Class5690(var5);
      var6.field25086 = (Class2859<Class1012>)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}