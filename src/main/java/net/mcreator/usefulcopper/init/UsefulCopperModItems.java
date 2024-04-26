
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.usefulcopper.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.usefulcopper.item.WoodenCopperReinforcedSwordItem;
import net.mcreator.usefulcopper.item.WoodenCopperReinforcedShovelItem;
import net.mcreator.usefulcopper.item.WoodenCopperReinforcedPickaxeItem;
import net.mcreator.usefulcopper.item.WoodenCopperReinforcedHoeItem;
import net.mcreator.usefulcopper.item.WoodenCopperReinforcedAxeItem;
import net.mcreator.usefulcopper.item.StoneCopperReinforcedSwordItem;
import net.mcreator.usefulcopper.item.StoneCopperReinforcedShovelItem;
import net.mcreator.usefulcopper.item.StoneCopperReinforcedPickaxeItem;
import net.mcreator.usefulcopper.item.StoneCopperReinforcedHoeItem;
import net.mcreator.usefulcopper.item.StoneCopperReinforcedAxeItem;
import net.mcreator.usefulcopper.item.SteelIngotItem;
import net.mcreator.usefulcopper.item.IronCopperReinforcedSwordItem;
import net.mcreator.usefulcopper.item.IronCopperReinforcedShovelItem;
import net.mcreator.usefulcopper.item.IronCopperReinforcedPickaxeItem;
import net.mcreator.usefulcopper.item.IronCopperReinforcedHoeItem;
import net.mcreator.usefulcopper.item.IronCopperReinforcedAxeItem;
import net.mcreator.usefulcopper.item.CopperTridenttoolItem;
import net.mcreator.usefulcopper.item.CopperSwordItem;
import net.mcreator.usefulcopper.item.CopperShovelItem;
import net.mcreator.usefulcopper.item.CopperRodItem;
import net.mcreator.usefulcopper.item.CopperPickaxeItem;
import net.mcreator.usefulcopper.item.CopperHoeItem;
import net.mcreator.usefulcopper.item.CopperHammerItem;
import net.mcreator.usefulcopper.item.CopperDustItem;
import net.mcreator.usefulcopper.item.CopperDreamsItem;
import net.mcreator.usefulcopper.item.CopperDentItem;
import net.mcreator.usefulcopper.item.CopperCopperReinforcedShovelItem;
import net.mcreator.usefulcopper.item.CopperCopperReinforcedPickaxeItem;
import net.mcreator.usefulcopper.item.CopperCopperReinforcedHoeItem;
import net.mcreator.usefulcopper.item.CopperCopperReinforcedAxeItem;
import net.mcreator.usefulcopper.item.CopperCopperReinforceSwordItem;
import net.mcreator.usefulcopper.item.CopperAxeItem;
import net.mcreator.usefulcopper.item.CopperArmorItem;
import net.mcreator.usefulcopper.UsefulCopperMod;

public class UsefulCopperModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UsefulCopperMod.MODID);
	public static final RegistryObject<Item> COPPER_PICKAXE = REGISTRY.register("copper_pickaxe", () -> new CopperPickaxeItem());
	public static final RegistryObject<Item> COPPER_SWORD = REGISTRY.register("copper_sword", () -> new CopperSwordItem());
	public static final RegistryObject<Item> COPPER_AXE = REGISTRY.register("copper_axe", () -> new CopperAxeItem());
	public static final RegistryObject<Item> COPPER_SHOVEL = REGISTRY.register("copper_shovel", () -> new CopperShovelItem());
	public static final RegistryObject<Item> COPPER_HOE = REGISTRY.register("copper_hoe", () -> new CopperHoeItem());
	public static final RegistryObject<Item> COPPER_DENT = REGISTRY.register("copper_dent", () -> new CopperDentItem());
	public static final RegistryObject<Item> COPPER_TRIDENTTOOL = REGISTRY.register("copper_tridenttool", () -> new CopperTridenttoolItem());
	public static final RegistryObject<Item> COPPER_ROD = REGISTRY.register("copper_rod", () -> new CopperRodItem());
	public static final RegistryObject<Item> WOODEN_COPPER_REINFORCED_SWORD = REGISTRY.register("wooden_copper_reinforced_sword", () -> new WoodenCopperReinforcedSwordItem());
	public static final RegistryObject<Item> STONE_COPPER_REINFORCED_SWORD = REGISTRY.register("stone_copper_reinforced_sword", () -> new StoneCopperReinforcedSwordItem());
	public static final RegistryObject<Item> COPPER_ARMOR_HELMET = REGISTRY.register("copper_armor_helmet", () -> new CopperArmorItem.Helmet());
	public static final RegistryObject<Item> COPPER_ARMOR_CHESTPLATE = REGISTRY.register("copper_armor_chestplate", () -> new CopperArmorItem.Chestplate());
	public static final RegistryObject<Item> COPPER_ARMOR_LEGGINGS = REGISTRY.register("copper_armor_leggings", () -> new CopperArmorItem.Leggings());
	public static final RegistryObject<Item> COPPER_ARMOR_BOOTS = REGISTRY.register("copper_armor_boots", () -> new CopperArmorItem.Boots());
	public static final RegistryObject<Item> COPPER_COPPER_REINFORCE_SWORD = REGISTRY.register("copper_copper_reinforce_sword", () -> new CopperCopperReinforceSwordItem());
	public static final RegistryObject<Item> COPPER_COPPER_REINFORCED_PICKAXE = REGISTRY.register("copper_copper_reinforced_pickaxe", () -> new CopperCopperReinforcedPickaxeItem());
	public static final RegistryObject<Item> WOODEN_COPPER_REINFORCED_AXE = REGISTRY.register("wooden_copper_reinforced_axe", () -> new WoodenCopperReinforcedAxeItem());
	public static final RegistryObject<Item> WOODEN_COPPER_REINFORCED_SHOVEL = REGISTRY.register("wooden_copper_reinforced_shovel", () -> new WoodenCopperReinforcedShovelItem());
	public static final RegistryObject<Item> WOODEN_COPPER_REINFORCED_PICKAXE = REGISTRY.register("wooden_copper_reinforced_pickaxe", () -> new WoodenCopperReinforcedPickaxeItem());
	public static final RegistryObject<Item> WOODEN_COPPER_REINFORCED_HOE = REGISTRY.register("wooden_copper_reinforced_hoe", () -> new WoodenCopperReinforcedHoeItem());
	public static final RegistryObject<Item> STONE_COPPER_REINFORCED_AXE = REGISTRY.register("stone_copper_reinforced_axe", () -> new StoneCopperReinforcedAxeItem());
	public static final RegistryObject<Item> STONE_COPPER_REINFORCED_SHOVEL = REGISTRY.register("stone_copper_reinforced_shovel", () -> new StoneCopperReinforcedShovelItem());
	public static final RegistryObject<Item> STONE_COPPER_REINFORCED_PICKAXE = REGISTRY.register("stone_copper_reinforced_pickaxe", () -> new StoneCopperReinforcedPickaxeItem());
	public static final RegistryObject<Item> STONE_COPPER_REINFORCED_HOE = REGISTRY.register("stone_copper_reinforced_hoe", () -> new StoneCopperReinforcedHoeItem());
	public static final RegistryObject<Item> IRON_COPPER_REINFORCED_SWORD = REGISTRY.register("iron_copper_reinforced_sword", () -> new IronCopperReinforcedSwordItem());
	public static final RegistryObject<Item> IRON_COPPER_REINFORCED_SHOVEL = REGISTRY.register("iron_copper_reinforced_shovel", () -> new IronCopperReinforcedShovelItem());
	public static final RegistryObject<Item> IRON_COPPER_REINFORCED_PICKAXE = REGISTRY.register("iron_copper_reinforced_pickaxe", () -> new IronCopperReinforcedPickaxeItem());
	public static final RegistryObject<Item> IRON_COPPER_REINFORCED_AXE = REGISTRY.register("iron_copper_reinforced_axe", () -> new IronCopperReinforcedAxeItem());
	public static final RegistryObject<Item> IRON_COPPER_REINFORCED_HOE = REGISTRY.register("iron_copper_reinforced_hoe", () -> new IronCopperReinforcedHoeItem());
	public static final RegistryObject<Item> COPPER_COPPER_REINFORCED_SHOVEL = REGISTRY.register("copper_copper_reinforced_shovel", () -> new CopperCopperReinforcedShovelItem());
	public static final RegistryObject<Item> COPPER_COPPER_REINFORCED_HOE = REGISTRY.register("copper_copper_reinforced_hoe", () -> new CopperCopperReinforcedHoeItem());
	public static final RegistryObject<Item> COPPER_COPPER_REINFORCED_AXE = REGISTRY.register("copper_copper_reinforced_axe", () -> new CopperCopperReinforcedAxeItem());
	public static final RegistryObject<Item> COPPER_BRICKS = block(UsefulCopperModBlocks.COPPER_BRICKS);
	public static final RegistryObject<Item> COPPER_DREAMS = REGISTRY.register("copper_dreams", () -> new CopperDreamsItem());
	public static final RegistryObject<Item> COPPER_DUST = REGISTRY.register("copper_dust", () -> new CopperDustItem());
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> COPPER_HAMMER = REGISTRY.register("copper_hammer", () -> new CopperHammerItem());
	public static final RegistryObject<Item> COPPER_LOG = block(UsefulCopperModBlocks.COPPER_LOG);
	public static final RegistryObject<Item> COPPER_LEAVES = block(UsefulCopperModBlocks.COPPER_LEAVES);
	public static final RegistryObject<Item> COPPER_GRASS = block(UsefulCopperModBlocks.COPPER_GRASS);
	public static final RegistryObject<Item> COPPER_DIRT = block(UsefulCopperModBlocks.COPPER_DIRT);
	public static final RegistryObject<Item> COPPER_PLANKS = block(UsefulCopperModBlocks.COPPER_PLANKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
