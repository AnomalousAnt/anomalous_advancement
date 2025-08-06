package com.ant.anomalous_advancement.item;

import com.ant.anomalous_advancement.util.ModTags;
import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public class ModToolMaterials {
    public static ToolMaterial FLINT = new ToolMaterial(ModTags.Blocks.INCORRECT_FOR_FLINT_TOOL,
            32, 1.5F, 0.5F, 5, ModTags.Items.FLINT_REPAIR);

    public static ToolMaterial PIGLIN_BRONZE_INGOT = new ToolMaterial(ModTags.Blocks.INCORRECT_FOR_PIGLIN_BRONZE_INGOT_TOOL,
            32, 1.5F, 0.5F, 5, ModTags.Items.PIGLIN_BRONZE_INGOT_REPAIR);
}

