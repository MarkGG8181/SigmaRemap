package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.server.ServerWorld;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Class7888 extends Class7882<Class1045> {
   private static String[] field33839;

   @Override
   public Set<Class8830<?>> method26424() {
      return ImmutableSet.of(Class8830.field39846, Class8830.field39819);
   }

   public void method26425(ServerWorld var1, Class1045 var2) {
      var2.method2992().<List<LivingEntity>>method21410(Class8830.field39819).ifPresent(var2x -> this.method26448(var2, (List<LivingEntity>)var2x));
   }

   private void method26448(Class1045 var1, List<LivingEntity> var2) {
      Optional var5 = var2.stream()
         .filter(var1x -> var1x.getType() == var1.getType())
         .<Class1045>map(var0 -> (Class1045)var0)
         .filter(var0 -> !var0.method3005())
         .findFirst();
      var1.method2992().method21408(Class8830.field39846, var5);
   }
}
