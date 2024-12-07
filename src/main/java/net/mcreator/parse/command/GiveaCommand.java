
package net.mcreator.parse.command;

import org.checkerframework.checker.units.qual.s;

import net.neoforged.neoforge.event.RegisterCommandsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.commands.arguments.item.ItemArgument;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.Commands;

import com.mojang.brigadier.arguments.DoubleArgumentType;

@EventBusSubscriber
public class GiveaCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("givea").requires(s -> s.hasPermission(4))
				.then(Commands.argument("players", EntityArgument.players()).then(Commands.argument("item", ItemArgument.item(event.getBuildContext())).then(Commands.argument("quantity", DoubleArgumentType.doubleArg(0, 6400))))));
	}
}
