package mapped;

public class Class9346 {
   private final Class8848 field43384;
   private final Class8848 field43385;
   private final Class8848 field43386;
   private int field43387;
   private final int field43388;
   private boolean field43389 = true;
   private int field43390;
   private int field43391;
   private float field43392;
   private int field43393 = 1;

   public Class9346(Class39 var1) {
      this.field43384 = Class8848.method32104(var1.method130("buy"));
      this.field43385 = Class8848.method32104(var1.method130("buyB"));
      this.field43386 = Class8848.method32104(var1.method130("sell"));
      this.field43387 = var1.method122("uses");
      if (!var1.method119("maxUses", 99)) {
         this.field43388 = 4;
      } else {
         this.field43388 = var1.method122("maxUses");
      }

      if (var1.method119("rewardExp", 1)) {
         this.field43389 = var1.method132("rewardExp");
      }

      if (var1.method119("xp", 3)) {
         this.field43393 = var1.method122("xp");
      }

      if (var1.method119("priceMultiplier", 5)) {
         this.field43392 = var1.method124("priceMultiplier");
      }

      this.field43390 = var1.method122("specialPrice");
      this.field43391 = var1.method122("demand");
   }

   public Class9346(Class8848 var1, Class8848 var2, int var3, int var4, float var5) {
      this(var1, Class8848.field39973, var2, var3, var4, var5);
   }

   public Class9346(Class8848 var1, Class8848 var2, Class8848 var3, int var4, int var5, float var6) {
      this(var1, var2, var3, 0, var4, var5, var6);
   }

   public Class9346(Class8848 var1, Class8848 var2, Class8848 var3, int var4, int var5, int var6, float var7) {
      this(var1, var2, var3, var4, var5, var6, var7, 0);
   }

   public Class9346(Class8848 var1, Class8848 var2, Class8848 var3, int var4, int var5, int var6, float var7, int var8) {
      this.field43384 = var1;
      this.field43385 = var2;
      this.field43386 = var3;
      this.field43387 = var4;
      this.field43388 = var5;
      this.field43393 = var6;
      this.field43392 = var7;
      this.field43391 = var8;
   }

   public Class8848 method35365() {
      return this.field43384;
   }

   public Class8848 method35366() {
      int var3 = this.field43384.method32179();
      Class8848 var4 = this.field43384.method32126();
      int var5 = Math.max(0, Class9679.method37767((float)(var3 * this.field43391) * this.field43392));
      var4.method32180(Class9679.method37775(var3 + var5 + this.field43390, 1, this.field43384.method32107().method11710()));
      return var4;
   }

   public Class8848 method35367() {
      return this.field43385;
   }

   public Class8848 method35368() {
      return this.field43386;
   }

   public void method35369() {
      this.field43391 = this.field43391 + this.field43387 - (this.field43388 - this.field43387);
   }

   public Class8848 method35370() {
      return this.field43386.method32126();
   }

   public int method35371() {
      return this.field43387;
   }

   public void method35372() {
      this.field43387 = 0;
   }

   public int method35373() {
      return this.field43388;
   }

   public void method35374() {
      this.field43387++;
   }

   public int method35375() {
      return this.field43391;
   }

   public void method35376(int var1) {
      this.field43390 += var1;
   }

   public void method35377() {
      this.field43390 = 0;
   }

   public int method35378() {
      return this.field43390;
   }

   public void method35379(int var1) {
      this.field43390 = var1;
   }

   public float method35380() {
      return this.field43392;
   }

   public int method35381() {
      return this.field43393;
   }

   public boolean method35382() {
      return this.field43387 >= this.field43388;
   }

   public void method35383() {
      this.field43387 = this.field43388;
   }

   public boolean method35384() {
      return this.field43387 > 0;
   }

   public boolean method35385() {
      return this.field43389;
   }

   public Class39 method35386() {
      Class39 var3 = new Class39();
      var3.method99("buy", this.field43384.method32112(new Class39()));
      var3.method99("sell", this.field43386.method32112(new Class39()));
      var3.method99("buyB", this.field43385.method32112(new Class39()));
      var3.method102("uses", this.field43387);
      var3.method102("maxUses", this.field43388);
      var3.method115("rewardExp", this.field43389);
      var3.method102("xp", this.field43393);
      var3.method107("priceMultiplier", this.field43392);
      var3.method102("specialPrice", this.field43390);
      var3.method102("demand", this.field43391);
      return var3;
   }

   public boolean method35387(Class8848 var1, Class8848 var2) {
      return this.method35388(var1, this.method35366())
         && var1.method32179() >= this.method35366().method32179()
         && this.method35388(var2, this.field43385)
         && var2.method32179() >= this.field43385.method32179();
   }

   private boolean method35388(Class8848 var1, Class8848 var2) {
      if (var2.method32105() && var1.method32105()) {
         return true;
      } else {
         Class8848 var5 = var1.method32126();
         if (var5.method32107().method11712()) {
            var5.method32118(var5.method32117());
         }

         return Class8848.method32130(var5, var2)
            && (!var2.method32141() || var5.method32141() && Class8354.method29280(var2.method32142(), var5.method32142(), false));
      }
   }

   public boolean method35389(Class8848 var1, Class8848 var2) {
      if (this.method35387(var1, var2)) {
         var1.method32182(this.method35366().method32179());
         if (!this.method35367().method32105()) {
            var2.method32182(this.method35367().method32179());
         }

         return true;
      } else {
         return false;
      }
   }
}
