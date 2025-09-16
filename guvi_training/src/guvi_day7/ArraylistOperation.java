package guvi_day7;
import java.util.*;
public class ArraylistOperation {
public static void main(String[]args) {
	ArrayList<Integer>arr=new ArrayList<Integer>();
	System.out.println("Initial Size:"+arr.size());
	arr.add(10);
	arr.add(20);
	arr.add(30);
	arr.add(40);
	arr.add(50);
	arr.add(60);
	arr.add(1,99);
	System.out.println("After adding elements:"+arr);
	System.out.println("Size after insert:"+arr.size());
	System.out.println("Element at index2:"+arr.get(2));
	arr.set(2,100);
	System.out.println("After modify index2:"+arr);
	System.out.println("Contain 20:"+arr.contains(20));
	System.out.println("Index of 50:"+arr.indexOf(50));
	arr.remove(Integer.valueOf(10));
	arr.remove(0);
	System.out.println("After removals:"+arr);
	System.out.print("Iteration using for-each:");
	for(Integer num:arr)
		System.out.print(num + "");
	arr.clear();
	System.out.println("Is Empty:"+arr.isEmpty());
	

	
}
	
}
