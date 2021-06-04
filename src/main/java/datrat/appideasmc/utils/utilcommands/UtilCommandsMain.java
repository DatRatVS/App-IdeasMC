package datrat.appideasmc.utils.utilcommands;

import datrat.appideasmc.utils.Utils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class UtilCommandsMain implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		Player player = (Player) sender;

		if (cmd.getName().equalsIgnoreCase("util")) {

			if (args.length == 0) {
				player.sendMessage(ChatColor.GOLD + "" + "[util] - Usage: /util (util)");
				return true;
			}

			switch (args[0]) {
				default: {
					player.sendMessage(ChatColor.GOLD + "" + "[util] - Usage: /util (util)");
					return true;
				}
				case "feed": {
					player.setFoodLevel(20);
					player.setSaturation(20f);
					player.sendMessage(ChatColor.GOLD + "" + "[util] - You got feeded.");
					return true;
				}
				case "heal": {
					player.setHealth(20);
					player.sendMessage(ChatColor.GOLD + "" + "[util] - You got healed.");
					return true;
				}
				case "walkspeed": {
					if (args[1] == null) {
						player.setWalkSpeed(Utils.defaultSpeed);
						player.sendMessage(ChatColor.GOLD + "" + "[util] - Your walkspeed is now default.");
					} else if (Utils.isInt(args[1])) {
						player.setWalkSpeed(Integer.parseInt(args[1]));
						player.sendMessage(ChatColor.GOLD + "" + "[util] - Your walkspeed is now at " + args[1] + ".");
					} else {
						player.sendMessage(ChatColor.GOLD + "" + "[util] - That isn't a number.");
					}
					return true;
				}
				case "flyspeed": {
					if (args[1] == null) {
						player.setFlySpeed(Utils.defaultSpeed);
						player.sendMessage(ChatColor.GOLD + "" + "[util] - Your flyspeed is now default.");
					} else if (Utils.isInt(args[1])) {
						player.setFlySpeed(Integer.parseInt(args[1]));
						player.sendMessage(ChatColor.GOLD + "" + "[util] - Your flyspeed is now at " + args[1] + ".");
					} else {
						player.sendMessage(ChatColor.GOLD + "" + "[util] - That isn't a number.");
					}
					return true;
				}
			}
		}
		return false;
	}
}
