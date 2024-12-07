
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.parse.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.parse.item.YelloSwordItem;
import net.mcreator.parse.item.YelloShovelItem;
import net.mcreator.parse.item.YelloPickaxeItem;
import net.mcreator.parse.item.YelloItem;
import net.mcreator.parse.item.YelloHoeItem;
import net.mcreator.parse.item.YelloAxeItem;
import net.mcreator.parse.item.YelloArmorItem;
import net.mcreator.parse.item.GreenSwordItem;
import net.mcreator.parse.item.GreenShovelItem;
import net.mcreator.parse.item.GreenPickaxeItem;
import net.mcreator.parse.item.GreenItem;
import net.mcreator.parse.item.GreenHoeItem;
import net.mcreator.parse.item.GreenAxeItem;
import net.mcreator.parse.item.GreenArmorItem;
import net.mcreator.parse.item.DifferentfoodsItem;
import net.mcreator.parse.item.CyanSwordItem;
import net.mcreator.parse.item.CyanShovelItem;
import net.mcreator.parse.item.CyanPickaxeItem;
import net.mcreator.parse.item.CyanItem;
import net.mcreator.parse.item.CyanHoeItem;
import net.mcreator.parse.item.CyanAxeItem;
import net.mcreator.parse.item.CyanArmorItem;
import net.mcreator.parse.item.BananaItem;
import net.mcreator.parse.ParseMod;

public class ParseModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ParseMod.MODID);
	public static final DeferredItem<Item> CYAN = REGISTRY.register("cyan", CyanItem::new);
	public static final DeferredItem<Item> CYAN_ORE = block(ParseModBlocks.CYAN_ORE);
	public static final DeferredItem<Item> CYAN_BLOCK = block(ParseModBlocks.CYAN_BLOCK);
	public static final DeferredItem<Item> CYAN_PICKAXE = REGISTRY.register("cyan_pickaxe", CyanPickaxeItem::new);
	public static final DeferredItem<Item> CYAN_AXE = REGISTRY.register("cyan_axe", CyanAxeItem::new);
	public static final DeferredItem<Item> CYAN_SWORD = REGISTRY.register("cyan_sword", CyanSwordItem::new);
	public static final DeferredItem<Item> CYAN_SHOVEL = REGISTRY.register("cyan_shovel", CyanShovelItem::new);
	public static final DeferredItem<Item> CYAN_HOE = REGISTRY.register("cyan_hoe", CyanHoeItem::new);
	public static final DeferredItem<Item> CYAN_ARMOR_HELMET = REGISTRY.register("cyan_armor_helmet", CyanArmorItem.Helmet::new);
	public static final DeferredItem<Item> CYAN_ARMOR_CHESTPLATE = REGISTRY.register("cyan_armor_chestplate", CyanArmorItem.Chestplate::new);
	public static final DeferredItem<Item> CYAN_ARMOR_LEGGINGS = REGISTRY.register("cyan_armor_leggings", CyanArmorItem.Leggings::new);
	public static final DeferredItem<Item> CYAN_ARMOR_BOOTS = REGISTRY.register("cyan_armor_boots", CyanArmorItem.Boots::new);
	public static final DeferredItem<Item> YELLO = REGISTRY.register("yello", YelloItem::new);
	public static final DeferredItem<Item> YELLO_ORE = block(ParseModBlocks.YELLO_ORE);
	public static final DeferredItem<Item> YELLO_BLOCK = block(ParseModBlocks.YELLO_BLOCK);
	public static final DeferredItem<Item> YELLO_PICKAXE = REGISTRY.register("yello_pickaxe", YelloPickaxeItem::new);
	public static final DeferredItem<Item> YELLO_AXE = REGISTRY.register("yello_axe", YelloAxeItem::new);
	public static final DeferredItem<Item> YELLO_SWORD = REGISTRY.register("yello_sword", YelloSwordItem::new);
	public static final DeferredItem<Item> YELLO_SHOVEL = REGISTRY.register("yello_shovel", YelloShovelItem::new);
	public static final DeferredItem<Item> YELLO_HOE = REGISTRY.register("yello_hoe", YelloHoeItem::new);
	public static final DeferredItem<Item> YELLO_ARMOR_HELMET = REGISTRY.register("yello_armor_helmet", YelloArmorItem.Helmet::new);
	public static final DeferredItem<Item> YELLO_ARMOR_CHESTPLATE = REGISTRY.register("yello_armor_chestplate", YelloArmorItem.Chestplate::new);
	public static final DeferredItem<Item> YELLO_ARMOR_LEGGINGS = REGISTRY.register("yello_armor_leggings", YelloArmorItem.Leggings::new);
	public static final DeferredItem<Item> YELLO_ARMOR_BOOTS = REGISTRY.register("yello_armor_boots", YelloArmorItem.Boots::new);
	public static final DeferredItem<Item> BANANA = REGISTRY.register("banana", BananaItem::new);
	public static final DeferredItem<Item> BANANA_BLOCK = block(ParseModBlocks.BANANA_BLOCK);
	public static final DeferredItem<Item> DIFFERENTFOODS = REGISTRY.register("differentfoods", DifferentfoodsItem::new);
	public static final DeferredItem<Item> GREEN = REGISTRY.register("green", GreenItem::new);
	public static final DeferredItem<Item> GREEN_ORE = block(ParseModBlocks.GREEN_ORE);
	public static final DeferredItem<Item> GREEN_BLOCK = block(ParseModBlocks.GREEN_BLOCK);
	public static final DeferredItem<Item> GREEN_PICKAXE = REGISTRY.register("green_pickaxe", GreenPickaxeItem::new);
	public static final DeferredItem<Item> GREEN_AXE = REGISTRY.register("green_axe", GreenAxeItem::new);
	public static final DeferredItem<Item> GREEN_SWORD = REGISTRY.register("green_sword", GreenSwordItem::new);
	public static final DeferredItem<Item> GREEN_SHOVEL = REGISTRY.register("green_shovel", GreenShovelItem::new);
	public static final DeferredItem<Item> GREEN_HOE = REGISTRY.register("green_hoe", GreenHoeItem::new);
	public static final DeferredItem<Item> GREEN_ARMOR_HELMET = REGISTRY.register("green_armor_helmet", GreenArmorItem.Helmet::new);
	public static final DeferredItem<Item> GREEN_ARMOR_CHESTPLATE = REGISTRY.register("green_armor_chestplate", GreenArmorItem.Chestplate::new);
	public static final DeferredItem<Item> GREEN_ARMOR_LEGGINGS = REGISTRY.register("green_armor_leggings", GreenArmorItem.Leggings::new);
	public static final DeferredItem<Item> GREEN_ARMOR_BOOTS = REGISTRY.register("green_armor_boots", GreenArmorItem.Boots::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
