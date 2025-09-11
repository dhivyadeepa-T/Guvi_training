package guvi_day1;

import java.util.Scanner;

public class PositiveNegative {
public static void main(String[]args) {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value:");
	n=sc.nextInt();
	if(n>0)
		System.out.println("it is positive");
	else if(n<0)
		System.out.println("it is negative");
	else
		System.out.println("zero");
}
}
