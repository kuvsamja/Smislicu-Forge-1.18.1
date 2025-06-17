package net.lazic.smislicu.item;

import net.lazic.smislicu.Smislicu;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.lwjgl.system.CallbackI;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Smislicu.MOD_ID);

    public static final RegistryObject<Item> BIRGEROVA_KREMA = ITEMS.register("birgerova_krema",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RANDOM_AHH_TAB).food(ModFoods.BIRGEROVA_KREMA)));

    public static final RegistryObject<Item> TOMIC = ITEMS.register("tomic",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RANDOM_AHH_TAB)));

    public static final RegistryObject<Item> SIGMIUM_INGOT = ITEMS.register("sigmium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RANDOM_AHH_TAB)));

    public static final RegistryObject<Item> RAW_SIGMIUM = ITEMS.register("raw_sigmium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RANDOM_AHH_TAB)));

    public static final RegistryObject<Item> NIS = ITEMS.register("nis",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RANDOM_AHH_TAB)));

    public static final RegistryObject<Item> ANINA_VODKA = ITEMS.register("anina_vodka",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.RANDOM_AHH_TAB)
                    .food(ModFoods.ANINA_VODKA)
                    .stacksTo(16)));

    public static final RegistryObject<Item> KNJAZ = ITEMS.register("knjaz",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.RANDOM_AHH_TAB)
                    .food(ModFoods.KNJAZ)
                    .stacksTo(16)));

    public static final RegistryObject<Item> BECKA = ITEMS.register("becka",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.RANDOM_AHH_TAB)
                    .food(ModFoods.BECKA)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
