package net.lazic.smislicu.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties BIRGEROVA_KREMA = (new FoodProperties.Builder()).fast().nutrition(1)
            .saturationMod(0.0F)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 600, 0), 1F)
            .build();

    public static final FoodProperties ANINA_VODKA = (new FoodProperties.Builder()).fast()
            .effect(new MobEffectInstance(MobEffects.HUNGER, 1800, 1), 1F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1800, 3), 1F)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 1800, 0), 1F)
            .alwaysEat()
            .build();

    public static final FoodProperties KNJAZ = (new FoodProperties.Builder()).nutrition(20)
            .saturationMod(1.0F)
            .alwaysEat()
            .build();

    public static final FoodProperties BECKA = (new FoodProperties.Builder()).nutrition(20)
            .saturationMod(100.0F)
            .effect(new MobEffectInstance(MobEffects.SATURATION, 6000, 50), 1F)
            .build();
}
