package mapped;

public class Class1333 extends Class1331 {
   private static final String field7051 = "/reloadShaders";
   private static final String field7052 = "/reloadChunks";

   public Class1333(Class1331 var1) {
      super(Class843.method2584(var1));
   }

   @Override
   public void method2465(String var1) {
      if (!this.method6350(var1)) {
         super.method2465(var1);
      } else {
         this.field4562.field1298.method5989().method5935(var1);
      }
   }

   private boolean method6350(String var1) {
      if (var1 != null) {
         var1 = var1.trim();
         if (!var1.equals("/reloadShaders")) {
            if (!var1.equals("/reloadChunks")) {
               return false;
            } else {
               this.field4562.field1287.method868();
               return true;
            }
         } else {
            if (Class7944.method26921()) {
               Class8981.method33033();
               Class8981.method32953();
            }

            return true;
         }
      } else {
         return false;
      }
   }
}