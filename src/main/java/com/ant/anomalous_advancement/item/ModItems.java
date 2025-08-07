package com.ant.anomalous_advancement.item;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import com.ant.anomalous_advancement.sound.ModSounds;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
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


    public static final Item PIGLIN_BRONZE_PICKAXE = registerItem("piglin_bronze_pickaxe",
            setting -> new Item(setting.pickaxe(ModToolMaterials.FLINT, 1, -2.8f)));
    public static final Item PIGLIN_BRONZE_SWORD = registerItem("piglin_bronze_sword",
            setting -> new Item(setting.sword(ModToolMaterials.FLINT, 3, -2.4f)));
    public static final Item PIGLIN_BRONZE_AXE = registerItem("piglin_bronze_axe",
            setting -> new AxeItem(ModToolMaterials.FLINT,  6, -3.2f, setting));
    public static final Item PIGLIN_BRONZE_SHOVEL = registerItem("piglin_bronze_shovel",
            setting -> new ShovelItem(ModToolMaterials.FLINT,  1.5f, -3.8f, setting));
    public static final Item PIGLIN_BRONZE_HOE = registerItem("piglin_bronze_hoe",
            setting -> new HoeItem(ModToolMaterials.FLINT, 0, -3f, setting));
    public static final Item PIGLIN_BRONZE_BOW = registerItem("piglin_bronze_bow",
            setting -> new BowItem(setting.maxDamage(500)));

    public static final Item PIGLIN_BRONZE_INGOT = registerItem("piglin_bronze_ingot", Item::new);

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


    public static final Item CLOAKED_CHAUFFEUR_MUSIC_DISC = registerItem("cloaked_chauffeur_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.CLOAKED_CHAUFFEUR_KEY).maxCount(1)));
    public static final Item MASHED_POTATOES = registerItem("mashed_potatoes", setting -> new Item(setting.food(ModFoodComponents.MASHED_POTATOES)));

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
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(FLINT_SWORD);
            entries.add(FLINT_AXE);
            entries.add(PIGLIN_BRONZE_SWORD);
            entries.add(PIGLIN_BRONZE_AXE);
            entries.add(PIGLIN_BRONZE_BOW);


        });
    }
}
