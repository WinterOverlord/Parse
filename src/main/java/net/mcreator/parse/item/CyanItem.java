
package net.mcreator.parse.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CyanItem extends Item {
	public CyanItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
