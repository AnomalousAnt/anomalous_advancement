package com.ant.anomalous_advancement.util;

import com.ant.anomalous_advancement.item.ModItems;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.entry.EmptyEntry;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.loot.function.EnchantWithLevelsLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.item.Items;

public class ModLootTableModifiers {
    public static void modifyLootTables() {
        LootTableEvents.REPLACE.register((key, original, source, registry) -> {
            if (source.isBuiltin() && LootTables.VILLAGE_TANNERY_CHEST.equals(key)) {
                LootPool.Builder pool1 = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(1.0f, 5.0f))
                        .with(ItemEntry.builder(Items.LEATHER).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f))))
                        .with(ItemEntry.builder(ModItems.PLEATHER_CHESTPLATE).weight(2))
                        .with(ItemEntry.builder(ModItems.PLEATHER_BOOTS).weight(2))
                        .with(ItemEntry.builder(ModItems.PLEATHER_HELMET).weight(2))
                        .with(ItemEntry.builder(Items.BREAD).weight(5).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f))))
                        .with(ItemEntry.builder(ModItems.PLEATHER_LEGGINGS).weight(2))
                        .with(ItemEntry.builder(Items.SADDLE))
                        .with(ItemEntry.builder(Items.EMERALD).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f))));

                LootPool.Builder pool2 = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(1.0f, 1.0f))
                        .with(ItemEntry.builder(Items.BUNDLE).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f))));

                LootTable.Builder table = LootTable.builder()
                        .type(LootContextTypes.CHEST)
                        .pool(pool1)
                        .pool(pool2);

                return table.build();
            }

            if (source.isBuiltin() && LootTables.SHIPWRECK_SUPPLY_CHEST.equals(key)) {
                LootPool.Builder pool = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(3.0f, 10.0f))
                        .with(ItemEntry.builder(Items.PAPER).weight(8).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 12.0f))))
                        .with(ItemEntry.builder(Items.POTATO).weight(7).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 6.0f))))
                        .with(ItemEntry.builder(Items.MOSS_BLOCK).weight(7).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f))))
                        .with(ItemEntry.builder(Items.POISONOUS_POTATO).weight(7).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 6.0f))))
                        .with(ItemEntry.builder(Items.CARROT).weight(7).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 8.0f))))
                        .with(ItemEntry.builder(Items.WHEAT).weight(7).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(8.0f, 21.0f))))
                        .with(ItemEntry.builder(Items.SUSPICIOUS_STEW).weight(10))
                        .with(ItemEntry.builder(Items.COAL).weight(6).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 8.0f))))
                        .with(ItemEntry.builder(Items.ROTTEN_FLESH).weight(5).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(5.0f, 24.0f))))
                        .with(ItemEntry.builder(Items.PUMPKIN).weight(2).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f))))
                        .with(ItemEntry.builder(Items.BAMBOO).weight(2).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f))))
                        .with(ItemEntry.builder(Items.GUNPOWDER).weight(3).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f))))
                        .with(ItemEntry.builder(Items.TNT))
                        .with(ItemEntry.builder(ModItems.PLEATHER_HELMET).weight(3))
                        .with(ItemEntry.builder(ModItems.PLEATHER_CHESTPLATE).weight(3))
                        .with(ItemEntry.builder(ModItems.PLEATHER_LEGGINGS).weight(3))
                        .with(ItemEntry.builder(ModItems.PLEATHER_BOOTS).weight(3));

                LootTable.Builder table = LootTable.builder().type(LootContextTypes.CHEST).pool(pool);
                return table.build();
            }

            if (source.isBuiltin() && LootTables.BURIED_TREASURE_CHEST.equals(key)) {
                LootPool.Builder pool1 = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(1.0f,1.0f))
                        .with(ItemEntry.builder(Items.HEART_OF_THE_SEA));
                LootPool.Builder pool2 = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(5.0f,8.0f))
                        .with(ItemEntry.builder(Items.IRON_NUGGET).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,4.0f))).weight(20))
                        .with(ItemEntry.builder(Items.GOLD_NUGGET).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,4.0f))).weight(10))
                        .with(ItemEntry.builder(Items.TNT).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,2.0f))).weight(5));
                LootPool.Builder pool3 = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(1.0f,3.0f))
                        .with(ItemEntry.builder(Items.EMERALD).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f,8.0f))).weight(5))
                        .with(ItemEntry.builder(Items.DIAMOND).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,2.0f))).weight(5))
                        .with(ItemEntry.builder(Items.PRISMARINE_CRYSTALS).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,5.0f))).weight(5));
                LootPool.Builder pool4 = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(0.0f,1.0f))
                        .with(ItemEntry.builder(ModItems.PLEATHER_CHESTPLATE))
                        .with(ItemEntry.builder(Items.IRON_SWORD));
                LootPool.Builder pool5 = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(2.0f,2.0f))
                        .with(ItemEntry.builder(Items.COOKED_COD).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f,4.0f))))
                        .with(ItemEntry.builder(Items.COOKED_SALMON).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f,4.0f))));
                LootPool.Builder pool6 = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(0.0f,2.0f))
                        .with(ItemEntry.builder(Items.PUFFERFISH));
                LootTable.Builder table = LootTable.builder()
                        .type(LootContextTypes.CHEST)
                        .pool(pool1)
                        .pool(pool2)
                        .pool(pool3)
                        .pool(pool4)
                        .pool(pool5)
                        .pool(pool6);
                return table.build();
            }

            if (source.isBuiltin() && LootTables.UNDERWATER_RUIN_SMALL_CHEST.equals(key)) {
                LootPool.Builder pool1 = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(2.0f, 8.0f))
                        .with(ItemEntry.builder(Items.COAL).weight(10).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f))))
                        .with(ItemEntry.builder(Items.STONE_AXE).weight(2))
                        .with(ItemEntry.builder(Items.ROTTEN_FLESH).weight(5))
                        .with(ItemEntry.builder(Items.EMERALD))
                        .with(ItemEntry.builder(Items.WHEAT).weight(10).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 3.0f))));

                LootPool.Builder pool2 = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(1.0f, 1.0f))
                        .with(ItemEntry.builder(ModItems.PLEATHER_CHESTPLATE))
                        .with(ItemEntry.builder(ModItems.PGOLD_HELMET))
                        .with(ItemEntry.builder(Items.FISHING_ROD).weight(5))
                        .with(ItemEntry.builder(Items.MAP).weight(5));

                LootTable.Builder table = LootTable.builder()
                        .type(LootContextTypes.CHEST)
                        .pool(pool1)
                        .pool(pool2);

                return table.build();
            }

            if (source.isBuiltin() && LootTables.UNDERWATER_RUIN_BIG_CHEST.equals(key)) {
                LootPool.Builder pool1 = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(2.0f, 8.0f))
                        .with(ItemEntry.builder(Items.COAL)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f))))
                        .with(ItemEntry.builder(Items.GOLD_NUGGET)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)))
                                .weight(10))
                        .with(ItemEntry.builder(Items.EMERALD))
                        .with(ItemEntry.builder(Items.WHEAT)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 3.0f)))
                                .weight(10));

                LootPool.Builder pool2 = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(1.0f, 1.0f))
                        .with(ItemEntry.builder(Items.GOLDEN_APPLE))
                        .with(ItemEntry.builder(ModItems.PLEATHER_CHESTPLATE))
                        .with(ItemEntry.builder(ModItems.PGOLD_HELMET))
                        .with(ItemEntry.builder(Items.BOOK).weight(5))
                        .with(ItemEntry.builder(Items.FISHING_ROD).weight(5))
                        .with(ItemEntry.builder(Items.MAP).weight(10));

                LootTable.Builder table = LootTable.builder()
                        .type(LootContextTypes.CHEST)
                        .pool(pool1)
                        .pool(pool2);

                return table.build();
            }

            if (source.isBuiltin() && LootTables.STRONGHOLD_CORRIDOR_CHEST.equals(key)) {
                LootPool.Builder pool1=LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(2.0f,3.0f))
                        .with(ItemEntry.builder(Items.ENDER_PEARL).weight(10))
                        .with(ItemEntry.builder(Items.DIAMOND).weight(3).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,3.0f))))
                        .with(ItemEntry.builder(Items.IRON_INGOT).weight(10).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,5.0f))))
                        .with(ItemEntry.builder(Items.GOLD_INGOT).weight(5).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,3.0f))))
                        .with(ItemEntry.builder(Items.REDSTONE).weight(5).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f,9.0f))))
                        .with(ItemEntry.builder(Items.BREAD).weight(15).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,3.0f))))
                        .with(ItemEntry.builder(Items.APPLE).weight(15).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,3.0f))))
                        .with(ItemEntry.builder(Items.IRON_PICKAXE).weight(5))
                        .with(ItemEntry.builder(Items.IRON_SWORD).weight(5))
                        .with(ItemEntry.builder(ModItems.PIRON_CHESTPLATE).weight(5))
                        .with(ItemEntry.builder(ModItems.PIRON_HELMET).weight(5))
                        .with(ItemEntry.builder(ModItems.PIRON_LEGGINGS).weight(5))
                        .with(ItemEntry.builder(ModItems.PIRON_BOOTS).weight(5))
                        .with(ItemEntry.builder(Items.GOLDEN_APPLE))
                        .with(ItemEntry.builder(Items.LEATHER).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,5.0f))))
                        .with(ItemEntry.builder(Items.IRON_HORSE_ARMOR))
                        .with(ItemEntry.builder(Items.GOLDEN_HORSE_ARMOR))
                        .with(ItemEntry.builder(Items.DIAMOND_HORSE_ARMOR))
                        .with(ItemEntry.builder(Items.MUSIC_DISC_OTHERSIDE))
                        .with(ItemEntry.builder(Items.BOOK));
                LootPool.Builder pool2=LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0f))
                        .with(EmptyEntry.builder().weight(9))
                        .with(ItemEntry.builder(Items.EYE_ARMOR_TRIM_SMITHING_TEMPLATE));
                LootTable.Builder table=LootTable.builder().type(LootContextTypes.CHEST).pool(pool1).pool(pool2);
                return table.build();
            }

            if (source.isBuiltin() && LootTables.VILLAGE_WEAPONSMITH_CHEST.equals(key)) {
                LootPool.Builder pool1 = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(3.0f, 8.0f))
                        .with(ItemEntry.builder(Items.DIAMOND).weight(3).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f))))
                        .with(ItemEntry.builder(Items.IRON_NUGGET).weight(10).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f))))
                        .with(ItemEntry.builder(Items.GOLD_NUGGET).weight(5).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f))))
                        .with(ItemEntry.builder(Items.BREAD).weight(15).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f))))
                        .with(ItemEntry.builder(Items.APPLE).weight(15).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f))))
                        .with(ItemEntry.builder(Items.STONE_PICKAXE).weight(5))
                        .with(ItemEntry.builder(Items.STONE_SWORD).weight(5))
                        .with(ItemEntry.builder(ModItems.PIRON_CHESTPLATE).weight(5))
                        .with(ItemEntry.builder(ModItems.PIRON_HELMET).weight(5))
                        .with(ItemEntry.builder(ModItems.PIRON_LEGGINGS).weight(5))
                        .with(ItemEntry.builder(ModItems.PIRON_BOOTS).weight(5))
                        .with(ItemEntry.builder(Items.OBSIDIAN).weight(5).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3.0f, 7.0f))))
                        .with(ItemEntry.builder(Items.OAK_SAPLING).weight(5).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3.0f, 7.0f))))
                        .with(ItemEntry.builder(Items.SADDLE).weight(3))
                        .with(ItemEntry.builder(Items.IRON_HORSE_ARMOR))
                        .with(ItemEntry.builder(Items.GOLDEN_HORSE_ARMOR))
                        .with(ItemEntry.builder(Items.DIAMOND_HORSE_ARMOR));

                LootPool.Builder pool2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0f))
                        .with(ItemEntry.builder(Items.BUNDLE))
                        .with(EmptyEntry.builder().weight(2));

                LootTable.Builder table = LootTable.builder()
                        .type(LootContextTypes.CHEST)
                        .pool(pool1)
                        .pool(pool2);

                return table.build();
            }

            if (source.isBuiltin() && LootTables.END_CITY_TREASURE_CHEST.equals(key)) {
                LootPool.Builder pool1 = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(2.0f, 6.0f))
                        .with(ItemEntry.builder(Items.DIAMOND).weight(5).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 7.0f))))
                        .with(ItemEntry.builder(Items.NETHERITE_INGOT).weight(1).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 8.0f))))
                        .with(ItemEntry.builder(ModItems.DAMASCUS_STEEL_INGOT).weight(15).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 7.0f))))
                        .with(ItemEntry.builder(Items.EMERALD).weight(2).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 6.0f))))
                        .with(ItemEntry.builder(Items.BEETROOT_SEEDS).weight(5).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 10.0f))))
                        .with(ItemEntry.builder(Items.SADDLE).weight(3))
                        .with(ItemEntry.builder(Items.IRON_HORSE_ARMOR))
                        .with(ItemEntry.builder(ModItems.DAMASCUS_STEEL_HORSE_ARMOR))
                        .with(ItemEntry.builder(Items.DIAMOND_HORSE_ARMOR))
                        .with(ItemEntry.builder(Items.DIAMOND_SWORD).weight(3))
                        .with(ItemEntry.builder(ModItems.PDIAMOND_BOOTS).weight(3))
                        .with(ItemEntry.builder(ModItems.PDIAMOND_CHESTPLATE).weight(3))
                        .with(ItemEntry.builder(ModItems.PDIAMOND_LEGGINGS).weight(3))
                        .with(ItemEntry.builder(ModItems.PDIAMOND_HELMET).weight(3))
                        .with(ItemEntry.builder(Items.DIAMOND_PICKAXE).weight(3))
                        .with(ItemEntry.builder(Items.DIAMOND_SHOVEL).weight(3))
                        .with(ItemEntry.builder(Items.NETHERITE_SWORD).weight(1))
                        .with(ItemEntry.builder(Items.NETHERITE_PICKAXE).weight(1))
                        .with(ItemEntry.builder(Items.NETHERITE_SHOVEL).weight(1));

                LootPool.Builder pool2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0f))
                        .with(EmptyEntry.builder().weight(14))
                        .with(ItemEntry.builder(Items.SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE));

                LootPool.Builder pool3 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0f))
                        .with(EmptyEntry.builder().weight(14))
                        .with(ItemEntry.builder(ModItems.PNETHERITE_BOOTS).weight(1))
                        .with(ItemEntry.builder(ModItems.PNETHERITE_CHESTPLATE).weight(1))
                        .with(ItemEntry.builder(ModItems.PNETHERITE_LEGGINGS).weight(1))
                        .with(ItemEntry.builder(ModItems.PNETHERITE_HELMET).weight(1));

                LootTable.Builder table = LootTable.builder()
                        .type(LootContextTypes.CHEST)
                        .pool(pool1)
                        .pool(pool2);

                return table.build();
            }

            if (source.isBuiltin() && LootTables.ANCIENT_CITY_CHEST.equals(key)) {
                LootPool.Builder pool1 = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(5.0f, 10.0f))
                        .with(ItemEntry.builder(Items.ENCHANTED_GOLDEN_APPLE))
                        .with(ItemEntry.builder(Items.MUSIC_DISC_OTHERSIDE))
                        .with(ItemEntry.builder(Items.COMPASS).weight(2).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f))))
                        .with(ItemEntry.builder(Items.SCULK_CATALYST).weight(2).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f))))
                        .with(ItemEntry.builder(Items.NAME_TAG).weight(2))
                        .with(ItemEntry.builder(Items.DIAMOND_HOE).weight(2))
                        .with(ItemEntry.builder(Items.LEAD).weight(2))
                        .with(ItemEntry.builder(Items.DIAMOND_HORSE_ARMOR).weight(2))
                        .with(ItemEntry.builder(Items.LEATHER).weight(2).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f))))
                        .with(ItemEntry.builder(Items.MUSIC_DISC_13).weight(2))
                        .with(ItemEntry.builder(Items.MUSIC_DISC_CAT).weight(2))
                        .with(ItemEntry.builder(ModItems.PDIAMOND_LEGGINGS).weight(2))
                        .with(ItemEntry.builder(Items.SCULK).weight(3).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 10.0f))))
                        .with(ItemEntry.builder(Items.SCULK_SENSOR).weight(3).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f))))
                        .with(ItemEntry.builder(Items.CANDLE).weight(3).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f))))
                        .with(ItemEntry.builder(Items.AMETHYST_SHARD).weight(3).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 15.0f))))
                        .with(ItemEntry.builder(Items.EXPERIENCE_BOTTLE).weight(3).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f))))
                        .with(ItemEntry.builder(Items.GLOW_BERRIES).weight(3).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 15.0f))))
                        .with(ItemEntry.builder(ModItems.PDIAMOND_LEGGINGS).weight(3))
                        .with(ItemEntry.builder(ModItems.PIRON_LEGGINGS).weight(3))
                        .with(ItemEntry.builder(Items.ECHO_SHARD).weight(4).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f))))
                        .with(ItemEntry.builder(Items.DISC_FRAGMENT_5).weight(4).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f))))
                        .with(ItemEntry.builder(Items.POTION).weight(5))
                        .with(ItemEntry.builder(Items.BOOK).weight(5).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3.0f, 10.0f))))
                        .with(ItemEntry.builder(Items.BONE).weight(5).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 15.0f))))
                        .with(ItemEntry.builder(Items.SOUL_TORCH).weight(5).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 15.0f))))
                        .with(ItemEntry.builder(Items.COAL).weight(7).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(6.0f, 15.0f))));

                LootPool.Builder pool2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0f))
                        .with(EmptyEntry.builder().weight(75))
                        .with(ItemEntry.builder(Items.WARD_ARMOR_TRIM_SMITHING_TEMPLATE).weight(4))
                        .with(ItemEntry.builder(Items.SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE));

                LootTable.Builder table = LootTable.builder()
                        .type(LootContextTypes.CHEST)
                        .pool(pool1)
                        .pool(pool2);

                return table.build();
            }

            if (source.isBuiltin() && LootTables.WOODLAND_MANSION_CHEST.equals(key)) {
                LootPool.Builder pool1 = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(1.0f, 3.0f))
                        .with(ItemEntry.builder(Items.LEAD).weight(20))
                        .with(ItemEntry.builder(Items.GOLDEN_APPLE).weight(15))
                        .with(ItemEntry.builder(Items.ENCHANTED_GOLDEN_APPLE).weight(2))
                        .with(ItemEntry.builder(Items.MUSIC_DISC_13).weight(15))
                        .with(ItemEntry.builder(Items.MUSIC_DISC_CAT).weight(15))
                        .with(ItemEntry.builder(Items.NAME_TAG).weight(20))
                        .with(ItemEntry.builder(ModItems.PCHAIN_CHESTPLATE).weight(10))
                        .with(ItemEntry.builder(Items.DIAMOND_HOE).weight(15))
                        .with(ItemEntry.builder(ModItems.PDIAMOND_CHESTPLATE).weight(5))
                        .with(ItemEntry.builder(Items.BOOK).weight(10));

                LootPool.Builder pool2 = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(1.0f, 4.0f))
                        .with(ItemEntry.builder(Items.IRON_INGOT).weight(10)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f))))
                        .with(ItemEntry.builder(Items.GOLD_INGOT).weight(5)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f))))
                        .with(ItemEntry.builder(Items.BREAD).weight(20))
                        .with(ItemEntry.builder(Items.WHEAT).weight(20)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f))))
                        .with(ItemEntry.builder(Items.BUCKET).weight(10))
                        .with(ItemEntry.builder(Items.REDSTONE).weight(15)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f))))
                        .with(ItemEntry.builder(Items.COAL).weight(15)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f))))
                        .with(ItemEntry.builder(Items.MELON_SEEDS).weight(10)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f))))
                        .with(ItemEntry.builder(Items.PUMPKIN_SEEDS).weight(10)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f))))
                        .with(ItemEntry.builder(Items.BEETROOT_SEEDS).weight(10)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f))))
                        .with(ItemEntry.builder(Items.RESIN_CLUMP).weight(50)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f))));

                LootPool.Builder pool3 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(3.0f))
                        .with(ItemEntry.builder(Items.BONE)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 8.0f)))
                                .weight(10))
                        .with(ItemEntry.builder(Items.GUNPOWDER)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 8.0f)))
                                .weight(10))
                        .with(ItemEntry.builder(Items.ROTTEN_FLESH)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 8.0f)))
                                .weight(10))
                        .with(ItemEntry.builder(Items.STRING)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 8.0f)))
                                .weight(10));

                LootPool.Builder pool4 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0f))
                        .with(EmptyEntry.builder())
                        .with(ItemEntry.builder(Items.VEX_ARMOR_TRIM_SMITHING_TEMPLATE));

                LootTable.Builder table = LootTable.builder()
                        .type(LootContextTypes.CHEST)
                        .pool(pool1)
                        .pool(pool2)
                        .pool(pool3)
                        .pool(pool4);

                return table.build();
            }

            if (source.isBuiltin() && LootTables.VILLAGE_ARMORER_CHEST.equals(key)) {
                LootPool.Builder pool1 = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(1.0f, 5.0f))
                        .with(ItemEntry.builder(Items.IRON_NUGGET).weight(2).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f))))
                        .with(ItemEntry.builder(Items.BREAD).weight(4).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f))))
                        .with(ItemEntry.builder(ModItems.PIRON_HELMET))
                        .with(ItemEntry.builder(Items.EMERALD));

                LootTable.Builder table = LootTable.builder()
                        .type(LootContextTypes.CHEST)
                        .pool(pool1);

                return table.build();
            }


            return null; // leave all other tables alone
        });
    }
}
