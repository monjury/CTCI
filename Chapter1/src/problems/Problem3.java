package problems;

import java.util.HashMap;
import java.util.Map;

//1.3 Given two strings, write a method to decide if one is a permutation of the other.
public class Problem3 {

	public boolean isPermutation(String str1, String str2) {

		if (!isSameLength(str1, str2)) {
			return false;
		}

		int len = str1.length();
		Map<Character, Integer> countMap = new HashMap<Character, Integer>();

		for (int i = 0; i < len; i++) {
			incrementValue(str1.charAt(i), countMap);
			decrementValue(str2.charAt(i), countMap);
		}

		return isValidMap(countMap);
	}

	private boolean isValidMap(Map<Character, Integer> countMap) {
		for (Character c : countMap.keySet()) {
			if (countMap.get(c) != 0) {
				return false;
			}
		}
		return true;
	}

	private boolean isSameLength(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		return true;
	}

	private void incrementValue(char currentChar, Map<Character, Integer> countMap) {
		int value = (countMap.get(currentChar) == null) ? 0 : countMap.get(currentChar);
		value = value + 1;
		countMap.put(currentChar, value);
	}

	private void decrementValue(char currentChar, Map<Character, Integer> countMap) {
		int value = (countMap.get(currentChar) == null) ? 0 : countMap.get(currentChar);
		value = value - 1;
		countMap.put(currentChar, value);
	}
}
