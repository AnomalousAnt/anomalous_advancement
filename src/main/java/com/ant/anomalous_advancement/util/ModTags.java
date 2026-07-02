package com.ant.anomalous_advancement.util;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> NEEDS_WOOD_TOOL = createTag("needs_wood_tool");
        public static final TagKey<Block> INCORRECT_FOR_WOOD_TOOL = createTag("incorrect_for_wood_tool");

        public static final TagKey<Block> NEEDS_FLINT_TOOL = createTag("needs_flint_tool");
        public static final TagKey<Block> INCORRECT_FOR_FLINT_TOOL = createTag("incorrect_for_flint_tool");

        public static final TagKey<Block> NEEDS_STONE_TOOL = createTag("needs_stone_tool");
        public static final TagKey<Block> INCORRECT_FOR_STONE_TOOL = createTag("incorrect_for_stone_tool");

        public static final TagKey<Block> NEEDS_COPPER_TOOL = createTag("needs_copper_tool");
        public static final TagKey<Block> INCORRECT_FOR_COPPER_TOOL = createTag("incorrect_for_copper_tool");

        public static final TagKey<Block> NEEDS_IRON_TOOL = createTag("needs_iron_tool");
        public static final TagKey<Block> INCORRECT_FOR_IRON_TOOL = createTag("incorrect_for_iron_tool");

        public static final TagKey<Block> NEEDS_GOLD_TOOL = createTag("needs_gold_tool");
        public static final TagKey<Block> INCORRECT_FOR_GOLD_TOOL = createTag("incorrect_for_gold_tool");

        public static final TagKey<Block> NEEDS_PIGLIN_BRONZE_INGOT_TOOL = createTag("needs_piglin_bronze_ingot_tool");
        public static final TagKey<Block> INCORRECT_FOR_PIGLIN_BRONZE_INGOT_TOOL = createTag("incorrect_for_piglin_bronze_ingot_tool");

        public static final TagKey<Block> NEEDS_DAMASCUS_STEEL_INGOT_TOOL = createTag("needs_damascus_steel_ingot_tool");
        public static final TagKey<Block> INCORRECT_FOR_DAMASCUS_STEEL_INGOT_TOOL = createTag("incorrect_for_damascus_steel_ingot_tool");

        public static final TagKey<Block> NEEDS_DIAMOND_TOOL = createTag("needs_diamond_tool");
        public static final TagKey<Block> INCORRECT_FOR_DIAMOND_TOOL = createTag("incorrect_for_diamond_tool");

        public static final TagKey<Block> NEEDS_NETHERITE_TOOL = createTag("needs_netherite_tool");
        public static final TagKey<Block> INCORRECT_FOR_NETHERITE_TOOL = createTag("incorrect_for_netherite_tool");

        private static TagKey<Block> createTag(String name){
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Anomalous_Advancement.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> MODDED_STONE_TOOL_MATERIALS = createTag("modded_stone_tool_materials");
        public static final TagKey<Item> MODDED_STONE_TOOL_MATERIALS_REPAIR = createTag("modded_stone_tool_materials_repair");
        public static final TagKey<Item> FLINT_REPAIR = createTag("flint_repair");
        public static final TagKey<Item> PLEATHER_REPAIR = createTag("pleather_repair");
        public static final TagKey<Item> PCOPPER_REPAIR = createTag("pcopper_repair");
        public static final TagKey<Item> PCHAIN_REPAIR = createTag("pchain_repair");
        public static final TagKey<Item> PIRON_REPAIR = createTag("piron_repair");
        public static final TagKey<Item> PGOLD_REPAIR = createTag("pgold_repair");
        public static final TagKey<Item> PIGLIN_BRONZE_INGOT_REPAIR = createTag("piglin_bronze_ingot_repair");
        public static final TagKey<Item> DAMASCUS_STEEL_INGOT_REPAIR = createTag("damascus_steel_ingot_repair");
        public static final TagKey<Item> PDIAMOND_REPAIR = createTag("pdiamond_repair");
        public static final TagKey<Item> PNETHERITE_REPAIR = createTag("pnetherite_repair");
        public static final TagKey<Item> CUSTOM_BOWS = createTag("custom_bows");

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Anomalous_Advancement.MOD_ID, name));
        }
    }
}