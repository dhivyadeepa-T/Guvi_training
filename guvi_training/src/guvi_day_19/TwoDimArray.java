package guvi_day_19;

import java.util.*;

public class TwoDimArray {
public  static void  rowColSum(int arr[][]) {
	List<Integer>row=new ArrayList<>();
	List<Integer>col=new ArrayList<>();
	for(int i=0;i<arr.length;i++) {
		int rowsum=0;
		int colsum=0;
		for(int j=0;j<arr[i].length;j++) {
			rowsum+=arr[i][j];
			colsum+=arr[i][j];
			
		}
		row.add(rowsum);
		col.add(colsum);
	}
	System.out.println(row);
	System.out.println(col);
}
public static void main(String[]args) {
	  Scanner sc = new Scanner(System.in);

      System.out.print("Enter number of rows and columns: ");
      int n = sc.nextInt();
      int m = sc.nextInt();

      int[][] arr = new int[n][m];
      System.out.println("Enter elements of the matrix:");
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
              arr[i][j] = sc.nextInt();
          }
      }

      rowColSum(arr);
  }
}
