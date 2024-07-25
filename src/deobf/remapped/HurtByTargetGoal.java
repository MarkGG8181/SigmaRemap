package remapped;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public class HurtByTargetGoal extends class_956 {
   private static String[] field_43056;
   private static final class_4931 field_43054 = new class_4931().method_22602().method_22608();
   private boolean field_43053;
   private int field_43058;
   private final Class<?>[] field_43057;
   private Class<?>[] field_43055;

   public HurtByTargetGoal(class_4612 var1, Class<?>... var2) {
      super(var1, true);
      this.field_43057 = var2;
      this.method_16800(EnumSet.<Flag>of(Flag.TARGET));
   }

   @Override
   public boolean method_16795() {
      int var3 = this.field_4915.method_26577();
      LivingEntity var4 = this.field_4915.method_26531();
      if (var3 != this.field_43058 && var4 != null) {
         if (var4.getType() == EntityType.field_34300 && this.field_4915.world.getGameRules().getBoolean(GameRules.field_1039)) {
            return false;
         } else {
            for (Class var8 : this.field_43057) {
               if (var8.isAssignableFrom(var4.getClass())) {
                  return false;
               }
            }

            return this.method_4210(var4, field_43054);
         }
      } else {
         return false;
      }
   }

   public HurtByTargetGoal setCallsForHelp(Class<?>... var1) {
      this.field_43053 = true;
      this.field_43055 = var1;
      return this;
   }

   @Override
   public void method_16796() {
      this.field_4915.method_26860(this.field_4915.method_26531());
      this.field_4918 = this.field_4915.getAttackTarget();
      this.field_43058 = this.field_4915.method_26577();
      this.field_4922 = 300;
      if (this.field_43053) {
         this.method_38755();
      }

      super.method_16796();
   }

   public void method_38755() {
      double var3 = this.method_4211();
      Box var5 = Box.method_18911(this.field_4915.method_37245()).method_18899(var3, 10.0, var3);
      List var6 = this.field_4915.world.method_25874(this.field_4915.getClass(), var5);
      Iterator var7 = var6.iterator();

      while (true) {
         MobEntity var8;
         while (true) {
            if (!var7.hasNext()) {
               return;
            }

            var8 = (MobEntity)var7.next();
            if (this.field_4915 != var8
               && var8.getAttackTarget() == null
               && (!(this.field_4915 instanceof class_8990) || ((class_8990)this.field_4915).method_41207() == ((class_8990)var8).method_41207())
               && !var8.method_37344(this.field_4915.method_26531())) {
               if (this.field_43055 == null) {
                  break;
               }

               boolean var9 = false;

               for (Class var13 : this.field_43055) {
                  if (var8.getClass() == var13) {
                     var9 = true;
                     break;
                  }
               }

               if (!var9) {
                  break;
               }
            }
         }

         this.method_38756(var8, this.field_4915.method_26531());
      }
   }

   public void method_38756(MobEntity var1, LivingEntity var2) {
      var1.method_26860(var2);
   }
}