package com.ant.anomalous_advancement.util;

import java.util.*;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;

public class MagicBenchEnchantmentSelector {

    public record EnchantmentResult(ItemStack result, int cost) {}

    public static EnchantmentResult applyEnchantment(ItemStack tool, ItemStack reagent, Level world) {
        Optional<Holder.Reference<Enchantment>> entryOpt = Optional.empty();
        int cost = 3;

            if (reagent.is(Items.FERMENTED_SPIDER_EYE)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.BANE_OF_ARTHROPODS.identifier());

            } else if (reagent.is(Items.BRICKS)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.BLAST_PROTECTION.identifier());

            } else if (reagent.is(Items.BRICK)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.BREACH.identifier());

            } else if (reagent.is(Items.SUSPICIOUS_STEW)) {
                    entryOpt = world.registryAccess()
                            .lookupOrThrow(Registries.ENCHANTMENT)
                            .get(Enchantments.BINDING_CURSE.identifier());

            } else if (reagent.is(Items.CHORUS_FRUIT)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.VANISHING_CURSE.identifier());

            } else if (reagent.is(Items.SMOOTH_STONE)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.DENSITY.identifier());

            } else if (reagent.is(Items.PRISMARINE_CRYSTALS)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.DEPTH_STRIDER.identifier());

            } else if (reagent.is(Items.SUGAR)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.EFFICIENCY.identifier());

            } else if (reagent.is(Items.FEATHER)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.FEATHER_FALLING.identifier());

            } else if (reagent.is(Items.GUNPOWDER)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.FIRE_ASPECT.identifier());

            } else if (reagent.is(Items.CLAY_BALL)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.FIRE_PROTECTION.identifier());

            } else if (reagent.is(Items.FIREWORK_STAR)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.FLAME.identifier());

            } else if (reagent.is(Items.LAPIS_LAZULI)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.FORTUNE.identifier());

            } else if (reagent.is(Items.STICK)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.IMPALING.identifier());

            } else if (reagent.is(Items.LODESTONE)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.KNOCKBACK.identifier());

            } else if (reagent.is(Items.EMERALD)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.LOOTING.identifier());

            } else if (reagent.is(Items.LEAD)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.LOYALTY.identifier());

            } else if (reagent.is(Items.TROPICAL_FISH)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.LUCK_OF_THE_SEA.identifier());

            } else if (reagent.is(Items.BREAD)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.LURE.identifier());

            } else if (reagent.is(Items.CROSSBOW)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.MULTISHOT.identifier());

            } else if (reagent.is(Items.SPECTRAL_ARROW)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.PIERCING.identifier());

            } else if (reagent.is(Items.STRING)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.POWER.identifier());

            } else if (reagent.is(Items.WHEAT)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.PROJECTILE_PROTECTION.identifier());

            } else if (reagent.is(Items.COPPER_BLOCK)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.PROTECTION.identifier());

            } else if (reagent.is(Items.ARROW)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.PUNCH.identifier());

            } else if (reagent.is(Items.SUGAR_CANE)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.QUICK_CHARGE.identifier());

            } else if (reagent.is(Items.INK_SAC)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.RESPIRATION.identifier());

            } else if (reagent.is(Items.HEART_OF_THE_SEA)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.RIPTIDE.identifier());

            } else if (reagent.is(Items.FLINT)) {
                    entryOpt = world.registryAccess()
                            .lookupOrThrow(Registries.ENCHANTMENT)
                            .get(Enchantments.SHARPNESS.identifier());

            } else if (reagent.is(Items.ROTTEN_FLESH)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.SMITE.identifier());

            } else if (reagent.is(Items.GHAST_TEAR)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.SOUL_SPEED.identifier());

            } else if (reagent.is(Items.AMETHYST_SHARD)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.SWEEPING_EDGE.identifier());

            } else if (reagent.is(Items.ECHO_SHARD)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.SWIFT_SNEAK.identifier());

            } else if (reagent.is(Items.CACTUS)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.THORNS.identifier());

            } else if (reagent.is(Items.SLIME_BALL)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.UNBREAKING.identifier());

            } else if (reagent.is(Items.WIND_CHARGE)) {
                entryOpt = world.registryAccess()
                        .lookupOrThrow(Registries.ENCHANTMENT)
                        .get(Enchantments.WIND_BURST.identifier());
            }



        if (entryOpt.isPresent()) {
            Enchantment enchantment = entryOpt.get().value();
            if (enchantment.canEnchant(tool)) {
                ItemStack result = tool.copy();
                removeConflictingEnchantments(result, entryOpt.get());
                result.enchant(entryOpt.get(), 1);
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
