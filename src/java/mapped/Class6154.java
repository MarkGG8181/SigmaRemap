package mapped;

public class Class6154 implements Class6144 {
   private boolean field27559;
   public final Class6980 field27560;

   public Class6154(Class6980 var1, boolean var2) {
      this.field27560 = var1;
      this.field27559 = false;
      this.field27559 = var2;
   }

   @Override
   public Class5931 method19048() {
      if (!this.field27560.field30202.method22329(Class2228.field14600)) {
         if (!this.field27559) {
            if (!this.field27560.field30202.method22329(Class2228.field14597)) {
               Class6553 var6 = this.field27560.field30202.method22330();
               throw new Class2480(
                  "while parsing a flow sequence",
                  (Class2512)Class6980.method21564(this.field27560).method36684(),
                  "expected ',' or ']', but got " + var6.method19894(),
                  var6.method19895()
               );
            }

            this.field27560.field30202.method22331();
         }

         if (this.field27560.field30202.method22329(Class2228.field14602)) {
            Class6553 var5 = this.field27560.field30202.method22330();
            Class5939 var7 = new Class5939(null, null, true, var5.method19895(), var5.method19896(), Class2214.field14475);
            Class6980.method21559(this.field27560, new Class6149(this.field27560));
            return var7;
         }

         if (!this.field27560.field30202.method22329(Class2228.field14600)) {
            Class6980.method21562(this.field27560).method36683(new Class6154(this.field27560, false));
            return Class6980.method21568(this.field27560);
         }
      }

      Class6553 var3 = this.field27560.field30202.method22331();
      Class5935 var4 = new Class5935(var3.method19895(), var3.method19896());
      Class6980.method21559(this.field27560, (Class6144)Class6980.method21562(this.field27560).method36684());
      Class6980.method21564(this.field27560).method36684();
      return var4;
   }
}
