package guvi_day1;
import java.util.Scanner;
public class Odd_Even {
public static void main(String[]args) {
	int n;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter  n:");
	n=sc.nextInt();
	if(n%2==0) {
		System.out.println("even");
	}
		else {
			System.out.print("odd");
		}
}
}
