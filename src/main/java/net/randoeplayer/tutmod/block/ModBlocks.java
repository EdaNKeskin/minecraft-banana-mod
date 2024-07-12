
package net.randoeplayer.tutmod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.randoeplayer.tutmod.block.customwood.ModFlammableRotatedPillarBlock;
import net.randoeplayer.tutmod.item.ModCreativeModeTabs;
import net.randoeplayer.tutmod.item.ModItems;
import net.randoeplayer.tutmod.tutmod;

import java.util.function.Supplier;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, tutmod.MOD_ID);

    /*  For non log items, this would've worked. but i gotta change this to use the ModFlammableRotatePillar Thing
    public static final RegistryObject<Block> BANANA_LOG = registerblock("banana_log",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .destroyTime(3).strength(2)));
    public static final RegistryObject<Block> STRIPPED_BANANA_LOG = registerblock("stripped_banana_log",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .destroyTime(3).strength(2)));
    public static final RegistryObject<Block> BANANA_PLANK = registerblock("banana_plank",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD) //idk if the material.wood does anything tbh
                    .destroyTime(3).strength(2)));
    */

    public static final RegistryObject<Block> BANANA_LOG = registerblock("banana_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .destroyTime(3).strength(2))
            {// honestly i got no clue why this is necessary. kinda still works without it. maybe the burnign is worse though..?
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
    }}//--------
            );
    public static final RegistryObject<Block> STRIPPED_BANANA_LOG = registerblock("stripped_banana_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .destroyTime(3).strength(2)){
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
    }});


    public static final RegistryObject<Block> BANANA_PLANK = registerblock("banana_plank",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .destroyTime(3).strength(2)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
    }});





    private static <T extends Block> RegistryObject<T> registerblock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }





    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));

    }




    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}


