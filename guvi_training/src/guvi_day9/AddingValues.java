package guvi_day9;	
import java.util.ArrayList;

	import java.util.Arrays;



	public class AddingValues {



	    // Task 1: Add all values in the list

	    public static int add(ArrayList<Integer> arr) {

	        int sum = 0;

	        for (int num : arr) {

	            sum += num;

	        }

	        return sum;

	    }



	    // Task 2: Get index of target (already available with indexOf)

	    // Task 4: Custom search method

	    public static int searchTarget(ArrayList<Integer> arr, int target) {

	        for (int i = 0; i < arr.size(); i++) {

	            if (arr.get(i) == target) {

	                return i;

	            }

	        }

	        return -1;

	    }



	    // Task 3: Move even numbers first, then odd

	    public static ArrayList<Integer> reorderEvenOdd(ArrayList<Integer> arr) {

	        ArrayList<Integer> result = new ArrayList<>();

	        for (int num : arr) {

	            if (num % 2 == 0) result.add(num);

	        }

	        for (int num : arr) {

	            if (num % 2 != 0) result.add(num);

	        }

	        return result;

	    }



	    // Task 5: Separate even and odd into two separate lists

	    public static void evenOddSeparation(ArrayList<Integer> arr) {

	        ArrayList<Integer> even = new ArrayList<>();

	        ArrayList<Integer> odd = new ArrayList<>();

	        for (int num : arr) {

	            if (num % 2 == 0) {

	                even.add(num);

	            } else {

	                odd.add(num);

	            }

	        }

	        System.out.println("Even numbers: " + even);

	        System.out.println("Odd numbers: " + odd);

	    }



	    public static void main(String[] args) {

	        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));



	        // Task 1

	        System.out.println("Array List: " + arr);

	        System.out.println("Sum of elements: " + add(arr));



	        // Task 2

	        int target = 3;

	        System.out.println("Index of target (" + target + "): " + arr.indexOf(target));



	        // Task 3

	        ArrayList<Integer> mixedArr = new ArrayList<>(Arrays.asList(3, 6, 1, 8, 5, 2, 9, 4));

	        System.out.println("Before List: " + mixedArr);

	        ArrayList<Integer> reordered = reorderEvenOdd(mixedArr);

	        System.out.println("After Replace (Even First): " + reordered);



	        // Task 4

	        int searchValue = 4;

	        int index = searchTarget(arr, searchValue);

	        System.out.println("Custom search for target " + searchValue + ": Index = " + index);



	        // Task 5

	        evenOddSeparation(mixedArr);

	    }

	}


