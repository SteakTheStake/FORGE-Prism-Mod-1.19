package net.limitless.prism.item;

import net.limitless.prism.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TERRAIN_TAB = new CreativeModeTab("terrain") {
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
    public static final CreativeModeTab FURNITURE_TAB = new CreativeModeTab("furniture") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.DINING_ROOM_CHAIR.get());
        }
    };
    public static final CreativeModeTab NATURAL_TAB = new CreativeModeTab("natural") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.PALM_LEAVES_TOP.get());
        }
    };
    public static final CreativeModeTab DECORATION_TAB = new CreativeModeTab("decoration") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.BREAKFAST_SAVORY.get());
        }
    };
}