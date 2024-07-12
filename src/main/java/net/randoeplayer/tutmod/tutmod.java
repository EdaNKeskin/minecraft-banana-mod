package net.randoeplayer.tutmod;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.randoeplayer.tutmod.block.ModBlocks;
import net.randoeplayer.tutmod.item.ModCreativeModeTabs;
import net.randoeplayer.tutmod.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(tutmod.MOD_ID)
public class tutmod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "tutmod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "tutmod" namespace

    public tutmod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);


    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }


    private void addCreative(CreativeModeTabEvent.BuildContents event){
        if(event.getTab() == CreativeModeTabs.FOOD_AND_DRINKS) {

            event.accept(ModItems.BANANA);
            event.accept(ModItems.GOLDEN_BANANA);
        }

/*
        if(event.getTab() == CreativeModeTabs.TUTORIAL_TAB) {

            event.accept(ModItems.BANANA);
            event.accept(ModItems.GOLDEN_BANANA);
            event.accept(ModBlocks.BANANA_LOG);
            event.accept(ModBlocks.BANANA_PLANK);
            event.accept(ModBlocks.STRIPPED_BANANA_LOG);
        }

*/








        if(event.getTab() == CreativeModeTabs.NATURAL_BLOCKS){
            event.accept(ModBlocks.BANANA_LOG);
        }

        if(event.getTab() == CreativeModeTabs.BUILDING_BLOCKS){
            event.accept(ModBlocks.BANANA_LOG);
            event.accept(ModBlocks.BANANA_PLANK);
            event.accept(ModBlocks.STRIPPED_BANANA_LOG);
        }




    }



    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {



        }
    }
}
