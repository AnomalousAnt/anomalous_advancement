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
                        2, 32, 0.2f
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

        //BUTCHER

        var butcherTrades = TradeOffers.PROFESSION_TO_LEVELED_TRADE.get(VillagerProfession.BUTCHER);
        if (butcherTrades == null) return;

        // ----- NOVICE (level 1) -----
        butcherTrades.put(1, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.CHICKEN, 6),
                        2, 2, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.RABBIT, 6),
                        2, 2, 0.2f
                )
        });

        // ----- APPRENTICE (level 2) -----
        butcherTrades.put(2, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.MUTTON, 5),
                        2, 12, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.PORKCHOP, 5),
                        2, 12, 0.2f
                )
        });

        // ----- JOURNEYMAN (level 3) -----
        butcherTrades.put(3, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.BEEF, 5),
                        2, 16, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.COOKED_CHICKEN, 4),
                        2, 16, 0.2f
                )
        });

        // ----- EXPERT (level 4) -----
        butcherTrades.put(4, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.COOKED_RABBIT, 4),
                        2, 20, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 4),
                        new ItemStack(Items.RABBIT_STEW, 4),
                        2, 20, 0.2f
                )
        });

        // ----- MASTER (level 5) -----
        butcherTrades.put(5, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.COOKED_BEEF, 3),
                        2, 20, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.SUSPICIOUS_STEW, 1),
                        2, 20, 0.2f
                )
        });

        //CARTOGRAPHER

        var cartographerTrades = TradeOffers.PROFESSION_TO_LEVELED_TRADE.get(VillagerProfession.CARTOGRAPHER);
        if (cartographerTrades == null) return;

        // ----- NOVICE (level 1) -----
        cartographerTrades.put(1, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.PAPER, 8),
                        2, 2, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 3),
                        new ItemStack(Items.MAP),
                        2, 2, 0.2f
                )
        });
        // ----- APPRENTICE (level 2) -----
        // ----- JOURNEYMAN (level 3) -----
        // ----- EXPERT (level 4) -----
        // ----- MASTER (level 5) -----

        //CLERIC

        var clericTrades = TradeOffers.PROFESSION_TO_LEVELED_TRADE.get(VillagerProfession.CLERIC);
        if (clericTrades == null) return;

        // ----- NOVICE (level 1) -----
        clericTrades.put(1, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.REDSTONE, 2),
                        2, 2, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.CLAY_BALL, 8),
                        2, 2, 0.2f
                )
        });

        // ----- APPRENTICE (level 2) -----
        clericTrades.put(2, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.LAPIS_LAZULI, 1),
                        2, 12, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 3),
                        new ItemStack(Items.AMETHYST_SHARD, 1),
                        2, 36, 0.2f
                )
        });

        // ----- JOURNEYMAN (level 3) -----
        clericTrades.put(3, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.INK_SAC),
                        2, 16, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 3),
                        new ItemStack(Items.NAUTILUS_SHELL),
                        2, 48, 0.2f
                )
        });

        // ----- EXPERT (level 4) -----
        clericTrades.put(4, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 3),
                        new ItemStack(Items.FIRE_CHARGE),
                        2, 80, 0.05f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 4),
                        new ItemStack(Items.GOAT_HORN),
                        2, 80, 0.2f
                )
        });

        // ----- MASTER (level 5) -----
        clericTrades.put(5, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 4),
                        new ItemStack(Items.WIND_CHARGE),
                        2, 80, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 5),
                        new ItemStack(Items.EXPERIENCE_BOTTLE),
                        2, 80, 0.2f
                )
        });

        //FARMER

        var farmerTrades = TradeOffers.PROFESSION_TO_LEVELED_TRADE.get(VillagerProfession.FARMER);
        if (farmerTrades == null) return;

        // ----- NOVICE (level 1) -----
        farmerTrades.put(1, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.WHEAT_SEEDS, 32),
                        2, 2, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.POTATO, 32),
                        2, 2, 0.2f
                )
        });

        // ----- APPRENTICE (level 2) -----
        farmerTrades.put(2, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.SWEET_BERRIES, 32),
                        2, 12, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.BEETROOT_SEEDS, 32),
                        2, 12, 0.2f
                )
        });

        // ----- JOURNEYMAN (level 3) -----
        farmerTrades.put(3, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.CARROT, 32),
                        2, 16, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.SUGAR_CANE, 16),
                        2, 32, 0.2f
                )
        });

        // ----- EXPERT (level 4) -----
        farmerTrades.put(4, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 2),
                        new ItemStack(Items.MELON_SEEDS, 16),
                        2, 40, 0.05f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 2),
                        new ItemStack(Items.PUMPKIN_SEEDS, 16),
                        2, 40, 0.2f
                )
        });

        // ----- MASTER (level 5) -----
        farmerTrades.put(5, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 3),
                        new ItemStack(Items.BAMBOO, 12),
                        2, 80, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.APPLE, 8),
                        2, 60, 0.2f
                )
        });

        //FISHERMAN

        var fishermanTrades = TradeOffers.PROFESSION_TO_LEVELED_TRADE.get(VillagerProfession.FISHERMAN);
        if (fishermanTrades == null) return;

        // ----- NOVICE (level 1) -----
        fishermanTrades.put(1, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.COD, 6),
                        2, 2, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.SALMON, 6),
                        2, 2, 0.2f
                )
        });

        // ----- APPRENTICE (level 2) -----
        fishermanTrades.put(2, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.PUFFERFISH, 4),
                        2, 12, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.TROPICAL_FISH, 4),
                        2, 12, 0.2f
                )
        });

        // ----- JOURNEYMAN (level 3) -----
        fishermanTrades.put(3, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.LILY_PAD, 8),
                        2, 16, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.FISHING_ROD),
                        2, 16, 0.2f
                )
        });

        // ----- EXPERT (level 4) -----
        fishermanTrades.put(4, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 5),
                        new ItemStack(Items.NAME_TAG),
                        2, 100, 0.05f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 2),
                        new ItemStack(Items.COCOA_BEANS, 16),
                        2, 40, 0.2f
                )
        });

        // ----- MASTER (level 5) -----
        fishermanTrades.put(5, new TradeOffers.Factory[]{
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 1),
                        new ItemStack(Items.PRISMARINE_CRYSTALS, 3),
                        2, 20, 0.2f
                ),
                (entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 16),
                        new ItemStack(Items.HEART_OF_THE_SEA, 8),
                        2, 320, 0.2f
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