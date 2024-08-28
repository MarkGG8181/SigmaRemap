package mapped;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;
import net.minecraft.util.text.TextFormatting;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class7535 extends Class7530 {
   private static final Logger field32340 = LogManager.getLogger();
   private Class6886 field32341;
   private Class39 field32342;

   public Class7535() {
      super("scoreboard");
   }

   public void method24629(Class6886 var1) {
      this.field32341 = var1;
      if (this.field32342 != null) {
         this.method24591(this.field32342);
      }
   }

   @Override
   public void method24591(Class39 var1) {
      if (this.field32341 != null) {
         this.method24633(var1.method131("Objectives", 10));
         this.field32341.method21013(var1.method131("PlayerScores", 10));
         if (var1.method119("DisplaySlots", 10)) {
            this.method24632(var1.method130("DisplaySlots"));
         }

         if (var1.method119("Teams", 9)) {
            this.method24630(var1.method131("Teams", 10));
         }
      } else {
         this.field32342 = var1;
      }
   }

   public void method24630(Class41 var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         Class39 var5 = var1.method153(var4);
         String var6 = var5.method126("Name");
         if (var6.length() > 16) {
            var6 = var6.substring(0, 16);
         }

         Class8218 var7 = this.field32341.method20991(var6);
         IFormattableTextComponent var8 = ITextComponent$Serializer.func_240643_a_(var5.method126("DisplayName"));
         if (var8 != null) {
            var7.method28570(var8);
         }

         if (var5.method119("TeamColor", 8)) {
            var7.method28590(TextFormatting.getValueByName(var5.method126("TeamColor")));
         }

         if (var5.method119("AllowFriendlyFire", 99)) {
            var7.method28579(var5.method132("AllowFriendlyFire"));
         }

         if (var5.method119("SeeFriendlyInvisibles", 99)) {
            var7.method28581(var5.method132("SeeFriendlyInvisibles"));
         }

         if (var5.method119("MemberNamePrefix", 8)) {
            IFormattableTextComponent var9 = ITextComponent$Serializer.func_240643_a_(var5.method126("MemberNamePrefix"));
            if (var9 != null) {
               var7.method28571(var9);
            }
         }

         if (var5.method119("MemberNameSuffix", 8)) {
            IFormattableTextComponent var10 = ITextComponent$Serializer.func_240643_a_(var5.method126("MemberNameSuffix"));
            if (var10 != null) {
               var7.method28573(var10);
            }
         }

         if (var5.method119("NameTagVisibility", 8)) {
            Class2225 var11 = Class2225.method8958(var5.method126("NameTagVisibility"));
            if (var11 != null) {
               var7.method28584(var11);
            }
         }

         if (var5.method119("DeathMessageVisibility", 8)) {
            Class2225 var12 = Class2225.method8958(var5.method126("DeathMessageVisibility"));
            if (var12 != null) {
               var7.method28585(var12);
            }
         }

         if (var5.method119("CollisionRule", 8)) {
            Class2212 var13 = Class2212.method8939(var5.method126("CollisionRule"));
            if (var13 != null) {
               var7.method28587(var13);
            }
         }

         this.method24631(var7, var5.method131("Players", 8));
      }
   }

   public void method24631(Class8218 var1, Class41 var2) {
      for (int var5 = 0; var5 < var2.size(); var5++) {
         this.field32341.method20993(var2.method160(var5), var1);
      }
   }

   public void method24632(Class39 var1) {
      for (int var4 = 0; var4 < 19; var4++) {
         if (var1.method119("slot_" + var4, 8)) {
            String var5 = var1.method126("slot_" + var4);
            Class8375 var6 = this.field32341.method20976(var5);
            this.field32341.method20988(var4, var6);
         }
      }
   }

   public void method24633(Class41 var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         Class39 var5 = var1.method153(var4);
         Class9008.method33278(var5.method126("CriteriaName")).ifPresent(var2 -> {
            String var5x = var5.method126("Name");
            if (var5x.length() > 16) {
               var5x = var5x.substring(0, 16);
            }

            IFormattableTextComponent var6 = ITextComponent$Serializer.func_240643_a_(var5.method126("DisplayName"));
            Class2316 var7 = Class2316.method9089(var5.method126("RenderType"));
            this.field32341.method20977(var5x, var2, var6, var7);
         });
      }
   }

   @Override
   public Class39 method24592(Class39 var1) {
      if (this.field32341 != null) {
         var1.method99("Objectives", this.method24636());
         var1.method99("PlayerScores", this.field32341.method21012());
         var1.method99("Teams", this.method24634());
         this.method24635(var1);
         return var1;
      } else {
         field32340.warn("Tried to save scoreboard without having a scoreboard...");
         return var1;
      }
   }

   public Class41 method24634() {
      Class41 var3 = new Class41();

      for (Class8218 var5 : this.field32341.method20997()) {
         Class39 var6 = new Class39();
         var6.method109("Name", var5.method28567());
         var6.method109("DisplayName", ITextComponent$Serializer.toJson(var5.method28568()));
         if (var5.method28591().getColorIndex() >= 0) {
            var6.method109("TeamColor", var5.method28591().getFriendlyName());
         }

         var6.method115("AllowFriendlyFire", var5.method28578());
         var6.method115("SeeFriendlyInvisibles", var5.method28580());
         var6.method109("MemberNamePrefix", ITextComponent$Serializer.toJson(var5.method28572()));
         var6.method109("MemberNameSuffix", ITextComponent$Serializer.toJson(var5.method28574()));
         var6.method109("NameTagVisibility", var5.method28582().field14559);
         var6.method109("DeathMessageVisibility", var5.method28583().field14559);
         var6.method109("CollisionRule", var5.method28586().field14467);
         Class41 var7 = new Class41();

         for (String var9 : var5.method28575()) {
            var7.add(Class40.method150(var9));
         }

         var6.method99("Players", var7);
         var3.add(var6);
      }

      return var3;
   }

   public void method24635(Class39 var1) {
      Class39 var4 = new Class39();
      boolean var5 = false;

      for (int var6 = 0; var6 < 19; var6++) {
         Class8375 var7 = this.field32341.method20989(var6);
         if (var7 != null) {
            var4.method109("slot_" + var6, var7.method29336());
            var5 = true;
         }
      }

      if (var5) {
         var1.method99("DisplaySlots", var4);
      }
   }

   public Class41 method24636() {
      Class41 var3 = new Class41();

      for (Class8375 var5 : this.field32341.method20982()) {
         if (var5.method29337() != null) {
            Class39 var6 = new Class39();
            var6.method109("Name", var5.method29336());
            var6.method109("CriteriaName", var5.method29337().method33280());
            var6.method109("DisplayName", ITextComponent$Serializer.toJson(var5.method29338()));
            var6.method109("RenderType", var5.method29342().method9088());
            var3.add(var6);
         }
      }

      return var3;
   }
}