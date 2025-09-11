package guvi_day2;
import java.util.Scanner;
public class Pyramid {
  public static void main(String[]args){

				int n,i,j;
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter n");
				
				n=sc.nextInt();
				
				for(i=1; i<=n; i++) {
					
					for(j=i; j<n; j++) {
						
						System.out.print(" ");
					}
					
					for(j=1; j<=2*(i)-1; j++)
						
					{
						
					System.out.print("*");
					
					}
					
					System.out.println();
				}
			}
		}


