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

        //ARMORER

        var armorerTrades = TradeOffers.PROFESSION_TO_LEVELED_TRADE.get(VillagerProfession.ARMORER);
        if (armorerTrades == null) return;

        // ----- NOVICE (level 1) -----
        armorerTrades.put(1, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.COAL, 4),
                        2, 2, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 2),
                        new ItemStack(ModItems.PCOPPER_BOOTS),
                        2, 4, 0.2f
                )
        });

        // ----- APPRENTICE (level 2) -----
        armorerTrades.put(2, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.BELL),
                        2, 12, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 2),
                        new ItemStack(ModItems.PCOPPER_HELMET),
                        2, 24, 0.2f
                )
        });

        // ----- JOURNEYMAN (level 3) -----
        armorerTrades.put(3, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 2),
                        new ItemStack(Items.SHIELD),
                        2, 36, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 3),
                        new ItemStack(ModItems.PCOPPER_LEGGINGS, 8),
                        2, 48, 0.2f
                )
        });

        // ----- EXPERT (level 4) -----
        armorerTrades.put(4, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.COPPER_INGOT),
                        2, 20, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 4),
                        new ItemStack(ModItems.PCOPPER_CHESTPLATE),
                        2, 80, 0.2f
                )
        });

        // ----- MASTER (level 5) -----
        armorerTrades.put(5, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.IRON_INGOT),
                        2, 20, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.RESIN_CLUMP),
                        2, 20, 0.2f
                )
        });

        //FLETCHER

        var fletcherTrades = TradeOffers.PROFESSION_TO_LEVELED_TRADE.get(VillagerProfession.FLETCHER);
        if (fletcherTrades == null) return;

        // ----- NOVICE (level 1) -----
        fletcherTrades.put(1, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.STRING, 3),
                        2, 2, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.ARROW, 8),
                        2, 2, 0.2f
                )
        });

        // ----- APPRENTICE (level 2) -----
        fletcherTrades.put(2, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.FEATHER, 3),
                        2, 12, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 2),
                        new ItemStack(Items.CROSSBOW),
                        2, 24, 0.2f
                )
        });

        // ----- JOURNEYMAN (level 3) -----
        fletcherTrades.put(3, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 3),
                        new ItemStack(ModItems.COPPER_BOW),
                        2, 48, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 2),
                        new ItemStack(Items.SPECTRAL_ARROW, 8),
                        2, 32, 0.2f
                )
        });

        // ----- EXPERT (level 4) -----
        fletcherTrades.put(4, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 4),
                        new ItemStack(ModItems.IRON_BOW),
                        2, 80, 0.05f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 3),
                        new ItemStack(Items.FIREWORK_STAR),
                        2, 60, 0.2f
                )
        });

        // ----- MASTER (level 5) -----
        fletcherTrades.put(5, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 4),
                        new ItemStack(Items.FIREWORK_ROCKET),
                        2, 80, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 3),
                        new ItemStack(Items.TIPPED_ARROW, 8),
                        2, 60, 0.2f
                )
        });

        //LEATHERWORKER

        var leatherworkerTrades = TradeOffers.PROFESSION_TO_LEVELED_TRADE.get(VillagerProfession.LEATHERWORKER);
        if (leatherworkerTrades == null) return;

        // ----- NOVICE (level 1) -----
        leatherworkerTrades.put(1, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.LEATHER, 3),
                        2, 2, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(ModItems.PLEATHER_BOOTS),
                        2, 2, 0.2f
                )
        });

        // ----- APPRENTICE (level 2) -----
        leatherworkerTrades.put(2, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.FLINT, 2),
                        2, 12, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(ModItems.PLEATHER_HELMET),
                        2, 12, 0.2f
                )
        });

        // ----- JOURNEYMAN (level 3) -----
        leatherworkerTrades.put(3, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.RABBIT_HIDE, 1),
                        2, 16, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 2),
                        new ItemStack(ModItems.PLEATHER_LEGGINGS),
                        2, 32, 0.2f
                )
        });

        // ----- EXPERT (level 4) -----
        leatherworkerTrades.put(4, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 3),
                        new ItemStack(ModItems.PLEATHER_HORSE_ARMOR),
                        2, 60, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 2),
                        new ItemStack(ModItems.PLEATHER_CHESTPLATE),
                        2, 40, 0.2f
                )
        });

        // ----- MASTER (level 5) -----
        leatherworkerTrades.put(5, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 5),
                        new ItemStack(Items.TURTLE_SCUTE),
                        2, 40, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 5),
                        new ItemStack(Items.SADDLE),
                        2, 40, 0.2f
                )
        });

    }
}