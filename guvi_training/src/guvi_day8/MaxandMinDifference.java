package guvi_day8;


public class MaxandMinDifference {

		class Node{
			int data;
			Node next;
			Node(int val) {
				data = val;
				next = null;
			}
		}
		Node head;

		public void addNode(int val) {
			Node NewNode = new Node(val);
			if (head == null) {
				head = NewNode;
			} else {
		//  head.next=NewNode;
				Node curr = head;
				while (curr.next != null) {
					curr = curr.next;
				}
				curr.next = NewNode;
			}
		}
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
		public int maxMinDifference() {
		    if (head == null) {
		    	System.out.println("List is empty");
		    }

		    int min = head.data;
		    int max = head.data;

		    Node current = head.next;

		    while (current != null) {
		        if (current.data < min) {
		            min = current.data;
		        }
		        if (current.data > max) {
		            max = current.data;
		        }
		        current = current.next;
		    }

		    return max - min;
		}


public static void main(String[] args) {
	MaxandMinDifference list = new MaxandMinDifference();
	list.addNode(10);
	list.addNode(50);
	list.addNode(2);
	list.addNode(3);
	list.addNode(15);
	list.traverse();
	System.out.println();
    int diff = list.maxMinDifference();
    System.out.println("Difference between max and min: " + diff);
}}
