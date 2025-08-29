package com.ant.anomalous_advancement.item;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import com.ant.anomalous_advancement.util.ModTags;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;

public class ModArmorMaterials {
    static RegistryKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY = RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset"));

    public static final RegistryKey<EquipmentAsset> PLEATHER_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(Anomalous_Advancement.MOD_ID, "pleather"));
    public static final ArmorMaterial PLEATHER_ARMOR_MATERIAL = new ArmorMaterial(30, Util.make(new EnumMap<>(EquipmentType.class), map -> {

        map.put(EquipmentType.BOOTS, 1);
        map.put(EquipmentType.LEGGINGS, 2);
        map.put(EquipmentType.CHESTPLATE, 3);
        map.put(EquipmentType.HELMET, 1);
        map.put(EquipmentType.BODY, 1);

    }), 20, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0, 0, ModTags.Items.PLEATHER_REPAIR, PLEATHER_KEY);

    public static final RegistryKey<EquipmentAsset> PCOPPER_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(Anomalous_Advancement.MOD_ID, "pcopper"));
    public static final ArmorMaterial PCOPPER_ARMOR_MATERIAL = new ArmorMaterial(60, Util.make(new EnumMap<>(EquipmentType.class), map -> {

        map.put(EquipmentType.BOOTS, 1);
        map.put(EquipmentType.LEGGINGS, 2);
        map.put(EquipmentType.CHESTPLATE, 3);
        map.put(EquipmentType.HELMET, 1);
        map.put(EquipmentType.BODY, 2);

    }), 20, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0, .05F, ModTags.Items.PCOPPER_REPAIR, PCOPPER_KEY);

    public static final RegistryKey<EquipmentAsset> PCHAIN_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(Anomalous_Advancement.MOD_ID, "pchain"));
    public static final ArmorMaterial PCHAIN_ARMOR_MATERIAL = new ArmorMaterial(90, Util.make(new EnumMap<>(EquipmentType.class), map -> {

        map.put(EquipmentType.BOOTS, 1);
        map.put(EquipmentType.LEGGINGS, 2);
        map.put(EquipmentType.CHESTPLATE, 3);
        map.put(EquipmentType.HELMET, 1);
        map.put(EquipmentType.BODY, 3);

    }), 20, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 1, .05F, ModTags.Items.PCHAIN_REPAIR, PCHAIN_KEY);

    public static final RegistryKey<EquipmentAsset> PIRON_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(Anomalous_Advancement.MOD_ID, "piron"));
    public static final ArmorMaterial PIRON_ARMOR_MATERIAL = new ArmorMaterial(120, Util.make(new EnumMap<>(EquipmentType.class), map -> {

        map.put(EquipmentType.BOOTS, 2);
        map.put(EquipmentType.LEGGINGS, 3);
        map.put(EquipmentType.CHESTPLATE, 4);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 4);

    }), 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1, .05F, ModTags.Items.PIRON_REPAIR, PIRON_KEY);

    public static final RegistryKey<EquipmentAsset> PGOLD_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(Anomalous_Advancement.MOD_ID, "pgold"));
    public static final ArmorMaterial PGOLD_ARMOR_MATERIAL = new ArmorMaterial(150, Util.make(new EnumMap<>(EquipmentType.class), map -> {

        map.put(EquipmentType.BOOTS, 2);
        map.put(EquipmentType.LEGGINGS, 3);
        map.put(EquipmentType.CHESTPLATE, 4);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 5);

    }), 20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 1, .1F, ModTags.Items.PGOLD_REPAIR, PGOLD_KEY);

    public static final RegistryKey<EquipmentAsset> PIGLIN_BRONZE_INGOT_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(Anomalous_Advancement.MOD_ID, "piglin_bronze_ingot"));
    public static final ArmorMaterial PIGLIN_BRONZE_ARMOR_MATERIAL = new ArmorMaterial(180, Util.make(new EnumMap<>(EquipmentType.class), map -> {

        map.put(EquipmentType.BOOTS, 2);
        map.put(EquipmentType.LEGGINGS, 3);
        map.put(EquipmentType.CHESTPLATE, 4);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 6);

    }), 20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 2, .1F, ModTags.Items.PIGLIN_BRONZE_INGOT_REPAIR, PIGLIN_BRONZE_INGOT_KEY);

    public static final RegistryKey<EquipmentAsset> DAMASCUS_STEEL_INGOT_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(Anomalous_Advancement.MOD_ID, "damascus_steel_ingot"));
    public static final ArmorMaterial DAMASCUS_STEEL_ARMOR_MATERIAL = new ArmorMaterial(210, Util.make(new EnumMap<>(EquipmentType.class), map -> {

        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 4);
        map.put(EquipmentType.CHESTPLATE, 5);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 7);

    }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2, .1F, ModTags.Items.DAMASCUS_STEEL_INGOT_REPAIR, DAMASCUS_STEEL_INGOT_KEY);

    public static final RegistryKey<EquipmentAsset> PDIAMOND_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(Anomalous_Advancement.MOD_ID, "pdiamond"));
    public static final ArmorMaterial PDIAMOND_ARMOR_MATERIAL = new ArmorMaterial(240, Util.make(new EnumMap<>(EquipmentType.class), map -> {

        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 4);
        map.put(EquipmentType.CHESTPLATE, 5);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 8);

    }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2, .15F, ModTags.Items.PDIAMOND_REPAIR, PDIAMOND_KEY);

    public static final RegistryKey<EquipmentAsset> PNETHERITE_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(Anomalous_Advancement.MOD_ID, "pnetherite"));
    public static final ArmorMaterial PNETHERITE_ARMOR_MATERIAL = new ArmorMaterial(270, Util.make(new EnumMap<>(EquipmentType.class), map -> {

        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 4);
        map.put(EquipmentType.CHESTPLATE, 5);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 9);

    }), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3, .15F, ModTags.Items.PNETHERITE_REPAIR, PNETHERITE_KEY);


}