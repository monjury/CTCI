package common;

public class LinkedList<E> {

	public Node<E> head;
	
	public LinkedList(E data) {
		head = new Node<E>();
		head.data = data;
	}
	
	
	public void add(E data) {
		Node<E> newNode  = new Node<E>();
		newNode.data = data;
		Node<E> currentNode = head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
	}

}
