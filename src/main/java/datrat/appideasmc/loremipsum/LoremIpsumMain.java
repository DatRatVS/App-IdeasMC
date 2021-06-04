package datrat.appideasmc.loremipsum;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import datrat.appideasmc.utils.Utils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LoremIpsumMain implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		Player player = (Player) sender;
		Lorem lorem = LoremIpsum.getInstance();

		if (cmd.getName().equalsIgnoreCase("loremipsum")) {
			if (args.length == 0) {
				player.sendMessage(ChatColor.GOLD + "" + "[loremipsum] - Usage: /loremipsum (amount)");
				return true;
			}
			if (Utils.isInt(args[0])) {

				String loremReturn = lorem.getParagraphs(Integer.parseInt(args[0]), Integer.parseInt(args[0]));

				player.sendMessage("[loremipsum] - [loremipsum] - [loremipsum] - [loremipsum]");
				player.sendMessage("");
				player.sendMessage(ChatColor.GOLD + "Lorem ipsum dolor sit amet, " + loremReturn);
				player.sendMessage("");
				player.sendMessage("[loremipsum] - [loremipsum] - [loremipsum] - [loremipsum]");

			} else {
				player.sendMessage(ChatColor.GOLD + "[loremipsum] - You did not enter numbers. Usage: /loremipsum (amount)");
			}
			return true;
		}
		return false;
	}
}