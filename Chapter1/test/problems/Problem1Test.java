package problems;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import problems.Problem1;

/**
 * Implement an algorithm to determine if a string has all unique characters. 
 * What if you can not use additional data structures?
 */
public class Problem1Test {

	protected Problem1 solution;
	
	@Before
    public void setUp() {
        solution = new Problem1();
    }

    @Test(timeout = 200)
    public void testCase0() {
        String input = "ABCDE";
        boolean expected = true;
        boolean actual = solution.hasUniqueCharacters(input);
        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 200)
    public void testCase1() {
        String input = "AABCDE";
        boolean expected = false;
        boolean actual = solution.hasUniqueCharacters(input);
        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 200)
    public void testCase2() {
        String input = null;
        boolean expected = true;
        boolean actual = solution.hasUniqueCharacters(input);
        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 200)
    public void testCase3() {
        String input = "";
        boolean expected = true;
        boolean actual = solution.hasUniqueCharacters(input);
        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 200)
    public void testCase4() {
        String input = "aaa";
        boolean expected = false;
        boolean actual = solution.hasUniqueCharacters(input);
        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 200)
    public void testCase5() {
        String input = "12345";
        boolean expected = true;
        boolean actual = solution.hasUniqueCharacters(input);
        Assert.assertEquals(expected, actual);
    }
}
