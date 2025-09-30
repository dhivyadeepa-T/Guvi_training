package guvi_day_19;
import java.util.*;
public class Twodimarr {
	

		public static boolean targetEle(int[][] arr,int target,int n,int m) {

			for(int i=0;i<n;i++) {

				for(int j=0;j<m ;j++) {

					if(arr[i][j] == target) {

						return true;

					}

				}

			}

			return false;

		}

		public static int diagonalSum(int arr[][]) {

			int sum =0;

			for(int i=0;i<arr.length;i++) {

				for(int j=0;j<arr[i].length;j++) {

					if(i == j) {

						sum = sum+arr[i][j];

					}

				}

			}

			return sum;



		}

		public static void rowAndColumnSum(int[][] arr) {

		   List<Integer> row = new ArrayList<>();

		   List<Integer> col = new ArrayList<>();

		   for(int i =0; i < arr.length ; i++) {

			   int rowSum = 0;

			   int colSum = 0;

			   for(int j=0; j<arr[i].length; j++) {

				   rowSum += arr[i][j];

				   colSum += arr[j][i];

			   }

			   row.add(rowSum);

			   col.add(colSum);

		   }

		   System.out.println(row);

		   System.out.println(col);

			   

		   }



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter n: ");

		int n =sc.nextInt();

		System.out.println("enter m: ");

		int m =sc.nextInt();

		System.out.println("enter target: ");

		int target = sc.nextInt();

		int arr[][] = new int[n][m];

		for(int i=0;i<n;i++) {

			for(int j=0;j<m;j++) {

				arr[i][j] =sc.nextInt();

			}

		}

		for(int i=0; i<n ;i++) {

			for(int j=0 ;j<m ;j++) {

				System.out.print(arr[i][j] +" ");

				

			}

			System.out.println();

		}

		System.out.println(targetEle(arr,target,n,m));

		System.out.println(diagonalSum(arr));

		rowAndColumnSum(arr);

		

	}

	}



