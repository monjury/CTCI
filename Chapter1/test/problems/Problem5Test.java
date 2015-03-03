package problems;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem5Test {

    protected Problem5 solution;

    @Before
    public void setUp() {
        solution = new Problem5();
    }
   
    @Test(timeout = 2000)
    public void testCase0() {
    	String input = "aabcccccaaabbb";
		String expected = "a2b1c5a3b3";
		String actual = solution.compress(input);
        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase1() {
    	String input = "aabbccaa";
		String expected = "aabbccaa";
		String actual = solution.compress(input);
        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase2() {
    	String input = "abca";
		String expected = "abca";
		String actual = solution.compress(input);
        Assert.assertEquals(expected, actual);
    }
}
