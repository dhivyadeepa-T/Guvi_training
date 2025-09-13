package guvi_day6;

public class BucketSort {
public static void bucketSort(double[]arr) {
	int n=arr.length;
	double[][] buckets = new double[n][n];
	int[]bucketCount=new int[n];
	for(int i=0;i<n;i++) {
		int bucketIndex=(int)(arr[i]*n);
		if(bucketIndex==n)bucketIndex=n-1;
		buckets[bucketIndex][bucketCount[bucketIndex]]=arr[i];
		bucketCount[bucketIndex]++;
	}
		for(int i=0;i<n;i++) {
			for(int j=1;j<bucketCount[i];j++) {
				double key=buckets[i][j];
				int k=j-1;
				while(k>=0&& buckets[i][k]>key) {
					buckets[i][k+1]=buckets[i][k];
					k--;
				}
				buckets[i][k+1]=key;
			}
		}
	}
}
	


