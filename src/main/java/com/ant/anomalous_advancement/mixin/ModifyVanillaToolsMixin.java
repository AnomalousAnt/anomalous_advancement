package com.ant.anomalous_advancement.mixin;

import com.ant.anomalous_advancement.util.ModTags;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.ItemTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ToolMaterial.class)
public class ModifyVanillaToolsMixin {

    @Shadow @Mutable public static ToolMaterial WOOD;
    @Shadow @Mutable public static ToolMaterial STONE;
    @Shadow @Mutable public static ToolMaterial COPPER;
    @Shadow @Mutable public static ToolMaterial IRON;
    @Shadow @Mutable public static ToolMaterial DIAMOND;
    @Shadow @Mutable public static ToolMaterial GOLD;
    @Shadow @Mutable public static ToolMaterial NETHERITE;

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void modifyDurabilities(CallbackInfo ci) {

        WOOD = new ToolMaterial(
                ModTags.Blocks.INCORRECT_FOR_WOOD_TOOL,
                16, // durability
                1.0F, // speed
                -1.5F, // attackDamageBonus
                15,   // enchantmentValue not important anymore
                ItemTags.WOODEN_TOOL_MATERIALS
        );

        STONE = new ToolMaterial(
                ModTags.Blocks.INCORRECT_FOR_STONE_TOOL,
                64,
                2.0F,
                -0.5F,
                5,
                ItemTags.STONE_TOOL_MATERIALS
        );

        COPPER = new ToolMaterial(
                ModTags.Blocks.INCORRECT_FOR_COPPER_TOOL,
                128,
                2.5F,
                0F,
                5,
                ItemTags.STONE_TOOL_MATERIALS
        );

        IRON = new ToolMaterial(
                ModTags.Blocks.INCORRECT_FOR_IRON_TOOL,
                192,
                3.0F,
                0.5F,
                14,
                ItemTags.IRON_TOOL_MATERIALS
        );

        GOLD = new ToolMaterial(
                ModTags.Blocks.INCORRECT_FOR_GOLD_TOOL,
                320,
                3.5F,
                1.0F,
                22,
                ItemTags.GOLD_TOOL_MATERIALS
        );

        DIAMOND = new ToolMaterial(
                ModTags.Blocks.INCORRECT_FOR_DIAMOND_TOOL,
                1088,
                5.0F,
                2.5F,
                10,
                ItemTags.DIAMOND_TOOL_MATERIALS
        );

        NETHERITE = new ToolMaterial(
                ModTags.Blocks.INCORRECT_FOR_NETHERITE_TOOL,
                1472,
                5.5F,
                3.0F,
                15,
                ItemTags.NETHERITE_TOOL_MATERIALS
        );
    }
}
