package datrat.appideasmc.Utils.UtilCommands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class fly implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		Player player = (Player) sender;

		if (cmd.getName().equalsIgnoreCase("fly")) {
			if (args.length == 0) {
				player.sendMessage(ChatColor.GOLD + "[util] - Usage: /fly (on/off)");
				return true;
			}

			switch (args[0]) {
				default: {
					player.sendMessage(ChatColor.GOLD + "[util] - Usage: /fly (on/off)");
					return true;
				}
				case "on": {
						player.setFlying(true);
					player.sendMessage(ChatColor.GOLD + "[util] - Flight is now on.");
					return true;
				}
				case "off": {
						player.setFlying(false);
					player.sendMessage(ChatColor.GOLD + "[util] - Flight is now off.");
					return true;
				}
			}
		}
		return false;
	}
}