package guvi_day_15;
import java.util.*;
public class Rope {
public static int MinCost(int arr[]) {
	if(arr.length==1)
		return 0;
	PriorityQueue<Integer>pq=new PriorityQueue<>();
	for(int i:arr) {
		pq.add(i);
		}
		int cost=0;
		while(pq.size()!=1) {
		int rope1=pq.poll();
		int rope2=pq.poll();
		int sum=rope1+rope2;
		cost+=sum;
	pq.add(sum);
	}
	return cost;
}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println( MinCost(arr));
	}
}

