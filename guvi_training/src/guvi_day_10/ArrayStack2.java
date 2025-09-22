package guvi_day_10;
import java.util.*;
public class ArrayStack2 {
public static boolean isPalindrome(String input) {
	Stack<Character>stack=new Stack<Character>();
	String rev="";
	char[]ch=input.toCharArray();
	for(char c:ch) {
		stack.push(c);
	}
	while(!stack.isEmpty()) {
		rev+=stack.pop();
		
	}
	return input.equals(rev);
			}
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string:");
	String input=sc.nextLine();
	if(isPalindrome(input)) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not a palindrome");
	}
}
}
