package net.lazic.smislicu.item;

import net.lazic.smislicu.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab RANDOM_AHH_TAB = new CreativeModeTab("random_ahh_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.BLOCK_OF_ALEKSANDAR_CORLUKA.get());
        }
    };
}
