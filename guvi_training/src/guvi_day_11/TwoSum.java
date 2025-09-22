package guvi_day_11;
import java.util.*;

import java.util.Scanner;



public class TwoSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Array Size:");

		int size = sc.nextInt();

		System.out.println("Enter Array Element:");

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {

			int input = sc.nextInt();

			arr[i] = input;

		}

		System.out.println("Enter Target Value:");

		int target = sc.nextInt();

		System.out.println("Array Size: " +size);

		System.out.println("Array Element:"+ Arrays.toString(arr));

		System.out.println("Target Value: "+target);



	}



}