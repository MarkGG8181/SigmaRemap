package remapped;

import java.util.ArrayList;
import java.util.List;

public class DelayAntiKB extends Module {
   private List<Packet<?>> field_32171 = new ArrayList<Packet<?>>();
   public int field_32172 = 0;

   public DelayAntiKB() {
      super(Category.COMBAT, "Delay", "For anticheats with \"good\" velocity checks");
      this.addSetting(new FloatSetting<Float>("Delay", "Ticks delay", 7.0F, Float.class, 1.0F, 20.0F, 1.0F));
      this.addSetting(new FloatSetting<Float>("H-Multiplier", "Horizontal velocity multiplier", 0.0F, Float.class, 0.0F, 1.0F, 0.01F));
      this.addSetting(new FloatSetting<Float>("V-Multiplier", "Vertical velocity multiplier", 0.0F, Float.class, 0.0F, 1.0F, 0.01F));
   }

   @EventListen
   private void method_28731(PacketEvent var1) {
      if (this.method_42015()) {
         if (var1.method_557() instanceof class_1897) {
            class_1897 var4 = (class_1897)var1.method_557();
            this.field_32171.add(var4);
            var1.method_29715(true);
         }

         if (client.thePlayer != null && var1.method_557() instanceof class_4548) {
            class_4548 var5 = (class_4548)var1.method_557();
            if (var5.method_21093() == client.thePlayer.method_37145()) {
               this.field_32171.add(var5);
               var1.method_29715(true);
               if (this.field_32172 == 0) {
                  this.field_32172 = (int)this.getFloatValueByName("Delay");
               }
            }
         }
      }
   }

   @EventListen
   private void method_28732(class_2157 var1) {
      if (this.method_42015()) {
         if (var1.method_10047() instanceof class_3398) {
            class_3398 var4 = (class_3398)var1.method_10047();
            class_92 var5 = var4.method_15694();
            if (var5 != class_92.field_183) {
            }
         }
      }
   }

   @EventListen
   private void method_28730(class_5596 var1) {
      if (this.field_32172 != 0) {
         if (this.field_32172 > 0) {
            this.field_32172--;
         }
      } else {
         this.method_28729();
      }
   }

   private void method_28729() {
      for (Packet var4 : this.field_32171) {
         if (!(var4 instanceof class_4548)) {
            if (var4 instanceof class_1897) {
               class_1897 var5 = (class_1897)var4;
               var5.field_9687 = var5.field_9687 * this.getFloatValueByName("H-Multiplier");
               var5.field_9693 = var5.field_9693 * this.getFloatValueByName("H-Multiplier");
               var5.field_9692 = var5.field_9692 * this.getFloatValueByName("V-Multiplier");
               client.method_8614().method_1931(var5);
            }
         } else {
            class_4548 var6 = (class_4548)var4;
            var6.field_22171 = (int)((float)var6.field_22171 * this.getFloatValueByName("H-Multiplier"));
            var6.field_22167 = (int)((float)var6.field_22167 * this.getFloatValueByName("H-Multiplier"));
            var6.field_22168 = (int)((float)var6.field_22168 * this.getFloatValueByName("V-Multiplier"));
            client.method_8614().method_1936(var6);
         }
      }

      this.field_32171.clear();
   }
}
