package com.ant.anomalous_advancement.screen.custom;

import com.ant.anomalous_advancement.block.entity.custom.MagicBenchEntity;
import com.ant.anomalous_advancement.screen.ModScreenHandlers;
import net.minecraft.core.BlockPos;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.SimpleContainerData;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.jetbrains.annotations.Nullable;

public class MagicBenchScreenHandler extends AbstractContainerMenu {
    private final Container inventory;
    public final MagicBenchEntity blockEntity;

    public MagicBenchScreenHandler(int syncId, Inventory playerInventory, BlockPos pos) {
        this(syncId, playerInventory, playerInventory.player.level().getBlockEntity(pos), new SimpleContainerData(2));
    }

    public MagicBenchScreenHandler(int syncId, Inventory playerInventory,
                                   @Nullable BlockEntity blockEntity, ContainerData propertyDelegate) {
        super(ModScreenHandlers.MAGIC_BENCH_SCREEN_HANDLER, syncId);

        if (!(blockEntity instanceof MagicBenchEntity)) {
            throw new IllegalArgumentException("BlockEntity is not an instance of MagicBenchEntity!");
        }

        this.blockEntity = (MagicBenchEntity) blockEntity;
        this.inventory = this.blockEntity;


        this.addSlot(new Slot(inventory, MagicBenchEntity.TOOL_SLOT, 76, 34) {
            @Override
            public void setChanged() {
                super.setChanged();
                MagicBenchScreenHandler.this.blockEntity.updatePreviewOutput(playerInventory.player);
            }
        });


        this.addSlot(new Slot(inventory, MagicBenchEntity.REAGENT_SLOT, 35, 34) {
            @Override
            public void setChanged() {
                super.setChanged();
                MagicBenchScreenHandler.this.blockEntity.updatePreviewOutput(playerInventory.player);
            }
        });


        this.addSlot(new OutputSlot(inventory, this.blockEntity, MagicBenchEntity.OUTPUT_SLOT, 126, 34));

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);
    }

    private static class OutputSlot extends Slot {
        private final MagicBenchEntity blockEntity;

        public OutputSlot(Container inventory, MagicBenchEntity blockEntity, int index, int x, int y) {
            super(inventory, index, x, y);
            this.blockEntity = blockEntity;
        }

        @Override
        public boolean mayPlace(ItemStack stack) {
            return false;
        }

        @Override
        public boolean mayPickup(Player player) {
            if (player.isCreative()) return true;
            int cost = blockEntity.getCurrentCost();
            return player.experienceLevel >= cost;
        }

        @Override
        public void onTake(Player player, ItemStack stack) {
            int cost = blockEntity.getCurrentCost();

            if (!player.isCreative()) {
                player.giveExperienceLevels(-cost);
            }

            blockEntity.removeItem(MagicBenchEntity.TOOL_SLOT, 1);
            blockEntity.removeItem(MagicBenchEntity.REAGENT_SLOT, 1);

            player.level().playSound(
                    null,
                    blockEntity.getBlockPos(),
                    net.minecraft.sounds.SoundEvents.ENCHANTMENT_TABLE_USE,
                    net.minecraft.sounds.SoundSource.BLOCKS,
                    1.0F,
                    1.0F
            );

            this.setByPlayer(ItemStack.EMPTY);
            super.onTake(player, stack);
        }
    }

    private void addPlayerInventory(Inventory playerInventory) {
        for (int row = 0; row < 3; ++row) {
            for (int col = 0; col < 9; ++col) {
                this.addSlot(new Slot(playerInventory, col + row * 9 + 9, 8 + col * 18, 84 + row * 18));
            }
        }
    }

    private void addPlayerHotbar(Inventory playerInventory) {
        for (int col = 0; col < 9; ++col) {
            this.addSlot(new Slot(playerInventory, col, 8 + col * 18, 142));
        }
    }

    @Override
    public boolean stillValid(Player player) {
        return this.inventory.stillValid(player);
    }

    @Override
    public ItemStack quickMoveStack(Player player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);
        if (slot != null && slot.hasItem()) {
            ItemStack originalStack = slot.getItem();
            newStack = originalStack.copy();

            int inventorySize = inventory.getContainerSize();

            if (slot instanceof OutputSlot) {

                if (!this.moveItemStackTo(originalStack, inventorySize, this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
                slot.onTake(player, originalStack);
                slot.setByPlayer(ItemStack.EMPTY);
            } else if (invSlot < inventorySize) {
                if (!this.moveItemStackTo(originalStack, inventorySize, this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else {
                if (!this.moveItemStackTo(originalStack, 0, inventorySize - 1, false)) {
                    return ItemStack.EMPTY;
                }
            }

            if (originalStack.isEmpty()) {
                slot.setByPlayer(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }

            this.broadcastChanges();
        }
        return newStack;
    }

    public MagicBenchEntity getBlockEntity() {
        return this.blockEntity;
    }

    @Override
    public void removed(Player player) {
        super.removed(player);
        if (!player.level().isClientSide()) {
            blockEntity.dropInputItems(player); // try inventory first
        }
    }
}
