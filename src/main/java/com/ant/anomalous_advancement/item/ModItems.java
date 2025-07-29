package com.ant.anomalous_advancement.item;

import com.ant.anomalous_advancement.Anomalous_Advancement;
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


    public static final Item MASHED_POTATOES = registerItem("mashed_potatoes", new Item(new Item.Settings().food(ModFoodComponents.MASHED_POTATOES)));

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
