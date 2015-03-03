package problems;


/**
 * Implement a method to perform basic string compression using the counts of repeated characters. 
 * For example, the string aabcccccaaa would become a2blc5a3. 
 * If the "compressed" string would not become smaller than the original string, 
 * your method should return the original string.
 */

public class Problem5 {

	public String compress(String input) {
		StringBuilder sb = new StringBuilder();
		char currentCharacter = input.charAt(0);
		int currentCount = 0;
		for(int currentIndex = 0; currentIndex < input.length(); currentIndex++) { 
			if(input.charAt(currentIndex) != currentCharacter) {
				sb.append(currentCharacter).append(currentCount);
				currentCount = 0;
				currentCharacter = input.charAt(currentIndex);
			}
			currentCount++;
		}
		sb.append(currentCharacter).append(currentCount);		
		return (sb.length() >= input.length()) ? input : sb.toString();
	}

}
