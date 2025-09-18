package guvi_day3;

public class PalindromeCheck {
private static boolean ispalindrome;

public static void main(String[]args) {
	String s="radar";
	int len =s.length();
	int left,right;
	left=0;
 right=len-1;
	boolean ispalindrome = true;
	while(left<right) {
		if(s.charAt(left)!=s.charAt(right)) {
			System.out.println("not an palindrome");
			ispalindrome=false;
			break;
		}
		left++;
		right--;
	}
	if(ispalindrome) { 
		System.out.println(s+" is palindrome");
	}
}
}
