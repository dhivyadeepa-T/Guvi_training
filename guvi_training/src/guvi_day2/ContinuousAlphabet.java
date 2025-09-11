package guvi_day2;
import java.util.Scanner;
public class ContinuousAlphabet {
  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of rows: ");
	        int n = sc.nextInt();

	        char ch = 'A'; // starting character

	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(ch + " ");
	                ch++; // move to next alphabet
	                if (ch > 'Z') { // restart if goes beyond Z
	                    ch = 'A';
	                }
	            }
	            System.out.println();
	        }

	        sc.close();
	    }
	}

