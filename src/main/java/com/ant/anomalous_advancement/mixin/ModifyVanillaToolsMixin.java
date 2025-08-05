package com.ant.anomalous_advancement.mixin;

import com.ant.anomalous_advancement.item.ModItems;
import com.ant.anomalous_advancement.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Item.class)
public class ModifyVanillaToolsMixin {

    @Inject(method = "isCorrectForDrops", at = @At("HEAD"), cancellable = true)
    private void onIsCorrectForDrops(ItemStack stack, BlockState state, CallbackInfoReturnable<Boolean> cir) {
        Item item = stack.getItem();
        Block block = state.getBlock();

        // Custom FLINT pickaxe check
        if (item == ModItems.FLINT_PICKAXE && state.isIn(ModTags.Blocks.INCORRECT_FOR_FLINT_TOOL)) {
            cir.setReturnValue(false);
            return;
        }

        // WOODEN pickaxe check
        if (item == Items.WOODEN_PICKAXE && state.isIn(ModTags.Blocks.INCORRECT_FOR_WOOD_TOOL)) {
            cir.setReturnValue(false);
            return;
        }

        // STONE pickaxe check
        if (item == Items.STONE_PICKAXE && state.isIn(ModTags.Blocks.INCORRECT_FOR_STONE_TOOL)) {
            cir.setReturnValue(false);
        }
    }
}
