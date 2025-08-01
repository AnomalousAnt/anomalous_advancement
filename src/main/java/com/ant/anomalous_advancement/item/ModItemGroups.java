package com.ant.anomalous_advancement.item;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import com.ant.anomalous_advancement.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup ANOMALOUS_ADVANCEMENT_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Anomalous_Advancement.MOD_ID, "anomalous_advancement_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.FLINT_PICKAXE))
                    .displayName(Text.translatable("itemgroup.anomalous_advancement.anomalous_advancement_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.FLINT_SHOVEL);
                        entries.add(ModItems.FLINT_PICKAXE);
                        entries.add(ModItems.FLINT_AXE);
                        entries.add(ModItems.FLINT_HOE);
                        entries.add(ModItems.FLINT_SWORD);
                        entries.add(ModBlocks.ALTAR);
                        entries.add(ModBlocks.GILDED_ALTAR);
                        entries.add(ModItems.PIGLIN_BRONZE_INGOT);
                        entries.add(ModItems.PIGLIN_BRONZE_HELMET);
                        entries.add(ModItems.PIGLIN_BRONZE_CHESTPLATE);
                        entries.add(ModItems.PIGLIN_BRONZE_LEGGINGS);
                        entries.add(ModItems.PIGLIN_BRONZE_BOOTS);
                        entries.add(ModItems.PIGLIN_BRONZE_HORSE_ARMOR);
                        entries.add(ModItems.PIGLIN_BRONZE_BOW);
                        entries.add(ModItems.MASHED_POTATOES);
                        entries.add(ModItems.CLOAKED_CHAUFFEUR_MUSIC_DISC);
                    }).build());

    public static void registerItemGroups(){
        Anomalous_Advancement.LOGGER.info("Registering Item Groups for " + Anomalous_Advancement.MOD_ID);
    }
}
