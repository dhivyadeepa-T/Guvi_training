package guvi_day_15;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Minimumcostofrope {

	    public static int minCostToConnectRopes(int[] ropes) {
	        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

	        for (int rope : ropes) {
	            minHeap.add(rope);
	        }

	        int totalCost = 0;

	        while (minHeap.size() > 1) {
	            int first = minHeap.poll();
	            int second = minHeap.poll();

	            int cost = first + second;
	            totalCost += cost;
	            minHeap.add(cost);
	        }

	        return totalCost;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of ropes: ");
	        int size = sc.nextInt();

	        int[] ropes = new int[size];
	        System.out.println("Enter the rope lengths:");
	        for (int i = 0; i < size; i++) {
	            ropes[i] = sc.nextInt();
	        }

	        int result = minCostToConnectRopes(ropes);
	        System.out.println("Minimum cost to connect ropes: " + result);

	        sc.close();
	    }
	}


