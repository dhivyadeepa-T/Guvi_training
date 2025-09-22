package guvi_day_11;
import java.util.*;
public class ValidParathesis {
public static boolean isValidParenthesis(String input) {
	char[] ch=input.toCharArray();
	Stack<Character> st = new Stack<>();
	for(char c:ch) {
		if(c=='('||c=='{'||c=='[') {
			st.push(c);
		}
		else {
			if(st.isEmpty()) {
				return false;
			}
			st.pop();
		}
	}
	return st.isEmpty();
}
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	String inp=sc.next();
	if(isValidParenthesis(inp)) {
		System.out.println("valid parathesis");
	}
	else {
		System.out.println("Invalid parathesis");
	}
}
}
