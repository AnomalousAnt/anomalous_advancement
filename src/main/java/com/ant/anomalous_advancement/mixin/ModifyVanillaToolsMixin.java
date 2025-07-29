package com.ant.anomalous_advancement.mixin;

import com.ant.anomalous_advancement.item.ModToolMaterials;
import com.ant.anomalous_advancement.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Item.class)
public class ModifyVanillaToolsMixin {

    @Inject(method = "isCorrectForDrops", at = @At("HEAD"), cancellable = true)
    private void onIsCorrectForDrops(ItemStack stack, BlockState state, CallbackInfoReturnable<Boolean> cir) {
        if (stack.getItem() instanceof ToolItem tool) {
            ToolMaterial material = tool.getMaterial();
            Block block = state.getBlock();

            // Flint tools cannot mine blocks tagged INCORRECT_FOR_FLINT_TOOL
            if (material == ModToolMaterials.FLINT && state.isIn(ModTags.Blocks.INCORRECT_FOR_FLINT_TOOL)) {
                cir.setReturnValue(false);
                return;
            }

            // Wood tools cannot mine blocks tagged INCORRECT_FOR_WOOD_TOOL
            if (material == ToolMaterials.WOOD && state.isIn(ModTags.Blocks.INCORRECT_FOR_WOOD_TOOL)) {
                cir.setReturnValue(false);
                return;
            }

            // Stone tools cannot mine blocks tagged INCORRECT_FOR_STONE_TOOL
            if (material == ToolMaterials.STONE && state.isIn(ModTags.Blocks.INCORRECT_FOR_STONE_TOOL)) {
                cir.setReturnValue(false);
                return;
            }
            //System.out.println("STONE in tag: " + state.isIn(ModTags.Blocks.INCORRECT_FOR_WOOD_TOOL));

        }
    }
}
