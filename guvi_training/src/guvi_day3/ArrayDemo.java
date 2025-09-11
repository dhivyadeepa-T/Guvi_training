package guvi_day3;
import java.util.Arrays;
public class ArrayDemo {

	public static void main(String[]args) {
		int[] arr = {2,1,3,5,4};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		System.out.println("after sorting");
		for(int i:arr) {
			System.out.println(i);
		}
	}
}
