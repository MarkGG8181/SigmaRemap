package remapped;

import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_8036 extends class_2451 implements class_1538 {
   private static final Logger field_41123 = LogManager.getLogger();

   public class_8036(class_317 var1) {
      super(var1);
   }

   public static boolean method_36487(class_6098 var0) {
      class_5734 var3 = var0.method_27990();
      return var3 != null && (var3.method_25938("LodestoneDimension") || var3.method_25938("LodestonePos"));
   }

   @Override
   public boolean method_11252(class_6098 var1) {
      return method_36487(var1) || super.method_11252(var1);
   }

   public static Optional<class_5621<class_6486>> method_36488(class_5734 var0) {
      return class_6486.field_33043.parse(class_3504.field_17178, var0.method_25929("LodestoneDimension")).result();
   }

   @Override
   public void method_11214(class_6098 var1, class_6486 var2, class_8145 var3, int var4, boolean var5) {
      if (!var2.field_33055 && method_36487(var1)) {
         class_5734 var8 = var1.method_27994();
         if (var8.method_25938("LodestoneTracked") && !var8.method_25933("LodestoneTracked")) {
            return;
         }

         Optional var9 = method_36488(var8);
         if (var9.isPresent()
            && var9.get() == var2.method_29545()
            && var8.method_25938("LodestonePos")
            && !((class_6331)var2).method_28969().method_6868(class_236.field_775, class_4338.method_20189(var8.method_25937("LodestonePos")))) {
            var8.method_25959("LodestonePos");
         }
      }
   }

   @Override
   public class_6910 method_11237(class_4734 var1) {
      class_1331 var4 = var1.method_21858();
      class_6486 var5 = var1.method_21862();
      if (!var5.method_28262(var4).method_8350(class_4783.field_23852)) {
         return super.method_11237(var1);
      } else {
         var5.method_43359((class_704)null, var4, class_463.field_2193, class_562.field_3335, 1.0F, 1.0F);
         class_704 var6 = var1.method_21868();
         class_6098 var7 = var1.method_21867();
         boolean var8 = !var6.field_3876.field_4944 && var7.method_27997() == 1;
         if (!var8) {
            class_6098 var9 = new class_6098(class_4897.field_24830, 1);
            class_5734 var10 = !var7.method_28002() ? new class_5734() : var7.method_27990().method_25944();
            var9.method_27965(var10);
            if (!var6.field_3876.field_4944) {
               var7.method_27970(1);
            }

            this.method_36486(var5.method_29545(), var4, var10);
            if (!var6.field_3853.method_32414(var9)) {
               var6.method_3153(var9, false);
            }
         } else {
            this.method_36486(var5.method_29545(), var4, var7.method_27994());
         }

         return class_6910.method_31659(var5.field_33055);
      }
   }

   private void method_36486(class_5621<class_6486> var1, class_1331 var2, class_5734 var3) {
      var3.method_25946("LodestonePos", class_4338.method_20190(var2));
      class_6486.field_33043
         .encodeStart(class_3504.field_17178, var1)
         .resultOrPartial(field_41123::error)
         .ifPresent(var1x -> var3.method_25946("LodestoneDimension", var1x));
      var3.method_25934("LodestoneTracked", true);
   }

   @Override
   public String method_11217(class_6098 var1) {
      return !method_36487(var1) ? super.method_11217(var1) : "item.minecraft.lodestone_compass";
   }
}