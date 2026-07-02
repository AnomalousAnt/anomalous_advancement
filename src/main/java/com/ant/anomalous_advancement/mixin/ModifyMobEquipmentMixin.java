package com.ant.anomalous_advancement.mixin;

import com.ant.anomalous_advancement.item.ModItems;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Mob.class)
public class ModifyMobEquipmentMixin {

    @Inject(method = "populateDefaultEquipmentSlots", at = @At("TAIL"))
    private void replaceArmor(CallbackInfo ci) {
        Mob mob = (Mob) (Object) this;

        ItemStack feet = mob.getItemBySlot(EquipmentSlot.FEET);
        if (feet.is(Items.LEATHER_BOOTS)) {
            mob.setItemSlot(EquipmentSlot.FEET, new ItemStack(ModItems.PLEATHER_BOOTS));
        }
        if (feet.is(Items.CHAINMAIL_BOOTS)) {
            mob.setItemSlot(EquipmentSlot.FEET, new ItemStack(ModItems.PCHAIN_BOOTS));
        }
        if (feet.is(Items.COPPER_BOOTS)) {
            mob.setItemSlot(EquipmentSlot.FEET, new ItemStack(ModItems.PCOPPER_BOOTS));
        }
        if (feet.is(Items.GOLDEN_BOOTS)) {
            mob.setItemSlot(EquipmentSlot.FEET, new ItemStack(ModItems.PGOLD_BOOTS));
        }
        if (feet.is(Items.IRON_BOOTS)) {
            mob.setItemSlot(EquipmentSlot.FEET, new ItemStack(ModItems.PIRON_BOOTS));
        }
        if (feet.is(Items.DIAMOND_BOOTS)) {
            mob.setItemSlot(EquipmentSlot.FEET, new ItemStack(ModItems.PIGLIN_BRONZE_BOOTS));
        }

        ItemStack legs = mob.getItemBySlot(EquipmentSlot.LEGS);
        if (legs.is(Items.LEATHER_LEGGINGS)) {
            mob.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ModItems.PLEATHER_LEGGINGS));
        }
        if (legs.is(Items.CHAINMAIL_LEGGINGS)) {
            mob.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ModItems.PCHAIN_LEGGINGS));
        }
        if (legs.is(Items.COPPER_LEGGINGS)) {
            mob.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ModItems.PCOPPER_LEGGINGS));
        }
        if (legs.is(Items.GOLDEN_LEGGINGS)) {
            mob.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ModItems.PGOLD_LEGGINGS));
        }
        if (legs.is(Items.IRON_LEGGINGS)) {
            mob.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ModItems.PIRON_LEGGINGS));
        }
        if (legs.is(Items.DIAMOND_LEGGINGS)) {
            mob.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ModItems.PIGLIN_BRONZE_LEGGINGS));
        }

        ItemStack chest = mob.getItemBySlot(EquipmentSlot.CHEST);
        if (chest.is(Items.LEATHER_CHESTPLATE)) {
            mob.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ModItems.PLEATHER_CHESTPLATE));
        }
        if (chest.is(Items.CHAINMAIL_CHESTPLATE)) {
            mob.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ModItems.PCHAIN_CHESTPLATE));
        }
        if (chest.is(Items.COPPER_CHESTPLATE)) {
            mob.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ModItems.PCOPPER_CHESTPLATE));
        }
        if (chest.is(Items.GOLDEN_CHESTPLATE)) {
            mob.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ModItems.PGOLD_CHESTPLATE));
        }
        if (chest.is(Items.IRON_CHESTPLATE)) {
            mob.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ModItems.PIRON_CHESTPLATE));
        }
        if (chest.is(Items.DIAMOND_CHESTPLATE)) {
            mob.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ModItems.PIGLIN_BRONZE_CHESTPLATE));
        }

        ItemStack head = mob.getItemBySlot(EquipmentSlot.HEAD);
        if (head.is(Items.LEATHER_HELMET)) {
            mob.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ModItems.PLEATHER_HELMET));
        }
        if (head.is(Items.CHAINMAIL_HELMET)) {
            mob.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ModItems.PCHAIN_HELMET));
        }
        if (head.is(Items.COPPER_HELMET)) {
            mob.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ModItems.PCOPPER_HELMET));
        }
        if (head.is(Items.GOLDEN_HELMET)) {
            mob.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ModItems.PGOLD_HELMET));
        }
        if (head.is(Items.IRON_HELMET)) {
            mob.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ModItems.PIRON_HELMET));
        }
        if (head.is(Items.DIAMOND_HELMET)) {
            mob.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ModItems.PIGLIN_BRONZE_HELMET));
        }
    }
}
