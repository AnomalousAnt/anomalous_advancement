package com.ant.anomalous_advancement.block.entity.custom;

import com.ant.anomalous_advancement.block.entity.ImplementedInventory;
import com.ant.anomalous_advancement.block.entity.ModBlockEntities;
import com.ant.anomalous_advancement.screen.custom.DoubleMagicBenchScreenHandler;
import com.ant.anomalous_advancement.util.DoubleMagicBenchEnchantmentSelector;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.Containers;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import org.jetbrains.annotations.Nullable;
import net.fabricmc.fabric.api.menu.v1.ExtendedMenuProvider;

public class DoubleMagicBenchEntity extends BlockEntity implements ExtendedMenuProvider<BlockPos>, ImplementedInventory {
    private final NonNullList<ItemStack> inventory = NonNullList.withSize(4, ItemStack.EMPTY);

    public static final int TOOL_SLOT = 0;
    public static final int REAGENT_SLOT_1 = 1;
    public static final int REAGENT_SLOT_2 = 2;
    public static final int OUTPUT_SLOT = 3;

    public DoubleMagicBenchEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.DOUBLE_MAGIC_BENCH_BE, pos, state);
    }

    private DoubleMagicBenchEnchantmentSelector.EnchantmentResult getOutputForInputs() {
        ItemStack tool = this.getItem(TOOL_SLOT);
        ItemStack reagent1 = this.getItem(REAGENT_SLOT_1);
        ItemStack reagent2 = this.getItem(REAGENT_SLOT_2);
        if (tool.isEmpty() || reagent1.isEmpty() && reagent2.isEmpty() || this.getLevel() == null) {
            return new DoubleMagicBenchEnchantmentSelector.EnchantmentResult(ItemStack.EMPTY, 0);
        }

        return DoubleMagicBenchEnchantmentSelector.applyEnchantment(tool, reagent1, reagent2, this.getLevel());
    }

    private int currentCost = 0;

    public int getCurrentCost() {
        return currentCost;
    }

    public void updatePreviewOutput(@Nullable Player player) {
       DoubleMagicBenchEnchantmentSelector.EnchantmentResult result = getOutputForInputs();
        ItemStack preview = result.result().copy();
        this.currentCost = result.cost();

        boolean hasEnoughExp = true;
        if (player != null && !player.isCreative()) {
            hasEnoughExp = player.experienceLevel >= currentCost;
        }

        if (!preview.isEmpty() && hasEnoughExp) {
            preview.setCount(1);
            this.setItem(OUTPUT_SLOT, preview);
        } else {
            this.setItem(OUTPUT_SLOT, ItemStack.EMPTY);
        }
    }


    public void tick(Level world, BlockPos pos, BlockState state) {
        if (!world.isClientSide()) {
            setChanged(world, pos, state);
        }
    }

    public static <T extends BlockEntity> void tick(Level world, BlockPos pos, BlockState state, T entity) {
        if (entity instanceof DoubleMagicBenchEntity doublemagicBenchEntity) {
            doublemagicBenchEntity.tick(world, pos, state);
        }
    }

    @Override
    public void setChanged() {
        super.setChanged();

        if (level != null && !level.isClientSide()) {
            level.sendBlockUpdated(worldPosition, getBlockState(), getBlockState(), 3);
        }
    }

    @Override
    public BlockPos getScreenOpeningData(ServerPlayer player) {
        return this.worldPosition;
    }

    @Override
    public NonNullList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("block.anomalous_advancement.gilded_altar");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int syncId, Inventory playerInventory, Player player) {
        return new DoubleMagicBenchScreenHandler(syncId, playerInventory, this.worldPosition);
    }

    @Override
    protected void saveAdditional(ValueOutput view) {
        super.saveAdditional(view);
        ContainerHelper.saveAllItems(view, inventory);
    }

    @Override
    protected void loadAdditional(ValueInput view) {
        super.loadAdditional(view);
        ContainerHelper.loadAllItems(view, inventory);
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registryLookup) {
        return saveWithoutMetadata(registryLookup);
    }

    public int getCurrentExpCost() {
        return currentCost;
    }

    @Override
    public void preRemoveSideEffects(BlockPos pos, BlockState oldState) {
        if (!level.isClientSide()) {
            dropInputItems(null);
        }
        super.preRemoveSideEffects(pos, oldState);
    }

    public void dropInputItems(@Nullable Player player) {
        if (level == null || level.isClientSide()) return;

        boolean hasItems = false;
        for (int i = 0; i < getItems().size(); i++) {
            if (!getItem(i).isEmpty()) {
                hasItems = true;
                break;
            }
        }
        if (!hasItems) return;

        double dropX;
        double dropY;
        double dropZ;

        if (player != null) {
            dropX = player.getX();
            dropY = player.getY();
            dropZ = player.getZ();
        } else {
            dropX = worldPosition.getX();
            dropY = worldPosition.getY();
            dropZ = worldPosition.getZ();
        }

        for (int i = 0; i < getItems().size(); i++) {
            if (i == OUTPUT_SLOT) {
                setItem(i, ItemStack.EMPTY);
                continue;
            }

            ItemStack stack = getItem(i);
            if (!stack.isEmpty()) {
                if (player != null && player.getInventory().add(stack.copy())) {
                    setItem(i, ItemStack.EMPTY);
                } else {
                    Containers.dropItemStack(level, dropX, dropY, dropZ, stack);
                    setItem(i, ItemStack.EMPTY);
                }
            }
        }
    }
}
