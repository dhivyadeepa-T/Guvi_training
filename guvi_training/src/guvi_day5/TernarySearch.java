package guvi_day5;

public class TernarySearch {

   
    public static int ternarySearch(int arr[], int left, int right, int key) {
        if (right >= left) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;

            if (arr[mid1] == key)
                return mid1;
            if (arr[mid2] == key)
                return mid2;

            if (key < arr[mid1]) {
                return ternarySearch(arr, left, mid1 - 1, key);  // search left part
            } else if (key > arr[mid2]) {
                return ternarySearch(arr, mid2 + 1, right, key); // ✅ fixed mid2+1
            } else {
                return ternarySearch(arr, mid1 + 1, mid2 - 1, key); // search middle
            }
        }
        return -1;
    }

    // Main method to test
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
