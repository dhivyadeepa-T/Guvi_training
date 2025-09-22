package guvi_day_10;

import java.util.HashSet;
import java.util.Arrays;
public class SortArray {
    public static void main(String[]args) {
        HashSet<Integer>arrays=new HashSet<Integer>(); 
        int arr[]= {5,15,42,56,85,11,33,99};
        System.out.println("before asending order sort:"+Arrays.toString(arr));
        Arrays.sort(arr);
		System.out.println("asending order sort:"+Arrays.toString(arr));
		
	}
}
