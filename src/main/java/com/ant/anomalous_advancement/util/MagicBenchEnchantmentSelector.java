package com.ant.anomalous_advancement.util; // Adjust if your package is different

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.World;
import net.minecraft.enchantment.Enchantments;

import java.util.Optional;

public class MagicBenchEnchantmentSelector {

    public static Optional<ItemStack> applyEnchantment(ItemStack tool, ItemStack reagent, World world) {
        if (reagent.isOf(Items.SLIME_BALL)) {
            Optional<RegistryEntry.Reference<Enchantment>> entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.UNBREAKING.getValue());

            if (entryOpt.isPresent()) {
                Enchantment enchantment = entryOpt.get().value();
                if (enchantment.isAcceptableItem(tool)) {
                    ItemStack result = tool.copy();
                    result.addEnchantment(entryOpt.get(), 1);
                    return Optional.of(result);
                }
            }
        }

        if (reagent.isOf(Items.FLINT)) {
            Optional<RegistryEntry.Reference<Enchantment>> entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.SHARPNESS.getValue());

            if (entryOpt.isPresent()) {
                Enchantment enchantment = entryOpt.get().value();
                if (enchantment.isAcceptableItem(tool)) {
                    ItemStack result = tool.copy();
                    result.addEnchantment(entryOpt.get(), 1);
                    return Optional.of(result);
                }
            }
        }

        if (reagent.isOf(Items.LAPIS_LAZULI)) {
            Optional<RegistryEntry.Reference<Enchantment>> entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.FORTUNE.getValue());

            if (entryOpt.isPresent()) {
                Enchantment enchantment = entryOpt.get().value();
                if (enchantment.isAcceptableItem(tool)) {
                    ItemStack result = tool.copy();
                    result.addEnchantment(entryOpt.get(), 1);
                    return Optional.of(result);
                }
            }
        }

        if (reagent.isOf(Items.SPIDER_EYE)) {
            Optional<RegistryEntry.Reference<Enchantment>> entryOpt = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.ENCHANTMENT)
                    .getEntry(Enchantments.BANE_OF_ARTHROPODS.getValue());

            if (entryOpt.isPresent()) {
                Enchantment enchantment = entryOpt.get().value();
                if (enchantment.isAcceptableItem(tool)) {
                    ItemStack result = tool.copy();
                    result.addEnchantment(entryOpt.get(), 1);
                    return Optional.of(result);
                }
            }
        }

        return Optional.empty();
    }
}
