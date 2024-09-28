package mapped;

import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.YoutubeThumbnail;
import com.mentalfrostbyte.jello.unmapped.MusicPlayerTrumnaheil;

public class Class511 implements Runnable {
   public final MusicPlayerTrumnaheil thubmnail;
   public final ColorHelper colorHelper;
   public final MusicPlayer musicPlayer;
   public final MusicPlayer musicPlayer2;

   public Class511(MusicPlayer var1, MusicPlayerTrumnaheil var2, ColorHelper var3, MusicPlayer var4) {
      this.musicPlayer2 = var1;
      this.thubmnail = var2;
      this.colorHelper = var3;
      this.musicPlayer = var4;
   }

   @Override
   public void run() {
      if (!MusicPlayer.method13206(this.musicPlayer2).method13231(this.thubmnail.id)) {
         ButtonPanel var3;
         MusicPlayer.method13206(this.musicPlayer2)
            .addToList(
               var3 = new ButtonPanel(
                  MusicPlayer.method13206(this.musicPlayer2),
                  this.thubmnail.id,
                  0,
                  MusicPlayer.method13206(this.musicPlayer2).getButton().method13241().size() * MusicPlayer.method13207(this.musicPlayer2),
                  MusicPlayer.method13208(this.musicPlayer2),
                  MusicPlayer.method13207(this.musicPlayer2),
                  this.colorHelper,
                  this.thubmnail.displayName,
                  ResourceRegistry.JelloLightFont14
               )
            );
         Class4339 var4;
         this.musicPlayer
            .addToList(
               var4 = new Class4339(
                  this.musicPlayer,
                  this.thubmnail.id,
                  MusicPlayer.method13208(this.musicPlayer2),
                  0,
                  this.musicPlayer.getWidthA() - MusicPlayer.method13208(this.musicPlayer2),
                  this.musicPlayer.getHeightA() - MusicPlayer.method13209(this.musicPlayer2),
                  ColorHelper.field27961,
                  this.thubmnail.displayName
               )
            );
         var4.method13514(true);
         var4.setEnabled(false);
         var4.method13300(false);
         if (this.thubmnail.thumbnailList != null) {
            for (int var5 = 0; var5 < this.thubmnail.thumbnailList.size(); var5++) {
               YoutubeThumbnail var6 = this.thubmnail.thumbnailList.get(var5);
               Class4286 var7 = null;
               byte var8 = 65;
               byte var9 = 10;
               if (!var4.method13231(this.thubmnail.id)) {
                  var4.addToList(
                     var7 = new Class4286(
                        var4,
                        var9 + var5 % 3 * 183 - (var5 % 3 <= 0 ? 0 : var9) - (var5 % 3 <= 1 ? 0 : var9),
                        var8 + var9 + (var5 - var5 % 3) / 3 * 210,
                        183,
                        220,
                        var6
                     )
                  );
                  var7.doThis((var3x, var4x) -> MusicPlayer.method13211(this.musicPlayer2, thubmnail, var6));
               }
            }
         }

         var3.doThis((var2, var3x) -> MusicPlayer.method13210(this.musicPlayer2, var4));
      }
   }
}
