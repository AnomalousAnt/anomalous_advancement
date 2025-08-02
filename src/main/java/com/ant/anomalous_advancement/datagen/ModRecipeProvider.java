package com.ant.anomalous_advancement.datagen;

import com.ant.anomalous_advancement.block.ModBlocks;
import com.ant.anomalous_advancement.item.ModItems;
import com.ant.anomalous_advancement.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FLINT_PICKAXE)
                .pattern("###")
                .pattern(" XY")
                .pattern(" X ")
                .input('X', Items.STICK)
                .input('#', Items.FLINT)
                .input('Y', Items.STRING)
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.STONE_PICKAXE)
                .pattern("###")
                .pattern(" XY")
                .pattern(" X ")
                .input('X', Items.STICK)
                .input('#', ModTags.Items.MODDED_STONE_TOOL_MATERIALS)
                .input('Y', Items.STRING)
                .criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FLINT_AXE)
                .pattern("## ")
                .pattern("#XY")
                .pattern(" X ")
                .input('X', Items.STICK)
                .input('#', Items.FLINT)
                .input('Y', Items.STRING)
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.STONE_AXE)
                .pattern("## ")
                .pattern("#XY")
                .pattern(" X ")
                .input('X', Items.STICK)
                .input('#', ModTags.Items.MODDED_STONE_TOOL_MATERIALS)
                .input('Y', Items.STRING)
                .criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FLINT_HOE)
                .pattern("## ")
                .pattern(" XY")
                .pattern(" X ")
                .input('X', Items.STICK)
                .input('#', Items.FLINT)
                .input('Y', Items.STRING)
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.STONE_HOE)
                .pattern("## ")
                .pattern(" XY")
                .pattern(" X ")
                .input('X', Items.STICK)
                .input('#', ModTags.Items.MODDED_STONE_TOOL_MATERIALS)
                .input('Y', Items.STRING)
                .criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FLINT_SHOVEL)
                .pattern(" # ")
                .pattern(" XY")
                .pattern(" X ")
                .input('X', Items.STICK)
                .input('#', Items.FLINT)
                .input('Y', Items.STRING)
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.STONE_SHOVEL)
                .pattern(" # ")
                .pattern(" XY")
                .pattern(" X ")
                .input('X', Items.STICK)
                .input('#', ModTags.Items.MODDED_STONE_TOOL_MATERIALS)
                .input('Y', Items.STRING)
                .criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FLINT_SWORD)
                .pattern(" # ")
                .pattern(" #Y")
                .pattern(" X ")
                .input('X', Items.STICK)
                .input('#', Items.FLINT)
                .input('Y', Items.STRING)
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.STONE_SWORD)
                .pattern(" # ")
                .pattern(" #Y")
                .pattern(" X ")
                .input('X', Items.STICK)
                .input('#', ModTags.Items.MODDED_STONE_TOOL_MATERIALS)
                .input('Y', Items.STRING)
                .criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModBlocks.ALTAR)
                .pattern("###")
                .pattern("YXY")
                .pattern("YXY")
                .input('X', Items.COBBLESTONE)
                .input('#', Items.SMOOTH_STONE)
                .input('Y', Items.COAL)
                .criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModBlocks.GILDED_ALTAR)
                .pattern("XXX")
                .pattern("Z#Z")
                .pattern("YYY")
                .input('X', Items.GOLD_INGOT)
                .input('#', ModBlocks.ALTAR)
                .input('Y', Items.IRON_INGOT)
                .input('Z', Items. COPPER_INGOT)
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter);
    }
}
