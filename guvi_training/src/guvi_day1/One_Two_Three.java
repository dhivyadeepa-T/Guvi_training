package guvi_day1;

import java.util.Scanner;

public class One_Two_Three {
	public static void main(String[]args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value:");
	n=sc.nextInt();
	if(n<10)
		System.out.println("one digit");
	else if(n<100)
		System.out.println("two digit");
	else if(n<1000)
		System.out.println("three digit");
	else
		System.out.println("not in range");
	}
}