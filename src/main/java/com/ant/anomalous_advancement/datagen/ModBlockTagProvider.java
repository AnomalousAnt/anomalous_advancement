package com.ant.anomalous_advancement.datagen;

import com.ant.anomalous_advancement.block.ModBlocks;
import com.ant.anomalous_advancement.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ALTAR)
                .add(ModBlocks.GILDED_ALTAR)
                .add(net.minecraft.block.Blocks.GRAVEL);

        getOrCreateTagBuilder(ModTags.Blocks.INCORRECT_FOR_WOOD_TOOL)
                .add(net.minecraft.block.Blocks.STONE);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_FLINT_TOOL)
                .add(ModBlocks.ALTAR);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.GILDED_ALTAR);


    }
}

