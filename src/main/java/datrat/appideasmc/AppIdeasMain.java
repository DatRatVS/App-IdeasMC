package datrat.appideasmc;

import datrat.appideasmc.BinTwoDec.Bin2DecMain;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class AppIdeasMain extends JavaPlugin {

	@Override
	public void onEnable() {
		getLogger().info("Passed in onEnable()");

		Objects.requireNonNull(this.getCommand("bin2dec")).setExecutor(new Bin2DecMain());
	}

	@Override
	public void onDisable() {
		getLogger().info("Passed in onDisable()");
	}
}
