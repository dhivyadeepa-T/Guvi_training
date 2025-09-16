package guvi_day7;
import java.util.*;
public class ArrayCount {
public static void main(String[]args) {
	ArrayList<Integer>arr=new ArrayList<Integer>();
	arr.add(1);
	arr.add(2);
	arr.add(3);
	arr.add(4);
	arr.add(5);
	arr.add(6);
	System.out.println("array:"+arr);
	int evenCount=0;
	int oddCount=0;
	for(int num:arr) {
	if(num%2==0) {
		evenCount++;
	}
	else {
		oddCount++;
	}
	}
	System.out.println("Evencount "+evenCount);
	System.out.println("Oddcount "+oddCount);	
}
}



