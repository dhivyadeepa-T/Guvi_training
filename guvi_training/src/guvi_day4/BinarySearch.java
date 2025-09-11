package guvi_day4;
import java.util.Arrays;

public class BinarySearch {
    public static int binarysearch(int[] num, int key) {
        int left = 0;
        int right = num.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (num[mid] == key) {
                return mid;  
            } else if (num[mid] > key) {
                right = mid - 1;  
            } else {
                left = mid + 1;   
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] number = {12, 6, 8, 15, 2};
        int key = 5;

              Arrays.sort(number);

        int result = binarysearch(number, key);

        if (result != -1)
            System.out.println("Key " + key + " found at index " + result);
        else
            System.out.println("Key " + key + " not found.");
    }
}
