package problems;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import common.LinkedList;

public class Problem2Test {
	protected Problem2 solution;

    @Before
    public void setUp() {
        solution = new Problem2();
    }
   
    @Test
    public void testCase0() {
    	LinkedList<Integer> input = new LinkedList<Integer>(1);
    	input.add(2);
    	input.add(3);
    	input.add(4);
    	input.add(5);
    	int k = 3;
    	Integer expected = 2;
    	Integer actual = solution.find(input, k).data;
        Assert.assertEquals(expected, actual);
    }
    
}
