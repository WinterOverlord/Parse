
package net.mcreator.parse.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.parse.procedures.BombDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure;

public class BombMobEffect extends MobEffect {
	public BombMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		BombDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
	}
}
