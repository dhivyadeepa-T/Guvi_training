package guvi_day5;

public class LowerBoundBinarySearch {
    static int LowerBoundBinarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = arr.length; 

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                result = mid;   
                high = mid - 1; 
            } else {
                low = mid + 1;  
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 4, 4, 10, 18, 20};
        int target1 = 4;
        int target2 = 5;
        int target3 = 6;

        System.out.println("Lower bound of " + target1 + " is at index: " + LowerBoundBinarySearch(arr, target1));
        System.out.println("Lower bound of " + target2 + " is at index: " + LowerBoundBinarySearch(arr, target2));
        System.out.println("Lower bound of " + target3 + " is at index: " + LowerBoundBinarySearch(arr, target3));
    }
}
