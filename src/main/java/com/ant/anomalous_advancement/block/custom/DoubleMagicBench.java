package com.ant.anomalous_advancement.block.custom;

import com.ant.anomalous_advancement.block.entity.ModBlockEntities;
import com.ant.anomalous_advancement.block.entity.custom.DoubleMagicBenchEntity;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class DoubleMagicBench extends BaseEntityBlock implements EntityBlock {
    public static final MapCodec<DoubleMagicBench> CODEC = DoubleMagicBench.simpleCodec(DoubleMagicBench::new);

    public DoubleMagicBench(Properties settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new DoubleMagicBenchEntity(pos, state);
    }

    @Override
    protected RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    public InteractionResult useWithoutItem(
            BlockState state,
            Level world,
            BlockPos pos,
            Player player,
            BlockHitResult hit
    ) {
        if (!world.isClientSide()) {
            if (world.getBlockEntity(pos) instanceof MenuProvider provider) {
                player.openMenu(provider);
            }
        }

        return InteractionResult.SUCCESS;
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level world, BlockState state, BlockEntityType<T> type) {
        if (world.isClientSide()) {
            return null;
        }
        return checkType(type, ModBlockEntities.DOUBLE_MAGIC_BENCH_BE, DoubleMagicBenchEntity::tick);
    }

    @SuppressWarnings("unchecked")
    private static <T extends BlockEntity> BlockEntityTicker<T> checkType(
            BlockEntityType<T> givenType,
            BlockEntityType<? extends BlockEntity> expectedType,
            BlockEntityTicker<? super T> ticker) {
        return givenType == expectedType ? (BlockEntityTicker<T>) ticker : null;
    }

}
