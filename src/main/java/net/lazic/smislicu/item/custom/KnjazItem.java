package net.lazic.smislicu.item.custom;

import net.minecraft.server.commands.EffectCommands;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

import java.util.ArrayList;
import java.util.List;

public class KnjazItem extends Item {
    public KnjazItem(Properties pProperties) {
        super(pProperties);
    }
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.DRINK;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        player.startUsingItem(hand);
        return InteractionResultHolder.consume(player.getItemInHand(hand));
    }
    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity entity) {
        if (!world.isClientSide && entity instanceof Player) {
            Player player = (Player) entity;

            // ✅ Safely remove only negative effects
            List<MobEffect> toRemove = new ArrayList<>();
            for (MobEffectInstance effect : player.getActiveEffects()) {
                if (effect.getEffect().getCategory() == MobEffectCategory.HARMFUL) {
                    toRemove.add(effect.getEffect());
                }
            }
            for (MobEffect effect : toRemove) {
                player.removeEffect(effect);
            }

            // ➕ Add your effects
            player.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 6000, 9));
            player.addEffect(new MobEffectInstance(MobEffects.SATURATION, 6000, 2));
            player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 6000, 2));
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 1));
            player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 6000, 2));
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 6000, 3));
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6000, 2));

            // 🎯 Shrink item if not in creative
            if (!player.getAbilities().instabuild) {
                stack.shrink(1);
            }

        }

        return stack.isEmpty() ? ItemStack.EMPTY : stack;
    }



}
