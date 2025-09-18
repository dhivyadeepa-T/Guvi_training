package guvi_dayten;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PalindromArray {
	public static void main(String[]args) {
		System.out.print("enter the String:");
		Scanner sc = new Scanner(System.in);
		String word= sc.nextLine();
	     Set<Character>seen =new HashSet<>();
	     Set<Character>repeated=new  HashSet<>();
	     int len =word.length();
	 	int left,right;
	 	left=0;
	  right=len-1;
	 	boolean ispalindrome = true;
	 	while(left<right) {
	 		if(word.charAt(left)!=word.charAt(right)) {
	 			System.out.println("not an palindrome");
	 			ispalindrome=false;
	 			break;
	 		}
	 		left++;
	 		right--;
	 	}
	 	if(ispalindrome) { 
	 		System.out.println(word+" is palindrome");
	 	}
}
}