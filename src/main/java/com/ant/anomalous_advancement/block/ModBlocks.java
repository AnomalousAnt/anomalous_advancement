package com.ant.anomalous_advancement.block;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import com.ant.anomalous_advancement.block.custom.MagicBench;
import com.ant.anomalous_advancement.block.custom.MagicTable;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block ALTAR = registerBlock("altar",
            new MagicBench(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block GILDED_ALTAR = registerBlock("gilded_altar",
            new MagicBench(AbstractBlock.Settings.create().strength(5f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));



    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Anomalous_Advancement.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(Anomalous_Advancement.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks(){
        Anomalous_Advancement.LOGGER.info("Registering Mod Blocks for " + Anomalous_Advancement.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(ModBlocks.ALTAR);
            entries.add(ModBlocks.GILDED_ALTAR);
        });
    }
}
