
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.parse.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import net.mcreator.parse.ParseMod;

public class ParseModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, ParseMod.MODID);
	public static final DeferredHolder<Potion, Potion> BOO = REGISTRY.register("boo", () -> new Potion(new MobEffectInstance(ParseModMobEffects.BOMB, 3600, 0, false, true)));
}
