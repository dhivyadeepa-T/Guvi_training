package guvi_day8;

import java.util.LinkedList;

class Node {
	int data;
 Node next;
 Node(int val){
	data=val;
	next=null;
 }
}

public class LinkedListImplementation {
	public void insertAtBegining(int val) {
		Node newNode=new Node(val);
	// newNode-data|next
//		5|null
		if(head==null) {
			head=newNode;
	}
		newNode.next=head;
		head=newNode;
		return;
	}
	public void deleteAtBegining() {
	if (head==null) {
		System.out.println("List is Empty..");
	}
	else {
		head=head.next;
	}
	}
	public void deleteAtEnd() {
		if(head==null) {
			System.out.println("List is empty..");
		}
		else {
			Node curr=head;
			while(curr.next.next!=null) {
				curr=curr.next;
			}
			curr.next=null;
		}
	}
	Node head;
	public void addNode(int val) {
		Node NewNode=new Node(val);
		if(head==null) {
			head=NewNode;
		}
		else {
//      head.next=NewNode;
			Node curr=head;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=NewNode;
		}
	}
//traversal the node-----
	public void traverse() {
		if(head==null) {
			System.out.print("list is empty");
			return;
		}
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+"->");
			current=current.next;
		}
		System.out.print("null");
	}
public static void main(String[]args) {
	LinkedListImplementation  list= new LinkedListImplementation();
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
}
}

