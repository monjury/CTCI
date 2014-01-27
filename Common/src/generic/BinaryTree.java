package generic;

public class BinaryTree<E> {
	private Node<E> root;

	public BinaryTree(Node<E> root) {
		this.root = root;
	}

	public Node<E> getRoot() {
		return root;
	}
}
