
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.usefulcopper.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.usefulcopper.client.renderer.CopperTridentThrowRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class UsefulCopperModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(UsefulCopperModEntities.COPPER_TRIDENT_THROW.get(), CopperTridentThrowRenderer::new);
	}
}
