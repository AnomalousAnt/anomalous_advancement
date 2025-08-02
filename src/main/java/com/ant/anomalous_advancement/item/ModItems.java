package com.ant.anomalous_advancement.item;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import com.ant.anomalous_advancement.sound.ModSounds;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

   public static final Item FLINT_PICKAXE = registerItem("flint_pickaxe", new PickaxeItem(ModToolMaterials.FLINT, new Item.Settings()
            .attributeModifiers((PickaxeItem.createAttributeModifiers(ModToolMaterials.FLINT, 1, -2.8f)))));
    public static final Item FLINT_SWORD = registerItem("flint_sword", new SwordItem(ModToolMaterials.FLINT, new Item.Settings()
            .attributeModifiers((SwordItem.createAttributeModifiers(ModToolMaterials.FLINT, 3, -2.4f)))));
    public static final Item FLINT_AXE = registerItem("flint_axe", new AxeItem(ModToolMaterials.FLINT, new Item.Settings()
            .attributeModifiers((AxeItem.createAttributeModifiers(ModToolMaterials.FLINT, 6, -3.2f)))));
    public static final Item FLINT_SHOVEL = registerItem("flint_shovel", new ShovelItem(ModToolMaterials.FLINT, new Item.Settings()
            .attributeModifiers((ShovelItem.createAttributeModifiers(ModToolMaterials.FLINT, 1.5f, -3.8f)))));
    public static final Item FLINT_HOE = registerItem("flint_hoe", new HoeItem(ModToolMaterials.FLINT, new Item.Settings()
            .attributeModifiers((HoeItem.createAttributeModifiers(ModToolMaterials.FLINT, 0, -3f)))));

public static final Item CLOAKED_CHAUFFEUR_MUSIC_DISC = registerItem("cloaked_chauffeur_music_disc",
        new Item(new Item.Settings().jukeboxPlayable(ModSounds.CLOAKED_CHAUFFEUR_KEY).maxCount(1)));

    public static final Item MASHED_POTATOES = registerItem("mashed_potatoes", new Item(new Item.Settings().food(ModFoodComponents.MASHED_POTATOES)));

    public static final Item PIGLIN_BRONZE_INGOT = registerItem("piglin_bronze_ingot", new Item(new Item.Settings()));
    public static final Item PIGLIN_BRONZE_HELMET = registerItem("piglin_bronze_helmet",
            new ArmorItem(ModArmorMaterials.PIGLIN_BRONZE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item PIGLIN_BRONZE_CHESTPLATE = registerItem("piglin_bronze_chestplate",
            new ArmorItem(ModArmorMaterials.PIGLIN_BRONZE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item PIGLIN_BRONZE_LEGGINGS = registerItem("piglin_bronze_leggings",
            new ArmorItem(ModArmorMaterials.PIGLIN_BRONZE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item PIGLIN_BRONZE_BOOTS = registerItem("piglin_bronze_boots",
            new ArmorItem(ModArmorMaterials.PIGLIN_BRONZE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item PIGLIN_BRONZE_BOW = registerItem("piglin_bronze_bow",
            new BowItem(new Item.Settings().maxDamage(500)));

    public static final Item PIGLIN_BRONZE_HORSE_ARMOR = registerItem("piglin_bronze_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.PIGLIN_BRONZE_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Anomalous_Advancement.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Anomalous_Advancement.LOGGER.info("Registering Mod Items for " + Anomalous_Advancement.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(FLINT_SHOVEL);
            entries.add(FLINT_PICKAXE);
            entries.add(FLINT_AXE);
            entries.add(FLINT_HOE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(FLINT_SWORD);
            entries.add(FLINT_AXE);
        });
    }
}
