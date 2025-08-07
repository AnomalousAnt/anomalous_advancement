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
        int cost = 0;

        if (reagent.isOf(Items.SLIME_BALL)) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.UNBREAKING.getValue());
            cost = 3;
        } else if (reagent.isOf(Items.FLINT)) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.SHARPNESS.getValue());
            cost = 5;
        } else if (reagent.isOf(Items.LAPIS_LAZULI)) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.FORTUNE.getValue());
            cost = 8;
        } else if (reagent.isOf(Items.SPIDER_EYE)) {
            entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.BANE_OF_ARTHROPODS.getValue());
            cost = 2;
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
