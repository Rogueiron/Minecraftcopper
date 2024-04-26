
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.usefulcopper.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.usefulcopper.UsefulCopperMod;

public class UsefulCopperModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, UsefulCopperMod.MODID);
	public static final RegistryObject<SoundEvent> COPPERDREAM = REGISTRY.register("copperdream", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("useful_copper", "copperdream")));
}
