package guvi_day7;
import java.util.Stack;
public class StackList {
public static void main(String[] args) {

			Stack<Integer> stack = new Stack<>();

			stack.push(10);

			stack.push(20);

			stack.push(30);

			System.out.println("Stack: " + stack);

			int topElement = stack.peek();

		    System.out.println("Top Element: " + topElement);

			int removedElement = stack.pop();

			System.out.println("Removed Element: " + removedElement);

			boolean isEmpty = stack.isEmpty();

			System.out.println("Is Stack Empty?" + isEmpty);

			int size=stack.size();

			System.out.println("Stack Size:"+size);

			boolean contain20=stack.contains(20);

			System.out.println("Stack contain 20?"+contain20);

			stack.clear();

			System.out.println("Stack after clear:"+stack);

			}

	}



