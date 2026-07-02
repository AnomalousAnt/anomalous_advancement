package com.ant.anomalous_advancement.screen;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import com.ant.anomalous_advancement.screen.custom.MagicBenchScreenHandler;
import com.ant.anomalous_advancement.screen.custom.DoubleMagicBenchScreenHandler;
import com.ant.anomalous_advancement.screen.custom.TripleMagicBenchScreenHandler;
import net.fabricmc.fabric.api.menu.v1.ExtendedMenuType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.inventory.MenuType;

public class ModScreenHandlers {

    public static final MenuType<MagicBenchScreenHandler> MAGIC_BENCH_SCREEN_HANDLER =
            Registry.register(
                    BuiltInRegistries.MENU,
                    Identifier.fromNamespaceAndPath(Anomalous_Advancement.MOD_ID, "magic_bench_screen_handler"),
                    new ExtendedMenuType<>(MagicBenchScreenHandler::new, BlockPos.STREAM_CODEC)
            );

    public static final MenuType<DoubleMagicBenchScreenHandler> DOUBLE_MAGIC_BENCH_SCREEN_HANDLER =
            Registry.register(
                    BuiltInRegistries.MENU,
                    Identifier.fromNamespaceAndPath(Anomalous_Advancement.MOD_ID, "double_magic_bench_screen_handler"),
                    new ExtendedMenuType<>(DoubleMagicBenchScreenHandler::new, BlockPos.STREAM_CODEC)
            );

    public static final MenuType<TripleMagicBenchScreenHandler> TRIPLE_MAGIC_BENCH_SCREEN_HANDLER =
            Registry.register(
                    BuiltInRegistries.MENU,
                    Identifier.fromNamespaceAndPath(Anomalous_Advancement.MOD_ID, "triple_magic_bench_screen_handler"),
                    new ExtendedMenuType<>(TripleMagicBenchScreenHandler::new, BlockPos.STREAM_CODEC)
            );

    public static void registerScreenHandlers() {
        Anomalous_Advancement.LOGGER.info("Registering Screen Handlers for " + Anomalous_Advancement.MOD_ID);
    }
}
