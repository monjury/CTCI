package problems;

import common.LinkedList;
import common.Node;

// 2.2 Implement an algorithm to find the kth to last element of a singly linked list.
public class Problem2 {

	public Node<Integer> find(LinkedList<Integer> input, int k) {
		int size = 0;
		Node<Integer> selectedNode = input.head;
		Node<Integer> currentNode = input.head;
		while (currentNode.next != null) {
			size++;
			if (size > k) {
				selectedNode = selectedNode.next;
			}
			currentNode = currentNode.next;
		}
		return selectedNode;
	}
}
