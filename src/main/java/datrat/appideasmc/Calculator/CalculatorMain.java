package datrat.appideasmc.Calculator;

import datrat.appideasmc.Utils.Utils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CalculatorMain implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		Player player = (Player) sender;

		if (cmd.getName().equalsIgnoreCase("calc")) {
			if (args.length == 0) {
				player.sendMessage(ChatColor.GOLD + "[calc] - Usage: /calc (x) (operator) (y)");
				return true;
			}

			if (Utils.isInt(args[0]) && Utils.isInt(args[2])) {

				int x = Integer.parseInt(args[0]);
				int y = Integer.parseInt(args[2]);

				switch (args[1]) {
					case "+": {
						int z = x + y;
						player.sendMessage(ChatColor.GOLD + "[calc] - Result: " + z);
						return true;
					}
					case "-": {
						int z = x - y;
						player.sendMessage(ChatColor.GOLD + "[calc] - Result: " + z);
						return true;
					}
					case "*": {
						int z = x * y;
						player.sendMessage(ChatColor.GOLD + "[calc] - Result: " + z);
						return true;
					}
					case "/": {

						float altx = Integer.parseInt(args[0]);
						float alty = Integer.parseInt(args[2]);

						float z = altx / alty;
						player.sendMessage(ChatColor.GOLD + "[calc] - Result: " + z);
						return true;
						}
					default:
						player.sendMessage(ChatColor.GOLD + "[calc] - This isn't a operator. Available operators: + - * /");
						return true;
					}
				} else {
				player.sendMessage(ChatColor.GOLD + "[calc] - Usage: /calc (x) (operator) (y)");
				return true;
				}
			}
		return false;
	}
}
