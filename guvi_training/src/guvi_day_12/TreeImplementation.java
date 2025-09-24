package guvi_day_12;
import java.util.*;

public class TreeImplementation {
class Node{
	int data;
	Node left;
	Node Right;
	

public Node(int val) {
	data=val;
	left=null;
	Right=null;
}
}
Node root;
public  void addNode(int val) {
	Node newNode= new Node(val);
	if(root==null) {
		root=newNode;
	}
	else {
	Queue<Node>Queue =new LinkedList<>();
		Queue.add(root);
		while(!Queue.isEmpty()) {
			Node temp=Queue.remove();
			if(temp.left==null) {
				temp.left=newNode;
				break;
			}
			else {
				Queue.add(temp.left);
			}
			if(temp.Right==null) {
				temp.Right=newNode;
				break;
			}
		}
	}
}
public void levelorderTraversal() {
	if(root==null) {
		System.out.println("Tree is Empty");
	}
	else {
		Queue<Node>queue=new LinkedList<>();
		queue.add(root);
	while(!queue.isEmpty()) {
		Node temp = queue.remove();
		System.out.print(temp.data+" ");
		if(temp.left!=null) {
			queue.add(temp.left);
		}
		if(temp.Right!=null) {
			queue.add(temp.Right);
		}
	}
	}
}
public boolean search(int val) {
    if (root == null) return false;
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
        Node temp = queue.remove();
        if (temp.data == val) {
            return true;
        }
        if (temp.left != null) queue.add(temp.left);
        if (temp.Right != null) queue.add(temp.Right);
    }
    return false;
}
public void preOrder(Node root) {
	if(root!=null) {
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.Right);
	}
}
public void postOrder(Node root) {
	if(root!=null) {
		
		postOrder(root.left);
		postOrder (root.Right);
		System.out.print(root.data+" ");
	}
}
public void inOrder(Node root) {
	if(root!=null) {
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder (root.Right);
		
	}
}


public static void main(String[]args) {
TreeImplementation tree=new TreeImplementation();
tree.addNode(1);
tree.addNode(2);
tree.addNode(3);
tree.addNode(4);
tree.addNode(5);
tree.levelorderTraversal();
System.out.println();
System.out.println("find value 3:"+tree.search(3));
System.out.println("find value 0:"+tree.search(0));
System.out.println("pre-order:");
tree.preOrder(tree.root);
System.out.println();
System.out.println("post-order:");
tree.postOrder(tree.root);
System.out.println();
System.out.println("in-order:");
tree.inOrder(tree.root);
}
}
