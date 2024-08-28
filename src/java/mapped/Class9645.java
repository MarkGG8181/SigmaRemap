package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.SocialInteractionsService;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class Class9645 {
   private static String[] field45101;
   private final Minecraft field45102;
   private final Set<UUID> field45103 = Sets.newHashSet();
   private final SocialInteractionsService field45104;
   private final Map<String, UUID> field45105 = Maps.newHashMap();

   public Class9645(Minecraft var1, SocialInteractionsService var2) {
      this.field45102 = var1;
      this.field45104 = var2;
   }

   public void method37604(UUID var1) {
      this.field45103.add(var1);
   }

   public void method37605(UUID var1) {
      this.field45103.remove(var1);
   }

   public boolean method37606(UUID var1) {
      return this.method37607(var1) || this.method37608(var1);
   }

   public boolean method37607(UUID var1) {
      return this.field45103.contains(var1);
   }

   public boolean method37608(UUID var1) {
      return this.field45104.isBlockedPlayer(var1);
   }

   public Set<UUID> method37609() {
      return this.field45103;
   }

   public UUID method37610(String var1) {
      return this.field45105.getOrDefault(var1, Util.field45724);
   }

   public void method37611(Class6589 var1) {
      GameProfile var4 = var1.method19966();
      if (var4.isComplete()) {
         this.field45105.put(var4.getName(), var4.getId());
      }

      Screen var5 = this.field45102.field1355;
      if (var5 instanceof Class1147) {
         Class1147 var6 = (Class1147)var5;
         var6.method5489(var1);
      }
   }

   public void method37612(UUID var1) {
      Screen var4 = this.field45102.field1355;
      if (var4 instanceof Class1147) {
         Class1147 var5 = (Class1147)var4;
         var5.method5490(var1);
      }
   }
}