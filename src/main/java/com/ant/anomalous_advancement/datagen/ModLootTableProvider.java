package com.ant.anomalous_advancement.datagen;

import com.ant.anomalous_advancement.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.advancements.criterion.ItemPredicate;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolSingletonContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootSubProvider {
    public ModLootTableProvider(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup){
        super(dataOutput, registryLookup);
    }
    @Override
    public void generate() {
        dropSelf(ModBlocks.ALTAR);
        dropSelf(ModBlocks.GILDED_ALTAR);
        dropSelf(ModBlocks.RESPLENDENT_ALTAR);
        dropSelf(ModBlocks.BLOCK_OF_PIGLIN_BRONZE);
        dropSelf(ModBlocks.BLOCK_OF_DAMASCUS_STEEL);

        add(Blocks.GRAVEL, gravelLoot());
    }

    private LootTable.Builder gravelLoot(){

        HolderGetter<Item> itemLookup = this.registries.lookupOrThrow(Registries.ITEM);
                LootPool.Builder pickaxePool = LootPool.lootPool()
                        .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(itemLookup,ItemTags.PICKAXES)))
                        .add(LootItem.lootTableItem(Items.FLINT)
                                .when(LootItemRandomChanceCondition.randomChance(0.1f))
                                .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
                        .setRolls(UniformGenerator.between(1.0F, 1.0F));

                LootPool.Builder shovelPool = LootPool.lootPool()
                        .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(itemLookup,ItemTags.SHOVELS)))
                        .add(LootItem.lootTableItem(Blocks.GRAVEL))
                        .setRolls(UniformGenerator.between(1.0F, 1.0F));
        return LootTable.lootTable()
                .withPool(pickaxePool)
                .withPool(shovelPool);
    }
public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops){
        HolderLookup.RegistryLookup<Enchantment> impl = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(drop, this.applyExplosionDecay(drop, ((LootPoolSingletonContainer.Builder<?>)
                LootItem.lootTableItem(item).apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops))))
                .apply(ApplyBonusCount.addOreBonusCount(impl.getOrThrow(Enchantments.FORTUNE)))));
}}

