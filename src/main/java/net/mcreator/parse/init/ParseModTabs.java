
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
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

			tabData.accept(ParseModBlocks.CYAN_ORE.get().asItem());
			tabData.accept(ParseModBlocks.CYAN_BLOCK.get().asItem());
			tabData.accept(ParseModBlocks.YELLO_ORE.get().asItem());
			tabData.accept(ParseModBlocks.YELLO_BLOCK.get().asItem());

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

		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {

			tabData.accept(ParseModItems.CYAN.get());
			tabData.accept(ParseModItems.YELLO.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(ParseModItems.CYAN_PICKAXE.get());
			tabData.accept(ParseModItems.CYAN_AXE.get());
			tabData.accept(ParseModItems.CYAN_SHOVEL.get());
			tabData.accept(ParseModItems.CYAN_HOE.get());
			tabData.accept(ParseModItems.YELLO_PICKAXE.get());
			tabData.accept(ParseModItems.YELLO_AXE.get());
			tabData.accept(ParseModItems.YELLO_SHOVEL.get());
			tabData.accept(ParseModItems.YELLO_HOE.get());

		}
	}
}
