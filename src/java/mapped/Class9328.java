package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class Class9328 {
   private static String[] field43287;
   private final Map<Class179, List<Class6692>> field43288 = Stream.<Class179>of(Class179.values())
      .collect(ImmutableMap.toImmutableMap(var0 -> var0, var0 -> Lists.newArrayList()));
   private final Map<Class8992<?>, Class7763> field43289 = Maps.newLinkedHashMap();
   private float field43290 = 0.1F;
   private boolean field43291;

   public Class9328 method35249(Class179 var1, Class6692 var2) {
      this.field43288.get(var1).add(var2);
      return this;
   }

   public Class9328 method35250(Class8992<?> var1, double var2, double var4) {
      this.field43289.put(var1, new Class7763(var4, var2));
      return this;
   }

   public Class9328 method35251(float var1) {
      this.field43290 = var1;
      return this;
   }

   public Class9328 method35252() {
      this.field43291 = true;
      return this;
   }

   public Class8835 method35253() {
      return new Class8835(
         this.field43290,
         this.field43288.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, var0 -> ImmutableList.copyOf((Collection)var0.getValue()))),
         ImmutableMap.copyOf(this.field43289),
         this.field43291
      );
   }
}
