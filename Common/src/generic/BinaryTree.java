package generic;

public class BinaryTree<E> {
	Node root;
	
	public BinaryTree(Node node) {
		root = node;
	}
	
	class Node {
		E data;
		Node left;
		Node right;
		
	}
}
