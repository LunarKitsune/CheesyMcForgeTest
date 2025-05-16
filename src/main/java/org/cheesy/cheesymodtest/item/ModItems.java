package org.cheesy.cheesymodtest.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.cheesy.cheesymodtest.Cheesymodtest;


public class ModItems {

    //deferredRegister now binds item with base registry type
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Cheesymodtest.MOD_ID);

    /*registers an item to memory for an event which will
      eventually be fired/triggered to create item.

      This is for my understanding specifically here to
      reference this project and learn from
    */
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    /*

    Both of these register objects to forge which will be picked up in the minecraft
    mod.

    Needs a setID method where you define in it Items.key("itemName"). The "key" will
    be the ID

     */
    public static final RegistryObject<Item> CHEESITE = ITEMS.register(
            "cheesite",
            () -> new Item(new Item.Properties().setId(ITEMS.key("cheesite"))));

}
