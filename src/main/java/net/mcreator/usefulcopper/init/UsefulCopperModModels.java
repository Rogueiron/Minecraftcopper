
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.usefulcopper.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.usefulcopper.client.model.ModelTridentCopper_Converted;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class UsefulCopperModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelTridentCopper_Converted.LAYER_LOCATION, ModelTridentCopper_Converted::createBodyLayer);
	}
}
