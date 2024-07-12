package net.randoeplayer.tutmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.randoeplayer.tutmod.tutmod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, tutmod.MOD_ID);

    /*
    public static final RegistryObject<Item> BANANA = ITEMS.register("banana",
            ()-> new Item(new Item.Properties()));


    public static final RegistryObject<Item> GOLDEN_BANANA = ITEMS.register("golden_banana",
            ()-> new Item(new Item.Properties()));


    */

    public static final RegistryObject<Item> BANANA = ITEMS.register("banana",
            ()-> new Item(new Item.Properties().food(ModFoods.BANANA)));


    public static final RegistryObject<Item> GOLDEN_BANANA = ITEMS.register("golden_banana",
            ()-> new Item(new Item.Properties().food(ModFoods.GOLDEN_BANANA)));




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
