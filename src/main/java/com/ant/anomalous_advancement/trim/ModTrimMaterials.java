package com.ant.anomalous_advancement.trim;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.Util;
import net.minecraft.world.item.equipment.trim.MaterialAssetGroup;
import net.minecraft.world.item.equipment.trim.TrimMaterial;

public class ModTrimMaterials {
    public static final ResourceKey<TrimMaterial> PIGLIN_BRONZE_INGOT_KEY =
            ResourceKey.create(Registries.TRIM_MATERIAL, Identifier.fromNamespaceAndPath(Anomalous_Advancement.MOD_ID, "piglin_bronze_ingot"));
    public static final ResourceKey<TrimMaterial> DAMASCUS_STEEL_INGOT_KEY =
            ResourceKey.create(Registries.TRIM_MATERIAL, Identifier.fromNamespaceAndPath(Anomalous_Advancement.MOD_ID, "damascus_steel_ingot"));

    public static Holder<TrimMaterial> PIGLIN_BRONZE_INGOT;
    public static Holder<TrimMaterial> DAMASCUS_STEEL_INGOT;

    public static void bootstrap(BootstrapContext<TrimMaterial> registerable) {
        PIGLIN_BRONZE_INGOT = register(registerable, PIGLIN_BRONZE_INGOT_KEY, Style.EMPTY.withColor(TextColor.parseColor("#bc7410").getOrThrow()));
        DAMASCUS_STEEL_INGOT = register(registerable, DAMASCUS_STEEL_INGOT_KEY, Style.EMPTY.withColor(TextColor.parseColor("#86a5d8").getOrThrow()));
    }

    private static Holder<TrimMaterial> register(BootstrapContext<TrimMaterial> registerable,
                                                             ResourceKey<TrimMaterial> armorTrimKey,
                                                             Style style) {
        String assetName = armorTrimKey.identifier().getPath();

        TrimMaterial trimMaterial = new TrimMaterial(
                MaterialAssetGroup.create(assetName),
                Component.translatable(Util.makeDescriptionId("trim_material", armorTrimKey.identifier())).withStyle(style)
        );

        return registerable.register(armorTrimKey, trimMaterial);
    }
}
