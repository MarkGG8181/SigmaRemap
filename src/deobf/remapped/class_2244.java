package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class class_2244 extends class_9128 {
   private List<class_8670> field_11176;
   public class_8145 field_11174;
   public class_1343 field_11171;
   public Thread field_11172;
   public boolean field_11175 = false;

   public class_2244() {
      super(class_5664.field_28711, "JelloAIBot", "Experimental");
   }

   @Override
   public void method_42020() {
      SigmaMainClass.method_3328().method_3301().method_27144();
      this.field_11172 = null;
   }

   public class_8145 method_10319() {
      ArrayList var3 = Lists.newArrayList(field_46692.field_9601.method_736());
      var3.remove(field_46692.field_9632);
      Iterator var4 = var3.iterator();

      while (var4.hasNext()) {
         class_8145 var5 = (class_8145)var4.next();
         if (!(var5 instanceof class_704) || SigmaMainClass.method_3328().method_3331().method_20495(var5) || !class_314.method_1413(var5, 2.0F)) {
            var4.remove();
         }
      }

      List var6 = class_7494.method_34096(var3);
      return var6.size() != 0 ? (class_8145)var6.get(0) : null;
   }

   public boolean method_10320() {
      return this.field_11174 == null || this.field_11174.field_41736.method_6195(this.field_11171) > 6.0;
   }

   @class_9148
   public void method_10321(class_5596 var1) {
      if (field_46692.field_9632 != null) {
         if (field_46692.field_9632.field_41697 % 14 == 0) {
            class_8145 var4 = this.method_10319();
            if (this.field_11172 == null
               && (this.field_11176 == null || this.field_11176.isEmpty() || (var4 != this.field_11174 || this.method_10320()) && var4 != null)) {
               this.field_11172 = new Thread(() -> {
                  class_314.method_1443("calc");
                  this.field_11175 = true;

                  try {
                     class_9806 var4x = new class_9806();
                     class_8670 var5 = new class_8670(new class_7047(field_46692.field_9632.method_37075()));
                     class_4265 var6 = new class_4265(this.field_11174 = var4);
                     this.field_11171 = this.field_11174.field_41736;
                     class_1623 var7 = new class_1623(var5, var6);
                     var7.field_8450 = true;
                     var7.field_8451 = 310;
                     var7.field_8448 = 20000;
                     var7.field_8453 = true;
                     var7.field_8455 = true;
                     this.field_11176 = var4x.method_45226(var7);
                     SigmaMainClass.method_3328().method_3301().method_27153(this.field_11176);
                     this.field_11172 = null;
                     class_314.method_1443("calc" + this.field_11176.size());
                  } catch (Exception var8) {
                     var8.printStackTrace();
                     this.field_11172 = null;
                  }
               });
               this.field_11172.start();
            }
         }
      }
   }
}