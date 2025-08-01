package com.ant.anomalous_advancement.component;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.function.UnaryOperator;

public class ModDataComponentTypes {

    private static <T> ComponentType<T> register(String name, UnaryOperator<ComponentType.Builder<T>> builderOperator){
        return Registry.register(Registries.DATA_COMPONENT_TYPE, Identifier.of(Anomalous_Advancement.MOD_ID, name),
                builderOperator.apply(ComponentType.builder()).build());
    }

    public static void registerDataComponentTypes() {
        Anomalous_Advancement.LOGGER.info("Registering Data Component Types for " + Anomalous_Advancement.MOD_ID);
    }
}
