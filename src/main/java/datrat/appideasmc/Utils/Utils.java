package datrat.appideasmc.Utils;

public class Utils {

	// Util for parsing integers.

	public static boolean isInt(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

}
