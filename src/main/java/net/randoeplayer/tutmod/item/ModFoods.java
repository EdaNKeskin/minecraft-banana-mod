package net.randoeplayer.tutmod.item;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties GOLDEN_BANANA = new FoodProperties.Builder().
            nutrition(6)
            .saturationMod(1.2F)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 100, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 2000, 0), 1.0F)
            .alwaysEat().build();

    public static final FoodProperties BANANA = new FoodProperties.Builder().
            nutrition(4)
            .saturationMod(1.2F)
            .alwaysEat().build();
}
