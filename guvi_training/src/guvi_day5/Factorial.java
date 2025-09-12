package guvi_day5;
import java.util.Scanner;
public class Factorial {
	public static int fact(int n1) {
if((n1==0)||(n1==1))
	return 1;
else 
	return n1*fact(n1-1);
}
public static void main(String[]args) { 
	int n,f=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n:");
	f=fact(n1);
}
}