package guvi_day6;

public class CountingSOrt {
    public static void main(String[] args) {
    
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        int n = arr.length;

 
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        int[] count = new int[max + 1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        int[] output = new int[n];

     
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(output[i] + " ");
        }
    }
}
