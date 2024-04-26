
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.usefulcopper.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.usefulcopper.UsefulCopperMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UsefulCopperModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UsefulCopperMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(UsefulCopperModBlocks.COPPER_BRICKS.get().asItem());
			tabData.accept(UsefulCopperModBlocks.COPPER_LOG.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(UsefulCopperModItems.COPPER_DENT.get());
			tabData.accept(UsefulCopperModItems.COPPER_TRIDENTTOOL.get());
			tabData.accept(UsefulCopperModItems.WOODEN_COPPER_REINFORCED_SWORD.get());
			tabData.accept(UsefulCopperModItems.STONE_COPPER_REINFORCED_SWORD.get());
			tabData.accept(UsefulCopperModItems.COPPER_ARMOR_HELMET.get());
			tabData.accept(UsefulCopperModItems.COPPER_ARMOR_CHESTPLATE.get());
			tabData.accept(UsefulCopperModItems.COPPER_ARMOR_LEGGINGS.get());
			tabData.accept(UsefulCopperModItems.COPPER_ARMOR_BOOTS.get());
			tabData.accept(UsefulCopperModItems.COPPER_COPPER_REINFORCE_SWORD.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(UsefulCopperModItems.COPPER_DUST.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(UsefulCopperModItems.COPPER_PICKAXE.get());
			tabData.accept(UsefulCopperModItems.COPPER_SWORD.get());
			tabData.accept(UsefulCopperModItems.COPPER_AXE.get());
			tabData.accept(UsefulCopperModItems.COPPER_SHOVEL.get());
			tabData.accept(UsefulCopperModItems.COPPER_HOE.get());
			tabData.accept(UsefulCopperModItems.COPPER_COPPER_REINFORCED_PICKAXE.get());
			tabData.accept(UsefulCopperModItems.WOODEN_COPPER_REINFORCED_AXE.get());
			tabData.accept(UsefulCopperModItems.WOODEN_COPPER_REINFORCED_SHOVEL.get());
			tabData.accept(UsefulCopperModItems.WOODEN_COPPER_REINFORCED_PICKAXE.get());
			tabData.accept(UsefulCopperModItems.WOODEN_COPPER_REINFORCED_HOE.get());
			tabData.accept(UsefulCopperModItems.STONE_COPPER_REINFORCED_AXE.get());
			tabData.accept(UsefulCopperModItems.STONE_COPPER_REINFORCED_SHOVEL.get());
			tabData.accept(UsefulCopperModItems.STONE_COPPER_REINFORCED_PICKAXE.get());
			tabData.accept(UsefulCopperModItems.STONE_COPPER_REINFORCED_HOE.get());
			tabData.accept(UsefulCopperModItems.IRON_COPPER_REINFORCED_SWORD.get());
			tabData.accept(UsefulCopperModItems.IRON_COPPER_REINFORCED_SHOVEL.get());
			tabData.accept(UsefulCopperModItems.IRON_COPPER_REINFORCED_PICKAXE.get());
			tabData.accept(UsefulCopperModItems.IRON_COPPER_REINFORCED_AXE.get());
			tabData.accept(UsefulCopperModItems.IRON_COPPER_REINFORCED_HOE.get());
			tabData.accept(UsefulCopperModItems.COPPER_COPPER_REINFORCED_SHOVEL.get());
			tabData.accept(UsefulCopperModItems.COPPER_COPPER_REINFORCED_HOE.get());
			tabData.accept(UsefulCopperModItems.COPPER_COPPER_REINFORCED_AXE.get());
			tabData.accept(UsefulCopperModItems.COPPER_DREAMS.get());
			tabData.accept(UsefulCopperModItems.COPPER_HAMMER.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(UsefulCopperModBlocks.COPPER_LEAVES.get().asItem());
			tabData.accept(UsefulCopperModBlocks.COPPER_GRASS.get().asItem());
			tabData.accept(UsefulCopperModBlocks.COPPER_DIRT.get().asItem());
			tabData.accept(UsefulCopperModBlocks.COPPER_PLANKS.get().asItem());
		}
	}
}
