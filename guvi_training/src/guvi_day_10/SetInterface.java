package guvi_day_10;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();
        int arr[] = {1, 8, 5, 4, 5, 7, 8, 4, 5, 9, 2, 4, 6, 18, 19, 42, 85, 64, 45};

        for (int num : arr) {
            set.add(num); 
        }

        ArrayList<Integer> list = new ArrayList<>(set);

 
        if (list.size() > 4) {
            System.out.println("Element at index 4: " + list.get(4));
        } else {
            System.out.println("List has less than 5 elements.");
        }

        System.out.println("Elements in the list:");
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.println("TreeSet elements: " + set);

        set.remove(2);
        System.out.println("TreeSet after removing 2: " + set);

        System.out.println("Check if the element 10 exists in the set: " + set.contains(10));

        System.out.println("TreeSet Size: " + set.size());

        System.out.println("Is the TreeSet empty? " + set.isEmpty());

        set.clear();

        System.out.println("Is the TreeSet empty after clear()? " + set.isEmpty());
    }
}
