package guvi_day2;

import java.util.Scanner;
public class RepeatingNumber {
public  static void main(String[]args) {
				 int n,i,j;
		 Scanner sc =new Scanner(System.in);
				 System.out.println("enter the value:");
				 n=sc.nextInt();
				 
				 for(i=1;i<=n;i++) {
					 for(j=1;j<=i;j++)
					 {
						 System.out.print(i);
					 }
					 System.out.println();
				 }
				 sc.close();
			}
				
	}


