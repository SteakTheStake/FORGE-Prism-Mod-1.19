package net.limitless.prism.item;

import net.limitless.prism.Prism;
import net.limitless.prism.block.custom.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Prism.MOD_ID);
/**
    public static final RegistryObject<Item> GRASS_BLOCK = ITEMS.register("grass_block",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TERRAIN_TAB)));
**/
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}