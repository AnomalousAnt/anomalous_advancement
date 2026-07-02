package com.ant.anomalous_advancement.item;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import com.ant.anomalous_advancement.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroups {

    public static final CreativeModeTab ANOMALOUS_ADVANCEMENT_GROUP =
            Registry.register(
                    BuiltInRegistries.CREATIVE_MODE_TAB,
                    Identifier.fromNamespaceAndPath(
                            Anomalous_Advancement.MOD_ID,
                            "anomalous_advancement_group"
                    ),
                    CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                            .icon(() -> new ItemStack(ModItems.FLINT_PICKAXE))
                            .title(Component.translatable(
                                    "itemgroup.anomalous_advancement.anomalous_advancement_group"
                            ))
                            .displayItems((displayContext, entries) -> {

                                entries.accept(ModItems.FLINT_SHOVEL);
                                entries.accept(ModItems.FLINT_PICKAXE);
                                entries.accept(ModItems.FLINT_AXE);
                                entries.accept(ModItems.FLINT_HOE);
                                entries.accept(ModItems.FLINT_SWORD);

                                entries.accept(ModItems.PLEATHER_HELMET);
                                entries.accept(ModItems.PLEATHER_CHESTPLATE);
                                entries.accept(ModItems.PLEATHER_LEGGINGS);
                                entries.accept(ModItems.PLEATHER_BOOTS);
                                entries.accept(ModItems.PBOW);

                                entries.accept(ModItems.PCOPPER_HELMET);
                                entries.accept(ModItems.PCOPPER_CHESTPLATE);
                                entries.accept(ModItems.PCOPPER_LEGGINGS);
                                entries.accept(ModItems.PCOPPER_BOOTS);
                                entries.accept(ModItems.COPPER_BOW);

                                entries.accept(ModItems.PCHAIN_HELMET);
                                entries.accept(ModItems.PCHAIN_CHESTPLATE);
                                entries.accept(ModItems.PCHAIN_LEGGINGS);
                                entries.accept(ModItems.PCHAIN_BOOTS);
                                entries.accept(ModItems.PCHAIN_HORSE_ARMOR);

                                entries.accept(ModItems.PIRON_HELMET);
                                entries.accept(ModItems.PIRON_CHESTPLATE);
                                entries.accept(ModItems.PIRON_LEGGINGS);
                                entries.accept(ModItems.PIRON_BOOTS);
                                entries.accept(ModItems.IRON_BOW);

                                entries.accept(ModItems.PGOLD_HELMET);
                                entries.accept(ModItems.PGOLD_CHESTPLATE);
                                entries.accept(ModItems.PGOLD_LEGGINGS);
                                entries.accept(ModItems.PGOLD_BOOTS);
                                entries.accept(ModItems.GOLD_BOW);

                                entries.accept(ModItems.PIGLIN_BRONZE_SHOVEL);
                                entries.accept(ModItems.PIGLIN_BRONZE_PICKAXE);
                                entries.accept(ModItems.PIGLIN_BRONZE_AXE);
                                entries.accept(ModItems.PIGLIN_BRONZE_HOE);
                                entries.accept(ModItems.PIGLIN_BRONZE_SWORD);
                                entries.accept(ModItems.PIGLIN_BRONZE_BOW);

                                entries.accept(ModItems.PIGLIN_BRONZE_INGOT);
                                entries.accept(ModBlocks.BLOCK_OF_PIGLIN_BRONZE);
                                entries.accept(ModItems.PIGLIN_BRONZE_HELMET);
                                entries.accept(ModItems.PIGLIN_BRONZE_CHESTPLATE);
                                entries.accept(ModItems.PIGLIN_BRONZE_LEGGINGS);
                                entries.accept(ModItems.PIGLIN_BRONZE_BOOTS);
                                entries.accept(ModItems.PIGLIN_BRONZE_HORSE_ARMOR);

                                entries.accept(ModItems.DAMASCUS_STEEL_SHOVEL);
                                entries.accept(ModItems.DAMASCUS_STEEL_PICKAXE);
                                entries.accept(ModItems.DAMASCUS_STEEL_AXE);
                                entries.accept(ModItems.DAMASCUS_STEEL_HOE);
                                entries.accept(ModItems.DAMASCUS_STEEL_SWORD);
                                entries.accept(ModItems.DAMASCUS_STEEL_BOW);

                                entries.accept(ModItems.DAMASCUS_STEEL_INGOT);
                                entries.accept(ModBlocks.BLOCK_OF_DAMASCUS_STEEL);
                                entries.accept(ModItems.DAMASCUS_STEEL_HELMET);
                                entries.accept(ModItems.DAMASCUS_STEEL_CHESTPLATE);
                                entries.accept(ModItems.DAMASCUS_STEEL_LEGGINGS);
                                entries.accept(ModItems.DAMASCUS_STEEL_BOOTS);
                                entries.accept(ModItems.DAMASCUS_STEEL_HORSE_ARMOR);

                                entries.accept(ModItems.PDIAMOND_HELMET);
                                entries.accept(ModItems.PDIAMOND_CHESTPLATE);
                                entries.accept(ModItems.PDIAMOND_LEGGINGS);
                                entries.accept(ModItems.PDIAMOND_BOOTS);
                                entries.accept(ModItems.DIAMOND_BOW);

                                entries.accept(ModItems.PNETHERITE_HELMET);
                                entries.accept(ModItems.PNETHERITE_CHESTPLATE);
                                entries.accept(ModItems.PNETHERITE_LEGGINGS);
                                entries.accept(ModItems.PNETHERITE_BOOTS);
                                entries.accept(ModItems.NETHERITE_BOW);
                                entries.accept(ModItems.NETHERITE_HORSE_ARMOR);

                                entries.accept(ModBlocks.ALTAR);
                                entries.accept(ModBlocks.GILDED_ALTAR);
                                entries.accept(ModBlocks.RESPLENDENT_ALTAR);

                            })
                            .build()
            );

    public static void registerItemGroups() {
        Anomalous_Advancement.LOGGER.info(
                "Registering Item Groups for " + Anomalous_Advancement.MOD_ID
        );
    }
}