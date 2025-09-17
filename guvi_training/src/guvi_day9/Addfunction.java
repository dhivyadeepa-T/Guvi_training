package guvi_day9;
import java.util.Scanner;
import java.util.ArrayList;

public class Addfunction {
    public static void main(String[] args) {
        
        int[] number = new int[6];
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < number.length; i++) { 
            System.out.print("Enter the value " + (i + 1) + ": ");
            number[i] = sc.nextInt();
            sum += number[i];
        }

        System.out.println("The sum of the numbers is: " + sum);
        sc.close(); 
    }
}