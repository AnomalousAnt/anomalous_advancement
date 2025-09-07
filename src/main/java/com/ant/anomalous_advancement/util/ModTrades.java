package com.ant.anomalous_advancement.util;

import com.ant.anomalous_advancement.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;

public class ModTrades {
    public static void registerModTrades() {
        var armorerTrades = TradeOffers.PROFESSION_TO_LEVELED_TRADE.get(VillagerProfession.ARMORER);
        if (armorerTrades == null) return;

        // ----- NOVICE (level 1) -----
        armorerTrades.put(1, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.COAL, 15),
                        new ItemStack(Items.EMERALD, 1),
                        16, 2, 0.05f
                ),
                (entity, random) -> {
                    return switch (random.nextInt(4)) {
                        case 0 -> new TradeOffer(new TradedItem(Items.EMERALD, 5), new ItemStack(ModItems.PCOPPER_HELMET), 12, 1, 0.2f);
                        case 1 -> new TradeOffer(new TradedItem(Items.EMERALD, 8), new ItemStack(ModItems.PCOPPER_CHESTPLATE), 12, 1, 0.2f);
                        case 2 -> new TradeOffer(new TradedItem(Items.EMERALD, 7), new ItemStack(ModItems.PCOPPER_LEGGINGS), 12, 1, 0.2f);
                        default -> new TradeOffer(new TradedItem(Items.EMERALD, 4), new ItemStack(ModItems.PCOPPER_BOOTS), 12, 1, 0.2f);
                    };
                }
        });

        // ----- APPRENTICE (level 2) -----
        armorerTrades.put(2, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.COPPER_INGOT, 8),
                        new ItemStack(Items.EMERALD, 1),
                        12, 10, 0.05f
                ),
                (entity, random) -> {
                    return switch (random.nextInt(3)) {
                        case 0 -> new TradeOffer(new TradedItem(Items.EMERALD, 36), new ItemStack(Items.BELL), 12, 5, 0.2f);
                        case 1 -> new TradeOffer(new TradedItem(Items.EMERALD, 10), new ItemStack(ModItems.PCHAIN_LEGGINGS), 12, 5, 0.2f);
                        default -> new TradeOffer(new TradedItem(Items.EMERALD, 6), new ItemStack(ModItems.PCHAIN_BOOTS), 12, 5, 0.2f);
                    };
                }
        });

        // ----- JOURNEYMAN (level 3) -----
        armorerTrades.put(3, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.LAVA_BUCKET, 1),
                        new ItemStack(Items.EMERALD, 1),
                        12, 20, 0.05f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.IRON_INGOT, 4),
                        new ItemStack(Items.EMERALD, 1),
                        12, 20, 0.05f
                ),
                (entity, random) -> {
                    return switch (random.nextInt(3)) {
                        case 0 -> new TradeOffer(new TradedItem(Items.EMERALD, 7), new ItemStack(ModItems.PCHAIN_HELMET), 12, 10, 0.2f);
                        case 1 -> new TradeOffer(new TradedItem(Items.EMERALD, 12), new ItemStack(ModItems.PCHAIN_CHESTPLATE), 12, 10, 0.2f);
                        default -> new TradeOffer(new TradedItem(Items.EMERALD, 5), new ItemStack(Items.SHIELD), 12, 10, 0.2f);
                    };
                }
        });

        // ----- EXPERT (level 4) -----
        armorerTrades.put(4, new TradeOffers.Factory[]{
                (entity, random) -> {
                    if (random.nextBoolean()) {
                        return new TradeOffer(new TradedItem(Items.EMERALD, 14), new ItemStack(ModItems.PIRON_LEGGINGS), 3, 15, 0.2f);
                    } else {
                        return new TradeOffer(new TradedItem(Items.EMERALD, 8), new ItemStack(ModItems.PIRON_BOOTS), 3, 15, 0.2f);
                    }
                }
        });

        // ----- MASTER (level 5) -----
        armorerTrades.put(5, new TradeOffers.Factory[]{
                (entity, random) -> {
                    if (random.nextBoolean()) {
                        return new TradeOffer(new TradedItem(Items.EMERALD, 10), new ItemStack(ModItems.PIRON_HELMET), 3, 30, 0.2f);
                    } else {
                        return new TradeOffer(new TradedItem(Items.EMERALD, 16), new ItemStack(ModItems.PIRON_CHESTPLATE), 3, 30, 0.2f);
                    }
                }
        });
    }
}
