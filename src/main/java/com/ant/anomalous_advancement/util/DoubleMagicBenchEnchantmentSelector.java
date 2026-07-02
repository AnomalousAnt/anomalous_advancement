package com.ant.anomalous_advancement.util;

import com.ant.anomalous_advancement.item.ModItems;
import java.util.*;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;

public class DoubleMagicBenchEnchantmentSelector {

    public record EnchantmentResult(ItemStack result, int cost) {}

    public static EnchantmentResult applyEnchantment(ItemStack tool, ItemStack reagent1, ItemStack reagent2, Level world) {
        Optional<Holder.Reference<Enchantment>> entryOpt = Optional.empty();
        int cost = 99;
        int level = 0;

        // Double-reagent enchantments
        if ((reagent1.is(Items.GLOW_INK_SAC) && reagent2.is(Items.TURTLE_SCUTE)) ||
                (reagent1.is(Items.TURTLE_SCUTE) && reagent2.is(Items.GLOW_INK_SAC))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.AQUA_AFFINITY.identifier());
            cost = 8;
            level = 1;
        }

        else if ((reagent1.is(Items.FERMENTED_SPIDER_EYE) && reagent2.is(Items.SPIDER_EYE)) ||
                (reagent1.is(Items.SPIDER_EYE) && reagent2.is(Items.FERMENTED_SPIDER_EYE))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.BANE_OF_ARTHROPODS.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.BRICKS) && reagent2.is(Items.RESIN_BRICKS)) ||
                (reagent1.is(Items.RESIN_BRICKS) && reagent2.is(Items.BRICKS))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.BLAST_PROTECTION.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.BRICK) && reagent2.is(Items.RESIN_BRICK)) ||
                (reagent1.is(Items.RESIN_BRICK) && reagent2.is(Items.BRICK))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.BREACH.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.COPPER_BLOCK) && reagent2.is(Items.OBSIDIAN)) ||
                (reagent1.is(Items.OBSIDIAN) && reagent2.is(Items.COPPER_BLOCK))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.DENSITY.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.PRISMARINE_CRYSTALS) && reagent2.is(Items.OBSIDIAN)) ||
                (reagent1.is(Items.OBSIDIAN) && reagent2.is(Items.PRISMARINE_CRYSTALS))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.DEPTH_STRIDER.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.CLOCK) && reagent2.is(Items.SUGAR)) ||
                (reagent1.is(Items.SUGAR) && reagent2.is(Items.CLOCK))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.EFFICIENCY.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.FEATHER) && reagent2.is(Items.RABBIT_FOOT)) ||
                (reagent1.is(Items.RABBIT_FOOT) && reagent2.is(Items.FEATHER))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.FEATHER_FALLING.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.GUNPOWDER) && reagent2.is(Items.FIRE_CHARGE)) ||
                (reagent1.is(Items.FIRE_CHARGE) && reagent2.is(Items.GUNPOWDER))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.FIRE_ASPECT.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.CLAY) && reagent2.is(Items.RESIN_BRICK)) ||
                (reagent1.is(Items.RESIN_BRICK) && reagent2.is(Items.CLAY))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.FIRE_PROTECTION.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.LAPIS_LAZULI) && reagent2.is(Items.AMETHYST_SHARD)) ||
                (reagent1.is(Items.AMETHYST_SHARD) && reagent2.is(Items.LAPIS_LAZULI))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.FORTUNE.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.PACKED_ICE) && reagent2.is(Items.WIND_CHARGE)) ||
                (reagent1.is(Items.WIND_CHARGE) && reagent2.is(Items.PACKED_ICE))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.FROST_WALKER.identifier());
            cost = 8;
            level = 1;
        }

        else if ((reagent1.is(Items.STICK) && reagent2.is(Items.POINTED_DRIPSTONE)) ||
                (reagent1.is(Items.POINTED_DRIPSTONE) && reagent2.is(Items.STICK))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.IMPALING.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.LODESTONE) && reagent2.is(Items.PISTON)) ||
                (reagent1.is(Items.PISTON) && reagent2.is(Items.LODESTONE))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.KNOCKBACK.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.EMERALD) && reagent2.is(Items.NAUTILUS_SHELL)) ||
                (reagent1.is(Items.NAUTILUS_SHELL) && reagent2.is(Items.EMERALD))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.LOOTING.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.FISHING_ROD) && reagent2.is(Items.PRISMARINE_CRYSTALS)) ||
                (reagent1.is(Items.PRISMARINE_CRYSTALS) && reagent2.is(Items.FISHING_ROD))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.LOYALTY.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.SALMON) && reagent2.is(Items.COD)) ||
                (reagent1.is(Items.COD) && reagent2.is(Items.SALMON))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.LUCK_OF_THE_SEA.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.BREAD) && reagent2.is(Items.POISONOUS_POTATO)) ||
                (reagent1.is(Items.POISONOUS_POTATO) && reagent2.is(Items.BREAD))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.LURE.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.SPECTRAL_ARROW) && reagent2.is(Items.POINTED_DRIPSTONE)) ||
                (reagent1.is(Items.POINTED_DRIPSTONE) && reagent2.is(Items.SPECTRAL_ARROW))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.PIERCING.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(ModItems.PBOW) && reagent2.is(Items.LEATHER)) ||
                (reagent1.is(Items.LEATHER) && reagent2.is(ModItems.PBOW))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.POWER.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.HAY_BLOCK) && reagent2.is(Items.IRON_CHAIN)) ||
                (reagent1.is(Items.IRON_CHAIN) && reagent2.is(Items.HAY_BLOCK))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.PROJECTILE_PROTECTION.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.IRON_BLOCK) && reagent2.is(Items.PHANTOM_MEMBRANE)) ||
                (reagent1.is(Items.PHANTOM_MEMBRANE) && reagent2.is(Items.IRON_BLOCK))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.PROTECTION.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.TIPPED_ARROW) && reagent2.is(Items.BRICK)) ||
                (reagent1.is(Items.BRICK) && reagent2.is(Items.TIPPED_ARROW))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.PUNCH.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.SPECTRAL_ARROW) && reagent2.is(Items.MILK_BUCKET)) ||
                (reagent1.is(Items.MILK_BUCKET) && reagent2.is(Items.SPECTRAL_ARROW))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.QUICK_CHARGE.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.GLASS_BOTTLE) && reagent2.is(Items.RESIN_BRICK)) ||
                (reagent1.is(Items.RESIN_BRICK) && reagent2.is(Items.GLASS_BOTTLE))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.RESPIRATION.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.HEART_OF_THE_SEA) && reagent2.is(Items.ENDER_PEARL)) ||
                (reagent1.is(Items.ENDER_PEARL) && reagent2.is(Items.HEART_OF_THE_SEA))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.RIPTIDE.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.FLINT) && reagent2.is(Items.PRISMARINE_SHARD)) ||
                (reagent1.is(Items.PRISMARINE_SHARD) && reagent2.is(Items.FLINT))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.SHARPNESS.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.ECHO_SHARD) && reagent2.is(Items.MAGMA_CREAM)) ||
                (reagent1.is(Items.MAGMA_CREAM) && reagent2.is(Items.ECHO_SHARD))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.SMITE.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.ROTTEN_FLESH) && reagent2.is(Items.BONE)) ||
                (reagent1.is(Items.BONE) && reagent2.is(Items.ROTTEN_FLESH))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.SMITE.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.CRYING_OBSIDIAN) && reagent2.is(Items.NETHER_SPROUTS)) ||
                (reagent1.is(Items.NETHER_SPROUTS) && reagent2.is(Items.CRYING_OBSIDIAN))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.SOUL_SPEED.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.BRUSH) && reagent2.is(Items.QUARTZ)) ||
                (reagent1.is(Items.QUARTZ) && reagent2.is(Items.BRUSH))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.SWEEPING_EDGE.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.PINK_WOOL) && reagent2.is(Items.RABBIT_FOOT)) ||
                (reagent1.is(Items.RABBIT_FOOT) && reagent2.is(Items.PINK_WOOL))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.SWIFT_SNEAK.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.VINE) && reagent2.is(Items.WEEPING_VINES)) ||
                (reagent1.is(Items.WEEPING_VINES) && reagent2.is(Items.VINE))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.THORNS.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.RESIN_BRICKS) && reagent2.is(Items.SLIME_BALL)) ||
                (reagent1.is(Items.SLIME_BALL) && reagent2.is(Items.RESIN_BRICKS))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.UNBREAKING.identifier());
            cost = 8;
            level = 2;
        }

        else if ((reagent1.is(Items.WIND_CHARGE) && reagent2.is(Items.TNT)) ||
                (reagent1.is(Items.TNT) && reagent2.is(Items.WIND_CHARGE))) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.WIND_BURST.identifier());
            cost = 8;
            level = 2;
        }

        // Single-reagent enchantments
              else if ((reagent1.is(Items.FERMENTED_SPIDER_EYE) && reagent2.isEmpty()) ||
        (reagent2.is(Items.FERMENTED_SPIDER_EYE) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.BANE_OF_ARTHROPODS.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.BRICKS) && reagent2.isEmpty()) ||
        (reagent2.is(Items.BRICKS) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.BLAST_PROTECTION.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.BRICK) && reagent2.isEmpty()) ||
        (reagent2.is(Items.BRICK) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.BREACH.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.SUSPICIOUS_STEW) && reagent2.isEmpty()) ||
        (reagent2.is(Items.SUSPICIOUS_STEW) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.BINDING_CURSE.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.CHORUS_FRUIT) && reagent2.isEmpty()) ||
        (reagent2.is(Items.CHORUS_FRUIT) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.VANISHING_CURSE.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.SMOOTH_STONE) && reagent2.isEmpty()) ||
        (reagent2.is(Items.SMOOTH_STONE) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.DENSITY.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.PRISMARINE_CRYSTALS) && reagent2.isEmpty()) ||
        (reagent2.is(Items.PRISMARINE_CRYSTALS) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.DEPTH_STRIDER.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.SUGAR) && reagent2.isEmpty()) ||
        (reagent2.is(Items.SUGAR) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.EFFICIENCY.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.FEATHER) && reagent2.isEmpty()) ||
        (reagent2.is(Items.FEATHER) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.FEATHER_FALLING.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.GUNPOWDER) && reagent2.isEmpty()) ||
        (reagent2.is(Items.GUNPOWDER) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.FIRE_ASPECT.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.CLAY_BALL) && reagent2.isEmpty()) ||
        (reagent2.is(Items.CLAY_BALL) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.FIRE_PROTECTION.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.FIREWORK_STAR) && reagent2.isEmpty()) ||
        (reagent2.is(Items.FIREWORK_STAR) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.FLAME.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.LAPIS_LAZULI) && reagent2.isEmpty()) ||
        (reagent2.is(Items.LAPIS_LAZULI) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.FORTUNE.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.STICK) && reagent2.isEmpty()) ||
        (reagent2.is(Items.STICK) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.IMPALING.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.LODESTONE) && reagent2.isEmpty()) ||
        (reagent2.is(Items.LODESTONE) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.KNOCKBACK.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.EMERALD) && reagent2.isEmpty()) ||
        (reagent2.is(Items.EMERALD) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.LOOTING.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.LEAD) && reagent2.isEmpty()) ||
        (reagent2.is(Items.LEAD) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.LOYALTY.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.TROPICAL_FISH) && reagent2.isEmpty()) ||
        (reagent2.is(Items.TROPICAL_FISH) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.LUCK_OF_THE_SEA.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.BREAD) && reagent2.isEmpty()) ||
        (reagent2.is(Items.BREAD) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.LURE.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.CROSSBOW) && reagent2.isEmpty()) ||
        (reagent2.is(Items.CROSSBOW) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.MULTISHOT.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.SPECTRAL_ARROW) && reagent2.isEmpty()) ||
        (reagent2.is(Items.SPECTRAL_ARROW) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.PIERCING.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.STRING) && reagent2.isEmpty()) ||
        (reagent2.is(Items.STRING) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.POWER.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.WHEAT) && reagent2.isEmpty()) ||
        (reagent2.is(Items.WHEAT) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.PROJECTILE_PROTECTION.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.COPPER_BLOCK) && reagent2.isEmpty()) ||
        (reagent2.is(Items.COPPER_BLOCK) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.PROTECTION.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.ARROW) && reagent2.isEmpty()) ||
        (reagent2.is(Items.ARROW) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.PUNCH.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.SUGAR_CANE) && reagent2.isEmpty()) ||
        (reagent2.is(Items.SUGAR_CANE) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.QUICK_CHARGE.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.INK_SAC) && reagent2.isEmpty()) ||
        (reagent2.is(Items.INK_SAC) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.RESPIRATION.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.HEART_OF_THE_SEA) && reagent2.isEmpty()) ||
        (reagent2.is(Items.HEART_OF_THE_SEA) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.RIPTIDE.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.FLINT) && reagent2.isEmpty()) ||
        (reagent2.is(Items.FLINT) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.SHARPNESS.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.ROTTEN_FLESH) && reagent2.isEmpty()) ||
        (reagent2.is(Items.ROTTEN_FLESH) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.SMITE.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.GHAST_TEAR) && reagent2.isEmpty()) ||
        (reagent2.is(Items.GHAST_TEAR) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.SOUL_SPEED.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.AMETHYST_SHARD) && reagent2.isEmpty()) ||
        (reagent2.is(Items.AMETHYST_SHARD) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.SWEEPING_EDGE.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.ECHO_SHARD) && reagent2.isEmpty()) ||
        (reagent2.is(Items.ECHO_SHARD) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.SWIFT_SNEAK.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.CACTUS) && reagent2.isEmpty()) ||
        (reagent2.is(Items.CACTUS) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.THORNS.identifier());
            cost = 3;
            level = 1;
            } else if ((reagent1.is(Items.SLIME_BALL) && reagent2.isEmpty()) ||
        (reagent2.is(Items.SLIME_BALL) && reagent1.isEmpty())) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.UNBREAKING.identifier());
            cost = 3;
            level = 1;
        } else if ((reagent1.is(Items.WIND_CHARGE) && reagent2.isEmpty()) ||
                (reagent2.is(Items.WIND_CHARGE) && reagent1.isEmpty())) {
            entryOpt = world.registryAccess()
                    .lookupOrThrow(Registries.ENCHANTMENT)
                    .get(Enchantments.WIND_BURST.identifier());
        }

        if (entryOpt.isPresent()) {
            Enchantment enchantment = entryOpt.get().value();

            if (enchantment.canEnchant(tool)) {
                Holder<Enchantment> enchantmentEntry = entryOpt.get();
                int existingLevel = EnchantmentHelper.getItemEnchantmentLevel(enchantmentEntry, tool);

                if( level == 2 && existingLevel < 1) {
                    return new EnchantmentResult(ItemStack.EMPTY, 42069);
                }

                ItemStack result = tool.copy();
                removeConflictingEnchantments(result, entryOpt.get());
                result.enchant(entryOpt.get(), level);
                return new EnchantmentResult(result, cost);
            }
        }

        return new EnchantmentResult(ItemStack.EMPTY, 0);
    }

    private static void removeConflictingEnchantments(ItemStack stack, Holder<Enchantment> candidateEntry) {
        EnchantmentHelper.updateEnchantments(stack, builder -> {
            Collection<Holder<Enchantment>> existing = builder.keySet();
            List<Holder<Enchantment>> toRemove = new ArrayList<>();

            for (Holder<Enchantment> entry : existing) {
                if (!EnchantmentHelper.isEnchantmentCompatible(Collections.singleton(entry), candidateEntry)) {
                    toRemove.add(entry);
                }
            }

            for (Holder<Enchantment> entry : toRemove) {
                builder.removeIf(e -> e.equals(entry));
            }
        });
    }
}
