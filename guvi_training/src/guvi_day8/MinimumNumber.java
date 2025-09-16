package guvi_day8;

public class MinimumNumber {
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
public int findMinimum() {
	  if (head == null) {
          throw new IllegalStateException("List is empty");
      }

      int min = head.data;
      Node current = head.next;

      while (current != null) {
          if (current.data < min) {
              min = current.data;
          }
          current = current.next;
      }

      return min;
  }




public static void main(String[] args) {
	 MinimumNumber list = new MinimumNumber(); 
	list.addNode(5);
	list.addNode(15);
	list.addNode(25);
	list.addNode(35);
	list.addNode(45);
	list.traverse();
	 System.out.println();
  int min = list.findMinimum();
 System.out.println("Minimum value: " +min);
}
}
