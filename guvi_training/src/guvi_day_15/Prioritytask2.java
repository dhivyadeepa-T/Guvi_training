package guvi_day_15;

import java.util.*;
public class Prioritytask2 {
	



		public static  int Kbig(int arr[],int k) { 

	 PriorityQueue<Integer>num=new PriorityQueue<>(Collections.reverseOrder());

	for(int i:arr) {

		num.add(i);	

	}

	int sum=0;

	for(int i=0;i<k;i++) {

		sum+=num.poll();

	}

	return sum;

	}

		public static void main(String[]args) {

			Scanner sc=new Scanner(System.in);

			System.out.println("enter Size:");

			int size=sc.nextInt();

			int k=sc.nextInt();

			System.out.println("Enter the element:");

			int[] arr=new int[size];

			for(int i=0;i<size;i++) {

				arr[i]=sc.nextInt();

			}

			System.out.println("sum: "+Kbig(arr,k));

	}

	}


