
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.parse.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.parse.block.YelloOreworldPortalBlock;
import net.mcreator.parse.block.YelloOreBlock;
import net.mcreator.parse.block.YelloBlockBlock;
import net.mcreator.parse.block.PinkWordePortalBlock;
import net.mcreator.parse.block.PinkOreBlock;
import net.mcreator.parse.block.PinkBlockBlock;
import net.mcreator.parse.block.GreyWordePortalBlock;
import net.mcreator.parse.block.GreyOreBlock;
import net.mcreator.parse.block.GreyBlockBlock;
import net.mcreator.parse.block.GreenWordePortalBlock;
import net.mcreator.parse.block.GreenOreBlock;
import net.mcreator.parse.block.GreenBlockBlock;
import net.mcreator.parse.block.CyanOreworldPortalBlock;
import net.mcreator.parse.block.CyanOreBlock;
import net.mcreator.parse.block.CyanBlockBlock;
import net.mcreator.parse.block.BananaBlockBlock;
import net.mcreator.parse.ParseMod;

public class ParseModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ParseMod.MODID);
	public static final DeferredBlock<Block> CYAN_ORE = REGISTRY.register("cyan_ore", CyanOreBlock::new);
	public static final DeferredBlock<Block> CYAN_BLOCK = REGISTRY.register("cyan_block", CyanBlockBlock::new);
	public static final DeferredBlock<Block> YELLO_ORE = REGISTRY.register("yello_ore", YelloOreBlock::new);
	public static final DeferredBlock<Block> YELLO_BLOCK = REGISTRY.register("yello_block", YelloBlockBlock::new);
	public static final DeferredBlock<Block> CYAN_OREWORLD_PORTAL = REGISTRY.register("cyan_oreworld_portal", CyanOreworldPortalBlock::new);
	public static final DeferredBlock<Block> YELLO_OREWORLD_PORTAL = REGISTRY.register("yello_oreworld_portal", YelloOreworldPortalBlock::new);
	public static final DeferredBlock<Block> BANANA_BLOCK = REGISTRY.register("banana_block", BananaBlockBlock::new);
	public static final DeferredBlock<Block> GREEN_ORE = REGISTRY.register("green_ore", GreenOreBlock::new);
	public static final DeferredBlock<Block> GREEN_BLOCK = REGISTRY.register("green_block", GreenBlockBlock::new);
	public static final DeferredBlock<Block> GREEN_WORDE_PORTAL = REGISTRY.register("green_worde_portal", GreenWordePortalBlock::new);
	public static final DeferredBlock<Block> GREY_ORE = REGISTRY.register("grey_ore", GreyOreBlock::new);
	public static final DeferredBlock<Block> GREY_BLOCK = REGISTRY.register("grey_block", GreyBlockBlock::new);
	public static final DeferredBlock<Block> GREY_WORDE_PORTAL = REGISTRY.register("grey_worde_portal", GreyWordePortalBlock::new);
	public static final DeferredBlock<Block> PINK_ORE = REGISTRY.register("pink_ore", PinkOreBlock::new);
	public static final DeferredBlock<Block> PINK_BLOCK = REGISTRY.register("pink_block", PinkBlockBlock::new);
	public static final DeferredBlock<Block> PINK_WORDE_PORTAL = REGISTRY.register("pink_worde_portal", PinkWordePortalBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
