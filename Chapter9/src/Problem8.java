import java.util.HashMap;

/*
 * Given an infinite number of quarters (25 cents), dimes (10 cents), nickels (5 cents) and 
 * pennies (1 cent), write code to calculate the number of ways of representing n cents
*/

public class Problem8 {

	HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	public int numberOfWays(int n) {
		int total = 1; // Using only cents
			
		total+= useOne(n, 5); // Using nickels and cents
		total+= useOne(n, 10); // Using dime and cents
		total+= useOne(n, 25); // Using quarter and cents
		
		total += useTwo(n, 10, 5); // Using dime and nickels and cents
		total += useTwo(n, 25, 5); // Using quarter and nickels and cents
		total += useTwo(n, 25, 10); // Using quarter and dime and cents

		total += useThree(n);
		
		return total;
	}
	
	private int useOne(int R, int denom) {
		return R/denom;
	}
	
	private int useTwo(int R, int denom1, int denom2) {
		int total = 0;
		for(int i = 1; i <= R/denom1; i++) {
			int remainder = (R - (i*denom1));
			total+=  useOne(remainder, denom2);
		}
		return total;
	}
	
	private int useThree(int R) {
		int total = 0;
		for(int i = 1; i <= R/25; i++) {
			int remainder = (R - (i*25));
			total += useTwo(remainder, 10, 5); 
		}
		return total;
	}
	
	public static void main(String[] args) {
		Problem8 p = new Problem8();
		int result = p.numberOfWays(1000000);
		System.out.println("Problem8.main() - " + result);
	}
}
