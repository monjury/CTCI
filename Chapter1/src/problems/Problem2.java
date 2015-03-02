package problems;

// 1.2 Implement a function void reverse(char* str) in C or C++ which reverses a null terminated string.
public class Problem2 {

	public String reverse(String input) {
		char temp = ' ';
		int destinationIndex = 0;
		StringBuilder result = new StringBuilder(input);
		for (int sourceIndex = 0; sourceIndex < input.length() / 2; sourceIndex++) {
			destinationIndex = input.length() - sourceIndex - 1;
			temp = result.charAt(sourceIndex);
			result.setCharAt(sourceIndex, result.charAt(destinationIndex));
			result.setCharAt(destinationIndex, temp);
		}
		return result.toString();
	}
}
