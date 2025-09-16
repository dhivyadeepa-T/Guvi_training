package guvi_day7;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[]args) {
		Queue<Integer>queue=new LinkedList<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		System.out.println("QueueExample:"+queue);
		int frontElement=queue.peek();
		System.out.println("Front Element:"+frontElement);
		int removeElement=queue.remove();
		System.out.println("Remove Element:"+removeElement);
		boolean isEmpty=queue.isEmpty();
		
	}

}
