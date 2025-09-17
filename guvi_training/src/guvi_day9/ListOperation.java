package guvi_day9;
import java.util.*;


public class ListOperation {
	public static void main(String[]args) {
		ArrayList <Integer> arr=new ArrayList<Integer>();
arr.add(12);
arr.add(15);
arr.add(18);
arr.add(16);
arr.add(17);
System.out.println("array:"+arr);
System.out.println("array access:"+arr.get(2));
arr.set(4, 20);
System.out.println("array modify:"+arr);
arr.remove(3);
System.out.println("array remove:"+arr);
arr.remove(Integer.valueOf(15));
System.out.println("array remove int:"+arr);
System.out.println("array size:"+arr.size());
System.out.println("array contain 12:"+arr.contains(12));

for(Integer numbers:arr) {
	System.out.print(numbers+" ");
	System.out.println("Iteration:"+arr);
 arr.clear();
 System.out.println("Is Empty:"+arr);
 System.out.println("Is Empty:"+arr.isEmpty());
	
}
	}
}
