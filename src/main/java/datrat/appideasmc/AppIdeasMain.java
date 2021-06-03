package datrat.appideasmc;

import datrat.appideasmc.bin2dec.Bin2DecMain;
import datrat.appideasmc.calculator.CalculatorMain;
import datrat.appideasmc.rng.RngMain;
import datrat.appideasmc.utils.utilcommands.Fly;
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
		Objects.requireNonNull(this.getCommand("rng")).setExecutor(new RngMain());

		Objects.requireNonNull(this.getCommand("fly")).setExecutor(new Fly());
	}

	@Override
	public void onDisable() {
		getLogger().info("[app-ideas] - Passed in onDisable()");
	}
}
