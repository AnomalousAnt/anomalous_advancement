package com.ant.anomalous_advancement;


import com.ant.anomalous_advancement.screen.ModScreenHandlers;
import com.ant.anomalous_advancement.screen.custom.MagicBenchScreen;
import com.ant.anomalous_advancement.screen.custom.DoubleMagicBenchScreen;
import com.ant.anomalous_advancement.screen.custom.TripleMagicBenchScreen;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class Anomalous_AdvancementClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.MAGIC_BENCH_SCREEN_HANDLER, MagicBenchScreen::new);
        HandledScreens.register(ModScreenHandlers.DOUBLE_MAGIC_BENCH_SCREEN_HANDLER, DoubleMagicBenchScreen::new);
        HandledScreens.register(ModScreenHandlers.TRIPLE_MAGIC_BENCH_SCREEN_HANDLER, TripleMagicBenchScreen::new);
    }
}
