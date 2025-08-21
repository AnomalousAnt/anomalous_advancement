package com.ant.anomalous_advancement.util;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.World;

import java.util.*;

public class TripleMagicBenchEnchantmentSelector {

    public record EnchantmentResult(ItemStack result, int cost) {}

    public static EnchantmentResult applyEnchantment(ItemStack tool, ItemStack reagent1, ItemStack reagent2, ItemStack reagent3, World world) {
        Optional<RegistryEntry.Reference<Enchantment>> entryOpt = Optional.empty();
        int cost = 0;
        int level = 1;

        boolean hasLapis = reagent1.isOf(Items.LAPIS_LAZULI) || reagent2.isOf(Items.LAPIS_LAZULI) | reagent3.isOf(Items.LAPIS_LAZULI);
        boolean hasAmethyst = reagent1.isOf(Items.AMETHYST_SHARD) || reagent2.isOf(Items.AMETHYST_SHARD) || reagent3.isOf(Items.AMETHYST_SHARD);
        boolean hasObsidian = reagent1.isOf(Items.OBSIDIAN) || reagent2.isOf(Items.OBSIDIAN) || reagent3.isOf(Items.OBSIDIAN);

        // Triple-reagent enchantments
        if (hasLapis && hasAmethyst && hasObsidian) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.FORTUNE.getValue());
            cost = 8;
            level = 3;
        }

        // Double-reagent enchantments
        if ((reagent1.isOf(Items.GLOW_INK_SAC) && reagent2.isOf(Items.TURTLE_SCUTE) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.TURTLE_SCUTE) && reagent2.isOf(Items.GLOW_INK_SAC) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.GLOW_INK_SAC) && reagent2.isEmpty() && reagent3.isOf(Items.TURTLE_SCUTE)) ||
                (reagent1.isOf(Items.TURTLE_SCUTE) && reagent2.isEmpty() && reagent3.isOf(Items.GLOW_INK_SAC)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.GLOW_INK_SAC) && reagent3.isOf(Items.TURTLE_SCUTE)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.TURTLE_SCUTE) && reagent3.isOf(Items.GLOW_INK_SAC))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.AQUA_AFFINITY.getValue());
            cost = 8;
            level = 1;
        }

        if ((reagent1.isOf(Items.FERMENTED_SPIDER_EYE) && reagent2.isOf(Items.SPIDER_EYE) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.SPIDER_EYE) && reagent2.isOf(Items.FERMENTED_SPIDER_EYE) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.FERMENTED_SPIDER_EYE) && reagent2.isEmpty() && reagent3.isOf(Items.SPIDER_EYE)) ||
                (reagent1.isOf(Items.SPIDER_EYE) && reagent2.isEmpty() && reagent3.isOf(Items.FERMENTED_SPIDER_EYE)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.FERMENTED_SPIDER_EYE) && reagent3.isOf(Items.SPIDER_EYE)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.SPIDER_EYE) && reagent3.isOf(Items.FERMENTED_SPIDER_EYE))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.BANE_OF_ARTHROPODS.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.BRICKS) && reagent2.isOf(Items.RESIN_BRICKS) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.RESIN_BRICKS) && reagent2.isOf(Items.BRICKS) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.BRICKS) && reagent2.isEmpty() && reagent3.isOf(Items.RESIN_BRICKS)) ||
                (reagent1.isOf(Items.RESIN_BRICKS) && reagent2.isEmpty() && reagent3.isOf(Items.BRICKS)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.BRICKS) && reagent3.isOf(Items.RESIN_BRICKS)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.RESIN_BRICKS) && reagent3.isOf(Items.BRICKS))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.BLAST_PROTECTION.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.BRICK) && reagent2.isOf(Items.RESIN_BRICK) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.RESIN_BRICK) && reagent2.isOf(Items.BRICK) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.BRICK) && reagent2.isEmpty() && reagent3.isOf(Items.RESIN_BRICK)) ||
                (reagent1.isOf(Items.RESIN_BRICK) && reagent2.isEmpty() && reagent3.isOf(Items.BRICK)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.BRICK) && reagent3.isOf(Items.RESIN_BRICK)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.RESIN_BRICK) && reagent3.isOf(Items.BRICK))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.BREACH.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.SMOOTH_STONE) && reagent2.isOf(Items.OBSIDIAN) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.OBSIDIAN) && reagent2.isOf(Items.SMOOTH_STONE) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.SMOOTH_STONE) && reagent2.isEmpty() && reagent3.isOf(Items.OBSIDIAN)) ||
                (reagent1.isOf(Items.OBSIDIAN) && reagent2.isEmpty() && reagent3.isOf(Items.SMOOTH_STONE)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.SMOOTH_STONE) && reagent3.isOf(Items.OBSIDIAN)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.OBSIDIAN) && reagent3.isOf(Items.SMOOTH_STONE))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.DENSITY.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.PRISMARINE_SHARD) && reagent2.isOf(Items.OBSIDIAN) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.OBSIDIAN) && reagent2.isOf(Items.PRISMARINE_SHARD) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.PRISMARINE_SHARD) && reagent2.isEmpty() && reagent3.isOf(Items.OBSIDIAN)) ||
                (reagent1.isOf(Items.OBSIDIAN) && reagent2.isEmpty() && reagent3.isOf(Items.PRISMARINE_SHARD)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.PRISMARINE_SHARD) && reagent3.isOf(Items.OBSIDIAN)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.OBSIDIAN) && reagent3.isOf(Items.PRISMARINE_SHARD))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.DEPTH_STRIDER.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.CLOCK) && reagent2.isOf(Items.COMPASS) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.COMPASS) && reagent2.isOf(Items.CLOCK) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.CLOCK) && reagent2.isEmpty() && reagent3.isOf(Items.COMPASS)) ||
                (reagent1.isOf(Items.COMPASS) && reagent2.isEmpty() && reagent3.isOf(Items.CLOCK)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.CLOCK) && reagent3.isOf(Items.COMPASS)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.COMPASS) && reagent3.isOf(Items.CLOCK))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.EFFICIENCY.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.FEATHER) && reagent2.isOf(Items.RABBIT_FOOT) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.RABBIT_FOOT) && reagent2.isOf(Items.FEATHER) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.FEATHER) && reagent2.isEmpty() && reagent3.isOf(Items.RABBIT_FOOT)) ||
                (reagent1.isOf(Items.RABBIT_FOOT) && reagent2.isEmpty() && reagent3.isOf(Items.FEATHER)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.FEATHER) && reagent3.isOf(Items.RABBIT_FOOT)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.RABBIT_FOOT) && reagent3.isOf(Items.FEATHER))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.FEATHER_FALLING.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.GUNPOWDER) && reagent2.isOf(Items.FIRE_CHARGE) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.FIRE_CHARGE) && reagent2.isOf(Items.GUNPOWDER) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.GUNPOWDER) && reagent2.isEmpty() && reagent3.isOf(Items.FIRE_CHARGE)) ||
                (reagent1.isOf(Items.FIRE_CHARGE) && reagent2.isEmpty() && reagent3.isOf(Items.GUNPOWDER)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.GUNPOWDER) && reagent3.isOf(Items.FIRE_CHARGE)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.FIRE_CHARGE) && reagent3.isOf(Items.GUNPOWDER))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.FIRE_ASPECT.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.CLAY) && reagent2.isOf(Items.RESIN_BRICK) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.RESIN_BRICK) && reagent2.isOf(Items.CLAY) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.CLAY) && reagent2.isEmpty() && reagent3.isOf(Items.RESIN_BRICK)) ||
                (reagent1.isOf(Items.RESIN_BRICK) && reagent2.isEmpty() && reagent3.isOf(Items.CLAY)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.CLAY) && reagent3.isOf(Items.RESIN_BRICK)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.RESIN_BRICK) && reagent3.isOf(Items.CLAY))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.FIRE_PROTECTION.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.LAPIS_LAZULI) && reagent2.isOf(Items.AMETHYST_SHARD) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.AMETHYST_SHARD) && reagent2.isOf(Items.LAPIS_LAZULI) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.LAPIS_LAZULI) && reagent2.isEmpty() && reagent3.isOf(Items.AMETHYST_SHARD)) ||
                (reagent1.isOf(Items.AMETHYST_SHARD) && reagent2.isEmpty() && reagent3.isOf(Items.LAPIS_LAZULI)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.LAPIS_LAZULI) && reagent3.isOf(Items.AMETHYST_SHARD)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.AMETHYST_SHARD) && reagent3.isOf(Items.LAPIS_LAZULI))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.FORTUNE.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.PACKED_ICE) && reagent2.isOf(Items.WIND_CHARGE) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.WIND_CHARGE) && reagent2.isOf(Items.PACKED_ICE) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.PACKED_ICE) && reagent2.isEmpty() && reagent3.isOf(Items.WIND_CHARGE)) ||
                (reagent1.isOf(Items.WIND_CHARGE) && reagent2.isEmpty() && reagent3.isOf(Items.PACKED_ICE)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.PACKED_ICE) && reagent3.isOf(Items.WIND_CHARGE)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.WIND_CHARGE) && reagent3.isOf(Items.PACKED_ICE))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.FROST_WALKER.getValue());
            cost = 8;
            level = 1;
        }

        if ((reagent1.isOf(Items.STICK) && reagent2.isOf(Items.POINTED_DRIPSTONE) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.POINTED_DRIPSTONE) && reagent2.isOf(Items.STICK) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.STICK) && reagent2.isEmpty() && reagent3.isOf(Items.POINTED_DRIPSTONE)) ||
                (reagent1.isOf(Items.POINTED_DRIPSTONE) && reagent2.isEmpty() && reagent3.isOf(Items.STICK)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.STICK) && reagent3.isOf(Items.POINTED_DRIPSTONE)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.POINTED_DRIPSTONE) && reagent3.isOf(Items.STICK))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.IMPALING.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.LODESTONE) && reagent2.isOf(Items.PISTON) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.PISTON) && reagent2.isOf(Items.LODESTONE) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.LODESTONE) && reagent2.isEmpty() && reagent3.isOf(Items.PISTON)) ||
                (reagent1.isOf(Items.PISTON) && reagent2.isEmpty() && reagent3.isOf(Items.LODESTONE)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.LODESTONE) && reagent3.isOf(Items.PISTON)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.PISTON) && reagent3.isOf(Items.LODESTONE))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.KNOCKBACK.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.EMERALD) && reagent2.isOf(Items.NAUTILUS_SHELL) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.NAUTILUS_SHELL) && reagent2.isOf(Items.EMERALD) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.EMERALD) && reagent2.isEmpty() && reagent3.isOf(Items.NAUTILUS_SHELL)) ||
                (reagent1.isOf(Items.NAUTILUS_SHELL) && reagent2.isEmpty() && reagent3.isOf(Items.EMERALD)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.EMERALD) && reagent3.isOf(Items.NAUTILUS_SHELL)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.NAUTILUS_SHELL) && reagent3.isOf(Items.EMERALD))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.LOOTING.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.FISHING_ROD) && reagent2.isOf(Items.PRISMARINE_CRYSTALS) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.PRISMARINE_CRYSTALS) && reagent2.isOf(Items.FISHING_ROD) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.FISHING_ROD) && reagent2.isEmpty() && reagent3.isOf(Items.PRISMARINE_CRYSTALS)) ||
                (reagent1.isOf(Items.PRISMARINE_CRYSTALS) && reagent2.isEmpty() && reagent3.isOf(Items.FISHING_ROD)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.FISHING_ROD) && reagent3.isOf(Items.PRISMARINE_CRYSTALS)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.PRISMARINE_CRYSTALS) && reagent3.isOf(Items.FISHING_ROD))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.LOYALTY.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.SALMON) && reagent2.isOf(Items.COD) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.COD) && reagent2.isOf(Items.SALMON) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.SALMON) && reagent2.isEmpty() && reagent3.isOf(Items.COD)) ||
                (reagent1.isOf(Items.COD) && reagent2.isEmpty() && reagent3.isOf(Items.SALMON)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.SALMON) && reagent3.isOf(Items.COD)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.COD) && reagent3.isOf(Items.SALMON))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.LUCK_OF_THE_SEA.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.BREAD) && reagent2.isOf(Items.POISONOUS_POTATO) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.POISONOUS_POTATO) && reagent2.isOf(Items.BREAD) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.BREAD) && reagent2.isEmpty() && reagent3.isOf(Items.POISONOUS_POTATO)) ||
                (reagent1.isOf(Items.POISONOUS_POTATO) && reagent2.isEmpty() && reagent3.isOf(Items.GLOW_INK_SAC)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.BREAD) && reagent3.isOf(Items.POISONOUS_POTATO)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.POISONOUS_POTATO) && reagent3.isOf(Items.BREAD))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.LURE.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.SPECTRAL_ARROW) && reagent2.isOf(Items.POINTED_DRIPSTONE) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.POINTED_DRIPSTONE) && reagent2.isOf(Items.SPECTRAL_ARROW) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.SPECTRAL_ARROW) && reagent2.isEmpty() && reagent3.isOf(Items.POINTED_DRIPSTONE)) ||
                (reagent1.isOf(Items.POINTED_DRIPSTONE) && reagent2.isEmpty() && reagent3.isOf(Items.SPECTRAL_ARROW)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.SPECTRAL_ARROW) && reagent3.isOf(Items.POINTED_DRIPSTONE)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.POINTED_DRIPSTONE) && reagent3.isOf(Items.SPECTRAL_ARROW))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.PIERCING.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.BOW) && reagent2.isOf(Items.LEATHER) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.LEATHER) && reagent2.isOf(Items.BOW) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.BOW) && reagent2.isEmpty() && reagent3.isOf(Items.LEATHER)) ||
                (reagent1.isOf(Items.LEATHER) && reagent2.isEmpty() && reagent3.isOf(Items.BOW)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.BOW) && reagent3.isOf(Items.LEATHER)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.LEATHER) && reagent3.isOf(Items.BOW))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.POWER.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.HAY_BLOCK) && reagent2.isOf(Items.WHEAT) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.WHEAT) && reagent2.isOf(Items.HAY_BLOCK) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.HAY_BLOCK) && reagent2.isEmpty() && reagent3.isOf(Items.WHEAT)) ||
                (reagent1.isOf(Items.WHEAT) && reagent2.isEmpty() && reagent3.isOf(Items.HAY_BLOCK)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.HAY_BLOCK) && reagent3.isOf(Items.WHEAT)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.WHEAT) && reagent3.isOf(Items.HAY_BLOCK))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.PROJECTILE_PROTECTION.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.IRON_BLOCK) && reagent2.isOf(Items.PHANTOM_MEMBRANE) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.PHANTOM_MEMBRANE) && reagent2.isOf(Items.IRON_BLOCK) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.IRON_BLOCK) && reagent2.isEmpty() && reagent3.isOf(Items.PHANTOM_MEMBRANE)) ||
                (reagent1.isOf(Items.PHANTOM_MEMBRANE) && reagent2.isEmpty() && reagent3.isOf(Items.IRON_BLOCK)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.IRON_BLOCK) && reagent3.isOf(Items.PHANTOM_MEMBRANE)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.PHANTOM_MEMBRANE) && reagent3.isOf(Items.IRON_BLOCK))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.PROTECTION.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.TIPPED_ARROW) && reagent2.isOf(Items.BRICK) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.BRICK) && reagent2.isOf(Items.TIPPED_ARROW) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.TIPPED_ARROW) && reagent2.isEmpty() && reagent3.isOf(Items.BRICK)) ||
                (reagent1.isOf(Items.BRICK) && reagent2.isEmpty() && reagent3.isOf(Items.TIPPED_ARROW)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.TIPPED_ARROW) && reagent3.isOf(Items.BRICK)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.BRICK) && reagent3.isOf(Items.TIPPED_ARROW))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.PUNCH.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.SPECTRAL_ARROW) && reagent2.isOf(Items.MILK_BUCKET) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.MILK_BUCKET) && reagent2.isOf(Items.SPECTRAL_ARROW) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.SPECTRAL_ARROW) && reagent2.isEmpty() && reagent3.isOf(Items.MILK_BUCKET)) ||
                (reagent1.isOf(Items.MILK_BUCKET) && reagent2.isEmpty() && reagent3.isOf(Items.SPECTRAL_ARROW)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.SPECTRAL_ARROW) && reagent3.isOf(Items.MILK_BUCKET)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.MILK_BUCKET) && reagent3.isOf(Items.SPECTRAL_ARROW))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.QUICK_CHARGE.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.GLASS_BOTTLE) && reagent2.isOf(Items.RESIN_BRICK) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.RESIN_BRICK) && reagent2.isOf(Items.GLASS_BOTTLE) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.GLASS_BOTTLE) && reagent2.isEmpty() && reagent3.isOf(Items.RESIN_BRICK)) ||
                (reagent1.isOf(Items.RESIN_BRICK) && reagent2.isEmpty() && reagent3.isOf(Items.GLASS_BOTTLE)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.GLASS_BOTTLE) && reagent3.isOf(Items.RESIN_BRICK)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.RESIN_BRICK) && reagent3.isOf(Items.GLASS_BOTTLE))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.RESPIRATION.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.HEART_OF_THE_SEA) && reagent2.isOf(Items.ENDER_PEARL) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.ENDER_PEARL) && reagent2.isOf(Items.HEART_OF_THE_SEA) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.HEART_OF_THE_SEA) && reagent2.isEmpty() && reagent3.isOf(Items.ENDER_PEARL)) ||
                (reagent1.isOf(Items.ENDER_PEARL) && reagent2.isEmpty() && reagent3.isOf(Items.HEART_OF_THE_SEA)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.HEART_OF_THE_SEA) && reagent3.isOf(Items.ENDER_PEARL)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.ENDER_PEARL) && reagent3.isOf(Items.HEART_OF_THE_SEA))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.RIPTIDE.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.FLINT) && reagent2.isOf(Items.PRISMARINE_SHARD) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.PRISMARINE_SHARD) && reagent2.isOf(Items.FLINT) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.FLINT) && reagent2.isEmpty() && reagent3.isOf(Items.PRISMARINE_SHARD)) ||
                (reagent1.isOf(Items.PRISMARINE_SHARD) && reagent2.isEmpty() && reagent3.isOf(Items.FLINT)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.FLINT) && reagent3.isOf(Items.PRISMARINE_SHARD)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.PRISMARINE_SHARD) && reagent3.isOf(Items.FLINT))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.SHARPNESS.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.ROTTEN_FLESH) && reagent2.isOf(Items.BONE) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.BONE) && reagent2.isOf(Items.ROTTEN_FLESH) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.ROTTEN_FLESH) && reagent2.isEmpty() && reagent3.isOf(Items.BONE)) ||
                (reagent1.isOf(Items.BONE) && reagent2.isEmpty() && reagent3.isOf(Items.ROTTEN_FLESH)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.ROTTEN_FLESH) && reagent3.isOf(Items.BONE)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.BONE) && reagent3.isOf(Items.ROTTEN_FLESH))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.SMITE.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.CRYING_OBSIDIAN) && reagent2.isOf(Items.NETHER_SPROUTS) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.NETHER_SPROUTS) && reagent2.isOf(Items.CRYING_OBSIDIAN) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.CRYING_OBSIDIAN) && reagent2.isEmpty() && reagent3.isOf(Items.NETHER_SPROUTS)) ||
                (reagent1.isOf(Items.NETHER_SPROUTS) && reagent2.isEmpty() && reagent3.isOf(Items.CRYING_OBSIDIAN)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.CRYING_OBSIDIAN) && reagent3.isOf(Items.NETHER_SPROUTS)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.NETHER_SPROUTS) && reagent3.isOf(Items.CRYING_OBSIDIAN))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.SOUL_SPEED.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.BRUSH) && reagent2.isOf(Items.QUARTZ) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.QUARTZ) && reagent2.isOf(Items.BRUSH) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.BRUSH) && reagent2.isEmpty() && reagent3.isOf(Items.QUARTZ)) ||
                (reagent1.isOf(Items.QUARTZ) && reagent2.isEmpty() && reagent3.isOf(Items.BRUSH)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.BRUSH) && reagent3.isOf(Items.QUARTZ)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.QUARTZ) && reagent3.isOf(Items.BRUSH))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.SWEEPING_EDGE.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.PINK_WOOL) && reagent2.isOf(Items.RABBIT_FOOT) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.RABBIT_FOOT) && reagent2.isOf(Items.PINK_WOOL) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.PINK_WOOL) && reagent2.isEmpty() && reagent3.isOf(Items.RABBIT_FOOT)) ||
                (reagent1.isOf(Items.RABBIT_FOOT) && reagent2.isEmpty() && reagent3.isOf(Items.PINK_WOOL)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.PINK_WOOL) && reagent3.isOf(Items.RABBIT_FOOT)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.RABBIT_FOOT) && reagent3.isOf(Items.PINK_WOOL))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.SWIFT_SNEAK.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.VINE) && reagent2.isOf(Items.WEEPING_VINES) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.WEEPING_VINES) && reagent2.isOf(Items.VINE) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.VINE) && reagent2.isEmpty() && reagent3.isOf(Items.WEEPING_VINES)) ||
                (reagent1.isOf(Items.WEEPING_VINES) && reagent2.isEmpty() && reagent3.isOf(Items.VINE)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.VINE) && reagent3.isOf(Items.WEEPING_VINES)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.WEEPING_VINES) && reagent3.isOf(Items.VINE))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.THORNS.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.RESIN_BRICKS) && reagent2.isOf(Items.SLIME_BALL) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.SLIME_BALL) && reagent2.isOf(Items.RESIN_BRICKS) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.RESIN_BRICKS) && reagent2.isEmpty() && reagent3.isOf(Items.SLIME_BALL)) ||
                (reagent1.isOf(Items.SLIME_BALL) && reagent2.isEmpty() && reagent3.isOf(Items.RESIN_BRICKS)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.RESIN_BRICKS) && reagent3.isOf(Items.SLIME_BALL)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.SLIME_BALL) && reagent3.isOf(Items.RESIN_BRICKS))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.UNBREAKING.getValue());
            cost = 8;
            level = 2;
        }

        if ((reagent1.isOf(Items.WIND_CHARGE) && reagent2.isOf(Items.TNT) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.TNT) && reagent2.isOf(Items.WIND_CHARGE) && reagent3.isEmpty()) ||
                (reagent1.isOf(Items.WIND_CHARGE) && reagent2.isEmpty() && reagent3.isOf(Items.TNT)) ||
                (reagent1.isOf(Items.TNT) && reagent2.isEmpty() && reagent3.isOf(Items.WIND_CHARGE)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.WIND_CHARGE) && reagent3.isOf(Items.TNT)) ||
                (reagent1.isEmpty() && reagent2.isOf(Items.TNT) && reagent3.isOf(Items.WIND_CHARGE))
        ) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.WIND_BURST.getValue());
            cost = 8;
            level = 2;
        }

        // Single-reagent enchantments
         else if ((reagent1.isOf(Items.FERMENTED_SPIDER_EYE) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.FERMENTED_SPIDER_EYE) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.FERMENTED_SPIDER_EYE) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.BANE_OF_ARTHROPODS.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.BRICKS) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.BRICKS) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.BRICKS) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.BLAST_PROTECTION.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.BRICK) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.BRICK) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.BRICK) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.BREACH.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.SUSPICIOUS_STEW) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.SUSPICIOUS_STEW) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.SUSPICIOUS_STEW) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.BINDING_CURSE.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.CHORUS_FRUIT) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.CHORUS_FRUIT) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.CHORUS_FRUIT) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.VANISHING_CURSE.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.SMOOTH_STONE) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.SMOOTH_STONE) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.SMOOTH_STONE) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.DENSITY.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.PRISMARINE_SHARD) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.PRISMARINE_SHARD) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.PRISMARINE_SHARD) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.DEPTH_STRIDER.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.CLOCK) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.CLOCK) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.CLOCK) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.EFFICIENCY.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.FEATHER) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.FEATHER) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.FEATHER) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.FEATHER_FALLING.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.GUNPOWDER) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.GUNPOWDER) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.GUNPOWDER) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.FIRE_ASPECT.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.CLAY_BALL) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.CLAY_BALL) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.CLAY_BALL) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.FIRE_PROTECTION.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.FIREWORK_STAR) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.FIREWORK_STAR) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.FIREWORK_STAR) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.FLAME.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.LAPIS_LAZULI) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.LAPIS_LAZULI) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.LAPIS_LAZULI) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.FORTUNE.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.STICK) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.STICK) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.STICK) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.IMPALING.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.LODESTONE) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.LODESTONE) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.LODESTONE) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.KNOCKBACK.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.EMERALD) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.EMERALD) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.EMERALD) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.LOOTING.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.LEAD) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.LEAD) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.LEAD) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.LOYALTY.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.TROPICAL_FISH) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.TROPICAL_FISH) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.TROPICAL_FISH) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.LUCK_OF_THE_SEA.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.COOKIE) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.COOKIE) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.COOKIE) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.LURE.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.CROSSBOW) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.CROSSBOW) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.CROSSBOW) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.MULTISHOT.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.SPECTRAL_ARROW) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.SPECTRAL_ARROW) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.SPECTRAL_ARROW) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.PIERCING.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.STRING) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.STRING) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.STRING) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.POWER.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.WHEAT) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.WHEAT) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.WHEAT) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.PROJECTILE_PROTECTION.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.COPPER_BLOCK) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.COPPER_BLOCK) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.COPPER_BLOCK) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.PROTECTION.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.ARROW) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.ARROW) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.ARROW) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.PUNCH.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.SUGAR) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.SUGAR) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.SUGAR) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.QUICK_CHARGE.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.INK_SAC) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.INK_SAC) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.INK_SAC) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.RESPIRATION.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.HEART_OF_THE_SEA) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.HEART_OF_THE_SEA) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.HEART_OF_THE_SEA) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.RIPTIDE.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.FLINT) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.FLINT) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.FLINT) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.SHARPNESS.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.ROTTEN_FLESH) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.ROTTEN_FLESH) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.ROTTEN_FLESH) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.SMITE.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.GHAST_TEAR) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.GHAST_TEAR) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.GHAST_TEAR) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.SOUL_SPEED.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.AMETHYST_SHARD) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.AMETHYST_SHARD) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.AMETHYST_SHARD) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.SWEEPING_EDGE.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.ECHO_SHARD) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.ECHO_SHARD) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.ECHO_SHARD) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.SWIFT_SNEAK.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.CACTUS) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.CACTUS) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.CACTUS) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.THORNS.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.SLIME_BALL) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.SLIME_BALL) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.SLIME_BALL) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.UNBREAKING.getValue());
            cost = 3;
            level = 1;
        } else if ((reagent1.isOf(Items.WIND_CHARGE) && reagent2.isEmpty() && reagent3.isEmpty()) ||
                (reagent2.isOf(Items.WIND_CHARGE) && reagent1.isEmpty() && reagent3.isEmpty()) ||
                (reagent3.isOf(Items.WIND_CHARGE) && reagent1.isEmpty() && reagent2.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.WIND_BURST.getValue());
        }

        if (entryOpt.isPresent()) {
            Enchantment enchantment = entryOpt.get().value();

            if (enchantment.isAcceptableItem(tool)) {
                RegistryEntry<Enchantment> enchantmentEntry = entryOpt.get();
                int existingLevel = EnchantmentHelper.getLevel(enchantmentEntry, tool);

                if( level == 2 && existingLevel < 1) {
                    return new TripleMagicBenchEnchantmentSelector.EnchantmentResult(ItemStack.EMPTY, 42069);
                }
                if( level == 3 && existingLevel < 2) {
                    return new TripleMagicBenchEnchantmentSelector.EnchantmentResult(ItemStack.EMPTY, 42069);
                }
                if( level == 4 && existingLevel < 3) {
                    return new TripleMagicBenchEnchantmentSelector.EnchantmentResult(ItemStack.EMPTY, 42069);
                }
                if( level == 5 && existingLevel < 4) {
                    return new TripleMagicBenchEnchantmentSelector.EnchantmentResult(ItemStack.EMPTY, 42069);
                }

                ItemStack result = tool.copy();
                removeConflictingEnchantments(result, entryOpt.get());
                result.addEnchantment(entryOpt.get(), level);
                return new EnchantmentResult(result, cost);
            }
        }

        return new EnchantmentResult(ItemStack.EMPTY, 0);
    }

    private static void removeConflictingEnchantments(ItemStack stack, RegistryEntry<Enchantment> candidateEntry) {
        EnchantmentHelper.apply(stack, builder -> {
            Collection<RegistryEntry<Enchantment>> existing = builder.getEnchantments();
            List<RegistryEntry<Enchantment>> toRemove = new ArrayList<>();

            for (RegistryEntry<Enchantment> entry : existing) {
                if (!EnchantmentHelper.isCompatible(Collections.singleton(entry), candidateEntry)) {
                    toRemove.add(entry);
                }
            }

            for (RegistryEntry<Enchantment> entry : toRemove) {
                builder.remove(e -> e.equals(entry));
            }
        });
    }
}
