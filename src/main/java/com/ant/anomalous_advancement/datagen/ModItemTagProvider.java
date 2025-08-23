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
                .add(ModItems.PLEATHER_HELMET)
                .add(ModItems.PLEATHER_CHESTPLATE)
                .add(ModItems.PLEATHER_LEGGINGS)
                .add(ModItems.PLEATHER_BOOTS)

                .add(ModItems.PCOPPER_HELMET)
                .add(ModItems.PCOPPER_CHESTPLATE)
                .add(ModItems.PCOPPER_LEGGINGS)
                .add(ModItems.PCOPPER_BOOTS)

                .add(ModItems.PCHAIN_HELMET)
                .add(ModItems.PCHAIN_CHESTPLATE)
                .add(ModItems.PCHAIN_LEGGINGS)
                .add(ModItems.PCHAIN_BOOTS)

                .add(ModItems.PIRON_HELMET)
                .add(ModItems.PIRON_CHESTPLATE)
                .add(ModItems.PIRON_LEGGINGS)
                .add(ModItems.PIRON_BOOTS)

                .add(ModItems.PGOLD_HELMET)
                .add(ModItems.PGOLD_CHESTPLATE)
                .add(ModItems.PGOLD_LEGGINGS)
                .add(ModItems.PGOLD_BOOTS)

                .add(ModItems.PIGLIN_BRONZE_HELMET)
                .add(ModItems.PIGLIN_BRONZE_CHESTPLATE)
                .add(ModItems.PIGLIN_BRONZE_LEGGINGS)
                .add(ModItems.PIGLIN_BRONZE_BOOTS)

                .add(ModItems.DAMASCUS_STEEL_HELMET)
                .add(ModItems.DAMASCUS_STEEL_CHESTPLATE)
                .add(ModItems.DAMASCUS_STEEL_LEGGINGS)
                .add(ModItems.DAMASCUS_STEEL_BOOTS)

                .add(ModItems.PDIAMOND_HELMET)
                .add(ModItems.PDIAMOND_CHESTPLATE)
                .add(ModItems.PDIAMOND_LEGGINGS)
                .add(ModItems.PDIAMOND_BOOTS)

                .add(ModItems.PNETHERITE_HELMET)
                .add(ModItems.PNETHERITE_CHESTPLATE)
                .add(ModItems.PNETHERITE_LEGGINGS)
                .add(ModItems.PNETHERITE_BOOTS);

        valueLookupBuilder(ItemTags.ARMOR_ENCHANTABLE)
                .add(ModItems.PLEATHER_HELMET)
                .add(ModItems.PLEATHER_CHESTPLATE)
                .add(ModItems.PLEATHER_LEGGINGS)
                .add(ModItems.PLEATHER_BOOTS)

                .add(ModItems.PCOPPER_HELMET)
                .add(ModItems.PCOPPER_CHESTPLATE)
                .add(ModItems.PCOPPER_LEGGINGS)
                .add(ModItems.PCOPPER_BOOTS)

                .add(ModItems.PCHAIN_HELMET)
                .add(ModItems.PCHAIN_CHESTPLATE)
                .add(ModItems.PCHAIN_LEGGINGS)
                .add(ModItems.PCHAIN_BOOTS)

                .add(ModItems.PIRON_HELMET)
                .add(ModItems.PIRON_CHESTPLATE)
                .add(ModItems.PIRON_LEGGINGS)
                .add(ModItems.PIRON_BOOTS)

                .add(ModItems.PGOLD_HELMET)
                .add(ModItems.PGOLD_CHESTPLATE)
                .add(ModItems.PGOLD_LEGGINGS)
                .add(ModItems.PGOLD_BOOTS)

                .add(ModItems.PIGLIN_BRONZE_HELMET)
                .add(ModItems.PIGLIN_BRONZE_CHESTPLATE)
                .add(ModItems.PIGLIN_BRONZE_LEGGINGS)
                .add(ModItems.PIGLIN_BRONZE_BOOTS)

                .add(ModItems.DAMASCUS_STEEL_HELMET)
                .add(ModItems.DAMASCUS_STEEL_CHESTPLATE)
                .add(ModItems.DAMASCUS_STEEL_LEGGINGS)
                .add(ModItems.DAMASCUS_STEEL_BOOTS)

                .add(ModItems.PDIAMOND_HELMET)
                .add(ModItems.PDIAMOND_CHESTPLATE)
                .add(ModItems.PDIAMOND_LEGGINGS)
                .add(ModItems.PDIAMOND_BOOTS)

                .add(ModItems.PNETHERITE_HELMET)
                .add(ModItems.PNETHERITE_CHESTPLATE)
                .add(ModItems.PNETHERITE_LEGGINGS)
                .add(ModItems.PNETHERITE_BOOTS);

        valueLookupBuilder(ItemTags.HEAD_ARMOR_ENCHANTABLE)
                .add(ModItems.PLEATHER_HELMET)
                .add(ModItems.PCOPPER_HELMET)
                .add(ModItems.PCHAIN_HELMET)
                .add(ModItems.PIRON_HELMET)
                .add(ModItems.PGOLD_HELMET)
                .add(ModItems.PIGLIN_BRONZE_HELMET)
                .add(ModItems.DAMASCUS_STEEL_HELMET)
                .add(ModItems.PDIAMOND_HELMET)
                .add(ModItems.PNETHERITE_HELMET);

        valueLookupBuilder(ItemTags.CHEST_ARMOR_ENCHANTABLE)
                .add(ModItems.PLEATHER_CHESTPLATE)
                .add(ModItems.PCOPPER_CHESTPLATE)
                .add(ModItems.PCHAIN_CHESTPLATE)
                .add(ModItems.PIRON_CHESTPLATE)
                .add(ModItems.PGOLD_CHESTPLATE)
                .add(ModItems.PIGLIN_BRONZE_CHESTPLATE)
                .add(ModItems.DAMASCUS_STEEL_CHESTPLATE)
                .add(ModItems.PDIAMOND_CHESTPLATE)
                .add(ModItems.PNETHERITE_CHESTPLATE);

        valueLookupBuilder(ItemTags.LEG_ARMOR_ENCHANTABLE)
                .add(ModItems.PLEATHER_LEGGINGS)
                .add(ModItems.PCOPPER_LEGGINGS)
                .add(ModItems.PCHAIN_LEGGINGS)
                .add(ModItems.PIRON_LEGGINGS)
                .add(ModItems.PGOLD_LEGGINGS)
                .add(ModItems.PIGLIN_BRONZE_LEGGINGS)
                .add(ModItems.DAMASCUS_STEEL_LEGGINGS)
                .add(ModItems.PDIAMOND_LEGGINGS)
                .add(ModItems.PNETHERITE_LEGGINGS);

        valueLookupBuilder(ItemTags.FOOT_ARMOR_ENCHANTABLE)
                .add(ModItems.PLEATHER_BOOTS)
                .add(ModItems.PCOPPER_BOOTS)
                .add(ModItems.PCHAIN_BOOTS)
                .add(ModItems.PIRON_BOOTS)
                .add(ModItems.PGOLD_BOOTS)
                .add(ModItems.PIGLIN_BRONZE_BOOTS)
                .add(ModItems.DAMASCUS_STEEL_BOOTS)
                .add(ModItems.PDIAMOND_BOOTS)
                .add(ModItems.PNETHERITE_BOOTS);


        valueLookupBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .add(ModItems.PLEATHER_HELMET)
                .add(ModItems.PLEATHER_CHESTPLATE)
                .add(ModItems.PLEATHER_LEGGINGS)
                .add(ModItems.PLEATHER_BOOTS)
                .add(ModItems.PBOW)

                .add(ModItems.PCOPPER_HELMET)
                .add(ModItems.PCOPPER_CHESTPLATE)
                .add(ModItems.PCOPPER_LEGGINGS)
                .add(ModItems.PCOPPER_BOOTS)
                .add(ModItems.COPPER_BOW)

                .add(ModItems.PCHAIN_HELMET)
                .add(ModItems.PCHAIN_CHESTPLATE)
                .add(ModItems.PCHAIN_LEGGINGS)
                .add(ModItems.PCHAIN_BOOTS)

                .add(ModItems.PIRON_HELMET)
                .add(ModItems.PIRON_CHESTPLATE)
                .add(ModItems.PIRON_LEGGINGS)
                .add(ModItems.PIRON_BOOTS)
                .add(ModItems.IRON_BOW)

                .add(ModItems.PGOLD_HELMET)
                .add(ModItems.PGOLD_CHESTPLATE)
                .add(ModItems.PGOLD_LEGGINGS)
                .add(ModItems.PGOLD_BOOTS)
                .add(ModItems.GOLD_BOW)

                .add(ModItems.PIGLIN_BRONZE_HELMET)
                .add(ModItems.PIGLIN_BRONZE_CHESTPLATE)
                .add(ModItems.PIGLIN_BRONZE_LEGGINGS)
                .add(ModItems.PIGLIN_BRONZE_BOOTS)
                .add(ModItems.PIGLIN_BRONZE_BOW)

                .add(ModItems.DAMASCUS_STEEL_HELMET)
                .add(ModItems.DAMASCUS_STEEL_CHESTPLATE)
                .add(ModItems.DAMASCUS_STEEL_LEGGINGS)
                .add(ModItems.DAMASCUS_STEEL_BOOTS)
                .add(ModItems.DAMASCUS_STEEL_BOW)

                .add(ModItems.PDIAMOND_HELMET)
                .add(ModItems.PDIAMOND_CHESTPLATE)
                .add(ModItems.PDIAMOND_LEGGINGS)
                .add(ModItems.PDIAMOND_BOOTS)
                .add(ModItems.DIAMOND_BOW)

                .add(ModItems.PNETHERITE_HELMET)
                .add(ModItems.PNETHERITE_CHESTPLATE)
                .add(ModItems.PNETHERITE_LEGGINGS)
                .add(ModItems.PNETHERITE_BOOTS)
                .add(ModItems.NETHERITE_BOW);

        valueLookupBuilder(ItemTags.BOW_ENCHANTABLE)
                .add(ModItems.PIGLIN_BRONZE_BOW)
                .add(ModItems.DAMASCUS_STEEL_BOW)
                .add(ModItems.COPPER_BOW)
                .add(ModItems.PBOW)
                .add(ModItems.IRON_BOW)
                .add(ModItems.GOLD_BOW)
                .add(ModItems.DIAMOND_BOW)
                .add(ModItems.NETHERITE_BOW);


        valueLookupBuilder(ModTags.Items.FLINT_REPAIR)
                .add(Items.FLINT);

        valueLookupBuilder(ModTags.Items.MODDED_STONE_TOOL_MATERIALS_REPAIR)
                .add(Items.POLISHED_ANDESITE)
                .add(Items.POLISHED_DIORITE)
                .add(Items.POLISHED_GRANITE);

        valueLookupBuilder(ModTags.Items.PLEATHER_REPAIR)
                .add(Items.LEATHER);

        valueLookupBuilder(ModTags.Items.PCOPPER_REPAIR)
                .add(Items.COPPER_INGOT);

        valueLookupBuilder(ModTags.Items.PCHAIN_REPAIR)
                .add(Items.IRON_NUGGET)
                .add(Items.CHAIN);

        valueLookupBuilder(ModTags.Items.PIRON_REPAIR)
                .add(Items.IRON_INGOT);

        valueLookupBuilder(ModTags.Items.PGOLD_REPAIR)
                .add(Items.GOLD_INGOT);

        valueLookupBuilder(ModTags.Items.PIGLIN_BRONZE_INGOT_REPAIR)
                .add(ModItems.PIGLIN_BRONZE_INGOT);

        valueLookupBuilder(ModTags.Items.DAMASCUS_STEEL_INGOT_REPAIR)
                .add(ModItems.DAMASCUS_STEEL_INGOT);

        valueLookupBuilder(ModTags.Items.PDIAMOND_REPAIR)
                .add(Items.DIAMOND);

        valueLookupBuilder(ModTags.Items.PNETHERITE_REPAIR)
                .add(Items.NETHERITE_INGOT);

        valueLookupBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.PIGLIN_BRONZE_INGOT)
                .add(ModItems.DAMASCUS_STEEL_INGOT);
    }
}
