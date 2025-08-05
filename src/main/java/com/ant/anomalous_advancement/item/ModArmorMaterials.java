package com.ant.anomalous_advancement.item;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import com.ant.anomalous_advancement.util.ModTags;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentModel;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;

public class ModArmorMaterials {
    public static EquipmentModel PIGLIN_BRONZE_INGOT = EquipmentModel.builder().addHumanoidLayers(Identifier.of(Anomalous_Advancement.MOD_ID, "piglin_bronze_ingot")).build();

    public static final ArmorMaterial PIGLIN_BRONZE_ARMOR_MATERIAL = new ArmorMaterial(500, Util.make(new EnumMap<>(EquipmentType.class), map -> {

        map.put(EquipmentType.BOOTS, 2);
        map.put(EquipmentType.LEGGINGS, 4);
        map.put(EquipmentType.CHESTPLATE, 6);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 4);
    }), 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0, 0, ModTags.Items.PIGLIN_BRONZE_INGOT_REPAIR,
            Identifier.of(Anomalous_Advancement.MOD_ID, "piglin_bronze_ingot"));

}