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

public class MagicBenchEnchantmentSelector {

    public record EnchantmentResult(ItemStack result, int cost) {}

    public static EnchantmentResult applyEnchantment(ItemStack tool, ItemStack reagent, World world) {
        Optional<RegistryEntry.Reference<Enchantment>> entryOpt = Optional.empty();
        int cost = 3;

            if (reagent.isOf(Items.FERMENTED_SPIDER_EYE)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.BANE_OF_ARTHROPODS.getValue());

            } else if (reagent.isOf(Items.BRICKS)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.BLAST_PROTECTION.getValue());

            } else if (reagent.isOf(Items.BRICK)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.BREACH.getValue());

            } else if (reagent.isOf(Items.SUSPICIOUS_STEW)) {
                    entryOpt = world.getRegistryManager()
                            .getOrThrow(RegistryKeys.ENCHANTMENT)
                            .getEntry(Enchantments.BINDING_CURSE.getValue());

            } else if (reagent.isOf(Items.CHORUS_FRUIT)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.VANISHING_CURSE.getValue());

            } else if (reagent.isOf(Items.SMOOTH_STONE)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.DENSITY.getValue());

            } else if (reagent.isOf(Items.PRISMARINE_SHARD)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.DEPTH_STRIDER.getValue());

            } else if (reagent.isOf(Items.CLOCK)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.EFFICIENCY.getValue());

            } else if (reagent.isOf(Items.FEATHER)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.FEATHER_FALLING.getValue());

            } else if (reagent.isOf(Items.GUNPOWDER)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.FIRE_ASPECT.getValue());

            } else if (reagent.isOf(Items.CLAY_BALL)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.FIRE_PROTECTION.getValue());

            } else if (reagent.isOf(Items.FIREWORK_STAR)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.FLAME.getValue());

            } else if (reagent.isOf(Items.LAPIS_LAZULI)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.FORTUNE.getValue());

            } else if (reagent.isOf(Items.STICK)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.IMPALING.getValue());

            } else if (reagent.isOf(Items.LODESTONE)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.KNOCKBACK.getValue());

            } else if (reagent.isOf(Items.EMERALD)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.LOOTING.getValue());

            } else if (reagent.isOf(Items.LEAD)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.LOYALTY.getValue());

            } else if (reagent.isOf(Items.TROPICAL_FISH)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.LUCK_OF_THE_SEA.getValue());

            } else if (reagent.isOf(Items.COOKIE)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.LURE.getValue());

            } else if (reagent.isOf(Items.CROSSBOW)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.MULTISHOT.getValue());

            } else if (reagent.isOf(Items.SPECTRAL_ARROW)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.PIERCING.getValue());

            } else if (reagent.isOf(Items.STRING)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.POWER.getValue());

            } else if (reagent.isOf(Items.WHEAT)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.PROJECTILE_PROTECTION.getValue());

            } else if (reagent.isOf(Items.COPPER_BLOCK)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.PROTECTION.getValue());

            } else if (reagent.isOf(Items.ARROW)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.PUNCH.getValue());

            } else if (reagent.isOf(Items.SUGAR)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.QUICK_CHARGE.getValue());

            } else if (reagent.isOf(Items.INK_SAC)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.RESPIRATION.getValue());

            } else if (reagent.isOf(Items.HEART_OF_THE_SEA)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.RIPTIDE.getValue());

            } else if (reagent.isOf(Items.FLINT)) {
                    entryOpt = world.getRegistryManager()
                            .getOrThrow(RegistryKeys.ENCHANTMENT)
                            .getEntry(Enchantments.SHARPNESS.getValue());

            } else if (reagent.isOf(Items.ROTTEN_FLESH)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.SMITE.getValue());

            } else if (reagent.isOf(Items.GHAST_TEAR)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.SOUL_SPEED.getValue());

            } else if (reagent.isOf(Items.AMETHYST_SHARD)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.SWEEPING_EDGE.getValue());

            } else if (reagent.isOf(Items.ECHO_SHARD)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.SWIFT_SNEAK.getValue());

            } else if (reagent.isOf(Items.CACTUS)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.THORNS.getValue());

            } else if (reagent.isOf(Items.SLIME_BALL)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.UNBREAKING.getValue());

            } else if (reagent.isOf(Items.WIND_CHARGE)) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.WIND_BURST.getValue());
            }



        if (entryOpt.isPresent()) {
            Enchantment enchantment = entryOpt.get().value();
            if (enchantment.isAcceptableItem(tool)) {
                ItemStack result = tool.copy();
                removeConflictingEnchantments(result, entryOpt.get());
                result.addEnchantment(entryOpt.get(), 1);
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
