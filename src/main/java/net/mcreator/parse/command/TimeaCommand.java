
package net.mcreator.parse.command;

import org.checkerframework.checker.units.qual.s;

import net.neoforged.neoforge.event.RegisterCommandsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.commands.Commands;

import com.mojang.brigadier.arguments.DoubleArgumentType;

@EventBusSubscriber
public class TimeaCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("timea").requires(s -> s.hasPermission(4)).then(Commands.literal("add").then(Commands.argument("time", DoubleArgumentType.doubleArg(0))))
				.then(Commands.literal("set").then(Commands.literal("day")).then(Commands.literal("noon")).then(Commands.literal("night")).then(Commands.literal("midnight"))));
	}
}
