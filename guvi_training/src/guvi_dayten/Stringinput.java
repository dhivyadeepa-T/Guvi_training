package guvi_dayten;
import java.util.*;
import java.util.Scanner;

public class Stringinput {
public static void main(String[]args) {
	System.out.print("enter the String:");
	Scanner sc = new Scanner(System.in);
	String word= sc.nextLine();
     Set<Character>seen =new HashSet<>();
     Set<Character>repeated=new  HashSet<>();
for(char c :word.toCharArray()) {
	if(!seen.add(c)) {
		repeated.add(c);
	}
}
if (!repeated.isEmpty()) {
    System.out.print("Repeating characters:");
    for (char c : repeated) {
        System.out.print(c + " ");
    }
} else {
    System.out.print("No repeating characters found.");
}

sc.close();
}

}

