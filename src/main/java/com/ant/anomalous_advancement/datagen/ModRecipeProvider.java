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

                createShaped(RecipeCategory.TOOLS, ModItems.PIGLIN_BRONZE_HELMET)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("#Z#")
                        .input('#', ModItems.PIGLIN_BRONZE_INGOT)
                        .input('Z', Items.LEATHER)
                        .criterion(hasItem(ModItems.PIGLIN_BRONZE_INGOT), conditionsFromItem(ModItems.PIGLIN_BRONZE_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.PIGLIN_BRONZE_CHESTPLATE)
                        .pattern("#Z#")
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModItems.PIGLIN_BRONZE_INGOT)
                        .input('Z', Items.LEATHER)
                        .criterion(hasItem(ModItems.PIGLIN_BRONZE_INGOT), conditionsFromItem(ModItems.PIGLIN_BRONZE_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.PIGLIN_BRONZE_LEGGINGS)
                        .pattern("###")
                        .pattern("#Z#")
                        .pattern("# #")
                        .input('#', ModItems.PIGLIN_BRONZE_INGOT)
                        .input('Z', Items.LEATHER)
                        .criterion(hasItem(ModItems.PIGLIN_BRONZE_INGOT), conditionsFromItem(ModItems.PIGLIN_BRONZE_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.PIGLIN_BRONZE_BOOTS)
                        .pattern("Z Z")
                        .pattern("# #")
                        .pattern("# #")
                        .input('#', ModItems.PIGLIN_BRONZE_INGOT)
                        .input('Z', Items.LEATHER)
                        .criterion(hasItem(ModItems.PIGLIN_BRONZE_INGOT), conditionsFromItem(ModItems.PIGLIN_BRONZE_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModBlocks.ALTAR)
                        .pattern("###")
                        .pattern("YXY")
                        .pattern("YXY")
                        .input('X', Items.COBBLESTONE)
                        .input('#', Items.SMOOTH_STONE)
                        .input('Y', Items.COAL)
                        .criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModBlocks.GILDED_ALTAR)
                        .pattern("XXX")
                        .pattern("Z#Z")
                        .pattern("YYY")
                        .input('X', Items.GOLD_INGOT)
                        .input('#', ModBlocks.ALTAR)
                        .input('Y', Items.IRON_INGOT)
                        .input('Z', Items. COPPER_INGOT)
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModBlocks.RESPLENDENT_ALTAR)
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
