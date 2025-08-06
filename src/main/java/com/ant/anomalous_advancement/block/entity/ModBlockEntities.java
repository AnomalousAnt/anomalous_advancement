package com.ant.anomalous_advancement.block.entity;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import com.ant.anomalous_advancement.block.ModBlocks;
import com.ant.anomalous_advancement.block.entity.custom.MagicBenchEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class ModBlockEntities {

    public static final BlockEntityType<MagicBenchEntity> MAGIC_BENCH_BE =
            Registry.register(
                    Registries.BLOCK_ENTITY_TYPE,
                    Identifier.of(Anomalous_Advancement.MOD_ID, "magic_bench_be"),
                    FabricBlockEntityTypeBuilder.create(MagicBenchEntity::new, ModBlocks.ALTAR).build()
            );

    public static void registerBlockEntities() {
        Anomalous_Advancement.LOGGER.info("Registering Block Entities for " + Anomalous_Advancement.MOD_ID);
    }

    public static <T extends BlockEntity> BlockEntityTicker<T> getTicker(
            World world,
            BlockEntityType<T> type,
            BlockEntityType<? extends MagicBenchEntity> expectedType
    ) {
        return type == expectedType && !world.isClient
                ? (w, pos, state, be) -> ((MagicBenchEntity) be).tick(w, pos, state)
                : null;
    }
}
