
package net.mcreator.parse.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BananaItem extends Item {
	public BananaItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(10).saturationModifier(10f).build()));
	}
}
