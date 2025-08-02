package com.ant.anomalous_advancement.datagen;

import com.ant.anomalous_advancement.block.ModBlocks;
import com.ant.anomalous_advancement.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }



    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // Altar: cube_bottom_top with separate top, bottom, side and horizontal facing
        blockStateModelGenerator.registerSouthDefaultHorizontalFacing(
                TexturedModel.CUBE_BOTTOM_TOP.andThen(textureMap -> {
                    textureMap.put(TextureKey.SIDE, Identifier.of("anomalous_advancement", "block/altar_side"));
                    textureMap.put(TextureKey.UP, Identifier.of("anomalous_advancement", "block/altar_top"));
                    textureMap.put(TextureKey.DOWN, Identifier.of("anomalous_advancement", "block/altar_bottom"));
                }),
                ModBlocks.ALTAR
        );

        // Gilded Altar
        blockStateModelGenerator.registerSouthDefaultHorizontalFacing(
                TexturedModel.CUBE_BOTTOM_TOP.andThen(textureMap -> {
                    textureMap.put(TextureKey.SIDE, Identifier.of("anomalous_advancement", "block/gilded_altar_side"));
                    textureMap.put(TextureKey.UP, Identifier.of("anomalous_advancement", "block/gilded_altar_top"));
                    textureMap.put(TextureKey.DOWN, Identifier.of("anomalous_advancement", "block/gilded_altar_bottom"));
                }),
                ModBlocks.GILDED_ALTAR
        );
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.FLINT_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLINT_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLINT_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLINT_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLINT_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MASHED_POTATOES, Models.GENERATED);

        itemModelGenerator.register(ModItems.PIGLIN_BRONZE_INGOT, Models.GENERATED);
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PIGLIN_BRONZE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PIGLIN_BRONZE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PIGLIN_BRONZE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PIGLIN_BRONZE_BOOTS));

        itemModelGenerator.register(ModItems.PIGLIN_BRONZE_HORSE_ARMOR, Models.GENERATED);

        itemModelGenerator.register(ModItems.CLOAKED_CHAUFFEUR_MUSIC_DISC, Models.GENERATED);

    }
}
