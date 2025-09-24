package guvi_day_13;

import java.util.LinkedList;
import java.util.Queue;

public class MinMax {
	class Node {
		int data;
		Node left;
		Node right;

		public Node(int val) {
			data = val;
			left = null;
			right = null;
		}
	}

	Node root;

	public void addNode(int val) {
		Node newNode = new Node(val);
		if (root == null) {
			root = newNode;
		} else {
			Node current = root;
			while (true) {
				if (val < current.data) {
					if (current.left == null) {
						current.left = newNode;
						break;
					} else {
						current = current.left;
					}
				} else {
					if (current.right == null) {
						current.right = newNode;
						break;
					} else {
						current = current.right;
					}
				}
			}
		}
	}

	public void BinarySearchTraversal() {
		if (root == null) {
			System.out.println("Tree is Empty");
		} else {
			Queue<Node> queue = new LinkedList<>();
			queue.add(root);
			while (!queue.isEmpty()) {
				Node temp = queue.remove();
				System.out.print(temp.data + " ");
				if (temp.left != null) {
					queue.add(temp.left);
				}
				if (temp.right != null) {
					queue.add(temp.right);
				}
			}
		}
	}

	public int findMin() {
		if (root == null) {
			System.out.println("Tree is empty");
		}else {
		Node current = root;
		while (current.left != null) {
			current = current.left;
		}
		return current.data;
	}
return -1;
}
	public int findMax() {
		if (root == null) {
			System.out.println("Tree is empty");
		}else {
		Node current = root;
		while (current.right != null) {
			current = current.right;
		}
		return current.data;
	}
	return -1;
}

	public static void main(String[] args) {
		BinarySearchTree BinarySearch = new BinarySearchTree();
		BinarySearch.addNode(5);
		BinarySearch.addNode(24);
		BinarySearch.addNode(23);
		BinarySearch.addNode(13);
		BinarySearch.addNode(19);
		BinarySearch.addNode(56);
		BinarySearch.addNode(36);
		BinarySearch.BinarySearchTraversal();
		System.out.println();
		System.out.println("find min:" + BinarySearch.findMin());
		System.out.println("find max:" + BinarySearch.findMax());

	}
}
