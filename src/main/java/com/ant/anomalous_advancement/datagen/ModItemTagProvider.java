package com.ant.anomalous_advancement.datagen;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import com.ant.anomalous_advancement.item.ModItems;
import com.ant.anomalous_advancement.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        valueLookupBuilder(ItemTags.SWORDS)
                .add(ModItems.FLINT_SWORD)
                .add(ModItems.PIGLIN_BRONZE_SWORD)
                .add(ModItems.DAMASCUS_STEEL_SWORD);
        valueLookupBuilder(ItemTags.PICKAXES)
                .add(ModItems.FLINT_PICKAXE)
                .add(ModItems.PIGLIN_BRONZE_PICKAXE)
                .add(ModItems.DAMASCUS_STEEL_PICKAXE);
        valueLookupBuilder(ItemTags.AXES)
                .add(ModItems.FLINT_AXE)
                .add(ModItems.PIGLIN_BRONZE_AXE)
                .add(ModItems.DAMASCUS_STEEL_AXE);
        valueLookupBuilder(ItemTags.SHOVELS)
                .add(ModItems.FLINT_SHOVEL)
                .add(ModItems.PIGLIN_BRONZE_SHOVEL)
                .add(ModItems.DAMASCUS_STEEL_SHOVEL);
        valueLookupBuilder(ItemTags.HOES)
                .add(ModItems.FLINT_HOE)
                .add(ModItems.PIGLIN_BRONZE_HOE)
                .add(ModItems.DAMASCUS_STEEL_HOE);

        valueLookupBuilder(TagKey.of(RegistryKeys.ITEM, Identifier.of(Anomalous_Advancement.MOD_ID, "modded_stone_tool_materials")))
                .add(Items.POLISHED_ANDESITE)
                .add(Items.POLISHED_DIORITE)
                .add(Items.POLISHED_GRANITE);

        valueLookupBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.PIGLIN_BRONZE_HELMET)
                .add(ModItems.PIGLIN_BRONZE_CHESTPLATE)
                .add(ModItems.PIGLIN_BRONZE_LEGGINGS)
                .add(ModItems.PIGLIN_BRONZE_BOOTS)
                .add(ModItems.DAMASCUS_STEEL_HELMET)
                .add(ModItems.DAMASCUS_STEEL_CHESTPLATE)
                .add(ModItems.DAMASCUS_STEEL_LEGGINGS)
                .add(ModItems.DAMASCUS_STEEL_BOOTS);


        valueLookupBuilder(ModTags.Items.FLINT_REPAIR)
                .add(Items.FLINT);

        valueLookupBuilder(ModTags.Items.MODDED_STONE_TOOL_MATERIALS_REPAIR)
                .add(Items.POLISHED_ANDESITE)
                .add(Items.POLISHED_DIORITE)
                .add(Items.POLISHED_GRANITE);

        valueLookupBuilder(ModTags.Items.PIGLIN_BRONZE_INGOT_REPAIR)
                .add(ModItems.PIGLIN_BRONZE_INGOT);

        valueLookupBuilder(ModTags.Items.DAMASCUS_STEEL_INGOT_REPAIR)
                .add(ModItems.DAMASCUS_STEEL_INGOT);

        valueLookupBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.PIGLIN_BRONZE_INGOT)
                .add(ModItems.DAMASCUS_STEEL_INGOT);
    }
}
