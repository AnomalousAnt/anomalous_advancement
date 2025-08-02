package com.ant.anomalous_advancement;


import com.ant.anomalous_advancement.util.ModModelPredicates;
import net.fabricmc.api.ClientModInitializer;

public class Anomalous_AdvancementClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModModelPredicates.registerModelPredicates();
    }
}
