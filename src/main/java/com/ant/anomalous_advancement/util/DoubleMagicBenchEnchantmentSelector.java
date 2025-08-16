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

public class DoubleMagicBenchEnchantmentSelector {

    public record EnchantmentResult(ItemStack result, int cost) {}

    public static EnchantmentResult applyEnchantment(ItemStack tool, ItemStack reagent1, ItemStack reagent2, World world) {
        Optional<RegistryEntry.Reference<Enchantment>> entryOpt = Optional.empty();
        int cost = 99;
        int level = 0;

        // Determine reagents
        boolean hasSlime = reagent1.isOf(Items.SLIME_BALL) || reagent2.isOf(Items.SLIME_BALL);
        boolean hasFlint = reagent1.isOf(Items.FLINT) || reagent2.isOf(Items.FLINT);
        boolean hasLapis = reagent1.isOf(Items.LAPIS_LAZULI) || reagent2.isOf(Items.LAPIS_LAZULI);
        boolean hasSpiderEye = reagent1.isOf(Items.SPIDER_EYE) || reagent2.isOf(Items.SPIDER_EYE);
        boolean hasAmethyst = reagent1.isOf(Items.AMETHYST_SHARD) || reagent2.isOf(Items.AMETHYST_SHARD);

        // Double-reagent enchantments
        if ((reagent1.isOf(Items.LAPIS_LAZULI) && reagent2.isOf(Items.AMETHYST_SHARD)) ||
                (reagent2.isOf(Items.AMETHYST_SHARD) && reagent1.isOf(Items.LAPIS_LAZULI))) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.FORTUNE.getValue());
            cost = 8;
            level = 2;
        }

        // Single-reagent enchantments
            else if ((reagent1.isOf(Items.SLIME_BALL) && reagent2.isEmpty()) ||
                (reagent2.isOf(Items.SLIME_BALL) && reagent1.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.UNBREAKING.getValue());
            cost = 3;
            level = 1;
            } else if ((reagent1.isOf(Items.SPIDER_EYE) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.SPIDER_EYE) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.BANE_OF_ARTHROPODS.getValue());

            } else if ((reagent1.isOf(Items.BRICKS) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.BRICKS) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.BLAST_PROTECTION.getValue());

            } else if ((reagent1.isOf(Items.BRICK) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.BRICK) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.BREACH.getValue());

            } else if ((reagent1.isOf(Items.SUSPICIOUS_STEW) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.SUSPICIOUS_STEW) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.BINDING_CURSE.getValue());

            } else if ((reagent1.isOf(Items.CHORUS_FRUIT) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.CHORUS_FRUIT) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.VANISHING_CURSE.getValue());

            } else if ((reagent1.isOf(Items.SMOOTH_STONE) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.SMOOTH_STONE) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.DENSITY.getValue());

            } else if ((reagent1.isOf(Items.PRISMARINE_SHARD) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.PRISMARINE_SHARD) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.DEPTH_STRIDER.getValue());

            } else if ((reagent1.isOf(Items.CLOCK) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.CLOCK) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.EFFICIENCY.getValue());

            } else if ((reagent1.isOf(Items.FEATHER) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.FEATHER) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.FEATHER_FALLING.getValue());

            } else if ((reagent1.isOf(Items.GUNPOWDER) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.GUNPOWDER) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.FIRE_ASPECT.getValue());

            } else if ((reagent1.isOf(Items.CLAY_BALL) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.CLAY_BALL) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.FIRE_PROTECTION.getValue());

            } else if ((reagent1.isOf(Items.FIREWORK_STAR) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.FIREWORK_STAR) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.FLAME.getValue());

            } else if ((reagent1.isOf(Items.LAPIS_LAZULI) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.LAPIS_LAZULI) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.FORTUNE.getValue());

            } else if ((reagent1.isOf(Items.STICK) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.STICK) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.IMPALING.getValue());

            } else if ((reagent1.isOf(Items.LODESTONE) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.LODESTONE) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.KNOCKBACK.getValue());

            } else if ((reagent1.isOf(Items.ECHO_SHARD) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.ECHO_SHARD) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.LOOTING.getValue());

            } else if ((reagent1.isOf(Items.LEAD) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.LEAD) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.LOYALTY.getValue());

            } else if ((reagent1.isOf(Items.TROPICAL_FISH) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.TROPICAL_FISH) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.LUCK_OF_THE_SEA.getValue());

            } else if ((reagent1.isOf(Items.COOKIE) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.COOKIE) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.LURE.getValue());

            } else if ((reagent1.isOf(Items.TRIPWIRE_HOOK) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.TRIPWIRE_HOOK) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.MULTISHOT.getValue());

            } else if ((reagent1.isOf(Items.SPECTRAL_ARROW) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.SPECTRAL_ARROW) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.PIERCING.getValue());

            } else if ((reagent1.isOf(Items.STRING) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.STRING) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.POWER.getValue());

            } else if ((reagent1.isOf(Items.WHEAT) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.WHEAT) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.PROJECTILE_PROTECTION.getValue());

            } else if ((reagent1.isOf(Items.COPPER_BLOCK) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.COPPER_BLOCK) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.PROTECTION.getValue());

            } else if ((reagent1.isOf(Items.TIPPED_ARROW) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.TIPPED_ARROW) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.PUNCH.getValue());

            } else if ((reagent1.isOf(Items.SUGAR) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.SUGAR) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.QUICK_CHARGE.getValue());

            } else if ((reagent1.isOf(Items.INK_SAC) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.INK_SAC) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.RESPIRATION.getValue());

            } else if ((reagent1.isOf(Items.HEART_OF_THE_SEA) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.HEART_OF_THE_SEA) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.RIPTIDE.getValue());

            } else if ((reagent1.isOf(Items.FLINT) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.FLINT) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.SHARPNESS.getValue());

            } else if ((reagent1.isOf(Items.ROTTEN_FLESH) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.ROTTEN_FLESH) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.SMITE.getValue());

            } else if ((reagent1.isOf(Items.GHAST_TEAR) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.GHAST_TEAR) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.SOUL_SPEED.getValue());

            } else if ((reagent1.isOf(Items.AMETHYST_SHARD) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.AMETHYST_SHARD) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.SWEEPING_EDGE.getValue());

            } else if ((reagent1.isOf(Items.RABBIT_FOOT) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.RABBIT_FOOT) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.SWIFT_SNEAK.getValue());

            } else if ((reagent1.isOf(Items.VINE) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.VINE) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.THORNS.getValue());

            } else if ((reagent1.isOf(Items.SLIME_BALL) && reagent2.isEmpty()) ||
        (reagent2.isOf(Items.SLIME_BALL) && reagent1.isEmpty())) {
                entryOpt = world.getRegistryManager()
                        .getOrThrow(RegistryKeys.ENCHANTMENT)
                        .getEntry(Enchantments.UNBREAKING.getValue());

        } else if ((reagent1.isOf(Items.WIND_CHARGE) && reagent2.isEmpty()) ||
                (reagent2.isOf(Items.WIND_CHARGE) && reagent1.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.WIND_BURST.getValue());
        }

        // Apply enchantment if valid
        if (entryOpt.isPresent()) {
            Enchantment enchantment = entryOpt.get().value();
            if (enchantment.isAcceptableItem(tool)) {
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
