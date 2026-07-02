package com.ant.anomalous_advancement.item;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import com.ant.anomalous_advancement.item.custom.ModBowItem;
import com.ant.anomalous_advancement.trim.ModTrimMaterials;

import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;

import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.equipment.ArmorType;
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
         settings -> new ModBowItem(
                 settings.durability(32),
                 1.0f,   // draw speed
                 0.6f,   // velocity
                 0.5f,   // damage
                 5      // range
         )
 );
    public static final Item PLEATHER_HELMET = registerItem("pleather_helmet",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PLEATHER_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item PLEATHER_CHESTPLATE = registerItem("pleather_chestplate",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PLEATHER_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item PLEATHER_LEGGINGS = registerItem("pleather_leggings",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PLEATHER_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item PLEATHER_BOOTS = registerItem("pleather_boots",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PLEATHER_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static final Item PCOPPER_HELMET = registerItem("pcopper_helmet",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PCOPPER_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item PCOPPER_CHESTPLATE = registerItem("pcopper_chestplate",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PCOPPER_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item PCOPPER_LEGGINGS = registerItem("pcopper_leggings",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PCOPPER_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item PCOPPER_BOOTS = registerItem("pcopper_boots",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PCOPPER_ARMOR_MATERIAL, ArmorType.BOOTS)));

 public static final Item COPPER_BOW = registerItem("copper_bow",
         settings -> new ModBowItem(
                 settings.durability(64),
                 1.0f,   // draw speed
                 0.7f,   // velocity
                 0.6f,   // damage
                 10      // range
         )
 );
    public static final Item PCHAIN_HELMET = registerItem("pchain_helmet",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PCHAIN_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item PCHAIN_CHESTPLATE = registerItem("pchain_chestplate",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PCHAIN_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item PCHAIN_LEGGINGS = registerItem("pchain_leggings",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PCHAIN_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item PCHAIN_BOOTS = registerItem("pchain_boots",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PCHAIN_ARMOR_MATERIAL, ArmorType.BOOTS)));
    public static final Item PCHAIN_HORSE_ARMOR = registerItem("pchain_horse_armor",
            setting -> new Item(setting.horseArmor(ModArmorMaterials.PCHAIN_ARMOR_MATERIAL).stacksTo(1)));

    public static final Item PIRON_HELMET = registerItem("piron_helmet",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PIRON_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item PIRON_CHESTPLATE = registerItem("piron_chestplate",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PIRON_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item PIRON_LEGGINGS = registerItem("piron_leggings",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PIRON_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item PIRON_BOOTS = registerItem("piron_boots",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PIRON_ARMOR_MATERIAL, ArmorType.BOOTS)));

 public static final Item IRON_BOW = registerItem("iron_bow",
         settings -> new ModBowItem(
                 settings.durability(128),
                 1.0f,   // draw speed
                 0.8f,   // velocity
                 0.7f,   // damage
                 15      // range
         )
 );

    public static final Item PGOLD_HELMET = registerItem("pgold_helmet",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PGOLD_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item PGOLD_CHESTPLATE = registerItem("pgold_chestplate",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PGOLD_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item PGOLD_LEGGINGS = registerItem("pgold_leggings",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PGOLD_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item PGOLD_BOOTS = registerItem("pgold_boots",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PGOLD_ARMOR_MATERIAL, ArmorType.BOOTS)));

 public static final Item GOLD_BOW = registerItem("gold_bow",
         settings -> new ModBowItem(
                 settings.durability(160),
                 1.0f,   // draw speed
                 0.9f,   // velocity
                 0.8f,   // damage
                 20      // range
         )
 );
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
         settings -> new ModBowItem(
                 settings.durability(192),
                 1.0f,   // draw speed
                 1.0f,   // velocity
                 0.9f,   // damage
                 25      // range
         )
 );
    public static final Item PIGLIN_BRONZE_INGOT = registerItem("piglin_bronze_ingot", settings ->
            new Item(settings.component(
                    DataComponents.PROVIDES_TRIM_MATERIAL,
                    ModTrimMaterials.PIGLIN_BRONZE_INGOT
            )
    ));

    public static final Item PIGLIN_BRONZE_HELMET = registerItem("piglin_bronze_helmet",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PIGLIN_BRONZE_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item PIGLIN_BRONZE_CHESTPLATE = registerItem("piglin_bronze_chestplate",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PIGLIN_BRONZE_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item PIGLIN_BRONZE_LEGGINGS = registerItem("piglin_bronze_leggings",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PIGLIN_BRONZE_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item PIGLIN_BRONZE_BOOTS = registerItem("piglin_bronze_boots",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PIGLIN_BRONZE_ARMOR_MATERIAL, ArmorType.BOOTS)));
    public static final Item PIGLIN_BRONZE_HORSE_ARMOR = registerItem("piglin_bronze_horse_armor",
            setting -> new Item(setting.horseArmor(ModArmorMaterials.PIGLIN_BRONZE_ARMOR_MATERIAL).stacksTo(1)));

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
         settings -> new ModBowItem(
                 settings.durability(224),
                 1.1f,   // draw speed
                 1.1f,   // velocity
                 1.0f,   // damage
                 30      // range
         )
 );
    public static final Item DAMASCUS_STEEL_INGOT = registerItem("damascus_steel_ingot", settings ->
            new Item(settings.component(
                    DataComponents.PROVIDES_TRIM_MATERIAL,
                    ModTrimMaterials.DAMASCUS_STEEL_INGOT
            )
            ));



    public static final Item DAMASCUS_STEEL_HELMET = registerItem("damascus_steel_helmet",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.DAMASCUS_STEEL_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item DAMASCUS_STEEL_CHESTPLATE = registerItem("damascus_steel_chestplate",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.DAMASCUS_STEEL_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item DAMASCUS_STEEL_LEGGINGS = registerItem("damascus_steel_leggings",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.DAMASCUS_STEEL_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item DAMASCUS_STEEL_BOOTS = registerItem("damascus_steel_boots",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.DAMASCUS_STEEL_ARMOR_MATERIAL, ArmorType.BOOTS)));
    public static final Item DAMASCUS_STEEL_HORSE_ARMOR = registerItem("damascus_steel_horse_armor",
            setting -> new Item(setting.horseArmor(ModArmorMaterials.DAMASCUS_STEEL_ARMOR_MATERIAL).stacksTo(1)));

    public static final Item PDIAMOND_HELMET = registerItem("pdiamond_helmet",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PDIAMOND_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item PDIAMOND_CHESTPLATE = registerItem("pdiamond_chestplate",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PDIAMOND_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item PDIAMOND_LEGGINGS = registerItem("pdiamond_leggings",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PDIAMOND_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item PDIAMOND_BOOTS = registerItem("pdiamond_boots",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PDIAMOND_ARMOR_MATERIAL, ArmorType.BOOTS)));

 public static final Item DIAMOND_BOW = registerItem("diamond_bow",
         settings -> new ModBowItem(
                 settings.durability(256),
                 1.2f,   // draw speed
                 1.3f,   // velocity
                 1.1f,   // damage
                 35     // range
         )
 );
    public static final Item PNETHERITE_HELMET = registerItem("pnetherite_helmet",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PNETHERITE_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item PNETHERITE_CHESTPLATE = registerItem("pnetherite_chestplate",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PNETHERITE_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item PNETHERITE_LEGGINGS = registerItem("pnetherite_leggings",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PNETHERITE_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item PNETHERITE_BOOTS = registerItem("pnetherite_boots",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.PNETHERITE_ARMOR_MATERIAL, ArmorType.BOOTS)));
    public static final Item NETHERITE_HORSE_ARMOR = registerItem("netherite_horse_armor",
            setting -> new Item(setting.horseArmor(ModArmorMaterials.PNETHERITE_ARMOR_MATERIAL).stacksTo(1)));

 public static final Item NETHERITE_BOW = registerItem("netherite_bow",
         settings -> new ModBowItem(
                 settings.durability(288),
                 1.3f,   // draw speed
                 1.4f,   // velocity
                 1.2f,   // damage
                 40     // range
         )
 );
    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(
                BuiltInRegistries.ITEM,
                Identifier.fromNamespaceAndPath(Anomalous_Advancement.MOD_ID, name),
                function.apply(
                        new Item.Properties()
                                .setId(ResourceKey.create(
                                        Registries.ITEM,
                                        Identifier.fromNamespaceAndPath(Anomalous_Advancement.MOD_ID, name)
                                ))
                )
        );
    }

    public static void registerModItems() {
        Anomalous_Advancement.LOGGER.info(
                "Registering Mod Items for " + Anomalous_Advancement.MOD_ID
        );
    }

}
