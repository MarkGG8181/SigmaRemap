package mapped;

import com.mentalfrostbyte.jello.unmapped.SettingType;
import com.mentalfrostbyte.jello.unmapped.Setting;

import java.util.List;

public class SubOptionSetting extends Class6006 {
   private static String[] field26190;

   public SubOptionSetting(String var1, String var2, boolean var3, List<Setting> var4) {
      super(var1, var2, SettingType.SUBOPTION, var3, var4);
   }

   public SubOptionSetting(String var1, String var2, boolean var3, Setting... var4) {
      super(var1, var2, SettingType.SUBOPTION, var3, var4);
   }
}