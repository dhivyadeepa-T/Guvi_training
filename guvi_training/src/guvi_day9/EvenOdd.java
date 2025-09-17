package guvi_day9;

import java.util.ArrayList;

public class EvenOdd {

    public static ArrayList<Integer> evenOdd(ArrayList<Integer> arr) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i : arr) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);


        return even;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        
        ArrayList<Integer> evenNumbers = evenOdd(numbers);

        System.out.println("Returned even list: " + evenNumbers);
    }
}
