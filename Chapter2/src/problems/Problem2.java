package problems;

import common.LinkedList;
import common.Node;

// 2.2 Implement an algorithm to find the kth to last element of a singly linked list.
public class Problem2 {

	public Node<Integer> find(LinkedList<Integer> input, int k) {
		
		Node<Integer> currentNode = input.head;
		Node<Integer> selectedNode = input.head;
		int size = 0;
		int handle = 0;
		while(currentNode.next != null) {
			size++;
			if(size % (2*k) == 0) {
				handle = size;
				selectedNode = currentNode;
			}
			currentNode = currentNode.next;
		}
		while(size - handle > k) {
			handle++;
			selectedNode = selectedNode.next;
		}
		return selectedNode;
	}
}
