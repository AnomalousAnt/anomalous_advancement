package com.ant.anomalous_advancement.datagen;

import com.ant.anomalous_advancement.block.ModBlocks;
import com.ant.anomalous_advancement.item.ModArmorMaterials;
import com.ant.anomalous_advancement.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }



    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALTAR);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GILDED_ALTAR);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RESPLENDENT_ALTAR);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_OF_PIGLIN_BRONZE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_OF_DAMASCUS_STEEL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.FLINT_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLINT_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLINT_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLINT_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLINT_SWORD, Models.HANDHELD);
        itemModelGenerator.upload(ModItems.PBOW, Models.BOW);
        itemModelGenerator.registerBow(ModItems.PBOW);

        itemModelGenerator.registerArmor(ModItems.PLEATHER_HELMET, ModArmorMaterials.PLEATHER_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, true);
        itemModelGenerator.registerArmor(ModItems.PLEATHER_CHESTPLATE, ModArmorMaterials.PLEATHER_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, true);
        itemModelGenerator.registerArmor(ModItems.PLEATHER_LEGGINGS, ModArmorMaterials.PLEATHER_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, true);
        itemModelGenerator.registerArmor(ModItems.PLEATHER_BOOTS, ModArmorMaterials.PLEATHER_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, true);
        itemModelGenerator.register(ModItems.PLEATHER_HORSE_ARMOR, Models.GENERATED);

        itemModelGenerator.registerArmor(ModItems.PCOPPER_HELMET, ModArmorMaterials.PCOPPER_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.PCOPPER_CHESTPLATE, ModArmorMaterials.PCOPPER_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.PCOPPER_LEGGINGS, ModArmorMaterials.PCOPPER_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.PCOPPER_BOOTS, ModArmorMaterials.PCOPPER_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);
        itemModelGenerator.register(ModItems.PCOPPER_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.upload(ModItems.COPPER_BOW, Models.BOW);
        itemModelGenerator.registerBow(ModItems.COPPER_BOW);

        itemModelGenerator.registerArmor(ModItems.PCHAIN_HELMET, ModArmorMaterials.PCHAIN_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.PCHAIN_CHESTPLATE, ModArmorMaterials.PCHAIN_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.PCHAIN_LEGGINGS, ModArmorMaterials.PCHAIN_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.PCHAIN_BOOTS, ModArmorMaterials.PCHAIN_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);
        itemModelGenerator.register(ModItems.PCHAIN_HORSE_ARMOR, Models.GENERATED);

        itemModelGenerator.registerArmor(ModItems.PIRON_HELMET, ModArmorMaterials.PIRON_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.PIRON_CHESTPLATE, ModArmorMaterials.PIRON_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.PIRON_LEGGINGS, ModArmorMaterials.PIRON_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.PIRON_BOOTS, ModArmorMaterials.PIRON_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);
        itemModelGenerator.register(ModItems.PIRON_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.upload(ModItems.IRON_BOW, Models.BOW);
        itemModelGenerator.registerBow(ModItems.IRON_BOW);

        itemModelGenerator.registerArmor(ModItems.PGOLD_HELMET, ModArmorMaterials.PGOLD_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.PGOLD_CHESTPLATE, ModArmorMaterials.PGOLD_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.PGOLD_LEGGINGS, ModArmorMaterials.PGOLD_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.PGOLD_BOOTS, ModArmorMaterials.PGOLD_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);
        itemModelGenerator.register(ModItems.PGOLD_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.upload(ModItems.GOLD_BOW, Models.BOW);
        itemModelGenerator.registerBow(ModItems.GOLD_BOW);

        itemModelGenerator.register(ModItems.PIGLIN_BRONZE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PIGLIN_BRONZE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PIGLIN_BRONZE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PIGLIN_BRONZE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PIGLIN_BRONZE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PIGLIN_BRONZE_SWORD, Models.HANDHELD);
        itemModelGenerator.upload(ModItems.PIGLIN_BRONZE_BOW, Models.BOW);
        itemModelGenerator.registerBow(ModItems.PIGLIN_BRONZE_BOW);

        itemModelGenerator.registerArmor(ModItems.PIGLIN_BRONZE_HELMET, ModArmorMaterials.PIGLIN_BRONZE_INGOT_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.PIGLIN_BRONZE_CHESTPLATE, ModArmorMaterials.PIGLIN_BRONZE_INGOT_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.PIGLIN_BRONZE_LEGGINGS, ModArmorMaterials.PIGLIN_BRONZE_INGOT_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.PIGLIN_BRONZE_BOOTS, ModArmorMaterials.PIGLIN_BRONZE_INGOT_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);

        itemModelGenerator.register(ModItems.PIGLIN_BRONZE_HORSE_ARMOR, Models.GENERATED);

        itemModelGenerator.register(ModItems.DAMASCUS_STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DAMASCUS_STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DAMASCUS_STEEL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DAMASCUS_STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DAMASCUS_STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DAMASCUS_STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.upload(ModItems.DAMASCUS_STEEL_BOW, Models.BOW);
        itemModelGenerator.registerBow(ModItems.DAMASCUS_STEEL_BOW);

        itemModelGenerator.registerArmor(ModItems.DAMASCUS_STEEL_HELMET, ModArmorMaterials.DAMASCUS_STEEL_INGOT_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.DAMASCUS_STEEL_CHESTPLATE, ModArmorMaterials.DAMASCUS_STEEL_INGOT_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.DAMASCUS_STEEL_LEGGINGS, ModArmorMaterials.DAMASCUS_STEEL_INGOT_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.DAMASCUS_STEEL_BOOTS, ModArmorMaterials.DAMASCUS_STEEL_INGOT_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);
        itemModelGenerator.register(ModItems.DAMASCUS_STEEL_HORSE_ARMOR, Models.GENERATED);

        itemModelGenerator.registerArmor(ModItems.PDIAMOND_HELMET, ModArmorMaterials.PDIAMOND_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.PDIAMOND_CHESTPLATE, ModArmorMaterials.PDIAMOND_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.PDIAMOND_LEGGINGS, ModArmorMaterials.PDIAMOND_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.PDIAMOND_BOOTS, ModArmorMaterials.PDIAMOND_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);
        itemModelGenerator.register(ModItems.PDIAMOND_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.upload(ModItems.DIAMOND_BOW, Models.BOW);
        itemModelGenerator.registerBow(ModItems.DIAMOND_BOW);

        itemModelGenerator.registerArmor(ModItems.PNETHERITE_HELMET, ModArmorMaterials.PNETHERITE_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.PNETHERITE_CHESTPLATE, ModArmorMaterials.PNETHERITE_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.PNETHERITE_LEGGINGS, ModArmorMaterials.PNETHERITE_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.PNETHERITE_BOOTS, ModArmorMaterials.PNETHERITE_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);
        itemModelGenerator.register(ModItems.NETHERITE_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.upload(ModItems.NETHERITE_BOW, Models.BOW);
        itemModelGenerator.registerBow(ModItems.NETHERITE_BOW);

    }
}
