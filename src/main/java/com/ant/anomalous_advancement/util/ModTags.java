package com.ant.anomalous_advancement.util;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> NEEDS_WOOD_TOOL = createTag("needs_wood_tool");
        public static final TagKey<Block> INCORRECT_FOR_WOOD_TOOL = createTag("incorrect_for_wood_tool");
        public static final TagKey<Block> NEEDS_FLINT_TOOL = createTag("needs_flint_tool");
        public static final TagKey<Block> INCORRECT_FOR_FLINT_TOOL = createTag("incorrect_for_flint_tool");
        public static final TagKey<Block> NEEDS_STONE_TOOL = createTag("needs_stone_tool");
        public static final TagKey<Block> INCORRECT_FOR_STONE_TOOL = createTag("incorrect_for_stone_tool");
        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Anomalous_Advancement.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> MODDED_STONE_TOOL_MATERIALS = createTag("modded_stone_tool_materials");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Anomalous_Advancement.MOD_ID, name));
        }
    }
}