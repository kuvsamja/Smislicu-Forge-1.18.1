package net.lazic.smislicu.item;

import net.lazic.smislicu.Smislicu;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.lwjgl.system.CallbackI;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Smislicu.MOD_ID);

    public static final RegistryObject<Item> BIRGEROVAKREMA = ITEMS.register("birgerovakrema",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RANDOM_AHH_TAB)));

    public static final RegistryObject<Item> TOMIC = ITEMS.register("tomic",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RANDOM_AHH_TAB)));

    public static final RegistryObject<Item> SIGMIUM_INGOT = ITEMS.register("sigmium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RANDOM_AHH_TAB)));

    public static final RegistryObject<Item> RAW_SIGMIUM = ITEMS.register("raw_sigmium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RANDOM_AHH_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
