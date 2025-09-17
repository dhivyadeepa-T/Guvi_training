package guvi_day9;
import java.util.*;
public class SearchTarget {

    public static int searchtarget(ArrayList<Integer> arr, int target) {
        
        for (int i = 0; i < arr.size(); i++) {
            if (target == arr.get(i)) {
                return i; 
            }
        }
        return -1; 
    }

public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(4);
    arr.add(3);
    arr.add(4);
    arr.add(5);

    System.out.println("Search for target 4: " + searchtarget(arr, 4));
    
}}