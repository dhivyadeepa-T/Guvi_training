package guvi_day1;
import java.util.Scanner;

public class GradeCalculation {
public static void main(String[]args) {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the n value:");
	n=sc.nextInt();
	if(n>90) {
		System.out.println("Grade A");
	}
	else if((n>80) && (n<89)){
		System.out.println("Grade B");
	}
	else if((n>70) && (n<79)){
		System.out.println("Grade B");
	}
	else {
			System.out.println("Fail");
		}
	}
}

