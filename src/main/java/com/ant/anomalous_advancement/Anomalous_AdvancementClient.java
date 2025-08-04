package com.ant.anomalous_advancement;


import com.ant.anomalous_advancement.screen.ModScreenHandlers;
import com.ant.anomalous_advancement.screen.custom.MagicBenchScreen;
import com.ant.anomalous_advancement.util.ModModelPredicates;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class Anomalous_AdvancementClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModModelPredicates.registerModelPredicates();
        HandledScreens.register(ModScreenHandlers.MAGIC_BENCH_SCREEN_HANDLER, MagicBenchScreen::new);
    }
}
