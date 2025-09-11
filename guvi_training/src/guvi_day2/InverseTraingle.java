package guvi_day2;

import java.util.Scanner;

public class InverseTraingle { 

    public static void main(String[] str) {
        
        int n, i, j;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n: ");
        n = sc.nextInt();
        
        for(i = n; i >= 1; i--) { 
            
            for(j = 1; j <= i; j++) {  
                
                System.out.print("*");
            }
            
            System.out.println();  
        }

        sc.close();  
    }
}

