package net.randoeplayer.tutmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.randoeplayer.tutmod.block.ModBlocks;
import net.randoeplayer.tutmod.tutmod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = tutmod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs{
    public static CreativeModeTab TUTORIAL_TAB;

    // doesnt work
    /*
    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        TUTORIAL_TAB = event.registerCreativeModeTab(new ResourceLocation(tutmod.MOD_ID, "tutorial_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.BANANA.get()))
                        .title(Component.translatable("creativemodetab.tutorial_tab")));
    }

     */



    /* doesn't work
    //1.20 + 1.9.3 combined
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, tutmod.MOD_ID);
    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BANANA.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BANANA);
                        pOutput.accept(ModItems.GOLDEN_BANANA);
                        pOutput.accept(ModBlocks.BANANA_LOG);
                        pOutput.accept(ModBlocks.BANANA_PLANK);
                        pOutput.accept(ModBlocks.STRIPPED_BANANA_LOG);

                    })
                    .build());

     */

}
