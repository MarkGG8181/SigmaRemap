package mapped;

public class Class4578 extends Class4566 {
   private static String[] field22020;
   private final float field22021;
   private final float field22022;

   public Class4578(Class1656 var1, double var2, double var4, double var6, double var8, double var10, double var12, Class8848 var14) {
      this(var1, var2, var4, var6, var14);
      this.field22044 *= 0.1F;
      this.field22045 *= 0.1F;
      this.field22046 *= 0.1F;
      this.field22044 += var8;
      this.field22045 += var10;
      this.field22046 += var12;
   }

   @Override
   public Class6843 method14501() {
      return Class6843.field29734;
   }

   public Class4578(Class1656 var1, double var2, double var4, double var6, Class8848 var8) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.method14502(Minecraft.getInstance().method1555().method788(var8, var1, (Class880)null).method22624());
      this.field22057 = 1.0F;
      this.field22035 /= 2.0F;
      this.field22021 = this.field22054.nextFloat() * 3.0F;
      this.field22022 = this.field22054.nextFloat() * 3.0F;
   }

   @Override
   public float method14503() {
      return this.field22004.method7461((double)((this.field22021 + 1.0F) / 4.0F * 16.0F));
   }

   @Override
   public float method14504() {
      return this.field22004.method7461((double)(this.field22021 / 4.0F * 16.0F));
   }

   @Override
   public float method14505() {
      return this.field22004.method7464((double)(this.field22022 / 4.0F * 16.0F));
   }

   @Override
   public float method14506() {
      return this.field22004.method7464((double)((this.field22022 + 1.0F) / 4.0F * 16.0F));
   }
}
