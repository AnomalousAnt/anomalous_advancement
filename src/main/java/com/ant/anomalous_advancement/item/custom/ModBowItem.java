package com.ant.anomalous_advancement.item.custom;

import java.util.List;
import java.util.function.Predicate;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class ModBowItem extends BowItem {

    private static final int BASE_USE_DURATION = 72000;
    private static final float VANILLA_BOW_VELOCITY = 3.0F;

    private final float drawSpeedMultiplier;
    private final float velocityMultiplier;
    private final float damageMultiplier;
    private final int range;

    public ModBowItem(Item.Properties properties,
                      float drawSpeedMultiplier,
                      float velocityMultiplier,
                      float damageMultiplier,
                      int range) {

        super(properties);
        this.drawSpeedMultiplier = drawSpeedMultiplier;
        this.velocityMultiplier = velocityMultiplier;
        this.damageMultiplier = damageMultiplier;
        this.range = range;
    }

    @Override
    public int getUseDuration(ItemStack stack, LivingEntity user) {
        return BASE_USE_DURATION;
    }

    @Override
    public ItemUseAnimation getUseAnimation(ItemStack stack) {
        return ItemUseAnimation.BOW;
    }

    @Override
    public Predicate<ItemStack> getAllSupportedProjectiles() {
        return ARROW_ONLY;
    }

    @Override
    public int getDefaultProjectileRange() {
        return this.range;
    }

    @Override
    public boolean releaseUsing(ItemStack stack, Level world, LivingEntity user, int remainingUseTicks) {

        if (!(user instanceof Player player)) {
            return false;
        }

        ItemStack ammo = player.getProjectile(stack);
        if (ammo.isEmpty()) {
            return false;
        }

        int usedTicks = this.getUseDuration(stack, user) - remainingUseTicks;
        float pull = getPullProgressScaled(usedTicks);

        if (pull < 0.1F) {
            return false;
        }

        List<ItemStack> projectiles = draw(stack, ammo, player);

        if (world instanceof ServerLevel serverLevel && !projectiles.isEmpty()) {

            this.shoot(
                    serverLevel,
                    player,
                    player.getUsedItemHand(),
                    stack,
                    projectiles,
                    pull * VANILLA_BOW_VELOCITY * this.velocityMultiplier,
                    1.0F,
                    pull == 1.0F,
                    null
            );
        }

        world.playSound(
                null,
                player.getX(),
                player.getY(),
                player.getZ(),
                SoundEvents.ARROW_SHOOT,
                SoundSource.PLAYERS,
                1.0F,
                1.0F / (world.getRandom().nextFloat() * 0.4F + 1.2F) + pull * 0.5F
        );

        player.awardStat(Stats.ITEM_USED.get(this));
        return true;
    }

    @Override
    protected void shootProjectile(
            LivingEntity shooter,
            Projectile projectile,
            int index,
            float speed,
            float divergence,
            float yaw,
            @Nullable LivingEntity target
    ) {
        projectile.shootFromRotation(
                shooter,
                shooter.getXRot(),
                shooter.getYRot() + yaw,
                0.0F,
                speed,
                divergence
        );

        if (projectile instanceof AbstractArrow arrow) {

            arrow.setBaseDamage(2.0D * this.damageMultiplier);
        }
    }

    private float getPullProgressScaled(int useTicks) {
        float f = (float) useTicks / (20.0F / this.drawSpeedMultiplier);
        f = (f * f + f * 2.0F) / 3.0F;

        return Math.min(f, 1.0F);
    }
}