package org.cheesy.cheesymodtest.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.cheesy.cheesymodtest.Cheesymodtest;
import org.cheesy.cheesymodtest.item.ModItems;

public class ModBlocks extends Block {
    public ModBlocks(Properties properties) {
        super(properties);
    }

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Cheesymodtest.MOD_ID);

    private static <T extends Block> void registerBlockItem(string name,
                                                            RegistryObject<T> block)
    {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().setId(BLOCKS.key(name))));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
