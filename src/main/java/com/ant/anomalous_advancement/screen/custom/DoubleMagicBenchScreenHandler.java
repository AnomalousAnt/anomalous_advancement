package com.ant.anomalous_advancement.screen.custom;

import com.ant.anomalous_advancement.block.entity.custom.DoubleMagicBenchEntity;
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

public class DoubleMagicBenchScreenHandler extends ScreenHandler {
    private final Inventory inventory;
    public final DoubleMagicBenchEntity blockEntity;

    public DoubleMagicBenchScreenHandler(int syncId, PlayerInventory playerInventory, BlockPos pos) {
        this(syncId, playerInventory, playerInventory.player.getWorld().getBlockEntity(pos), new ArrayPropertyDelegate(2));
    }

    public DoubleMagicBenchScreenHandler(int syncId, PlayerInventory playerInventory,
                                   @Nullable BlockEntity blockEntity, PropertyDelegate propertyDelegate) {
        super(ModScreenHandlers.DOUBLE_MAGIC_BENCH_SCREEN_HANDLER, syncId);

        if (!(blockEntity instanceof DoubleMagicBenchEntity)) {
            throw new IllegalArgumentException("BlockEntity is not an instance of DoubleMagicBenchEntity!");
        }

        this.blockEntity = (DoubleMagicBenchEntity) blockEntity;
        this.inventory = this.blockEntity;


        this.addSlot(new Slot(inventory, DoubleMagicBenchEntity.TOOL_SLOT, 54, 34) {
            @Override
            public void markDirty() {
                super.markDirty();
                DoubleMagicBenchScreenHandler.this.blockEntity.updatePreviewOutput(playerInventory.player);
            }
        });


        this.addSlot(new Slot(inventory, DoubleMagicBenchEntity.REAGENT_SLOT_1, 13, 15) {
            @Override
            public void markDirty() {
                super.markDirty();
                DoubleMagicBenchScreenHandler.this.blockEntity.updatePreviewOutput(playerInventory.player);
            }
        });

        this.addSlot(new Slot(inventory, DoubleMagicBenchEntity.REAGENT_SLOT_2, 13, 54) {
            @Override
            public void markDirty() {
                super.markDirty();
                DoubleMagicBenchScreenHandler.this.blockEntity.updatePreviewOutput(playerInventory.player);
            }
        });


        this.addSlot(new OutputSlot(inventory, this.blockEntity, DoubleMagicBenchEntity.OUTPUT_SLOT, 104, 34));

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);
    }

    private static class OutputSlot extends Slot {
        private final DoubleMagicBenchEntity blockEntity;

        public OutputSlot(Inventory inventory, DoubleMagicBenchEntity blockEntity, int index, int x, int y) {
            super(inventory, index, x, y);
            this.blockEntity = blockEntity;
        }

        @Override
        public boolean canInsert(ItemStack stack) {
            return false;
        }

        @Override
        public boolean canTakeItems(PlayerEntity player) {
            if (player.isCreative()) return true;
            int cost = blockEntity.getCurrentCost();
            return player.experienceLevel >= cost;
        }

        @Override
        public void onTakeItem(PlayerEntity player, ItemStack stack) {
            int cost = blockEntity.getCurrentCost();

            if (!player.isCreative()) {
                player.addExperienceLevels(-cost);
            }

            // Consume inputs
            blockEntity.removeStack(DoubleMagicBenchEntity.TOOL_SLOT, 1);
            blockEntity.removeStack(DoubleMagicBenchEntity.REAGENT_SLOT_1, 1);
            blockEntity.removeStack(DoubleMagicBenchEntity.REAGENT_SLOT_2, 1);

            player.getWorld().playSound(
                    null,
                    blockEntity.getPos(),
                    net.minecraft.sound.SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE,
                    net.minecraft.sound.SoundCategory.BLOCKS,
                    1.0F,
                    1.0F
            );

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

            if (slot instanceof OutputSlot) {

                if (!this.insertItem(originalStack, inventorySize, this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
                slot.onTakeItem(player, originalStack);
                slot.setStack(ItemStack.EMPTY);
            } else if (invSlot < inventorySize) {
                if (!this.insertItem(originalStack, inventorySize, this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else {
                if (!this.insertItem(originalStack, 0, inventorySize - 1, false)) {
                    return ItemStack.EMPTY;
                }
            }

            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }

            this.sendContentUpdates();
        }
        return newStack;
    }

    public DoubleMagicBenchEntity getBlockEntity() {
        return this.blockEntity;
    }

    @Override
    public void onClosed(PlayerEntity player) {
        super.onClosed(player);
        if (!player.getWorld().isClient) {
            blockEntity.dropInputItems(player); // try inventory first
        }
    }
}
