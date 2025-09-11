package guvi_day2;
import java.util.Scanner;
public class FloydTriangle {

			public static void main(String[]args){
			 int n,i,j,num;
			 Scanner sc =new Scanner(System.in);
			 System.out.println("enter the value:");
			 n=sc.nextInt();
			 num=1;
			 for(i=1;i<=n;i++) {
				 for(j=1;j<=i;j++)
				 {
					 System.out.print(num++ +" ");
				 }
				 System.out.println();
			 }
		}
}


