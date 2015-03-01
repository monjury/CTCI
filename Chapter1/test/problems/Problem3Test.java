package problems;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem3Test {


    protected Problem3 solution;

    @Before
    public void setUp() {
        solution = new Problem3();
    }
   
    @Test(timeout = 2000)
    public void testCase0() {
    	String str1 = "ABDDC";
		String str2 = "DDCBA";
    	boolean expected = true;
		boolean actual = solution.isPermutation(str1, str2);
        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase1() {
    	String str1 = "aa";
		String str2 = "a";
    	boolean expected = false;
		boolean actual = solution.isPermutation(str1, str2);
        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase2() {
    	String str1 = "babb";
		String str2 = "babc";
    	boolean expected = false;
		boolean actual = solution.isPermutation(str1, str2);
        Assert.assertEquals(expected, actual);
    }
}
