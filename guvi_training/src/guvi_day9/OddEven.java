package guvi_day9;
import java.util.*;
import java.util.Arrays;

public class OddEven {
	public  static void main(String[]args) {
		ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(3,6,1,8,5,2,9,4));
		ArrayList<Integer>result=new ArrayList<>();
		for(int num:arr) {
			if(num%2==0) {
				result.add(num);
			}
		}
		for(int num:arr) {
			if(num%2!=0) {
				result.add(num);
			}
		}
		System.out.println("Original List"+arr);
		System.out.println("Changed List"+result);
	}
}
