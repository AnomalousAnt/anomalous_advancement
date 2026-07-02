package com.ant.anomalous_advancement;


import com.ant.anomalous_advancement.screen.ModScreenHandlers;
import com.ant.anomalous_advancement.screen.custom.MagicBenchScreen;
import com.ant.anomalous_advancement.screen.custom.DoubleMagicBenchScreen;
import com.ant.anomalous_advancement.screen.custom.TripleMagicBenchScreen;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screens.MenuScreens;

public class Anomalous_AdvancementClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        MenuScreens.register(ModScreenHandlers.MAGIC_BENCH_SCREEN_HANDLER, MagicBenchScreen::new);
        MenuScreens.register(ModScreenHandlers.DOUBLE_MAGIC_BENCH_SCREEN_HANDLER, DoubleMagicBenchScreen::new);
        MenuScreens.register(ModScreenHandlers.TRIPLE_MAGIC_BENCH_SCREEN_HANDLER, TripleMagicBenchScreen::new);
    }
}
