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

        itemModelGenerator.register(ModItems.CLOAKED_CHAUFFEUR_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.MASHED_POTATOES, Models.GENERATED);

    }
}
