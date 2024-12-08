
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
import net.mcreator.parse.item.YelloOreworldItem;
import net.mcreator.parse.item.YelloItem;
import net.mcreator.parse.item.YelloHoeItem;
import net.mcreator.parse.item.YelloAxeItem;
import net.mcreator.parse.item.YelloArmorItem;
import net.mcreator.parse.item.PinkWordeItem;
import net.mcreator.parse.item.PinkSwordItem;
import net.mcreator.parse.item.PinkShovelItem;
import net.mcreator.parse.item.PinkPickaxeItem;
import net.mcreator.parse.item.PinkItem;
import net.mcreator.parse.item.PinkHoeItem;
import net.mcreator.parse.item.PinkAxeItem;
import net.mcreator.parse.item.PinkArmorItem;
import net.mcreator.parse.item.GreyWordeItem;
import net.mcreator.parse.item.GreySwordItem;
import net.mcreator.parse.item.GreyShovelItem;
import net.mcreator.parse.item.GreyPickaxeItem;
import net.mcreator.parse.item.GreyItem;
import net.mcreator.parse.item.GreyHoeItem;
import net.mcreator.parse.item.GreyAxeItem;
import net.mcreator.parse.item.GreyArmorItem;
import net.mcreator.parse.item.GreenWordeItem;
import net.mcreator.parse.item.GreenSwordItem;
import net.mcreator.parse.item.GreenShovelItem;
import net.mcreator.parse.item.GreenPickaxeItem;
import net.mcreator.parse.item.GreenItem;
import net.mcreator.parse.item.GreenHoeItem;
import net.mcreator.parse.item.GreenAxeItem;
import net.mcreator.parse.item.GreenArmorItem;
import net.mcreator.parse.item.FriedeggItem;
import net.mcreator.parse.item.DifferentfoodsItem;
import net.mcreator.parse.item.CyanSwordItem;
import net.mcreator.parse.item.CyanShovelItem;
import net.mcreator.parse.item.CyanPickaxeItem;
import net.mcreator.parse.item.CyanOreworldItem;
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
	public static final DeferredItem<Item> CYAN_OREWORLD = REGISTRY.register("cyan_oreworld", CyanOreworldItem::new);
	public static final DeferredItem<Item> YELLO_OREWORLD = REGISTRY.register("yello_oreworld", YelloOreworldItem::new);
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
	public static final DeferredItem<Item> GREEN_WORDE = REGISTRY.register("green_worde", GreenWordeItem::new);
	public static final DeferredItem<Item> GREY = REGISTRY.register("grey", GreyItem::new);
	public static final DeferredItem<Item> GREY_ORE = block(ParseModBlocks.GREY_ORE);
	public static final DeferredItem<Item> GREY_BLOCK = block(ParseModBlocks.GREY_BLOCK);
	public static final DeferredItem<Item> GREY_PICKAXE = REGISTRY.register("grey_pickaxe", GreyPickaxeItem::new);
	public static final DeferredItem<Item> GREY_AXE = REGISTRY.register("grey_axe", GreyAxeItem::new);
	public static final DeferredItem<Item> GREY_SWORD = REGISTRY.register("grey_sword", GreySwordItem::new);
	public static final DeferredItem<Item> GREY_SHOVEL = REGISTRY.register("grey_shovel", GreyShovelItem::new);
	public static final DeferredItem<Item> GREY_HOE = REGISTRY.register("grey_hoe", GreyHoeItem::new);
	public static final DeferredItem<Item> GREY_ARMOR_HELMET = REGISTRY.register("grey_armor_helmet", GreyArmorItem.Helmet::new);
	public static final DeferredItem<Item> GREY_ARMOR_CHESTPLATE = REGISTRY.register("grey_armor_chestplate", GreyArmorItem.Chestplate::new);
	public static final DeferredItem<Item> GREY_ARMOR_LEGGINGS = REGISTRY.register("grey_armor_leggings", GreyArmorItem.Leggings::new);
	public static final DeferredItem<Item> GREY_ARMOR_BOOTS = REGISTRY.register("grey_armor_boots", GreyArmorItem.Boots::new);
	public static final DeferredItem<Item> GREY_WORDE = REGISTRY.register("grey_worde", GreyWordeItem::new);
	public static final DeferredItem<Item> PINK = REGISTRY.register("pink", PinkItem::new);
	public static final DeferredItem<Item> PINK_ORE = block(ParseModBlocks.PINK_ORE);
	public static final DeferredItem<Item> PINK_BLOCK = block(ParseModBlocks.PINK_BLOCK);
	public static final DeferredItem<Item> PINK_PICKAXE = REGISTRY.register("pink_pickaxe", PinkPickaxeItem::new);
	public static final DeferredItem<Item> PINK_AXE = REGISTRY.register("pink_axe", PinkAxeItem::new);
	public static final DeferredItem<Item> PINK_SWORD = REGISTRY.register("pink_sword", PinkSwordItem::new);
	public static final DeferredItem<Item> PINK_SHOVEL = REGISTRY.register("pink_shovel", PinkShovelItem::new);
	public static final DeferredItem<Item> PINK_HOE = REGISTRY.register("pink_hoe", PinkHoeItem::new);
	public static final DeferredItem<Item> PINK_ARMOR_HELMET = REGISTRY.register("pink_armor_helmet", PinkArmorItem.Helmet::new);
	public static final DeferredItem<Item> PINK_ARMOR_CHESTPLATE = REGISTRY.register("pink_armor_chestplate", PinkArmorItem.Chestplate::new);
	public static final DeferredItem<Item> PINK_ARMOR_LEGGINGS = REGISTRY.register("pink_armor_leggings", PinkArmorItem.Leggings::new);
	public static final DeferredItem<Item> PINK_ARMOR_BOOTS = REGISTRY.register("pink_armor_boots", PinkArmorItem.Boots::new);
	public static final DeferredItem<Item> PINK_WORDE = REGISTRY.register("pink_worde", PinkWordeItem::new);
	public static final DeferredItem<Item> FRIEDEGG = REGISTRY.register("friedegg", FriedeggItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
