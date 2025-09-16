package guvi_day7;

public class ArrayStack {
	  private int maxSize;
	    private int top;
	    private int[] stackArray;

	    public ArrayStack(int size) {
	        maxSize = size;
	        top = -1;
	        stackArray = new int[maxSize];
	    }

	    public boolean isEmpty() {
	        return top == -1;
	    }

	    public boolean isFull() {
	        return top == maxSize - 1;
	    }

	    public void push(int value) {
	        if (isFull()) {
	            System.out.println("Stack is full ..");
	        } else {
	            stackArray[++top] = value;
	            System.out.println("Pushed " + value + " into Stack.");
	        }
	    }

	    public int pop() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty ..");
	            return -1;
	        } else {
	            return stackArray[top--];
	        }
	    }

	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty ..");
	            return -1;
	        } else {
	            return stackArray[top];
	        }
	    }

	    public int size() {
	        return top + 1;
	    }

	    public void display() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty ..");
	        } else {
	            System.out.println("Stack:");
	            for (int i = top; i >= 0; i--) {
	                System.out.print(stackArray[i] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        ArrayStack stack = new ArrayStack(5);
	        stack.push(10);
	        stack.push(35);
	        stack.push(45);
	        stack.push(65);

	        System.out.println("Top Element : " + stack.peek());
	        System.out.println("Stack size : " + stack.size());
	        System.out.println("Removed Element : " + stack.pop());
	        System.out.println("Stack size : " + stack.size());
	        stack.display();
	    }
	}


