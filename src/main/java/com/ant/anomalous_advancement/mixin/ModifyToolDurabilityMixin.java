package com.ant.anomalous_advancement.mixin;

import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ToolMaterial.class)
public class ModifyToolDurabilityMixin {

    @Shadow @Mutable public static ToolMaterial WOOD;
    @Shadow @Mutable public static ToolMaterial STONE;
    @Shadow @Mutable public static ToolMaterial IRON;
    @Shadow @Mutable public static ToolMaterial DIAMOND;
    @Shadow @Mutable public static ToolMaterial GOLD;
    @Shadow @Mutable public static ToolMaterial NETHERITE;

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void modifyDurabilities(CallbackInfo ci) {

        WOOD = new ToolMaterial(
                BlockTags.INCORRECT_FOR_WOODEN_TOOL,
                1, // durability
                2.0F, // speed
                0.0F, // attackDamageBonus
                15,   // enchantmentValue
                ItemTags.WOODEN_TOOL_MATERIALS
        );

        STONE = new ToolMaterial(
                BlockTags.INCORRECT_FOR_STONE_TOOL,
                1, // durability
                4.0F,
                1.0F,
                5,
                ItemTags.STONE_TOOL_MATERIALS
        );

        IRON = new ToolMaterial(
                BlockTags.INCORRECT_FOR_IRON_TOOL,
                1,
                6.0F,
                2.0F,
                14,
                ItemTags.IRON_TOOL_MATERIALS
        );

        DIAMOND = new ToolMaterial(
                BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                1,
                8.0F,
                3.0F,
                10,
                ItemTags.DIAMOND_TOOL_MATERIALS
        );

        GOLD = new ToolMaterial(
                BlockTags.INCORRECT_FOR_GOLD_TOOL,
                1,
                12.0F,
                0.0F,
                22,
                ItemTags.GOLD_TOOL_MATERIALS
        );

        NETHERITE = new ToolMaterial(
                BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
                1,
                9.0F,
                4.0F,
                15,
                ItemTags.NETHERITE_TOOL_MATERIALS
        );
    }
}
