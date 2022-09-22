package net.limitless.prism.block;

import net.limitless.prism.Prism;
import net.limitless.prism.block.custom.*;
import net.limitless.prism.item.ModCreativeModeTab;
import net.limitless.prism.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Prism.MOD_ID);

    public static final RegistryObject<Block> GRASS = registerBlock("grass",
            () -> new Grass(BlockBehaviour.Properties.of(Material.GRASS)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TERRAIN_TAB);

    public static final RegistryObject<Block> SAND = registerBlock("sand",
            () -> new Sand(BlockBehaviour.Properties.of(Material.SAND)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TERRAIN_TAB);

    public static final RegistryObject<Block> STONE = registerBlock("stone",
            () -> new Stone(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TERRAIN_TAB);

    public static final RegistryObject<Block> COARSE_DIRT = registerBlock("coarse_dirt",
            () -> new CoarseDirt(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TERRAIN_TAB);

    public static final RegistryObject<Block> DIRT = registerBlock("dirt",
            () -> new Dirt(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TERRAIN_TAB);

    public static final RegistryObject<Block> ANDESITE = registerBlock("andesite",
            () -> new Andesite(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TERRAIN_TAB);

    public static final RegistryObject<Block> DIORITE = registerBlock("diorite",
            () -> new Diorite(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TERRAIN_TAB);

    public static final RegistryObject<Block> GRANITE = registerBlock("granite",
            () -> new Granite(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TERRAIN_TAB);

    public static final RegistryObject<Block> MUD = registerBlock("mud",
            () -> new Mud(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TERRAIN_TAB);


    public static final RegistryObject<Block> VILLAGE_BLOCK = registerBlock("village_block",
            () -> new VillageBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);

    public static final RegistryObject<Block> DIRTY_COBBLESTONE = registerBlock("dirty_cobblestone",
            () -> new DirtyCobblestone(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);

    public static final RegistryObject<Block> CASTLE_BLOCK = registerBlock("castle_block",
            () -> new CastleBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);

    public static final RegistryObject<Block> CASTLE_BLOCK_TOP = registerBlock("castle_block_top",
            () -> new CastleBlockTop(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);

    public static final RegistryObject<Block> CASTLE_BLOCK_WINDOW = registerBlock("castle_block_window",
            () -> new CastleBlockWindow(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);

    public static final RegistryObject<Block> WOODEN_WALL = registerBlock("wooden_wall",
            () -> new WoodenWall(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);

    public static final RegistryObject<Block> WOODEN_FLOOR = registerBlock("wooden_floor",
            () -> new WoodenFloor(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);

    public static final RegistryObject<Block> THATCHED_ROOF = registerBlock("thatched_roof",
            () -> new ThatchedRoof(BlockBehaviour.Properties.of(Material.LEAVES)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);

    public static final RegistryObject<Block> HOUSE_WALL = registerBlock("house_wall",
            () -> new HouseWall(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);

    public static final RegistryObject<Block> HOUSE_TUDOR_WALL = registerBlock("house_tudor_wall",
            () -> new HouseTudorWall(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);

    public static final RegistryObject<Block> HOUSE_TUDOR_WALL_EXTRA = registerBlock("house_tudor_wall_extra",
            () -> new HouseTudorWallExtra(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);

    public static final RegistryObject<Block> STAIRS = registerBlock("stairs",
            () -> new Stairs(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);


    public static final RegistryObject<Block> PALM_LEAVES_TOP = registerBlock("palm_leaves_top",
            () -> new PalmLeavesTop(BlockBehaviour.Properties.of(Material.LEAVES)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.NATURAL_TAB);

    public static final RegistryObject<Block> PALM_LOG_BIG = registerBlock("palm_log_big",
            () -> new PalmLogBig(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.NATURAL_TAB);

    public static final RegistryObject<Block> PALM_LOG_THIN = registerBlock("palm_log_thin",
            () -> new PalmLogThin(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.NATURAL_TAB);

    public static final RegistryObject<Block> PALM_SAPLING = registerBlock("palm_sapling",
            () -> new PalmSapling(BlockBehaviour.Properties.of(Material.LEAVES)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.NATURAL_TAB);


    public static final RegistryObject<Block> DINING_ROOM_CHAIR = registerBlock("dining_room_chair",
            () -> new DiningRoomChair(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.FURNITURE_TAB);


    public static final RegistryObject<Block> BREAKFAST_SAVORY = registerBlock("breakfast_savory",
            () -> new BreakfastSavory(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.DECORATION_TAB);

    public static final RegistryObject<Block> BREAKFAST_SWEET = registerBlock("breakfast_sweet",
            () -> new BreakfastSweet(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.DECORATION_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
