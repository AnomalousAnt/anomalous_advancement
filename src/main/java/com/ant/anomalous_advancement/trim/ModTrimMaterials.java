package com.ant.anomalous_advancement.trim;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import net.minecraft.item.equipment.trim.ArmorTrimAssets;
import net.minecraft.item.equipment.trim.ArmorTrimMaterial;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public class ModTrimMaterials {
    public static final RegistryKey<ArmorTrimMaterial> PIGLIN_BRONZE_INGOT = RegistryKey.of(RegistryKeys.TRIM_MATERIAL, Identifier.of(Anomalous_Advancement.MOD_ID, "piglin_bronze_ingot"));
    public static final RegistryKey<ArmorTrimMaterial> DAMASCUS_STEEL_INGOT = RegistryKey.of(RegistryKeys.TRIM_MATERIAL, Identifier.of(Anomalous_Advancement.MOD_ID, "damascus_steel_ingot"));

    public static void bootstrap(Registerable<ArmorTrimMaterial> registerable) {
        register(registerable, PIGLIN_BRONZE_INGOT, Style.EMPTY.withColor(TextColor.parse("#bc7410").getOrThrow()));
        register(registerable, DAMASCUS_STEEL_INGOT, Style.EMPTY.withColor(TextColor.parse("#86a5d8").getOrThrow()));
    }

    private static void register(Registerable<ArmorTrimMaterial> registerable, RegistryKey<ArmorTrimMaterial> armorTrimKey, Style style) {
        String assetName = armorTrimKey.getValue().getPath();

        ArmorTrimMaterial trimMaterial = new ArmorTrimMaterial(
                ArmorTrimAssets.of(assetName),
                Text.translatable(Util.createTranslationKey("trim_material", armorTrimKey.getValue())).fillStyle(style)
        );

        registerable.register(armorTrimKey, trimMaterial);
    }
}