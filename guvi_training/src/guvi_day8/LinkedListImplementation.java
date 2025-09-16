package guvi_day8;

import java.util.LinkedList;

class Node {
	int data;
	Node next;

	Node(int val) {
		data = val;
		next = null;
	}
}

public class LinkedListImplementation {
//	insertAtBegining
	public void insertAtBegining(int val) {
		Node newNode = new Node(val);
		// newNode-data|next
//		5|null
		if (head == null) {
			head = newNode;
		}
		newNode.next = head;
		head = newNode;
		return;
	}

//	deleteAtBegining
	public void deleteAtBegining() {
		if (head == null) {
			System.out.println("List is Empty..");
		} else {
			head = head.next;
		}
	}

//	deleteAtEnd
	public void deleteAtEnd() {
		if (head == null) {
			System.out.println("List is empty..");
		} else {
			Node curr = head;
			while (curr.next.next != null) {
				curr = curr.next;
			}
			curr.next = null;
		}
	}

//	search
	public boolean search(int target) {
		if (head == null) {
			System.out.println("List is Empty....");
		} else {
			Node curr = head;
			while (curr != null) {
				if (target == curr.data) {
					return true;
				}

				curr = curr.next;
			}
		}
		return false;
	}

//	size
	public int size() {
		int count = 0;
		Node curr = head;
		while (curr != null) {
			count++;
			curr = curr.next;
		}
		return count;
	}
//	reverse
//	public void reverse() {
//		if (head == null) {
//			System.out.println("List is Empty");
//		} else {
//			Node prev = null;
//			Node curr = head;
//			Node nextNode = null;
//			while (curr != null) {
//				nextNode = curr.next;
//				curr.next = prev;
//				prev = curr;
//				curr = nextNode;
//
//			}
//			head = prev;
//		}
//
//	}
//	reverses sir method
	public Node reverses() {
	    Node prev = null;
	    Node curr = head;

	    while (curr != null) {
	        Node next = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr = next;
	    }

	    head = prev;  // Update the class head as well
	    return head;  // Return the new head
	}


	Node head;

	public void addNode(int val) {
		Node NewNode = new Node(val);
		if (head == null) {
			head = NewNode;
		} else {
//      head.next=NewNode;
			Node curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = NewNode;
		}
	}
//traversal the node-----
	public void traverse() {
		if (head == null) {
			System.out.print("list is empty");
			return;
		}
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.print("null");
	}
	public void traversebynode(Node head) {
		if (head == null) {
			System.out.print("list is empty");
			return;
		}
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		LinkedListImplementation list = new LinkedListImplementation();
		list.addNode(25);
		list.addNode(35);
		list.addNode(45);
		list.addNode(65);
		list.addNode(55);
		list.traverse();
		list.insertAtBegining(5);
		System.out.println();
		list.traverse();
		list.deleteAtBegining();
		System.out.println();
		list.traverse();
		list.deleteAtEnd();
		System.out.println();
		list.traverse();
		System.out.println();
		System.out.println("Search 15:" + list.search(15));
		System.out.println("Search 45:" + list.search(45));
		System.out.println("count of List: " + list.size());
//		list.traverse();
//		list.reverse();
//		System.out.println();
//		System.out.println("Reversing the list:");
//		list.traverse();
	//	reverses sir method
		Node result=list.reverses();
		list.traversebynode(result);
	}
}
