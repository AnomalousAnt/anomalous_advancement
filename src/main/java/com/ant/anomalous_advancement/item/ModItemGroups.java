package com.ant.anomalous_advancement.item;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import com.ant.anomalous_advancement.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup ANOMALOUS_ADVANCEMENT_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Anomalous_Advancement.MOD_ID, "anomalous_advancement_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.FLINT_PICKAXE))
                    .displayName(Text.translatable("itemgroup.anomalous_advancement.anomalous_advancement_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.FLINT_SHOVEL);
                        entries.add(ModItems.FLINT_PICKAXE);
                        entries.add(ModItems.FLINT_AXE);
                        entries.add(ModItems.FLINT_HOE);
                        entries.add(ModItems.FLINT_SWORD);

                        entries.add(ModItems.PLEATHER_HELMET);
                        entries.add(ModItems.PLEATHER_CHESTPLATE);
                        entries.add(ModItems.PLEATHER_LEGGINGS);
                        entries.add(ModItems.PLEATHER_BOOTS);
                        entries.add(ModItems.PBOW);

                        entries.add(ModItems.PCOPPER_HELMET);
                        entries.add(ModItems.PCOPPER_CHESTPLATE);
                        entries.add(ModItems.PCOPPER_LEGGINGS);
                        entries.add(ModItems.PCOPPER_BOOTS);
                        entries.add(ModItems.COPPER_BOW);

                        entries.add(ModItems.PCHAIN_HELMET);
                        entries.add(ModItems.PCHAIN_CHESTPLATE);
                        entries.add(ModItems.PCHAIN_LEGGINGS);
                        entries.add(ModItems.PCHAIN_BOOTS);
                        entries.add(ModItems.PCHAIN_HORSE_ARMOR);

                        entries.add(ModItems.PIRON_HELMET);
                        entries.add(ModItems.PIRON_CHESTPLATE);
                        entries.add(ModItems.PIRON_LEGGINGS);
                        entries.add(ModItems.PIRON_BOOTS);
                        entries.add(ModItems.IRON_BOW);

                        entries.add(ModItems.PGOLD_HELMET);
                        entries.add(ModItems.PGOLD_CHESTPLATE);
                        entries.add(ModItems.PGOLD_LEGGINGS);
                        entries.add(ModItems.PGOLD_BOOTS);
                        entries.add(ModItems.GOLD_BOW);

                        entries.add(ModItems.PIGLIN_BRONZE_SHOVEL);
                        entries.add(ModItems.PIGLIN_BRONZE_PICKAXE);
                        entries.add(ModItems.PIGLIN_BRONZE_AXE);
                        entries.add(ModItems.PIGLIN_BRONZE_HOE);
                        entries.add(ModItems.PIGLIN_BRONZE_SWORD);
                        entries.add(ModItems.PIGLIN_BRONZE_BOW);

                        entries.add(ModItems.PIGLIN_BRONZE_INGOT);
                        entries.add(ModBlocks.BLOCK_OF_PIGLIN_BRONZE);
                        entries.add(ModItems.PIGLIN_BRONZE_HELMET);
                        entries.add(ModItems.PIGLIN_BRONZE_CHESTPLATE);
                        entries.add(ModItems.PIGLIN_BRONZE_LEGGINGS);
                        entries.add(ModItems.PIGLIN_BRONZE_BOOTS);
                        entries.add(ModItems.PIGLIN_BRONZE_HORSE_ARMOR);

                        entries.add(ModItems.DAMASCUS_STEEL_SHOVEL);
                        entries.add(ModItems.DAMASCUS_STEEL_PICKAXE);
                        entries.add(ModItems.DAMASCUS_STEEL_AXE);
                        entries.add(ModItems.DAMASCUS_STEEL_HOE);
                        entries.add(ModItems.DAMASCUS_STEEL_SWORD);
                        entries.add(ModItems.DAMASCUS_STEEL_BOW);

                        entries.add(ModItems.DAMASCUS_STEEL_INGOT);
                        entries.add(ModBlocks.BLOCK_OF_DAMASCUS_STEEL);
                        entries.add(ModItems.DAMASCUS_STEEL_HELMET);
                        entries.add(ModItems.DAMASCUS_STEEL_CHESTPLATE);
                        entries.add(ModItems.DAMASCUS_STEEL_LEGGINGS);
                        entries.add(ModItems.DAMASCUS_STEEL_BOOTS);
                        entries.add(ModItems.DAMASCUS_STEEL_HORSE_ARMOR);

                        entries.add(ModItems.PDIAMOND_HELMET);
                        entries.add(ModItems.PDIAMOND_CHESTPLATE);
                        entries.add(ModItems.PDIAMOND_LEGGINGS);
                        entries.add(ModItems.PDIAMOND_BOOTS);
                        entries.add(ModItems.DIAMOND_BOW);

                        entries.add(ModItems.PNETHERITE_HELMET);
                        entries.add(ModItems.PNETHERITE_CHESTPLATE);
                        entries.add(ModItems.PNETHERITE_LEGGINGS);
                        entries.add(ModItems.PNETHERITE_BOOTS);
                        entries.add(ModItems.NETHERITE_BOW);
                        entries.add(ModItems.NETHERITE_HORSE_ARMOR);


                        entries.add(ModBlocks.ALTAR);
                        entries.add(ModBlocks.GILDED_ALTAR);
                        entries.add(ModBlocks.RESPLENDENT_ALTAR);

                    }).build());

    public static void registerItemGroups(){
        Anomalous_Advancement.LOGGER.info("Registering Item Groups for " + Anomalous_Advancement.MOD_ID);
    }
}
