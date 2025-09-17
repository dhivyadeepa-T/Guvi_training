package guvi_day9;
import java.util.*;
public class ArrayfunctionList {
public static void add (ArrayList<Integer>arr) {
//	task 1
	int total=0;
	for(int i:arr) {
		total=total+i;
	}
	System.out.println("total:"+total);
}
public static void main(String[]args) {
	ArrayList<Integer>arr=new ArrayList<Integer>();

	arr.add(1);
	arr.add(2);
	arr.add(3);
	arr.add(4);
	arr.add(5);
	System.out.println("array list"+arr);
	add(arr);
//	task 2
System.out.println("Element of the target 3:"+arr.indexOf(3));
}
}