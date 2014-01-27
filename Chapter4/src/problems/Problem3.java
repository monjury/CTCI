package problems;

import generic.*;


/**
 * Given a sorted (increasing order) array, 
 * write an algorithm to create a binary tree with minimal height
 * 
 * ASSUME - input array is of type integer
 */

public class Problem3 {
	
	public BinaryTree<Integer> createTree(int[] input) {
		Node<Integer> node = createNode(input, 0, input.length - 1);
		BinaryTree<Integer> bTree = new BinaryTree<Integer>(node);
		return bTree;
	}
	
	private Node<Integer> createNode(int[] input, int startIndex, int endIndex) {		
		if(startIndex > endIndex) {
			return null;
		}
		
		else if(startIndex == endIndex) {
			return new Node<Integer>(input[startIndex], null, null);
		}
		else {
			int mid = (endIndex - startIndex) / 2;
			Node<Integer> leftNode = createNode(input, startIndex, mid - 1);
			Node<Integer> rightNode = createNode(input, mid + 1, endIndex);
			return new Node<Integer>(input[mid], leftNode, rightNode);
		}
	}
}
