package com.ant.anomalous_advancement.item;

import com.ant.anomalous_advancement.util.ModTags;
import net.minecraft.item.ToolMaterial;


public class ModToolMaterials {
    public static ToolMaterial FLINT = new ToolMaterial(ModTags.Blocks.INCORRECT_FOR_FLINT_TOOL,
            32,
            1.5F,
            -1.0F,
            5, ModTags.Items.FLINT_REPAIR);

    public static ToolMaterial PIGLIN_BRONZE_INGOT = new ToolMaterial(ModTags.Blocks.INCORRECT_FOR_PIGLIN_BRONZE_INGOT_TOOL,
            512,
            4.0F,
            1.5F,
            5, ModTags.Items.PIGLIN_BRONZE_INGOT_REPAIR);
}

