package com.ant.anomalous_advancement.item;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item FLINT_PICKAXE = registerItem("flint_pickaxe", new Item(new Item.Settings()));
    public static final Item FLINT_SWORD = registerItem("flint_sword", new Item(new Item.Settings()));
    public static final Item FLINT_AXE = registerItem("flint_axe", new Item(new Item.Settings()));
    public static final Item FLINT_HOE = registerItem("flint_hoe", new Item(new Item.Settings()));
    public static final Item FLINT_SHOVEL = registerItem("flint_shovel", new Item(new Item.Settings()));

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
