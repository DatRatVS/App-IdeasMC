package datrat.appideasmc;

import datrat.appideasmc.BinTwoDec.Bin2DecMain;
import datrat.appideasmc.Calculator.CalculatorMain;
import datrat.appideasmc.RNG.RNGMain;
import datrat.appideasmc.Utils.UtilCommands.fly;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class AppIdeasMain extends JavaPlugin {

	public static AppIdeasMain instance;

	@Override
	public void onEnable() {

		instance = this;

		getLogger().info("[app-ideas] - Passed in onEnable()");

		Objects.requireNonNull(this.getCommand("bin2dec")).setExecutor(new Bin2DecMain());
		Objects.requireNonNull(this.getCommand("calc")).setExecutor(new CalculatorMain());
		Objects.requireNonNull(this.getCommand("rng")).setExecutor(new RNGMain());

		Objects.requireNonNull(this.getCommand("fly")).setExecutor(new fly());
	}

	@Override
	public void onDisable() {
		getLogger().info("[app-ideas] - Passed in onDisable()");
	}
}
