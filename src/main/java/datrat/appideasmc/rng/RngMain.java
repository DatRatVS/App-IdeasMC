package datrat.appideasmc.rng;

import datrat.appideasmc.utils.Utils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RngMain implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		Player player = (Player) sender;

		if (cmd.getName().equalsIgnoreCase("rng")) {

			if (args.length == 0) {
				player.sendMessage(ChatColor.GOLD + "" + "[rng] - Usage: /rng (x) (y)");
				return true;
			}
			if (args[1] == null) {
				player.sendMessage(ChatColor.GOLD + "[rng] - You did not enter a second number.");
				return true;
			}
				if (Utils.isInt(args[0]) && Utils.isInt(args[1])) {

					int x = Integer.parseInt(args[0]);
					int y = Integer.parseInt(args[1]);

					if (x > Utils.integerLimit - 1 || y > Utils.integerLimit - 1) {
						player.sendMessage(ChatColor.GOLD + "[rng] - Lets try to not use something higher than " + Utils.integerLimit + ".");
						return true;
					} else if (x > y) {
						player.sendMessage(ChatColor.GOLD + "[rng] - x is higher than y. Try swapping them.");
						return true;
					}

					int z = Utils.getRandom(x, y);

					player.sendMessage(ChatColor.GOLD + "[rng] - Result: " + z);
					return true;

				} else {
					player.sendMessage(ChatColor.GOLD + "[rng] - You did not enter numbers or you might be surpassing " + Utils.integerLimit + ". Usage: /rng (x) (y)");
					return true;
				}
			}
			return false;
		}
	}