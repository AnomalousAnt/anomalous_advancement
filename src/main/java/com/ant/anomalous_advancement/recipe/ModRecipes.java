package com.ant.anomalous_advancement.recipe;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {
    public static final RecipeSerializer<MagicBenchRecipe> MAGIC_BENCH_SERIALIZER = Registry.register(Registries.RECIPE_SERIALIZER, Identifier.of(Anomalous_Advancement.MOD_ID, "magic_bench"),
            new MagicBenchRecipe.Serializer());
    public static final RecipeType<MagicBenchRecipe> MAGIC_BENCH_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Anomalous_Advancement.MOD_ID, "magic_bench"), new RecipeType<MagicBenchRecipe>() {
                @Override
                public String toString() {
                    return "magic_bench";
                }
            }
    );
    public static void registerRecipes() {
        Anomalous_Advancement.LOGGER.info("Registering Custom Recipes for " + Anomalous_Advancement.MOD_ID);
    }
}
