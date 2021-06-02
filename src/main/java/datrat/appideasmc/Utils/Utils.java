package datrat.appideasmc.Utils;

import java.util.Random;

public class Utils {

	// Util for parsing Strings to integers.
	public static boolean isInt(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	// Util for generating random numbers.
	public static int getRandom(int lower, int upper) {
		Random random = new Random();
		return random.nextInt((upper - lower) + 1) + lower;
	}

	// Just the integer limit.
	public static int integerLimit = 2147483647;

}
