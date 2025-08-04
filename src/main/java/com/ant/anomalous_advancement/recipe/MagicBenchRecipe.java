package com.ant.anomalous_advancement.recipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

public record MagicBenchRecipe(Ingredient inputItem, ItemStack output) implements Recipe<MagicBenchRecipeInput> {

    @Override
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }



    @Override
    public boolean matches(MagicBenchRecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(MagicBenchRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getResult(RegistryWrapper.WrapperLookup registriesLookup) {
        return output;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return  ModRecipes.MAGIC_BENCH_SERIALIZER;
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipes.MAGIC_BENCH_TYPE;
    }

    public static class Serializer implements RecipeSerializer<MagicBenchRecipe> {
        public static final MapCodec<MagicBenchRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.DISALLOW_EMPTY_CODEC.fieldOf("ingredient").forGetter(MagicBenchRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(MagicBenchRecipe::output)
                ).apply(inst, MagicBenchRecipe::new));
        public static final PacketCodec<RegistryByteBuf, MagicBenchRecipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, MagicBenchRecipe::inputItem,
                        ItemStack.PACKET_CODEC, MagicBenchRecipe::output,
                        MagicBenchRecipe::new);

        @Override
        public MapCodec<MagicBenchRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, MagicBenchRecipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}
