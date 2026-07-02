package com.ant.anomalous_advancement.item;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import com.ant.anomalous_advancement.util.ModTags;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Util;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import java.util.EnumMap;

public class ModArmorMaterials {
    static ResourceKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY = ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));

    public static final ResourceKey<EquipmentAsset> PLEATHER_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(Anomalous_Advancement.MOD_ID, "pleather"));
    public static final ArmorMaterial PLEATHER_ARMOR_MATERIAL = new ArmorMaterial(30, Util.make(new EnumMap<>(ArmorType.class), map -> {

        map.put(ArmorType.BOOTS, 1);
        map.put(ArmorType.LEGGINGS, 2);
        map.put(ArmorType.CHESTPLATE, 3);
        map.put(ArmorType.HELMET, 1);
        map.put(ArmorType.BODY, 1);

    }), 20, SoundEvents.ARMOR_EQUIP_LEATHER, 0, 0, ModTags.Items.PLEATHER_REPAIR, PLEATHER_KEY);

    public static final ResourceKey<EquipmentAsset> PCOPPER_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(Anomalous_Advancement.MOD_ID, "pcopper"));
    public static final ArmorMaterial PCOPPER_ARMOR_MATERIAL = new ArmorMaterial(60, Util.make(new EnumMap<>(ArmorType.class), map -> {

        map.put(ArmorType.BOOTS, 1);
        map.put(ArmorType.LEGGINGS, 2);
        map.put(ArmorType.CHESTPLATE, 3);
        map.put(ArmorType.HELMET, 1);
        map.put(ArmorType.BODY, 2);

    }), 20, SoundEvents.ARMOR_EQUIP_CHAIN, 0, .05F, ModTags.Items.PCOPPER_REPAIR, PCOPPER_KEY);

    public static final ResourceKey<EquipmentAsset> PCHAIN_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(Anomalous_Advancement.MOD_ID, "pchain"));
    public static final ArmorMaterial PCHAIN_ARMOR_MATERIAL = new ArmorMaterial(90, Util.make(new EnumMap<>(ArmorType.class), map -> {

        map.put(ArmorType.BOOTS, 1);
        map.put(ArmorType.LEGGINGS, 2);
        map.put(ArmorType.CHESTPLATE, 3);
        map.put(ArmorType.HELMET, 1);
        map.put(ArmorType.BODY, 3);

    }), 20, SoundEvents.ARMOR_EQUIP_CHAIN, 1, .05F, ModTags.Items.PCHAIN_REPAIR, PCHAIN_KEY);

    public static final ResourceKey<EquipmentAsset> PIRON_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(Anomalous_Advancement.MOD_ID, "piron"));
    public static final ArmorMaterial PIRON_ARMOR_MATERIAL = new ArmorMaterial(120, Util.make(new EnumMap<>(ArmorType.class), map -> {

        map.put(ArmorType.BOOTS, 2);
        map.put(ArmorType.LEGGINGS, 3);
        map.put(ArmorType.CHESTPLATE, 4);
        map.put(ArmorType.HELMET, 2);
        map.put(ArmorType.BODY, 4);

    }), 20, SoundEvents.ARMOR_EQUIP_IRON, 1, .05F, ModTags.Items.PIRON_REPAIR, PIRON_KEY);

    public static final ResourceKey<EquipmentAsset> PGOLD_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(Anomalous_Advancement.MOD_ID, "pgold"));
    public static final ArmorMaterial PGOLD_ARMOR_MATERIAL = new ArmorMaterial(150, Util.make(new EnumMap<>(ArmorType.class), map -> {

        map.put(ArmorType.BOOTS, 2);
        map.put(ArmorType.LEGGINGS, 3);
        map.put(ArmorType.CHESTPLATE, 4);
        map.put(ArmorType.HELMET, 2);
        map.put(ArmorType.BODY, 5);

    }), 20, SoundEvents.ARMOR_EQUIP_GOLD, 1, .1F, ModTags.Items.PGOLD_REPAIR, PGOLD_KEY);

    public static final ResourceKey<EquipmentAsset> PIGLIN_BRONZE_INGOT_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(Anomalous_Advancement.MOD_ID, "piglin_bronze_ingot"));
    public static final ArmorMaterial PIGLIN_BRONZE_ARMOR_MATERIAL = new ArmorMaterial(180, Util.make(new EnumMap<>(ArmorType.class), map -> {

        map.put(ArmorType.BOOTS, 2);
        map.put(ArmorType.LEGGINGS, 3);
        map.put(ArmorType.CHESTPLATE, 4);
        map.put(ArmorType.HELMET, 2);
        map.put(ArmorType.BODY, 6);

    }), 20, SoundEvents.ARMOR_EQUIP_GOLD, 2, .1F, ModTags.Items.PIGLIN_BRONZE_INGOT_REPAIR, PIGLIN_BRONZE_INGOT_KEY);

    public static final ResourceKey<EquipmentAsset> DAMASCUS_STEEL_INGOT_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(Anomalous_Advancement.MOD_ID, "damascus_steel_ingot"));
    public static final ArmorMaterial DAMASCUS_STEEL_ARMOR_MATERIAL = new ArmorMaterial(210, Util.make(new EnumMap<>(ArmorType.class), map -> {

        map.put(ArmorType.BOOTS, 3);
        map.put(ArmorType.LEGGINGS, 4);
        map.put(ArmorType.CHESTPLATE, 5);
        map.put(ArmorType.HELMET, 3);
        map.put(ArmorType.BODY, 7);

    }), 20, SoundEvents.ARMOR_EQUIP_DIAMOND, 2, .1F, ModTags.Items.DAMASCUS_STEEL_INGOT_REPAIR, DAMASCUS_STEEL_INGOT_KEY);

    public static final ResourceKey<EquipmentAsset> PDIAMOND_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(Anomalous_Advancement.MOD_ID, "pdiamond"));
    public static final ArmorMaterial PDIAMOND_ARMOR_MATERIAL = new ArmorMaterial(240, Util.make(new EnumMap<>(ArmorType.class), map -> {

        map.put(ArmorType.BOOTS, 3);
        map.put(ArmorType.LEGGINGS, 4);
        map.put(ArmorType.CHESTPLATE, 5);
        map.put(ArmorType.HELMET, 3);
        map.put(ArmorType.BODY, 8);

    }), 20, SoundEvents.ARMOR_EQUIP_DIAMOND, 2, .15F, ModTags.Items.PDIAMOND_REPAIR, PDIAMOND_KEY);

    public static final ResourceKey<EquipmentAsset> PNETHERITE_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(Anomalous_Advancement.MOD_ID, "pnetherite"));
    public static final ArmorMaterial PNETHERITE_ARMOR_MATERIAL = new ArmorMaterial(270, Util.make(new EnumMap<>(ArmorType.class), map -> {

        map.put(ArmorType.BOOTS, 3);
        map.put(ArmorType.LEGGINGS, 4);
        map.put(ArmorType.CHESTPLATE, 5);
        map.put(ArmorType.HELMET, 3);
        map.put(ArmorType.BODY, 9);

    }), 20, SoundEvents.ARMOR_EQUIP_NETHERITE, 3, .15F, ModTags.Items.PNETHERITE_REPAIR, PNETHERITE_KEY);


}