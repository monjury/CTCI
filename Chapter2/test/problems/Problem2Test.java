package problems;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import common.LinkedList;

public class Problem2Test {
	protected Problem2 solution;
	protected LinkedList<Integer> input;
    
	@Before
    public void setUp() {
        solution = new Problem2();
        input = new LinkedList<Integer>(1);
        input.add(2);
    	input.add(3);
    	input.add(4);
    	input.add(5);
    	input.add(6);
    	input.add(7);
    	input.add(8);
    	input.add(9);
    }
   
    @Test
    public void testCase0() {
    	int k = 3;
    	Integer expected = 6;
    	Integer actual = solution.find(input, k).data;
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testCase1() {
    	int k = 2;
    	Integer expected = 7;
    	Integer actual = solution.find(input, k).data;
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testCase2() {
    	int k = 4;
    	Integer expected = 5;
    	Integer actual = solution.find(input, k).data;
        Assert.assertEquals(expected, actual);
    }
    
    
    
}
