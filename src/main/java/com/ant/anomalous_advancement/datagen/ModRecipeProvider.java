package com.ant.anomalous_advancement.datagen;

import com.ant.anomalous_advancement.block.ModBlocks;
import com.ant.anomalous_advancement.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);

    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider wrapperLookup, RecipeOutput recipeExporter) {
        return new RecipeProvider(wrapperLookup, recipeExporter) {
            @Override
            public void buildRecipes() {
                shaped(RecipeCategory.TOOLS, ModItems.FLINT_PICKAXE)
                        .pattern("###")
                        .pattern("ZX ")
                        .pattern(" X ")
                        .define('X', Items.STICK)
                        .define('#', Items.FLINT)
                        .define('Z', Items.STRING)
                        .unlockedBy(getHasName(Items.FLINT), has(Items.FLINT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.FLINT_AXE)
                        .pattern("##")
                        .pattern("#X")
                        .pattern("ZX")
                        .define('X', Items.STICK)
                        .define('#', Items.FLINT)
                        .define('Z', Items.STRING)
                        .unlockedBy(getHasName(Items.FLINT), has(Items.FLINT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.FLINT_HOE)
                        .pattern("##")
                        .pattern("ZX")
                        .pattern(" X")
                        .define('X', Items.STICK)
                        .define('#', Items.FLINT)
                        .define('Z', Items.STRING)
                        .unlockedBy(getHasName(Items.FLINT), has(Items.FLINT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.FLINT_SHOVEL)
                        .pattern(" #")
                        .pattern(" X")
                        .pattern("ZX")
                        .define('X', Items.STICK)
                        .define('#', Items.FLINT)
                        .define('Z', Items.STRING)
                        .unlockedBy(getHasName(Items.FLINT), has(Items.FLINT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.FLINT_SWORD)
                        .pattern(" #")
                        .pattern(" #")
                        .pattern("ZX")
                        .define('X', Items.STICK)
                        .define('#', Items.FLINT)
                        .define('Z', Items.STRING)
                        .unlockedBy(getHasName(Items.FLINT), has(Items.FLINT))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.PCHAIN_HELMET)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("#Z#")
                        .define('#', Items.IRON_CHAIN)
                        .define('Z', ModItems.PLEATHER_HELMET)
                        .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.PCHAIN_CHESTPLATE)
                        .pattern("#Z#")
                        .pattern("###")
                        .pattern("###")
                        .define('#', Items.IRON_CHAIN)
                        .define('Z', ModItems.PLEATHER_CHESTPLATE)
                        .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.PCHAIN_LEGGINGS)
                        .pattern("###")
                        .pattern("#Z#")
                        .pattern("# #")
                        .define('#', Items.IRON_CHAIN)
                        .define('Z', ModItems.PLEATHER_LEGGINGS)
                        .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.PCHAIN_BOOTS)
                        .pattern("   ")
                        .pattern("#Z#")
                        .pattern("# #")
                        .define('#', Items.IRON_CHAIN)
                        .define('Z', ModItems.PLEATHER_BOOTS)
                        .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.COPPER_BOW)
                        .pattern("#XZ")
                        .pattern("XYZ")
                        .pattern("#XZ")
                        .define('X', Items.STICK)
                        .define('#', Items.COPPER_INGOT)
                        .define('Z', Items.STRING)
                        .define('Y', Items.BOW)
                        .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.IRON_BOW)
                        .pattern("#XZ")
                        .pattern("XYZ")
                        .pattern("#XZ")
                        .define('X', Items.STICK)
                        .define('#', Items.IRON_INGOT)
                        .define('Z', Items.LEATHER)
                        .define('Y', Items.BOW)
                        .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.GOLD_BOW)
                        .pattern("#XZ")
                        .pattern("XYZ")
                        .pattern("#XZ")
                        .define('X', Items.STICK)
                        .define('#', Items.GOLD_INGOT)
                        .define('Z', Items.LEATHER)
                        .define('Y', ModItems.IRON_BOW)
                        .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.PIGLIN_BRONZE_INGOT, 9)
                        .requires(ModBlocks.BLOCK_OF_PIGLIN_BRONZE)
                        .unlockedBy(getHasName(ModItems.PIGLIN_BRONZE_INGOT), has(ModItems.PIGLIN_BRONZE_INGOT))
                        .save(output,"piglin_bronze_ingot_from_block");

                shaped(RecipeCategory.MISC, ModItems.PIGLIN_BRONZE_INGOT)
                        .pattern("XXX")
                        .pattern("XZZ")
                        .pattern("ZZZ")
                        .define('X', Items.COPPER_INGOT)
                        .define('Z', Items.GOLD_INGOT)
                        .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.BLOCK_OF_PIGLIN_BRONZE)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .define('X', ModItems.PIGLIN_BRONZE_INGOT)
                        .unlockedBy(getHasName(ModItems.PIGLIN_BRONZE_INGOT), has(ModItems.PIGLIN_BRONZE_INGOT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.PIGLIN_BRONZE_PICKAXE)
                        .pattern("###")
                        .pattern("ZX ")
                        .pattern(" X ")
                        .define('X', Items.BREEZE_ROD)
                        .define('#', ModItems.PIGLIN_BRONZE_INGOT)
                        .define('Z', Items.LEATHER)
                        .unlockedBy(getHasName(ModItems.PIGLIN_BRONZE_INGOT), has(ModItems.PIGLIN_BRONZE_INGOT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.PIGLIN_BRONZE_AXE)
                        .pattern("##")
                        .pattern("#X")
                        .pattern("ZX")
                        .define('X', Items.BREEZE_ROD)
                        .define('#', ModItems.PIGLIN_BRONZE_INGOT)
                        .define('Z', Items.LEATHER)
                        .unlockedBy(getHasName(ModItems.PIGLIN_BRONZE_INGOT), has(ModItems.PIGLIN_BRONZE_INGOT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.PIGLIN_BRONZE_HOE)
                        .pattern("##")
                        .pattern("ZX")
                        .pattern(" X")
                        .define('X', Items.BREEZE_ROD)
                        .define('#', ModItems.PIGLIN_BRONZE_INGOT)
                        .define('Z', Items.LEATHER)
                        .unlockedBy(getHasName(ModItems.PIGLIN_BRONZE_INGOT), has(ModItems.PIGLIN_BRONZE_INGOT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.PIGLIN_BRONZE_SHOVEL)
                        .pattern(" #")
                        .pattern(" X")
                        .pattern("ZX")
                        .define('X', Items.BREEZE_ROD)
                        .define('#', ModItems.PIGLIN_BRONZE_INGOT)
                        .define('Z', Items.LEATHER)
                        .unlockedBy(getHasName(ModItems.PIGLIN_BRONZE_INGOT), has(ModItems.PIGLIN_BRONZE_INGOT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.PIGLIN_BRONZE_SWORD)
                        .pattern(" #")
                        .pattern(" #")
                        .pattern("ZX")
                        .define('X', Items.BREEZE_ROD)
                        .define('#', ModItems.PIGLIN_BRONZE_INGOT)
                        .define('Z', Items.LEATHER)
                        .unlockedBy(getHasName(ModItems.PIGLIN_BRONZE_INGOT), has(ModItems.PIGLIN_BRONZE_INGOT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.PIGLIN_BRONZE_BOW)
                        .pattern("#XZ")
                        .pattern("X#Z")
                        .pattern("#XZ")
                        .define('X', Items.BREEZE_ROD)
                        .define('#', ModItems.PIGLIN_BRONZE_INGOT)
                        .define('Z', Items.LEATHER)
                        .unlockedBy(getHasName(ModItems.PIGLIN_BRONZE_INGOT), has(ModItems.PIGLIN_BRONZE_INGOT))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.PIGLIN_BRONZE_HELMET)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("#Z#")
                        .define('#', ModItems.PIGLIN_BRONZE_INGOT)
                        .define('Z', ModItems.PLEATHER_HELMET)
                        .unlockedBy(getHasName(ModItems.PIGLIN_BRONZE_INGOT), has(ModItems.PIGLIN_BRONZE_INGOT))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.PIGLIN_BRONZE_CHESTPLATE)
                        .pattern("#Z#")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ModItems.PIGLIN_BRONZE_INGOT)
                        .define('Z', ModItems.PLEATHER_CHESTPLATE)
                        .unlockedBy(getHasName(ModItems.PIGLIN_BRONZE_INGOT), has(ModItems.PIGLIN_BRONZE_INGOT))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.PIGLIN_BRONZE_LEGGINGS)
                        .pattern("###")
                        .pattern("#Z#")
                        .pattern("# #")
                        .define('#', ModItems.PIGLIN_BRONZE_INGOT)
                        .define('Z', ModItems.PLEATHER_LEGGINGS)
                        .unlockedBy(getHasName(ModItems.PIGLIN_BRONZE_INGOT), has(ModItems.PIGLIN_BRONZE_INGOT))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.PIGLIN_BRONZE_BOOTS)
                        .pattern("   ")
                        .pattern("#Z#")
                        .pattern("# #")
                        .define('#', ModItems.PIGLIN_BRONZE_INGOT)
                        .define('Z', ModItems.PLEATHER_BOOTS)
                        .unlockedBy(getHasName(ModItems.PIGLIN_BRONZE_INGOT), has(ModItems.PIGLIN_BRONZE_INGOT))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.DAMASCUS_STEEL_INGOT, 9)
                        .requires(ModBlocks.BLOCK_OF_DAMASCUS_STEEL)
                        .unlockedBy(getHasName(ModItems.DAMASCUS_STEEL_INGOT), has(ModItems.DAMASCUS_STEEL_INGOT))
                        .save(output, "damascus_steel_ingot_from_block");

                shaped(RecipeCategory.MISC, ModItems.DAMASCUS_STEEL_INGOT)
                        .pattern("XXX")
                        .pattern("XZZ")
                        .pattern("ZZZ")
                        .define('X', Items.POLISHED_TUFF)
                        .define('Z', Items.DEEPSLATE_IRON_ORE)
                        .unlockedBy(getHasName(Items.TUFF), has(Items.TUFF))
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.BLOCK_OF_DAMASCUS_STEEL)
                        .pattern("XXX")
                        .pattern("XXX")
                        .pattern("XXX")
                        .define('X', ModItems.DAMASCUS_STEEL_INGOT)
                        .unlockedBy(getHasName(ModItems.DAMASCUS_STEEL_INGOT), has(ModItems.DAMASCUS_STEEL_INGOT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.DAMASCUS_STEEL_PICKAXE)
                        .pattern("###")
                        .pattern(" XY")
                        .pattern("ZXY")
                        .define('X', Items.BREEZE_ROD)
                        .define('Y', Items.BLAZE_ROD)
                        .define('#', ModItems.DAMASCUS_STEEL_INGOT)
                        .define('Z', Items.RESIN_BRICK)
                        .unlockedBy(getHasName(ModItems.DAMASCUS_STEEL_INGOT), has(ModItems.DAMASCUS_STEEL_INGOT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.DAMASCUS_STEEL_AXE)
                        .pattern("## ")
                        .pattern("#XY")
                        .pattern("ZXY")
                        .define('X', Items.BREEZE_ROD)
                        .define('Y', Items.BLAZE_ROD)
                        .define('#', ModItems.DAMASCUS_STEEL_INGOT)
                        .define('Z', Items.RESIN_BRICK)
                        .unlockedBy(getHasName(ModItems.DAMASCUS_STEEL_INGOT), has(ModItems.DAMASCUS_STEEL_INGOT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.DAMASCUS_STEEL_HOE)
                        .pattern("## ")
                        .pattern(" XY")
                        .pattern("ZXY")
                        .define('X', Items.BREEZE_ROD)
                        .define('Y', Items.BLAZE_ROD)
                        .define('#', ModItems.DAMASCUS_STEEL_INGOT)
                        .define('Z', Items.RESIN_BRICK)
                        .unlockedBy(getHasName(ModItems.DAMASCUS_STEEL_INGOT), has(ModItems.DAMASCUS_STEEL_INGOT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.DAMASCUS_STEEL_SHOVEL)
                        .pattern(" # ")
                        .pattern(" XY")
                        .pattern("ZXY")
                        .define('X', Items.BREEZE_ROD)
                        .define('Y', Items.BLAZE_ROD)
                        .define('#', ModItems.DAMASCUS_STEEL_INGOT)
                        .define('Z', Items.RESIN_BRICK)
                        .unlockedBy(getHasName(ModItems.DAMASCUS_STEEL_INGOT), has(ModItems.DAMASCUS_STEEL_INGOT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.DAMASCUS_STEEL_SWORD)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern("ZXY")
                        .define('X', Items.BREEZE_ROD)
                        .define('Y', Items.BLAZE_ROD)
                        .define('#', ModItems.DAMASCUS_STEEL_INGOT)
                        .define('Z', Items.RESIN_BRICK)
                        .unlockedBy(getHasName(ModItems.DAMASCUS_STEEL_INGOT), has(ModItems.DAMASCUS_STEEL_INGOT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.DAMASCUS_STEEL_BOW)
                        .pattern("#XZ")
                        .pattern("Y#Z")
                        .pattern("#XZ")
                        .define('X', Items.BREEZE_ROD)
                        .define('Y', Items.BLAZE_ROD)
                        .define('#', ModItems.DAMASCUS_STEEL_INGOT)
                        .define('Z', Items.RESIN_BRICK)
                        .unlockedBy(getHasName(ModItems.DAMASCUS_STEEL_INGOT), has(ModItems.DAMASCUS_STEEL_INGOT))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.DAMASCUS_STEEL_HELMET)
                        .pattern("   ")
                        .pattern("###")
                        .pattern("#Z#")
                        .define('#', ModItems.DAMASCUS_STEEL_INGOT)
                        .define('Z', ModItems.PLEATHER_HELMET)
                        .unlockedBy(getHasName(ModItems.DAMASCUS_STEEL_INGOT), has(ModItems.DAMASCUS_STEEL_INGOT))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.DAMASCUS_STEEL_CHESTPLATE)
                        .pattern("#Z#")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ModItems.DAMASCUS_STEEL_INGOT)
                        .define('Z', ModItems.PLEATHER_CHESTPLATE)
                        .unlockedBy(getHasName(ModItems.DAMASCUS_STEEL_INGOT), has(ModItems.DAMASCUS_STEEL_INGOT))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.DAMASCUS_STEEL_LEGGINGS)
                        .pattern("###")
                        .pattern("#Z#")
                        .pattern("# #")
                        .define('#', ModItems.DAMASCUS_STEEL_INGOT)
                        .define('Z', ModItems.PLEATHER_LEGGINGS)
                        .unlockedBy(getHasName(ModItems.DAMASCUS_STEEL_INGOT), has(ModItems.DAMASCUS_STEEL_INGOT))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.DAMASCUS_STEEL_BOOTS)
                        .pattern("   ")
                        .pattern("#Z#")
                        .pattern("# #")
                        .define('#', ModItems.DAMASCUS_STEEL_INGOT)
                        .define('Z', ModItems.PLEATHER_BOOTS)
                        .unlockedBy(getHasName(ModItems.DAMASCUS_STEEL_INGOT), has(ModItems.DAMASCUS_STEEL_INGOT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.DIAMOND_BOW)
                        .pattern("###")
                        .pattern("#Y#")
                        .pattern("###")
                        .define('#', Items.DIAMOND)
                        .define('Y', ModItems.DAMASCUS_STEEL_BOW)
                        .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.NETHERITE_BOW)
                        .pattern("###")
                        .pattern("#Y#")
                        .pattern("###")
                        .define('#', Items.NETHERITE_INGOT)
                        .define('Y', ModItems.DIAMOND_BOW)
                        .unlockedBy(getHasName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.ALTAR)
                        .pattern("###")
                        .pattern("YXY")
                        .pattern("YXY")
                        .define('X', Items.COBBLESTONE)
                        .define('#', Items.SMOOTH_STONE)
                        .define('Y', Items.COAL)
                        .unlockedBy(getHasName(Items.COBBLESTONE), has(Items.COBBLESTONE))
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.GILDED_ALTAR)
                        .pattern("XXX")
                        .pattern("Z#Z")
                        .pattern("YYY")
                        .define('X', Items.GOLD_INGOT)
                        .define('#', ModBlocks.ALTAR)
                        .define('Y', Items.IRON_INGOT)
                        .define('Z', Items. COPPER_INGOT)
                        .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.RESPLENDENT_ALTAR)
                        .pattern("XXX")
                        .pattern("Z#Z")
                        .pattern("YYY")
                        .define('X', Items.GOLD_INGOT)
                        .define('#', ModBlocks.GILDED_ALTAR)
                        .define('Y', Items.IRON_INGOT)
                        .define('Z', Items. DIAMOND_BLOCK)
                        .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "Anomalous_Advancement Recipes";
    }
}
