package guvi_day_15;
import java.util.*;

public class ReverseQueueSimple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			queue.add(sc.nextInt());
		}

		Stack<Integer> stack = new Stack<>();

		while (!queue.isEmpty()) {
			stack.push(queue.remove());
		}

		while (!stack.isEmpty()) {
			queue.add(stack.pop());
		}

		for (int x : queue) {
			System.out.print(x + " ");
		}

	}
}
