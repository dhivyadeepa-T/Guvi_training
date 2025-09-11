package guvi_day1;

import java.util.Scanner;

public class Largeest_Twonumber {
public static void main(String[]args) {
	int num1,num2;
	Scanner sc = new Scanner(System.in);
	System.out.println("value a:");
	num1=sc.nextInt();
	System.out.println("value b:");
	num2=sc.nextInt();
	
	if(num1>num2) {
		System.out.println("num1 is largest " + num1);
	}
	else if(num1<num2) {
		System.out.println("num2 is largest " + num2);
	}
	else {
		System.out.println("equal");
	}
}
}
