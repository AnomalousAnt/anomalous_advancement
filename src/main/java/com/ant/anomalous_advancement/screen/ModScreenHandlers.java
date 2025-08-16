package com.ant.anomalous_advancement.screen;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import com.ant.anomalous_advancement.screen.custom.MagicBenchScreenHandler;
import com.ant.anomalous_advancement.screen.custom.DoubleMagicBenchScreenHandler;
import com.ant.anomalous_advancement.screen.custom.TripleMagicBenchScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class ModScreenHandlers {

    public static final ScreenHandlerType<MagicBenchScreenHandler> MAGIC_BENCH_SCREEN_HANDLER =
            Registry.register(
                    Registries.SCREEN_HANDLER,
                    Identifier.of(Anomalous_Advancement.MOD_ID, "magic_bench_screen_handler"),
                    new ExtendedScreenHandlerType<>(MagicBenchScreenHandler::new, BlockPos.PACKET_CODEC)
            );

    public static final ScreenHandlerType<DoubleMagicBenchScreenHandler> DOUBLE_MAGIC_BENCH_SCREEN_HANDLER =
            Registry.register(
                    Registries.SCREEN_HANDLER,
                    Identifier.of(Anomalous_Advancement.MOD_ID, "double_magic_bench_screen_handler"),
                    new ExtendedScreenHandlerType<>(DoubleMagicBenchScreenHandler::new, BlockPos.PACKET_CODEC)
            );

    public static final ScreenHandlerType<TripleMagicBenchScreenHandler> TRIPLE_MAGIC_BENCH_SCREEN_HANDLER =
            Registry.register(
                    Registries.SCREEN_HANDLER,
                    Identifier.of(Anomalous_Advancement.MOD_ID, "triple_magic_bench_screen_handler"),
                    new ExtendedScreenHandlerType<>(TripleMagicBenchScreenHandler::new, BlockPos.PACKET_CODEC)
            );

    public static void registerScreenHandlers() {
        Anomalous_Advancement.LOGGER.info("Registering Screen Handlers for " + Anomalous_Advancement.MOD_ID);
    }
}
