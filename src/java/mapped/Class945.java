package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Optional;
import java.util.Random;

public class Class945 extends TileEntity implements Class946, Class935 {
   private final NonNullList<ItemStack> field5329 = NonNullList.<ItemStack>method68(4, ItemStack.EMPTY);
   private final int[] field5330 = new int[4];
   private final int[] field5331 = new int[4];

   public Class945() {
      super(Class4387.field21452);
   }

   @Override
   public void method3647() {
      boolean var3 = this.method3775().<Boolean>method23463(Class3244.field18698);
      boolean var4 = this.field5324.isRemote;
      if (!var4) {
         if (!var3) {
            for (int var5 = 0; var5 < this.field5329.size(); var5++) {
               if (this.field5330[var5] > 0) {
                  this.field5330[var5] = MathHelper.method37775(this.field5330[var5] - 2, 0, this.field5331[var5]);
               }
            }
         } else {
            this.method3793();
         }
      } else if (var3) {
         this.method3794();
      }
   }

   private void method3793() {
      for (int var3 = 0; var3 < this.field5329.size(); var3++) {
         ItemStack var4 = this.field5329.get(var3);
         if (!var4.isEmpty()) {
            this.field5330[var3]++;
            if (this.field5330[var3] >= this.field5331[var3]) {
               Class927 var6 = new Class927(var4);
               ItemStack var7 = this.field5324
                  .method6816()
                  .<Class920, Class4850>method1030(Class7207.field30939, var6, this.field5324)
                  .<ItemStack>map(var1 -> var1.method14962(var6))
                  .orElse(var4);
               BlockPos var8 = this.getPos();
               Class7236.method22725(this.field5324, (double)var8.getX(), (double)var8.getY(), (double)var8.getZ(), var7);
               this.field5329.set(var3, ItemStack.EMPTY);
               this.method3799();
            }
         }
      }
   }

   private void method3794() {
      World var3 = this.method3734();
      if (var3 != null) {
         BlockPos var4 = this.getPos();
         Random var5 = var3.rand;
         if (var5.nextFloat() < 0.11F) {
            for (int var6 = 0; var6 < var5.nextInt(2) + 2; var6++) {
               Class3244.method11653(var3, var4, this.method3775().<Boolean>method23463(Class3244.field18699), false);
            }
         }

         int var17 = this.method3775().<Direction>method23463(Class3244.field18701).method534();

         for (int var7 = 0; var7 < this.field5329.size(); var7++) {
            if (!this.field5329.get(var7).isEmpty() && var5.nextFloat() < 0.2F) {
               Direction var8 = Direction.method547(Math.floorMod(var7 + var17, 4));
               float var9 = 0.3125F;
               double var10 = (double)var4.getX()
                  + 0.5
                  - (double)((float)var8.method539() * 0.3125F)
                  + (double)((float)var8.method537().method539() * 0.3125F);
               double var12 = (double)var4.getY() + 0.5;
               double var14 = (double)var4.getZ()
                  + 0.5
                  - (double)((float)var8.method541() * 0.3125F)
                  + (double)((float)var8.method537().method541() * 0.3125F);

               for (int var16 = 0; var16 < 4; var16++) {
                  var3.method6746(ParticleTypes.field34092, var10, var12, var14, 0.0, 5.0E-4, 0.0);
               }
            }
         }
      }
   }

   public NonNullList<ItemStack> method3795() {
      return this.field5329;
   }

   @Override
   public void method3645(BlockState var1, CompoundNBT var2) {
      super.method3645(var1, var2);
      this.field5329.clear();
      Class7920.method26567(var2, this.field5329);
      if (var2.contains("CookingTimes", 11)) {
         int[] var5 = var2.method128("CookingTimes");
         System.arraycopy(var5, 0, this.field5330, 0, Math.min(this.field5331.length, var5.length));
      }

      if (var2.contains("CookingTotalTimes", 11)) {
         int[] var6 = var2.method128("CookingTotalTimes");
         System.arraycopy(var6, 0, this.field5331, 0, Math.min(this.field5331.length, var6.length));
      }
   }

   @Override
   public CompoundNBT write(CompoundNBT var1) {
      this.method3796(var1);
      var1.method111("CookingTimes", this.field5330);
      var1.method111("CookingTotalTimes", this.field5331);
      return var1;
   }

   private CompoundNBT method3796(CompoundNBT var1) {
      super.write(var1);
      Class7920.method26566(var1, this.field5329, true);
      return var1;
   }

   @Nullable
   @Override
   public SUpdateTileEntityPacket method3776() {
      return new SUpdateTileEntityPacket(this.field5325, 13, this.method3777());
   }

   @Override
   public CompoundNBT method3777() {
      return this.method3796(new CompoundNBT());
   }

   public Optional<Class4850> method3797(ItemStack var1) {
      return !this.field5329.stream().noneMatch(ItemStack::isEmpty)
         ? this.field5324.method6816().<Class920, Class4850>method1030(Class7207.field30939, new Class927(var1), this.field5324)
         : Optional.<Class4850>empty();
   }

   public boolean method3798(ItemStack var1, int var2) {
      for (int var5 = 0; var5 < this.field5329.size(); var5++) {
         ItemStack var6 = this.field5329.get(var5);
         if (var6.isEmpty()) {
            this.field5331[var5] = var2;
            this.field5330[var5] = 0;
            this.field5329.set(var5, var1.method32106(1));
            this.method3799();
            return true;
         }
      }

      return false;
   }

   private void method3799() {
      this.method3622();
      this.method3734().notifyBlockUpdate(this.getPos(), this.method3775(), this.method3775(), 3);
   }

   @Override
   public void method3625() {
      this.field5329.clear();
   }

   public void method3800() {
      if (this.field5324 != null) {
         if (!this.field5324.isRemote) {
            Class7236.method22724(this.field5324, this.getPos(), this.method3795());
         }

         this.method3799();
      }
   }
}
