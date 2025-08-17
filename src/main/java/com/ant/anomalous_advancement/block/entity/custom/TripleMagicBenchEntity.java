package com.ant.anomalous_advancement.block.entity.custom;

import com.ant.anomalous_advancement.block.entity.ImplementedInventory;
import com.ant.anomalous_advancement.block.entity.ModBlockEntities;
import com.ant.anomalous_advancement.screen.custom.TripleMagicBenchScreenHandler;
import com.ant.anomalous_advancement.util.TripleMagicBenchEnchantmentSelector;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.storage.ReadView;
import net.minecraft.storage.WriteView;
import net.minecraft.text.Text;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class TripleMagicBenchEntity extends BlockEntity implements ExtendedScreenHandlerFactory<BlockPos>, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(5, ItemStack.EMPTY);

    public static final int TOOL_SLOT = 0;
    public static final int REAGENT_SLOT_1 = 1;
    public static final int REAGENT_SLOT_2 = 2;
    public static final int REAGENT_SLOT_3 = 3;
    public static final int OUTPUT_SLOT = 4;

    public TripleMagicBenchEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.TRIPLE_MAGIC_BENCH_BE, pos, state);
    }

    private TripleMagicBenchEnchantmentSelector.EnchantmentResult getOutputForInputs() {
        ItemStack tool = this.getStack(TOOL_SLOT);
        ItemStack reagent1 = this.getStack(REAGENT_SLOT_1);
        ItemStack reagent2 = this.getStack(REAGENT_SLOT_2);
        ItemStack reagent3 = this.getStack(REAGENT_SLOT_3);
        if (tool.isEmpty() || reagent1.isEmpty() && reagent2.isEmpty() && reagent3.isEmpty() || this.getWorld() == null) {
            return new TripleMagicBenchEnchantmentSelector.EnchantmentResult(ItemStack.EMPTY, 0);
        }

        return TripleMagicBenchEnchantmentSelector.applyEnchantment(tool, reagent1, reagent2, reagent3, this.getWorld());
    }

    private int currentCost = 0;

    public int getCurrentCost() {
        return currentCost;
    }

    public void updatePreviewOutput(@Nullable PlayerEntity player) {
        TripleMagicBenchEnchantmentSelector.EnchantmentResult result = getOutputForInputs();
        ItemStack preview = result.result().copy();
        this.currentCost = result.cost();

        boolean hasEnoughExp = true;
        if (player != null && !player.isCreative()) {
            hasEnoughExp = player.experienceLevel >= currentCost;
        }

        if (!preview.isEmpty() && hasEnoughExp) {
            preview.setCount(1);
            this.setStack(OUTPUT_SLOT, preview);
        } else {
            this.setStack(OUTPUT_SLOT, ItemStack.EMPTY);
        }
    }


    public void tick(World world, BlockPos pos, BlockState state) {
        if (!world.isClient()) {
            markDirty(world, pos, state);
        }
    }

    public static <T extends BlockEntity> void tick(World world, BlockPos pos, BlockState state, T entity) {
        if (entity instanceof TripleMagicBenchEntity triplemagicBenchEntity) {
            triplemagicBenchEntity.tick(world, pos, state);
        }
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    public BlockPos getScreenOpeningData(ServerPlayerEntity serverPlayerEntity) {
        return this.pos;
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable("block.anomalous_advancement.resplendent_altar");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new TripleMagicBenchScreenHandler(syncId, playerInventory, this.pos);
    }

    @Override
    protected void writeData(WriteView view) {
        super.writeData(view);
        Inventories.writeData(view, inventory);
    }

    @Override
    protected void readData(ReadView view) {
        super.readData(view);
        Inventories.readData(view, inventory);
    }

    @Nullable
    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt(RegistryWrapper.WrapperLookup registryLookup) {
        return createNbt(registryLookup);
    }

    public int getCurrentExpCost() {
        return currentCost;
    }

    @Override
    public void onBlockReplaced(BlockPos pos, BlockState oldState) {
        if (!world.isClient) {
            dropInputItems(null); // drop at block location if no player
        }
        super.onBlockReplaced(pos, oldState);
    }

    public void dropInputItems(@Nullable PlayerEntity player) {
        if (world == null || world.isClient) return;

        boolean hasItems = false;
        for (int i = 0; i < getItems().size(); i++) {
            if (!getStack(i).isEmpty()) {
                hasItems = true;
                break;
            }
        }
        if (!hasItems) return; // nothing to drop

        double dropX;
        double dropY;
        double dropZ;

        if (player != null) {
            dropX = player.getX();
            dropY = player.getY();
            dropZ = player.getZ();
        } else {
            dropX = pos.getX();
            dropY = pos.getY();
            dropZ = pos.getZ();
        }

        for (int i = 0; i < getItems().size(); i++) {
            if (i == OUTPUT_SLOT) {
                // Just clear preview output without dropping it
                setStack(i, ItemStack.EMPTY);
                continue;
            }

            ItemStack stack = getStack(i);
            if (!stack.isEmpty()) {
                if (player != null && player.getInventory().insertStack(stack.copy())) {
                    // Item went directly into inventory
                    setStack(i, ItemStack.EMPTY);
                } else {
                    // Couldn't fit in inventory → drop in world
                    ItemScatterer.spawn(world, dropX, dropY, dropZ, stack);
                    setStack(i, ItemStack.EMPTY);
                }
            }
        }
    }
}
