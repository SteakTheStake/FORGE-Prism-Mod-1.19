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


    public static final RegistryObject<Block> BIGARCH = registerBlock("big_arch",
            () -> new BigArch(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);


    public static final RegistryObject<Block> WOODEN_WALL_PIECE = registerBlock("wooden_wall_piece",
            () -> new WoodenWallPiece(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);


    public static final RegistryObject<Block> SHOP_COVER_LEFT = registerBlock("shop_cover_left",
            () -> new ShopCoverLeft(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);


    public static final RegistryObject<Block> SHOP_COVER_MIDDLE = registerBlock("shop_cover_middle",
            () -> new ShopCoverMiddle(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);


    public static final RegistryObject<Block> SHOP_COVER_RIGHT = registerBlock("shop_cover_right",
            () -> new ShopCoverRight(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);


    public static final RegistryObject<Block> DESERT_FLOOR_TILES = registerBlock("desert_floor_tiles",
            () -> new DesertFloorTiles(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);


    public static final RegistryObject<Block> RED_DESERT_FLOOR_TILES = registerBlock("red_desert_floor_tiles",
            () -> new RedDesertFloorTiles(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);


    public static final RegistryObject<Block> MARBLE_TILES = registerBlock("marble_tiles",
            () -> new MarbleTiles(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);


    public static final RegistryObject<Block> DESERT_BRICK_WINDOW = registerBlock("desert_brick_window",
            () -> new DesertBrickWindow(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);


    public static final RegistryObject<Block> DESERT_FLOOR = registerBlock("desert_floor",
            () -> new DesertFloor(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);


    public static final RegistryObject<Block> DESERT_BRICK = registerBlock("desert_brick",
            () -> new DesertBrick(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);


    public static final RegistryObject<Block> DESERT_BRICK_TOP = registerBlock("desert_brick_top",
            () -> new DesertBrickTop(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);


    public static final RegistryObject<Block> DESERT_BRICK_ARCH = registerBlock("desert_brick_arch",
            () -> new DesertBrickArch(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);


    public static final RegistryObject<Block> DESERT_BRICK_WALL = registerBlock("desert_brick_wall",
            () -> new DesertBrickWall(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);


    public static final RegistryObject<Block> DESERT_BRICK_FLOOR = registerBlock("desert_brick_floor",
            () -> new DesertBrickFloor(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);


    public static final RegistryObject<Block> WOODEN_WALL_OUTSIDE = registerBlock("wooden_wall_outside",
            () -> new WoodenWallOutside(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CONSTRUCTION_TAB);


/**---------------------------------------------------------------**/

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

    public static final RegistryObject<Block> TROPICAL_PLANT = registerBlock("tropical_plant",
            () -> new TropicalPlant(BlockBehaviour.Properties.of(Material.LEAVES)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.NATURAL_TAB);

    /**---------------------------------------------------------------**/

    public static final RegistryObject<Block> DINING_ROOM_CHAIR = registerBlock("dining_room_chair",
            () -> new DiningRoomChair(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.FURNITURE_TAB);

    /**---------------------------------------------------------------**/

    public static final RegistryObject<Block> BREAKFAST_SAVORY = registerBlock("breakfast_savory",
            () -> new BreakfastSavory(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.DECORATION_TAB);

    public static final RegistryObject<Block> BREAKFAST_SWEET = registerBlock("breakfast_sweet",
            () -> new BreakfastSweet(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.DECORATION_TAB);

    public static final RegistryObject<Block> ROPE = registerBlock("rope",
            () -> new Rope(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.DECORATION_TAB);

    public static final RegistryObject<Block> CLOTHES_ONE = registerBlock("clothes_1",
            () -> new ClothesOne(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.DECORATION_TAB);

    public static final RegistryObject<Block> CLOTHES_TWO = registerBlock("clothes_2",
            () -> new ClothesTwo(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.DECORATION_TAB);

    public static final RegistryObject<Block> CLOTHES_THREE = registerBlock("clothes_3",
            () -> new ClothesThree(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.DECORATION_TAB);

    public static final RegistryObject<Block> BASKET_OF_POTATO = registerBlock("basket_of_potato",
            () -> new BasketOfPotato(BlockBehaviour.Properties.of(Material.STONE)
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
