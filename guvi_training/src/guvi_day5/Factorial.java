package guvi_day5;

import java.util.Scanner;

public class Factorial {

    public static int fact(int n) {

if(n==0||n==1)

	return 1;

else

	return n*fact(n-1);	

}

public static void main(String[] args) {

	  Scanner sc = new Scanner(System.in);

      System.out.println("Enter a value n:");

      int n = sc.nextInt();



      int f = fact(n);

      System.out.println("Factorial of " + n + " is: " + f);

}

}

