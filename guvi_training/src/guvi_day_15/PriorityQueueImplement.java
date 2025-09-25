package guvi_day_15;
import java.util.*;
public class PriorityQueueImplement {
	public static void  main(String[]args) {

		PriorityQueue<Integer>minHeap=new PriorityQueue<>();

		minHeap.add(20);

		minHeap.add(15);

		minHeap.add(30);

		minHeap.add(10);

		System.out.println("min heap:"+minHeap);

		System.out.println("peek(min):"+minHeap.peek());

		System.out.println("poll (remove):"+minHeap.poll());

		System.out.println("after poll:"+minHeap);

		System.out.println("min heap:"+minHeap);

		PriorityQueue<Integer>maxHeap=new PriorityQueue<>(Collections.reverseOrder());

		maxHeap.add(150);

		maxHeap.add(240);

		maxHeap.add(630);

		maxHeap.add(920);

		maxHeap.add(510);

		System.out.println("max heap:"+maxHeap);

		System.out.println("peek(max):"+maxHeap.peek());

		System.out.println("poll (remove):"+maxHeap.poll());

		System.out.println("after poll:"+maxHeap);

		System.out.println("max heap:"+maxHeap);

	}

	}



