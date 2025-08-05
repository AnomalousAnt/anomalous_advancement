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

        getOrCreateTagBuilder(ModTags.Items.PIGLIN_BRONZE_INGOT_REPAIR)
                .add(ModItems.PIGLIN_BRONZE_INGOT);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.FLINT_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.FLINT_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.FLINT_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.FLINT_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.FLINT_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.PIGLIN_BRONZE_HELMET)
                .add(ModItems.PIGLIN_BRONZE_CHESTPLATE)
                .add(ModItems.PIGLIN_BRONZE_LEGGINGS)
                .add(ModItems.PIGLIN_BRONZE_BOOTS);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, Identifier.of(Anomalous_Advancement.MOD_ID, "modded_stone_tool_materials")))
                .add(Items.POLISHED_ANDESITE)
                .add(Items.POLISHED_DIORITE)
                .add(Items.POLISHED_GRANITE)
                .add(Items.POLISHED_TUFF)
                .add(Items.POLISHED_BASALT)
                .add(Items.POLISHED_BLACKSTONE);

        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.PIGLIN_BRONZE_INGOT);
    }
}
