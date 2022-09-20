package net.limitless.prism.item;

import net.limitless.prism.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TERRAIN_TAB = new CreativeModeTab("terraintab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.GRASS.get());
        }
    };
    public static final CreativeModeTab CONSTRUCTION_TAB = new CreativeModeTab("construction") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.CASTLE_BLOCK.get());
        }
    };
    public static final CreativeModeTab NATURAL_TAB = new CreativeModeTab("natural") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.PALM_LEAVES_TOP.get());
        }
    };
}