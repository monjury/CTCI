package problems;

import java.util.HashMap;
import java.util.Map;

//1.3 Given two strings, write a method to decide if one is a permutation of the other.
public class Problem3 {

	private Map<Character, Integer> countMap;

	public boolean isPermutation(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		countMap = new HashMap<Character, Integer>();
		for (int i = 0; i < str1.length(); i++) {
			setValue(str1.charAt(i), true);
			setValue(str2.charAt(i), false);
		}
		for(Character c : countMap.keySet()) {
			if(countMap.get(c) != 0) {
				return false;
			}
		}
		return true;
	}

	private void setValue(char key, boolean isFirst) {
		int value = (countMap.get(key) == null) ? 0 : countMap.get(key);
		value = isFirst ? value + 1 : value - 1;
		countMap.put(key, value);
	}
}
