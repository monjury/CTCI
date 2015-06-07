package problems;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you can not use additional data structures?
 */

public class Problem1 {

	public boolean hasUniqueCharacters(String input) {
		if (input == null || input == "") {
			return true;
		}
		else if (input.length() > 256) {
			return false;
		}
		else {
			boolean[] char_set = new boolean[256];
			for (int i = 0; i < input.length(); i++) {
				if (char_set[input.charAt(i)]) {
					return false;
				}
				else {
					char_set[input.charAt(i)] = true;
				}
			}
			return true;
		}
	}
}
