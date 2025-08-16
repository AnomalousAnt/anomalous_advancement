package com.ant.anomalous_advancement.block.entity;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import com.ant.anomalous_advancement.block.ModBlocks;
import com.ant.anomalous_advancement.block.entity.custom.TripleMagicBenchEntity;
import com.ant.anomalous_advancement.block.entity.custom.DoubleMagicBenchEntity;
import com.ant.anomalous_advancement.block.entity.custom.MagicBenchEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {

    public static final BlockEntityType<MagicBenchEntity> MAGIC_BENCH_BE =
            Registry.register(
                    Registries.BLOCK_ENTITY_TYPE,
                    Identifier.of(Anomalous_Advancement.MOD_ID, "magic_bench_be"),
                    FabricBlockEntityTypeBuilder.create(MagicBenchEntity::new, ModBlocks.ALTAR).build()
            );

    public static final BlockEntityType<DoubleMagicBenchEntity> DOUBLE_MAGIC_BENCH_BE =
            Registry.register(
                    Registries.BLOCK_ENTITY_TYPE,
                    Identifier.of(Anomalous_Advancement.MOD_ID, "double_magic_bench_be"),
                    FabricBlockEntityTypeBuilder.create(DoubleMagicBenchEntity::new, ModBlocks.GILDED_ALTAR).build()
            );

    public static final BlockEntityType<TripleMagicBenchEntity> TRIPLE_MAGIC_BENCH_BE =
            Registry.register(
                    Registries.BLOCK_ENTITY_TYPE,
                    Identifier.of(Anomalous_Advancement.MOD_ID, "triple_magic_bench_be"),
                    FabricBlockEntityTypeBuilder.create(TripleMagicBenchEntity::new, ModBlocks.RESPLENDENT_ALTAR).build()
            );

    public static void registerBlockEntities() {
        Anomalous_Advancement.LOGGER.info("Registering Block Entities for " + Anomalous_Advancement.MOD_ID);
    }
}
