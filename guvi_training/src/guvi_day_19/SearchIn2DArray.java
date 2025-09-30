package guvi_day_19;
import java.util.*;
public class SearchIn2DArray {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n element:");
		int n=sc.nextInt();
		System.out.println("enter the m element:");
		int m=sc.nextInt();
		
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}		
		System.out.println("enter the target element:");
		   int target = sc.nextInt();

	        boolean found = false;

	        for (int i = 0; i < n && !found; i++) {
	            for (int j = 0; j < m; j++) {
	                if (arr[i][j] == target) {
	                    found = true;
	                    break;
	                }
	            }
	        }

	        System.out.println(found);
	  }
	}

