package com.ant.anomalous_advancement.block.entity.custom;

import com.ant.anomalous_advancement.block.entity.ImplementedInventory;
import com.ant.anomalous_advancement.block.entity.ModBlockEntities;
import com.ant.anomalous_advancement.screen.custom.MagicBenchScreenHandler;
import com.ant.anomalous_advancement.util.MagicBenchEnchantmentSelector;
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
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class MagicBenchEntity extends BlockEntity implements ExtendedScreenHandlerFactory<BlockPos>, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(3, ItemStack.EMPTY);

    public static final int TOOL_SLOT = 0;
    public static final int REAGENT_SLOT = 1;
    public static final int OUTPUT_SLOT = 2;

    public MagicBenchEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.MAGIC_BENCH_BE, pos, state);
    }

    private MagicBenchEnchantmentSelector.EnchantmentResult getOutputForInputs() {
        ItemStack tool = this.getStack(TOOL_SLOT);
        ItemStack reagent = this.getStack(REAGENT_SLOT);
        if (tool.isEmpty() || reagent.isEmpty() || this.getWorld() == null) {
            return new MagicBenchEnchantmentSelector.EnchantmentResult(ItemStack.EMPTY, 0);
        }

        return MagicBenchEnchantmentSelector.applyEnchantment(tool, reagent, this.getWorld());
    }

    private int currentCost = 0;

    public int getCurrentCost() {
        return currentCost;
    }

    public void updatePreviewOutput(@Nullable PlayerEntity player) {
        MagicBenchEnchantmentSelector.EnchantmentResult result = getOutputForInputs();
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
        if (entity instanceof MagicBenchEntity magicBenchEntity) {
            magicBenchEntity.tick(world, pos, state);
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
        return Text.translatable("block.anomalous_advancement.altar");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new MagicBenchScreenHandler(syncId, playerInventory, this.pos);
    }

    @Override
    protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        super.writeNbt(nbt, registryLookup);
        Inventories.writeNbt(nbt, inventory, registryLookup);
    }

    @Override
    protected void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        Inventories.readNbt(nbt, inventory, registryLookup);
        super.readNbt(nbt, registryLookup);
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

}
