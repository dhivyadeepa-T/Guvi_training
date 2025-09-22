package guvi_day_10;

import java.util.ArrayList;
import java.util.Collections;

public class DescendingOrder {
    public static void main(String[] args) {
        int arr[] = {5, 15, 42, 56, 85, 11, 33, 99};

        
        ArrayList<Integer> arrays = new ArrayList<>();
        for (int num : arr) {
            arrays.add(num);
        }

       
        System.out.println("Before descending order sort: " + arrays);
        Collections.sort(arrays, Collections.reverseOrder());

       
        System.out.println("After descending order sort: " + arrays);
    }
}
