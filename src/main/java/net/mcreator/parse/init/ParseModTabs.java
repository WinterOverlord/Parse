
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.parse.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.parse.ParseMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class ParseModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ParseMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PARSE_MODTAGS = REGISTRY.register("parse_modtags",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.parse.parse_modtags")).icon(() -> new ItemStack(ParseModItems.CYAN.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ParseModItems.CYAN.get());
				tabData.accept(ParseModBlocks.CYAN_ORE.get().asItem());
				tabData.accept(ParseModBlocks.CYAN_BLOCK.get().asItem());
				tabData.accept(ParseModItems.CYAN_PICKAXE.get());
				tabData.accept(ParseModItems.CYAN_AXE.get());
				tabData.accept(ParseModItems.CYAN_SWORD.get());
				tabData.accept(ParseModItems.CYAN_SHOVEL.get());
				tabData.accept(ParseModItems.CYAN_HOE.get());
				tabData.accept(ParseModItems.CYAN_ARMOR_HELMET.get());
				tabData.accept(ParseModItems.CYAN_ARMOR_CHESTPLATE.get());
				tabData.accept(ParseModItems.CYAN_ARMOR_LEGGINGS.get());
				tabData.accept(ParseModItems.CYAN_ARMOR_BOOTS.get());
				tabData.accept(ParseModItems.YELLO.get());
				tabData.accept(ParseModBlocks.YELLO_ORE.get().asItem());
				tabData.accept(ParseModBlocks.YELLO_BLOCK.get().asItem());
				tabData.accept(ParseModItems.YELLO_PICKAXE.get());
				tabData.accept(ParseModItems.YELLO_AXE.get());
				tabData.accept(ParseModItems.YELLO_SWORD.get());
				tabData.accept(ParseModItems.YELLO_SHOVEL.get());
				tabData.accept(ParseModItems.YELLO_HOE.get());
				tabData.accept(ParseModItems.YELLO_ARMOR_HELMET.get());
				tabData.accept(ParseModItems.YELLO_ARMOR_CHESTPLATE.get());
				tabData.accept(ParseModItems.YELLO_ARMOR_LEGGINGS.get());
				tabData.accept(ParseModItems.YELLO_ARMOR_BOOTS.get());
				tabData.accept(ParseModItems.CYAN_OREWORLD.get());
				tabData.accept(ParseModItems.YELLO_OREWORLD.get());
				tabData.accept(ParseModItems.DIFFERENTFOODS.get());
				tabData.accept(ParseModItems.GREEN.get());
				tabData.accept(ParseModBlocks.GREEN_ORE.get().asItem());
				tabData.accept(ParseModBlocks.GREEN_BLOCK.get().asItem());
				tabData.accept(ParseModItems.GREEN_PICKAXE.get());
				tabData.accept(ParseModItems.GREEN_AXE.get());
				tabData.accept(ParseModItems.GREEN_SWORD.get());
				tabData.accept(ParseModItems.GREEN_SHOVEL.get());
				tabData.accept(ParseModItems.GREEN_HOE.get());
				tabData.accept(ParseModItems.GREEN_WORDE.get());
				tabData.accept(ParseModItems.GREY.get());
				tabData.accept(ParseModBlocks.GREY_ORE.get().asItem());
				tabData.accept(ParseModBlocks.GREY_BLOCK.get().asItem());
				tabData.accept(ParseModItems.GREY_PICKAXE.get());
				tabData.accept(ParseModItems.GREY_AXE.get());
				tabData.accept(ParseModItems.GREY_SWORD.get());
				tabData.accept(ParseModItems.GREY_SHOVEL.get());
				tabData.accept(ParseModItems.GREY_HOE.get());
				tabData.accept(ParseModItems.GREY_ARMOR_HELMET.get());
				tabData.accept(ParseModItems.GREY_ARMOR_CHESTPLATE.get());
				tabData.accept(ParseModItems.GREY_ARMOR_LEGGINGS.get());
				tabData.accept(ParseModItems.GREY_ARMOR_BOOTS.get());
				tabData.accept(ParseModItems.GREY_WORDE.get());
				tabData.accept(ParseModItems.PINK.get());
				tabData.accept(ParseModBlocks.PINK_ORE.get().asItem());
				tabData.accept(ParseModBlocks.PINK_BLOCK.get().asItem());
				tabData.accept(ParseModItems.PINK_PICKAXE.get());
				tabData.accept(ParseModItems.PINK_AXE.get());
				tabData.accept(ParseModItems.PINK_SWORD.get());
				tabData.accept(ParseModItems.PINK_SHOVEL.get());
				tabData.accept(ParseModItems.PINK_HOE.get());
				tabData.accept(ParseModItems.PINK_WORDE.get());
				tabData.accept(ParseModItems.FRIEDEGG.get());
				tabData.accept(ParseModItems.PURPLE.get());
				tabData.accept(ParseModBlocks.PURPLE_ORE.get().asItem());
				tabData.accept(ParseModBlocks.PURPLE_BLOCK.get().asItem());
				tabData.accept(ParseModItems.PURPLE_PICKAXE.get());
				tabData.accept(ParseModItems.PURPLE_AXE.get());
				tabData.accept(ParseModItems.PURPLE_SWORD.get());
				tabData.accept(ParseModItems.PURPLE_SHOVEL.get());
				tabData.accept(ParseModItems.PURPLE_HOE.get());
				tabData.accept(ParseModItems.PURPLE_ARMOR_HELMET.get());
				tabData.accept(ParseModItems.PURPLE_ARMOR_CHESTPLATE.get());
				tabData.accept(ParseModItems.PURPLE_ARMOR_LEGGINGS.get());
				tabData.accept(ParseModItems.PURPLE_ARMOR_BOOTS.get());
				tabData.accept(ParseModItems.PURPLE_WORLD.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(ParseModItems.CYAN.get());
			tabData.accept(ParseModItems.YELLO.get());
			tabData.accept(ParseModItems.GREEN.get());
			tabData.accept(ParseModItems.GREY.get());
			tabData.accept(ParseModItems.PINK.get());
			tabData.accept(ParseModItems.PURPLE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(ParseModBlocks.CYAN_ORE.get().asItem());
			tabData.accept(ParseModBlocks.CYAN_BLOCK.get().asItem());
			tabData.accept(ParseModBlocks.YELLO_ORE.get().asItem());
			tabData.accept(ParseModBlocks.YELLO_BLOCK.get().asItem());
			tabData.accept(ParseModBlocks.GREEN_ORE.get().asItem());
			tabData.accept(ParseModBlocks.GREEN_BLOCK.get().asItem());
			tabData.accept(ParseModBlocks.GREY_ORE.get().asItem());
			tabData.accept(ParseModBlocks.GREY_BLOCK.get().asItem());
			tabData.accept(ParseModBlocks.PINK_ORE.get().asItem());
			tabData.accept(ParseModBlocks.PINK_BLOCK.get().asItem());
			tabData.accept(ParseModBlocks.PURPLE_ORE.get().asItem());
			tabData.accept(ParseModBlocks.PURPLE_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(ParseModItems.CYAN_PICKAXE.get());
			tabData.accept(ParseModItems.CYAN_AXE.get());
			tabData.accept(ParseModItems.CYAN_SHOVEL.get());
			tabData.accept(ParseModItems.CYAN_HOE.get());
			tabData.accept(ParseModItems.YELLO_PICKAXE.get());
			tabData.accept(ParseModItems.YELLO_AXE.get());
			tabData.accept(ParseModItems.YELLO_SHOVEL.get());
			tabData.accept(ParseModItems.YELLO_HOE.get());
			tabData.accept(ParseModItems.CYAN_OREWORLD.get());
			tabData.accept(ParseModItems.YELLO_OREWORLD.get());
			tabData.accept(ParseModItems.GREEN_PICKAXE.get());
			tabData.accept(ParseModItems.GREEN_AXE.get());
			tabData.accept(ParseModItems.GREEN_SHOVEL.get());
			tabData.accept(ParseModItems.GREEN_HOE.get());
			tabData.accept(ParseModItems.GREEN_WORDE.get());
			tabData.accept(ParseModItems.GREY_PICKAXE.get());
			tabData.accept(ParseModItems.GREY_AXE.get());
			tabData.accept(ParseModItems.GREY_SHOVEL.get());
			tabData.accept(ParseModItems.GREY_HOE.get());
			tabData.accept(ParseModItems.GREY_WORDE.get());
			tabData.accept(ParseModItems.PINK_PICKAXE.get());
			tabData.accept(ParseModItems.PINK_AXE.get());
			tabData.accept(ParseModItems.PINK_SHOVEL.get());
			tabData.accept(ParseModItems.PINK_HOE.get());
			tabData.accept(ParseModItems.PINK_WORDE.get());
			tabData.accept(ParseModItems.PURPLE_PICKAXE.get());
			tabData.accept(ParseModItems.PURPLE_AXE.get());
			tabData.accept(ParseModItems.PURPLE_SHOVEL.get());
			tabData.accept(ParseModItems.PURPLE_HOE.get());
			tabData.accept(ParseModItems.PURPLE_WORLD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(ParseModItems.CYAN_SWORD.get());
			tabData.accept(ParseModItems.CYAN_ARMOR_HELMET.get());
			tabData.accept(ParseModItems.CYAN_ARMOR_CHESTPLATE.get());
			tabData.accept(ParseModItems.CYAN_ARMOR_LEGGINGS.get());
			tabData.accept(ParseModItems.CYAN_ARMOR_BOOTS.get());
			tabData.accept(ParseModItems.YELLO_SWORD.get());
			tabData.accept(ParseModItems.YELLO_ARMOR_HELMET.get());
			tabData.accept(ParseModItems.YELLO_ARMOR_CHESTPLATE.get());
			tabData.accept(ParseModItems.YELLO_ARMOR_LEGGINGS.get());
			tabData.accept(ParseModItems.YELLO_ARMOR_BOOTS.get());
			tabData.accept(ParseModItems.GREEN_SWORD.get());
			tabData.accept(ParseModItems.GREEN_ARMOR_HELMET.get());
			tabData.accept(ParseModItems.GREEN_ARMOR_CHESTPLATE.get());
			tabData.accept(ParseModItems.GREEN_ARMOR_LEGGINGS.get());
			tabData.accept(ParseModItems.GREEN_ARMOR_BOOTS.get());
			tabData.accept(ParseModItems.GREY_SWORD.get());
			tabData.accept(ParseModItems.GREY_ARMOR_HELMET.get());
			tabData.accept(ParseModItems.GREY_ARMOR_CHESTPLATE.get());
			tabData.accept(ParseModItems.GREY_ARMOR_LEGGINGS.get());
			tabData.accept(ParseModItems.GREY_ARMOR_BOOTS.get());
			tabData.accept(ParseModItems.PINK_SWORD.get());
			tabData.accept(ParseModItems.PINK_ARMOR_HELMET.get());
			tabData.accept(ParseModItems.PINK_ARMOR_CHESTPLATE.get());
			tabData.accept(ParseModItems.PINK_ARMOR_LEGGINGS.get());
			tabData.accept(ParseModItems.PINK_ARMOR_BOOTS.get());
			tabData.accept(ParseModItems.PURPLE_SWORD.get());
			tabData.accept(ParseModItems.PURPLE_ARMOR_HELMET.get());
			tabData.accept(ParseModItems.PURPLE_ARMOR_CHESTPLATE.get());
			tabData.accept(ParseModItems.PURPLE_ARMOR_LEGGINGS.get());
			tabData.accept(ParseModItems.PURPLE_ARMOR_BOOTS.get());
		}
	}
}
