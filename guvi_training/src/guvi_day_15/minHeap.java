package guvi_day_15;
import java.util.*;
public class minHeap {


	public static void main (String[]args) {

	PriorityQueue <Integer> minHeap=new PriorityQueue<>();

		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size of array:");

		int size=sc.nextInt();

		System.out.println("enter the array: "+size+" element");

		for(int i=0;i<size;i++) {

			int element=sc.nextInt();

			minHeap.add(element);

		}

		if(size<2) {

		System.out.println("not found");

	}

		else {

			int firstelement=minHeap.poll();

			int secondelement=minHeap.poll();

			int sum=firstelement+secondelement;

		}

	}

	}



