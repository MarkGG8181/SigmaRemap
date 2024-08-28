package mapped;

import it.unimi.dsi.fastutil.longs.Long2ByteMap.Entry;
import it.unimi.dsi.fastutil.longs.*;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class Class206 extends Class205 {
   private static String[] field761;
   private int field765;
   private final Long2IntMap field766;
   private final LongSet field767;
   public final Class9307 field764;

   public Class206(Class9307 var1, int var2) {
      super(var1, var2);
      this.field764 = var1;
      this.field766 = Long2IntMaps.synchronize(new Long2IntOpenHashMap());
      this.field767 = new LongOpenHashSet();
      this.field765 = 0;
      this.field766.defaultReturnValue(var2 + 2);
   }

   @Override
   public void method682(long var1, int var3, int var4) {
      this.field767.add(var1);
   }

   public void method685(int var1) {
      ObjectIterator var4 = this.field762.long2ByteEntrySet().iterator();

      while (var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         byte var6 = var5.getByteValue();
         long var7 = var5.getLongKey();
         this.method686(var7, var6, this.method687(var6), var6 <= var1 - 2);
      }

      this.field765 = var1;
   }

   private void method686(long var1, int var3, boolean var4, boolean var5) {
      if (var4 != var5) {
         Class2005 var8 = new Class2005<Class7481>(Class8561.field38482, Class9307.method35152(), new Class7481(var1));
         if (!var5) {
            Class9307.method35154(this.field764)
               .method1641(
                  Class1812.method7962(() -> Class9307.method35156(this.field764).execute(() -> Class9307.method35157(this.field764, var1, var8)), var1, true)
               );
         } else {
            Class9307.method35153(this.field764).method1641(Class1812.method7960(() -> Class9307.method35156(this.field764).execute(() -> {
                  if (!this.method687(this.method652(var1))) {
                     Class9307.method35154(this.field764).method1641(Class1812.method7962(() -> {
                     }, var1, false));
                  } else {
                     Class9307.method35158(this.field764, var1, var8);
                     Class9307.method35159(this.field764).add(var1);
                  }
               }), var1, () -> var3));
         }
      }
   }

   @Override
   public void method684() {
      super.method684();
      if (!this.field767.isEmpty()) {
         LongIterator var3 = this.field767.iterator();

         while (var3.hasNext()) {
            long var4 = var3.nextLong();
            int var6 = this.field766.get(var4);
            int var7 = this.method652(var4);
            if (var6 != var7) {
               Class9307.method35155(this.field764).method7965(new Class7481(var4), () -> this.field766.get(var4), var7, var3x -> {
                  if (var3x < this.field766.defaultReturnValue()) {
                     this.field766.put(var4, var3x);
                  } else {
                     this.field766.remove(var4);
                  }
               });
               this.method686(var4, var7, this.method687(var6), this.method687(var7));
            }
         }

         this.field767.clear();
      }
   }

   private boolean method687(int var1) {
      return var1 <= this.field765 - 2;
   }
}