package net.fabricmc.bmin;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.bmin.helpers.MyButtonBlock;
import net.fabricmc.bmin.helpers.MyPressurePlate;
import net.fabricmc.bmin.helpers.MyStairsBlock;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BetterMinerals implements ModInitializer {
	
		// MAKE INSTANCES OF NEW BLOCKS

		// Cobblestone
		public static final Block ANDESITE_COBBLESTONE = new Block(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final Block DIORITE_COBBLESTONE = new Block(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final Block GRANITE_COBBLESTONE = new Block(FabricBlockSettings.copy(Blocks.STONE).build());

		// Bricks
		public static final Block ANDESITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final Block DIORITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final Block GRANITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.STONE).build());

		// Mossy Cobblestone
		public static final Block MOSSY_ANDESITE_COBBLESTONE = new Block(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final Block MOSSY_DIORITE_COBBLESTONE = new Block(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final Block MOSSY_GRANITE_COBBLESTONE = new Block(FabricBlockSettings.copy(Blocks.STONE).build());

		// Mossy Bricks
		public static final Block MOSSY_ANDESITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final Block MOSSY_DIORITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final Block MOSSY_GRANITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.STONE).build());

		// Cracked Bricks
		public static final Block CRACKED_ANDESITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final Block CRACKED_DIORITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final Block CRACKED_GRANITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.STONE).build());

		// Chiseled Bricks
		public static final Block CHISELED_ANDESITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final Block CHISELED_DIORITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final Block CHISELED_GRANITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.STONE).build());

		// Cobblestone Stairs
		public static final MyStairsBlock ANDESITE_COBBLESTONE_STAIRS = new MyStairsBlock(ANDESITE_COBBLESTONE,FabricBlockSettings.copy(Blocks.STONE).build());
		public static final MyStairsBlock DIORITE_COBBLESTONE_STAIRS = new MyStairsBlock(DIORITE_COBBLESTONE,FabricBlockSettings.copy(Blocks.STONE).build());
		public static final MyStairsBlock GRANITE_COBBLESTONE_STAIRS = new MyStairsBlock(GRANITE_COBBLESTONE,FabricBlockSettings.copy(Blocks.STONE).build());

		// Brick Stairs
		public static final MyStairsBlock ANDESITE_BRICK_STAIRS = new MyStairsBlock(ANDESITE_BRICKS,FabricBlockSettings.copy(Blocks.STONE).build());
		public static final MyStairsBlock DIORITE_BRICK_STAIRS = new MyStairsBlock(DIORITE_BRICKS,FabricBlockSettings.copy(Blocks.STONE).build());
		public static final MyStairsBlock GRANITE_BRICK_STAIRS = new MyStairsBlock(GRANITE_BRICKS,FabricBlockSettings.copy(Blocks.STONE).build());

		// Mossy Cobblestone Stairs
		public static final MyStairsBlock MOSSY_ANDESITE_COBBLESTONE_STAIRS = new MyStairsBlock(MOSSY_ANDESITE_COBBLESTONE,FabricBlockSettings.copy(Blocks.STONE).build());
		public static final MyStairsBlock MOSSY_DIORITE_COBBLESTONE_STAIRS = new MyStairsBlock(MOSSY_DIORITE_COBBLESTONE,FabricBlockSettings.copy(Blocks.STONE).build());
		public static final MyStairsBlock MOSSY_GRANITE_COBBLESTONE_STAIRS = new MyStairsBlock(MOSSY_GRANITE_COBBLESTONE,FabricBlockSettings.copy(Blocks.STONE).build());

		// Mossy Brick Stairs
		public static final MyStairsBlock MOSSY_ANDESITE_BRICK_STAIRS = new MyStairsBlock(MOSSY_ANDESITE_BRICKS,FabricBlockSettings.copy(Blocks.STONE).build());
		public static final MyStairsBlock MOSSY_DIORITE_BRICK_STAIRS = new MyStairsBlock(MOSSY_DIORITE_BRICKS,FabricBlockSettings.copy(Blocks.STONE).build());
		public static final MyStairsBlock MOSSY_GRANITE_BRICK_STAIRS = new MyStairsBlock(MOSSY_GRANITE_BRICKS,FabricBlockSettings.copy(Blocks.STONE).build());

		// Cobblestone Wall
		public static final WallBlock ANDESITE_COBBLESTONE_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final WallBlock DIORITE_COBBLESTONE_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final WallBlock GRANITE_COBBLESTONE_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.STONE).build());

		// Brick Wall
		public static final WallBlock ANDESITE_BRICK_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final WallBlock DIORITE_BRICK_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final WallBlock GRANITE_BRICK_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.STONE).build());

		// Mossy Cobblestone Wall
		public static final WallBlock MOSSY_ANDESITE_COBBLESTONE_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final WallBlock MOSSY_DIORITE_COBBLESTONE_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final WallBlock MOSSY_GRANITE_COBBLESTONE_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.STONE).build());

		// Mossy Brick Wall
		public static final WallBlock MOSSY_ANDESITE_BRICK_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final WallBlock MOSSY_DIORITE_BRICK_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final WallBlock MOSSY_GRANITE_BRICK_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.STONE).build());

		// Cobblestone Slab
		public static final SlabBlock ANDESITE_COBBLESTONE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final SlabBlock DIORITE_COBBLESTONE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final SlabBlock GRANITE_COBBLESTONE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.STONE).build());
		
		// Brick Slab
		public static final SlabBlock ANDESITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final SlabBlock DIORITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final SlabBlock GRANITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.STONE).build());

		// Mossy Cobblestone Slab
		public static final SlabBlock MOSSY_ANDESITE_COBBLESTONE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final SlabBlock MOSSY_DIORITE_COBBLESTONE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final SlabBlock MOSSY_GRANITE_COBBLESTONE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.STONE).build());
		
		// Mossy Brick Slab
		public static final SlabBlock MOSSY_ANDESITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final SlabBlock MOSSY_DIORITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final SlabBlock MOSSY_GRANITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.STONE).build());

		// Buttons
		public static final MyButtonBlock ANDESITE_BUTTON = new MyButtonBlock(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final MyButtonBlock DIORITE_BUTTON = new MyButtonBlock(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final MyButtonBlock GRANITE_BUTTON = new MyButtonBlock(FabricBlockSettings.copy(Blocks.STONE).build());

		// Pressure Plates
		public static final MyPressurePlate ANDESITE_PRESSURE_PLATE = new MyPressurePlate(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final MyPressurePlate DIORITE_PRESSURE_PLATE = new MyPressurePlate(FabricBlockSettings.copy(Blocks.STONE).build());
		public static final MyPressurePlate GRANITE_PRESSURE_PLATE = new MyPressurePlate(FabricBlockSettings.copy(Blocks.STONE).build());

		@Override
		public void onInitialize() {
			
			// REGISTERING NEW BLOCKS

			// Cobblestone
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "andesite_cobblestone"), ANDESITE_COBBLESTONE);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "diorite_cobblestone"), DIORITE_COBBLESTONE);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "granite_cobblestone"), GRANITE_COBBLESTONE);

			// Bricks
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "andesite_bricks"), ANDESITE_BRICKS);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "diorite_bricks"), DIORITE_BRICKS);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "granite_bricks"), GRANITE_BRICKS);

			// Mossy Cobblestone
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "mossy_andesite_cobblestone"), MOSSY_ANDESITE_COBBLESTONE);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "mossy_diorite_cobblestone"), MOSSY_DIORITE_COBBLESTONE);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "mossy_granite_cobblestone"), MOSSY_GRANITE_COBBLESTONE);

			// Mossy Bricks
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "mossy_andesite_bricks"), MOSSY_ANDESITE_BRICKS);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "mossy_diorite_bricks"), MOSSY_DIORITE_BRICKS);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "mossy_granite_bricks"), MOSSY_GRANITE_BRICKS);

			// Cracked Bricks
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "cracked_andesite_bricks"), CRACKED_ANDESITE_BRICKS);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "cracked_diorite_bricks"), CRACKED_DIORITE_BRICKS);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "cracked_granite_bricks"), CRACKED_GRANITE_BRICKS);

			// Chiseled Bricks
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "chiseled_andesite_bricks"), CHISELED_ANDESITE_BRICKS);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "chiseled_diorite_bricks"), CHISELED_DIORITE_BRICKS);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "chiseled_granite_bricks"), CHISELED_GRANITE_BRICKS);

			// Cobblestone Stairs
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "andesite_cobblestone_stairs"), ANDESITE_COBBLESTONE_STAIRS);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "diorite_cobblestone_stairs"), DIORITE_COBBLESTONE_STAIRS);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "granite_cobblestone_stairs"), GRANITE_COBBLESTONE_STAIRS);

			// Brick Stairs
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "andesite_brick_stairs"), ANDESITE_BRICK_STAIRS);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "diorite_brick_stairs"), DIORITE_BRICK_STAIRS);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "granite_brick_stairs"), GRANITE_BRICK_STAIRS);

			// Mossy Cobblestone Stairs
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "mossy_andesite_cobblestone_stairs"), MOSSY_ANDESITE_COBBLESTONE_STAIRS);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "mossy_diorite_cobblestone_stairs"), MOSSY_DIORITE_COBBLESTONE_STAIRS);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "mossy_granite_cobblestone_stairs"), MOSSY_GRANITE_COBBLESTONE_STAIRS);

			// Mossy Brick Stairs
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "mossy_andesite_brick_stairs"), MOSSY_ANDESITE_BRICK_STAIRS);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "mossy_diorite_brick_stairs"), MOSSY_DIORITE_BRICK_STAIRS);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "mossy_granite_brick_stairs"), MOSSY_GRANITE_BRICK_STAIRS);

			// Cobblestone Wall
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "andesite_cobblestone_wall"), ANDESITE_COBBLESTONE_WALL);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "diorite_cobblestone_wall"), DIORITE_COBBLESTONE_WALL);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "granite_cobblestone_wall"), GRANITE_COBBLESTONE_WALL);

			// Brick Wall
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "andesite_brick_wall"), ANDESITE_BRICK_WALL);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "diorite_brick_wall"), DIORITE_BRICK_WALL);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "granite_brick_wall"), GRANITE_BRICK_WALL);

			// Mossy Cobblestone Wall
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "mossy_andesite_cobblestone_wall"), MOSSY_ANDESITE_COBBLESTONE_WALL);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "mossy_diorite_cobblestone_wall"), MOSSY_DIORITE_COBBLESTONE_WALL);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "mossy_granite_cobblestone_wall"), MOSSY_GRANITE_COBBLESTONE_WALL);

			// Mossy Brick Wall
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "mossy_andesite_brick_wall"), MOSSY_ANDESITE_BRICK_WALL);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "mossy_diorite_brick_wall"), MOSSY_DIORITE_BRICK_WALL);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "mossy_granite_brick_wall"), MOSSY_GRANITE_BRICK_WALL);

			// Cobblestone Slab
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "andesite_cobblestone_slab"), ANDESITE_COBBLESTONE_SLAB);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "diorite_cobblestone_slab"), DIORITE_COBBLESTONE_SLAB);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "granite_cobblestone_slab"), GRANITE_COBBLESTONE_SLAB);

			// Brick Slab
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "andesite_brick_slab"), ANDESITE_BRICK_SLAB);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "diorite_brick_slab"), DIORITE_BRICK_SLAB);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "granite_brick_slab"), GRANITE_BRICK_SLAB);

			// Mossy Cobblestone Slab
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "mossy_andesite_cobblestone_slab"), MOSSY_ANDESITE_COBBLESTONE_SLAB);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "mossy_diorite_cobblestone_slab"), MOSSY_DIORITE_COBBLESTONE_SLAB);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "mossy_granite_cobblestone_slab"), MOSSY_GRANITE_COBBLESTONE_SLAB);

			// Mossy Brick Slab
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "mossy_andesite_brick_slab"), MOSSY_ANDESITE_BRICK_SLAB);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "mossy_diorite_brick_slab"), MOSSY_DIORITE_BRICK_SLAB);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "mossy_granite_brick_slab"), MOSSY_GRANITE_BRICK_SLAB);

			// Buttons
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "andesite_button"), ANDESITE_BUTTON);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "diorite_button"), DIORITE_BUTTON);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "granite_button"), GRANITE_BUTTON);

			// Pressure Plates
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "andesite_pressure_plate"), ANDESITE_PRESSURE_PLATE);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "diorite_pressure_plate"), DIORITE_PRESSURE_PLATE);
			Registry.register(Registry.BLOCK, new Identifier("better-minerals", "granite_pressure_plate"), GRANITE_PRESSURE_PLATE);

			// REGISTERING BLOCKITEMS

			// Cobblestone
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "andesite_cobblestone"), new BlockItem(ANDESITE_COBBLESTONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "diorite_cobblestone"), new BlockItem(DIORITE_COBBLESTONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "granite_cobblestone"), new BlockItem(GRANITE_COBBLESTONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

			// Bricks
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "andesite_bricks"), new BlockItem(ANDESITE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "diorite_bricks"), new BlockItem(DIORITE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "granite_bricks"), new BlockItem(GRANITE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

			// Mossy Cobblestone
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "mossy_andesite_cobblestone"), new BlockItem(MOSSY_ANDESITE_COBBLESTONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "mossy_diorite_cobblestone"), new BlockItem(MOSSY_DIORITE_COBBLESTONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "mossy_granite_cobblestone"), new BlockItem(MOSSY_GRANITE_COBBLESTONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

			// Mossy Bricks
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "mossy_andesite_bricks"), new BlockItem(MOSSY_ANDESITE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "mossy_diorite_bricks"), new BlockItem(MOSSY_DIORITE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "mossy_granite_bricks"), new BlockItem(MOSSY_GRANITE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

			// Cracked Bricks
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "cracked_andesite_bricks"), new BlockItem(CRACKED_ANDESITE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "cracked_diorite_bricks"), new BlockItem(CRACKED_DIORITE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "cracked_granite_bricks"), new BlockItem(CRACKED_GRANITE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

			// Chiseled Bricks
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "chiseled_andesite_bricks"), new BlockItem(CHISELED_ANDESITE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "chiseled_diorite_bricks"), new BlockItem(CHISELED_DIORITE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "chiseled_granite_bricks"), new BlockItem(CHISELED_GRANITE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

			// Cobblestone Stairs
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "andesite_cobblestone_stairs"), new BlockItem(ANDESITE_COBBLESTONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "diorite_cobblestone_stairs"), new BlockItem(DIORITE_COBBLESTONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "granite_cobblestone_stairs"), new BlockItem(GRANITE_COBBLESTONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

			// Brick Stairs
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "andesite_brick_stairs"), new BlockItem(ANDESITE_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "diorite_brick_stairs"), new BlockItem(DIORITE_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "granite_brick_stairs"), new BlockItem(GRANITE_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

			// Mossy Cobblestone Stairs
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "mossy_andesite_cobblestone_stairs"), new BlockItem(MOSSY_ANDESITE_COBBLESTONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "mossy_diorite_cobblestone_stairs"), new BlockItem(MOSSY_DIORITE_COBBLESTONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "mossy_granite_cobblestone_stairs"), new BlockItem(MOSSY_GRANITE_COBBLESTONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

			// Mossy Brick Stairs
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "mossy_andesite_brick_stairs"), new BlockItem(MOSSY_ANDESITE_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "mossy_diorite_brick_stairs"), new BlockItem(MOSSY_DIORITE_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "mossy_granite_brick_stairs"), new BlockItem(MOSSY_GRANITE_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

			// Cobblestone Wall
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "andesite_cobblestone_wall"), new BlockItem(ANDESITE_COBBLESTONE_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "diorite_cobblestone_wall"), new BlockItem(DIORITE_COBBLESTONE_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "granite_cobblestone_wall"), new BlockItem(GRANITE_COBBLESTONE_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

			// Brick Wall
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "andesite_brick_wall"), new BlockItem(ANDESITE_BRICK_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "diorite_brick_wall"), new BlockItem(DIORITE_BRICK_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "granite_brick_wall"), new BlockItem(GRANITE_BRICK_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

			// Mossy Cobblestone Wall
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "mossy_andesite_cobblestone_wall"), new BlockItem(MOSSY_ANDESITE_COBBLESTONE_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "mossy_diorite_cobblestone_wall"), new BlockItem(MOSSY_DIORITE_COBBLESTONE_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "mossy_granite_cobblestone_wall"), new BlockItem(MOSSY_GRANITE_COBBLESTONE_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

			// Mossy Brick Wall
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "mossy_andesite_brick_wall"), new BlockItem(MOSSY_ANDESITE_BRICK_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "mossy_diorite_brick_wall"), new BlockItem(MOSSY_DIORITE_BRICK_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "mossy_granite_brick_wall"), new BlockItem(MOSSY_GRANITE_BRICK_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

			// Cobblestone Slab
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "andesite_cobblestone_slab"), new BlockItem(ANDESITE_COBBLESTONE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "diorite_cobblestone_slab"), new BlockItem(DIORITE_COBBLESTONE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "granite_cobblestone_slab"), new BlockItem(GRANITE_COBBLESTONE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

			// Brick Slab
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "andesite_brick_slab"), new BlockItem(ANDESITE_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "diorite_brick_slab"), new BlockItem(DIORITE_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "granite_brick_slab"), new BlockItem(GRANITE_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

			// Mossy Cobblestone Slab
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "mossy_andesite_cobblestone_slab"), new BlockItem(MOSSY_ANDESITE_COBBLESTONE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "mossy_diorite_cobblestone_slab"), new BlockItem(MOSSY_DIORITE_COBBLESTONE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "mossy_granite_cobblestone_slab"), new BlockItem(MOSSY_GRANITE_COBBLESTONE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

			// Mossy Brick Slab
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "mossy_andesite_brick_slab"), new BlockItem(MOSSY_ANDESITE_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "mossy_diorite_brick_slab"), new BlockItem(MOSSY_DIORITE_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "mossy_granite_brick_slab"), new BlockItem(MOSSY_GRANITE_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

			// Buttons
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "andesite_button"), new BlockItem(ANDESITE_BUTTON, new Item.Settings().group(ItemGroup.REDSTONE)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "diorite_button"), new BlockItem(DIORITE_BUTTON, new Item.Settings().group(ItemGroup.REDSTONE)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "granite_button"), new BlockItem(GRANITE_BUTTON, new Item.Settings().group(ItemGroup.REDSTONE)));

			// Pressure Plates
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "andesite_pressure_plate"), new BlockItem(ANDESITE_PRESSURE_PLATE, new Item.Settings().group(ItemGroup.REDSTONE)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "diorite_pressure_plate"), new BlockItem(DIORITE_PRESSURE_PLATE, new Item.Settings().group(ItemGroup.REDSTONE)));
			Registry.register(Registry.ITEM, new Identifier("better-minerals", "granite_pressure_plate"), new BlockItem(GRANITE_PRESSURE_PLATE, new Item.Settings().group(ItemGroup.REDSTONE)));

		}
	
}