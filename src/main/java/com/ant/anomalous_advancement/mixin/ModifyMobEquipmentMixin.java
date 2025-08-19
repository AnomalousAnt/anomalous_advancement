package com.ant.anomalous_advancement.mixin;

import com.ant.anomalous_advancement.item.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MobEntity.class)
public class ModifyMobEquipmentMixin {

    @Inject(method = "initEquipment", at = @At("TAIL"))
    private void replaceLeatherArmor(CallbackInfo ci) {
        MobEntity mob = (MobEntity) (Object) this;

        ItemStack feet = mob.getEquippedStack(EquipmentSlot.FEET);
        if (feet.isOf(Items.LEATHER_BOOTS)) {
            mob.equipStack(EquipmentSlot.FEET, new ItemStack(ModItems.PLEATHER_BOOTS));
        }

        ItemStack legs = mob.getEquippedStack(EquipmentSlot.LEGS);
        if (legs.isOf(Items.LEATHER_LEGGINGS)) {
            mob.equipStack(EquipmentSlot.LEGS, new ItemStack(ModItems.PLEATHER_LEGGINGS));
        }

        ItemStack chest = mob.getEquippedStack(EquipmentSlot.CHEST);
        if (chest.isOf(Items.LEATHER_CHESTPLATE)) {
            mob.equipStack(EquipmentSlot.CHEST, new ItemStack(ModItems.PLEATHER_CHESTPLATE));
        }

        ItemStack head = mob.getEquippedStack(EquipmentSlot.HEAD);
        if (head.isOf(Items.LEATHER_HELMET)) {
            mob.equipStack(EquipmentSlot.HEAD, new ItemStack(ModItems.PLEATHER_HELMET));
        }
    }
}
