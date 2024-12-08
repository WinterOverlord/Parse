
package net.mcreator.parse.command;

import org.checkerframework.checker.units.qual.s;

import net.neoforged.neoforge.event.RegisterCommandsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.Commands;

import com.mojang.brigadier.arguments.StringArgumentType;

@EventBusSubscriber
public class SendaCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("senda").requires(s -> s.hasPermission(4)).then(Commands.argument("player", EntityArgument.player()).then(Commands.argument("message", StringArgumentType.string()))));
	}
}
