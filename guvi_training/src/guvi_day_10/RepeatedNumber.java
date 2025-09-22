package guvi_day_10;
import java.util.*;
import java.util.HashSet;
public class RepeatedNumber {
public static void main(String[]args) {
	int arr[]= {8,2,3,5,6,8,7,4,2,7,4,5,7};
	ArrayList<Integer> set=new 	ArrayList<Integer>();
	for(int num:arr) {
		set.add(num);
	}
	HashSet<Integer>seen=new HashSet<Integer>();
	HashSet<Integer>duplicates=new HashSet<Integer>();

    for (int num :set) {
        if (!seen.add(num)) {
            duplicates.add(num); 
        }
    }

    System.out.println("Repeated elements: " + duplicates);
}
}