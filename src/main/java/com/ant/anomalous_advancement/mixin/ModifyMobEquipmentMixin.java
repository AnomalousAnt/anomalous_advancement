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
    private void replaceArmor(CallbackInfo ci) {
        MobEntity mob = (MobEntity) (Object) this;

        ItemStack feet = mob.getEquippedStack(EquipmentSlot.FEET);
        if (feet.isOf(Items.LEATHER_BOOTS)) {
            mob.equipStack(EquipmentSlot.FEET, new ItemStack(ModItems.PLEATHER_BOOTS));
        }
        if (feet.isOf(Items.CHAINMAIL_BOOTS)) {
            mob.equipStack(EquipmentSlot.FEET, new ItemStack(ModItems.PCHAIN_BOOTS));
        }
        if (feet.isOf(Items.COPPER_BOOTS)) {
            mob.equipStack(EquipmentSlot.FEET, new ItemStack(ModItems.PCOPPER_BOOTS));
        }
        if (feet.isOf(Items.GOLDEN_BOOTS)) {
            mob.equipStack(EquipmentSlot.FEET, new ItemStack(ModItems.PGOLD_BOOTS));
        }
        if (feet.isOf(Items.IRON_BOOTS)) {
            mob.equipStack(EquipmentSlot.FEET, new ItemStack(ModItems.PIRON_BOOTS));
        }
        if (feet.isOf(Items.DIAMOND_BOOTS)) {
            mob.equipStack(EquipmentSlot.FEET, new ItemStack(ModItems.PIGLIN_BRONZE_BOOTS));
        }

        ItemStack legs = mob.getEquippedStack(EquipmentSlot.LEGS);
        if (legs.isOf(Items.LEATHER_LEGGINGS)) {
            mob.equipStack(EquipmentSlot.LEGS, new ItemStack(ModItems.PLEATHER_LEGGINGS));
        }
        if (legs.isOf(Items.CHAINMAIL_LEGGINGS)) {
            mob.equipStack(EquipmentSlot.LEGS, new ItemStack(ModItems.PCHAIN_LEGGINGS));
        }
        if (legs.isOf(Items.COPPER_LEGGINGS)) {
            mob.equipStack(EquipmentSlot.LEGS, new ItemStack(ModItems.PCOPPER_LEGGINGS));
        }
        if (legs.isOf(Items.GOLDEN_LEGGINGS)) {
            mob.equipStack(EquipmentSlot.LEGS, new ItemStack(ModItems.PGOLD_LEGGINGS));
        }
        if (legs.isOf(Items.IRON_LEGGINGS)) {
            mob.equipStack(EquipmentSlot.LEGS, new ItemStack(ModItems.PIRON_LEGGINGS));
        }
        if (legs.isOf(Items.DIAMOND_LEGGINGS)) {
            mob.equipStack(EquipmentSlot.LEGS, new ItemStack(ModItems.PIGLIN_BRONZE_LEGGINGS));
        }

        ItemStack chest = mob.getEquippedStack(EquipmentSlot.CHEST);
        if (chest.isOf(Items.LEATHER_CHESTPLATE)) {
            mob.equipStack(EquipmentSlot.CHEST, new ItemStack(ModItems.PLEATHER_CHESTPLATE));
        }
        if (chest.isOf(Items.CHAINMAIL_CHESTPLATE)) {
            mob.equipStack(EquipmentSlot.CHEST, new ItemStack(ModItems.PCHAIN_CHESTPLATE));
        }
        if (chest.isOf(Items.COPPER_CHESTPLATE)) {
            mob.equipStack(EquipmentSlot.CHEST, new ItemStack(ModItems.PCOPPER_CHESTPLATE));
        }
        if (chest.isOf(Items.GOLDEN_CHESTPLATE)) {
            mob.equipStack(EquipmentSlot.CHEST, new ItemStack(ModItems.PGOLD_CHESTPLATE));
        }
        if (chest.isOf(Items.IRON_CHESTPLATE)) {
            mob.equipStack(EquipmentSlot.CHEST, new ItemStack(ModItems.PIRON_CHESTPLATE));
        }
        if (chest.isOf(Items.DIAMOND_CHESTPLATE)) {
            mob.equipStack(EquipmentSlot.CHEST, new ItemStack(ModItems.PIGLIN_BRONZE_CHESTPLATE));
        }

        ItemStack head = mob.getEquippedStack(EquipmentSlot.HEAD);
        if (head.isOf(Items.LEATHER_HELMET)) {
            mob.equipStack(EquipmentSlot.HEAD, new ItemStack(ModItems.PLEATHER_HELMET));
        }
        if (head.isOf(Items.CHAINMAIL_HELMET)) {
            mob.equipStack(EquipmentSlot.HEAD, new ItemStack(ModItems.PCHAIN_HELMET));
        }
        if (head.isOf(Items.COPPER_HELMET)) {
            mob.equipStack(EquipmentSlot.HEAD, new ItemStack(ModItems.PCOPPER_HELMET));
        }
        if (head.isOf(Items.GOLDEN_HELMET)) {
            mob.equipStack(EquipmentSlot.HEAD, new ItemStack(ModItems.PGOLD_HELMET));
        }
        if (head.isOf(Items.IRON_HELMET)) {
            mob.equipStack(EquipmentSlot.HEAD, new ItemStack(ModItems.PIRON_HELMET));
        }
        if (head.isOf(Items.DIAMOND_HELMET)) {
            mob.equipStack(EquipmentSlot.HEAD, new ItemStack(ModItems.PIGLIN_BRONZE_HELMET));
        }
    }
}
