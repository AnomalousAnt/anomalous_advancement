
//        //WEAPONSMITH
//
//        var weaponsmithTrades = VillagerTrades.TRADES.get(VillagerProfession.WEAPONSMITH);
//        if (weaponsmithTrades == null) return;
//
//        // ----- NOVICE (level 1) -----
//        weaponsmithTrades.put(1, new VillagerTrades.ItemListing[]{
//                (entity, random, level) -> new MerchantOffer(
//                        new ItemCost(Items.EMERALD, 1),
//                        new ItemStack(ModItems.FLINT_AXE),
//                        2, 2, 0.2f
//                ),
//                (entity, random, level) -> new MerchantOffer(
//                        new ItemCost(Items.EMERALD, 1),
//                        new ItemStack(ModItems.FLINT_SWORD),
//                        2, 2, 0.2f
//                )
//        });
//
//        // ----- APPRENTICE (level 2) -----
//        weaponsmithTrades.put(2, new VillagerTrades.ItemListing[]{
//                (entity, random, level) -> new MerchantOffer(
//                        new ItemCost(Items.EMERALD, 2),
//                        new ItemStack(Items.STONE_AXE),
//                        2, 24, 0.2f
//                ),
//                (entity, random, level) -> new MerchantOffer(
//                        new ItemCost(Items.EMERALD, 2),
//                        new ItemStack(Items.STONE_SWORD),
//                        2, 24, 0.2f
//                )
//        });
//
//        // ----- JOURNEYMAN (level 3) -----
//        weaponsmithTrades.put(3, new VillagerTrades.ItemListing[]{
//                (entity, random, level) -> new MerchantOffer(
//                        new ItemCost(Items.EMERALD, 3),
//                        new ItemStack(Items.COPPER_AXE),
//                        2, 48, 0.2f
//                ),
//                (entity, random, level) -> new MerchantOffer(
//                        new ItemCost(Items.EMERALD, 3),
//                        new ItemStack(Items.COPPER_SWORD),
//                        2, 48, 0.2f
//                )
//        });
//
//        // ----- EXPERT (level 4) -----
//        weaponsmithTrades.put(4, new VillagerTrades.ItemListing[]{
//                (entity, random, level) -> new MerchantOffer(
//                        new ItemCost(Items.EMERALD, 4),
//                        new ItemStack(Items.IRON_AXE),
//                        2, 80, 0.05f
//                ),
//                (entity, random, level) -> new MerchantOffer(
//                        new ItemCost(Items.EMERALD, 4),
//                        new ItemStack(Items.IRON_SWORD),
//                        2, 80, 0.2f
//                )
//        });
//
//        // ----- MASTER (level 5) -----
//        weaponsmithTrades.put(5, new VillagerTrades.ItemListing[]{
//                (entity, random, level) -> new MerchantOffer(
//                        new ItemCost(Items.EMERALD, 5),
//                        new ItemStack(Items.GOLDEN_AXE),
//                        2, 100, 0.2f
//                ),
//                (entity, random, level) -> new MerchantOffer(
//                        new ItemCost(Items.EMERALD, 5),
//                        new ItemStack(Items.GOLDEN_SWORD),
//                        2, 100, 0.2f
//                )
//        });
//    }
//}