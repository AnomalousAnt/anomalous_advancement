package com.ant.anomalous_advancement.datagen;

import com.ant.anomalous_advancement.block.ModBlocks;
import com.ant.anomalous_advancement.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ALTAR)
                .add(ModBlocks.GILDED_ALTAR)
                .add(ModBlocks.RESPLENDENT_ALTAR)
                .add(ModBlocks.BLOCK_OF_PIGLIN_BRONZE)
                .add(ModBlocks.BLOCK_OF_DAMASCUS_STEEL)
                .add(Blocks.GRAVEL)
                .add(Blocks.IRON_DOOR);

        valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_WOOD_TOOL)
                .add(Blocks.CRYING_OBSIDIAN);

        valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_FLINT_TOOL)
                .add(Blocks.CRYING_OBSIDIAN);

        valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_STONE_TOOL)
                .add(Blocks.CRYING_OBSIDIAN);

        valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_COPPER_TOOL)
                .add(Blocks.CRYING_OBSIDIAN);

        valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_IRON_TOOL)
                .add(Blocks.CRYING_OBSIDIAN);

        valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_GOLD_TOOL)
                .add(Blocks.CRYING_OBSIDIAN);

        valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_PIGLIN_BRONZE_INGOT_TOOL)
                .add(Blocks.CRYING_OBSIDIAN);

        valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_DAMASCUS_STEEL_INGOT_TOOL)
                .add(Blocks.CRYING_OBSIDIAN);

        valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_DIAMOND_TOOL)
                .add(Blocks.CRYING_OBSIDIAN);

        valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_NETHERITE_TOOL)
                .add(Blocks.CRYING_OBSIDIAN);

    }
}

