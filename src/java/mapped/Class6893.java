package mapped;

public class Class6893 {
   private int field29870;

   public boolean method21053() {
      this.field29870++;
      return this.field29870 == 1;
   }

   public boolean method21054() {
      if (this.field29870 > 0) {
         this.field29870--;
         return this.field29870 == 0;
      } else {
         return false;
      }
   }

   public boolean method21055() {
      return this.field29870 > 0;
   }

   public int method21056() {
      return this.field29870;
   }

   @Override
   public String toString() {
      return "lockCount: " + this.field29870;
   }
}
