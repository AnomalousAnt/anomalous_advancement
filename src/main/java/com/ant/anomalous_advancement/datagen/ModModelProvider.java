package com.ant.anomalous_advancement.datagen;

import com.ant.anomalous_advancement.block.ModBlocks;
import com.ant.anomalous_advancement.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALTAR);
        blockStateModelGenerator.registerRotatable(ModBlocks.GILDED_ALTAR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.FLINT_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLINT_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLINT_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLINT_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLINT_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.MASHED_POTATOES, Models.GENERATED);
    }
}
