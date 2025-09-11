package guvi_day2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[]args) {
		int n,i;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		for(i=2;i<n;i++){
			if(n%i==0){
				System.out.println(n+" is not a prime");
				break;
			}
		}
		if(i==n) {
			System.out.println(n+"is prime");
		}
	}
}