package guvi_day_18;
import java.util.*;

public class InfixtoPostfix {
    public static String InfixtoPostfix(String[] s) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length; i++) {
            String c = s[i];

            if (c.equals("(")) {
                stack.push(c);
            } 
            else if (c.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    sb.append(stack.pop()).append(" ");
                }
                if (!stack.isEmpty()) stack.pop(); 
            } 
            else if (isOperator(c)) {
                while (!stack.isEmpty() && prec(stack.peek()) >= prec(c)) {
                    sb.append(stack.pop()).append(" ");
                }
                stack.push(c);
            } 
            else {  
        
                sb.append(c).append(" ");
            }
        }

     
        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }

        return sb.toString().trim();
    }

    public static int prec(String c) {
        if (c.equals("*") || c.equals("/")) return 2;
        else if (c.equals("+") || c.equals("-")) return 1;
        return -1;
    }

    public static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    public static void main(String[] args) {
        String str = "2 + ( 3 * 1 ) - 9";
        String arr[] = str.split(" ");
        System.out.println(InfixtoPostfix(arr)); 
      
    }
}
