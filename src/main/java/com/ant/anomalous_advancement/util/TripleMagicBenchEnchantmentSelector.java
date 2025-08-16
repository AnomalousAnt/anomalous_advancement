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

        // Determine reagents
        boolean hasSlime = reagent1.isOf(Items.SLIME_BALL) || reagent2.isOf(Items.SLIME_BALL) || reagent3.isOf(Items.SLIME_BALL);
        boolean hasFlint = reagent1.isOf(Items.FLINT) || reagent2.isOf(Items.FLINT) || reagent3.isOf(Items.FLINT);
        boolean hasLapis = reagent1.isOf(Items.LAPIS_LAZULI) || reagent2.isOf(Items.LAPIS_LAZULI) | reagent3.isOf(Items.LAPIS_LAZULI);
        boolean hasSpiderEye = reagent1.isOf(Items.SPIDER_EYE) || reagent2.isOf(Items.SPIDER_EYE) || reagent3.isOf(Items.SPIDER_EYE);
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
        else if (hasLapis && hasAmethyst) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.FORTUNE.getValue());
            cost = 8;
            level = 2;
        }

        // Single-reagent enchantments
        else if (hasSlime) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.UNBREAKING.getValue());
            cost = 3;
            level = 1;
        } else if (hasFlint) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.SHARPNESS.getValue());
            cost = 5;
            level = 1;
        } else if (hasSpiderEye) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.BANE_OF_ARTHROPODS.getValue());
            cost = 2;
            level = 1;
        }
        else if ((reagent1.isOf(Items.LAPIS_LAZULI) && reagent2.isEmpty()) ||
                (reagent2.isOf(Items.LAPIS_LAZULI) && reagent1.isEmpty())) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.FORTUNE.getValue());
            cost = 8;
            level = 1; // Fortune I
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
