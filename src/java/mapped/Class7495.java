package mapped;

import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface Class7495 {
   Collection<ResourceLocation> method24423();

   Collection<Class7826> method24424(Function<ResourceLocation, Class7495> var1, Set<Pair<String, String>> var2);

   @Nullable
   Class7202 method24425(Class8968 var1, Function<Class7826, Class1713> var2, Class1902 var3, ResourceLocation var4);
}