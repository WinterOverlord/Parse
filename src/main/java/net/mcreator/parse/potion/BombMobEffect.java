
package net.mcreator.parse.potion;

import net.neoforged.neoforge.common.EffectCures;
import net.neoforged.neoforge.common.EffectCure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.parse.procedures.BombDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure;

import java.util.Set;

public class BombMobEffect extends MobEffect {
	public BombMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public void fillEffectCures(Set<EffectCure> cures, MobEffectInstance effectInstance) {
		cures.add(EffectCures.MILK);
		cures.add(EffectCures.PROTECTED_BY_TOTEM);
		cures.add(EffectCures.HONEY);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		BombDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
	}
}
