package guvi_day_15;
import java.util.*;
public class maxheap {


		public static void main(String[]args) {

	PriorityQueue<Integer>maxheap=new PriorityQueue<>(Collections.reverseOrder());

	Scanner sc=new Scanner(System.in);

	 System.out.println("enter the size:");

	int size=sc.nextInt();  

	System.out.println("enter the array: "+size+" element");

	      for(int i=0;i<size;i++) {

		int element=sc.nextInt();

		maxheap.add(element);

	}

	if(size<2) {

	System.out.println("not found");

	}

	else {

		int firstelement=	maxheap.poll();

		int secondelement=	maxheap.poll();

		int sum=firstelement+secondelement;

		System.out.println("sum of the 2 maxheap:"+sum);

	}

	}

	}


