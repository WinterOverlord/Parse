
package net.mcreator.parse.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GreyItem extends Item {
	public GreyItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
