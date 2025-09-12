package guvi_day4;

public class Ternary {
 public static int ternarySearch(int[] arr, int left, int right, int key) {
		        while (right >= left) {
		            
		            int mid1 = left + (right - left) / 3;
		            int mid2 = right - (right - left) / 3;

		            
		            if (arr[mid1] == key) return mid1;
		            if (arr[mid2] == key) return mid2;

		           
		            if (key < arr[mid1]) {
		                right = mid1 - 1;
		            }
		            
		            else if (key > arr[mid2]) {
		                left = mid2 + 1;
		            }
		            
		            else {
		                left = mid1 + 1;
		                right = mid2 - 1;
		            }
		        }
		        return -1; 
		    }

		    public static void main(String[] args) {
		        int[] arr = {2, 4, 6, 8, 10, 12, 14};
		        int key = 10;

		        int index = ternarySearch(arr, 0, arr.length - 1, key);

		        if (index != -1)
		            System.out.println("Element " + key + " found at index " + index);
		        else
		            System.out.println("Element not found.");
		    }
		}



