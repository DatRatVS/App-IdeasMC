package datrat.appideasmc.BinTwoDec;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.bukkit.Bukkit.getLogger;

public class Bin2DecMain implements CommandExecutor {

	public static boolean isInt(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		Player player = (Player) sender;

		if (cmd.getName().equalsIgnoreCase("bin2dec")) {
			if (args.length == 0) {
				player.sendMessage(ChatColor.GOLD + "" + "[b2c] - Usage: /bin2dec (bin)");
				return true;
			} else if (args.length > 8) {
				player.sendMessage(ChatColor.GOLD + "" + "[b2c] - bin2dec only accepts 8 numbers.");
				return true;
			}
			if (args.length == 1 && isInt(args[0])) {
			} else {
				player.sendMessage(ChatColor.GOLD + "" + "[b2c] - bin2dec only accepts numbers.");
				return true;
			}

			int Args = Integer.parseInt(args[0]);

			String regexStr = "[2-9]";
			String argsStr = String.valueOf(Args);

			Pattern pattern = Pattern.compile(regexStr);
			Matcher matcher = pattern.matcher(argsStr);

			boolean matchFound = matcher.find();

			if (matchFound) {
				getLogger().info("[b2c] - Match found");
				player.sendMessage(ChatColor.GOLD + "" + "[b2c] - bin2dec only accepts numbers between 0 and 1.");
				return true;
			} else {
				getLogger().info("[b2c] - Match not found, passing.");
			}

			int Decimal = Integer.parseInt(args[0],2);

			player.sendMessage(ChatColor.GOLD + "" + "[b2c] - Output: " + Decimal);

			return true;
		}
		return false;
	}

}
