package guvi_day2;
import java.util.Scanner;
public class InverseNumberTriangle {
	

		public static void main(String[]args) {
			int n,i,j;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value:");
			n=sc.nextInt();
			 
			for(i=n;i>=1;i--) {
				for(j=1;j<=i;j++)
			{
			System.out.print(j);
			}
			System.out.println();
		}
			sc.close();
	}
	}

