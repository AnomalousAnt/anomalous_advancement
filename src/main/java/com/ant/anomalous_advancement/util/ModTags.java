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

        public static final TagKey<Block> NEEDS_PIGLIN_BRONZE_INGOT_TOOL = createTag("needs_piglin_bronze_ingot_tool");
        public static final TagKey<Block> INCORRECT_FOR_PIGLIN_BRONZE_INGOT_TOOL = createTag("incorrect_for_piglin_bronze_ingot_tool");

        public static final TagKey<Block> NEEDS_DAMASCUS_STEEL_INGOT_TOOL = createTag("needs_damascus_steel_ingot_tool");
        public static final TagKey<Block> INCORRECT_FOR_DAMASCUS_STEEL_INGOT_TOOL = createTag("incorrect_for_damascus_steel_ingot_tool");

        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Anomalous_Advancement.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> MODDED_STONE_TOOL_MATERIALS = createTag("modded_stone_tool_materials");
        public static final TagKey<Item> MODDED_STONE_TOOL_MATERIALS_REPAIR = createTag("modded_stone_tool_materials_repair");
        public static final TagKey<Item> FLINT_REPAIR = createTag("flint_repair");
        public static final TagKey<Item> PIGLIN_BRONZE_INGOT_REPAIR = createTag("piglin_bronze_ingot_repair");
        public static final TagKey<Item> DAMASCUS_STEEL_INGOT_REPAIR = createTag("damascus_steel_ingot_repair");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Anomalous_Advancement.MOD_ID, name));
        }
    }
}