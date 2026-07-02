package com.ant.anomalous_advancement.datagen;

import com.ant.anomalous_advancement.block.ModBlocks;
import com.ant.anomalous_advancement.item.ModArmorMaterials;
import com.ant.anomalous_advancement.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }



    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {

        blockStateModelGenerator.createTrivialCube(ModBlocks.ALTAR);
        blockStateModelGenerator.createTrivialCube(ModBlocks.GILDED_ALTAR);
        blockStateModelGenerator.createTrivialCube(ModBlocks.RESPLENDENT_ALTAR);
        blockStateModelGenerator.createTrivialCube(ModBlocks.BLOCK_OF_PIGLIN_BRONZE);
        blockStateModelGenerator.createTrivialCube(ModBlocks.BLOCK_OF_DAMASCUS_STEEL);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(ModItems.FLINT_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.FLINT_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.FLINT_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.FLINT_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.FLINT_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.createFlatItemModel(ModItems.PBOW, ModelTemplates.BOW);
        itemModelGenerator.generateBow(ModItems.PBOW);

        itemModelGenerator.generateTrimmableItem(ModItems.PLEATHER_HELMET, ModArmorMaterials.PLEATHER_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, true);
        itemModelGenerator.generateTrimmableItem(ModItems.PLEATHER_CHESTPLATE, ModArmorMaterials.PLEATHER_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, true);
        itemModelGenerator.generateTrimmableItem(ModItems.PLEATHER_LEGGINGS, ModArmorMaterials.PLEATHER_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, true);
        itemModelGenerator.generateTrimmableItem(ModItems.PLEATHER_BOOTS, ModArmorMaterials.PLEATHER_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, true);

        itemModelGenerator.generateTrimmableItem(ModItems.PCOPPER_HELMET, ModArmorMaterials.PCOPPER_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerator.generateTrimmableItem(ModItems.PCOPPER_CHESTPLATE, ModArmorMaterials.PCOPPER_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerator.generateTrimmableItem(ModItems.PCOPPER_LEGGINGS, ModArmorMaterials.PCOPPER_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerator.generateTrimmableItem(ModItems.PCOPPER_BOOTS, ModArmorMaterials.PCOPPER_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
        itemModelGenerator.createFlatItemModel(ModItems.COPPER_BOW, ModelTemplates.BOW);
        itemModelGenerator.generateBow(ModItems.COPPER_BOW);

        itemModelGenerator.generateTrimmableItem(ModItems.PCHAIN_HELMET, ModArmorMaterials.PCHAIN_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerator.generateTrimmableItem(ModItems.PCHAIN_CHESTPLATE, ModArmorMaterials.PCHAIN_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerator.generateTrimmableItem(ModItems.PCHAIN_LEGGINGS, ModArmorMaterials.PCHAIN_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerator.generateTrimmableItem(ModItems.PCHAIN_BOOTS, ModArmorMaterials.PCHAIN_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
        itemModelGenerator.generateFlatItem(ModItems.PCHAIN_HORSE_ARMOR, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateTrimmableItem(ModItems.PIRON_HELMET, ModArmorMaterials.PIRON_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerator.generateTrimmableItem(ModItems.PIRON_CHESTPLATE, ModArmorMaterials.PIRON_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerator.generateTrimmableItem(ModItems.PIRON_LEGGINGS, ModArmorMaterials.PIRON_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerator.generateTrimmableItem(ModItems.PIRON_BOOTS, ModArmorMaterials.PIRON_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
        itemModelGenerator.createFlatItemModel(ModItems.IRON_BOW, ModelTemplates.BOW);
        itemModelGenerator.generateBow(ModItems.IRON_BOW);

        itemModelGenerator.generateTrimmableItem(ModItems.PGOLD_HELMET, ModArmorMaterials.PGOLD_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerator.generateTrimmableItem(ModItems.PGOLD_CHESTPLATE, ModArmorMaterials.PGOLD_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerator.generateTrimmableItem(ModItems.PGOLD_LEGGINGS, ModArmorMaterials.PGOLD_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerator.generateTrimmableItem(ModItems.PGOLD_BOOTS, ModArmorMaterials.PGOLD_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
        itemModelGenerator.createFlatItemModel(ModItems.GOLD_BOW, ModelTemplates.BOW);
        itemModelGenerator.generateBow(ModItems.GOLD_BOW);

        itemModelGenerator.generateFlatItem(ModItems.PIGLIN_BRONZE_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.PIGLIN_BRONZE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.PIGLIN_BRONZE_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.PIGLIN_BRONZE_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.PIGLIN_BRONZE_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.PIGLIN_BRONZE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.createFlatItemModel(ModItems.PIGLIN_BRONZE_BOW, ModelTemplates.BOW);
        itemModelGenerator.generateBow(ModItems.PIGLIN_BRONZE_BOW);

        itemModelGenerator.generateTrimmableItem(ModItems.PIGLIN_BRONZE_HELMET, ModArmorMaterials.PIGLIN_BRONZE_INGOT_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerator.generateTrimmableItem(ModItems.PIGLIN_BRONZE_CHESTPLATE, ModArmorMaterials.PIGLIN_BRONZE_INGOT_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerator.generateTrimmableItem(ModItems.PIGLIN_BRONZE_LEGGINGS, ModArmorMaterials.PIGLIN_BRONZE_INGOT_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerator.generateTrimmableItem(ModItems.PIGLIN_BRONZE_BOOTS, ModArmorMaterials.PIGLIN_BRONZE_INGOT_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerator.generateFlatItem(ModItems.PIGLIN_BRONZE_HORSE_ARMOR, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(ModItems.DAMASCUS_STEEL_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DAMASCUS_STEEL_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DAMASCUS_STEEL_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DAMASCUS_STEEL_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DAMASCUS_STEEL_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DAMASCUS_STEEL_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.createFlatItemModel(ModItems.DAMASCUS_STEEL_BOW, ModelTemplates.BOW);
        itemModelGenerator.generateBow(ModItems.DAMASCUS_STEEL_BOW);

        itemModelGenerator.generateTrimmableItem(ModItems.DAMASCUS_STEEL_HELMET, ModArmorMaterials.DAMASCUS_STEEL_INGOT_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerator.generateTrimmableItem(ModItems.DAMASCUS_STEEL_CHESTPLATE, ModArmorMaterials.DAMASCUS_STEEL_INGOT_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerator.generateTrimmableItem(ModItems.DAMASCUS_STEEL_LEGGINGS, ModArmorMaterials.DAMASCUS_STEEL_INGOT_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerator.generateTrimmableItem(ModItems.DAMASCUS_STEEL_BOOTS, ModArmorMaterials.DAMASCUS_STEEL_INGOT_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
        itemModelGenerator.generateFlatItem(ModItems.DAMASCUS_STEEL_HORSE_ARMOR, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateTrimmableItem(ModItems.PDIAMOND_HELMET, ModArmorMaterials.PDIAMOND_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerator.generateTrimmableItem(ModItems.PDIAMOND_CHESTPLATE, ModArmorMaterials.PDIAMOND_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerator.generateTrimmableItem(ModItems.PDIAMOND_LEGGINGS, ModArmorMaterials.PDIAMOND_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerator.generateTrimmableItem(ModItems.PDIAMOND_BOOTS, ModArmorMaterials.PDIAMOND_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
        itemModelGenerator.createFlatItemModel(ModItems.DIAMOND_BOW, ModelTemplates.BOW);
        itemModelGenerator.generateBow(ModItems.DIAMOND_BOW);

        itemModelGenerator.generateTrimmableItem(ModItems.PNETHERITE_HELMET, ModArmorMaterials.PNETHERITE_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerator.generateTrimmableItem(ModItems.PNETHERITE_CHESTPLATE, ModArmorMaterials.PNETHERITE_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerator.generateTrimmableItem(ModItems.PNETHERITE_LEGGINGS, ModArmorMaterials.PNETHERITE_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerator.generateTrimmableItem(ModItems.PNETHERITE_BOOTS, ModArmorMaterials.PNETHERITE_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
        itemModelGenerator.generateFlatItem(ModItems.NETHERITE_HORSE_ARMOR, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.createFlatItemModel(ModItems.NETHERITE_BOW, ModelTemplates.BOW);
        itemModelGenerator.generateBow(ModItems.NETHERITE_BOW);

    }
}
