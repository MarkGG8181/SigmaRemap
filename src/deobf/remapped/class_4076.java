package remapped;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class class_4076 {
   private static final Map<String, String> field_19845 = new HashMap<String, String>();

   public static String method_18795(String var0) {
      String var3 = field_19845.get(var0);
      return var3 == null ? var0.toLowerCase(Locale.ROOT) : var3;
   }

   static {
      field_19845.put("block.cloth.break", "block.wool.break");
      field_19845.put("block.cloth.fall", "block.wool.fall");
      field_19845.put("block.cloth.hit", "block.wool.hit");
      field_19845.put("block.cloth.place", "block.wool.place");
      field_19845.put("block.cloth.step", "block.wool.step");
      field_19845.put("block.enderchest.close", "block.ender_chest.close");
      field_19845.put("block.enderchest.open", "block.ender_chest.open");
      field_19845.put("block.metal_pressureplate.click_off", "block.metal_pressure_plate.click_off");
      field_19845.put("block.metal_pressureplate.click_on", "block.metal_pressure_plate.click_on");
      field_19845.put("block.note.basedrum", "block.note_block.basedrum");
      field_19845.put("block.note.bass", "block.note_block.bass");
      field_19845.put("block.note.bell", "block.note_block.bell");
      field_19845.put("block.note.chime", "block.note_block.chime");
      field_19845.put("block.note.flute", "block.note_block.flute");
      field_19845.put("block.note.guitar", "block.note_block.guitar");
      field_19845.put("block.note.harp", "block.note_block.harp");
      field_19845.put("block.note.hat", "block.note_block.hat");
      field_19845.put("block.note.pling", "block.note_block.pling");
      field_19845.put("block.note.snare", "block.note_block.snare");
      field_19845.put("block.note.xylophone", "block.note_block.xylophone");
      field_19845.put("block.slime.break", "block.slime_block.break");
      field_19845.put("block.slime.fall", "block.slime_block.fall");
      field_19845.put("block.slime.hit", "block.slime_block.hit");
      field_19845.put("block.slime.place", "block.slime_block.place");
      field_19845.put("block.slime.step", "block.slime_block.step");
      field_19845.put("block.stone_pressureplate.click_off", "block.stone_pressure_plate.click_off");
      field_19845.put("block.stone_pressureplate.click_on", "block.stone_pressure_plate.click_on");
      field_19845.put("block.waterlily.place", "block.lily_pad.place");
      field_19845.put("block.wood_pressureplate.click_off", "block.wooden_pressure_plate.click_off");
      field_19845.put("block.wood_button.click_on", "block.wooden_button.click_on");
      field_19845.put("block.wood_button.click_off", "block.wooden_button.click_off");
      field_19845.put("block.wood_pressureplate.click_on", "block.wooden_pressure_plate.click_on");
      field_19845.put("entity.armorstand.break", "entity.armor_stand.break");
      field_19845.put("entity.armorstand.fall", "entity.armor_stand.fall");
      field_19845.put("entity.armorstand.hit", "entity.armor_stand.hit");
      field_19845.put("entity.armorstand.place", "entity.armor_stand.place");
      field_19845.put("entity.bobber.retrieve", "entity.fishing_bobber.retrieve");
      field_19845.put("entity.bobber.splash", "entity.fishing_bobber.splash");
      field_19845.put("entity.bobber.throw", "entity.fishing_bobber.throw");
      field_19845.put("entity.enderdragon.ambient", "entity.ender_dragon.ambient");
      field_19845.put("entity.enderdragon.death", "entity.ender_dragon.death");
      field_19845.put("entity.enderdragon.flap", "entity.ender_dragon.flap");
      field_19845.put("entity.enderdragon.growl", "entity.ender_dragon.growl");
      field_19845.put("entity.enderdragon.hurt", "entity.ender_dragon.hurt");
      field_19845.put("entity.enderdragon.shoot", "entity.ender_dragon.shoot");
      field_19845.put("entity.enderdragon_fireball.explode", "entity.dragon_fireball.explode");
      field_19845.put("entity.endereye.death", "entity.ender_eye.death");
      field_19845.put("entity.endereye.launch", "entity.ender_eye.launch");
      field_19845.put("entity.endermen.ambient", "entity.enderman.ambient");
      field_19845.put("entity.endermen.death", "entity.enderman.death");
      field_19845.put("entity.endermen.hurt", "entity.enderman.hurt");
      field_19845.put("entity.endermen.scream", "entity.enderman.scream");
      field_19845.put("entity.endermen.stare", "entity.enderman.stare");
      field_19845.put("entity.endermen.teleport", "entity.enderman.teleport");
      field_19845.put("entity.enderpearl.throw", "entity.ender_pearl.throw");
      field_19845.put("entity.evocation_illager.ambient", "entity.evoker.ambient");
      field_19845.put("entity.evocation_illager.cast_spell", "entity.evoker.cast_spell");
      field_19845.put("entity.evocation_illager.death", "entity.evoker.death");
      field_19845.put("entity.evocation_illager.hurt", "entity.evoker.hurt");
      field_19845.put("entity.evocation_illager.prepare_attack", "entity.evoker.prepare_attack");
      field_19845.put("entity.evocation_illager.prepare_summon", "entity.evoker.prepare_summon");
      field_19845.put("entity.evocation_illager.prepare_wololo", "entity.evoker.prepare_wololo");
      field_19845.put("entity.firework.blast", "entity.firework_rocket.blast");
      field_19845.put("entity.firework.blast_far", "entity.firework_rocket.blast_far");
      field_19845.put("entity.firework.large_blast", "entity.firework_rocket.large_blast");
      field_19845.put("entity.firework.large_blast_far", "entity.firework_rocket.large_blast_far");
      field_19845.put("entity.firework.launch", "entity.firework_rocket.launch");
      field_19845.put("entity.firework.shoot", "entity.firework_rocket.shoot");
      field_19845.put("entity.firework.twinkle", "entity.firework_rocket.twinkle");
      field_19845.put("entity.firework.twinkle_far", "entity.firework_rocket.twinkle_far");
      field_19845.put("entity.illusion_illager.ambient", "entity.illusioner.ambient");
      field_19845.put("entity.illusion_illager.cast_spell", "entity.illusioner.cast_spell");
      field_19845.put("entity.illusion_illager.death", "entity.illusioner.death");
      field_19845.put("entity.illusion_illager.hurt", "entity.illusioner.hurt");
      field_19845.put("entity.illusion_illager.mirror_move", "entity.illusioner.mirror_move");
      field_19845.put("entity.illusion_illager.prepare_blindness", "entity.illusioner.prepare_blindness");
      field_19845.put("entity.illusion_illager.prepare_mirror", "entity.illusioner.prepare_mirror");
      field_19845.put("entity.irongolem.attack", "entity.iron_golem.attack");
      field_19845.put("entity.irongolem.death", "entity.iron_golem.death");
      field_19845.put("entity.irongolem.hurt", "entity.iron_golem.hurt");
      field_19845.put("entity.irongolem.step", "entity.iron_golem.step");
      field_19845.put("entity.itemframe.add_item", "entity.item_frame.add_item");
      field_19845.put("entity.itemframe.break", "entity.item_frame.break");
      field_19845.put("entity.itemframe.place", "entity.item_frame.place");
      field_19845.put("entity.itemframe.remove_item", "entity.item_frame.remove_item");
      field_19845.put("entity.itemframe.rotate_item", "entity.item_frame.rotate_item");
      field_19845.put("entity.leashknot.break", "entity.leash_knot.break");
      field_19845.put("entity.leashknot.place", "entity.leash_knot.place");
      field_19845.put("entity.lightning.impact", "entity.lightning_bolt.impact");
      field_19845.put("entity.lightning.thunder", "entity.lightning_bolt.thunder");
      field_19845.put("entity.lingeringpotion.throw", "entity.lingering_potion.throw");
      field_19845.put("entity.magmacube.death", "entity.magma_cube.death");
      field_19845.put("entity.magmacube.hurt", "entity.magma_cube.hurt");
      field_19845.put("entity.magmacube.jump", "entity.magma_cube.jump");
      field_19845.put("entity.magmacube.squish", "entity.magma_cube.squish");
      field_19845.put("entity.parrot.imitate.enderdragon", "entity.parrot.imitate.ender_dragon");
      field_19845.put("entity.parrot.imitate.evocation_illager", "entity.parrot.imitate.evoker");
      field_19845.put("entity.parrot.imitate.illusion_illager", "entity.parrot.imitate.illusioner");
      field_19845.put("entity.parrot.imitate.magmacube", "entity.parrot.imitate.magma_cube");
      field_19845.put("entity.parrot.imitate.vindication_illager", "entity.parrot.imitate.vindicator");
      field_19845.put("entity.player.splash.highspeed", "entity.player.splash.high_speed");
      field_19845.put("entity.polar_bear.baby_ambient", "entity.polar_bear.ambient_baby");
      field_19845.put("entity.small_magmacube.death", "entity.magma_cube.death_small");
      field_19845.put("entity.small_magmacube.hurt", "entity.magma_cube.hurt_small");
      field_19845.put("entity.small_magmacube.squish", "entity.magma_cube.squish_small");
      field_19845.put("entity.small_slime.death", "entity.slime.death_small");
      field_19845.put("entity.small_slime.hurt", "entity.slime.hurt_small");
      field_19845.put("entity.small_slime.jump", "entity.slime.jump_small");
      field_19845.put("entity.small_slime.squish", "entity.slime.squish_small");
      field_19845.put("entity.snowman.ambient", "entity.snow_golem.ambient");
      field_19845.put("entity.snowman.death", "entity.snow_golem.death");
      field_19845.put("entity.snowman.hurt", "entity.snow_golem.hurt");
      field_19845.put("entity.snowman.shoot", "entity.snow_golem.shoot");
      field_19845.put("entity.villager.trading", "entity.villager.trade");
      field_19845.put("entity.vindication_illager.ambient", "entity.vindicator.ambient");
      field_19845.put("entity.vindication_illager.death", "entity.vindicator.death");
      field_19845.put("entity.vindication_illager.hurt", "entity.vindicator.hurt");
      field_19845.put("entity.zombie.attack_door_wood", "entity.zombie.attack_wooden_door");
      field_19845.put("entity.zombie.break_door_wood", "entity.zombie.break_wooden_door");
      field_19845.put("entity.zombie_pig.ambient", "entity.zombie_pigman.ambient");
      field_19845.put("entity.zombie_pig.angry", "entity.zombie_pigman.angry");
      field_19845.put("entity.zombie_pig.death", "entity.zombie_pigman.death");
      field_19845.put("entity.zombie_pig.hurt", "entity.zombie_pigman.hurt");
      field_19845.put("record.11", "music_disc.11");
      field_19845.put("record.13", "music_disc.13");
      field_19845.put("record.blocks", "music_disc.blocks");
      field_19845.put("record.cat", "music_disc.cat");
      field_19845.put("record.chirp", "music_disc.chirp");
      field_19845.put("record.far", "music_disc.far");
      field_19845.put("record.mall", "music_disc.mall");
      field_19845.put("record.mellohi", "music_disc.mellohi");
      field_19845.put("record.stal", "music_disc.stal");
      field_19845.put("record.strad", "music_disc.strad");
      field_19845.put("record.wait", "music_disc.wait");
      field_19845.put("record.ward", "music_disc.ward");
   }
}