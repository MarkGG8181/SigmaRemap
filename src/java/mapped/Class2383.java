package mapped;

import sun.misc.Cleaner;

public class Class2383 extends Class2373 {
   private static final long field16262 = 8813991144303908703L;
   private short[] field16263;

   public Class2383(long var1) {
      this(var1, true);
   }

   public Class2383(long var1, boolean var3) {
      this.field16233 = Class2178.field14298;
      this.field16235 = 2L;
      if (var1 > 0L) {
         this.field16234 = var1;
         if (var1 <= (long)method9693()) {
            this.field16263 = new short[(int)var1];
         } else {
            this.field16238 = Class8133.field34961.allocateMemory(this.field16234 * this.field16235);
            if (var3) {
               this.method9694(var1);
            }

            Cleaner.create(this, new Class1630(this.field16238, this.field16234, this.field16235));
            Class8065.method27706(this.field16234 * this.field16235);
         }
      } else {
         throw new IllegalArgumentException(var1 + " is not a positive long value");
      }
   }

   public Class2383(long var1, short var3) {
      this.field16233 = Class2178.field14302;
      this.field16235 = 8L;
      if (var1 > 0L) {
         this.field16234 = var1;
         this.field16236 = true;
         this.field16263 = new short[]{var3};
      } else {
         throw new IllegalArgumentException(var1 + " is not a positive long value");
      }
   }

   public Class2383(short[] var1) {
      this.field16233 = Class2178.field14298;
      this.field16235 = 2L;
      this.field16234 = (long)var1.length;
      this.field16263 = var1;
   }

   public Class2383 clone() {
      if (!this.field16236) {
         Class2383 var3 = new Class2383(this.field16234, false);
         Class8133.method28169(this, 0L, var3, 0L, this.field16234);
         return var3;
      } else {
         return new Class2383(this.field16234, this.method9645(0L));
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (!super.equals(var1)) {
         return false;
      } else {
         Class2383 var4 = (Class2383)var1;
         return this.field16263 == var4.field16263;
      }
   }

   @Override
   public int hashCode() {
      return 29 * super.hashCode() + (this.field16263 == null ? 0 : this.field16263.hashCode());
   }

   public final Short method9636(long var1) {
      return this.method9645(var1);
   }

   public final Short method9638(long var1) {
      return Class8133.field34961.getShort(this.field16238 + this.field16235 * var1);
   }

   @Override
   public final boolean method9639(long var1) {
      if (this.field16238 == 0L) {
         return !this.field16236 ? this.field16263[(int)var1] != 0 : this.field16263[0] != 0;
      } else {
         return Class8133.field34961.getShort(this.field16238 + this.field16235 * var1) != 0;
      }
   }

   @Override
   public final byte method9641(long var1) {
      if (this.field16238 == 0L) {
         return !this.field16236 ? (byte)this.field16263[(int)var1] : (byte)this.field16263[0];
      } else {
         return (byte)Class8133.field34961.getShort(this.field16238 + this.field16235 * var1);
      }
   }

   @Override
   public final short method9643(long var1) {
      if (this.field16238 == 0L) {
         return !this.field16236 ? (short)(255 & this.field16263[(int)var1]) : (short)(255 & this.field16263[0]);
      } else {
         return (short)(255 & Class8133.field34961.getShort(this.field16238 + this.field16235 * var1));
      }
   }

   @Override
   public final short method9645(long var1) {
      if (this.field16238 == 0L) {
         return !this.field16236 ? this.field16263[(int)var1] : this.field16263[0];
      } else {
         return Class8133.field34961.getShort(this.field16238 + this.field16235 * var1);
      }
   }

   @Override
   public final int method9647(long var1) {
      if (this.field16238 == 0L) {
         return !this.field16236 ? this.field16263[(int)var1] : this.field16263[0];
      } else {
         return Class8133.field34961.getShort(this.field16238 + this.field16235 * var1);
      }
   }

   @Override
   public final long method9649(long var1) {
      if (this.field16238 == 0L) {
         return !this.field16236 ? (long)this.field16263[(int)var1] : (long)this.field16263[0];
      } else {
         return (long)Class8133.field34961.getShort(this.field16238 + this.field16235 * var1);
      }
   }

   @Override
   public final float method9651(long var1) {
      if (this.field16238 == 0L) {
         return !this.field16236 ? (float)this.field16263[(int)var1] : (float)this.field16263[0];
      } else {
         return (float)Class8133.field34961.getShort(this.field16238 + this.field16235 * var1);
      }
   }

   @Override
   public final double method9653(long var1) {
      if (this.field16238 == 0L) {
         return !this.field16236 ? (double)this.field16263[(int)var1] : (double)this.field16263[0];
      } else {
         return (double)Class8133.field34961.getShort(this.field16238 + this.field16235 * var1);
      }
   }

   public final short[] method9655() {
      return this.field16263;
   }

   @Override
   public final boolean[] method9656() {
      if (this.field16234 > 1073741824L) {
         return null;
      } else {
         boolean[] var3 = new boolean[(int)this.field16234];
         if (this.field16238 == 0L) {
            if (!this.field16236) {
               for (int var4 = 0; (long)var4 < this.field16234; var4++) {
                  var3[var4] = this.field16263[var4] != 0;
               }
            } else {
               boolean var6 = this.field16263[0] != 0;

               for (int var5 = 0; (long)var5 < this.field16234; var5++) {
                  var3[var5] = var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field16234; var7++) {
               short var8 = Class8133.field34961.getShort(this.field16238 + this.field16235 * (long)var7);
               var3[var7] = var8 != 0;
            }
         }

         return var3;
      }
   }

   @Override
   public final boolean[] method9657(boolean[] var1, long var2, long var4, long var6) {
      if (var2 < 0L || var2 >= this.field16234) {
         throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
      } else if (var4 < 0L || var4 > this.field16234 || var4 < var2) {
         throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
      } else if (var6 >= 1L) {
         long var10 = (long)Class9044.method33599((double)(var4 - var2) / (double)var6);
         if (var10 > 1073741824L) {
            return null;
         } else {
            boolean[] var12;
            if (var1 != null && (long)var1.length >= var10) {
               var12 = var1;
            } else {
               var12 = new boolean[(int)var10];
            }

            int var13 = 0;
            if (this.field16238 == 0L) {
               if (!this.field16236) {
                  for (long var14 = var2; var14 < var4; var14 += var6) {
                     short var16 = this.field16263[(int)var14];
                     var12[var13++] = var16 != 0;
                  }
               } else {
                  for (long var17 = var2; var17 < var4; var17 += var6) {
                     var12[var13++] = this.field16263[0] != 0;
                  }
               }
            } else {
               for (long var18 = var2; var18 < var4; var18 += var6) {
                  short var19 = Class8133.field34961.getShort(this.field16238 + this.field16235 * var18);
                  var12[var13++] = var19 != 0;
               }
            }

            return var12;
         }
      } else {
         throw new IllegalArgumentException("step < 1");
      }
   }

   @Override
   public final byte[] method9658() {
      if (this.field16234 > 1073741824L) {
         return null;
      } else {
         byte[] var3 = new byte[(int)this.field16234];
         if (this.field16238 == 0L) {
            if (!this.field16236) {
               for (int var4 = 0; (long)var4 < this.field16234; var4++) {
                  var3[var4] = (byte)this.field16263[var4];
               }
            } else {
               byte var6 = (byte)this.field16263[0];

               for (int var5 = 0; (long)var5 < this.field16234; var5++) {
                  var3[var5] = var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field16234; var7++) {
               var3[var7] = (byte)Class8133.field34961.getShort(this.field16238 + this.field16235 * (long)var7);
            }
         }

         return var3;
      }
   }

   @Override
   public final byte[] method9659(byte[] var1, long var2, long var4, long var6) {
      if (var2 < 0L || var2 >= this.field16234) {
         throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
      } else if (var4 < 0L || var4 > this.field16234 || var4 < var2) {
         throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
      } else if (var6 >= 1L) {
         long var10 = (long)Class9044.method33599((double)(var4 - var2) / (double)var6);
         if (var10 > 1073741824L) {
            return null;
         } else {
            byte[] var12;
            if (var1 != null && (long)var1.length >= var10) {
               var12 = var1;
            } else {
               var12 = new byte[(int)var10];
            }

            int var13 = 0;
            if (this.field16238 == 0L) {
               if (!this.field16236) {
                  for (long var14 = var2; var14 < var4; var14 += var6) {
                     var12[var13++] = (byte)this.field16263[(int)var14];
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = (byte)this.field16263[0];
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = (byte)Class8133.field34961.getShort(this.field16238 + this.field16235 * var17);
               }
            }

            return var12;
         }
      } else {
         throw new IllegalArgumentException("step < 1");
      }
   }

   @Override
   public final short[] method9660() {
      if (this.field16234 > 1073741824L) {
         return null;
      } else {
         short[] var3 = new short[(int)this.field16234];
         if (this.field16238 == 0L) {
            if (!this.field16236) {
               System.arraycopy(this.field16263, 0, var3, 0, (int)this.field16234);
            } else {
               short var4 = this.field16263[0];

               for (int var5 = 0; (long)var5 < this.field16234; var5++) {
                  var3[var5] = var4;
               }
            }
         } else {
            for (int var6 = 0; (long)var6 < this.field16234; var6++) {
               var3[var6] = Class8133.field34961.getShort(this.field16238 + this.field16235 * (long)var6);
            }
         }

         return var3;
      }
   }

   @Override
   public final short[] method9661(short[] var1, long var2, long var4, long var6) {
      if (var2 < 0L || var2 >= this.field16234) {
         throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
      } else if (var4 < 0L || var4 > this.field16234 || var4 < var2) {
         throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
      } else if (var6 >= 1L) {
         long var10 = (long)Class9044.method33599((double)(var4 - var2) / (double)var6);
         if (var10 > 1073741824L) {
            return null;
         } else {
            short[] var12;
            if (var1 != null && (long)var1.length >= var10) {
               var12 = var1;
            } else {
               var12 = new short[(int)var10];
            }

            int var13 = 0;
            if (this.field16238 == 0L) {
               if (!this.field16236) {
                  for (long var14 = var2; var14 < var4; var14 += var6) {
                     var12[var13++] = this.field16263[(int)var14];
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = this.field16263[0];
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = Class8133.field34961.getShort(this.field16238 + this.field16235 * var17);
               }
            }

            return var12;
         }
      } else {
         throw new IllegalArgumentException("step < 1");
      }
   }

   @Override
   public final int[] method9662() {
      if (this.field16234 > 1073741824L) {
         return null;
      } else {
         int[] var3 = new int[(int)this.field16234];
         if (this.field16238 == 0L) {
            if (!this.field16236) {
               for (int var4 = 0; (long)var4 < this.field16234; var4++) {
                  var3[var4] = this.field16263[var4];
               }
            } else {
               short var6 = this.field16263[0];

               for (int var5 = 0; (long)var5 < this.field16234; var5++) {
                  var3[var5] = var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field16234; var7++) {
               var3[var7] = Class8133.field34961.getShort(this.field16238 + this.field16235 * (long)var7);
            }
         }

         return var3;
      }
   }

   @Override
   public final int[] method9663(int[] var1, long var2, long var4, long var6) {
      if (var2 < 0L || var2 >= this.field16234) {
         throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
      } else if (var4 < 0L || var4 > this.field16234 || var4 < var2) {
         throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
      } else if (var6 >= 1L) {
         long var10 = (long)Class9044.method33599((double)(var4 - var2) / (double)var6);
         if (var10 > 1073741824L) {
            return null;
         } else {
            int[] var12;
            if (var1 != null && (long)var1.length >= var10) {
               var12 = var1;
            } else {
               var12 = new int[(int)var10];
            }

            int var13 = 0;
            if (this.field16238 == 0L) {
               if (!this.field16236) {
                  for (long var14 = var2; var14 < var4; var14 += var6) {
                     var12[var13++] = this.field16263[(int)var14];
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = this.field16263[0];
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = Class8133.field34961.getShort(this.field16238 + this.field16235 * var17);
               }
            }

            return var12;
         }
      } else {
         throw new IllegalArgumentException("step < 1");
      }
   }

   @Override
   public final long[] method9664() {
      if (this.field16234 > 1073741824L) {
         return null;
      } else {
         long[] var3 = new long[(int)this.field16234];
         if (this.field16238 == 0L) {
            if (!this.field16236) {
               for (int var4 = 0; (long)var4 < this.field16234; var4++) {
                  var3[var4] = (long)this.field16263[var4];
               }
            } else {
               long var5 = (long)this.field16263[0];

               for (int var7 = 0; (long)var7 < this.field16234; var7++) {
                  var3[var7] = var5;
               }
            }
         } else {
            for (int var8 = 0; (long)var8 < this.field16234; var8++) {
               var3[var8] = (long)Class8133.field34961.getShort(this.field16238 + this.field16235 * (long)var8);
            }
         }

         return var3;
      }
   }

   @Override
   public final long[] method9665(long[] var1, long var2, long var4, long var6) {
      if (var2 < 0L || var2 >= this.field16234) {
         throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
      } else if (var4 < 0L || var4 > this.field16234 || var4 < var2) {
         throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
      } else if (var6 >= 1L) {
         long var10 = (long)Class9044.method33599((double)(var4 - var2) / (double)var6);
         if (var10 > 1073741824L) {
            return null;
         } else {
            long[] var12;
            if (var1 != null && (long)var1.length >= var10) {
               var12 = var1;
            } else {
               var12 = new long[(int)var10];
            }

            int var13 = 0;
            if (this.field16238 == 0L) {
               if (!this.field16236) {
                  for (long var14 = var2; var14 < var4; var14 += var6) {
                     var12[var13++] = (long)this.field16263[(int)var14];
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = (long)this.field16263[0];
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = (long)Class8133.field34961.getShort(this.field16238 + this.field16235 * var17);
               }
            }

            return var12;
         }
      } else {
         throw new IllegalArgumentException("step < 1");
      }
   }

   @Override
   public final float[] method9666() {
      if (this.field16234 > 1073741824L) {
         return null;
      } else {
         float[] var3 = new float[(int)this.field16234];
         if (this.field16238 == 0L) {
            if (!this.field16236) {
               for (int var4 = 0; (long)var4 < this.field16234; var4++) {
                  var3[var4] = (float)this.field16263[var4];
               }
            } else {
               float var6 = (float)this.field16263[0];

               for (int var5 = 0; (long)var5 < this.field16234; var5++) {
                  var3[var5] = var6;
               }
            }
         } else {
            for (int var7 = 0; (long)var7 < this.field16234; var7++) {
               var3[var7] = (float)Class8133.field34961.getShort(this.field16238 + this.field16235 * (long)var7);
            }
         }

         return var3;
      }
   }

   @Override
   public final float[] method9667(float[] var1, long var2, long var4, long var6) {
      if (var2 < 0L || var2 >= this.field16234) {
         throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
      } else if (var4 < 0L || var4 > this.field16234 || var4 < var2) {
         throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
      } else if (var6 >= 1L) {
         long var10 = (long)Class9044.method33599((double)(var4 - var2) / (double)var6);
         if (var10 > 1073741824L) {
            return null;
         } else {
            float[] var12;
            if (var1 != null && (long)var1.length >= var10) {
               var12 = var1;
            } else {
               var12 = new float[(int)var10];
            }

            int var13 = 0;
            if (this.field16238 == 0L) {
               if (!this.field16236) {
                  for (long var14 = var2; var14 < var4; var14 += var6) {
                     var12[var13++] = (float)this.field16263[(int)var14];
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = (float)this.field16263[0];
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = (float)Class8133.field34961.getShort(this.field16238 + this.field16235 * var17);
               }
            }

            return var12;
         }
      } else {
         throw new IllegalArgumentException("step < 1");
      }
   }

   @Override
   public final double[] method9668() {
      if (this.field16234 > 1073741824L) {
         return null;
      } else {
         double[] var3 = new double[(int)this.field16234];
         if (this.field16238 == 0L) {
            if (!this.field16236) {
               for (int var4 = 0; (long)var4 < this.field16234; var4++) {
                  var3[var4] = (double)this.field16263[var4];
               }
            } else {
               double var5 = (double)this.field16263[0];

               for (int var7 = 0; (long)var7 < this.field16234; var7++) {
                  var3[var7] = var5;
               }
            }
         } else {
            for (int var8 = 0; (long)var8 < this.field16234; var8++) {
               var3[var8] = (double)Class8133.field34961.getShort(this.field16238 + this.field16235 * (long)var8);
            }
         }

         return var3;
      }
   }

   @Override
   public final double[] method9669(double[] var1, long var2, long var4, long var6) {
      if (var2 < 0L || var2 >= this.field16234) {
         throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
      } else if (var4 < 0L || var4 > this.field16234 || var4 < var2) {
         throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
      } else if (var6 >= 1L) {
         long var10 = (long)Class9044.method33599((double)(var4 - var2) / (double)var6);
         if (var10 > 1073741824L) {
            return null;
         } else {
            double[] var12;
            if (var1 != null && (long)var1.length >= var10) {
               var12 = var1;
            } else {
               var12 = new double[(int)var10];
            }

            int var13 = 0;
            if (this.field16238 == 0L) {
               if (!this.field16236) {
                  for (long var14 = var2; var14 < var4; var14 += var6) {
                     var12[var13++] = (double)this.field16263[(int)var14];
                  }
               } else {
                  for (long var16 = var2; var16 < var4; var16 += var6) {
                     var12[var13++] = (double)this.field16263[0];
                  }
               }
            } else {
               for (long var17 = var2; var17 < var4; var17 += var6) {
                  var12[var13++] = (double)Class8133.field34961.getShort(this.field16238 + this.field16235 * var17);
               }
            }

            return var12;
         }
      } else {
         throw new IllegalArgumentException("step < 1");
      }
   }

   @Override
   public final void method9671(long var1, Object var3) {
      Class8133.field34961.putShort(this.field16238 + this.field16235 * var1, (Short)var3);
   }

   @Override
   public final void method9673(long var1, boolean var3) {
      if (this.field16238 == 0L) {
         if (this.field16236) {
            throw new IllegalAccessError("Constant arrays cannot be modified.");
         }

         this.field16263[(int)var1] = (short)(!var3 ? 0 : 1);
      } else {
         Class8133.field34961.putShort(this.field16238 + this.field16235 * var1, (short)(!var3 ? 0 : 1));
      }
   }

   @Override
   public final void method9675(long var1, byte var3) {
      if (this.field16238 == 0L) {
         if (this.field16236) {
            throw new IllegalAccessError("Constant arrays cannot be modified.");
         }

         this.field16263[(int)var1] = (short)var3;
      } else {
         Class8133.field34961.putShort(this.field16238 + this.field16235 * var1, (short)var3);
      }
   }

   @Override
   public final void method9677(long var1, short var3) {
      this.method9679(var1, var3);
   }

   @Override
   public final void method9679(long var1, short var3) {
      if (this.field16238 == 0L) {
         if (this.field16236) {
            throw new IllegalAccessError("Constant arrays cannot be modified.");
         }

         this.field16263[(int)var1] = var3;
      } else {
         Class8133.field34961.putShort(this.field16238 + this.field16235 * var1, var3);
      }
   }

   @Override
   public final void method9681(long var1, int var3) {
      if (this.field16238 == 0L) {
         if (this.field16236) {
            throw new IllegalAccessError("Constant arrays cannot be modified.");
         }

         this.field16263[(int)var1] = (short)var3;
      } else {
         Class8133.field34961.putShort(this.field16238 + this.field16235 * var1, (short)var3);
      }
   }

   @Override
   public final void method9683(long var1, long var3) {
      if (this.field16238 == 0L) {
         if (this.field16236) {
            throw new IllegalAccessError("Constant arrays cannot be modified.");
         }

         this.field16263[(int)var1] = (short)((int)var3);
      } else {
         Class8133.field34961.putShort(this.field16238 + this.field16235 * var1, (short)((int)var3));
      }
   }

   @Override
   public final void method9685(long var1, float var3) {
      if (this.field16238 == 0L) {
         if (this.field16236) {
            throw new IllegalAccessError("Constant arrays cannot be modified.");
         }

         this.field16263[(int)var1] = (short)((int)var3);
      } else {
         Class8133.field34961.putShort(this.field16238 + this.field16235 * var1, (short)((int)var3));
      }
   }

   @Override
   public final void method9687(long var1, double var3) {
      if (this.field16238 == 0L) {
         if (this.field16236) {
            throw new IllegalAccessError("Constant arrays cannot be modified.");
         }

         this.field16263[(int)var1] = (short)((int)var3);
      } else {
         Class8133.field34961.putShort(this.field16238 + this.field16235 * var1, (short)((int)var3));
      }
   }
}
