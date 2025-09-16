package guvi_day6;

public class BucketSort {
    public static void bucketSort(double[] arr) {
        int n = arr.length;
        if (n <= 0) return;

        double[][] buckets = new double[n][n];
        int[] bucketCount = new int[n];

        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (arr[i] * n);
            if (bucketIndex == n) bucketIndex = n - 1;
            buckets[bucketIndex][bucketCount[bucketIndex]++] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < bucketCount[i]; j++) {
                double key = buckets[i][j];
                int k = j - 1;
                while (k >= 0 && buckets[i][k] > key) {
                    buckets[i][k + 1] = buckets[i][k];
                    k--;
                }
                buckets[i][k + 1] = key;
            }
        }

        // Merge buckets back into original array
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < bucketCount[i]; j++) {
                arr[index++] = buckets[i][j];
            }
        }
    }

    public static void main(String[] args) {
        double[] arr = {0.897, 0.565, 0.656, 0.1224, 0.665, 0.3434};

        System.out.println("Original Array:");
        for (double num : arr)
            System.out.print(num + " ");
        System.out.println();

        bucketSort(arr);

        System.out.println("Sorted Array:");
        for (double num : arr)
            System.out.print(num + " ");
    }
}
