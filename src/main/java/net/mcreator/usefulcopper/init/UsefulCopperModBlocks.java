
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.usefulcopper.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.usefulcopper.block.CopperPlanksBlock;
import net.mcreator.usefulcopper.block.CopperLogBlock;
import net.mcreator.usefulcopper.block.CopperLeavesBlock;
import net.mcreator.usefulcopper.block.CopperGrassBlock;
import net.mcreator.usefulcopper.block.CopperDirtBlock;
import net.mcreator.usefulcopper.block.CopperBricksBlock;
import net.mcreator.usefulcopper.UsefulCopperMod;

public class UsefulCopperModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, UsefulCopperMod.MODID);
	public static final RegistryObject<Block> COPPER_BRICKS = REGISTRY.register("copper_bricks", () -> new CopperBricksBlock());
	public static final RegistryObject<Block> COPPER_LOG = REGISTRY.register("copper_log", () -> new CopperLogBlock());
	public static final RegistryObject<Block> COPPER_LEAVES = REGISTRY.register("copper_leaves", () -> new CopperLeavesBlock());
	public static final RegistryObject<Block> COPPER_GRASS = REGISTRY.register("copper_grass", () -> new CopperGrassBlock());
	public static final RegistryObject<Block> COPPER_DIRT = REGISTRY.register("copper_dirt", () -> new CopperDirtBlock());
	public static final RegistryObject<Block> COPPER_PLANKS = REGISTRY.register("copper_planks", () -> new CopperPlanksBlock());
}
