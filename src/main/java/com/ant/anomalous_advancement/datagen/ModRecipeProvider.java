package com.ant.anomalous_advancement.datagen;

import com.ant.anomalous_advancement.block.ModBlocks;
import com.ant.anomalous_advancement.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);

    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                createShaped(RecipeCategory.TOOLS, ModItems.FLINT_PICKAXE)
                        .pattern("###")
                        .pattern("ZX ")
                        .pattern(" X ")
                        .input('X', Items.STICK)
                        .input('#', Items.FLINT)
                        .input('Z', Items.STRING)
                        .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.FLINT_AXE)
                        .pattern("##")
                        .pattern("#X")
                        .pattern("ZX")
                        .input('X', Items.STICK)
                        .input('#', Items.FLINT)
                        .input('Z', Items.STRING)
                        .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.FLINT_HOE)
                        .pattern("##")
                        .pattern("ZX")
                        .pattern(" X")
                        .input('X', Items.STICK)
                        .input('#', Items.FLINT)
                        .input('Z', Items.STRING)
                        .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.FLINT_SHOVEL)
                        .pattern(" #")
                        .pattern(" X")
                        .pattern("ZX")
                        .input('X', Items.STICK)
                        .input('#', Items.FLINT)
                        .input('Z', Items.STRING)
                        .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.FLINT_SWORD)
                        .pattern(" #")
                        .pattern(" #")
                        .pattern("ZX")
                        .input('X', Items.STICK)
                        .input('#', Items.FLINT)
                        .input('Z', Items.STRING)
                        .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.PCHAIN_HELMET)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("#Z#")
                        .input('#', Items.CHAIN)
                        .input('Z', ModItems.PLEATHER_HELMET)
                        .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.PCHAIN_CHESTPLATE)
                        .pattern("#Z#")
                        .pattern("###")
                        .pattern("###")
                        .input('#', Items.CHAIN)
                        .input('Z', ModItems.PLEATHER_CHESTPLATE)
                        .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.PCHAIN_LEGGINGS)
                        .pattern("###")
                        .pattern("#Z#")
                        .pattern("# #")
                        .input('#', Items.CHAIN)
                        .input('Z', ModItems.PLEATHER_LEGGINGS)
                        .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.PCHAIN_BOOTS)
                        .pattern("   ")
                        .pattern("#Z#")
                        .pattern("# #")
                        .input('#', Items.CHAIN)
                        .input('Z', ModItems.PLEATHER_BOOTS)
                        .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModItems.PIGLIN_BRONZE_INGOT, 9)
                        .input(ModBlocks.BLOCK_OF_PIGLIN_BRONZE)
                        .criterion(hasItem(ModItems.PIGLIN_BRONZE_INGOT), conditionsFromItem(ModItems.PIGLIN_BRONZE_INGOT))
                        .offerTo(exporter,"piglin_bronze_ingot_from_block");

                createShaped(RecipeCategory.MISC, ModItems.PIGLIN_BRONZE_INGOT)
                        .pattern("XXX")
                        .pattern("XZZ")
                        .pattern("ZZZ")
                        .input('X', Items.COPPER_INGOT)
                        .input('Z', Items.GOLD_INGOT)
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.BLOCK_OF_PIGLIN_BRONZE)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('X', ModItems.PIGLIN_BRONZE_INGOT)
                        .criterion(hasItem(ModItems.PIGLIN_BRONZE_INGOT), conditionsFromItem(ModItems.PIGLIN_BRONZE_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.PIGLIN_BRONZE_PICKAXE)
                        .pattern("###")
                        .pattern("ZX ")
                        .pattern(" X ")
                        .input('X', Items.BREEZE_ROD)
                        .input('#', ModItems.PIGLIN_BRONZE_INGOT)
                        .input('Z', Items.LEATHER)
                        .criterion(hasItem(ModItems.PIGLIN_BRONZE_INGOT), conditionsFromItem(ModItems.PIGLIN_BRONZE_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.PIGLIN_BRONZE_AXE)
                        .pattern("##")
                        .pattern("#X")
                        .pattern("ZX")
                        .input('X', Items.BREEZE_ROD)
                        .input('#', ModItems.PIGLIN_BRONZE_INGOT)
                        .input('Z', Items.LEATHER)
                        .criterion(hasItem(ModItems.PIGLIN_BRONZE_INGOT), conditionsFromItem(ModItems.PIGLIN_BRONZE_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.PIGLIN_BRONZE_HOE)
                        .pattern("##")
                        .pattern("ZX")
                        .pattern(" X")
                        .input('X', Items.BREEZE_ROD)
                        .input('#', ModItems.PIGLIN_BRONZE_INGOT)
                        .input('Z', Items.LEATHER)
                        .criterion(hasItem(ModItems.PIGLIN_BRONZE_INGOT), conditionsFromItem(ModItems.PIGLIN_BRONZE_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.PIGLIN_BRONZE_SHOVEL)
                        .pattern(" #")
                        .pattern(" X")
                        .pattern("ZX")
                        .input('X', Items.BREEZE_ROD)
                        .input('#', ModItems.PIGLIN_BRONZE_INGOT)
                        .input('Z', Items.LEATHER)
                        .criterion(hasItem(ModItems.PIGLIN_BRONZE_INGOT), conditionsFromItem(ModItems.PIGLIN_BRONZE_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.PIGLIN_BRONZE_SWORD)
                        .pattern(" #")
                        .pattern(" #")
                        .pattern("ZX")
                        .input('X', Items.BREEZE_ROD)
                        .input('#', ModItems.PIGLIN_BRONZE_INGOT)
                        .input('Z', Items.LEATHER)
                        .criterion(hasItem(ModItems.PIGLIN_BRONZE_INGOT), conditionsFromItem(ModItems.PIGLIN_BRONZE_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.PIGLIN_BRONZE_BOW)
                        .pattern("#XZ")
                        .pattern("X#Z")
                        .pattern("#XZ")
                        .input('X', Items.BREEZE_ROD)
                        .input('#', ModItems.PIGLIN_BRONZE_INGOT)
                        .input('Z', Items.LEATHER)
                        .criterion(hasItem(ModItems.PIGLIN_BRONZE_INGOT), conditionsFromItem(ModItems.PIGLIN_BRONZE_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.PIGLIN_BRONZE_HELMET)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("#Z#")
                        .input('#', ModItems.PIGLIN_BRONZE_INGOT)
                        .input('Z', ModItems.PLEATHER_HELMET)
                        .criterion(hasItem(ModItems.PIGLIN_BRONZE_INGOT), conditionsFromItem(ModItems.PIGLIN_BRONZE_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.PIGLIN_BRONZE_CHESTPLATE)
                        .pattern("#Z#")
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModItems.PIGLIN_BRONZE_INGOT)
                        .input('Z', ModItems.PLEATHER_CHESTPLATE)
                        .criterion(hasItem(ModItems.PIGLIN_BRONZE_INGOT), conditionsFromItem(ModItems.PIGLIN_BRONZE_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.PIGLIN_BRONZE_LEGGINGS)
                        .pattern("###")
                        .pattern("#Z#")
                        .pattern("# #")
                        .input('#', ModItems.PIGLIN_BRONZE_INGOT)
                        .input('Z', ModItems.PLEATHER_LEGGINGS)
                        .criterion(hasItem(ModItems.PIGLIN_BRONZE_INGOT), conditionsFromItem(ModItems.PIGLIN_BRONZE_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.PIGLIN_BRONZE_BOOTS)
                        .pattern("   ")
                        .pattern("#Z#")
                        .pattern("# #")
                        .input('#', ModItems.PIGLIN_BRONZE_INGOT)
                        .input('Z', ModItems.PLEATHER_BOOTS)
                        .criterion(hasItem(ModItems.PIGLIN_BRONZE_INGOT), conditionsFromItem(ModItems.PIGLIN_BRONZE_INGOT))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModItems.DAMASCUS_STEEL_INGOT, 9)
                        .input(ModBlocks.BLOCK_OF_DAMASCUS_STEEL)
                        .criterion(hasItem(ModItems.DAMASCUS_STEEL_INGOT), conditionsFromItem(ModItems.DAMASCUS_STEEL_INGOT))
                        .offerTo(exporter, "damascus_steel_ingot_from_block");

                createShaped(RecipeCategory.MISC, ModItems.DAMASCUS_STEEL_INGOT)
                        .pattern("XXX")
                        .pattern("XZZ")
                        .pattern("ZZZ")
                        .input('X', Items.POLISHED_TUFF)
                        .input('Z', Items.DEEPSLATE_IRON_ORE)
                        .criterion(hasItem(Items.TUFF), conditionsFromItem(Items.TUFF))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.BLOCK_OF_DAMASCUS_STEEL)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('X', ModItems.DAMASCUS_STEEL_INGOT)
                        .criterion(hasItem(ModItems.DAMASCUS_STEEL_INGOT), conditionsFromItem(ModItems.DAMASCUS_STEEL_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.DAMASCUS_STEEL_PICKAXE)
                        .pattern("###")
                        .pattern(" XY")
                        .pattern("ZXY")
                        .input('X', Items.BREEZE_ROD)
                        .input('Y', Items.BLAZE_ROD)
                        .input('#', ModItems.DAMASCUS_STEEL_INGOT)
                        .input('Z', Items.RESIN_BRICK)
                        .criterion(hasItem(ModItems.DAMASCUS_STEEL_INGOT), conditionsFromItem(ModItems.DAMASCUS_STEEL_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.DAMASCUS_STEEL_AXE)
                        .pattern("## ")
                        .pattern("#XY")
                        .pattern("ZXY")
                        .input('X', Items.BREEZE_ROD)
                        .input('Y', Items.BLAZE_ROD)
                        .input('#', ModItems.DAMASCUS_STEEL_INGOT)
                        .input('Z', Items.RESIN_BRICK)
                        .criterion(hasItem(ModItems.DAMASCUS_STEEL_INGOT), conditionsFromItem(ModItems.DAMASCUS_STEEL_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.DAMASCUS_STEEL_HOE)
                        .pattern("## ")
                        .pattern(" XY")
                        .pattern("ZXY")
                        .input('X', Items.BREEZE_ROD)
                        .input('Y', Items.BLAZE_ROD)
                        .input('#', ModItems.DAMASCUS_STEEL_INGOT)
                        .input('Z', Items.RESIN_BRICK)
                        .criterion(hasItem(ModItems.DAMASCUS_STEEL_INGOT), conditionsFromItem(ModItems.DAMASCUS_STEEL_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.DAMASCUS_STEEL_SHOVEL)
                        .pattern(" # ")
                        .pattern(" XY")
                        .pattern("ZXY")
                        .input('X', Items.BREEZE_ROD)
                        .input('Y', Items.BLAZE_ROD)
                        .input('#', ModItems.DAMASCUS_STEEL_INGOT)
                        .input('Z', Items.RESIN_BRICK)
                        .criterion(hasItem(ModItems.DAMASCUS_STEEL_INGOT), conditionsFromItem(ModItems.DAMASCUS_STEEL_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.DAMASCUS_STEEL_SWORD)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern("ZXY")
                        .input('X', Items.BREEZE_ROD)
                        .input('Y', Items.BLAZE_ROD)
                        .input('#', ModItems.DAMASCUS_STEEL_INGOT)
                        .input('Z', Items.RESIN_BRICK)
                        .criterion(hasItem(ModItems.DAMASCUS_STEEL_INGOT), conditionsFromItem(ModItems.DAMASCUS_STEEL_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.DAMASCUS_STEEL_BOW)
                        .pattern("#XZ")
                        .pattern("Y#Z")
                        .pattern("#XZ")
                        .input('X', Items.BREEZE_ROD)
                        .input('Y', Items.BLAZE_ROD)
                        .input('#', ModItems.DAMASCUS_STEEL_INGOT)
                        .input('Z', Items.RESIN_BRICK)
                        .criterion(hasItem(ModItems.DAMASCUS_STEEL_INGOT), conditionsFromItem(ModItems.DAMASCUS_STEEL_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.DAMASCUS_STEEL_HELMET)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("#Z#")
                        .input('#', ModItems.DAMASCUS_STEEL_INGOT)
                        .input('Z', ModItems.PLEATHER_CHESTPLATE)
                        .criterion(hasItem(ModItems.DAMASCUS_STEEL_INGOT), conditionsFromItem(ModItems.DAMASCUS_STEEL_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.DAMASCUS_STEEL_CHESTPLATE)
                        .pattern("#Z#")
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModItems.DAMASCUS_STEEL_INGOT)
                        .input('Z', ModItems.PLEATHER_CHESTPLATE)
                        .criterion(hasItem(ModItems.DAMASCUS_STEEL_INGOT), conditionsFromItem(ModItems.DAMASCUS_STEEL_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.DAMASCUS_STEEL_LEGGINGS)
                        .pattern("###")
                        .pattern("#Z#")
                        .pattern("# #")
                        .input('#', ModItems.DAMASCUS_STEEL_INGOT)
                        .input('Z', ModItems.PLEATHER_LEGGINGS)
                        .criterion(hasItem(ModItems.DAMASCUS_STEEL_INGOT), conditionsFromItem(ModItems.DAMASCUS_STEEL_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.DAMASCUS_STEEL_BOOTS)
                        .pattern("   ")
                        .pattern("#Z#")
                        .pattern("# #")
                        .input('#', ModItems.DAMASCUS_STEEL_INGOT)
                        .input('Z', ModItems.PLEATHER_BOOTS)
                        .criterion(hasItem(ModItems.DAMASCUS_STEEL_INGOT), conditionsFromItem(ModItems.DAMASCUS_STEEL_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.ALTAR)
                        .pattern("###")
                        .pattern("YXY")
                        .pattern("YXY")
                        .input('X', Items.COBBLESTONE)
                        .input('#', Items.SMOOTH_STONE)
                        .input('Y', Items.COAL)
                        .criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.GILDED_ALTAR)
                        .pattern("XXX")
                        .pattern("Z#Z")
                        .pattern("YYY")
                        .input('X', Items.GOLD_INGOT)
                        .input('#', ModBlocks.ALTAR)
                        .input('Y', Items.IRON_INGOT)
                        .input('Z', Items. COPPER_INGOT)
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.RESPLENDENT_ALTAR)
                        .pattern("XXX")
                        .pattern("Z#Z")
                        .pattern("YYY")
                        .input('X', Items.GOLD_INGOT)
                        .input('#', ModBlocks.GILDED_ALTAR)
                        .input('Y', Items.IRON_INGOT)
                        .input('Z', Items. DIAMOND_BLOCK)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "Anomalous_Advancement Recipes";
    }
}
