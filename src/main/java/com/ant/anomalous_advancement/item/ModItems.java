package com.ant.anomalous_advancement.item;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import com.ant.anomalous_advancement.item.custom.ModBowItem;
import com.ant.anomalous_advancement.trim.ModTrimMaterials;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ProvidesTrimMaterialComponent;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {

   public static final Item FLINT_PICKAXE = registerItem("flint_pickaxe",
           setting -> new Item(setting.pickaxe(ModToolMaterials.FLINT, 1, -2.8f)));
    public static final Item FLINT_SWORD = registerItem("flint_sword",
            setting -> new Item(setting.sword(ModToolMaterials.FLINT, 3, -2.4f)));
    public static final Item FLINT_AXE = registerItem("flint_axe",
            setting -> new AxeItem(ModToolMaterials.FLINT,  6, -3.2f, setting));
    public static final Item FLINT_SHOVEL = registerItem("flint_shovel",
            setting -> new ShovelItem(ModToolMaterials.FLINT,  1.5f, -3.8f, setting));
    public static final Item FLINT_HOE = registerItem("flint_hoe",
            setting -> new HoeItem(ModToolMaterials.FLINT, 0, -3f, setting));

    public static final Item PBOW = registerItem("pbow",
            setting -> new ModBowItem(setting.maxDamage(64), 1.0f, 0.6f, 0.5f));

    public static final Item PLEATHER_HELMET = registerItem("pleather_helmet",
            setting -> new Item(setting.armor(ModArmorMaterials.PLEATHER_ARMOR_MATERIAL, EquipmentType.HELMET)));
    public static final Item PLEATHER_CHESTPLATE = registerItem("pleather_chestplate",
            setting -> new Item(setting.armor(ModArmorMaterials.PLEATHER_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)));
    public static final Item PLEATHER_LEGGINGS = registerItem("pleather_leggings",
            setting -> new Item(setting.armor(ModArmorMaterials.PLEATHER_ARMOR_MATERIAL, EquipmentType.LEGGINGS)));
    public static final Item PLEATHER_BOOTS = registerItem("pleather_boots",
            setting -> new Item(setting.armor(ModArmorMaterials.PLEATHER_ARMOR_MATERIAL, EquipmentType.BOOTS)));
    public static final Item PLEATHER_HORSE_ARMOR = registerItem("pleather_horse_armor",
            setting -> new Item(setting.horseArmor(ModArmorMaterials.PLEATHER_ARMOR_MATERIAL).maxCount(1)));

    public static final Item PCOPPER_HELMET = registerItem("pcopper_helmet",
            setting -> new Item(setting.armor(ModArmorMaterials.PCOPPER_ARMOR_MATERIAL, EquipmentType.HELMET)));
    public static final Item PCOPPER_CHESTPLATE = registerItem("pcopper_chestplate",
            setting -> new Item(setting.armor(ModArmorMaterials.PCOPPER_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)));
    public static final Item PCOPPER_LEGGINGS = registerItem("pcopper_leggings",
            setting -> new Item(setting.armor(ModArmorMaterials.PCOPPER_ARMOR_MATERIAL, EquipmentType.LEGGINGS)));
    public static final Item PCOPPER_BOOTS = registerItem("pcopper_boots",
            setting -> new Item(setting.armor(ModArmorMaterials.PCOPPER_ARMOR_MATERIAL, EquipmentType.BOOTS)));
    public static final Item PCOPPER_HORSE_ARMOR = registerItem("pcopper_horse_armor",
            setting -> new Item(setting.horseArmor(ModArmorMaterials.PCOPPER_ARMOR_MATERIAL).maxCount(1)));
    public static final Item COPPER_BOW = registerItem("copper_bow",
            setting -> new ModBowItem(setting.maxDamage(96), 1.0f, 0.7f, 0.6f));

    public static final Item PCHAIN_HELMET = registerItem("pchain_helmet",
            setting -> new Item(setting.armor(ModArmorMaterials.PCHAIN_ARMOR_MATERIAL, EquipmentType.HELMET)));
    public static final Item PCHAIN_CHESTPLATE = registerItem("pchain_chestplate",
            setting -> new Item(setting.armor(ModArmorMaterials.PCHAIN_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)));
    public static final Item PCHAIN_LEGGINGS = registerItem("pchain_leggings",
            setting -> new Item(setting.armor(ModArmorMaterials.PCHAIN_ARMOR_MATERIAL, EquipmentType.LEGGINGS)));
    public static final Item PCHAIN_BOOTS = registerItem("pchain_boots",
            setting -> new Item(setting.armor(ModArmorMaterials.PCHAIN_ARMOR_MATERIAL, EquipmentType.BOOTS)));
    public static final Item PCHAIN_HORSE_ARMOR = registerItem("pchain_horse_armor",
            setting -> new Item(setting.horseArmor(ModArmorMaterials.PCHAIN_ARMOR_MATERIAL).maxCount(1)));

    public static final Item PIRON_HELMET = registerItem("piron_helmet",
            setting -> new Item(setting.armor(ModArmorMaterials.PIRON_ARMOR_MATERIAL, EquipmentType.HELMET)));
    public static final Item PIRON_CHESTPLATE = registerItem("piron_chestplate",
            setting -> new Item(setting.armor(ModArmorMaterials.PIRON_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)));
    public static final Item PIRON_LEGGINGS = registerItem("piron_leggings",
            setting -> new Item(setting.armor(ModArmorMaterials.PIRON_ARMOR_MATERIAL, EquipmentType.LEGGINGS)));
    public static final Item PIRON_BOOTS = registerItem("piron_boots",
            setting -> new Item(setting.armor(ModArmorMaterials.PIRON_ARMOR_MATERIAL, EquipmentType.BOOTS)));
    public static final Item PIRON_HORSE_ARMOR = registerItem("piron_horse_armor",
            setting -> new Item(setting.horseArmor(ModArmorMaterials.PIRON_ARMOR_MATERIAL).maxCount(1)));
    public static final Item IRON_BOW = registerItem("iron_bow",
            setting -> new ModBowItem(setting.maxDamage(128), 1.0f, 0.8f,0.7f));

    public static final Item PGOLD_HELMET = registerItem("pgold_helmet",
            setting -> new Item(setting.armor(ModArmorMaterials.PGOLD_ARMOR_MATERIAL, EquipmentType.HELMET)));
    public static final Item PGOLD_CHESTPLATE = registerItem("pgold_chestplate",
            setting -> new Item(setting.armor(ModArmorMaterials.PGOLD_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)));
    public static final Item PGOLD_LEGGINGS = registerItem("pgold_leggings",
            setting -> new Item(setting.armor(ModArmorMaterials.PGOLD_ARMOR_MATERIAL, EquipmentType.LEGGINGS)));
    public static final Item PGOLD_BOOTS = registerItem("pgold_boots",
            setting -> new Item(setting.armor(ModArmorMaterials.PGOLD_ARMOR_MATERIAL, EquipmentType.BOOTS)));
    public static final Item PGOLD_HORSE_ARMOR = registerItem("pgold_horse_armor",
            setting -> new Item(setting.horseArmor(ModArmorMaterials.PGOLD_ARMOR_MATERIAL).maxCount(1)));
    public static final Item GOLD_BOW = registerItem("gold_bow",
            setting -> new ModBowItem(setting.maxDamage(160), 1.0f,0.9f,0.8f));

    public static final Item PIGLIN_BRONZE_PICKAXE = registerItem("piglin_bronze_pickaxe",
            setting -> new Item(setting.pickaxe(ModToolMaterials.PIGLIN_BRONZE_INGOT, 1, -2.8f)));
    public static final Item PIGLIN_BRONZE_SWORD = registerItem("piglin_bronze_sword",
            setting -> new Item(setting.sword(ModToolMaterials.PIGLIN_BRONZE_INGOT, 3, -2.4f)));
    public static final Item PIGLIN_BRONZE_AXE = registerItem("piglin_bronze_axe",
            setting -> new AxeItem(ModToolMaterials.PIGLIN_BRONZE_INGOT,  6, -3.2f, setting));
    public static final Item PIGLIN_BRONZE_SHOVEL = registerItem("piglin_bronze_shovel",
            setting -> new ShovelItem(ModToolMaterials.PIGLIN_BRONZE_INGOT,  1.5f, -3.8f, setting));
    public static final Item PIGLIN_BRONZE_HOE = registerItem("piglin_bronze_hoe",
            setting -> new HoeItem(ModToolMaterials.PIGLIN_BRONZE_INGOT, 0, -3f, setting));
    public static final Item PIGLIN_BRONZE_BOW = registerItem("piglin_bronze_bow",
            setting -> new ModBowItem(setting.maxDamage(192), 1.0f, 1.0f,0.9f));

    public static final Item PIGLIN_BRONZE_INGOT = registerItem("piglin_bronze_ingot", settings ->
            new Item(settings.component(
                    DataComponentTypes.PROVIDES_TRIM_MATERIAL,
                    new ProvidesTrimMaterialComponent(ModTrimMaterials.PIGLIN_BRONZE_INGOT_KEY)
            ))
    );

    public static final Item PIGLIN_BRONZE_HELMET = registerItem("piglin_bronze_helmet",
            setting -> new Item(setting.armor(ModArmorMaterials.PIGLIN_BRONZE_ARMOR_MATERIAL, EquipmentType.HELMET)));
    public static final Item PIGLIN_BRONZE_CHESTPLATE = registerItem("piglin_bronze_chestplate",
            setting -> new Item(setting.armor(ModArmorMaterials.PIGLIN_BRONZE_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)));
    public static final Item PIGLIN_BRONZE_LEGGINGS = registerItem("piglin_bronze_leggings",
            setting -> new Item(setting.armor(ModArmorMaterials.PIGLIN_BRONZE_ARMOR_MATERIAL, EquipmentType.LEGGINGS)));
    public static final Item PIGLIN_BRONZE_BOOTS = registerItem("piglin_bronze_boots",
            setting -> new Item(setting.armor(ModArmorMaterials.PIGLIN_BRONZE_ARMOR_MATERIAL, EquipmentType.BOOTS)));
    public static final Item PIGLIN_BRONZE_HORSE_ARMOR = registerItem("piglin_bronze_horse_armor",
            setting -> new Item(setting.horseArmor(ModArmorMaterials.PIGLIN_BRONZE_ARMOR_MATERIAL).maxCount(1)));

    public static final Item DAMASCUS_STEEL_PICKAXE = registerItem("damascus_steel_pickaxe",
            setting -> new Item(setting.pickaxe(ModToolMaterials.DAMASCUS_STEEL_INGOT, 1, -2.8f)));
    public static final Item DAMASCUS_STEEL_SWORD = registerItem("damascus_steel_sword",
            setting -> new Item(setting.sword(ModToolMaterials.DAMASCUS_STEEL_INGOT, 3, -2.4f)));
    public static final Item DAMASCUS_STEEL_AXE = registerItem("damascus_steel_axe",
            setting -> new AxeItem(ModToolMaterials.DAMASCUS_STEEL_INGOT,  6, -3.2f, setting));
    public static final Item DAMASCUS_STEEL_SHOVEL = registerItem("damascus_steel_shovel",
            setting -> new ShovelItem(ModToolMaterials.DAMASCUS_STEEL_INGOT,  1.5f, -3.8f, setting));
    public static final Item DAMASCUS_STEEL_HOE = registerItem("damascus_steel_hoe",
            setting -> new HoeItem(ModToolMaterials.DAMASCUS_STEEL_INGOT, 0, -3f, setting));
    public static final Item DAMASCUS_STEEL_BOW = registerItem("damascus_steel_bow",
            setting -> new ModBowItem(setting.maxDamage(224),1.1f,1.1f,1.0f));

    public static final Item DAMASCUS_STEEL_INGOT = registerItem("damascus_steel_ingot", settings ->
            new Item(settings.component(
                    DataComponentTypes.PROVIDES_TRIM_MATERIAL,
                    new ProvidesTrimMaterialComponent(ModTrimMaterials.DAMASCUS_STEEL_INGOT_KEY)
            ))
    );



    public static final Item DAMASCUS_STEEL_HELMET = registerItem("damascus_steel_helmet",
            setting -> new Item(setting.armor(ModArmorMaterials.DAMASCUS_STEEL_ARMOR_MATERIAL, EquipmentType.HELMET)));
    public static final Item DAMASCUS_STEEL_CHESTPLATE = registerItem("damascus_steel_chestplate",
            setting -> new Item(setting.armor(ModArmorMaterials.DAMASCUS_STEEL_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)));
    public static final Item DAMASCUS_STEEL_LEGGINGS = registerItem("damascus_steel_leggings",
            setting -> new Item(setting.armor(ModArmorMaterials.DAMASCUS_STEEL_ARMOR_MATERIAL, EquipmentType.LEGGINGS)));
    public static final Item DAMASCUS_STEEL_BOOTS = registerItem("damascus_steel_boots",
            setting -> new Item(setting.armor(ModArmorMaterials.DAMASCUS_STEEL_ARMOR_MATERIAL, EquipmentType.BOOTS)));
    public static final Item DAMASCUS_STEEL_HORSE_ARMOR = registerItem("damascus_steel_horse_armor",
            setting -> new Item(setting.horseArmor(ModArmorMaterials.DAMASCUS_STEEL_ARMOR_MATERIAL).maxCount(1)));

    public static final Item PDIAMOND_HELMET = registerItem("pdiamond_helmet",
            setting -> new Item(setting.armor(ModArmorMaterials.PDIAMOND_ARMOR_MATERIAL, EquipmentType.HELMET)));
    public static final Item PDIAMOND_CHESTPLATE = registerItem("pdiamond_chestplate",
            setting -> new Item(setting.armor(ModArmorMaterials.PDIAMOND_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)));
    public static final Item PDIAMOND_LEGGINGS = registerItem("pdiamond_leggings",
            setting -> new Item(setting.armor(ModArmorMaterials.PDIAMOND_ARMOR_MATERIAL, EquipmentType.LEGGINGS)));
    public static final Item PDIAMOND_BOOTS = registerItem("pdiamond_boots",
            setting -> new Item(setting.armor(ModArmorMaterials.PDIAMOND_ARMOR_MATERIAL, EquipmentType.BOOTS)));
    public static final Item PDIAMOND_HORSE_ARMOR = registerItem("pdiamond_horse_armor",
            setting -> new Item(setting.horseArmor(ModArmorMaterials.PDIAMOND_ARMOR_MATERIAL).maxCount(1)));
    public static final Item DIAMOND_BOW = registerItem("diamond_bow",
            setting -> new ModBowItem(setting.maxDamage(256),1.0f,1.3f,1.1f));

    public static final Item PNETHERITE_HELMET = registerItem("pnetherite_helmet",
            setting -> new Item(setting.armor(ModArmorMaterials.PNETHERITE_ARMOR_MATERIAL, EquipmentType.HELMET)));
    public static final Item PNETHERITE_CHESTPLATE = registerItem("pnetherite_chestplate",
            setting -> new Item(setting.armor(ModArmorMaterials.PNETHERITE_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)));
    public static final Item PNETHERITE_LEGGINGS = registerItem("pnetherite_leggings",
            setting -> new Item(setting.armor(ModArmorMaterials.PNETHERITE_ARMOR_MATERIAL, EquipmentType.LEGGINGS)));
    public static final Item PNETHERITE_BOOTS = registerItem("pnetherite_boots",
            setting -> new Item(setting.armor(ModArmorMaterials.PNETHERITE_ARMOR_MATERIAL, EquipmentType.BOOTS)));
    public static final Item NETHERITE_HORSE_ARMOR = registerItem("netherite_horse_armor",
            setting -> new Item(setting.horseArmor(ModArmorMaterials.PNETHERITE_ARMOR_MATERIAL).maxCount(1)));
    public static final Item NETHERITE_BOW = registerItem("netherite_bow",
            setting -> new ModBowItem(setting.maxDamage(288),1.0f,1.5f,1.2f));

    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(Anomalous_Advancement.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Anomalous_Advancement.MOD_ID, name)))));
    }

    public static void registerModItems() {
        Anomalous_Advancement.LOGGER.info("Registering Mod Items for " + Anomalous_Advancement.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(FLINT_SHOVEL);
            entries.add(FLINT_PICKAXE);
            entries.add(FLINT_AXE);
            entries.add(FLINT_HOE);

            entries.add(PIGLIN_BRONZE_SHOVEL);
            entries.add(PIGLIN_BRONZE_PICKAXE);
            entries.add(PIGLIN_BRONZE_AXE);
            entries.add(PIGLIN_BRONZE_HOE);

            entries.add(DAMASCUS_STEEL_SHOVEL);
            entries.add(DAMASCUS_STEEL_PICKAXE);
            entries.add(DAMASCUS_STEEL_AXE);
            entries.add(DAMASCUS_STEEL_HOE);


        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(FLINT_SWORD);
            entries.add(FLINT_AXE);

            entries.add(PLEATHER_HELMET);
            entries.add(PLEATHER_CHESTPLATE);
            entries.add(PLEATHER_LEGGINGS);
            entries.add(PLEATHER_BOOTS);
            entries.add(PBOW);

            entries.add(PCOPPER_HELMET);
            entries.add(PCOPPER_CHESTPLATE);
            entries.add(PCOPPER_LEGGINGS);
            entries.add(PCOPPER_BOOTS);
            entries.add(COPPER_BOW);

            entries.add(PCHAIN_HELMET);
            entries.add(PCHAIN_CHESTPLATE);
            entries.add(PCHAIN_LEGGINGS);
            entries.add(PCHAIN_BOOTS);

            entries.add(PIRON_HELMET);
            entries.add(PIRON_CHESTPLATE);
            entries.add(PIRON_LEGGINGS);
            entries.add(PIRON_BOOTS);
            entries.add(IRON_BOW);

            entries.add(PGOLD_HELMET);
            entries.add(PGOLD_CHESTPLATE);
            entries.add(PGOLD_LEGGINGS);
            entries.add(PGOLD_BOOTS);
            entries.add(GOLD_BOW);

            entries.add(PIGLIN_BRONZE_SWORD);
            entries.add(PIGLIN_BRONZE_AXE);
            entries.add(PIGLIN_BRONZE_BOW);
            entries.add(PIGLIN_BRONZE_HELMET);
            entries.add(PIGLIN_BRONZE_CHESTPLATE);
            entries.add(PIGLIN_BRONZE_LEGGINGS);
            entries.add(PIGLIN_BRONZE_BOOTS);

            entries.add(DAMASCUS_STEEL_SWORD);
            entries.add(DAMASCUS_STEEL_AXE);
            entries.add(DAMASCUS_STEEL_BOW);
            entries.add(DAMASCUS_STEEL_HELMET);
            entries.add(DAMASCUS_STEEL_CHESTPLATE);
            entries.add(DAMASCUS_STEEL_LEGGINGS);
            entries.add(DAMASCUS_STEEL_BOOTS);

            entries.add(PDIAMOND_HELMET);
            entries.add(PDIAMOND_CHESTPLATE);
            entries.add(PDIAMOND_LEGGINGS);
            entries.add(PDIAMOND_BOOTS);
            entries.add(DIAMOND_BOW);

            entries.add(PNETHERITE_HELMET);
            entries.add(PNETHERITE_CHESTPLATE);
            entries.add(PNETHERITE_LEGGINGS);
            entries.add(PNETHERITE_BOOTS);
            entries.add(NETHERITE_BOW);
        });
    }
}
