package problems;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem2Test {


    protected Problem2 solution;

    @Before
    public void setUp() {
        solution = new Problem2();
    }
   
    @Test(timeout = 2000)
    public void testCase0() {
    	String input = "ABDDC";
    	String expected = "CDDBA";
    	String actual = solution.reverse(input);
        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase1() {
    	String input = "aa";
    	String expected = "aa";
    	String actual = solution.reverse(input);
        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase2() {
    	String input = "babb";
    	String expected = "bbab";
    	String actual = solution.reverse(input);
        Assert.assertEquals(expected, actual);
    }
}
