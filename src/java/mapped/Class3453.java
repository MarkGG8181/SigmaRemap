package mapped;

import java.util.Random;

public class Class3453 extends Class3452 {
   private static String[] field19269;
   public static final Class6408 field19270 = Block.method11539(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   public Class3453(AbstractBlock var1) {
      super(var1, Direction.field673, field19270, false, 0.1);
   }

   @Override
   public int method12128(Random var1) {
      return Class8633.method31015(var1);
   }

   @Override
   public Block method12125() {
      return Blocks.field37089;
   }

   @Override
   public boolean method12127(Class7380 var1) {
      return Class8633.method31014(var1);
   }
}