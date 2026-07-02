package com.ant.anomalous_advancement.block;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import com.ant.anomalous_advancement.Anomalous_Advancement;
import com.ant.anomalous_advancement.block.custom.*;
import java.util.function.Function;


public class ModBlocks {

    public static final Block ALTAR = registerBlock("altar",
            properties -> new MagicBench(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final Block GILDED_ALTAR = registerBlock("gilded_altar",
           properties -> new DoubleMagicBench(properties.strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.IRON)));

    public static final Block RESPLENDENT_ALTAR = registerBlock("resplendent_altar",
            properties -> new TripleMagicBench(properties.strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.IRON)));

    public static final Block BLOCK_OF_PIGLIN_BRONZE = registerBlock("block_of_piglin_bronze",
            properties -> new Block(properties.strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.IRON)));

    public static final Block BLOCK_OF_DAMASCUS_STEEL = registerBlock("block_of_damascus_steel",
            properties -> new Block(properties.strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.IRON)));



    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function){
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Anomalous_Advancement.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Anomalous_Advancement.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Anomalous_Advancement.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Anomalous_Advancement.MOD_ID, name)))));
    }

    public static void registerModBlocks(){
        Anomalous_Advancement.LOGGER.info("Registering Mod Blocks for " + Anomalous_Advancement.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> {
            entries.accept(ModBlocks.ALTAR);
            entries.accept(ModBlocks.GILDED_ALTAR);
            entries.accept(ModBlocks.RESPLENDENT_ALTAR);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COLORED_BLOCKS).register(entries -> {
            entries.accept(ModBlocks.BLOCK_OF_PIGLIN_BRONZE);
            entries.accept(ModBlocks.BLOCK_OF_DAMASCUS_STEEL);
        });
    }
}
