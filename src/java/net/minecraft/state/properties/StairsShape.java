package net.minecraft.state.properties;

import net.minecraft.util.IStringSerializable;

public enum StairsShape implements IStringSerializable {
   STRAIGHT("straight"),
   INNER_LEFT("inner_left"),
   INNER_RIGHT("inner_right"),
   OUTER_LEFT("outer_left"),
   OUTER_RIGHT("outer_right");

   private final String name;

   private StairsShape(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return this.name;
   }

   @Override
   public String getString() {
      return this.name;
   }
}
