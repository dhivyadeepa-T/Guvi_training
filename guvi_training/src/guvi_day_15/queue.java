package guvi_day_15;
import java.util.*;

public class queue {
    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> st = new Stack<>();

        while (!queue.isEmpty()) {
            st.push(queue.remove());
        }

        while (!st.isEmpty()) {
            queue.add(st.pop());
        }

        for (int i : queue) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int size = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();
            queue.add(num);
        }

        reverseQueue(queue);
        sc.close();
    }
}
