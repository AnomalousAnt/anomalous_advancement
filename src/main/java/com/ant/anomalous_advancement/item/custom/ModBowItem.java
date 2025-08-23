package com.ant.anomalous_advancement.item.custom;

import java.util.List;
import java.util.function.Predicate;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.RangedWeaponItem;
import net.minecraft.item.consume.UseAction;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class ModBowItem extends RangedWeaponItem {
    public static final int TICKS_PER_SECOND = 20;
    public static final int RANGE = 15;

    // ★ Added knobs
    private final float drawSpeedMultiplier;   // 1.0 = vanilla
    private final float velocityMultiplier;    // 1.0 = vanilla
    private final double damageMultiplier;     // 1.0 = vanilla (base 2.0 * this is used)

    public ModBowItem(Item.Settings settings, float drawSpeedMultiplier, float velocityMultiplier, double damageMultiplier) {
        super(settings);
        this.drawSpeedMultiplier = drawSpeedMultiplier;
        this.velocityMultiplier = velocityMultiplier;
        this.damageMultiplier = damageMultiplier;
    }

    @Override
    public boolean onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {
        if (!(user instanceof PlayerEntity playerEntity)) {
            return false;
        } else {
            ItemStack projectileStack = playerEntity.getProjectileType(stack);
            if (projectileStack.isEmpty()) {
                return false;
            } else {
                int useTicks = this.getMaxUseTime(stack, user) - remainingUseTicks;
                float pull = getPullProgressScaled(useTicks); // ★ uses drawSpeedMultiplier
                if ((double) pull < 0.1) {
                    return false;
                } else {
                    List<ItemStack> list = load(stack, projectileStack, playerEntity);
                    if (world instanceof ServerWorld) {
                        ServerWorld serverWorld = (ServerWorld) world;
                        if (!list.isEmpty()) {
                            // ★ speed scaled by velocityMultiplier; divergence/crit flags unchanged
                            this.shootAll(serverWorld, playerEntity, playerEntity.getActiveHand(), stack,
                                    list, pull * 3.0F * this.velocityMultiplier, 1.0F, pull == 1.0F, (LivingEntity) null);
                        }
                    }

                    world.playSound((Entity) null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(),
                            SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.PLAYERS, 1.0F,
                            1.0F / (world.getRandom().nextFloat() * 0.4F + 1.2F) + pull * 0.5F);

                    playerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
                    return true;
                }
            }
        }
    }

    @Override
    protected void shoot(LivingEntity shooter, ProjectileEntity projectile, int index, float speed, float divergence, float yaw, @Nullable LivingEntity target) {
        // Keep vanilla velocity application (speed already includes our multiplier from shootAll)
        projectile.setVelocity(shooter, shooter.getPitch(), shooter.getYaw() + yaw, 0.0F, speed, divergence);

        // ★ Apply base damage scaling in a vanilla-safe way
        if (projectile instanceof PersistentProjectileEntity arrow) {
            // Vanilla base is 2.0; we set the base before on-hit enchant scaling runs.
            arrow.setDamage(2.0D * this.damageMultiplier);
        }
    }

    // ★ Vanilla curve, scaled by drawSpeedMultiplier (higher = faster charge)
    private float getPullProgressScaled(int useTicks) {
        float f = (float) useTicks / (TICKS_PER_SECOND / this.drawSpeedMultiplier);
        f = (f * f + f * 2.0F) / 3.0F;
        if (f > 1.0F) f = 1.0F;
        return f;
    }

    @Override
    public int getMaxUseTime(ItemStack stack, LivingEntity user) {
        return 72000;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.BOW;
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        boolean hasAmmo = !user.getProjectileType(itemStack).isEmpty();
        if (!user.isInCreativeMode() && !hasAmmo) {
            return ActionResult.FAIL;
        } else {
            user.setCurrentHand(hand);
            return ActionResult.CONSUME;
        }
    }

    @Override
    public Predicate<ItemStack> getProjectiles() {
        return BOW_PROJECTILES;
    }

    @Override
    public int getRange() {
        return RANGE;
    }
}
