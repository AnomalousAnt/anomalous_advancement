package com.ant.anomalous_advancement.trim;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import com.ant.anomalous_advancement.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.equipment.trim.ArmorTrimMaterial;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class ModTrimMaterials {
    public static final RegistryKey<ArmorTrimMaterial> PIGLIN_BRONZE_INGOT = RegistryKey.of(RegistryKeys.TRIM_MATERIAL, Identifier.of(Anomalous_Advancement.MOD_ID, "piglin_bronze_ingot"));

    public static void bootstrap(Registerable<ArmorTrimMaterial> registerable){
        register(registerable, PIGLIN_BRONZE_INGOT, Registries.ITEM.getEntry(ModItems.PIGLIN_BRONZE_INGOT), Style.EMPTY.withColor(TextColor.parse("#bc7410").getOrThrow()));
    }

    private static void register(Registerable<ArmorTrimMaterial> registerable, RegistryKey<ArmorTrimMaterial> armorTrimKey, RegistryEntry<Item> item, Style style){

        ArmorTrimMaterial trimMaterial = new ArmorTrimMaterial(armorTrimKey.getValue().getPath(), item, Map.of(),
                Text.translatable(Util.createTranslationKey("trim_material", armorTrimKey.getValue())).fillStyle(style));

        registerable.register(armorTrimKey, trimMaterial);
    }
}
