package problems;

// 1.2 Implement a function void reverse(char* str) in C or C++ which reverses a null terminated string.
public class Problem2 {

	public char[] reverse(char[] input) {
		char temp = ' ';
		int destinationIndex = 0;
		for (int sourceIndex = 0; sourceIndex < input.length / 2; sourceIndex++) {
			destinationIndex = input.length - sourceIndex - 1;
			temp = input[sourceIndex];
			input[sourceIndex] = input[destinationIndex];
			input[destinationIndex] =  temp;
		}
		return input;
	}
	
	public String reverse(String input) {
		char[] result = reverse(input.toCharArray());
		return new String(result);
	}
}
