package com.ant.anomalous_advancement.mixin;

import com.ant.anomalous_advancement.item.ModItems;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.Set;

// Created by 7410
@Mixin(AbstractClientPlayerEntity.class)
public abstract class AbstractClientPlayerEntityMixin {

    private static final Set<Item> CUSTOM_BOWS = Set.of(
            ModItems.PBOW,
            ModItems.COPPER_BOW,
            ModItems.IRON_BOW,
            ModItems.GOLD_BOW,
            ModItems.PIGLIN_BRONZE_BOW,
            ModItems.DAMASCUS_STEEL_BOW,
            ModItems.DIAMOND_BOW,
            ModItems.NETHERITE_BOW

    );

    @WrapOperation(
            method = "getFovMultiplier",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"
            )
    )
    private boolean changeFovForCustomBows(ItemStack instance, Item item, Operation<Boolean> original) {
        if (original.call(instance, item)) {
            return true;
        }

        for (Item customBow : CUSTOM_BOWS) {
            if (instance.isOf(customBow)) {
                return true;
            }
        }

        return false;
    }
}
