package remapped;

import java.util.ArrayList;

public class class_2791 extends class_9128 {
   private ArrayList<class_5840> field_13712 = new ArrayList<class_5840>();
   private int field_13711;
   private int field_13713;

   public class_2791() {
      super(class_5664.field_28717, "PingSpoof", "Makes you lagggy.");
      this.method_42010(new class_2748<Float>("Lag", "Your ping (ms)", 1000.0F, Float.class, 50.0F, 2000.0F, 10.0F));
      this.method_42010(new class_8563("Inv Bypass", "Avoid inventory glitchs on some servers", false));
   }

   @class_9148
   public void method_12682(class_717 var1) {
      if (!this.method_42015()) {
         class_3620 var4 = (class_3620) SigmaMainClass.method_3328().method_3298().method_847(class_4557.class);
         if (!var4.method_42015() || !var4.method_42016("Type").equalsIgnoreCase("TP") || !var4.method_16864().method_42007("Ping spoof")) {
            return;
         }
      }

      this.field_13712.clear();
   }

   @class_9148
   public void method_12683(class_5596 var1) {
      if (!this.method_42015()) {
         class_3620 var4 = (class_3620) SigmaMainClass.method_3328().method_3298().method_847(class_4557.class);
         if (!var4.method_42015() || !var4.method_42016("Type").equalsIgnoreCase("TP") || !var4.method_16864().method_42007("Ping spoof")) {
            return;
         }
      }

      this.field_13711++;
      if (field_46692.field_9632 != null && field_46692.method_8530() != null) {
         if (field_46692.field_9632.field_41697 <= 1) {
            this.field_13712.clear();
         }

         if (!this.field_13712.isEmpty()) {
            int var7 = this.field_13712.size();

            for (int var5 = 0; var5 < var7; var5++) {
               class_5840 var6 = this.field_13712.get(var5);
               if (var6.method_26634()) {
                  field_46692.method_8614().method_9091();
                  class_5121.method_23491(var6.method_26633(), field_46692.method_8614().method_9091().field_26435);
                  this.field_13712.remove(var5);
                  var7--;
                  var5--;
               }
            }
         }
      }
   }

   @class_9148
   public void method_12685(class_2157 var1) {
      class_6310 var4 = var1.method_10047();
      if (var4 instanceof class_5955) {
         class_5955 var5 = (class_5955)var4;
         this.field_13713 = var5.method_27203();
      }
   }

   @class_9148
   public void method_12684(class_139 var1) {
      if (!this.method_42015()) {
         class_3620 var4 = (class_3620) SigmaMainClass.method_3328().method_3298().method_847(class_4557.class);
         if (!var4.method_42015() || !var4.method_42016("Type").equalsIgnoreCase("TP") || !var4.method_16864().method_42007("Ping spoof")) {
            return;
         }
      }

      if (field_46692.method_8530() != null) {
         class_6310 var7 = var1.method_557();
         if (!(var7 instanceof class_7573)) {
            if (!(var7 instanceof class_8913)) {
               if (var7 instanceof class_509 && this.field_13711 > 0) {
                  class_509 var5 = (class_509)var7;
               } else if (!(var7 instanceof class_2073)) {
                  if (!(var7 instanceof class_3727) && !(var7 instanceof class_5491) && !(var7 instanceof class_5149) && !(var7 instanceof class_9860)) {
                  }
               } else {
                  this.field_13711 = 0;
               }
            } else {
               class_8913 var8 = (class_8913)var7;
               int var6 = var8.method_40996() - this.field_13713;
               if (var6 > 0 || var6 < -20 || !this.method_42007("Inv Bypass")) {
                  this.field_13712.add(new class_5840(this, (long)var8, (long)this.method_42002("Lag")));
                  var1.method_29715(true);
               }
            }
         } else {
            class_7573 var9 = (class_7573)var7;
            this.field_13712.add(new class_5840(this, (long)var9, (long)this.method_42002("Lag")));
            var1.method_29715(true);
         }
      }
   }
}