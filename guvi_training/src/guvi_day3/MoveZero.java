package guvi_day3;

public class MoveZero {

	    public static void main(String[] args) {
	        int[] arr = {1, 0, 2, 0, 3, 4, 0, 5};

	        // First print non-zero numbers
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != 0) {
	                System.out.print(arr[i] + " ");
	            }
	        }

	        // Then print zeros
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == 0) {
	                System.out.print(arr[i] + " ");
	            }
	        }
	    }
	}
