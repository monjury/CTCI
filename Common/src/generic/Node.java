package generic;

public class Node<E> {
	E data;
	Node<E> left;
	Node<E> right;

	public Node(E data, Node<E> left, Node<E> right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}