package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class Class1654 implements AutoCloseable {
   private static final Logger field8990 = LogManager.getLogger();
   public static final ResourceLocation field8991 = new ResourceLocation("minecraft", "missing");
   private final Class1807 field8992;
   private final Map<ResourceLocation, Class1807> field8993 = Maps.newHashMap();
   private final TextureManager field8994;
   private Map<ResourceLocation, ResourceLocation> field8995 = ImmutableMap.of();
   private final Class268 field8996 = new Class272(this);

   public Class1654(TextureManager var1) {
      this.field8994 = var1;
      this.field8992 = Util.<Class1807>method38508(
         new Class1807(var1, field8991), var0 -> var0.method7919(Lists.newArrayList(new Class1768[]{new Class1772()}))
      );
   }

   public void method6706(Map<ResourceLocation, ResourceLocation> var1) {
      this.field8995 = var1;
   }

   public Class9834 method6707() {
      return new Class9834(var1 -> this.field8993.getOrDefault(this.field8995.getOrDefault(var1, var1), this.field8992));
   }

   public Class268 method6708() {
      return this.field8996;
   }

   @Override
   public void close() {
      this.field8993.values().forEach(Class1807::close);
      this.field8992.close();
   }

   // $VF: synthetic method
   public static Logger method6711() {
      return field8990;
   }

   // $VF: synthetic method
   public static Map<ResourceLocation, Class1807> method6712(Class1654 var0) {
      return var0.field8993;
   }

   // $VF: synthetic method
   public static TextureManager method6713(Class1654 var0) {
      return var0.field8994;
   }
}
