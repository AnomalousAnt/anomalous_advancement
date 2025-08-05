package com.ant.anomalous_advancement.screen.custom;

import com.ant.anomalous_advancement.block.entity.custom.MagicBenchEntity;
import com.ant.anomalous_advancement.screen.ModScreenHandlers;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class MagicBenchScreenHandler extends ScreenHandler {
    private final Inventory inventory;
    public final MagicBenchEntity blockEntity;

    public MagicBenchScreenHandler(int syncId, PlayerInventory playerInventory, BlockPos pos) {
        this(syncId, playerInventory, playerInventory.player.getWorld().getBlockEntity(pos), new ArrayPropertyDelegate(2));
    }

    public MagicBenchScreenHandler(int syncId, PlayerInventory playerInventory,
                                   @Nullable BlockEntity blockEntity, PropertyDelegate propertyDelegate) {
        super(ModScreenHandlers.MAGIC_BENCH_SCREEN_HANDLER, syncId);

        if (!(blockEntity instanceof MagicBenchEntity)) {
            throw new IllegalArgumentException("BlockEntity is not an instance of MagicBenchEntity!");
        }

        this.blockEntity = (MagicBenchEntity) blockEntity;
        this.inventory = this.blockEntity;

        this.addSlot(new Slot(inventory, MagicBenchEntity.TOOL_SLOT, 54, 34));
        this.addSlot(new Slot(inventory, MagicBenchEntity.REAGENT_SLOT, 13, 15));
        this.addSlot(new OutputSlot(inventory, this.blockEntity, MagicBenchEntity.OUTPUT_SLOT, 104, 34));

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);

    }

    private static class OutputSlot extends Slot {
        private final MagicBenchEntity blockEntity;

        public OutputSlot(Inventory inventory, MagicBenchEntity blockEntity, int index, int x, int y) {
            super(inventory, index, x, y);
            this.blockEntity = blockEntity;
        }

        @Override
        public boolean canInsert(ItemStack stack) {
            return false;
        }

        @Override
        public void onTakeItem(PlayerEntity player, ItemStack stack) {
            // Consume inputs
            blockEntity.removeStack(MagicBenchEntity.TOOL_SLOT, 1);
            blockEntity.removeStack(MagicBenchEntity.REAGENT_SLOT, 1);

            // Clear output (optional—typically unnecessary if result is removed by crafting logic)
            this.setStack(ItemStack.EMPTY);

            super.onTakeItem(player, stack);
        }
    }

    private void addPlayerInventory(PlayerInventory playerInventory) {
        for (int row = 0; row < 3; ++row) {
            for (int col = 0; col < 9; ++col) {
                this.addSlot(new Slot(playerInventory, col + row * 9 + 9, 8 + col * 18, 84 + row * 18));
            }
        }
    }

    private void addPlayerHotbar(PlayerInventory playerInventory) {
        for (int col = 0; col < 9; ++col) {
            this.addSlot(new Slot(playerInventory, col, 8 + col * 18, 142));
        }
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);
        if (slot != null && slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();

            int inventorySize = inventory.size();

            if (invSlot < inventorySize) {
                // Moving from block inventory to player inventory
                if (!this.insertItem(originalStack, inventorySize, this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else {
                // Moving from player inventory to block inventory
                if (!this.insertItem(originalStack, 0, inventorySize - 1, false)) {
                    return ItemStack.EMPTY;
                }
            }

            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }
        return newStack;
    }
}
