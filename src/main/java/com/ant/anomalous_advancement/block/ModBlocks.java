package com.ant.anomalous_advancement.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import com.ant.anomalous_advancement.Anomalous_Advancement;
import com.ant.anomalous_advancement.block.custom.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;


public class ModBlocks {

    public static final Block ALTAR = registerBlock("altar",
            properties -> new MagicBench(properties.strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block GILDED_ALTAR = registerBlock("gilded_altar",
           properties -> new DoubleMagicBench(properties.strength(5f)
                    .requiresTool().sounds(BlockSoundGroup.IRON)));

    public static final Block RESPLENDENT_ALTAR = registerBlock("resplendent_altar",
            properties -> new TripleMagicBench(properties.strength(5f)
                    .requiresTool().sounds(BlockSoundGroup.IRON)));

    public static final Block BLOCK_OF_PIGLIN_BRONZE = registerBlock("block_of_piglin_bronze",
            properties -> new Block(properties.strength(5f)
                    .requiresTool().sounds(BlockSoundGroup.IRON)));

    public static final Block BLOCK_OF_DAMASCUS_STEEL = registerBlock("block_of_damascus_steel",
            properties -> new Block(properties.strength(5f)
                    .requiresTool().sounds(BlockSoundGroup.IRON)));



    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function){
        Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Anomalous_Advancement.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(Registries.BLOCK, Identifier.of(Anomalous_Advancement.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Anomalous_Advancement.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Anomalous_Advancement.MOD_ID, name)))));
    }

    public static void registerModBlocks(){
        Anomalous_Advancement.LOGGER.info("Registering Mod Blocks for " + Anomalous_Advancement.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(ModBlocks.ALTAR);
            entries.add(ModBlocks.GILDED_ALTAR);
            entries.add(ModBlocks.RESPLENDENT_ALTAR);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
            entries.add(ModBlocks.BLOCK_OF_PIGLIN_BRONZE);
            entries.add(ModBlocks.BLOCK_OF_DAMASCUS_STEEL);
        });
    }
}
